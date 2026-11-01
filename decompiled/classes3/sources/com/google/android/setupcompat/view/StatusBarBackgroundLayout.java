package com.google.android.setupcompat.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StatusBarBackgroundLayout extends android.widget.FrameLayout {
    private static final xtq c = new xtq("StatusBarBgLayout", (byte[]) null);
    public android.graphics.drawable.Drawable a;
    private android.view.WindowInsets b;

    public StatusBarBackgroundLayout(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        boolean zT = defpackage.agfz.t(getContext());
        xtq xtqVar = c;
        xtqVar.x(java.lang.String.format(java.util.Locale.US, "Apply edge to edge, glifExpressiveEnabled: %s, isAtLeastLollipop: %s, windowInsetBottom: %d", java.lang.Boolean.valueOf(zT), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(systemWindowInsetBottom)));
        if (zT && systemWindowInsetBottom >= 0) {
            android.view.View viewFindViewById = findViewById(2131429050);
            int paddingBottom = viewFindViewById != null ? viewFindViewById.getPaddingBottom() : 0;
            xtqVar.w(a.bj(paddingBottom, "applyEdgeToEdge, paddingBottom: "));
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, paddingBottom);
        }
        this.b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        android.view.WindowInsets windowInsets = this.b;
        if (windowInsets == null || this.a == null || (systemWindowInsetTop = windowInsets.getSystemWindowInsetTop()) <= 0) {
            return;
        }
        this.a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.a.draw(canvas);
    }

    public StatusBarBackgroundLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
