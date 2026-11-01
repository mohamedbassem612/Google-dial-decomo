package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class peb implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ peb(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                ((java.lang.Integer) obj2).intValue();
                int i = this.a | 1;
                int i2 = 306783378 & i;
                int i3 = 613566756 & i;
                defpackage.pef.d((cav) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3));
                break;
            case 1:
                ((java.lang.Integer) obj2).intValue();
                int i4 = this.a | 1;
                int i5 = 306783378 & i4;
                int i6 = 613566756 & i4;
                mni.cb((cav) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                break;
            case 2:
                ((java.lang.Integer) obj2).intValue();
                int i7 = this.a | 1;
                int i8 = 306783378 & i7;
                int i9 = 613566756 & i7;
                defpackage.pef.c((cav) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                break;
            case 3:
                ((java.lang.Integer) obj2).intValue();
                int i10 = this.a | 1;
                int i11 = 306783378 & i10;
                int i12 = 613566756 & i10;
                pez.I((cav) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12));
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((java.lang.Integer) obj2).intValue();
                int i13 = this.a | 1;
                int i14 = 306783378 & i13;
                int i15 = 613566756 & i13;
                pez.G((cav) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 << 1) & i15));
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((java.lang.Integer) obj2).intValue();
                int i16 = this.a | 1;
                int i17 = 306783378 & i16;
                int i18 = 613566756 & i16;
                snl.s((cav) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 << 1) & i18));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((java.lang.Integer) obj2).intValue();
                int i19 = this.a | 1;
                int i20 = 306783378 & i19;
                int i21 = 613566756 & i19;
                snl.G((cav) obj, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 << 1) & i21));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((java.lang.Integer) obj2).intValue();
                int i22 = this.a | 1;
                int i23 = 306783378 & i22;
                int i24 = 613566756 & i22;
                snl.t((cav) obj, (i22 & (-920350135)) | i23 | (i24 >> 1) | ((i23 << 1) & i24));
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i25 = iIntValue & 3;
                if (cavVar.H(i25 != 2, iIntValue & 1)) {
                    aaoo.V(wv.k(this.a, cavVar, 0), dfa.f(2132020827, cavVar), (cmw) null, den.ak(cavVar).s, cavVar, 8, 4);
                } else {
                    cavVar.s();
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((java.lang.Integer) obj2).intValue();
                int i26 = this.a | 1;
                int i27 = 306783378 & i26;
                int i28 = 613566756 & i26;
                aehj.as((cav) obj, (i26 & (-920350135)) | i27 | (i28 >> 1) | ((i27 << 1) & i28));
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((java.lang.Integer) obj2).intValue();
                int i29 = this.a | 1;
                int i30 = 306783378 & i29;
                int i31 = 613566756 & i29;
                aehj.aa((cav) obj, (i29 & (-920350135)) | i30 | (i31 >> 1) | ((i30 << 1) & i31));
                break;
            default:
                ((java.lang.Integer) obj2).intValue();
                int i32 = this.a | 1;
                int i33 = 306783378 & i32;
                int i34 = 613566756 & i32;
                defpackage.afny.i((cav) obj, (i32 & (-920350135)) | i33 | (i34 >> 1) | ((i33 << 1) & i34));
                break;
        }
        return aojh.a;
    }
}
