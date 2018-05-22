package com.nazi.latte.ui.camera;

import android.net.Uri;

import com.nazi.latte.delegates.PermissionCheckerDelegate;
import com.nazi.latte.util.file.FileUtil;

/**
 * Created by nazi
 * 照相机调用类
 */

public class LatteCamera {

    public static Uri createCropFile() {
        return Uri.parse
                (FileUtil.createFile("crop_image",
                        FileUtil.getFileNameByTime("IMG", "jpg")).getPath());
    }

    public static void start(PermissionCheckerDelegate delegate) {
        new CameraHandler(delegate).beginCameraDialog();
    }
}
