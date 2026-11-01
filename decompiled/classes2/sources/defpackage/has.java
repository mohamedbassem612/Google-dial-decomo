package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class has implements defpackage.hay, defpackage.hao, defpackage.haq {
    private final java.lang.String c;
    private final boolean d;
    private final defpackage.gzs e;
    private final defpackage.hbd f;
    private final defpackage.hbd g;
    private final defpackage.hbd h;
    private boolean j;
    private final android.graphics.Path a = new android.graphics.Path();
    private final android.graphics.RectF b = new android.graphics.RectF();
    private final defpackage.heq k = new defpackage.heq();
    private defpackage.hbd i = null;

    public has(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdv hdvVar) {
        this.c = hdvVar.a;
        this.d = hdvVar.e;
        this.e = gzsVar;
        defpackage.hbd hbdVarA = hdvVar.b.a();
        this.f = hbdVarA;
        defpackage.hbd hbdVarA2 = hdvVar.c.a();
        this.g = hbdVarA2;
        defpackage.hbd hbdVarA3 = hdvVar.d.a();
        this.h = hbdVarA3;
        hefVar.i(hbdVarA);
        hefVar.i(hbdVarA2);
        hefVar.i(hbdVarA3);
        hbdVarA.h(this);
        hbdVarA2.h(this);
        hbdVarA3.h(this);
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbd hbdVar;
        if (obj == defpackage.gzx.l) {
            hbdVar = this.g;
        } else if (obj == defpackage.gzx.n) {
            hbdVar = this.f;
        } else if (obj != defpackage.gzx.m) {
            return;
        } else {
            hbdVar = this.h;
        }
        hbdVar.d = hgpVar;
    }

    @Override // defpackage.hay
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c A[SYNTHETIC] */
    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        for (int i = 0; i < list.size(); i++) {
            defpackage.hag hagVar = (defpackage.hag) list.get(i);
            if (hagVar instanceof defpackage.hax) {
                defpackage.hax haxVar = (defpackage.hax) hagVar;
                if (haxVar.e == 1) {
                    this.k.d(haxVar);
                    haxVar.a(this);
                } else if (hagVar instanceof defpackage.hau) {
                    this.i = ((defpackage.hau) hagVar).a;
                }
            } else if (hagVar instanceof defpackage.hau) {
                this.i = ((defpackage.hau) hagVar).a;
            }
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.c;
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        defpackage.hbd hbdVar;
        boolean z = this.j;
        android.graphics.Path path = this.a;
        if (!z) {
            path.reset();
            if (this.d) {
                this.j = true;
                return path;
            }
            android.graphics.PointF pointF = (android.graphics.PointF) this.g.e();
            float f = pointF.x / 2.0f;
            float f2 = pointF.y / 2.0f;
            float fK = ((defpackage.hbh) this.h).k();
            if (fK == 0.0f && (hbdVar = this.i) != null) {
                fK = java.lang.Math.min(((java.lang.Float) hbdVar.e()).floatValue(), java.lang.Math.min(f, f2));
            }
            float fMin = java.lang.Math.min(f, f2);
            if (fK > fMin) {
                fK = fMin;
            }
            android.graphics.PointF pointF2 = (android.graphics.PointF) this.f.e();
            path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
            path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
            if (fK > 0.0f) {
                float f3 = fK + fK;
                android.graphics.RectF rectF = this.b;
                rectF.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
                path.arcTo(rectF, 0.0f, 90.0f, false);
            }
            path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
            if (fK > 0.0f) {
                float f4 = fK + fK;
                android.graphics.RectF rectF2 = this.b;
                rectF2.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
                path.arcTo(rectF2, 90.0f, 90.0f, false);
            }
            path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
            if (fK > 0.0f) {
                float f5 = fK + fK;
                android.graphics.RectF rectF3 = this.b;
                rectF3.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
                path.arcTo(rectF3, 180.0f, 90.0f, false);
            }
            path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
            if (fK > 0.0f) {
                float f6 = fK + fK;
                android.graphics.RectF rectF4 = this.b;
                rectF4.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
            }
            path.close();
            this.k.e(path);
            this.j = true;
        }
        return path;
    }
}
