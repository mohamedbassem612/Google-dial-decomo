package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hak implements defpackage.hai, defpackage.hay, defpackage.hao {
    float a;
    private final android.graphics.Path b;
    private final android.graphics.Paint c;
    private final defpackage.hef d;
    private final java.lang.String e;
    private final boolean f;
    private final java.util.List g;
    private final defpackage.hbd h;
    private final defpackage.hbd i;
    private defpackage.hbd j;
    private final defpackage.gzs k;
    private defpackage.hbd l;
    private defpackage.hbg m;

    public hak(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdz hdzVar) {
        android.graphics.Path path = new android.graphics.Path();
        this.b = path;
        defpackage.hae haeVar = new defpackage.hae(1);
        this.c = haeVar;
        this.g = new java.util.ArrayList();
        this.d = hefVar;
        this.e = hdzVar.b;
        this.f = hdzVar.e;
        this.k = gzsVar;
        if (hefVar.q() != null) {
            defpackage.hbd hbdVarA = ((defpackage.hdb) hefVar.q().a).a();
            this.l = hbdVarA;
            hbdVarA.h(this);
            hefVar.i(this.l);
        }
        if (hefVar.r() != null) {
            this.m = new defpackage.hbg(this, hefVar, hefVar.r());
        }
        android.graphics.BlendMode blendModeM$1 = null;
        if (hdzVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        int i = hefVar.c.v - 1;
        int i2 = 0;
        if (i != 0) {
            if (i == 16) {
                i2 = 13;
            } else if (i == 2) {
                i2 = 15;
            } else if (i == 3) {
                i2 = 16;
            } else if (i == 4) {
                i2 = 17;
            } else if (i == 5) {
                i2 = 18;
            }
        }
        if (i2 != 0) {
            switch (i2 - 1) {
                case 12:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m$1();
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m$5();
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m$4();
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m$3();
                    break;
                case 16:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m$2();
                    break;
                default:
                    blendModeM$1 = fn$.ExternalSyntheticApiModelOutline0.m();
                    break;
            }
        }
        da$.ExternalSyntheticApiModelOutline0.m(haeVar, blendModeM$1);
        path.setFillType(hdzVar.a);
        defpackage.hbd hbdVarA2 = hdzVar.c.a();
        this.h = hbdVarA2;
        hbdVarA2.h(this);
        hefVar.i(hbdVarA2);
        defpackage.hbd hbdVarA3 = hdzVar.d.a();
        this.i = hbdVarA3;
        hbdVarA3.h(this);
        hefVar.i(hbdVarA3);
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbg hbgVar;
        defpackage.hbg hbgVar2;
        defpackage.hbg hbgVar3;
        defpackage.hbg hbgVar4;
        defpackage.hbg hbgVar5;
        defpackage.hbd hbdVar;
        if (obj == defpackage.gzx.a) {
            hbdVar = this.h;
        } else {
            if (obj != defpackage.gzx.d) {
                if (obj == defpackage.gzx.K) {
                    defpackage.hbd hbdVar2 = this.j;
                    if (hbdVar2 != null) {
                        this.d.k(hbdVar2);
                    }
                    if (hgpVar == null) {
                        this.j = null;
                        return;
                    }
                    defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
                    this.j = hbuVar;
                    hbuVar.h(this);
                    this.d.i(this.j);
                    return;
                }
                if (obj == defpackage.gzx.j) {
                    defpackage.hbd hbdVar3 = this.l;
                    if (hbdVar3 != null) {
                        hbdVar3.d = hgpVar;
                        return;
                    }
                    defpackage.hbu hbuVar2 = new defpackage.hbu(hgpVar, null);
                    this.l = hbuVar2;
                    hbuVar2.h(this);
                    this.d.i(this.l);
                    return;
                }
                if (obj == defpackage.gzx.e && (hbgVar5 = this.m) != null) {
                    hbgVar5.b(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.G && (hbgVar4 = this.m) != null) {
                    hbgVar4.f(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.H && (hbgVar3 = this.m) != null) {
                    hbgVar3.c(hgpVar);
                    return;
                }
                if (obj == defpackage.gzx.I && (hbgVar2 = this.m) != null) {
                    hbgVar2.e(hgpVar);
                    return;
                } else {
                    if (obj != defpackage.gzx.J || (hbgVar = this.m) == null) {
                        return;
                    }
                    hbgVar.g(hgpVar);
                    return;
                }
            }
            hbdVar = this.i;
        }
        hbdVar.d = hgpVar;
    }

    @Override // defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        defpackage.hbd hbdVar = this.h;
        defpackage.hbd hbdVar2 = this.i;
        int iK = ((defpackage.hbe) hbdVar).k();
        float fIntValue = ((java.lang.Integer) hbdVar2.e()).intValue();
        android.graphics.Paint paint = this.c;
        int i2 = defpackage.hgh.a;
        int iMin = java.lang.Math.min(255, (int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f));
        int i3 = 0;
        paint.setColor((java.lang.Math.max(0, iMin) << 24) | (iK & 16777215));
        defpackage.hbd hbdVar3 = this.j;
        if (hbdVar3 != null) {
            paint.setColorFilter((android.graphics.ColorFilter) hbdVar3.e());
        }
        defpackage.hbd hbdVar4 = this.l;
        if (hbdVar4 != null) {
            float fFloatValue = ((java.lang.Float) hbdVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        defpackage.hbg hbgVar = this.m;
        if (hbgVar != null) {
            hbgVar.a(paint);
        }
        android.graphics.Path path = this.b;
        path.reset();
        while (true) {
            java.util.List list = this.g;
            if (i3 >= list.size()) {
                canvas.drawPath(path, paint);
                return;
            } else {
                path.addPath(((defpackage.haq) list.get(i3)).i(), matrix);
                i3++;
            }
        }
    }

    @Override // defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            java.util.List list = this.g;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((defpackage.haq) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.hay
    public final void d() {
        this.k.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        for (int i = 0; i < list2.size(); i++) {
            defpackage.hag hagVar = (defpackage.hag) list2.get(i);
            if (hagVar instanceof defpackage.haq) {
                this.g.add((defpackage.haq) hagVar);
            }
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.e;
    }
}
