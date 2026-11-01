package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class var implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ var(int i) {
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

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return vav.i(((android.net.Uri) obj).toString());
            case 1:
                alcf alcfVar = ((defpackage.uva) obj).e;
                return alcfVar == null ? alcf.a : alcfVar;
            case 2:
                kiu kiuVar = ((defpackage.uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                hkd hkdVar = kiuVar.f;
                return hkdVar == null ? hkd.a : hkdVar;
            case 3:
                return ((defpackage.vdg) obj).a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Long.valueOf(((defpackage.vdg) obj).b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.String.valueOf((java.lang.Long) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.vdg) obj).c;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.vff) obj).a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.vfe) obj).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (defpackage.vcf) ((mgd) obj).e(new defpackage.var(17)).d(new defpackage.var(18));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return (defpackage.vpf) obj;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.vpf vpfVar = (defpackage.vpf) obj;
                aisz aiszVar = aiuv.a;
                return gus.aw(new aiuu("maxGreetingDurationSeconds={maxGreetingDurationSeconds}, maxNumberOfCustomGreetings={maxNumberOfCustomGreetings}", aiuv.a).a(java.lang.Integer.valueOf(vpfVar.a), java.lang.Integer.valueOf(vpfVar.b)));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.bZ(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return (defpackage.vok) ((mgd) obj).e(new defpackage.var(15)).d(new defpackage.var(16));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (defpackage.vpf) ((mgd) obj).e(new defpackage.var(10)).d(new defpackage.var(11));
            case 15:
                return (defpackage.vok) obj;
            case 16:
                defpackage.vok vokVar = (defpackage.vok) obj;
                aisz aiszVar2 = aiuv.a;
                return gus.aw(new aiuu("{min}-{max}", aiuv.a).a(java.lang.Integer.valueOf(vokVar.b), java.lang.Integer.valueOf(vokVar.a)));
            case 17:
                return (defpackage.vcf) obj;
            case 18:
                return gus.aw(((defpackage.vcf) obj).name());
            case 19:
                return java.lang.Long.valueOf(((defpackage.vdg) obj).b);
            default:
                return ((defpackage.vff) obj).a;
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
