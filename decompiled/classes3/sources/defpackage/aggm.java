package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggm implements defpackage.aggl {
    private final defpackage.agfh a;
    private com.google.android.setupcompat.view.StatusBarBackgroundLayout b;
    private android.widget.LinearLayout c;
    private final android.view.View d;

    public aggm(defpackage.agfh agfhVar, android.view.Window window, android.util.AttributeSet attributeSet, int i) {
        this.a = agfhVar;
        android.view.View viewG = agfhVar.g(2131429050);
        if (viewG == null) {
            throw new java.lang.NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
        }
        if (viewG instanceof com.google.android.setupcompat.view.StatusBarBackgroundLayout) {
            this.b = (com.google.android.setupcompat.view.StatusBarBackgroundLayout) viewG;
        } else {
            this.c = (android.widget.LinearLayout) viewG;
        }
        android.view.View decorView = window.getDecorView();
        this.d = decorView;
        window.setStatusBarColor(0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = agfhVar.getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.e, i, 0);
        boolean zM = typedArrayObtainStyledAttributes.getBoolean(0, (decorView.getSystemUiVisibility() & 8192) == 8192);
        if (agfhVar.e()) {
            android.content.Context context = agfhVar.getContext();
            zM = defpackage.agfz.i(context).m(context, defpackage.agfx.CONFIG_LIGHT_STATUS_BAR, false);
        }
        if (zM) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        a(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        defpackage.agfh agfhVar = this.a;
        if (agfhVar.e() && !agfhVar.f()) {
            android.content.Context context = agfhVar.getContext();
            drawable = defpackage.agfz.i(context).e(context, defpackage.agfx.CONFIG_STATUS_BAR_BACKGROUND);
        }
        com.google.android.setupcompat.view.StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.a = drawable;
        statusBarBackgroundLayout.setWillNotDraw(drawable == null);
        statusBarBackgroundLayout.setFitsSystemWindows(drawable != null || defpackage.agfz.t(statusBarBackgroundLayout.getContext()));
        statusBarBackgroundLayout.invalidate();
    }
}
