package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qyg implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cmw c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ qyg(int i, java.lang.String str, long j, cmw cmwVar, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.e = str;
        this.b = j;
        this.c = cmwVar;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.d;
            cmw cmwVar = this.c;
            long j = this.b;
            java.lang.Object obj3 = this.e;
            int i3 = i2 | 1;
            int i4 = 306783378 & i3;
            int i5 = 613566756 & i3;
            pez.bI(this.a, (java.lang.String) obj3, j, cmwVar, cavVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
            return aojh.a;
        }
        if (i == 1) {
            cav cavVar2 = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.d;
            cmw cmwVar2 = this.c;
            long j2 = this.b;
            int i7 = i6 | 1;
            int i8 = 306783378 & i7;
            int i9 = 613566756 & i7;
            kji.b((kjk) this.e, this.a, j2, cmwVar2, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
            return aojh.a;
        }
        if (i != 2) {
            cav cavVar3 = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i10 = this.a | 1;
            int i11 = 306783378 & i10;
            int i12 = 613566756 & i10;
            int i13 = this.d;
            ?? r8 = this.e;
            long j3 = this.b;
            cmw cmwVar3 = this.c;
            aaoo.S(cmwVar3, j3, (java.util.List) r8, cavVar3, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12), i13);
            return aojh.a;
        }
        cav cavVar4 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i14 = this.a | 1;
        int i15 = 306783378 & i14;
        int i16 = 613566756 & i14;
        int i17 = this.d;
        long j4 = this.b;
        cmw cmwVar4 = this.c;
        java.lang.String str = (java.lang.String) this.e;
        aehj.bj(str, cmwVar4, j4, cavVar4, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 << 1) & i16), i17);
        return aojh.a;
    }

    public /* synthetic */ qyg(cmw cmwVar, long j, java.util.List list, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = cmwVar;
        this.b = j;
        this.e = list;
        this.a = i;
        this.d = i2;
    }

    public /* synthetic */ qyg(java.lang.String str, cmw cmwVar, long j, int i, int i2, int i3) {
        this.$cid = i3;
        this.e = str;
        this.c = cmwVar;
        this.b = j;
        this.a = i;
        this.d = i2;
    }

    public /* synthetic */ qyg(kjk kjkVar, int i, long j, cmw cmwVar, int i2, int i3) {
        this.$cid = i3;
        this.e = kjkVar;
        this.a = i;
        this.b = j;
        this.c = cmwVar;
        this.d = i2;
    }
}
