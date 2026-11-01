package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aatp extends defpackage.aais {
    public aatp() {
        super((short[]) null);
    }

    @Override // defpackage.aais
    public final /* bridge */ /* synthetic */ defpackage.aacv a(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, java.lang.Object obj, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        defpackage.aatt aattVar = aagiVar.g;
        java.lang.Integer num = aagiVar.h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", aagiVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new aatw(context, looper, aagiVar, bundle, aadcVar, aaddVar);
    }
}
