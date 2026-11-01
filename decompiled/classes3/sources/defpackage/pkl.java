package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkl extends amzm {
    private final amzg b;
    private final amzg c;

    public pkl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        defpackage.sqk sqkVar = sqlVar.b;
        switch (sqkVar.ordinal()) {
            case 0:
            case 3:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case 1:
                z = ((defpackage.spd) sqlVar.c.orElseThrow()).n;
                break;
            case 2:
                z = ((defpackage.spd) sqlVar.d.orElseThrow()).n;
                break;
            default:
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported name source: %s", sqkVar));
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.bu).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
