package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yiz implements defpackage.yhp {
    final android.graphics.Path a;
    float b;
    float c;

    public yiz(defpackage.yjh yjhVar, defpackage.yho yhoVar) {
        j$.util.Objects.requireNonNull(yjhVar);
        this.a = new android.graphics.Path();
        if (yhoVar != null) {
            yhoVar.e(this);
        }
    }

    @Override // defpackage.yhp
    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        defpackage.yjh.c(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // defpackage.yhp
    public final void c() {
        this.a.close();
    }

    @Override // defpackage.yhp
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // defpackage.yhp
    public final void f(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.yhp
    public final void g(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.yhp
    public final void h(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }
}
