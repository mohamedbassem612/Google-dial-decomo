package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class j {
    public final defpackage.i d;
    public defpackage.m a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public j(defpackage.hiv hivVar) {
        this.d = new defpackage.i(this, hivVar);
    }

    public final void a(defpackage.m mVar) {
        defpackage.m mVar2 = this.a;
        if (mVar2 != null) {
            this.d.f(mVar2, -1.0f);
            this.a = null;
        }
        defpackage.i iVar = this.d;
        float f = -iVar.c(mVar);
        this.a = mVar;
        if (f != 1.0f) {
            this.b /= f;
            int i = iVar.e;
            for (int i2 = 0; i != -1 && i2 < iVar.a; i2++) {
                float[] fArr = iVar.d;
                fArr[i] = fArr[i] / f;
                i = iVar.c[i];
            }
        }
    }

    final void b() {
        defpackage.i iVar = this.d;
        int i = iVar.e;
        for (int i2 = 0; i != -1 && i2 < iVar.a; i2++) {
            defpackage.m mVar = ((defpackage.m[]) iVar.h.c)[iVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = mVar.g;
                if (i3 >= i4) {
                    defpackage.j[] jVarArr = mVar.f;
                    int length = jVarArr.length;
                    if (i4 >= length) {
                        mVar.f = (defpackage.j[]) java.util.Arrays.copyOf(jVarArr, length << 1);
                    }
                    defpackage.j[] jVarArr2 = mVar.f;
                    int i5 = mVar.g;
                    jVarArr2[i5] = this;
                    mVar.g = i5 + 1;
                    break;
                }
                if (mVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = iVar.c[i];
        }
    }

    public final void c(defpackage.m mVar, defpackage.m mVar2) {
        defpackage.i iVar = this.d;
        iVar.f(mVar, 1.0f);
        iVar.f(mVar2, -1.0f);
    }

    final void d(defpackage.m mVar, defpackage.m mVar2, int i, float f, defpackage.m mVar3, defpackage.m mVar4, int i2) {
        if (mVar2 == mVar3) {
            defpackage.i iVar = this.d;
            iVar.f(mVar, 1.0f);
            iVar.f(mVar4, 1.0f);
            iVar.f(mVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            defpackage.i iVar2 = this.d;
            iVar2.f(mVar, 1.0f);
            iVar2.f(mVar2, -1.0f);
            iVar2.f(mVar3, -1.0f);
            iVar2.f(mVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            defpackage.i iVar3 = this.d;
            iVar3.f(mVar, -1.0f);
            iVar3.f(mVar2, 1.0f);
            this.b = i;
            return;
        }
        defpackage.i iVar4 = this.d;
        if (f >= 1.0f) {
            iVar4.f(mVar3, -1.0f);
            iVar4.f(mVar4, 1.0f);
            this.b = i2;
            return;
        }
        float f2 = 1.0f - f;
        iVar4.f(mVar, f2);
        iVar4.f(mVar2, -f2);
        iVar4.f(mVar3, -f);
        iVar4.f(mVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(defpackage.m mVar, defpackage.m mVar2, defpackage.m mVar3, defpackage.m mVar4, float f) {
        defpackage.i iVar = this.d;
        iVar.f(mVar, -1.0f);
        iVar.f(mVar2, 1.0f);
        iVar.f(mVar3, f);
        iVar.f(mVar4, -f);
    }

    public final void f(float f, float f2, float f3, defpackage.m mVar, int i, defpackage.m mVar2, int i2, defpackage.m mVar3, int i3, defpackage.m mVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            defpackage.i iVar = this.d;
            iVar.f(mVar, 1.0f);
            iVar.f(mVar2, -1.0f);
            iVar.f(mVar4, 1.0f);
            iVar.f(mVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        defpackage.i iVar2 = this.d;
        iVar2.f(mVar, 1.0f);
        iVar2.f(mVar2, -1.0f);
        iVar2.f(mVar4, f4);
        iVar2.f(mVar3, -f4);
    }

    public final void g(defpackage.m mVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(mVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(mVar, -1.0f);
        }
    }

    public final void h(defpackage.m mVar, defpackage.m mVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                defpackage.i iVar = this.d;
                iVar.f(mVar, 1.0f);
                iVar.f(mVar2, -1.0f);
                return;
            }
        }
        defpackage.i iVar2 = this.d;
        iVar2.f(mVar, -1.0f);
        iVar2.f(mVar2, 1.0f);
    }

    public final void i(defpackage.m mVar, defpackage.m mVar2, defpackage.m mVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                defpackage.i iVar = this.d;
                iVar.f(mVar, 1.0f);
                iVar.f(mVar2, -1.0f);
                iVar.f(mVar3, -1.0f);
                return;
            }
        }
        defpackage.i iVar2 = this.d;
        iVar2.f(mVar, -1.0f);
        iVar2.f(mVar2, 1.0f);
        iVar2.f(mVar3, 1.0f);
    }

    public final void j(defpackage.m mVar, defpackage.m mVar2, defpackage.m mVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                defpackage.i iVar = this.d;
                iVar.f(mVar, 1.0f);
                iVar.f(mVar2, -1.0f);
                iVar.f(mVar3, 1.0f);
                return;
            }
        }
        defpackage.i iVar2 = this.d;
        iVar2.f(mVar, -1.0f);
        iVar2.f(mVar2, 1.0f);
        iVar2.f(mVar3, -1.0f);
    }

    public final void k(defpackage.j jVar) {
        this.d.g(this, jVar);
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        boolean z;
        java.lang.String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            defpackage.m mVar = this.a;
            java.util.Objects.toString(mVar);
            strConcat = "".concat(java.lang.String.valueOf(mVar));
        }
        float f = this.b;
        java.lang.String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        defpackage.i iVar = this.d;
        int i = iVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (iVar.d(i2) != null) {
                float fB = iVar.b(i2);
                if (z) {
                    if (fB > 0.0f) {
                        str = " + ";
                    } else {
                        fB = -fB;
                        str = " - ";
                    }
                    strConcat2 = strConcat2.concat(str);
                } else if (fB < 0.0f) {
                    fB = -fB;
                    strConcat2 = strConcat2.concat("- ");
                }
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
