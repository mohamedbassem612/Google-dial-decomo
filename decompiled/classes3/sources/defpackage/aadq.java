package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aadq implements aaug {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aadq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Runnable] */
    public final void a(aaum aaumVar) {
        switch (this.$cid) {
            case 0:
                this.a.run();
                break;
            case 1:
                ((java.util.concurrent.CountDownLatch) this.a).countDown();
                break;
            case 2:
                this.a.run();
                break;
            case 3:
                ((defpackage.aakb) this.a).close();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean zK = aaumVar.k();
                java.lang.Object obj = this.a;
                if (!zK) {
                    android.util.Log.e("WearableLS", "Failed to resolve future, sending null response", aaumVar.f());
                    defpackage.aawk.q((defpackage.aaxh) obj, false, null);
                } else {
                    defpackage.aawk.q((defpackage.aaxh) obj, true, (byte[]) aaumVar.g());
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.ajyb.b((android.content.Intent) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((apjb) this.a).v();
                break;
            default:
                this.a.cancel(false);
                break;
        }
    }
}
