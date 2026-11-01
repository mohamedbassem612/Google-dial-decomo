package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afng implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ afng(defpackage.afov afovVar, aonj aonjVar, aonj aonjVar2, aonj aonjVar3, defpackage.afow afowVar, int i, int i2) {
        this.$cid = i2;
        this.b = afovVar;
        this.c = aonjVar;
        this.d = aonjVar2;
        this.e = aonjVar3;
        this.f = afowVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.a;
            ?? r8 = this.e;
            java.lang.Object obj3 = this.d;
            java.lang.Object obj4 = this.c;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            abrz.m((bor) this.b, (bry) this.f, (bti) obj4, (bwo) obj3, (aonn) r8, cavVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.a;
        java.lang.Object obj5 = this.f;
        ?? r7 = this.e;
        ?? r6 = this.d;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        defpackage.afny.f((defpackage.afov) this.b, this.c, r6, r7, (defpackage.afow) obj5, cavVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
        return aojh.a;
    }

    public /* synthetic */ afng(bor borVar, bry bryVar, bti btiVar, bwo bwoVar, aonn aonnVar, int i, int i2) {
        this.$cid = i2;
        this.b = borVar;
        this.f = bryVar;
        this.c = btiVar;
        this.d = bwoVar;
        this.e = aonnVar;
        this.a = i;
    }
}
