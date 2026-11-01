package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class InsetAdjustmentLayout extends android.widget.LinearLayout {
    private static final xtq a = new xtq("InsetAdjustmentLayout", (byte[]) null);

    public InsetAdjustmentLayout(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.view.View viewFindViewById = findViewById(2131429050);
        if (defpackage.agfz.E(getContext()) && viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), windowInsets.getSystemWindowInsetTop(), viewFindViewById.getPaddingRight(), java.lang.Math.max(windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetBottom()));
            return windowInsets;
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        boolean zT = defpackage.agfz.t(getContext());
        xtq xtqVar = a;
        xtqVar.x(java.lang.String.format(java.util.Locale.US, "Apply edge to edge, glifExpressiveEnabled: %s, isAtLeastLollipop: %s, windowInsetBottom: %d", java.lang.Boolean.valueOf(zT), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(systemWindowInsetBottom)));
        if (zT && systemWindowInsetBottom >= 0) {
            android.view.View viewFindViewById2 = findViewById(2131429050);
            int paddingBottom = viewFindViewById2 != null ? viewFindViewById2.getPaddingBottom() : 0;
            xtqVar.w(a.bj(paddingBottom, "applyEdgeToEdge, paddingBottom: "));
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, paddingBottom);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    public InsetAdjustmentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetAdjustmentLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
