package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bdx implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ bdx(defpackage.bdy bdyVar, int i, java.lang.Object obj, int i2) {
        this.$cid = i2;
        this.c = bdyVar;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [dcv, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.cav cavVar = (defpackage.cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (cavVar.H(i2 != 2, iIntValue & 1)) {
                this.c.e(this.a, this.b, cavVar, 0);
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            ((java.lang.Integer) obj2).intValue();
            int i3 = this.a | 1;
            int i4 = 306783378 & i3;
            int i5 = 613566756 & i3;
            ((defpackage.alg) this.c).i(this.b, (defpackage.cav) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
            return defpackage.aojh.a;
        }
        if (i == 2) {
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.a;
            int i7 = 306783378 & i6;
            int i8 = 613566756 & i6;
            ((defpackage.cja) this.c).c(this.b, (defpackage.cav) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8) | 1);
            return defpackage.aojh.a;
        }
        if (i == 3) {
            ((java.lang.Integer) obj2).intValue();
            int i9 = this.a;
            int i10 = i9 | 1;
            int i11 = 306783378 & i10;
            int i12 = 613566756 & i10;
            defpackage.dfo.a(this.c, this.b, (defpackage.cav) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12));
            return defpackage.aojh.a;
        }
        if (i != 4) {
            ((java.lang.Integer) obj2).intValue();
            int i13 = this.a | 1;
            int i14 = 306783378 & i13;
            int i15 = 613566756 & i13;
            defpackage.kcq.s((defpackage.kgm) this.b, this.c, (defpackage.cav) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 << 1) & i15));
            return defpackage.aojh.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i16 = this.a;
        int i17 = i16 | 1;
        int i18 = 306783378 & i17;
        int i19 = 613566756 & i17;
        defpackage.kcq.h(this.b, this.c, (defpackage.cav) obj, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 << 1) & i19));
        return defpackage.aojh.a;
    }

    public /* synthetic */ bdx(java.lang.Object obj, defpackage.cmw cmwVar, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = cmwVar;
        this.a = i;
    }

    public /* synthetic */ bdx(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
