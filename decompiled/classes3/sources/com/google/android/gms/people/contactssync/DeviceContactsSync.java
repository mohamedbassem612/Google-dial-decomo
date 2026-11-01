package com.google.android.gms.people.contactssync;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static com.google.android.gms.people.contactssync.DeviceContactsSyncClient getClient(android.app.Activity activity) {
        return new defpackage.aara(activity);
    }

    public static com.google.android.gms.people.contactssync.DeviceContactsSyncClient getClient(android.content.Context context) {
        return new defpackage.aara(context);
    }
}
