package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dsp {
    defpackage.dst a = null;
    public float b = 0.0f;
    final java.util.ArrayList c = new java.util.ArrayList();
    boolean d = false;
    public defpackage.dso e;

    public dsp(defpackage.ajxw ajxwVar) {
        this.e = new defpackage.dso(this, ajxwVar);
    }

    public final defpackage.dst a(boolean[] zArr, defpackage.dst dstVar) {
        int i;
        int i2 = this.e.a;
        defpackage.dst dstVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                defpackage.dst dstVarD = this.e.d(i3);
                if ((zArr == null || !zArr[dstVarD.c]) && dstVarD != dstVar && (((i = dstVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    dstVar2 = dstVarD;
                }
            }
        }
        return dstVar2;
    }

    final void b(defpackage.dst dstVar) {
        defpackage.dst dstVar2 = this.a;
        if (dstVar2 != null) {
            this.e.g(dstVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(dstVar, true);
        this.a = dstVar;
        if (f != 1.0f) {
            this.b /= f;
            defpackage.dso dsoVar = this.e;
            int i = dsoVar.e;
            for (int i2 = 0; i != -1 && i2 < dsoVar.a; i2++) {
                float[] fArr = dsoVar.d;
                fArr[i] = fArr[i] / f;
                i = dsoVar.c[i];
            }
        }
    }

    public final void c(defpackage.dsq dsqVar, defpackage.dst dstVar, boolean z) {
        if (dstVar == null || !dstVar.g) {
            return;
        }
        this.b += dstVar.f * this.e.a(dstVar);
        this.e.c(dstVar, z);
        if (z) {
            dstVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            dsqVar.c = true;
        }
    }

    public void d(defpackage.dsq dsqVar, defpackage.dsp dspVar, boolean z) {
        defpackage.dso dsoVar = this.e;
        float fA = dsoVar.a(dspVar.a);
        dsoVar.c(dspVar.a, z);
        defpackage.dso dsoVar2 = dspVar.e;
        int i = dsoVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dst dstVarD = dsoVar2.d(i2);
            dsoVar.e(dstVarD, dsoVar2.a(dstVarD) * fA, z);
        }
        this.b += dspVar.b * fA;
        if (z) {
            dspVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        dsqVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(defpackage.dsq dsqVar, int i) {
        this.e.g(dsqVar.p(i), 1.0f);
        this.e.g(dsqVar.p(i), -1.0f);
    }

    public final void g(defpackage.dst dstVar, defpackage.dst dstVar2, defpackage.dst dstVar3, defpackage.dst dstVar4, float f) {
        this.e.g(dstVar, -1.0f);
        this.e.g(dstVar2, 1.0f);
        this.e.g(dstVar3, f);
        this.e.g(dstVar4, -f);
    }

    public final void h(defpackage.dst dstVar, defpackage.dst dstVar2, defpackage.dst dstVar3, int i) {
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
                this.e.g(dstVar, 1.0f);
                this.e.g(dstVar2, -1.0f);
                this.e.g(dstVar3, -1.0f);
                return;
            }
        }
        this.e.g(dstVar, -1.0f);
        this.e.g(dstVar2, 1.0f);
        this.e.g(dstVar3, 1.0f);
    }

    public final void i(defpackage.dst dstVar, defpackage.dst dstVar2, defpackage.dst dstVar3, int i) {
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
                this.e.g(dstVar, 1.0f);
                this.e.g(dstVar2, -1.0f);
                this.e.g(dstVar3, 1.0f);
                return;
            }
        }
        this.e.g(dstVar, -1.0f);
        this.e.g(dstVar2, 1.0f);
        this.e.g(dstVar3, -1.0f);
    }

    public final void j(defpackage.dst dstVar, defpackage.dst dstVar2, defpackage.dst dstVar3, defpackage.dst dstVar4, float f) {
        this.e.g(dstVar3, 0.5f);
        this.e.g(dstVar4, 0.5f);
        this.e.g(dstVar, -0.5f);
        this.e.g(dstVar2, -0.5f);
        this.b = -f;
    }

    public defpackage.dst k(boolean[] zArr) {
        return a(zArr, null);
    }

    public java.lang.String toString() {
        boolean z;
        java.lang.String str;
        defpackage.dst dstVar = this.a;
        java.lang.String strConcat = dstVar == null ? "0" : "".concat(dstVar.toString());
        float f = this.b;
        java.lang.String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + f;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dst dstVarD = this.e.d(i2);
            if (dstVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    java.lang.String string = dstVarD.toString();
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
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + ' ' + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public dsp() {
    }
}
