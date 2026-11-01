package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afyi {
    final defpackage.afxn a;
    final android.graphics.Path b;
    final android.graphics.Path c;
    final android.graphics.PathMeasure d;
    final android.graphics.Matrix e;

    public afyi(defpackage.afxn afxnVar) {
        android.graphics.Path path = new android.graphics.Path();
        this.b = path;
        this.c = new android.graphics.Path();
        this.d = new android.graphics.PathMeasure(path, false);
        this.a = afxnVar;
        this.e = new android.graphics.Matrix();
    }

    static final float i(float[] fArr) {
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan2(fArr[1], fArr[0]));
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2);

    public abstract void d(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2);

    public abstract void e(android.graphics.Canvas canvas, android.graphics.Paint paint, defpackage.afyg afygVar, int i);

    public abstract void f(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract void g();

    final void h(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2) {
        this.a.b();
        c(canvas, rect, f, z, z2);
    }
}
