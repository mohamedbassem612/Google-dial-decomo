package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class IntrinsicSizeFrameLayout extends android.widget.FrameLayout {
    private static final xtq e = new xtq(com.google.android.setupdesign.view.IntrinsicSizeFrameLayout.class);
    private int a;
    private int b;
    private java.lang.Object c;
    private final android.graphics.Rect d;

    public IntrinsicSizeFrameLayout(android.content.Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.d = new android.graphics.Rect();
        c(context, null, 0);
    }

    private final float a(float f) {
        return android.util.TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    private final int b(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return android.view.View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        }
        return mode == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, this.a), 1073741824) : i;
    }

    private final void c(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.r, i, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        xtq xtqVar = e;
        xtqVar.x("CardViewIntrinsicAttribute(" + this.b + ", " + this.a + ')');
        if (a.n()) {
            defpackage.agfz agfzVarI = defpackage.agfz.i(context);
            defpackage.agfx agfxVar = defpackage.agfx.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT;
            if (agfzVarI.v(agfxVar)) {
                this.a = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
            } else {
                xtqVar.x("PartnerConfig.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT not found");
            }
            defpackage.agfz agfzVarI2 = defpackage.agfz.i(context);
            defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_CARD_VIEW_INTRINSIC_WIDTH;
            if (agfzVarI2.v(agfxVar2)) {
                this.b = (int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f);
            } else {
                xtqVar.x("PartnerConfig.CONFIG_CARD_VIEW_INTRINSIC_WIDTH not found");
            }
            xtqVar.x("CardViewIntrinsicPartnerConfig(" + this.b + ", " + this.a + ')');
        }
        d();
    }

    private final void d() {
        int i;
        int i2;
        if (defpackage.agfz.E(getContext())) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService(android.view.WindowManager.class);
            if (windowManager != null) {
                this.d.set(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(windowManager)));
            }
            android.graphics.Rect rect = this.d;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int iMax = java.lang.Math.max(iWidth, iHeight);
            int iMin = java.lang.Math.min(iWidth, iHeight);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            getContext().getResources().getValue(2131166988, typedValue, true);
            float f = typedValue.getFloat();
            android.graphics.Point point = new android.graphics.Point(java.lang.Math.max((int) a(getContext().getResources().getInteger(2131493005)), java.lang.Math.min((int) (iMax * f), (int) a(getContext().getResources().getInteger(2131493003)))), java.lang.Math.max((int) a(getContext().getResources().getInteger(2131493006)), java.lang.Math.min((int) (iMin * f), (int) a(getContext().getResources().getInteger(2131493004)))));
            if (iWidth >= iHeight) {
                i = point.x;
                i2 = point.y;
            } else {
                i = point.y;
                i2 = point.x;
            }
            android.graphics.Point point2 = new android.graphics.Point(i, i2);
            this.a = point2.y;
            this.b = point2.x;
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        boolean zT = defpackage.agfz.t(getContext());
        boolean zE = defpackage.agfz.E(getContext());
        xtq xtqVar = e;
        xtqVar.x(java.lang.String.format(java.util.Locale.US, "Apply edge to edge, glifExpressiveEnabled: %s, isAtLeastLollipop: %s, windowInsetBottom: %d,  isModalDialog: %s", java.lang.Boolean.valueOf(zT), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(systemWindowInsetBottom), java.lang.Boolean.valueOf(zE)));
        if (zT && systemWindowInsetBottom >= 0 && !zE) {
            android.view.View viewFindViewById = findViewById(2131429047);
            int paddingBottom = viewFindViewById != null ? viewFindViewById.getPaddingBottom() : 0;
            xtqVar.w(a.bj(paddingBottom, "applyEdgeToEdge, paddingBottom: "));
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, paddingBottom);
        }
        this.c = windowInsets;
        d();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (defpackage.agfz.E(getContext())) {
            setBackgroundResource(2131231124);
            setClipToOutline(true);
        }
        if (this.c == null) {
            requestApplyInsets();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB;
        if (defpackage.agfz.E(getContext())) {
            int i3 = this.a;
            if (this.c != null) {
                android.view.WindowMetrics windowMetricsM = baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) getContext().getSystemService(android.view.WindowManager.class));
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) this.c;
                int iHeight = (baa$.ExternalSyntheticApiModelOutline1.m(windowMetricsM).height() - windowInsets.getSystemWindowInsetTop()) - windowInsets.getSystemWindowInsetBottom();
                if (this.a > iHeight) {
                    i3 = iHeight;
                }
            }
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.view.WindowMetrics windowMetricsM2 = baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) getContext().getSystemService(android.view.WindowManager.class));
            android.graphics.Rect rect = this.d;
            rect.set(baa$.ExternalSyntheticApiModelOutline1.m(windowMetricsM2));
            android.view.Display display = getDisplay();
            if (display != null) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                if (rect.width() <= 0 || rect.width() >= displayMetrics.widthPixels) {
                    iB = b(i, this.b);
                } else {
                    getWindowVisibleDisplayFrame(rect);
                    iB = android.view.View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824);
                }
            } else {
                iB = b(i, this.b);
            }
        } else {
            iB = b(i, this.b);
        }
        super.onMeasure(iB, b(i2, this.a));
    }

    @Override // android.view.View
    public final void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (a.n()) {
            if (this.a == 0 && this.b == 0) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                setElevation(0.0f);
            }
            if (defpackage.agfz.E(getContext())) {
                setElevation(0.0f);
            }
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.d = new android.graphics.Rect();
        c(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        this.d = new android.graphics.Rect();
        c(context, attributeSet, i);
    }
}
