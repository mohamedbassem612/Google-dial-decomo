package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class buo implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ buo(java.lang.Object obj, int i, defpackage.bel belVar, defpackage.aonn aonnVar, int i2, int i3) {
        this.$cid = i3;
        this.d = obj;
        this.a = i;
        this.c = belVar;
        this.e = aonnVar;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aonn, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            defpackage.cav cavVar = (defpackage.cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.a | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = this.b;
            ?? r6 = this.e;
            ?? r5 = this.d;
            defpackage.nf nfVar = (defpackage.nf) this.c;
            defpackage.den.aj(nfVar, r5, r6, cavVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3), i4);
            return defpackage.aojh.a;
        }
        defpackage.cav cavVar2 = (defpackage.cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.b;
        ?? r7 = this.e;
        java.lang.Object obj3 = this.c;
        int i6 = this.a;
        int i7 = i5 | 1;
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        defpackage.den.aC(this.d, i6, (defpackage.bel) obj3, r7, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
        return defpackage.aojh.a;
    }

    public /* synthetic */ buo(defpackage.nf nfVar, defpackage.cmw cmwVar, defpackage.aono aonoVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = nfVar;
        this.d = cmwVar;
        this.e = aonoVar;
        this.a = i;
        this.b = i2;
    }
}
