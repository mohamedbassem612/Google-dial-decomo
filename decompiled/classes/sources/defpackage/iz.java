package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iz {
    private static final int[] b = {android.R.attr.state_checked};
    private static final int[] c = new int[0];
    public static final android.graphics.Rect a = new android.graphics.Rect();

    public static android.graphics.Rect a(android.graphics.drawable.Drawable drawable) {
        android.graphics.Insets insetsM = fn$.ExternalSyntheticApiModelOutline0.m(drawable);
        return new android.graphics.Rect(da$.ExternalSyntheticApiModelOutline0.m$1(insetsM), da$.ExternalSyntheticApiModelOutline0.m$2(insetsM), da$.ExternalSyntheticApiModelOutline0.m$3(insetsM), da$.ExternalSyntheticApiModelOutline0.m(insetsM));
    }

    public static void b(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        if (android.os.Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(b);
        } else {
            drawable.setState(c);
        }
        drawable.setState(state);
    }
}
