package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vmu implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vmu(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, vcc] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, vcg] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, vcg] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vbs vbsVarB;
        int i = 16;
        int i2 = 0;
        i2 = 0;
        switch (this.$cid) {
            case 0:
                return ((vcg) obj).n((android.telecom.PhoneAccountHandle) this.a);
            case 1:
                return ((vcg) obj).i((android.telecom.PhoneAccountHandle) this.a);
            case 2:
                return ((vcc) obj).h((android.telecom.PhoneAccountHandle) this.a, false);
            case 3:
                return ((vee) obj).i((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((vcc) obj).h((android.telecom.PhoneAccountHandle) this.a, true);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((vcc) obj).d((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.abtr) obj).f.d((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((vcc) obj).i((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.abtr) obj).e.a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((vda) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vzi vziVar = (vzi) obj;
                if (vziVar.h == 4 || (vziVar.b & 16) != 0) {
                    vcp vcpVar = vziVar.g;
                    if (vcpVar == null) {
                        vcpVar = vcp.a;
                    }
                    if (vcpVar.b == 1) {
                        vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                        if (vbsVarB == null) {
                            vbsVarB = defpackage.vbs.UNRECOGNIZED;
                        }
                    } else {
                        vbsVarB = defpackage.vbs.UNSPECIFIED;
                    }
                    int iOrdinal = vbsVarB.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 33) {
                        if (iOrdinal != 23) {
                            i2 = iOrdinal != 24 ? 2132020890 : 2132017993;
                        } else {
                            i2 = 2132019815;
                        }
                    }
                    if (i2 != 0) {
                        return j$.util.Optional.of(((android.content.Context) this.a).getString(i2));
                    }
                }
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.Collection) this.a).anyMatch(new vpl((defpackage.vtt) obj, 6)));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.abtr) obj).f.b((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((vee) ((defpackage.abtr) obj).d).i((android.telecom.PhoneAccountHandle) this.a);
            case 15:
                return ((vee) ((defpackage.abtr) obj).d).i((android.telecom.PhoneAccountHandle) this.a);
            case 16:
                akzx akzxVarP = ((alad) this.a).p();
                akzxVarP.u();
                ((defpackage.vtu) akzxVarP.b).e = albq.a;
                akzxVarP.ac((aify) obj);
                return (defpackage.vtu) akzxVarP.p();
            case 17:
                return ((vav) obj).b((java.util.List) this.a);
            case 18:
                return java.lang.Boolean.valueOf(defpackage.vyd.c((defpackage.vyj) obj) != defpackage.vyd.c((defpackage.vyj) this.a));
            case 19:
                java.lang.Object obj2 = this.a;
                defpackage.wcz wczVar = (defpackage.wcz) obj2;
                albh albhVar = (defpackage.zue) obj;
                return ahvr.H(wczVar.g.l().a(defpackage.ztu.a, albhVar), new defpackage.vfp(obj2, albhVar, i, null), wczVar.b);
            default:
                j$.util.Optional optionalE = ((zpm) ((zzx) this.a).a).e(((defpackage.wlc) obj).c);
                return true != optionalE.isPresent() ? optionalE : j$.util.Optional.ofNullable(((defpackage.wkt) ((defpackage.apqr) optionalE.get()).a(defpackage.wkt.class)).aW());
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
