package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wib {
    public final float a;
    public final float b;
    private final android.content.res.ColorStateList c;
    private final float d;
    private final ahzi e = ahvr.bI(new defpackage.wdn(this, 11));

    public wib(android.content.Context context) {
        this.c = context.getColorStateList(2131102985);
        this.a = context.getResources().getDimensionPixelOffset(2131168017);
        this.b = context.getResources().getDimensionPixelOffset(2131168018);
        this.d = context.getResources().getDimensionPixelOffset(2131168019);
    }

    public static float[] c(boolean z, boolean z2, float f, float f2) {
        float f3 = true != z ? f2 : f;
        if (true != z2) {
            f = f2;
        }
        return new float[]{f3, f3, f3, f3, f, f, f, f};
    }

    public final android.graphics.drawable.Drawable a(float[] fArr) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setStroke((int) this.d, this.c);
        return gradientDrawable;
    }

    final defpackage.wia b() {
        return (defpackage.wia) this.e.eZ();
    }
}
