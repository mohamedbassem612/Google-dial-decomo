package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RevocationBoundService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            android.util.Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(java.lang.String.valueOf(intent.getAction())));
            return null;
        }
        if (android.util.Log.isLoggable("RevocationService", 2)) {
            android.util.Log.v("RevocationService", "RevocationBoundService handling ".concat(java.lang.String.valueOf(intent.getAction())));
        }
        return new defpackage.zyp(this, 0);
    }
}
