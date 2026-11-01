package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apno implements defpackage.apnw {
    @Override // defpackage.apnw
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            defpackage.aooh.i("sslSocket");
        }
        try {
            java.lang.String strM = da$.ExternalSyntheticApiModelOutline0.m(sSLSocket);
            if (strM == null || defpackage.aooh.n(strM, "")) {
                return null;
            }
            return strM;
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.apnw
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list, defpackage.appb appbVar) throws java.io.IOException {
        if (sSLSocket == null) {
            defpackage.aooh.i("sslSocket");
        }
        if (list == null) {
            defpackage.aooh.i("protocols");
        }
        try {
            da$.ExternalSyntheticApiModelOutline0.m(sSLSocket, true);
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            defpackage.apnn apnnVar = defpackage.apnn.b;
            da$.ExternalSyntheticApiModelOutline0.m(sSLParameters, (java.lang.String[]) defpackage.aoov.aY(list).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.IOException("Android internal error", e);
        }
    }

    @Override // defpackage.apnw
    public final boolean c() {
        defpackage.apnn apnnVar = defpackage.apnn.b;
        return true;
    }

    @Override // defpackage.apnw
    public final boolean d(javax.net.ssl.SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            defpackage.aooh.i("sslSocket");
        }
        return da$.ExternalSyntheticApiModelOutline0.m(sSLSocket);
    }

    @Override // defpackage.apnw
    public final /* synthetic */ void e() {
    }
}
