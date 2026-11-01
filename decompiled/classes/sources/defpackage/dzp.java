package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzp {
    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return fn$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static void b(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        fn$.ExternalSyntheticApiModelOutline0.m(view, context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(android.view.View view, java.util.List list) {
        fn$.ExternalSyntheticApiModelOutline0.m(view, list);
    }

    public static final android.view.ViewParent d(android.view.View view) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        java.lang.Object tag = view.getTag(2131429433);
        if (tag instanceof android.view.ViewParent) {
            return (android.view.ViewParent) tag;
        }
        return null;
    }
}
