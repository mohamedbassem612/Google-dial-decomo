package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abgd implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public abgd(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Type inference failed for: r6v100, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v110, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v117, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v55, types: [aomy, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return java.lang.Float.valueOf(((defpackage.abgq) this.a).a());
            case 1:
                return new dpi(((dpi) ((defpackage.abgq) this.a).l.d()).a);
            case 2:
                ajb ajbVar = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case 3:
                ajb ajbVar2 = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ajb ajbVar3 = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ajb ajbVar4 = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ajb ajbVar5 = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ajb ajbVar6 = defpackage.abgi.a;
                return java.lang.Float.valueOf(((java.lang.Number) ((aii) this.a).d()).floatValue());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ajb ajbVar7 = defpackage.abgi.a;
                return java.lang.Float.valueOf(afsq.bs(0.7f, -((java.lang.Number) this.a.a()).floatValue(), 0.0f, 0.5f, 32));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ajb ajbVar8 = defpackage.abgi.a;
                return java.lang.Float.valueOf(afsq.bs(0.7f, ((java.lang.Number) this.a.a()).floatValue(), 0.0f, 0.5f, 32));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).p.d()).floatValue());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).q.d()).floatValue());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.abgq abgqVar = (defpackage.abgq) this.a;
                java.lang.Float fValueOf = java.lang.Float.valueOf(abgqVar.d.c());
                if (true == java.lang.Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                return java.lang.Float.valueOf((fValueOf != null ? fValueOf.floatValue() : 0.0f) / abgqVar.c.g);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).r.d()).floatValue());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).s.d()).floatValue());
            case 15:
                return ((alg) this.a).h();
            case 16:
                return ((alg) this.a).h();
            case 17:
                java.lang.String elapsedTime = android.text.format.DateUtils.formatElapsedTime(((java.lang.Number) this.a.a()).longValue() / 1000);
                aooh.e(elapsedTime, "formatElapsedTime(...)");
                return elapsedTime;
            case 18:
                defpackage.ablz ablzVar = (defpackage.ablz) this.a;
                ablzVar.f.a(java.lang.Boolean.valueOf(!ablzVar.e));
                return aojh.a;
            case 19:
                return java.lang.Float.valueOf(((dpi) ((defpackage.akxm) this.a).b.a()).a);
            default:
                return java.lang.Float.valueOf(((dpi) ((defpackage.akxm) this.a).c.a()).a);
        }
    }

    public /* synthetic */ abgd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
