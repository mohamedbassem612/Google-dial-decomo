package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class hu {
    private static final int[] b = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    public android.graphics.Bitmap a;
    private final android.widget.ProgressBar c;

    public hu(android.widget.ProgressBar progressBar) {
        this.c = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.graphics.drawable.Drawable, android.graphics.drawable.ShapeDrawable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.graphics.drawable.LayerDrawable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.graphics.drawable.Drawable] */
    final android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, boolean z) {
        ?? shapeDrawable;
        if (drawable instanceof defpackage.dwv) {
            defpackage.dwv dwvVar = (defpackage.dwv) drawable;
            android.graphics.drawable.Drawable drawableA = dwvVar.a();
            if (drawableA == null) {
                return drawable;
            }
            a(drawableA, z);
            dwvVar.b();
            return drawable;
        }
        if (drawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            shapeDrawable = new android.graphics.drawable.LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                shapeDrawable.setId(i2, layerDrawable.getId(i2));
                shapeDrawable.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                shapeDrawable.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                shapeDrawable.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                shapeDrawable.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                shapeDrawable.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                shapeDrawable.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                shapeDrawable.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                shapeDrawable.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                shapeDrawable.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
        } else {
            if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
                return drawable;
            }
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1);
            }
        }
        return shapeDrawable;
    }

    public void b(android.util.AttributeSet attributeSet, int i) {
        android.widget.ProgressBar progressBar = this.c;
        ajxw ajxwVarD = ajxw.D(progressBar.getContext(), attributeSet, b, i, 0);
        android.graphics.drawable.Drawable drawableU = ajxwVarD.u(0);
        if (drawableU != null) {
            if (drawableU instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawableU;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    android.graphics.drawable.Drawable drawableA = a(animationDrawable.getFrame(i2), true);
                    drawableA.setLevel(10000);
                    animationDrawable2.addFrame(drawableA, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableU = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableU);
        }
        android.graphics.drawable.Drawable drawableU2 = ajxwVarD.u(1);
        if (drawableU2 != null) {
            progressBar.setProgressDrawable(a(drawableU2, false));
        }
        ajxwVarD.x();
    }
}
