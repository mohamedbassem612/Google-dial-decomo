package com.google.android.libraries.appdoctor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppDoctorReceiver extends android.content.BroadcastReceiver {
    public static /* synthetic */ void a(ajcq ajcqVar, android.content.BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                ajcqVar.get(8L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
                android.util.Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            android.util.Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            android.util.Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            android.util.Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        byte[] bArr = null;
        ajcq ajcqVarZ = !aazc.d(context) ? aiql.z(java.lang.Boolean.FALSE) : afsq.cH(new defpackage.wwx((java.lang.Object) new acxg(new acxg((byte[]) null)), (java.lang.Object) context, (java.lang.Object) zvj.c, 6, (short[]) null));
        setResultCode(-1);
        if (ajcqVarZ.isDone()) {
            android.util.Log.i("AppDoctorReceiver", "Fix has already been completed.");
        } else {
            afsq.cH(new defpackage.wzc(ajcqVarZ, goAsync(), 12, bArr));
        }
    }
}
