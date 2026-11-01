package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aahn extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult a;

    public aahn(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.aais.aj(connectionResult.c(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
