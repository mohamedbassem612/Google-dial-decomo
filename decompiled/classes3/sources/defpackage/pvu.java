package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pvu implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ pvu(int i) {
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
                return ((defpackage.zcy) obj).name();
            case 1:
                android.util.Size size = (android.util.Size) obj;
                return gus.ay(aify.q(gus.au(size.getWidth()), gus.au(size.getHeight())));
            case 2:
                return afsq.bZ(obj);
            case 3:
                return afsq.bZ(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.pzp) obj).name();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qay qayVar = (defpackage.qay) obj;
                return qayVar == null ? "null" : qayVar.toString();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.util.Size size2 = (android.util.Size) obj;
                aooh.f(size2, "p0");
                return defpackage.qnv.l(size2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.util.Size size3 = (android.util.Size) obj;
                aooh.f(size3, "p0");
                return defpackage.qnv.l(size3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.qtq qtqVar = (defpackage.qtq) obj;
                aooh.f(qtqVar, "p0");
                mhc[] mhcVarArr = new mhc[5];
                mhcVarArr[0] = gus.at(qtqVar.a);
                mhcVarArr[1] = gus.at(qtqVar.b);
                mhcVarArr[2] = gus.au(qtqVar.c);
                mhcVarArr[3] = gus.at(qtqVar.d);
                j$.util.Optional optional = qtqVar.e;
                aooh.e(optional, "postScaleFactor(...)");
                java.lang.Float f = (java.lang.Float) aooh.q(optional);
                mhcVarArr[4] = gus.at(f != null ? f.floatValue() : 1.0f);
                return gus.az(mhcVarArr);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.qqn) obj).name();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return gus.aw(((defpackage.qmz) obj).name().replace("BUTTON_", ""));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.qqp qqpVar = (defpackage.qqp) obj;
                int i = qqpVar.a;
                java.lang.String strCe = pez.ce(i);
                if (i == 0) {
                    throw null;
                }
                mhc mhcVarAw = gus.aw(strCe);
                int i2 = qqpVar.b;
                java.lang.String strCd = pez.cd(i2);
                if (i2 != 0) {
                    return gus.ay(aify.q(mhcVarAw, gus.aw(strCd)));
                }
                throw null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.bZ(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return (aify) j$.util.Collection.-EL.stream((aify) obj).map(new defpackage.pvu(15)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return gus.ay((java.util.List) j$.util.Collection.-EL.stream((aify) obj).map(new defpackage.pvu(10)).collect(aido.a));
            case 15:
                return ((defpackage.qmy) obj).a;
            case 16:
                android.util.Size size4 = (android.util.Size) obj;
                return gus.az(new mhc[]{gus.au(size4.getWidth()), gus.au(size4.getHeight())});
            case 17:
                return ((defpackage.qtp) obj).name();
            case 18:
                android.util.Size size5 = (android.util.Size) obj;
                return gus.az(new mhc[]{gus.au(size5.getWidth()), gus.au(size5.getHeight())});
            case 19:
                defpackage.qtq qtqVar2 = (defpackage.qtq) obj;
                return gus.az(new mhc[]{gus.at(qtqVar2.a), gus.at(qtqVar2.b), gus.au(qtqVar2.c), gus.at(qtqVar2.d), gus.at(((java.lang.Float) qtqVar2.e.orElse(java.lang.Float.valueOf(1.0f))).floatValue())});
            default:
                akzx akzxVarN = defpackage.qtw.a.n((defpackage.qtw) obj);
                akzxVarN.u();
                defpackage.qtw qtwVar = (defpackage.qtw) akzxVarN.b;
                qtwVar.b |= 16;
                qtwVar.g = false;
                return (defpackage.qtw) akzxVarN.p();
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
