package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agky implements defpackage.aglx {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public agky(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [agls, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [agld, java.lang.Object] */
    @Override // defpackage.aglx
    public final /* synthetic */ java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return new cqg(this.a.a());
            case 1:
                return this.a.a();
            case 2:
                return (float[]) this.a.a();
            case 3:
                return java.lang.Float.valueOf(this.a.a());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return (int[]) this.a.a();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ?? r2 = ((defpackage.aprf) this.a).a;
                aoov.f((java.lang.Object) r2, 0);
                return java.lang.Integer.valueOf(((java.lang.Number) r2.a()).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ?? r3 = ((defpackage.aprf) this.a).a;
                aoov.f((java.lang.Object) r3, 0);
                return new cqt(((cqt) r3.a()).a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ?? r4 = ((defpackage.aprf) this.a).a;
                aoov.f((java.lang.Object) r4, 0);
                return new cpm(((cpm) r4.a()).a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new cpp(this.a.a());
            default:
                return (android.graphics.Shader) this.a.a();
        }
    }
}
