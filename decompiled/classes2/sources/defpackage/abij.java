package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abij implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ abij(long j, int i, aonn aonnVar, int i2, int i3) {
        this.$cid = i3;
        this.a = j;
        this.b = i;
        this.d = aonnVar;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.b | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = this.c;
            long j = this.a;
            ?? r5 = this.d;
            aehj.bj((java.lang.String) null, (cmw) r5, j, cavVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3), i4);
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        ?? r7 = this.d;
        int i6 = this.b;
        int i7 = i5 | 1;
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        defpackage.bqg.c(this.a, i6, r7, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
        return aojh.a;
    }

    public /* synthetic */ abij(cmw cmwVar, long j, int i, int i2, int i3) {
        this.$cid = i3;
        this.d = cmwVar;
        this.a = j;
        this.b = i;
        this.c = i2;
    }
}
