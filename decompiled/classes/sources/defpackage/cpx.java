package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpx {
    public final android.graphics.Path a;
    private android.graphics.RectF b;
    private float[] c;
    private android.graphics.Matrix d;

    public /* synthetic */ cpx(byte[] bArr) {
        this(new android.graphics.Path());
    }

    public final int a() {
        return this.a.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final defpackage.cpn b() {
        android.graphics.RectF rectF = this.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.b = rectF;
        }
        if (rectF == null) {
            defpackage.aooh.g();
        }
        this.a.computeBounds(rectF, true);
        return new defpackage.cpn(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c() {
        this.a.close();
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    public final void k() {
        this.a.reset();
    }

    public final void l() {
        this.a.rewind();
    }

    public final void m(int i) {
        this.a.setFillType(i == 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    public final void n(float[] fArr) {
        android.graphics.Matrix matrix = this.d;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.d = matrix;
        }
        if (matrix == null) {
            defpackage.aooh.g();
        }
        defpackage.cdh.o(matrix, fArr);
        android.graphics.Path path = this.a;
        android.graphics.Matrix matrix2 = this.d;
        if (matrix2 == null) {
            defpackage.aooh.g();
        }
        path.transform(matrix2);
    }

    public final void o(long j) {
        android.graphics.Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new android.graphics.Matrix();
        } else {
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.d;
        if (matrix2 == null) {
            defpackage.aooh.g();
        }
        matrix2.setTranslate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        android.graphics.Path path = this.a;
        android.graphics.Matrix matrix3 = this.d;
        if (matrix3 == null) {
            defpackage.aooh.g();
        }
        path.transform(matrix3);
    }

    public final void p(defpackage.cpn cpnVar, float f, float f2) {
        android.graphics.RectF rectF = this.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.b = rectF;
        }
        if (rectF == null) {
            defpackage.aooh.g();
        }
        float f3 = cpnVar.e;
        float f4 = cpnVar.d;
        rectF.set(cpnVar.b, cpnVar.c, f4, f3);
        android.graphics.Path path = this.a;
        android.graphics.RectF rectF2 = this.b;
        if (rectF2 == null) {
            defpackage.aooh.g();
        }
        path.arcTo(rectF2, f, f2, false);
    }

    public final void q(defpackage.cpo cpoVar, int i) {
        android.graphics.RectF rectF = this.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.b = rectF;
        }
        if (rectF == null) {
            defpackage.aooh.g();
        }
        rectF.set(cpoVar.a, cpoVar.b, cpoVar.c, cpoVar.d);
        float[] fArr = this.c;
        if (fArr == null) {
            fArr = new float[8];
            this.c = fArr;
        }
        if (fArr == null) {
            defpackage.aooh.g();
        }
        long j = cpoVar.e;
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cpoVar.f;
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cpoVar.g;
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cpoVar.h;
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L));
        android.graphics.Path path = this.a;
        android.graphics.RectF rectF2 = this.b;
        if (rectF2 == null) {
            defpackage.aooh.g();
        }
        float[] fArr2 = this.c;
        if (fArr2 == null) {
            defpackage.aooh.g();
        }
        path.addRoundRect(rectF2, fArr2, cpy.b(i));
    }

    public final boolean r(defpackage.cpx cpxVar, defpackage.cpx cpxVar2, int i) {
        android.graphics.Path.Op op;
        if (i == 0) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else {
            op = i == 1 ? android.graphics.Path.Op.INTERSECT : android.graphics.Path.Op.UNION;
        }
        android.graphics.Path path = this.a;
        if (cpxVar instanceof defpackage.cpx) {
            android.graphics.Path path2 = cpxVar.a;
            if (cpxVar2 instanceof defpackage.cpx) {
                return path.op(path2, cpxVar2.a, op);
            }
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void s(defpackage.cpx cpxVar) {
        if (!(cpxVar instanceof defpackage.cpx)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.addPath(cpxVar.a, 0.0f, 0.0f);
    }

    public final void t(defpackage.cpn cpnVar) {
        float f = cpnVar.b;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(cpnVar.c) || java.lang.Float.isNaN(cpnVar.d) || java.lang.Float.isNaN(cpnVar.e)) {
            cpy.a("Invalid rectangle, make sure no value is NaN");
        }
        android.graphics.RectF rectF = this.b;
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            this.b = rectF;
        }
        if (rectF == null) {
            defpackage.aooh.g();
        }
        rectF.set(f, cpnVar.c, cpnVar.d, cpnVar.e);
        android.graphics.Path path = this.a;
        android.graphics.RectF rectF2 = this.b;
        if (rectF2 == null) {
            defpackage.aooh.g();
        }
        path.addRect(rectF2, cpy.b(1));
    }

    public cpx(android.graphics.Path path) {
        this.a = path;
    }

    public cpx() {
        this((byte[]) null);
    }
}
