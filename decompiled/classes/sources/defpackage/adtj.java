package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adtj implements defpackage.adti {
    private final defpackage.apor a;

    public adtj(defpackage.apje apjeVar) {
        this.a = new defpackage.apor(apjeVar);
    }

    @Override // defpackage.adti
    public final java.net.HttpURLConnection a(java.lang.String str) {
        return this.a.c(new java.net.URL(str));
    }

    @Override // defpackage.adti
    public final /* synthetic */ void b() {
        android.net.TrafficStats.clearThreadStatsTag();
    }

    @Override // defpackage.adti
    public final /* synthetic */ void c() {
        ft$.ExternalSyntheticApiModelOutline0.m();
    }

    @Override // defpackage.adti
    public final /* synthetic */ void d(java.net.HttpURLConnection httpURLConnection, int i) {
        android.net.TrafficStats.setThreadStatsTag(i);
    }

    @Override // defpackage.adti
    public final /* synthetic */ void e() {
    }
}
