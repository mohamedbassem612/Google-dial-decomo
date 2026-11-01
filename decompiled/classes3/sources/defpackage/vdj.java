package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdj implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vdj(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aimz aimzVar = vdo.a;
                return ((vav) obj).b((java.util.List) this.a);
            case 1:
                return ((vee) obj).g((android.telecom.PhoneAccountHandle) ((j$.util.Optional) this.a).orElseThrow());
            case 2:
                return ((vcg) obj).n((android.telecom.PhoneAccountHandle) this.a);
            case 3:
                return ((vcc) obj).d((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((val) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimz aimzVar2 = vfo.a;
                return ((val) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Boolean.valueOf(((vfu) this.a).y((vbu) obj));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.vjd) obj).d((defpackage.vgm) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.vjd) obj).b((java.lang.String) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new ajbg(((vcc) obj).f((android.telecom.PhoneAccountHandle) this.a));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj2 = this.a;
                return ((defpackage.vgs) obj2).f(new defpackage.vez(obj2, (java.lang.String) obj, 15, null));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((vcg) obj).k((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((vcg) obj).f((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((val) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                ahbv ahbvVar = (ahbv) this.a;
                return ahvr.H(ahvr.I(((zjm) ahbvVar.c).l(phoneAccountHandle), new defpackage.vmq(phoneAccountHandle, 0), (java.util.concurrent.Executor) ahbvVar.g), new defpackage.vmj(3), (java.util.concurrent.Executor) ahbvVar.b);
            case 15:
                return ((vcc) obj).b((android.telecom.PhoneAccountHandle) this.a);
            case 16:
                return java.lang.Boolean.valueOf(((vcg) obj).u((android.telecom.PhoneAccountHandle) this.a));
            case 17:
                return ((vcc) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 18:
                return java.lang.Boolean.valueOf(((vcc) obj).l((android.telecom.PhoneAccountHandle) this.a));
            case 19:
                return ((vcg) obj).j((android.telecom.PhoneAccountHandle) this.a);
            default:
                return ((vcg) obj).e((android.telecom.PhoneAccountHandle) this.a);
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
