package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dlv implements android.text.style.LineHeightSpan {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final int e;
    public int f;
    public int g;
    private final int h;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    public dlv(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.a = f;
        this.h = i;
        this.b = z;
        this.c = z2;
        this.d = f2;
        this.e = i2;
        if ((f2 < 0.0f || f2 > 1.0f) && f2 != -1.0f) {
            dnv.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        double dCeil;
        boolean z2;
        int iMin;
        int i5 = this.e;
        boolean z3 = false;
        boolean z4 = true;
        if (i5 == 3) {
            int i6 = fontMetricsInt.ascent;
            int i7 = fontMetricsInt.descent;
            int i8 = i7 - i6;
            if (i8 > 0) {
                boolean z5 = i2 == this.h;
                if (i != 0) {
                    z2 = false;
                } else if (z5 && this.b && this.c) {
                    return;
                } else {
                    z2 = true;
                }
                int iCeil = (int) java.lang.Math.ceil(this.a);
                int i9 = iCeil - i8;
                if (i9 <= 0) {
                    if (z2) {
                        this.f = 0;
                    }
                    if (z5) {
                        this.g = 0;
                        return;
                    }
                    return;
                }
                float fAbs = this.d;
                if (fAbs == -1.0f) {
                    fAbs = java.lang.Math.abs(i6) / i8;
                }
                int iCeil2 = ((int) java.lang.Math.ceil(i9 * (1.0f - fAbs))) + i7;
                int i10 = iCeil2 - iCeil;
                if (!z2) {
                    iMin = java.lang.Math.min(i6, i10);
                    z4 = z3;
                } else if (this.b) {
                    iMin = i6;
                } else {
                    z3 = true;
                    iMin = java.lang.Math.min(i6, i10);
                    z4 = z3;
                }
                int iMax = (z5 && this.c) ? i7 : java.lang.Math.max(i7, iCeil2);
                if (z4) {
                    this.f = i6 - iMin;
                }
                if (z5) {
                    this.g = iMax - i7;
                }
                fontMetricsInt.ascent = iMin;
                fontMetricsInt.descent = iMax;
                return;
            }
            return;
        }
        if (fontMetricsInt.descent - fontMetricsInt.ascent > 0) {
            boolean z6 = i2 == this.h;
            if (i == 0) {
                if (z6 && this.b && this.c) {
                    if (i5 != 2) {
                        return;
                    } else {
                        i5 = 2;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            if (this.i == Integer.MIN_VALUE) {
                int i11 = fontMetricsInt.descent - fontMetricsInt.ascent;
                int iCeil3 = (int) java.lang.Math.ceil(this.a);
                int i12 = iCeil3 - i11;
                if (i5 != 1 || i12 > 0) {
                    float fAbs2 = this.d;
                    if (fAbs2 == -1.0f) {
                        fAbs2 = java.lang.Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i12 <= 0) {
                        dCeil = java.lang.Math.ceil(i12 * fAbs2);
                    } else {
                        dCeil = java.lang.Math.ceil(i12 * (1.0f - fAbs2));
                    }
                    int i13 = fontMetricsInt.descent + ((int) dCeil);
                    this.k = i13;
                    int i14 = i13 - iCeil3;
                    this.j = i14;
                    if (i5 == 0 || i12 >= 0) {
                        if (this.b) {
                            i14 = fontMetricsInt.ascent;
                        }
                        this.i = i14;
                        this.l = this.c ? fontMetricsInt.descent : this.k;
                        this.f = fontMetricsInt.ascent - this.i;
                        this.g = this.l - fontMetricsInt.descent;
                    } else if (i5 == 2) {
                        this.i = this.b ? java.lang.Math.max(fontMetricsInt.ascent, this.j) : java.lang.Math.min(fontMetricsInt.ascent, this.j);
                        this.l = this.c ? java.lang.Math.min(fontMetricsInt.descent, this.k) : java.lang.Math.max(fontMetricsInt.descent, this.k);
                        this.f = 0;
                        this.g = 0;
                    }
                } else {
                    this.j = fontMetricsInt.ascent;
                    int i15 = fontMetricsInt.descent;
                    this.k = i15;
                    this.i = this.j;
                    this.l = i15;
                    this.f = 0;
                    this.g = 0;
                }
            }
            fontMetricsInt.ascent = z ? this.i : this.j;
            fontMetricsInt.descent = z6 ? this.l : this.k;
        }
    }
}
