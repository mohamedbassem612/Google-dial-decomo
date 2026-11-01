package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnp implements defpackage.apnw {
    @Override // defpackage.apnw
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        java.lang.String strM = da$.ExternalSyntheticApiModelOutline0.m(sSLSocket);
        if (strM == null || defpackage.aooh.n(strM, "")) {
            return null;
        }
        return strM;
    }

    @Override // defpackage.apnw
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list, defpackage.appb appbVar) throws java.io.IOException {
        android.net.ssl.EchConfigList echConfigListM;
        defpackage.aooh.f(sSLSocket, "sslSocket");
        defpackage.aooh.f(list, "protocols");
        da$.ExternalSyntheticApiModelOutline0.m(sSLSocket, true);
        try {
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            defpackage.apnn apnnVar = defpackage.apnn.b;
            da$.ExternalSyntheticApiModelOutline0.m(sSLParameters, (java.lang.String[]) defpackage.aoov.aY(list).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
            if (appbVar != null) {
                try {
                    echConfigListM = deh$.ExternalSyntheticApiModelOutline0.m(appbVar.o());
                } catch (android.net.ssl.InvalidEchDataException unused) {
                    echConfigListM = null;
                }
                if (echConfigListM != null) {
                    deh$.ExternalSyntheticApiModelOutline0.m(sSLSocket, echConfigListM);
                }
            }
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.IOException("Android internal error", e);
        }
    }

    @Override // defpackage.apnw
    public final boolean c() {
        return defpackage.aoov.aX();
    }

    @Override // defpackage.apnw
    public final boolean d(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        return da$.ExternalSyntheticApiModelOutline0.m(sSLSocket);
    }

    @Override // defpackage.apnw
    public final /* synthetic */ void e() {
    }
}
