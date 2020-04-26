package com.hawksjamesf.mockserver;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Apr/25/2020  Sat
 */
public class MockJobIntentService extends JobIntentService {
    private static final String TAG = Constants.TAG + "/MockJobIntentSer";
    private static final int JOB_ID = 2;

    public static void startService(Activity activity) {
        Intent intent = new Intent(activity, MockJobIntentService.class);
        enqueueWork(activity, MockJobIntentService.class, JOB_ID, intent);
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        Log.d(TAG, "onHandleWork: ");
    }
}
