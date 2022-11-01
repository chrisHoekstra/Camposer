package br.com.devlucasyuji.sample.feature.camera.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.devlucasyuji.sample.feature.camera.model.CameraOption
import java.io.File

@Composable
fun ActionBox(
    modifier: Modifier = Modifier,
    cameraOption: CameraOption,
    isRecording: Boolean,
    lastPicture: File?,
    onGalleryClick: () -> Unit,
    onTakePicture: () -> Unit,
    onSwitchCamera: () -> Unit,
    onRecording: () -> Unit,
    onCameraOptionChanged: (CameraOption) -> Unit
) {
    Column(
        modifier = modifier,
    ) {
        OptionSection(
            modifier = Modifier.fillMaxWidth(),
            currentCameraOption = cameraOption,
            onCameraOptionChanged = onCameraOptionChanged
        )
        PictureActions(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 32.dp),
            isVideo = cameraOption == CameraOption.Video,
            lastPicture = lastPicture,
            isRecording = isRecording,
            onGalleryClick = onGalleryClick,
            onRecording = onRecording,
            onTakePicture = onTakePicture,
            onSwitchCamera = onSwitchCamera
        )
    }
}