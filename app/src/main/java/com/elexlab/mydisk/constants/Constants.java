package com.elexlab.mydisk.constants;

import android.os.Environment;

import com.elexlab.mydisk.datasource.HeroLib;
import com.elexlab.mydisk.utils.CommonUtil;

public interface Constants {
    String HOST = "http://192.168.3.22:8888";
    String LIST_DIR_BASE = HOST+"/listDir?device=%1$s&dir=%2$s";
    String DOWNLOAD_FILE = HOST+"/download?device="+CommonUtil.getDeviceId(HeroLib.getInstance().appContext)+"&dir=";
    String UPLOAD_FILE = HOST+"/upload?device="+CommonUtil.getDeviceId(HeroLib.getInstance().appContext);

    String LIST_PHONES = HOST+"/listPhones?device="+CommonUtil.getDeviceId(HeroLib.getInstance().appContext);


    interface Path{
        String LOCAL_DISK_ROOT = Environment.getExternalStorageDirectory().getAbsolutePath();
    }

}
