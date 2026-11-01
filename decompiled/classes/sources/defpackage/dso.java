package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dso {
    protected final defpackage.ajxw f;
    private final defpackage.dsp g;
    int a = 0;
    private int h = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    private int i = -1;
    private boolean j = false;

    public dso(defpackage.dsp dspVar, defpackage.ajxw ajxwVar) {
        this.g = dspVar;
        this.f = ajxwVar;
    }

    public final float a(defpackage.dst dstVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == dstVar.c) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return 0.0f;
    }

    public final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final float c(defpackage.dst dstVar, boolean z) {
        int i = this.e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                if (this.b[i] == dstVar.c) {
                    int i4 = this.e;
                    int[] iArr = this.c;
                    if (i == i4) {
                        this.e = iArr[i];
                    } else {
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        dstVar.b(this.g);
                    }
                    dstVar.l--;
                    this.a--;
                    this.b[i] = -1;
                    if (this.j) {
                        this.i = i;
                    }
                    return this.d[i];
                }
                i2++;
                i3 = i;
                i = this.c[i];
            }
        }
        return 0.0f;
    }

    public final defpackage.dst d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((defpackage.dst[]) this.f.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(defpackage.dst dstVar, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.e;
            if (i == -1) {
                this.e = 0;
                this.d[0] = f;
                this.b[0] = dstVar.c;
                this.c[0] = -1;
                dstVar.l++;
                dstVar.a(this.g);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int length = this.b.length;
                if (i2 >= length) {
                    this.j = true;
                    this.i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.b[i];
                int i6 = dstVar.c;
                if (i5 == i6) {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.e;
                        int[] iArr2 = this.c;
                        if (i == i7) {
                            this.e = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            dstVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        dstVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.c[i];
            }
            int length2 = this.i;
            int i8 = length2 + 1;
            if (this.j) {
                int[] iArr3 = this.b;
                if (iArr3[length2] != -1) {
                    length2 = iArr3.length;
                }
            } else {
                length2 = i8;
            }
            int[] iArr4 = this.b;
            int length3 = iArr4.length;
            if (length2 < length3 || this.a >= length3) {
                iArr = iArr4;
                break;
            }
            int i9 = 0;
            while (true) {
                iArr = this.b;
                if (i9 >= iArr.length) {
                    iArr4 = iArr;
                    iArr = iArr4;
                    break;
                } else {
                    if (iArr[i9] == -1) {
                        length2 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int length4 = iArr.length;
            if (length2 >= length4) {
                int i10 = this.h << 1;
                this.h = i10;
                this.j = false;
                this.i = length4 - 1;
                this.d = java.util.Arrays.copyOf(this.d, i10);
                this.b = java.util.Arrays.copyOf(this.b, this.h);
                this.c = java.util.Arrays.copyOf(this.c, this.h);
                length2 = length4;
            }
            this.b[length2] = dstVar.c;
            this.d[length2] = f;
            int[] iArr5 = this.c;
            if (i3 != -1) {
                iArr5[length2] = iArr5[i3];
                iArr5[i3] = length2;
            } else {
                iArr5[length2] = this.e;
                this.e = length2;
            }
            dstVar.l++;
            dstVar.a(this.g);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int length5 = this.b.length;
            if (i11 >= length5) {
                this.j = true;
                this.i = length5 - 1;
            }
        }
    }

    public final void f() {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            defpackage.dst dstVar = ((defpackage.dst[]) this.f.c)[this.b[i]];
            if (dstVar != null) {
                dstVar.b(this.g);
            }
            i = this.c[i];
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(defpackage.dst dstVar, float f) {
        int[] iArr;
        if (f == 0.0f) {
            c(dstVar, true);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = dstVar.c;
            this.c[0] = -1;
            dstVar.l++;
            dstVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int length = this.b.length;
            if (i2 >= length) {
                this.j = true;
                this.i = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.b[i];
            int i6 = dstVar.c;
            if (i5 == i6) {
                this.d[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.c[i];
        }
        int length2 = this.i;
        int i7 = length2 + 1;
        if (this.j) {
            int[] iArr2 = this.b;
            if (iArr2[length2] != -1) {
                length2 = iArr2.length;
            }
        } else {
            length2 = i7;
        }
        int[] iArr3 = this.b;
        int length3 = iArr3.length;
        if (length2 < length3 || this.a >= length3) {
            iArr = iArr3;
            break;
        }
        int i8 = 0;
        while (true) {
            iArr = this.b;
            if (i8 >= iArr.length) {
                iArr3 = iArr;
                iArr = iArr3;
                break;
            } else {
                if (iArr[i8] == -1) {
                    length2 = i8;
                    break;
                }
                i8++;
            }
        }
        int length4 = iArr.length;
        if (length2 >= length4) {
            int i9 = this.h << 1;
            this.h = i9;
            this.j = false;
            this.i = length4 - 1;
            this.d = java.util.Arrays.copyOf(this.d, i9);
            this.b = java.util.Arrays.copyOf(this.b, this.h);
            this.c = java.util.Arrays.copyOf(this.c, this.h);
            length2 = length4;
        }
        this.b[length2] = dstVar.c;
        this.d[length2] = f;
        int[] iArr4 = this.c;
        if (i3 != -1) {
            iArr4[length2] = iArr4[i3];
            iArr4[i3] = length2;
        } else {
            iArr4[length2] = this.e;
            this.e = length2;
        }
        dstVar.l++;
        dstVar.a(this.g);
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.j) {
            this.i++;
        }
        int length5 = this.b.length;
        if (i10 >= length5) {
            this.j = true;
        }
        if (this.i >= length5) {
            this.j = true;
            this.i = length5 - 1;
        }
    }

    public final java.lang.String toString() {
        int i = this.e;
        java.lang.String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            strConcat = (strConcat.concat(" -> ") + this.d[i] + " : ").concat(java.lang.String.valueOf(java.lang.String.valueOf(((defpackage.dst[]) this.f.c)[this.b[i]])));
            i = this.c[i];
        }
        return strConcat;
    }
}
