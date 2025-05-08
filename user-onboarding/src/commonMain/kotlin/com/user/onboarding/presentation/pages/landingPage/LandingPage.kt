package com.user.onboarding.presentation.pages.landingPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.design.system.api.ComposeAppTheme
import com.platform.apis.model.DevicePlatform
import com.shared.components.buttons.PrimaryButton
import com.user.onboarding.extensions.landingPageButtonsColumnModifier
import com.user.onboarding.extensions.landingPageButtonsRowModifier
import com.user.onboarding.extensions.landingPageGreetingAndMessageModifier
import com.user.onboarding.extensions.landingPageImageModifier
import com.user.onboarding.user_onboarding.generated.resources.Res
import com.user.onboarding.user_onboarding.generated.resources.get_started_button_label
import com.user.onboarding.user_onboarding.generated.resources.happy_image
import com.user.onboarding.user_onboarding.generated.resources.landing_page_greeting_text_non_web_or_desktop
import com.user.onboarding.user_onboarding.generated.resources.landing_page_greeting_text_web_or_desktop
import com.user.onboarding.user_onboarding.generated.resources.landing_page_message_text
import com.user.onboarding.user_onboarding.generated.resources.view_project_on_github_button_label
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

class LandingPage(private val modifier: Modifier = Modifier) : Screen {

    private var greetingText = mutableStateOf("")
    private var messageText = mutableStateOf("")
    private var greetingTextStyle = TextStyle()
    private var messageTextStyle = TextStyle()

    @Composable
    override fun Content() {
        Initialize()

        val landingPageScreenModel = rememberScreenModel { LandingPageScreenModel() }
        var landingPageUiState = landingPageScreenModel.landingPageUiState.collectAsState()
        val landingPageScreenWidth = landingPageUiState.value.landingPageWidth

        val backgroundContainerModifier = modifier.onGloballyPositioned {
            landingPageScreenModel.updateLandingPageScreenWidth(width = it.size.width.toDouble())
        }.onSizeChanged {
            landingPageScreenModel.updateLandingPageScreenWidth(width = it.width.toDouble())
        }

        // Change greeting text based on screen size
        HandleGreetingMessageText(landingPageScreenWidth = landingPageScreenWidth.toInt())

        Column(verticalArrangement = Arrangement.Center, modifier = backgroundContainerModifier) {
            if (landingPageScreenWidth.toInt() < 480) {
                LandingPageImage(modifier = Modifier.landingPageImageModifier())
            }
            GreetingAndMessage(
                modifier = Modifier.landingPageGreetingAndMessageModifier(
                    width = landingPageScreenWidth
                )
            )
            LandingPageButtons(
                landingPageScreenWidth = landingPageScreenWidth.toInt()
            )
        }
    }

    @Composable
    private fun LandingPageImage(modifier: Modifier = Modifier) {
        val landingPageImage = Res.drawable.happy_image
        Box(contentAlignment = Alignment.Center, modifier = modifier) {
            Image(
                painter = painterResource(resource = landingPageImage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(200.dp)
            )
        }
    }

    @Composable
    private fun GreetingAndMessage(modifier: Modifier = Modifier) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = modifier) {
            BasicText(
                text = greetingText.value,
                style = greetingTextStyle.copy(textAlign = TextAlign.Center),
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )
            BasicText(
                text = messageText.value,
                style = messageTextStyle.copy(textAlign = TextAlign.Center),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

    @Composable
    private fun LandingPageButtons(landingPageScreenWidth: Int) {
        if (landingPageScreenWidth < 480) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.landingPageButtonsColumnModifier()
            ) {
                Buttons(modifier = Modifier.fillMaxWidth())
            }
        } else {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.landingPageButtonsRowModifier()
            ) {
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Buttons(hasSpace = true)
                }
            }
        }
    }

    @Composable
    private fun Buttons(
        hasSpace: Boolean = false,
        modifier: Modifier = Modifier
    ) {
        PrimaryButton(
            label = Res.string.get_started_button_label,
            modifier = modifier,
            onClick = {}
        )
        if (hasSpace) {
            Spacer(modifier = Modifier.width(8.dp))
        }
        PrimaryButton(
            label = Res.string.view_project_on_github_button_label,
            isOutlined = true,
            modifier = modifier,
            onClick = {}
        )
    }

    @Composable
    private fun HandleGreetingMessageText(landingPageScreenWidth: Int) {
        greetingText.value = if (landingPageScreenWidth < 480) {
            stringResource(resource = Res.string.landing_page_greeting_text_non_web_or_desktop)
        } else {
            stringResource(resource = Res.string.landing_page_greeting_text_web_or_desktop)
        }
    }

    @Composable
    private fun Initialize() {
        greetingTextStyle = ComposeAppTheme.typography.headlineSmallSemiBold
        messageTextStyle = ComposeAppTheme.typography.bodyMedium

        messageText.value = when (ComposeAppTheme.platform.currentPlatform) {
            DevicePlatform.ANDROID -> {
                stringResource(
                    resource = Res.string.landing_page_message_text, "mobile app", "Android device"
                )
            }

            DevicePlatform.WEAR -> {
                stringResource(
                    resource = Res.string.landing_page_message_text, "Wear app", "Wear device"
                )
            }

            DevicePlatform.IOS -> {
                stringResource(
                    resource = Res.string.landing_page_message_text, "iOS app", "iOS device"
                )
            }

            DevicePlatform.DESKTOP -> {
                stringResource(
                    resource = Res.string.landing_page_message_text,
                    "desktop app",
                    "Laptop or Desktop PC"
                )
            }

            else -> {
                stringResource(
                    resource = Res.string.landing_page_message_text, "web app", "Web Browser"
                )
            }
        }

        // Define colors
        greetingTextStyle = greetingTextStyle.copy(
            color = ComposeAppTheme.colors.primaryFontColor
        )
        messageTextStyle = messageTextStyle.copy(
            color = ComposeAppTheme.colors.secondaryFontColor
        )
    }
}