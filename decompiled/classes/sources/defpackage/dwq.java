package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwq {
    public static final defpackage.add a;
    public static final defpackage.dzk b;
    private static android.graphics.Paint c;

    static {
        defpackage.dzk.G("TypefaceCompat static init");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            b = new defpackage.dws();
        } else {
            b = new defpackage.dwr();
        }
        a = new defpackage.add(16);
        c = null;
        android.os.Trace.endSection();
    }

    public static android.graphics.Typeface a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, 0);
        android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static android.graphics.fonts.Font b(android.graphics.Typeface typeface) {
        android.graphics.Paint paint = c;
        if (paint == null) {
            paint = new android.graphics.Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        android.graphics.text.PositionedGlyphs positionedGlyphsM = ac$.ExternalSyntheticApiModelOutline0.m(" ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (ac$.ExternalSyntheticApiModelOutline0.m(positionedGlyphsM) == 0) {
            return null;
        }
        return ac$.ExternalSyntheticApiModelOutline0.m(positionedGlyphsM, 0);
    }

    public static java.lang.String c(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
