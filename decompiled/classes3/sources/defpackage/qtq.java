package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtq {
    private static final aimz f = aimz.i("com/android/dialer/incall/video/view/VideoScale");
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final j$.util.Optional e;

    public qtq(float f2, float f3, int i, float f4, j$.util.Optional optional) {
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.d = f4;
        this.e = optional;
    }

    public static defpackage.qto b() {
        defpackage.qto qtoVar = new defpackage.qto();
        qtoVar.c(1.0f);
        qtoVar.d(1.0f);
        qtoVar.a = 1.0f;
        qtoVar.c = (byte) (qtoVar.c | 8);
        qtoVar.b(0);
        return qtoVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    public static defpackage.qtq c(android.util.Size size, android.util.Size size2, int i, defpackage.qtp qtpVar) {
        defpackage.qtq qtqVarF;
        android.util.SizeF sizeF;
        float fMin;
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            a.bI(f.d(), "view size is zero", "com/android/dialer/incall/video/view/VideoScale", "scaleVideo", (char) 212, "VideoScale.java", zct.b);
            return b().a();
        }
        if (size2.getWidth() == 0 || size2.getHeight() == 0) {
            a.bI(f.d(), "video size is zero", "com/android/dialer/incall/video/view/VideoScale", "scaleVideo", (char) 216, "VideoScale.java", zct.b);
            return b().a();
        }
        int i2 = i % 180;
        if (i2 == 0) {
            qtqVarF = f(size, size2);
            sizeF = new android.util.SizeF(size.getWidth() * qtqVarF.a, size.getHeight() * qtqVarF.b);
        } else {
            if ((((i ^ 180) >> 31) | 1) <= 0) {
                i2 += 180;
            }
            if (i2 == 90) {
                android.util.Size size3 = new android.util.Size(size2.getHeight(), size2.getWidth());
                defpackage.qto qtoVar = new defpackage.qto(f(size, new android.util.Size(size3.getHeight(), size3.getWidth())));
                qtoVar.b(i);
                qtqVarF = qtoVar.a();
                android.util.SizeF sizeF2 = new android.util.SizeF(size.getWidth() * qtqVarF.a, size.getHeight() * qtqVarF.b);
                sizeF = new android.util.SizeF(sizeF2.getHeight(), sizeF2.getWidth());
            } else {
                qtqVarF = f(size, size2);
                sizeF = new android.util.SizeF(size.getWidth() * qtqVarF.a, size.getHeight() * qtqVarF.b);
            }
        }
        float width = size.getWidth() / sizeF.getWidth();
        float height = size.getHeight() / sizeF.getHeight();
        int iOrdinal = qtpVar.ordinal();
        if (iOrdinal != 0) {
            fMin = iOrdinal != 1 ? 0.0f : java.lang.Math.max(width, height);
        } else {
            fMin = java.lang.Math.min(width, height);
        }
        defpackage.qto qtoVar2 = new defpackage.qto(qtqVarF);
        qtoVar2.b = j$.util.Optional.of(java.lang.Float.valueOf(fMin));
        return qtoVar2.a();
    }

    public static defpackage.qtq d(android.util.Size size, android.util.Size size2, int i) {
        return c(size, size2, i, defpackage.qtp.b);
    }

    private static defpackage.qtq f(android.util.Size size, android.util.Size size2) {
        float f2;
        float width = size.getWidth();
        float height = size.getHeight();
        float width2 = size2.getWidth();
        float height2 = size2.getHeight();
        float f3 = 1.0f;
        if (width / height > width2 / height2) {
            f2 = ((width * height2) / width2) / height;
        } else {
            float f4 = ((height * width2) / height2) / width;
            f2 = 1.0f;
            f3 = f4;
        }
        defpackage.qto qtoVarB = b();
        qtoVarB.c(f3);
        qtoVarB.d(f2);
        qtoVarB.b(0);
        return qtoVarB.a();
    }

    public final android.graphics.Matrix a(float f2, float f3) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        matrix.setScale(this.a, this.b, f4, f5);
        float f6 = this.d;
        matrix.preScale(f6, f6, 0.0f, 0.0f);
        int i = this.c;
        if (i != 0) {
            matrix.postRotate(i, f4, f5);
        }
        j$.util.Optional optional = this.e;
        if (optional.isPresent()) {
            matrix.postScale(((java.lang.Float) optional.orElseThrow()).floatValue(), ((java.lang.Float) optional.orElseThrow()).floatValue(), f4, f5);
        }
        return matrix;
    }

    public final void e(android.view.TextureView textureView) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        textureView.getTransform(matrix);
        android.graphics.Matrix matrixA = a(textureView.getWidth(), textureView.getHeight());
        if (!matrix.equals(matrixA)) {
            f.b().l("com/android/dialer/incall/video/view/VideoScale", "apply", 75, "VideoScale.java").Q("applying transform: sx: %f, sy: %f, preScaleFactor: %f, rotation: %d, width: %d, height: %d, matrix: %s", java.lang.Float.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.d), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(textureView.getWidth()), java.lang.Integer.valueOf(textureView.getHeight()), matrixA.toShortString());
        }
        textureView.setTransform(matrixA);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qtq) {
            defpackage.qtq qtqVar = (defpackage.qtq) obj;
            if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(qtqVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(qtqVar.b) && this.c == qtqVar.c) {
                    if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(qtqVar.d) && this.e.equals(qtqVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((java.lang.Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003) ^ java.lang.Float.floatToIntBits(this.d)) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "VideoScale{scaleX=" + this.a + ", scaleY=" + this.b + ", rotationDegrees=" + this.c + ", preScaleFactor=" + this.d + ", postScaleFactor=" + java.lang.String.valueOf(this.e) + '}';
    }

    public qtq() {
        throw null;
    }
}
