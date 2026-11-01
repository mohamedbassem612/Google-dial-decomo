package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gmc {
    public static final android.graphics.Matrix a = new android.graphics.Matrix();
    android.graphics.Paint b;
    android.graphics.Paint c;
    final defpackage.gma d;
    float e;
    float f;
    float g;
    float h;
    int i;
    java.lang.String j;
    java.lang.Boolean k;
    final aca l;
    private final android.graphics.Path m;
    private final android.graphics.Path n;
    private final android.graphics.Matrix o;
    private android.graphics.PathMeasure p;
    private int q;

    public gmc(defpackage.gmc gmcVar) {
        this.o = new android.graphics.Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        aca acaVar = new aca();
        this.l = acaVar;
        this.d = new defpackage.gma(gmcVar.d, acaVar);
        this.m = new android.graphics.Path(gmcVar.m);
        this.n = new android.graphics.Path(gmcVar.n);
        this.e = gmcVar.e;
        this.f = gmcVar.f;
        this.g = gmcVar.g;
        this.h = gmcVar.h;
        int i = gmcVar.q;
        this.q = 0;
        this.i = gmcVar.i;
        this.j = gmcVar.j;
        java.lang.String str = gmcVar.j;
        if (str != null) {
            acaVar.put(str, this);
        }
        this.k = gmcVar.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(defpackage.gma gmaVar, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        float f;
        android.graphics.Matrix matrix2 = gmaVar.a;
        matrix2.set(matrix);
        matrix2.preConcat(gmaVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = gmaVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            defpackage.fsu fsuVar = (defpackage.fsu) arrayList.get(i4);
            if (fsuVar instanceof defpackage.gma) {
                a((defpackage.gma) fsuVar, matrix2, canvas, i, i2);
            } else {
                if (fsuVar instanceof defpackage.gmb) {
                    defpackage.gmb gmbVar = (defpackage.gmb) fsuVar;
                    float f2 = i / this.g;
                    float f3 = i2 / this.h;
                    android.graphics.Matrix matrix3 = this.o;
                    float fMin = java.lang.Math.min(f2, f3);
                    matrix3.set(matrix2);
                    matrix3.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    boolean z = c;
                    i3 = i4;
                    float fHypot = (float) java.lang.Math.hypot(fArr[c], fArr[1]);
                    float fHypot2 = (float) java.lang.Math.hypot(fArr[2], fArr[3]);
                    float f4 = fArr[z ? 1 : 0];
                    float f5 = fArr[1];
                    float f6 = fArr[2];
                    float f7 = f4 * fArr[3];
                    float f8 = f5 * f6;
                    float fMax = java.lang.Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? java.lang.Math.abs(f7 - f8) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        android.graphics.Path path = this.m;
                        path.reset();
                        defpackage.dwo[] dwoVarArr = gmbVar.m;
                        if (dwoVarArr != null) {
                            dvf.c(dwoVarArr, path);
                        }
                        android.graphics.Path path2 = this.n;
                        path2.reset();
                        if (gmbVar.N()) {
                            path2.setFillType(gmbVar.o == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                            matrix2 = matrix2;
                        } else {
                            defpackage.glz glzVar = (defpackage.glz) gmbVar;
                            float f9 = glzVar.e;
                            if (f9 == 0.0f && glzVar.f == 1.0f) {
                                matrix2 = matrix2;
                            } else {
                                float f10 = glzVar.g;
                                float f11 = (f9 + f10) % 1.0f;
                                float f12 = (glzVar.f + f10) % 1.0f;
                                android.graphics.PathMeasure pathMeasure = this.p;
                                android.graphics.PathMeasure pathMeasure2 = pathMeasure;
                                if (pathMeasure == null) {
                                    android.graphics.PathMeasure pathMeasure3 = new android.graphics.PathMeasure();
                                    this.p = pathMeasure3;
                                    pathMeasure2 = pathMeasure3;
                                }
                                pathMeasure2.setPath(path, z);
                                float length = this.p.getLength();
                                float f13 = f11 * length;
                                float f14 = f12 * length;
                                path.reset();
                                android.graphics.PathMeasure pathMeasure4 = this.p;
                                if (f13 > f14) {
                                    pathMeasure4.getSegment(f13, length, path, true);
                                    f = 0.0f;
                                    this.p.getSegment(0.0f, f14, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure4.getSegment(f13, f14, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix3);
                            if (glzVar.l.i()) {
                                akbx akbxVar = glzVar.l;
                                if (this.c == null) {
                                    android.graphics.Paint paint = new android.graphics.Paint(1);
                                    this.c = paint;
                                    paint.setStyle(android.graphics.Paint.Style.FILL);
                                }
                                android.graphics.Paint paint2 = this.c;
                                if (akbxVar.f()) {
                                    android.graphics.Shader shader = (android.graphics.Shader) akbxVar.a;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(java.lang.Math.round(glzVar.d * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    paint2.setColor(gmf.a(akbxVar.b, glzVar.d));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(glzVar.o == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            if (glzVar.k.i()) {
                                akbx akbxVar2 = glzVar.k;
                                if (this.b == null) {
                                    android.graphics.Paint paint3 = new android.graphics.Paint(1);
                                    this.b = paint3;
                                    paint3.setStyle(android.graphics.Paint.Style.STROKE);
                                }
                                android.graphics.Paint paint4 = this.b;
                                android.graphics.Paint.Join join = glzVar.i;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                android.graphics.Paint.Cap cap = glzVar.h;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(glzVar.j);
                                if (akbxVar2.f()) {
                                    android.graphics.Shader shader2 = (android.graphics.Shader) akbxVar2.a;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(java.lang.Math.round(glzVar.c * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    paint4.setColor(gmf.a(akbxVar2.b, glzVar.c));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(glzVar.b * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    } else {
                        matrix2 = matrix2;
                    }
                }
                i4 = i3 + 1;
                matrix2 = matrix2;
                c = 0;
            }
            matrix2 = matrix2;
            i3 = i4;
            i4 = i3 + 1;
            matrix2 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public gmc() {
        this.o = new android.graphics.Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new aca();
        this.d = new defpackage.gma();
        this.m = new android.graphics.Path();
        this.n = new android.graphics.Path();
    }
}
