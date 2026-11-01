package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class chi extends defpackage.den {
    public int b;
    public int d;
    public int f;
    public defpackage.chd[] a = new defpackage.chd[16];
    public int[] c = new int[16];
    public java.lang.Object[] e = new java.lang.Object[16];

    private static final int cf(int i, int i2) {
        int i3 = i + (i <= 1024 ? i : 1024);
        return i3 >= i2 ? i3 : i2;
    }

    public final void h() {
        this.b = 0;
        this.d = 0;
        java.lang.Object[] objArr = this.e;
        int i = this.f;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, 0, i, (java.lang.Object) null);
        this.f = 0;
    }

    public final void i(defpackage.chd chdVar) {
        int i = this.b;
        defpackage.chd[] chdVarArr = this.a;
        if (i == chdVarArr.length) {
            defpackage.chd[] chdVarArr2 = new defpackage.chd[(i <= 1024 ? i : 1024) + i];
            java.lang.System.arraycopy(chdVarArr, 0, chdVarArr2, 0, i);
            this.a = chdVarArr2;
        }
        int i2 = this.d;
        int i3 = chdVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[cf(length, i4)];
            defpackage.ajsz.db(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = chdVar.c;
        int i7 = i5 + i6;
        java.lang.Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            java.lang.Object[] objArr2 = new java.lang.Object[cf(length2, i7)];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        defpackage.chd[] chdVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        chdVarArr3[i8] = chdVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean j() {
        return this.b == 0;
    }

    public final boolean k() {
        return this.b != 0;
    }

    public final void l(defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar) {
        if (k()) {
            defpackage.chg chgVar = new defpackage.chg(this);
            while (true) {
                defpackage.chd chdVarB = chgVar.b();
                defpackage.cfh cfhVarB = chdVarB.b(chgVar);
                defpackage.cah cahVar2 = cahVar;
                defpackage.cfp cfpVar2 = cfpVar;
                defpackage.cjh cjhVar2 = cjhVar;
                defpackage.che cheVar2 = cheVar;
                try {
                    chdVarB.a(chgVar, cahVar2, cfpVar2, cjhVar2, cheVar2);
                    int i = chgVar.a;
                    defpackage.chi chiVar = chgVar.d;
                    if (i >= chiVar.b) {
                        break;
                    }
                    defpackage.chd chdVarB2 = chgVar.b();
                    chgVar.b += chdVarB2.b;
                    chgVar.c += chdVarB2.c;
                    int i2 = chgVar.a + 1;
                    chgVar.a = i2;
                    if (i2 >= chiVar.b) {
                        break;
                    }
                    cahVar = cahVar2;
                    cfpVar = cfpVar2;
                    cjhVar = cjhVar2;
                    cheVar = cheVar2;
                } catch (java.lang.Throwable th) {
                    if (cheVar2 == null) {
                        throw th;
                    }
                    rs.h(th, new af(cfhVarB, cfpVar2, cheVar2, 11));
                    throw th;
                }
            }
        }
        h();
    }
}
