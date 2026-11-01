package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vun implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vun(int i) {
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

    /* JADX WARN: Code duplicated, block: B:27:0x00c8 A[PHI: r1
      0x00c8: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:17:0x00b2, B:20:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return (defpackage.vuo) ((j$.util.Optional) obj).get();
            case 1:
                return (defpackage.vtu) defpackage.ahzq.c(new defpackage.vug((ajcq) obj, i2));
            case 2:
                return ((defpackage.vuo) obj).a;
            case 3:
                ajcq ajcqVar = (ajcq) obj;
                java.lang.String[] strArr = vva.a;
                try {
                    return (java.lang.Boolean) aiql.H(ajcqVar);
                } catch (java.util.concurrent.ExecutionException e) {
                    throw new java.lang.AssertionError(e);
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.vtt vttVar = ((defpackage.vtu) obj).c;
                return vttVar == null ? defpackage.vtt.a : vttVar;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return android.net.Uri.parse((java.lang.String) ((j$.util.Optional) obj).orElseThrow());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return android.net.Uri.parse((java.lang.String) ((j$.util.Optional) obj).orElseThrow());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                kiu kiuVar = ((defpackage.uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                return java.lang.Long.valueOf(kiuVar.d);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return wgl.c((wgi) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return java.lang.Long.valueOf(((defpackage.wqp) obj).c);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.wqt wqtVar = ((defpackage.wqp) obj).e;
                if (wqtVar == null) {
                    wqtVar = defpackage.wqt.a;
                }
                defpackage.wgu wguVar = wqtVar.d;
                return wguVar == null ? defpackage.wgu.a : wguVar;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return anar.r(obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Long.valueOf(((defpackage.wqp) obj).c);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return (defpackage.wqp) obj;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return java.lang.Long.valueOf(((kdy) obj).a);
            case 15:
                return (defpackage.wqp) obj;
            case 16:
                return java.lang.Long.valueOf(((kdy) obj).b);
            case 17:
                amfx amfxVar = (amfx) obj;
                akzx akzxVarM = defpackage.wke.a.m();
                int i3 = amfxVar.c;
                akzxVarM.u();
                defpackage.wke wkeVar = (defpackage.wke) akzxVarM.b;
                wkeVar.b |= 1;
                wkeVar.c = i3;
                int i4 = amfxVar.d;
                akzxVarM.u();
                defpackage.wke wkeVar2 = (defpackage.wke) akzxVarM.b;
                wkeVar2.b |= 2;
                wkeVar2.d = i4;
                amfw amfwVarB = amfw.b(amfxVar.e);
                if (amfwVarB == null) {
                    amfwVarB = amfw.a;
                }
                int iOrdinal = amfwVarB.ordinal();
                if (iOrdinal == 0) {
                    i = i2;
                } else if (iOrdinal != 1) {
                    i2 = 3;
                    if (iOrdinal == 2) {
                        i = i2;
                    } else if (iOrdinal == 3) {
                        i = 6;
                    } else {
                        if (iOrdinal != 4) {
                            throw new java.lang.RuntimeException(null, null);
                        }
                        i = 5;
                    }
                }
                akzxVarM.u();
                defpackage.wke wkeVar3 = (defpackage.wke) akzxVarM.b;
                wkeVar3.e = i - 1;
                wkeVar3.b |= 4;
                return (defpackage.wke) akzxVarM.p();
            case 18:
                return (defpackage.whx) ((j$.util.Optional) obj).get();
            case 19:
                defpackage.wxg wxgVar = (defpackage.wxg) obj;
                akzx akzxVarM2 = defpackage.wwm.a.m();
                double d = wxgVar.d;
                akzxVarM2.u();
                defpackage.wwm wwmVar = (defpackage.wwm) akzxVarM2.b;
                wwmVar.b |= 2;
                wwmVar.d = d;
                defpackage.wxk wxkVarB = defpackage.wxk.b(wxgVar.c);
                if (wxkVarB == null) {
                    wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                }
                akzxVarM2.u();
                defpackage.wwm wwmVar2 = (defpackage.wwm) akzxVarM2.b;
                wwmVar2.c = wxkVarB.f;
                wwmVar2.b |= 1;
                return (defpackage.wwm) akzxVarM2.p();
            default:
                defpackage.wxf wxfVar = defpackage.wwk.a;
                akzx akzxVarM3 = defpackage.wxe.a.m();
                akzxVarM3.u();
                defpackage.wxe wxeVar = (defpackage.wxe) akzxVarM3.b;
                wxeVar.c = ((defpackage.wxk) obj).f;
                wxeVar.b |= 1;
                akzxVarM3.u();
                defpackage.wxe wxeVar2 = (defpackage.wxe) akzxVarM3.b;
                wxeVar2.b |= 2;
                wxeVar2.d = 0.5f;
                return (defpackage.wxe) akzxVarM3.p();
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
