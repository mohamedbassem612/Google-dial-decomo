package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pei implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pei(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r4v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v73, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v75, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((aoom) this.a).b((defpackage.pdw) obj);
            case 1:
                return ((orp) agab.aH((android.content.Context) this.a, orp.class)).qz().ap((java.lang.CharSequence) obj);
            case 2:
                return java.lang.Integer.valueOf(((php) this.a).a.incrementAndGet());
            case 3:
                defpackage.amdx amdxVar = (defpackage.amdx) obj;
                int iOrdinal = ((rmt) this.a).ordinal();
                if (iOrdinal == 1) {
                    amdxVar.a = "LOCAL_CACHE_DIRECTORY";
                    return defpackage.rms.LOCAL_CACHE_DIRECTORY;
                }
                if (iOrdinal != 2) {
                    amdxVar.a = "NOT_FOUND";
                    return defpackage.rms.NOT_FOUND;
                }
                amdxVar.a = "LOCAL_CACHE_EXTENDED";
                return defpackage.rms.LOCAL_CACHE_EXTENDED;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.amqp amqpVar = (defpackage.amqp) obj;
                long j = amqpVar.d - ((defpackage.qbe) this.a).d;
                akzx akzxVarP = amqpVar.p();
                akzxVarP.u();
                defpackage.amqp amqpVar2 = (defpackage.amqp) akzxVarP.b;
                amqpVar2.b |= 4;
                amqpVar2.e = j;
                return (defpackage.amqp) akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qgp qgpVar = (defpackage.qgp) obj;
                int iAN = a.aN(qgpVar.e);
                if (iAN == 0 || iAN != 3 || !qgpVar.f) {
                    return qgpVar;
                }
                java.lang.Object obj2 = this.a;
                akzx akzxVarP2 = qgpVar.p();
                akzxVarP2.u();
                defpackage.qgp qgpVar2 = (defpackage.qgp) akzxVarP2.b;
                j$.util.Objects.requireNonNull(obj2);
                qgpVar2.h = (defpackage.abwd) obj2;
                qgpVar2.b |= 32;
                return (defpackage.qgp) akzxVarP2.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((aoom) this.a).b(obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((aoom) this.a).b(obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return pez.bV((zzx) this.a, (defpackage.quo) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((rvd) ((aoin) ((rvw) this.a).c.k().get((defpackage.rvc) obj)).a()).e();
            case 15:
                akzx akzxVarM = defpackage.sph.a.m();
                boolean zE = ((srs) this.a).a.e(((hkd) obj).c);
                akzxVarM.u();
                defpackage.sph sphVar = (defpackage.sph) akzxVarM.b;
                sphVar.b |= 1;
                sphVar.c = zE;
                return (defpackage.sph) akzxVarM.p();
            case 16:
                return srv.i((ssm) this.a, (hkd) obj);
            case 17:
                ?? r4 = this.a;
                int i = sry.b;
                return a.l((aonj) r4, obj);
            case 18:
                return this.a.a(obj);
            case 19:
                defpackage.tin tinVar = (defpackage.tin) obj;
                return this.a == lvp.a ? tinVar.m : tinVar.n;
            default:
                return (java.lang.Double) ((j$.util.Optional) ((aigf) this.a).get(obj)).orElse(java.lang.Double.valueOf(0.0d));
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
