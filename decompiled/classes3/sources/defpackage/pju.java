package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pju extends amzm {
    private final amzg b;
    private final amzg c;

    public pju(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pju.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        switch (sqlVar.b.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.bs).f();
                bool.booleanValue();
                return aiql.z(bool);
            case 1:
                defpackage.spe speVar = sqlVar.a.c;
                if (speVar == null) {
                    speVar = defpackage.spe.a;
                }
                if (speVar.b.size() > 1) {
                    z = true;
                }
                java.lang.Boolean bool2 = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.bs).f();
                bool2.booleanValue();
                return aiql.z(bool2);
            case 2:
                defpackage.spe speVar2 = sqlVar.a.d;
                if (speVar2 == null) {
                    speVar2 = defpackage.spe.a;
                }
                if (speVar2.b.size() > 1) {
                    z = true;
                }
                java.lang.Boolean bool3 = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.bs).f();
                bool3.booleanValue();
                return aiql.z(bool3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.spi spiVar = sqlVar.a.o;
                if (spiVar == null) {
                    spiVar = defpackage.spi.a;
                }
                if (spiVar.b.size() > 1) {
                    z = true;
                }
                java.lang.Boolean bool4 = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.bs).f();
                bool4.booleanValue();
                return aiql.z(bool4);
            default:
                throw new java.lang.AssertionError("exhaustive switch");
        }
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
