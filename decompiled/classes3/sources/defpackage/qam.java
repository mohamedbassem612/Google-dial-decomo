package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qam implements defpackage.zpt {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qam(int i) {
        this.$cid = i;
    }

    @Override // defpackage.zpt
    public final ajcq a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.qaq) obj).au();
            case 1:
                return ((defpackage.pyt) obj).T();
            case 2:
                return ((defpackage.qcf) obj).aZ();
            case 3:
                return ((defpackage.qhi) obj).br();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qnt qntVar = (defpackage.qnt) obj;
                aooh.f(qntVar, "p0");
                return qntVar.bP();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.qqi) obj).bk();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.qsz) obj).bS();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qux quxVar = (defpackage.qux) obj;
                aooh.f(quxVar, "p0");
                return quxVar.h();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.qya qyaVar = (defpackage.qya) obj;
                aooh.f(qyaVar, "p0");
                return qyaVar.n();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.qyu qyuVar = (defpackage.qyu) obj;
                aooh.f(qyuVar, "p0");
                return qyuVar.Q();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.qzi qziVar = (defpackage.qzi) obj;
                aooh.f(qziVar, "p0");
                return qziVar.aX();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((defpackage.rgh) obj).bT();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.rhg) obj).bU();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.tbt) obj).bq();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.tum tumVar = (defpackage.tum) obj;
                aooh.f(tumVar, "p0");
                return tumVar.bx();
            case 15:
                defpackage.ubu ubuVar = (defpackage.ubu) obj;
                aooh.f(ubuVar, "p0");
                return ubuVar.bC();
            case 16:
                return ((defpackage.ucb) obj).bD();
            case 17:
                return ((defpackage.uyz) obj).bR();
            case 18:
                return ((defpackage.uze) obj).bR();
            default:
                return ((defpackage.wti) obj).bY();
        }
    }
}
