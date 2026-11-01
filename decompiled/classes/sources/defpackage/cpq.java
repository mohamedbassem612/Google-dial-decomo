package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpq implements defpackage.cqf {
    public android.graphics.Canvas a = defpackage.cpr.a;
    private android.graphics.Rect b;
    private android.graphics.Rect c;

    @Override // defpackage.cqf
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.cqf
    public final void b(float[] fArr) {
        if (defpackage.cfd.I(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        defpackage.cdh.o(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.cqf
    public final void c() {
        da$.ExternalSyntheticApiModelOutline0.m(this.a);
    }

    @Override // defpackage.cqf
    public final void d() {
        da$.ExternalSyntheticApiModelOutline0.m$1(this.a);
    }

    @Override // defpackage.cqf
    public final void e() {
        this.a.restore();
    }

    @Override // defpackage.cqf
    public final void f(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.cqf
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.cqf
    public final void h(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.cqf
    public final void i(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.cqf
    public final void j(long j, float f, defpackage.cpv cpvVar) {
        this.a.drawCircle(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), f, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void k(long j, long j2, defpackage.cpv cpvVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void l(float f, float f2, float f3, float f4, defpackage.cpv cpvVar) {
        this.a.drawRect(f, f2, f3, f4, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void m(float f, float f2, float f3, float f4, float f5, float f6, defpackage.cpv cpvVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void n(float f, float f2, float f3, float f4, float f5, float f6, defpackage.cpv cpvVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final /* synthetic */ void o(defpackage.cpn cpnVar) {
        defpackage.cqp.d(this, cpnVar);
    }

    @Override // defpackage.cqf
    public final void p(defpackage.cpx cpxVar, defpackage.cpv cpvVar) {
        boolean z = cpxVar instanceof defpackage.cpx;
        android.graphics.Canvas canvas = this.a;
        if (!z) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(cpxVar.a, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void q(defpackage.cpx cpxVar) {
        boolean z = cpxVar instanceof defpackage.cpx;
        android.graphics.Canvas canvas = this.a;
        if (!z) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(cpxVar.a, android.graphics.Region.Op.INTERSECT);
    }

    @Override // defpackage.cqf
    public final void r(defpackage.cpu cpuVar, defpackage.cpv cpvVar) {
        this.a.drawBitmap(defpackage.rz.h(cpuVar), 0.0f, 0.0f, defpackage.cdh.n(cpvVar));
    }

    @Override // defpackage.cqf
    public final void s(defpackage.cpu cpuVar, long j, long j2, defpackage.cpv cpvVar) {
        if (this.b == null) {
            this.b = new android.graphics.Rect();
            this.c = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.a;
        android.graphics.Bitmap bitmapH = defpackage.rz.h(cpuVar);
        android.graphics.Rect rect = this.b;
        if (rect == null) {
            defpackage.aooh.g();
        }
        rect.left = 0;
        rect.top = 0;
        rect.right = (int) (j >> 32);
        rect.bottom = (int) (j & 4294967295L);
        android.graphics.Rect rect2 = this.c;
        if (rect2 == null) {
            defpackage.aooh.g();
        }
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j2 >> 32);
        rect2.bottom = (int) (j2 & 4294967295L);
        canvas.drawBitmap(bitmapH, rect, rect2, defpackage.cdh.n(cpvVar));
    }
}
