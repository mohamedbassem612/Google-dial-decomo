package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdl extends hh {
    public final jv a;
    public final int[] b;
    public final float c;
    public android.content.res.ColorStateList d;
    public final int e;
    public final android.content.res.ColorStateList f;
    private final android.view.accessibility.AccessibilityManager g;
    private final android.graphics.Rect h;
    private final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public agdl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(agdv.a(context, attributeSet, 2130968665, 0), attributeSet, 2130968665);
        this.b = new int[]{android.R.attr.state_selected};
        this.h = new android.graphics.Rect();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.agdn.a, 2130968665, 2132085246, new int[0]);
        if (typedArrayA.hasValue(0) && typedArrayA.getInt(0, 0) == 0) {
            setKeyListener((android.text.method.KeyListener) null);
        }
        int resourceId = typedArrayA.getResourceId(3, 2131624325);
        this.i = resourceId;
        this.c = typedArrayA.getDimensionPixelOffset(1, 2131167082);
        if (typedArrayA.hasValue(2)) {
            this.d = android.content.res.ColorStateList.valueOf(typedArrayA.getColor(2, 0));
        }
        this.e = typedArrayA.getColor(4, 0);
        this.f = agab.o(context2, typedArrayA, 5);
        this.g = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        jv jvVar = new jv(context2, (android.util.AttributeSet) null, 2130969772, 0);
        this.a = jvVar;
        jvVar.y();
        jvVar.k = this;
        jvVar.w();
        jvVar.e(getAdapter());
        jvVar.l = new agdj(this, 0);
        if (typedArrayA.hasValue(6)) {
            setAdapter(new defpackage.agdk(this, getContext(), resourceId, getResources().getStringArray(typedArrayA.getResourceId(6, 0))));
        }
        typedArrayA.recycle();
    }

    private final com.google.android.material.textfield.TextInputLayout b() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null) {
            if (!accessibilityManager.isTouchExplorationEnabled()) {
                if (accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                    for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                        if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.a.m();
        } else {
            super.dismissDropDown();
        }
    }

    public final java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.l) ? super.getHint() : textInputLayoutB.f();
    }

    public final boolean isPopupShowing() {
        jv jvVar = this.a;
        if (jvVar == null || !jvVar.x()) {
            return super.isPopupShowing();
        }
        return true;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.l && super.getHint() == null && defpackage.aftt.f()) {
            setHint("");
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.m();
    }

    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        boolean z;
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 66) {
            z = true;
        } else if (i == 23) {
            i = 23;
            z = true;
        } else {
            z = false;
        }
        if (getKeyListener() == null ? !(z || i == 62) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        com.google.android.material.textfield.TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB == null) {
            return true;
        }
        textInputLayoutB.d().performClick();
        return true;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            android.widget.ListAdapter adapter = getAdapter();
            com.google.android.material.textfield.TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                jv jvVar = this.a;
                int iMin = java.lang.Math.min(adapter.getCount(), java.lang.Math.max(0, jvVar.o()) + 15);
                android.view.View view = null;
                int iMax = 0;
                for (int iMax2 = java.lang.Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = java.lang.Math.max(iMax, view.getMeasuredWidth());
                }
                android.graphics.drawable.Drawable drawableC = jvVar.c();
                if (drawableC != null) {
                    android.graphics.Rect rect = this.h;
                    drawableC.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = iMax + textInputLayoutB.d().getMeasuredWidth();
            }
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(measuredWidth, measuredWidth2), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    public final void setAdapter(android.widget.ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    public final void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        jv jvVar = this.a;
        if (jvVar != null) {
            jvVar.f(drawable);
        }
    }

    public final void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.m = getOnItemSelectedListener();
    }

    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        com.google.android.material.textfield.TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.w();
        }
    }

    public final void showDropDown() {
        if (c()) {
            this.a.v();
        } else {
            super.showDropDown();
        }
    }
}
