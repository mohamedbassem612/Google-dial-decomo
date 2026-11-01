package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opn extends android.graphics.drawable.Drawable {
    private final android.graphics.Paint a;
    private final defpackage.opl b;
    private final int c;
    private final int d;

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public opn(pgi pgiVar, defpackage.opl oplVar, java.lang.String str) {
        int iF;
        this.b = oplVar;
        android.content.Context context = (android.content.Context) pgiVar.b.a();
        context.getClass();
        urg urgVar = (urg) pgiVar.a.a();
        urgVar.getClass();
        int color = context.getColor(2131101258);
        if (str == null) {
            iF = urgVar.f(context);
        } else {
            int[] iArrCn = afsq.cn(context);
            int iAbs = java.lang.Math.abs(str.hashCode()) % iArrCn.length;
            color = iArrCn[iAbs];
            iF = afsq.cm(context)[iAbs];
        }
        this.d = iF;
        this.c = color;
        this.a = a();
    }

    private static android.graphics.Paint a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.a;
        int i = this.c;
        android.graphics.Rect bounds = getBounds();
        paint.setColor(i);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), java.lang.Math.min(bounds.width(), bounds.height()) / 2.0f, paint);
        this.b.a(canvas, bounds, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.opn opnVar = (defpackage.opn) obj;
            if (this.c == opnVar.c && this.d == opnVar.d && j$.util.Objects.equals(this.b, opnVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        outline.setOval(getBounds());
        outline.setAlpha(1.0f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public opn(defpackage.opl oplVar, int i, int i2) {
        this.b = oplVar;
        this.d = i;
        this.c = i2;
        this.a = a();
    }
}
