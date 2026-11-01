package com.google.android.gms.people.contactssync;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public interface DeviceContactsSyncClient extends aadf {

    /* JADX INFO: compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    android.content.Intent createGoogleContactsSyncSettingsIntent(android.content.Context context, java.lang.String str);

    aaum getDeviceContactsSyncSetting();

    aaum launchDeviceContactsSyncSettingActivity(android.content.Context context);

    aaum registerSyncSettingUpdatedListener(com.google.android.gms.people.contactssync.DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener);

    aaum unregisterSyncSettingUpdatedListener(com.google.android.gms.people.contactssync.DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener);
}
