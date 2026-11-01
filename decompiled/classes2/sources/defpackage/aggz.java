package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aggz extends android.graphics.drawable.Drawable {
    public float a;
    public float b;
    public float c;
    public double d;
    public float e;
    private final defpackage.ely f;
    private final android.graphics.Path g;
    private final android.graphics.Path h;
    private final android.graphics.RectF i;
    private final android.graphics.Matrix j;
    private final aoir k;

    public aggz() {
        defpackage.ely elyVarS = defpackage.avo.s(12, 1.0f, 0.8f, new defpackage.elk(0.5f, 0.0f), null, 240);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-90.0f);
        defpackage.ely elyVarD = elyVarS.d(new defpackage.elz(new float[2], matrix));
        this.f = elyVarD;
        android.graphics.Path path = new android.graphics.Path();
        aooh.f(elyVarD, "<this>");
        aokv aokvVar = elyVarD.b;
        path.rewind();
        int i = aokvVar.b;
        int i2 = 0;
        boolean z = true;
        while (i2 < i) {
            defpackage.ell ellVar = (defpackage.ell) aokvVar.get(i2);
            if (z) {
                path.moveTo(ellVar.a(), ellVar.b());
            }
            path.cubicTo(ellVar.e(), ellVar.f(), ellVar.g(), ellVar.h(), ellVar.c(), ellVar.d());
            i2++;
            z = false;
        }
        path.close();
        this.g = path;
        this.h = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.i = rectF;
        this.j = new android.graphics.Matrix();
        this.k = aooc.ag(new abna(17));
        path.computeBounds(rectF, true);
    }

    private final android.graphics.Paint c() {
        return (android.graphics.Paint) this.k.a();
    }

    public final void a(float f) {
        this.a = f;
        android.graphics.Rect bounds = getBounds();
        aooh.e(bounds, "getBounds(...)");
        b(bounds);
        invalidateSelf();
    }

    public final void b(android.graphics.Rect rect) {
        if (!rect.isEmpty()) {
            android.graphics.RectF rectF = this.i;
            if (!rectF.isEmpty()) {
                android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
                float fQ = aooc.q(rectF2.width(), rectF2.height());
                float fQ2 = aooc.q(rectF.width(), rectF.height());
                android.graphics.Matrix matrix = this.j;
                matrix.reset();
                matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
                float f = fQ / fQ2;
                matrix.postScale(f, f);
                float fCenterX = rectF2.centerX();
                float fCenterY = rectF2.centerY();
                matrix.postTranslate(fCenterX, fCenterY);
                double radians = java.lang.Math.toRadians(this.d);
                double d = fQ / 2.0f;
                float fSin = fCenterX + ((float) (java.lang.Math.sin(radians) * d));
                float fCos = fCenterY - ((float) (d * java.lang.Math.cos(radians)));
                float f2 = this.a;
                matrix.postScale(f2, f2, fSin, fCos);
                android.graphics.Path path = this.g;
                android.graphics.Path path2 = this.h;
                path.transform(matrix, path2);
                if (this.e > 0.0f) {
                    android.graphics.Path path3 = new android.graphics.Path();
                    path3.addCircle(this.b, this.c, this.e, android.graphics.Path.Direction.CW);
                    path2.op(path3, android.graphics.Path.Op.DIFFERENCE);
                    return;
                }
                return;
            }
        }
        this.h.reset();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        aooh.f(canvas, "canvas");
        android.graphics.Path path = this.h;
        if (path.isEmpty()) {
            return;
        }
        canvas.drawPath(path, c());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        aooh.f(rect, "bounds");
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
        invalidateSelf();
    }
}
