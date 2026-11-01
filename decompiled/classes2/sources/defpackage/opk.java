package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opk implements defpackage.opl {
    private final android.graphics.drawable.Drawable a;
    private final float b;
    private final int c;

    public opk(android.content.Context context, int i, float f) {
        this.c = i;
        this.a = context.getResources().getDrawable(i, null);
        this.b = f;
    }

    @Override // defpackage.opl
    public final void a(android.graphics.Canvas canvas, android.graphics.Rect rect, int i) {
        android.graphics.drawable.Drawable drawable = this.a;
        drawable.mutate().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        int iMin = (int) ((this.b * java.lang.Math.min(rect.width(), rect.height())) / 2.0f);
        drawable.setBounds(new android.graphics.Rect(rect.centerX() - iMin, rect.centerY() - iMin, rect.centerX() + iMin, rect.centerY() + iMin));
        drawable.draw(canvas);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.opk opkVar = (defpackage.opk) obj;
            if (java.lang.Float.compare(opkVar.b, this.b) == 0 && opkVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), java.lang.Float.valueOf(this.b)});
    }
}
