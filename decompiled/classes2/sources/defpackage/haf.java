package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class haf implements defpackage.hay, defpackage.hao, defpackage.hai {
    protected final defpackage.hef a;
    final android.graphics.Paint b;
    float c;
    private final defpackage.gzs h;
    private final float[] j;
    private final defpackage.hbd k;
    private final defpackage.hbd l;
    private final java.util.List m;
    private final defpackage.hbd n;
    private defpackage.hbd o;
    private defpackage.hbd p;
    private defpackage.hbg q;
    private final android.graphics.PathMeasure d = new android.graphics.PathMeasure();
    private final android.graphics.Path e = new android.graphics.Path();
    private final android.graphics.Path f = new android.graphics.Path();
    private final android.graphics.RectF g = new android.graphics.RectF();
    private final java.util.List i = new java.util.ArrayList();

    public haf(defpackage.gzs gzsVar, defpackage.hef hefVar, android.graphics.Paint.Cap cap, android.graphics.Paint.Join join, float f, defpackage.hdd hddVar, defpackage.hdb hdbVar, java.util.List list, defpackage.hdb hdbVar2) {
        defpackage.hae haeVar = new defpackage.hae(1);
        this.b = haeVar;
        this.c = 0.0f;
        this.h = gzsVar;
        this.a = hefVar;
        haeVar.setStyle(android.graphics.Paint.Style.STROKE);
        haeVar.setStrokeCap(cap);
        haeVar.setStrokeJoin(join);
        haeVar.setStrokeMiter(f);
        this.l = hddVar.a();
        this.k = hdbVar.a();
        if (hdbVar2 == null) {
            this.n = null;
        } else {
            this.n = hdbVar2.a();
        }
        this.m = new java.util.ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((defpackage.hdb) list.get(i)).a());
        }
        hefVar.i(this.l);
        hefVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            hefVar.i((defpackage.hbd) this.m.get(i2));
        }
        defpackage.hbd hbdVar = this.n;
        if (hbdVar != null) {
            hefVar.i(hbdVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((defpackage.hbd) this.m.get(i3)).h(this);
        }
        defpackage.hbd hbdVar2 = this.n;
        if (hbdVar2 != null) {
            hbdVar2.h(this);
        }
        if (hefVar.q() != null) {
            defpackage.hbd hbdVarA = ((defpackage.hdb) hefVar.q().a).a();
            this.p = hbdVarA;
            hbdVarA.h(this);
            hefVar.i(this.p);
        }
        if (hefVar.r() != null) {
            this.q = new defpackage.hbg(this, hefVar, hefVar.r());
        }
    }

    @Override // defpackage.hcx
    public void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbg hbgVar;
        defpackage.hbg hbgVar2;
        defpackage.hbg hbgVar3;
        defpackage.hbg hbgVar4;
        defpackage.hbg hbgVar5;
        defpackage.hbd hbdVar;
        if (obj == defpackage.gzx.d) {
            hbdVar = this.l;
        } else {
            if (obj != defpackage.gzx.s) {
                if (obj == defpackage.gzx.K) {
                    defpackage.hbd hbdVar2 = this.o;
                    if (hbdVar2 != null) {
                        this.a.k(hbdVar2);
                    }
                    if (hgpVar == null) {
                        this.o = null;
                        return;
                    }
                    defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
                    this.o = hbuVar;
                    hbuVar.h(this);
                    this.a.i(this.o);
                    return;
                }
                if (obj == defpackage.gzx.j) {
                    defpackage.hbd hbdVar3 = this.p;
                    if (hbdVar3 != null) {
                        hbdVar3.d = hgpVar;
                        return;
                    }
                    defpackage.hbu hbuVar2 = new defpackage.hbu(hgpVar, null);
                    this.p = hbuVar2;
                    hbuVar2.h(this);
                    this.a.i(this.p);
                    return;
                }
                if (obj == defpackage.gzx.e && (hbgVar5 = this.q) != null) {
                    hbgVar5.b(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.G && (hbgVar4 = this.q) != null) {
                    hbgVar4.f(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.H && (hbgVar3 = this.q) != null) {
                    hbgVar3.c(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.I && (hbgVar2 = this.q) != null) {
                    hbgVar2.e(hgpVar);
                    return;
                } else {
                    if (obj != defpackage.gzx.J || (hbgVar = this.q) == null) {
                        return;
                    }
                    hbgVar.g(hgpVar);
                    return;
                }
            }
            hbdVar = this.k;
        }
        hbdVar.d = hgpVar;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hai
    public void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        float[] fArr = (float[]) defpackage.hgm.a.get();
        boolean z = false;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return;
        }
        defpackage.hbj hbjVar = (defpackage.hbj) this.l;
        float fK = hbjVar.k(hbjVar.d(), hbjVar.b());
        android.graphics.Paint paint = this.b;
        int i2 = defpackage.hgh.a;
        float f2 = (i / 255.0f) * fK;
        float f3 = 100.0f;
        paint.setAlpha(java.lang.Math.max(0, java.lang.Math.min(255, (int) ((f2 / 100.0f) * 255.0f))));
        paint.setStrokeWidth(((defpackage.hbh) this.k).k() * defpackage.hgm.c(matrix));
        if (paint.getStrokeWidth() <= 0.0f) {
            return;
        }
        java.util.List list = this.m;
        if (!list.isEmpty()) {
            float fC = defpackage.hgm.c(matrix);
            for (int i3 = 0; i3 < list.size(); i3++) {
                float[] fArr2 = this.j;
                float fFloatValue = ((java.lang.Float) ((defpackage.hbd) list.get(i3)).e()).floatValue();
                fArr2[i3] = fFloatValue;
                if (i3 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr2[i3] = 1.0f;
                        fFloatValue = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr2[i3] = 0.1f;
                    fFloatValue = 0.1f;
                }
                fArr2[i3] = fFloatValue * fC;
            }
            defpackage.hbd hbdVar = this.n;
            paint.setPathEffect(new android.graphics.DashPathEffect(this.j, hbdVar == null ? 0.0f : ((java.lang.Float) hbdVar.e()).floatValue() * fC));
        }
        defpackage.hbd hbdVar2 = this.o;
        if (hbdVar2 != null) {
            paint.setColorFilter((android.graphics.ColorFilter) hbdVar2.e());
        }
        defpackage.hbd hbdVar3 = this.p;
        if (hbdVar3 != null) {
            float fFloatValue2 = ((java.lang.Float) hbdVar3.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue2 != this.c) {
                paint.setMaskFilter(this.a.h(fFloatValue2));
            }
            this.c = fFloatValue2;
        }
        defpackage.hbg hbgVar = this.q;
        if (hbgVar != null) {
            hbgVar.a(paint);
        }
        int i4 = 0;
        while (true) {
            java.util.List list2 = this.i;
            if (i4 >= list2.size()) {
                return;
            }
            ils ilsVar = (ils) list2.get(i4);
            java.lang.Object obj = ilsVar.b;
            android.graphics.Path path = this.e;
            if (obj != null) {
                path.reset();
                ?? r7 = ilsVar.a;
                int size = r7.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        path.addPath(((defpackage.haq) r7.get(size)).i(), matrix);
                    }
                }
                defpackage.hax haxVar = (defpackage.hax) obj;
                float fFloatValue3 = ((java.lang.Float) haxVar.b.e()).floatValue() / f3;
                float fFloatValue4 = ((java.lang.Float) haxVar.c.e()).floatValue() / f3;
                float fFloatValue5 = ((java.lang.Float) haxVar.d.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    android.graphics.PathMeasure pathMeasure = this.d;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f4 = fFloatValue5 * length;
                    float f5 = (fFloatValue3 * length) + f4;
                    float fMin = java.lang.Math.min((fFloatValue4 * length) + f4, (f5 + length) - 1.0f);
                    int size2 = r7.size() - 1;
                    float f6 = f;
                    while (size2 >= 0) {
                        android.graphics.Path path2 = this.f;
                        path2.set(((defpackage.haq) r7.get(size2)).i());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        float f7 = f6 + length2;
                        if (fMin > length) {
                            float f8 = fMin - length;
                            if (f8 < f7 && f6 < f8) {
                                defpackage.hgm.e(path2, f5 > length ? (f5 - length) / length2 : 0.0f, java.lang.Math.min(f8 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, paint);
                            } else if (f7 < f5 && f6 <= fMin) {
                                if (f7 > fMin || f5 >= f6) {
                                    float f9 = f5 < f6 ? 0.0f : (f5 - f6) / length2;
                                    float f10 = fMin > f7 ? 1.0f : (fMin - f6) / length2;
                                    f = 0.0f;
                                    defpackage.hgm.e(path2, f9, f10, 0.0f);
                                    canvas.drawPath(path2, paint);
                                } else {
                                    canvas.drawPath(path2, paint);
                                }
                            }
                        } else {
                            f = f7 < f5 ? 0.0f : 0.0f;
                        }
                        size2--;
                        f6 = f7;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                path.reset();
                ?? r4 = ilsVar.a;
                int size3 = r4.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    } else {
                        path.addPath(((defpackage.haq) r4.get(size3)).i(), matrix);
                    }
                }
                canvas.drawPath(path, paint);
            }
            i4++;
            z = false;
            f3 = 100.0f;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            java.util.List list = this.i;
            if (i >= list.size()) {
                android.graphics.RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((defpackage.hbh) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            ils ilsVar = (ils) list.get(i);
            int i2 = 0;
            while (true) {
                ?? r4 = ilsVar.a;
                if (i2 < r4.size()) {
                    path.addPath(((defpackage.haq) r4.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.hay
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        ils ilsVar = null;
        defpackage.hax haxVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            defpackage.hag hagVar = (defpackage.hag) list.get(size);
            if (hagVar instanceof defpackage.hax) {
                defpackage.hax haxVar2 = (defpackage.hax) hagVar;
                if (haxVar2.e == 2) {
                    haxVar = haxVar2;
                }
            }
        }
        if (haxVar != null) {
            haxVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            defpackage.hag hagVar2 = (defpackage.hag) list2.get(size2);
            if (hagVar2 instanceof defpackage.hax) {
                defpackage.hax haxVar3 = (defpackage.hax) hagVar2;
                if (haxVar3.e == 2) {
                    if (ilsVar != null) {
                        this.i.add(ilsVar);
                    }
                    ils ilsVar2 = new ils(haxVar3);
                    haxVar3.a(this);
                    ilsVar = ilsVar2;
                }
            }
            if (hagVar2 instanceof defpackage.haq) {
                if (ilsVar == null) {
                    ilsVar = new ils(haxVar);
                }
                ilsVar.a.add((defpackage.haq) hagVar2);
            }
        }
        if (ilsVar != null) {
            this.i.add(ilsVar);
        }
    }
}
