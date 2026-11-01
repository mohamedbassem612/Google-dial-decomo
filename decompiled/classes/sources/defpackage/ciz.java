package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ciz implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ciz(defpackage.dfl dflVar, defpackage.deg degVar, defpackage.aonn aonnVar, int i, int i2) {
        this.$cid = i2;
        this.a = dflVar;
        this.d = degVar;
        this.b = aonnVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cmw, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.c;
            java.lang.Object obj3 = this.b;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.cja cjaVar = (defpackage.cja) this.d;
            cjaVar.d(this.a, obj3, (defpackage.cav) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4) | 1);
            return defpackage.aojh.a;
        }
        if (i == 1) {
            ((java.lang.Integer) obj2).intValue();
            int i5 = this.c;
            ?? r0 = this.b;
            int i6 = i5 | 1;
            int i7 = 306783378 & i6;
            int i8 = 613566756 & i6;
            but butVar = (but) this.d;
            defpackage.den.ag(butVar, this.a, r0, (defpackage.cav) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
            return defpackage.aojh.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i9 = this.c;
        ?? r1 = this.b;
        java.lang.Object obj4 = this.d;
        int i10 = i9 | 1;
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        defpackage.dfl dflVar = (defpackage.dfl) this.a;
        defpackage.deg degVar = (defpackage.deg) obj4;
        dflVar.e(degVar, r1, (defpackage.cav) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12));
        return defpackage.aojh.a;
    }

    public /* synthetic */ ciz(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.$cid = i2;
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = i;
    }
}
