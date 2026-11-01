package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbq extends defpackage.hbd {
    protected defpackage.hgp e;
    protected defpackage.hgp f;
    private final android.graphics.PointF g;
    private final android.graphics.PointF h;
    private final defpackage.hbd i;
    private final defpackage.hbd j;

    public hbq(defpackage.hbd hbdVar, defpackage.hbd hbdVar2) {
        super(java.util.Collections.EMPTY_LIST);
        this.g = new android.graphics.PointF();
        this.h = new android.graphics.PointF();
        this.i = hbdVar;
        this.j = hbdVar2;
        j(this.c);
    }

    @Override // defpackage.hbd
    public final /* synthetic */ java.lang.Object e() {
        return k(0.0f);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return k(f);
    }

    @Override // defpackage.hbd
    public final void j(float f) {
        defpackage.hbd hbdVar = this.i;
        hbdVar.j(f);
        defpackage.hbd hbdVar2 = this.j;
        hbdVar2.j(f);
        this.g.set(((java.lang.Float) hbdVar.e()).floatValue(), ((java.lang.Float) hbdVar2.e()).floatValue());
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.hay) list.get(i)).d();
            i++;
        }
    }

    final android.graphics.PointF k(float f) {
        float f2;
        java.lang.Float f3;
        defpackage.hbd hbdVar;
        defpackage.hgn hgnVarD;
        defpackage.hbd hbdVar2;
        defpackage.hgn hgnVarD2;
        java.lang.Float f4 = null;
        if (this.e == null || (hgnVarD2 = (hbdVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = hbdVar2.b();
            java.lang.Float f5 = hgnVarD2.h;
            f2 = f;
            f3 = (java.lang.Float) this.e.b(hgnVarD2.g, f5 == null ? hgnVarD2.g : f5.floatValue(), (java.lang.Float) hgnVarD2.b, (java.lang.Float) hgnVarD2.c, f, f, fB);
        }
        if (this.f != null && (hgnVarD = (hbdVar = this.j).d()) != null) {
            float fB2 = hbdVar.b();
            java.lang.Float f6 = hgnVarD.h;
            f4 = (java.lang.Float) this.f.b(hgnVarD.g, f6 == null ? hgnVarD.g : f6.floatValue(), (java.lang.Float) hgnVarD.b, (java.lang.Float) hgnVarD.c, f2, f2, fB2);
        }
        android.graphics.PointF pointF = this.h;
        if (f3 == null) {
            pointF.set(this.g.x, 0.0f);
        } else {
            pointF.set(f3.floatValue(), 0.0f);
        }
        android.graphics.PointF pointF2 = this.h;
        if (f4 == null) {
            pointF2.set(pointF2.x, this.g.y);
        } else {
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
