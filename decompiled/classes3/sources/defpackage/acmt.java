package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acmt implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.acmb[] b;
    public final /* synthetic */ acmc[] c;
    public final /* synthetic */ aonn d;
    public final /* synthetic */ aonn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ defpackage.vaa h;

    public /* synthetic */ acmt(defpackage.vaa vaaVar, int i, defpackage.acmb[] acmbVarArr, acmc[] acmcVarArr, aonn aonnVar, aonn aonnVar2, int i2, int i3, int i4) {
        this.$cid = i4;
        this.h = vaaVar;
        this.a = i;
        this.b = acmbVarArr;
        this.c = acmcVarArr;
        this.d = aonnVar;
        this.e = aonnVar2;
        this.f = i2;
        this.g = i3;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.g | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 << 1) & i3);
            int i5 = this.f;
            aonn aonnVar = this.d;
            aonn aonnVar2 = this.e;
            acmc[] acmcVarArr = this.c;
            defpackage.acmb[] acmbVarArr = this.b;
            int i6 = this.a;
            this.h.L(i6, acmbVarArr, acmcVarArr, aonnVar2, aonnVar, (cav) obj, i4, i5);
            return aojh.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i7 = this.f;
        int i8 = this.g;
        aonn aonnVar3 = this.e;
        aonn aonnVar4 = this.d;
        acmc[] acmcVarArr2 = this.c;
        defpackage.acmb[] acmbVarArr2 = this.b;
        int i9 = this.a;
        int i10 = i7 | 1;
        int i11 = i8 & 306783378;
        int i12 = 306783378 & i10;
        int i13 = i12 << 1;
        int i14 = i8 & 613566756;
        int i15 = 613566756 & i10;
        int i16 = (i8 & (-920350135)) | i11 | (i14 >> 1);
        this.h.K(i9, acmbVarArr2, acmcVarArr2, aonnVar4, aonnVar3, (cav) obj, (i10 & (-920350135)) | i12 | (i15 >> 1) | (i13 & i15), ((i11 << 1) & i14) | i16);
        return aojh.a;
    }

    public /* synthetic */ acmt(defpackage.vaa vaaVar, int i, defpackage.acmb[] acmbVarArr, acmc[] acmcVarArr, aonn aonnVar, aonn aonnVar2, int i2, int i3, int i4, byte[] bArr) {
        this.$cid = i4;
        this.h = vaaVar;
        this.a = i;
        this.b = acmbVarArr;
        this.c = acmcVarArr;
        this.e = aonnVar;
        this.d = aonnVar2;
        this.g = i2;
        this.f = i3;
    }
}
