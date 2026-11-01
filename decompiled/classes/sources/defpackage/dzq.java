package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzq {
    static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static java.lang.CharSequence b(android.view.View view) {
        return baa$.ExternalSyntheticApiModelOutline1.m(view);
    }

    public static void c(android.view.View view, java.lang.CharSequence charSequence) {
        baa$.ExternalSyntheticApiModelOutline1.m(view, charSequence);
    }

    public static void d(android.widget.TextView textView, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void e(android.widget.TextView textView, int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            rp$.ExternalSyntheticApiModelOutline0.m(textView, i, f);
        } else {
            d(textView, java.lang.Math.round(android.util.TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void f(android.view.ActionMode.Callback callback) {
        if (callback instanceof ech) {
            throw null;
        }
    }
}
