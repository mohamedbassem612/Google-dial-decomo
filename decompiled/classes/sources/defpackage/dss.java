package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dss extends defpackage.dsp {
    public int f;
    final defpackage.dsr g;
    private defpackage.dst[] h;
    private defpackage.dst[] i;

    public dss(defpackage.ajxw ajxwVar) {
        super(ajxwVar);
        this.h = new defpackage.dst[128];
        this.i = new defpackage.dst[128];
        this.f = 0;
        this.g = new defpackage.dsr(this);
    }

    @Override // defpackage.dsp
    public final void d(defpackage.dsq dsqVar, defpackage.dsp dspVar, boolean z) {
        defpackage.dst dstVar = dspVar.a;
        if (dstVar != null) {
            defpackage.dso dsoVar = dspVar.e;
            int i = dsoVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.dst dstVarD = dsoVar.d(i2);
                float fB = dsoVar.b(i2);
                defpackage.dsr dsrVar = this.g;
                dsrVar.a = dstVarD;
                if (dsrVar.a.b) {
                    boolean z2 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = dsrVar.a.i;
                        float f = fArr[i3] + (dstVar.i[i3] * fB);
                        fArr[i3] = f;
                        if (java.lang.Math.abs(f) < 1.0E-4f) {
                            dsrVar.a.i[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        dsrVar.b.m(dsrVar.a);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = dstVar.i[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * fB;
                            if (java.lang.Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            dsrVar.a.i[i4] = f3;
                        } else {
                            dsrVar.a.i[i4] = 0.0f;
                        }
                    }
                    l(dstVarD);
                }
                this.b += dspVar.b * fB;
            }
            m(dstVar);
        }
    }

    @Override // defpackage.dsp
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.dsp
    public final defpackage.dst k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            defpackage.dst[] dstVarArr = this.h;
            defpackage.dst dstVar = dstVarArr[i2];
            if (!zArr[dstVar.c]) {
                defpackage.dsr dsrVar = this.g;
                dsrVar.a = dstVar;
                int i3 = 8;
                if (i != -1) {
                    defpackage.dst dstVar2 = dstVarArr[i];
                    while (i3 >= 0) {
                        float f = dstVar2.i[i3];
                        float f2 = dsrVar.a.i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = dsrVar.a.i[i3];
                            if (f3 <= 0.0f) {
                                if (f3 < 0.0f) {
                                    i = i2;
                                    break;
                                }
                                i3--;
                            }
                        }
                        i = -1;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void l(defpackage.dst dstVar) {
        int i;
        defpackage.dst[] dstVarArr;
        int i2 = this.f + 1;
        defpackage.dst[] dstVarArr2 = this.h;
        int length = dstVarArr2.length;
        if (i2 > length) {
            defpackage.dst[] dstVarArr3 = (defpackage.dst[]) java.util.Arrays.copyOf(dstVarArr2, length << 1);
            this.h = dstVarArr3;
            this.i = (defpackage.dst[]) java.util.Arrays.copyOf(dstVarArr3, dstVarArr3.length << 1);
        }
        defpackage.dst[] dstVarArr4 = this.h;
        int i3 = this.f;
        dstVarArr4[i3] = dstVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && dstVarArr4[i3].c > dstVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                dstVarArr = this.i;
                if (i5 >= i) {
                    break;
                }
                dstVarArr[i5] = this.h[i5];
                i5++;
            }
            java.util.Arrays.sort(dstVarArr, 0, i, new defpackage.cph(6));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        dstVar.b = true;
        dstVar.a(this);
    }

    public final void m(defpackage.dst dstVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == dstVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        dstVar.b = false;
                        return;
                    } else {
                        defpackage.dst[] dstVarArr = this.h;
                        int i3 = i + 1;
                        dstVarArr[i] = dstVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.dsp
    public final java.lang.String toString() {
        java.lang.String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            defpackage.dst dstVar = this.h[i];
            defpackage.dsr dsrVar = this.g;
            dsrVar.a = dstVar;
            str = str + java.lang.String.valueOf(dsrVar) + ' ';
        }
        return str;
    }
}
