package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftl {
    public java.lang.CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    public final defpackage.esr a() {
        android.text.Layout.Alignment alignment;
        float f = this.h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        defpackage.esr esrVar = new defpackage.esr();
        int i4 = this.d;
        if (i4 == 1) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            defpackage.etr.f("WebvttCueParser", a.bj(i4, "Unknown textAlignment: "));
            alignment = null;
        } else {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        esrVar.b = alignment;
        float f3 = this.e;
        int i5 = this.f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        esrVar.c(f2, i5);
        esrVar.d = this.g;
        esrVar.e = f;
        esrVar.f = i2;
        float f4 = this.j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(i2));
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        esrVar.g = java.lang.Math.min(f4, f);
        esrVar.j = this.k;
        java.lang.CharSequence charSequence = this.c;
        if (charSequence != null) {
            esrVar.d(charSequence);
        }
        return esrVar;
    }
}
