package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class adst implements adti {
    private final aprf a;

    public adst(aprf aprfVar) {
        this.a = aprfVar;
    }

    public final java.net.HttpURLConnection a(java.lang.String str) throws java.io.IOException {
        java.net.URLConnection uRLConnectionOpenConnection = ((org.chromium.net.CronetEngine) this.a.a).openConnection(new java.net.URL(str));
        if (uRLConnectionOpenConnection instanceof java.net.HttpURLConnection) {
            return (java.net.HttpURLConnection) uRLConnectionOpenConnection;
        }
        throw new java.io.IOException("Cronet connection is not an HttpURLConnection");
    }

    public final void d(java.net.HttpURLConnection httpURLConnection, int i) {
        if (httpURLConnection instanceof defpackage.aqab) {
            throw null;
        }
        android.net.TrafficStats.setThreadStatsTag(i);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final /* synthetic */ void e() {
    }
}
