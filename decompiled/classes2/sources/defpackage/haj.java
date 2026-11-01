package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class haj implements defpackage.haq, defpackage.hay, defpackage.hao {
    private final java.lang.String b;
    private final defpackage.gzs c;
    private final defpackage.hbd d;
    private final defpackage.hbd e;
    private final defpackage.hdn f;
    private boolean g;
    private final android.graphics.Path a = new android.graphics.Path();
    private final defpackage.heq h = new defpackage.heq();

    public haj(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdn hdnVar) {
        this.b = hdnVar.a;
        this.c = gzsVar;
        defpackage.hbd hbdVarA = hdnVar.c.a();
        this.d = hbdVarA;
        defpackage.hbd hbdVarA2 = hdnVar.b.a();
        this.e = hbdVarA2;
        this.f = hdnVar;
        hefVar.i(hbdVarA);
        hefVar.i(hbdVarA2);
        hbdVarA.h(this);
        hbdVarA2.h(this);
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbd hbdVar;
        if (obj == defpackage.gzx.k) {
            hbdVar = this.d;
        } else if (obj != defpackage.gzx.n) {
            return;
        } else {
            hbdVar = this.e;
        }
        hbdVar.d = hgpVar;
    }

    @Override // defpackage.hay
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        for (int i = 0; i < list.size(); i++) {
            defpackage.hag hagVar = (defpackage.hag) list.get(i);
            if (hagVar instanceof defpackage.hax) {
                defpackage.hax haxVar = (defpackage.hax) hagVar;
                if (haxVar.e == 1) {
                    this.h.d(haxVar);
                    haxVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.b;
    }

    @Override // defpackage.haq
    public final android.graphics.Path i() {
        boolean z = this.g;
        android.graphics.Path path = this.a;
        if (!z) {
            path.reset();
            defpackage.hdn hdnVar = this.f;
            if (hdnVar.e) {
                this.g = true;
                return path;
            }
            android.graphics.PointF pointF = (android.graphics.PointF) this.d.e();
            float f = pointF.x / 2.0f;
            float f2 = pointF.y / 2.0f;
            path.reset();
            float f3 = f2 * 0.55228f;
            float f4 = -f;
            float f5 = -f3;
            float f6 = f3 + 0.0f;
            float f7 = 0.55228f * f;
            float f8 = -f7;
            float f9 = f7 + 0.0f;
            float f10 = -f2;
            if (hdnVar.d) {
                path.moveTo(0.0f, f10);
                path.cubicTo(f8, f10, f4, f5, f4, 0.0f);
                path.cubicTo(f4, f6, f8, f2, 0.0f, f2);
                path.cubicTo(f9, f2, f, f6, f, 0.0f);
                path.cubicTo(f, f5, f9, f10, 0.0f, f10);
            } else {
                path.moveTo(0.0f, f10);
                path.cubicTo(f9, f10, f, f5, f, 0.0f);
                path.cubicTo(f, f6, f9, f2, 0.0f, f2);
                path.cubicTo(f8, f2, f4, f6, f4, 0.0f);
                path.cubicTo(f4, f5, f8, f10, 0.0f, f10);
            }
            android.graphics.PointF pointF2 = (android.graphics.PointF) this.e.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
            this.h.e(path);
            this.g = true;
        }
        return path;
    }
}
