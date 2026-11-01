package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class heg extends defpackage.hef {
    public float j;
    public boolean k;
    private defpackage.hbd l;
    private final java.util.List m;
    private final android.graphics.RectF n;
    private final android.graphics.RectF o;

    public heg(defpackage.gzs gzsVar, defpackage.hei heiVar, java.util.List list, defpackage.gzh gzhVar) {
        defpackage.hef hefVar;
        defpackage.hef hegVar;
        java.lang.String str;
        super(gzsVar, heiVar);
        this.m = new java.util.ArrayList();
        this.n = new android.graphics.RectF();
        this.o = new android.graphics.RectF();
        new android.graphics.Paint();
        this.k = true;
        defpackage.hdb hdbVar = heiVar.q;
        if (hdbVar != null) {
            defpackage.hbd hbdVarA = hdbVar.a();
            this.l = hbdVarA;
            i(hbdVarA);
            this.l.h(this);
        } else {
            this.l = null;
        }
        adb adbVar = new adb(gzhVar.h.size());
        int size = list.size() - 1;
        defpackage.hef hefVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < adbVar.b(); i++) {
                    defpackage.hef hefVar3 = (defpackage.hef) adbVar.d(adbVar.c(i));
                    if (hefVar3 != null && (hefVar = (defpackage.hef) adbVar.d(hefVar3.c.e)) != null) {
                        hefVar3.f = hefVar;
                    }
                }
                return;
            }
            defpackage.hei heiVar2 = (defpackage.hei) list.get(size);
            int i2 = heiVar2.t;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                hegVar = new defpackage.heg(gzsVar, heiVar2, (java.util.List) gzhVar.a.get(heiVar2.f), gzhVar);
            } else if (i3 == 1) {
                hegVar = new defpackage.hel(gzsVar, heiVar2);
            } else if (i3 == 2) {
                hegVar = new defpackage.heh(gzsVar, heiVar2);
            } else if (i3 == 3) {
                hegVar = new defpackage.hej(gzsVar, heiVar2);
            } else if (i3 == 4) {
                hegVar = new defpackage.hek(gzsVar, heiVar2, this, gzhVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                defpackage.hge.a("Unknown layer type ".concat(str));
                hegVar = null;
            } else {
                hegVar = new defpackage.hen(gzsVar, heiVar2);
            }
            if (hegVar != null) {
                adbVar.g(hegVar.c.d, hegVar);
                if (hefVar2 != null) {
                    hefVar2.e = hegVar;
                    hefVar2 = null;
                } else {
                    this.m.add(0, hegVar);
                    int i4 = heiVar2.u;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        hefVar2 = hegVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.hef, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.E) {
            if (hgpVar == null) {
                defpackage.hbd hbdVar = this.l;
                if (hbdVar != null) {
                    hbdVar.d = null;
                    return;
                }
                return;
            }
            defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
            this.l = hbuVar;
            hbuVar.h(this);
            i(this.l);
        }
    }

    @Override // defpackage.hef, defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        java.util.List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            android.graphics.RectF rectF2 = this.n;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((defpackage.hef) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.hef
    public final void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) throws java.lang.Throwable {
        defpackage.hei heiVar = this.c;
        float f = heiVar.n;
        android.graphics.RectF rectF = this.o;
        rectF.set(0.0f, 0.0f, f, heiVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        java.util.List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                return;
            } else if ((!this.k && "__container".equals(heiVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((defpackage.hef) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.hef
    public final void l(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        int i2 = 0;
        while (true) {
            java.util.List list2 = this.m;
            if (i2 >= list2.size()) {
                return;
            }
            ((defpackage.hef) list2.get(i2)).e(hcwVar, i, list, hcwVar2);
            i2++;
        }
    }

    @Override // defpackage.hef
    public final void m(float f) {
        this.j = f;
        super.m(f);
        if (this.l != null) {
            float fB = this.b.b.b() + 0.01f;
            defpackage.gzh gzhVar = this.c.b;
            f = ((((java.lang.Float) this.l.e()).floatValue() * gzhVar.l) - gzhVar.j) / fB;
        }
        if (this.l == null) {
            defpackage.hei heiVar = this.c;
            f -= heiVar.m / heiVar.b.b();
        }
        defpackage.hei heiVar2 = this.c;
        float f2 = heiVar2.l;
        if (f2 != 0.0f && !"__container".equals(heiVar2.c)) {
            f /= f2;
        }
        java.util.List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.hef) list.get(size)).m(f);
            }
        }
    }
}
