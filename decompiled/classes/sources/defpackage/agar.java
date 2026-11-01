package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agar extends defpackage.agat {
    private static final android.graphics.RectF h = new android.graphics.RectF();

    @java.lang.Deprecated
    public final float a;

    @java.lang.Deprecated
    public final float b;

    @java.lang.Deprecated
    public final float c;

    @java.lang.Deprecated
    public final float d;

    @java.lang.Deprecated
    public float e;

    @java.lang.Deprecated
    public float f;

    public agar(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.agat
    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        android.graphics.RectF rectF = h;
        rectF.set(this.a, this.b, this.c, this.d);
        path.arcTo(rectF, this.e, this.f, false);
        path.transform(matrix);
    }
}
