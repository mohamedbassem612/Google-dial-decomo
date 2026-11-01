package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abfq implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cmw a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dot d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ dkz h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ java.lang.Object k;

    public /* synthetic */ abfq(java.lang.Object obj, cmw cmwVar, long j, long j2, dot dotVar, int i, boolean z, int i2, dkz dkzVar, int i3, int i4, int i5) {
        this.$cid = i5;
        this.k = obj;
        this.a = cmwVar;
        this.b = j;
        this.c = j2;
        this.d = dotVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = dkzVar;
        this.i = i3;
        this.j = i4;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.i | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3);
            int i5 = this.j;
            dkz dkzVar = this.h;
            int i6 = this.g;
            boolean z = this.f;
            int i7 = this.e;
            dot dotVar = this.d;
            long j = this.c;
            long j2 = this.b;
            cmw cmwVar = this.a;
            afsq.bm((defpackage.abfr) this.k, cmwVar, j2, j, dotVar, i7, z, i6, dkzVar, (cav) obj, i4, i5);
            return aojh.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i8 = this.i;
        int i9 = this.j;
        dkz dkzVar2 = this.h;
        int i10 = this.g;
        boolean z2 = this.f;
        int i11 = this.e;
        dot dotVar2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        int i12 = i8 | 1;
        int i13 = i9 & 306783378;
        int i14 = 306783378 & i12;
        int i15 = i14 << 1;
        int i16 = i9 & 613566756;
        int i17 = 613566756 & i12;
        java.lang.String str = (java.lang.String) this.k;
        afsq.bo(str, this.a, j4, j3, dotVar2, i11, z2, i10, dkzVar2, (cav) obj, (i12 & (-920350135)) | i14 | (i17 >> 1) | (i15 & i17), (i9 & (-920350135)) | i13 | (i16 >> 1) | ((i13 << 1) & i16));
        return aojh.a;
    }
}
