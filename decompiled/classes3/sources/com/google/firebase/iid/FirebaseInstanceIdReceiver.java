package com.google.firebase.iid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FirebaseInstanceIdReceiver extends defpackage.aabe {
    @Override // defpackage.aabe
    protected final int a(android.content.Context context, com.google.android.gms.cloudmessaging.CloudMessage cloudMessage) {
        try {
            return ((java.lang.Integer) aazc.t(defpackage.ajxf.b(cloudMessage.a, context, new fjq(8)))).intValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.aabe
    protected final void b(android.os.Bundle bundle) {
        android.content.Intent intentPutExtras = new android.content.Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (ajsz.E(intentPutExtras)) {
            ajsz.C("_nd", intentPutExtras.getExtras());
        }
    }
}
