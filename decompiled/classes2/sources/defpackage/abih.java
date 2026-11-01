package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abih implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cmw a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ abih(aomy aomyVar, cmw cmwVar, long j, int i, int i2) {
        this.$cid = i2;
        this.d = aomyVar;
        this.a = cmwVar;
        this.b = j;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.c;
            ?? r7 = this.d;
            long j = this.b;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.rl.o(this.a, j, r7, cavVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        long j2 = this.b;
        cmw cmwVar = this.a;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        aehj.bv((aomy) this.d, cmwVar, j2, cavVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
        return aojh.a;
    }

    public /* synthetic */ abih(cmw cmwVar, long j, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.a = cmwVar;
        this.b = j;
        this.d = list;
        this.c = i;
    }
}
