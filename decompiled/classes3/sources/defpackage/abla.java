package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abla implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ abla(abja abjaVar, boolean z, int i, aono aonoVar, int i2, int i3) {
        this.$cid = i3;
        this.d = abjaVar;
        this.a = z;
        this.c = i;
        this.e = aonoVar;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aono, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.b;
            ?? r7 = this.e;
            int i2 = this.c;
            int i3 = i | 1;
            int i4 = 306783378 & i3;
            int i5 = 613566756 & i3;
            aehj.af((abja) this.d, this.a, i2, (aono) r7, cavVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i6 = this.b;
        int i7 = this.c;
        java.lang.Object obj3 = this.d;
        ?? r5 = this.e;
        int i8 = i6 | 1;
        int i9 = 306783378 & i8;
        int i10 = 613566756 & i8;
        defpackage.sme.d(this.a, r5, (defpackage.sko) obj3, i7, cavVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 << 1) & i10));
        return aojh.a;
    }

    public /* synthetic */ abla(boolean z, aonj aonjVar, defpackage.sko skoVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.a = z;
        this.e = aonjVar;
        this.d = skoVar;
        this.c = i;
        this.b = i2;
    }
}
