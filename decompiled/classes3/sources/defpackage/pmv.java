package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pmv implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pmv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.a(obj);
                break;
            case 1:
                this.a.a(obj);
                break;
            case 2:
                this.a.a(obj);
                break;
            case 3:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.pnn pnnVar = (defpackage.pnn) this.a;
                pnnVar.b.b.q((aeun) obj, ((java.util.concurrent.atomic.AtomicBoolean) pnnVar.d.a).getAndSet(false) ? ruc.Q : ruc.R, rub.b);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((ipc) obj).aM((aeun) this.a, defpackage.zqm.a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aenj aenjVar = defpackage.zqm.a;
                java.lang.String str = aenjVar.a;
                defpackage.pqm pqmVar = (defpackage.pqm) this.a;
                da$.ExternalSyntheticApiModelOutline0.m(str, pqmVar.b.hashCode());
                defpackage.pmv pmvVar = new defpackage.pmv((aeun) obj, 12);
                j$.util.Optional optional = pqmVar.s;
                optional.isPresent();
                ((ipc) optional.get()).aM((aeun) pmvVar.a, aenjVar);
                pqmVar.t = j$.util.Optional.empty();
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                da$.ExternalSyntheticApiModelOutline0.m$1(defpackage.zqm.a.a, ((defpackage.pqm) this.a).b.hashCode());
                break;
            case 15:
                ((defpackage.pzo) obj).a(((defpackage.pqm) ((kxp) this.a).b).b, 3);
                break;
            case 16:
                ((defpackage.pzo) obj).d(((defpackage.puc) this.a).a, 6);
                break;
            case 17:
                ((defpackage.pzo) obj).c(((defpackage.puf) this.a).a, 16);
                break;
            case 18:
                ((defpackage.qau) obj).a((android.content.Intent) this.a);
                break;
            case 19:
                ((defpackage.pzm) obj).d((android.telecom.Call) this.a);
                break;
            default:
                ((defpackage.pzo) obj).c((android.telecom.Call) this.a, 4);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
