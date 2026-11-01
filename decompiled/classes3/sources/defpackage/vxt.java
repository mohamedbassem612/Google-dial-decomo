package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vxt {
    public static final android.view.animation.Interpolator a = new android.view.animation.LinearInterpolator();
    public static final android.view.animation.Interpolator b = new android.view.animation.PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public static final android.view.animation.Interpolator c = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    public static final android.view.animation.Interpolator d = new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);

    public static final long a(android.view.View view) {
        return wsc.bp(view.getContext(), defpackage.urp.DURATION_MEDIUM_2);
    }

    public static final int b(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getRootView().getWidth(), 1073741824), 0);
        return view.getMeasuredHeight();
    }

    public static final float c(android.view.View view) {
        return view.getContext().getResources().getDimensionPixelSize(2131167980);
    }
}
