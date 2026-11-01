package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cub {
    public final org.xmlpull.v1.XmlPullParser a;
    public int[] c;
    public int d;
    public int b = 0;
    public final defpackage.xp e = new defpackage.xp(null, null);

    public cub(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(android.content.res.TypedArray typedArray, java.lang.String str, int i, float f) {
        float fG = defpackage.dvf.g(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return fG;
    }

    public final int b(android.content.res.TypedArray typedArray, java.lang.String str, int i, int i2) {
        int i3 = defpackage.dvf.i(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return i3;
    }

    public final android.content.res.TypedArray c(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        android.content.res.TypedArray typedArrayK = defpackage.dvf.k(resources, theme, attributeSet, iArr);
        e(typedArrayK.getChangingConfigurations());
        return typedArrayK;
    }

    public final java.lang.String d(android.content.res.TypedArray typedArray, int i) {
        java.lang.String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.b |= i;
    }

    public final float f(android.content.res.TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(android.content.res.TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final defpackage.akbx h(android.content.res.TypedArray typedArray, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        defpackage.akbx akbxVarU = defpackage.dvf.u(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return akbxVarU;
    }
}
