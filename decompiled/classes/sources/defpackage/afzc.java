package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afzc {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {android.R.attr.state_pressed};
    private static final int[] c = {android.R.attr.state_focused};
    private static final int[] d = {android.R.attr.state_selected, android.R.attr.state_pressed};
    private static final int[] e = {android.R.attr.state_selected};

    private afzc() {
    }

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList colorStateList) {
        int iC = c(colorStateList, d);
        int[] iArr = c;
        return new android.content.res.ColorStateList(new int[][]{e, iArr, android.util.StateSet.NOTHING}, new int[]{iC, c(colorStateList, iArr), c(colorStateList, b)});
    }

    public static android.content.res.ColorStateList b(android.content.res.ColorStateList colorStateList) {
        return colorStateList == null ? android.content.res.ColorStateList.valueOf(0) : colorStateList;
    }

    private static int c(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return defpackage.dwm.h(colorForState, java.lang.Math.min(android.graphics.Color.alpha(colorForState) << 1, 255));
    }
}
