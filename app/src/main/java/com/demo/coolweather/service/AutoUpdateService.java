package com.demo.coolweather.service;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * created by ygz on 2017/2/1.
 */
public class AutoUpdateService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        updateWeather();
        updateBingPic();
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        // 8小时毫秒数
        int anHour = 8 * 60 * 60 * 1000;

        return super.onStartCommand(intent, flags, startId);
    }

    private void updateWeather() {

    }

    private void updateBingPic() {

    }
}
