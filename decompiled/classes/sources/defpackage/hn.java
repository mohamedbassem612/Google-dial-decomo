package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class hn {
    public final int[] a = {2131230888, 2131230886, 2131230812};
    public final int[] b = {2131230836, 2131230871, 2131230843, 2131230838, 2131230839, 2131230842, 2131230841};
    public final int[] c = {2131230885, 2131230887, 2131230829, 2131230881, 2131230882, 2131230883, 2131230884};
    public final int[] d = {2131230861, 2131230827, 2131230860};
    public final int[] e = {2131230879, 2131230889};
    public final int[] f = {2131230815, 2131230821, 2131230816, 2131230822};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final android.content.res.ColorStateList b(android.content.Context context, int i) {
        int iB = defpackage.lo.b(context, 2130968945);
        return new android.content.res.ColorStateList(new int[][]{defpackage.lo.a, defpackage.lo.c, defpackage.lo.b, defpackage.lo.e}, new int[]{defpackage.lo.a(context, 2130968932), defpackage.dwm.g(iB, i), defpackage.dwm.g(iB, i), i});
    }

    public static final android.graphics.drawable.LayerDrawable c(defpackage.lg lgVar, android.content.Context context, int i) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        android.graphics.drawable.Drawable drawableC = lgVar.c(context, 2131230875);
        android.graphics.drawable.Drawable drawableC2 = lgVar.c(context, 2131230876);
        if ((drawableC instanceof android.graphics.drawable.BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableC;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof android.graphics.drawable.BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableC2;
        } else {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void d(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = defpackage.ho.a;
        }
        drawableMutate.setColorFilter(defpackage.ho.b(i, mode));
    }
}
