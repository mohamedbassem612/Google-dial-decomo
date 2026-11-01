package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class hef implements defpackage.hai, defpackage.hay, defpackage.hcx {
    final android.graphics.Matrix a;
    final defpackage.gzs b;
    public final defpackage.hei c;
    public defpackage.hbh d;
    public defpackage.hef e;
    public defpackage.hef f;
    final defpackage.hbt g;
    float h;
    android.graphics.BlurMaskFilter i;
    private final android.graphics.Path j = new android.graphics.Path();
    private final android.graphics.Matrix k = new android.graphics.Matrix();
    private final android.graphics.Matrix l = new android.graphics.Matrix();
    private final android.graphics.Paint m = new defpackage.hae(1);
    private final android.graphics.Paint n = new defpackage.hae(android.graphics.PorterDuff.Mode.DST_IN, null);
    private final android.graphics.Paint o = new defpackage.hae(android.graphics.PorterDuff.Mode.DST_OUT, null);
    private final android.graphics.Paint p;
    private final android.graphics.Paint q;
    private final android.graphics.RectF r;
    private final android.graphics.RectF s;
    private final android.graphics.RectF t;
    private final android.graphics.RectF u;
    private final android.graphics.RectF v;
    private java.util.List w;
    private final java.util.List x;
    private boolean y;
    private izg z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.List] */
    public hef(defpackage.gzs gzsVar, defpackage.hei heiVar) {
        defpackage.hae haeVar = new defpackage.hae(1);
        this.p = haeVar;
        this.q = new defpackage.hae(android.graphics.PorterDuff.Mode.CLEAR);
        this.r = new android.graphics.RectF();
        this.s = new android.graphics.RectF();
        this.t = new android.graphics.RectF();
        this.u = new android.graphics.RectF();
        this.v = new android.graphics.RectF();
        this.a = new android.graphics.Matrix();
        this.x = new java.util.ArrayList();
        this.y = true;
        this.h = 0.0f;
        this.b = gzsVar;
        this.c = heiVar;
        java.lang.String str = heiVar.c;
        if (heiVar.u == 3) {
            haeVar.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        } else {
            haeVar.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        }
        defpackage.hbt hbtVar = new defpackage.hbt(heiVar.h);
        this.g = hbtVar;
        hbtVar.d(this);
        java.util.List list = heiVar.g;
        if (list != null && !list.isEmpty()) {
            izg izgVar = new izg(heiVar.g);
            this.z = izgVar;
            java.util.Iterator it = izgVar.b.iterator();
            while (it.hasNext()) {
                ((defpackage.hbd) it.next()).h(this);
            }
            for (defpackage.hbd hbdVar : this.z.a) {
                i(hbdVar);
                hbdVar.h(this);
            }
        }
        if (this.c.r.isEmpty()) {
            n(true);
            return;
        }
        defpackage.hbh hbhVar = new defpackage.hbh(this.c.r);
        this.d = hbhVar;
        hbhVar.b = true;
        hbhVar.h(new defpackage.hay() { // from class: hee
            @Override // defpackage.hay
            public final void d() {
                defpackage.hef hefVar = this.a;
                hefVar.n(hefVar.d.k() == 1.0f);
            }
        });
        n(((java.lang.Float) this.d.e()).floatValue() == 1.0f);
        i(this.d);
    }

    private final void s() {
        if (this.w == null) {
            if (this.f == null) {
                this.w = java.util.Collections.EMPTY_LIST;
                return;
            }
            this.w = new java.util.ArrayList();
            for (defpackage.hef hefVar = this.f; hefVar != null; hefVar = hefVar.f) {
                this.w.add(hefVar);
            }
        }
    }

    private final void t(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        defpackage.hgt hgtVar = this.b.b.n;
        java.lang.String str = this.c.c;
    }

    @Override // defpackage.hcx
    public void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        this.g.e(obj, hgpVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) throws java.lang.Throwable {
        java.lang.Throwable th;
        float f;
        android.graphics.RectF rectF;
        java.lang.Integer num;
        if (this.y) {
            defpackage.hei heiVar = this.c;
            if (heiVar.s) {
                return;
            }
            s();
            android.graphics.Matrix matrix2 = this.k;
            matrix2.reset();
            matrix2.set(matrix);
            int size = this.w.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    matrix2.preConcat(((defpackage.hef) this.w.get(size)).g.a());
                }
            }
            defpackage.hbt hbtVar = this.g;
            defpackage.hbd hbdVar = hbtVar.e;
            int iIntValue = 100;
            if (hbdVar != null && (num = (java.lang.Integer) hbdVar.e()) != null) {
                iIntValue = num.intValue();
            }
            int i2 = (int) ((((i / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            if (!p() && !o()) {
                matrix2.preConcat(hbtVar.a());
                j(canvas, matrix2, i2);
                v();
                return;
            }
            android.graphics.RectF rectF2 = this.r;
            c(rectF2, matrix2, false);
            int i3 = 3;
            if (p() && heiVar.u != 3) {
                android.graphics.RectF rectF3 = this.u;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.e.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(hbtVar.a());
            android.graphics.RectF rectF4 = this.t;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = 2;
            if (o()) {
                int size2 = this.z.c.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        th = null;
                        if (!rectF2.intersect(rectF4)) {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            break;
                        }
                    } else {
                        defpackage.hds hdsVar = (defpackage.hds) this.z.c.get(i5);
                        th = null;
                        android.graphics.Path path = (android.graphics.Path) ((defpackage.hbd) this.z.b.get(i5)).e();
                        if (path != null) {
                            android.graphics.Path path2 = this.j;
                            path2.set(path);
                            path2.transform(matrix2);
                            int i6 = hdsVar.b;
                            int i7 = i6 - 1;
                            if (i6 == 0) {
                                throw null;
                            }
                            if (i7 != 0) {
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 == i3) {
                                        }
                                        rectF = this.v;
                                        path2.computeBounds(rectF, false);
                                        if (i5 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(java.lang.Math.min(rectF4.left, rectF.left), java.lang.Math.min(rectF4.top, rectF.top), java.lang.Math.max(rectF4.right, rectF.right), java.lang.Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                    }
                                }
                            }
                            if (hdsVar.a) {
                            }
                            rectF = this.v;
                            path2.computeBounds(rectF, false);
                            if (i5 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(java.lang.Math.min(rectF4.left, rectF.left), java.lang.Math.min(rectF4.top, rectF.top), java.lang.Math.max(rectF4.right, rectF.right), java.lang.Math.max(rectF4.bottom, rectF.bottom));
                            }
                        }
                        i5++;
                        i3 = 3;
                    }
                    f = 0.0f;
                    break;
                }
            } else {
                f = 0.0f;
                th = null;
            }
            android.graphics.RectF rectF5 = this.s;
            rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
            android.graphics.Matrix matrix3 = this.l;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                android.graphics.Paint paint = this.m;
                paint.setAlpha(255);
                java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                canvas.saveLayer(rectF2, paint);
                t(canvas);
                j(canvas, matrix2, i2);
                if (o()) {
                    android.graphics.Paint paint2 = this.n;
                    canvas.saveLayer(rectF2, paint2);
                    int i8 = 0;
                    while (i8 < this.z.c.size()) {
                        defpackage.hds hdsVar2 = (defpackage.hds) this.z.c.get(i8);
                        defpackage.hbd hbdVar2 = (defpackage.hbd) this.z.b.get(i8);
                        defpackage.hbd hbdVar3 = (defpackage.hbd) this.z.a.get(i8);
                        int i9 = hdsVar2.b;
                        int i10 = i9 - 1;
                        if (i9 == 0) {
                            throw th;
                        }
                        if (i10 != 0) {
                            if (i10 == 1) {
                                if (i8 == 0) {
                                    paint.setColor(-16777216);
                                    paint.setAlpha(255);
                                    canvas.drawRect(rectF2, paint);
                                    i8 = 0;
                                }
                                if (hdsVar2.a) {
                                    android.graphics.Paint paint3 = this.o;
                                    canvas.saveLayer(rectF2, paint3);
                                    canvas.drawRect(rectF2, paint);
                                    paint3.setAlpha((int) (((java.lang.Integer) hbdVar3.e()).intValue() * 2.55f));
                                    android.graphics.Path path3 = (android.graphics.Path) hbdVar2.e();
                                    android.graphics.Path path4 = this.j;
                                    path4.set(path3);
                                    path4.transform(matrix2);
                                    canvas.drawPath(path4, paint3);
                                    canvas.restore();
                                } else {
                                    android.graphics.Path path5 = (android.graphics.Path) hbdVar2.e();
                                    android.graphics.Path path6 = this.j;
                                    path6.set(path5);
                                    path6.transform(matrix2);
                                    canvas.drawPath(path6, this.o);
                                }
                            } else if (i10 != i4) {
                                if (i10 == 3 && !this.z.b.isEmpty()) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= this.z.c.size()) {
                                            paint.setAlpha(255);
                                            canvas.drawRect(rectF2, paint);
                                            break;
                                        } else if (((defpackage.hds) this.z.c.get(i11)).b != 4) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else if (hdsVar2.a) {
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, paint);
                                android.graphics.Paint paint4 = this.o;
                                paint4.setAlpha((int) (((java.lang.Integer) hbdVar3.e()).intValue() * 2.55f));
                                android.graphics.Path path7 = (android.graphics.Path) hbdVar2.e();
                                android.graphics.Path path8 = this.j;
                                path8.set(path7);
                                path8.transform(matrix2);
                                canvas.drawPath(path8, paint4);
                                canvas.restore();
                            } else {
                                canvas.saveLayer(rectF2, paint2);
                                android.graphics.Path path9 = (android.graphics.Path) hbdVar2.e();
                                android.graphics.Path path10 = this.j;
                                path10.set(path9);
                                path10.transform(matrix2);
                                paint.setAlpha((int) (((java.lang.Integer) hbdVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path10, paint);
                                canvas.restore();
                            }
                        } else if (hdsVar2.a) {
                            canvas.saveLayer(rectF2, paint);
                            canvas.drawRect(rectF2, paint);
                            android.graphics.Path path11 = (android.graphics.Path) hbdVar2.e();
                            android.graphics.Path path12 = this.j;
                            path12.set(path11);
                            path12.transform(matrix2);
                            paint.setAlpha((int) (((java.lang.Integer) hbdVar3.e()).intValue() * 2.55f));
                            canvas.drawPath(path12, this.o);
                            canvas.restore();
                        } else {
                            android.graphics.Path path13 = (android.graphics.Path) hbdVar2.e();
                            android.graphics.Path path14 = this.j;
                            path14.set(path13);
                            path14.transform(matrix2);
                            paint.setAlpha((int) (((java.lang.Integer) hbdVar3.e()).intValue() * 2.55f));
                            canvas.drawPath(path14, paint);
                        }
                        i8++;
                        i4 = 2;
                    }
                    canvas.restore();
                }
                if (p()) {
                    canvas.saveLayer(rectF2, this.p);
                    t(canvas);
                    this.e.b(canvas, matrix, i2);
                    canvas.restore();
                }
                canvas.restore();
            }
            v();
        }
    }

    @Override // defpackage.hai
    public void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        android.graphics.Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            java.util.List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((defpackage.hef) this.w.get(size)).g.a());
                    }
                }
            } else {
                defpackage.hef hefVar = this.f;
                if (hefVar != null) {
                    matrix2.preConcat(hefVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.hay
    public final void d() {
        u();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hef hefVar = this.e;
        if (hefVar != null) {
            defpackage.hcw hcwVarB = hcwVar2.b(hefVar.g());
            if (hcwVar.d(this.e.g(), i)) {
                list.add(hcwVarB.c(this.e));
            }
            if (hcwVar.f(g(), i)) {
                this.e.l(hcwVar, hcwVar.a(this.e.g(), i) + i, list, hcwVarB);
            }
        }
        if (hcwVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                hcwVar2 = hcwVar2.b(g());
                if (hcwVar.d(g(), i)) {
                    list.add(hcwVar2.c(this));
                }
            }
            if (hcwVar.f(g(), i)) {
                l(hcwVar, i + hcwVar.a(g(), i), list, hcwVar2);
            }
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.c.c;
    }

    public final android.graphics.BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        android.graphics.BlurMaskFilter blurMaskFilter = new android.graphics.BlurMaskFilter(f / 2.0f, android.graphics.BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public final void i(defpackage.hbd hbdVar) {
        if (hbdVar != null) {
            this.x.add(hbdVar);
        }
    }

    public abstract void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i);

    public final void k(defpackage.hbd hbdVar) {
        this.x.remove(hbdVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public void m(float f) {
        defpackage.hbt hbtVar = this.g;
        defpackage.hbd hbdVar = hbtVar.e;
        if (hbdVar != null) {
            hbdVar.j(f);
        }
        defpackage.hbd hbdVar2 = hbtVar.h;
        if (hbdVar2 != null) {
            hbdVar2.j(f);
        }
        defpackage.hbd hbdVar3 = hbtVar.i;
        if (hbdVar3 != null) {
            hbdVar3.j(f);
        }
        defpackage.hbd hbdVar4 = hbtVar.a;
        if (hbdVar4 != null) {
            hbdVar4.j(f);
        }
        defpackage.hbd hbdVar5 = hbtVar.b;
        if (hbdVar5 != null) {
            hbdVar5.j(f);
        }
        defpackage.hbd hbdVar6 = hbtVar.c;
        if (hbdVar6 != null) {
            hbdVar6.j(f);
        }
        defpackage.hbd hbdVar7 = hbtVar.d;
        if (hbdVar7 != null) {
            hbdVar7.j(f);
        }
        defpackage.hbh hbhVar = hbtVar.f;
        if (hbhVar != null) {
            hbhVar.j(f);
        }
        defpackage.hbh hbhVar2 = hbtVar.g;
        if (hbhVar2 != null) {
            hbhVar2.j(f);
        }
        int i = 0;
        if (this.z != null) {
            for (int i2 = 0; i2 < this.z.b.size(); i2++) {
                ((defpackage.hbd) this.z.b.get(i2)).j(f);
            }
        }
        defpackage.hbh hbhVar3 = this.d;
        if (hbhVar3 != null) {
            hbhVar3.j(f);
        }
        defpackage.hef hefVar = this.e;
        if (hefVar != null) {
            hefVar.m(f);
        }
        while (true) {
            java.util.List list = this.x;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.hbd) list.get(i)).j(f);
            i++;
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    final boolean o() {
        izg izgVar = this.z;
        return (izgVar == null || izgVar.b.isEmpty()) ? false : true;
    }

    final boolean p() {
        return this.e != null;
    }

    public defpackage.heq q() {
        return this.c.w;
    }

    public defpackage.hwv r() {
        return this.c.x;
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
    }

    public void l(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
    }
}
