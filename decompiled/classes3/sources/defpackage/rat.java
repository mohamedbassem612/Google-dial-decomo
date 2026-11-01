package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rat implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rat(int i) {
        this.$cid = i;
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

    /* JADX WARN: Type inference failed for: r7v11, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [aoss, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String strConcat;
        switch (this.$cid) {
            case 0:
                return ((defpackage.qtz) obj).name();
            case 1:
                return ((defpackage.qtu) obj).name();
            case 2:
                return ((defpackage.rej) obj).a;
            case 3:
                return ((defpackage.reo) obj).a.name();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.pgi pgiVar = (defpackage.pgi) obj;
                return aosv.F((aoss) pgiVar.b, 0, new lve(pgiVar, (aoln) null, 8, (byte[]) null), 3);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                lyt lytVar = (lyt) ((aoin) obj).a();
                return aosv.F((aoss) lytVar.b, 0, new lve(lytVar, (aoln) null, 6), 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (defpackage.rvb) ((j$.util.Optional) obj).get();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.app.NotificationManager.Policy policy = (android.app.NotificationManager.Policy) obj;
                if (policy == null) {
                    strConcat = "null";
                } else {
                    strConcat = (((("[priorityCallSenders=" + policy.priorityCallSenders) + ", priorityCategories=" + policy.priorityCategories) + ", priorityMessageSenders=" + policy.priorityMessageSenders) + ", priorityConversationSenders=" + baa$.ExternalSyntheticApiModelOutline1.m(policy)).concat("]");
                }
                return gus.aw(strConcat);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return defpackage.aa$$ExternalSyntheticApiModelOutline0.m(obj).getId();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (j$.util.Optional) ((mgd) obj).c(new defpackage.rat(10));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                aooh.c(optional);
                aehj aehjVar = (aehj) aooh.q(optional);
                j$.util.Objects.checkIndex(0, 2);
                if (aehjVar == null) {
                    return "Null";
                }
                if (!(aehjVar instanceof defpackage.zow)) {
                    java.lang.Class<?> cls = aehjVar.getClass();
                    aopu[] aopuVarArr = aoou.a;
                    return new aooa(cls).c();
                }
                if (((defpackage.zow) aehjVar).a == null) {
                    return "Empty";
                }
                java.lang.Class<?> cls2 = aehjVar.getClass();
                aopu[] aopuVarArr2 = aoou.a;
                return new aooa(cls2).c();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((hkd) obj).c;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.spd) obj).c;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Long.valueOf(((defpackage.spd) obj).j);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (hkd) obj;
            case 15:
                return (hkd) obj;
            case 16:
                return defpackage.amrc.OUTCOME_UNSPECIFIED;
            case 17:
                return defpackage.amrf.a.m();
            case 18:
                long j = ((defpackage.tin) obj).a;
                aimz aimzVar = defpackage.tia.a;
                return java.lang.String.valueOf(j);
            case 19:
                return java.lang.Long.valueOf(((defpackage.tin) obj).l);
            default:
                defpackage.uqk uqkVar = (defpackage.uqk) obj;
                defpackage.til tilVar = new defpackage.til();
                tilVar.d(uqkVar.c);
                tilVar.j(uqkVar.d);
                int i = uqkVar.b;
                tilVar.a = (i & 1) != 0 ? uqkVar.e : null;
                tilVar.b = uqkVar.g;
                tilVar.g((i & 2) != 0 ? j$.util.Optional.of(uqkVar.h) : j$.util.Optional.empty());
                tilVar.c = uqkVar.i;
                tilVar.d = uqkVar.j;
                tilVar.h(uqkVar.k);
                tilVar.e = (uqkVar.b & 8) != 0 ? uqkVar.m : null;
                tilVar.f = uqkVar.n;
                tilVar.b(uqkVar.o);
                tilVar.c(uqkVar.p);
                tilVar.g = uqkVar.i;
                tilVar.h = "";
                tilVar.i(j$.util.Optional.empty());
                tilVar.j = 3;
                tilVar.k(wgi.a);
                tilVar.e(false);
                tilVar.f(nwx.a);
                return tilVar.a();
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
