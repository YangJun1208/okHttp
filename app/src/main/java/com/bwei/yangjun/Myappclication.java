package com.bwei.yangjun;

import android.app.Application;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

public class Myappclication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UnCachHandler.getInstance(getApplicationContext()).init(getApplicationContext());

        /*UMConfigure.init(this, "5a12384aa40fa3551f0001d1", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "");
        PlatformConfig.Platform.setQQzone()*/

        ImageLoader.getInstance().init(
                new ImageLoaderConfiguration.Builder(this)
                .defaultDisplayImageOptions(
                        new DisplayImageOptions.Builder()
                                .cacheOnDisk(true)
                         .bitmapConfig(Bitmap.Config.RGB_565)
                        .build()
                ).build()
        );

    }
}
