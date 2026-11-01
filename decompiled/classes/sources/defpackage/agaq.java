package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agaq extends defpackage.agau {
    private final defpackage.agas a;
    private final float b;
    private final float e;

    public agaq(defpackage.agas agasVar, float f, float f2) {
        this.a = agasVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.agau
    public final void a(android.graphics.Matrix matrix, defpackage.afzv afzvVar, int i, android.graphics.Canvas canvas) {
        defpackage.agas agasVar = this.a;
        float f = agasVar.b;
        float f2 = this.e;
        float f3 = agasVar.a;
        float f4 = this.b;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) java.lang.Math.hypot(f - f2, f3 - f4), 0.0f);
        android.graphics.Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = defpackage.afzv.a;
        iArr[0] = afzvVar.j;
        iArr[1] = afzvVar.i;
        iArr[2] = afzvVar.h;
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, defpackage.afzv.b, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = afzvVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        defpackage.agas agasVar = this.a;
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan((agasVar.b - this.e) / (agasVar.a - this.b)));
    }
}
