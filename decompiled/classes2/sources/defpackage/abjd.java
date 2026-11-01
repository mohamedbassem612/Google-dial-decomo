package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abjd implements aonn {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ cmw b;
    public final /* synthetic */ cmj c;
    public final /* synthetic */ defpackage.cwy d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ abjd(java.lang.Object obj, cmw cmwVar, cmj cmjVar, defpackage.cwy cwyVar, int i, int i2, int i3) {
        this.a = obj;
        this.b = cmwVar;
        this.c = cmjVar;
        this.d = cwyVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cav cavVar = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i = this.e;
        java.lang.Object obj3 = this.a;
        int i2 = this.f;
        int i3 = i | 1;
        int i4 = i2 & 306783378;
        int i5 = 306783378 & i3;
        int i6 = i2 & 613566756;
        int i7 = 613566756 & i3;
        aehj.aF(obj3, this.b, this.c, this.d, cavVar, (i3 & (-920350135)) | i5 | (i7 >> 1) | ((i5 << 1) & i7), (i2 & (-920350135)) | i4 | (i6 >> 1) | ((i4 << 1) & i6), this.g);
        return aojh.a;
    }
}
