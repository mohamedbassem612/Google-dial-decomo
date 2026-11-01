package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rar implements java.util.function.ToIntFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rar(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:1: B:19:0x004b->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x005d A[SYNTHETIC] */
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object obj) {
        int iCodePointBefore;
        int iCharCount = 0;
        switch (this.$cid) {
            case 0:
                return ((defpackage.qtu) obj).k;
            case 1:
                return ((defpackage.quo) obj).u;
            case 2:
                defpackage.qug qugVarB = defpackage.qug.b(((defpackage.qtw) obj).c);
                if (qugVarB == null) {
                    qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                }
                return qugVarB.H;
            case 3:
                defpackage.qug qugVarB2 = defpackage.qug.b(((defpackage.qty) obj).c);
                if (qugVarB2 == null) {
                    qugVarB2 = defpackage.qug.BUTTON_UNKNOWN;
                }
                return qugVarB2.H;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.qtz) obj).P;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.rej) obj).a.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int i = ((defpackage.rgp) obj).g;
                int i2 = i - 1;
                if (i != 0) {
                    return i2;
                }
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.ruv) obj).d;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.stf) ((java.util.Map.Entry) obj).getKey()).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return java.lang.Integer.parseInt(((defpackage.vhi) ((defpackage.whl) obj).b).a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.whe) obj).d;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wgz wgzVar = ((defpackage.whf) obj).c;
                if (wgzVar == null) {
                    wgzVar = defpackage.wgz.a;
                }
                defpackage.wha whaVarB = defpackage.wha.b(wgzVar.c);
                if (whaVarB == null) {
                    whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                return whaVarB.e;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iU = wsc.U(((defpackage.whc) obj).e);
                return (iU != 0 ? iU : 1) - 1;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.wgz wgzVar2 = ((defpackage.whg) obj).e;
                if (wgzVar2 == null) {
                    wgzVar2 = defpackage.wgz.a;
                }
                defpackage.wha whaVarB2 = defpackage.wha.b(wgzVar2.c);
                if (whaVarB2 == null) {
                    whaVarB2 = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
                }
                return whaVarB2.e;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((zog) obj).a();
            case 15:
                return ((java.lang.String) obj).length();
            case 16:
                return ((java.lang.String) obj).length();
            case 17:
                altp altpVar = (altp) obj;
                int i3 = alph.a;
                return altpVar.b - altpVar.a;
            case 18:
                defpackage.alqu alquVar = (defpackage.alqu) obj;
                int i4 = alph.a;
                ahvr.bF(alquVar.c == 1, "Only expected to be called for finals.", new java.lang.Object[0]);
                return ((alqq) (alquVar.c == 1 ? (alqm) alquVar.d : alqm.a).b.get(0)).c.length();
            case 19:
                defpackage.alqu alquVar2 = (defpackage.alqu) obj;
                int i5 = alph.a;
                ahvr.bF(alquVar2.c == 1, "Only expected to be called for finals.", new java.lang.Object[0]);
                java.lang.String str = ((alqq) (alquVar2.c == 1 ? (alqm) alquVar2.d : alqm.a).b.get(0)).c;
                int length = str.length();
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!java.lang.Character.isWhitespace(iCodePointAt)) {
                        while (length > iCharCount) {
                            iCodePointBefore = java.lang.Character.codePointBefore(str, length);
                            if (java.lang.Character.isWhitespace(iCodePointBefore)) {
                                return str.substring(iCharCount, length).split(" ").length;
                            }
                            length -= java.lang.Character.charCount(iCodePointBefore);
                        }
                        return str.substring(iCharCount, length).split(" ").length;
                    }
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
                while (length > iCharCount) {
                    iCodePointBefore = java.lang.Character.codePointBefore(str, length);
                    if (java.lang.Character.isWhitespace(iCodePointBefore)) {
                        return str.substring(iCharCount, length).split(" ").length;
                    }
                    length -= java.lang.Character.charCount(iCodePointBefore);
                }
                return str.substring(iCharCount, length).split(" ").length;
            default:
                return alph.a((defpackage.alqu) obj);
        }
    }
}
