package com.google.android.gms.people.contactssync;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class TetheredSync {
    private TetheredSync() {
    }

    public static com.google.android.gms.people.contactssync.TetheredSyncClient getClient(android.app.Activity activity) {
        return new defpackage.aard(activity);
    }

    public static com.google.android.gms.people.contactssync.TetheredSyncClient getClient(android.content.Context context) {
        return new defpackage.aard(context);
    }
}
