package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hct {
    public final android.graphics.PointF a;
    public final android.graphics.PointF b;
    public final android.graphics.PointF c;

    public hct() {
        this.a = new android.graphics.PointF();
        this.b = new android.graphics.PointF();
        this.c = new android.graphics.PointF();
    }

    public final void a(float f, float f2) {
        this.a.set(f, f2);
    }

    public final void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public final void c(float f, float f2) {
        this.c.set(f, f2);
    }

    public final java.lang.String toString() {
        android.graphics.PointF pointF = this.c;
        java.lang.Float fValueOf = java.lang.Float.valueOf(pointF.x);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(pointF.y);
        android.graphics.PointF pointF2 = this.a;
        java.lang.Float fValueOf3 = java.lang.Float.valueOf(pointF2.x);
        java.lang.Float fValueOf4 = java.lang.Float.valueOf(pointF2.y);
        android.graphics.PointF pointF3 = this.b;
        return java.lang.String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, java.lang.Float.valueOf(pointF3.x), java.lang.Float.valueOf(pointF3.y));
    }

    public hct(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
