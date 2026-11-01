package com.google.android.material.chip;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ChipGroup extends defpackage.afuf {
    public final defpackage.aftx a;
    public defpackage.rai b;
    private int g;
    private int h;
    private final int i;
    private final defpackage.afsb j;

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086095), attributeSet, i);
        defpackage.aftx aftxVar = new defpackage.aftx();
        this.a = aftxVar;
        defpackage.afsb afsbVar = new defpackage.afsb(this);
        this.j = afsbVar;
        android.content.res.TypedArray typedArrayA = afvl.a(getContext(), attributeSet, defpackage.afsc.b, i, 2132086095, new int[0]);
        int dimensionPixelOffset = typedArrayA.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayA.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.g != dimensionPixelOffset2) {
            this.g = dimensionPixelOffset2;
            this.d = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = typedArrayA.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.h != dimensionPixelOffset3) {
            this.h = dimensionPixelOffset3;
            this.c = dimensionPixelOffset3;
            requestLayout();
        }
        this.e = typedArrayA.getBoolean(5, false);
        boolean z = typedArrayA.getBoolean(6, false);
        if (aftxVar.c != z) {
            aftxVar.c = z;
            aftxVar.c();
        }
        aftxVar.d = typedArrayA.getBoolean(4, false);
        this.i = typedArrayA.getResourceId(0, -1);
        typedArrayA.recycle();
        aftxVar.e = new defpackage.aprf(this);
        super.setOnHierarchyChangeListener(afsbVar);
    }

    public final java.util.List a() {
        return this.a.a(this);
    }

    public final boolean b(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public final boolean c() {
        return this.a.c;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof defpackage.afsa);
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.afsa();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.afsa(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            defpackage.aftx aftxVar = this.a;
            defpackage.afuh afuhVar = (defpackage.afuh) aftxVar.a.get(java.lang.Integer.valueOf(i));
            if (afuhVar == null || !aftxVar.e(afuhVar)) {
                return;
            }
            aftxVar.d();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ebd ebdVar = new ebd(accessibilityNodeInfo);
        if (this.e) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof com.google.android.material.chip.Chip) && b(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        ebdVar.u(ni.t(this.f, i, true != c() ? 2 : 1));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.a = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.afsa(layoutParams);
    }

    public ChipGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968859);
    }

    public ChipGroup(android.content.Context context) {
        this(context, null);
    }
}
