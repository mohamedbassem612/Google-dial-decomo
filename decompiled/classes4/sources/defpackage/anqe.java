package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anqe implements defpackage.anqg {
    final int a;
    final defpackage.anqg[] b;
    private final int c;

    private anqe(int i, defpackage.anqg[] anqgVarArr, int i2) {
        this.a = i;
        this.b = anqgVarArr;
        this.c = i2;
    }

    static defpackage.anqg b(defpackage.anqg anqgVar, int i, defpackage.anqg anqgVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = (i2 >>> i3) & 31;
        int i6 = 1 << i4;
        int i7 = 1 << i5;
        if (i6 == i7) {
            defpackage.anqg anqgVarB = b(anqgVar, i, anqgVar2, i2, i3 + 5);
            return new defpackage.anqe(i6, new defpackage.anqg[]{anqgVarB}, ((defpackage.anqe) anqgVarB).c);
        }
        if (i4 > i5) {
            anqgVar2 = anqgVar;
            anqgVar = anqgVar2;
        }
        return new defpackage.anqe(i6 | i7, new defpackage.anqg[]{anqgVar, anqgVar2}, anqgVar.a() + anqgVar2.a());
    }

    private final int e(int i) {
        return java.lang.Integer.bitCount(this.a & (i - 1));
    }

    @Override // defpackage.anqg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.anqg
    public final defpackage.anqg c(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        int i3 = this.a;
        int i4 = 1 << ((i >>> i2) & 31);
        int iE = e(i4);
        int i5 = i3 & i4;
        defpackage.anqg[] anqgVarArr = this.b;
        if (i5 != 0) {
            defpackage.anqg[] anqgVarArr2 = (defpackage.anqg[]) java.util.Arrays.copyOf(anqgVarArr, anqgVarArr.length);
            defpackage.anqg anqgVarC = anqgVarArr[iE].c(obj, obj2, i, i2 + 5);
            anqgVarArr2[iE] = anqgVarC;
            return new defpackage.anqe(i3, anqgVarArr2, (this.c + anqgVarC.a()) - anqgVarArr[iE].a());
        }
        int length = anqgVarArr.length;
        defpackage.anqg[] anqgVarArr3 = new defpackage.anqg[length + 1];
        java.lang.System.arraycopy(anqgVarArr, 0, anqgVarArr3, 0, iE);
        anqgVarArr3[iE] = new defpackage.anqf(obj, obj2, 0);
        java.lang.System.arraycopy(anqgVarArr, iE, anqgVarArr3, iE + 1, length - iE);
        return new defpackage.anqe(i3 | i4, anqgVarArr3, this.c + 1);
    }

    @Override // defpackage.anqg
    public final java.lang.Object d(java.lang.Object obj, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        if ((this.a & i3) == 0) {
            return null;
        }
        return this.b[e(i3)].d(obj, i, i2 + 5);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompressedIndex(");
        sb.append(java.lang.String.format("bitmap=%s ", java.lang.Integer.toBinaryString(this.a)));
        for (defpackage.anqg anqgVar : this.b) {
            sb.append(anqgVar);
            sb.append(' ');
        }
        sb.append(')');
        return sb.toString();
    }
}
