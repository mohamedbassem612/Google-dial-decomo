package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agap extends defpackage.agau {
    private final defpackage.agar a;

    public agap(defpackage.agar agarVar) {
        this.a = agarVar;
    }

    @Override // defpackage.agau
    public final void a(android.graphics.Matrix matrix, defpackage.afzv afzvVar, int i, android.graphics.Canvas canvas) {
        defpackage.agar agarVar = this.a;
        float f = agarVar.e;
        float f2 = agarVar.f;
        android.graphics.RectF rectF = new android.graphics.RectF(agarVar.a, agarVar.b, agarVar.c, agarVar.d);
        android.graphics.Path path = afzvVar.k;
        if (f2 < 0.0f) {
            int[] iArr = defpackage.afzv.c;
            iArr[0] = 0;
            iArr[1] = afzvVar.j;
            iArr[2] = afzvVar.i;
            iArr[3] = afzvVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = defpackage.afzv.c;
            iArr2[0] = 0;
            iArr2[1] = afzvVar.h;
            iArr2[2] = afzvVar.i;
            iArr2[3] = afzvVar.j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth > 0.0f) {
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = defpackage.afzv.d;
            fArr[1] = f4;
            fArr[2] = f4 + ((1.0f - f4) / 2.0f);
            android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, defpackage.afzv.c, fArr, android.graphics.Shader.TileMode.CLAMP);
            android.graphics.Paint paint = afzvVar.f;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (f2 >= 0.0f) {
                canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
                canvas.drawPath(path, afzvVar.l);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
