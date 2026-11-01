package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acpd implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;

    public /* synthetic */ acpd(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, float f, azz azzVar, bwk bwkVar, int i, int i2) {
        this.$cid = i2;
        this.c = aonnVar;
        this.d = cmwVar;
        this.e = aonnVar2;
        this.f = aonoVar;
        this.a = f;
        this.g = azzVar;
        this.h = bwkVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [cmj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [azz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cwy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.b;
            float f = this.a;
            ?? r9 = this.d;
            ?? r8 = this.g;
            java.lang.Object obj3 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.xtm.b((defpackage.xsv) this.c, (defpackage.xff) this.e, this.h, (java.lang.String) obj3, r8, r9, f, cavVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.b;
        java.lang.Object obj4 = this.h;
        ?? r10 = this.g;
        float f2 = this.a;
        ?? r7 = this.f;
        ?? r6 = this.e;
        ?? r5 = this.d;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        defpackage.acpg.c(this.c, r5, r6, r7, f2, r10, (bwk) obj4, cavVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
        return aojh.a;
    }

    public /* synthetic */ acpd(defpackage.xsv xsvVar, defpackage.xff xffVar, cmw cmwVar, java.lang.String str, cmj cmjVar, cwy cwyVar, float f, int i, int i2) {
        this.$cid = i2;
        this.c = xsvVar;
        this.e = xffVar;
        this.h = cmwVar;
        this.f = str;
        this.g = cmjVar;
        this.d = cwyVar;
        this.a = f;
        this.b = i;
    }
}
