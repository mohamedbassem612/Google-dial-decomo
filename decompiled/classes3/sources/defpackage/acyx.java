package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyx implements ahyc {
    private final /* synthetic */ int $cid;

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new defpackage.adbw(true, obj, null);
            case 1:
                return ahyn.g((defpackage.acvu) obj);
            case 2:
                return new defpackage.adbw(false, null, (java.lang.Exception) obj);
            case 3:
                return new defpackage.adbw(true, obj, null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.adbw(false, null, (java.lang.Exception) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                boolean z = aczk.a;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean z2 = aczk.a;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                boolean z3 = aczk.a;
                int i = adbe.a;
                return ahyn.h(-1);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ahyn ahynVar = (ahyn) obj;
                boolean z4 = aczk.a;
                if (!ahynVar.f()) {
                    return -1;
                }
                java.lang.Integer num = (java.lang.Integer) ahynVar.b();
                if (num.intValue() >= 0) {
                    return num;
                }
                return -1;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                boolean z5 = aczk.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (defpackage.adac adacVar : (java.util.List) obj) {
                    defpackage.acvs acvsVar = adacVar.b.c;
                    if (acvsVar == null) {
                        acvsVar = defpackage.acvs.a;
                    }
                    if (!acvsVar.h) {
                        arrayList.add(adacVar);
                    }
                }
                return arrayList;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aczk.a = true;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarP = ((acvz) obj).p();
                akzxVarP.x();
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((acvz) obj).d;
            case 15:
                akzx akzxVarP2 = ((acvz) obj).p();
                akzxVarP2.u();
                akzxVarP2.b.d = albq.a;
                return akzxVarP2.p();
            case 16:
                return java.lang.Boolean.TRUE;
            case 17:
                return java.lang.Boolean.TRUE;
            case 18:
                return java.lang.Boolean.FALSE;
            case 19:
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Boolean.TRUE;
        }
        return null;
    }
}
