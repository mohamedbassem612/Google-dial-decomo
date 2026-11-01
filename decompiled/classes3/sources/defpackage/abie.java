package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abie implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ abie(defpackage.abhh abhhVar, cmw cmwVar, boolean z, bni bniVar, bni bniVar2, int i, int i2, int i3) {
        this.$cid = i3;
        this.d = abhhVar;
        this.e = cmwVar;
        this.a = z;
        this.f = bniVar;
        this.g = bniVar2;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aomy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.b | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = this.c;
            boolean z = this.a;
            ?? r7 = this.e;
            ?? r6 = this.d;
            defpackage.smj.d((defpackage.slh) this.f, (defpackage.abjl) this.g, r6, r7, z, cavVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3), i4);
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.b | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7);
        int i9 = this.c;
        java.lang.Object obj3 = this.g;
        java.lang.Object obj4 = this.f;
        boolean z2 = this.a;
        aehj.bu((defpackage.abhh) this.d, (cmw) this.e, z2, (bni) obj4, (bni) obj3, cavVar2, i8, i9);
        return aojh.a;
    }

    public /* synthetic */ abie(defpackage.slh slhVar, defpackage.abjl abjlVar, aonj aonjVar, aomy aomyVar, boolean z, int i, int i2, int i3) {
        this.$cid = i3;
        this.f = slhVar;
        this.g = abjlVar;
        this.d = aonjVar;
        this.e = aomyVar;
        this.a = z;
        this.b = i;
        this.c = i2;
    }
}
