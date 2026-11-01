package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apux extends defpackage.apwr {
    private static final java.lang.String b = "apwr";
    private static boolean c;

    static void a(defpackage.aput aputVar, java.lang.String str, java.util.Collection collection, defpackage.apww apwwVar, int i, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        aputVar.a(new defpackage.apux(str, collection, new defpackage.apvv(), i, urlResponseInfo, cronetException), apwwVar);
    }

    @Override // defpackage.apwr, org.chromium.net.RequestFinishedInfo
    public final org.chromium.net.RequestFinishedInfo.Metrics getMetrics() {
        if (!c) {
            android.util.Log.i("cn_".concat(java.lang.String.valueOf(b)), "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            c = true;
        }
        return this.a;
    }
}
