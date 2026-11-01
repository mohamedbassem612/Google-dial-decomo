package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dfj implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ dfj(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.a | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            ((androidx.compose.ui.platform.ComposeView) this.b).b((defpackage.cav) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return defpackage.aojh.a;
        }
        if (i != 1) {
            ((java.lang.Integer) obj2).intValue();
            int i5 = this.a | 1;
            int i6 = 306783378 & i5;
            int i7 = 613566756 & i5;
            defpackage.kcq.p((defpackage.kgm) this.b, (defpackage.cav) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
            return defpackage.aojh.a;
        }
        defpackage.cav cavVar = (defpackage.cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i8 = iIntValue & 3;
        if (cavVar.H(i8 != 2, iIntValue & 1)) {
            int i9 = this.a;
            defpackage.bas basVar = (defpackage.bas) this.b;
            defpackage.apnb apnbVarB = basVar.a.a.b(i9);
            ((defpackage.bap) apnbVarB.c).a.a(basVar.c, java.lang.Integer.valueOf(i9 - apnbVarB.b), cavVar, 0);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }
}
