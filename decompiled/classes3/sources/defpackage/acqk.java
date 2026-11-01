package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acqk implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ acqk(awy awyVar, defpackage.aben abenVar, boolean z, int i, int i2) {
        this.$cid = i2;
        this.d = awyVar;
        this.c = abenVar;
        this.a = z;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [cmw, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.b;
            boolean z = this.a;
            java.lang.Object obj3 = this.c;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            awy awyVar = (awy) this.d;
            defpackage.aben abenVar = (defpackage.aben) obj3;
            defpackage.abew.d(awyVar, abenVar, z, (cav) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return aojh.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.b;
        java.lang.Object obj4 = this.d;
        ?? r4 = this.c;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        bsp bspVar = (bsp) obj4;
        aaoo.L(this.a, (cmw) r4, bspVar, (cav) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
        return aojh.a;
    }

    public /* synthetic */ acqk(boolean z, cmw cmwVar, bsp bspVar, int i, int i2) {
        this.$cid = i2;
        this.a = z;
        this.c = cmwVar;
        this.d = bspVar;
        this.b = i;
    }
}
