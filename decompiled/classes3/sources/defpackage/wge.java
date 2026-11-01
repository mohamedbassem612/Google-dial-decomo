package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wge {
    final android.graphics.RectF a = new android.graphics.RectF();
    public final android.graphics.Matrix b = new android.graphics.Matrix();
    public final android.graphics.Path c = new android.graphics.Path();
    public final android.graphics.Path d = new android.graphics.Path();
    public float e;
    public float f;
    public android.graphics.Paint.Cap g;

    public final void a(android.graphics.Path path, defpackage.wgd wgdVar, float f, float f2, float f3) {
        path.reset();
        float fMin = java.lang.Math.min(f3, 1.0f) * f;
        if (f2 > 0.0f) {
            float f4 = (-0.5f) + f3;
            fMin += java.lang.Math.max(f2 - (((f4 * f4) * f2) * 5.0f), 0.0f);
        }
        float f5 = wgdVar.e;
        float f6 = f5 + 18.849556f;
        float f7 = ((wgdVar.f + f6) - f) * f3;
        if (f7 < f5) {
            float fMin2 = java.lang.Math.min(f7 + fMin, f5);
            path.moveTo(0.0f, f7);
            path.lineTo(0.0f, fMin2);
            fMin -= fMin2 - f7;
        }
        if (f7 < f6 && fMin > 0.0f) {
            float fMax = java.lang.Math.max(0.0f, f7 - f5);
            float fMin3 = java.lang.Math.min(18.849556f, fMax + fMin);
            float f8 = (fMax * 180.0f) / 18.849556f;
            float f9 = (fMin3 * 180.0f) / 18.849556f;
            boolean z = wgdVar.g;
            if (!z) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            android.graphics.RectF rectF = this.a;
            rectF.set(-6.0f, -6.0f, 6.0f, 6.0f);
            rectF.offset(true != z ? 6.0f : -6.0f, f5);
            path.addArc(rectF, f8, f9 - f8);
            fMin -= fMin3 - fMax;
        }
        if (fMin > 0.0f) {
            float f10 = true != wgdVar.g ? 12.0f : -12.0f;
            path.moveTo(f10, f5);
            path.lineTo(f10, f5 - fMin);
        }
    }
}
