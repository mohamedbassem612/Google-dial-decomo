package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adci implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adci(int i) {
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
                acux acuxVar = ((acvb) obj).d;
                return acuxVar == null ? acux.a : acuxVar;
            case 1:
                return new java.util.ArrayList();
            case 2:
                defpackage.afpl afplVar = (defpackage.afpl) obj;
                int channelConfiguration = ((android.media.AudioRecord) afplVar.b).getChannelConfiguration();
                int i = 12;
                if (channelConfiguration != 12) {
                    if (channelConfiguration != 16) {
                        throw new java.lang.IllegalArgumentException(a.bj(channelConfiguration, "Unsupported input channel configuration: "));
                    }
                    i = 4;
                }
                return new android.media.AudioTrack.Builder().setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(afplVar.l()).setSampleRate(afplVar.n()).setChannelMask(i).build()).setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(2).build()).setBufferSizeInBytes(afsq.U(new android.media.AudioFormat.Builder().setEncoding(afplVar.l()).setSampleRate(afplVar.n()).setChannelMask(i).build())).build();
            case 3:
                apgw apgwVar = (apgw) obj;
                return new defpackage.aeom(apgwVar, defpackage.aeon.c(apgwVar.c == 3 ? (aphg) apgwVar.d : aphg.a));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return defpackage.aeon.d((apfr) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                apgw apgwVar2 = (apgw) obj;
                return new defpackage.aeom(apgwVar2, defpackage.aeon.d(apgwVar2.c == 1 ? (apfr) apgwVar2.d : apfr.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.aeon.c((aphg) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.aeoo) obj).b();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 9;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.apet.a.m();
                ((defpackage.aesa) obj).a();
                throw null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.apet.a.m();
                throw null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Long.valueOf(((defpackage.aphf) obj).n);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((ahlv) obj).b.b();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ahra ahraVar = (ahra) obj;
                new android.util.SparseArray();
                return afsq.D(ahraVar.c, ahraVar.d, 0.0f, aike.a, false).c;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ahra ahraVar2 = (ahra) obj;
                ahqy ahqyVar = ahraVar2.c;
                defpackage.ahsy ahsyVarA = defpackage.ahsz.a();
                ahsyVarA.f(ahqyVar);
                ahsyVarA.e(ahraVar2.d);
                ahsyVarA.d(true);
                return afsq.E(ahsyVarA.a()).a;
            case 15:
                ((java.lang.Integer) obj).intValue();
                return null;
            case 16:
                return new defpackage.uzx((defpackage.ahub) obj);
            case 17:
                return new defpackage.uzx((defpackage.ahuc) obj);
            case 18:
                return ((aifz) obj).a();
            case 19:
                return aigf.i((java.util.LinkedHashMap) obj);
            default:
                return ((java.util.Map.Entry) obj).getKey();
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
