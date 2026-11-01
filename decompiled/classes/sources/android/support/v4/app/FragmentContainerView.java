package android.support.v4.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    public boolean a;
    private final java.util.List b;
    private final java.util.List c;
    private android.view.View.OnApplyWindowInsetsListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, defpackage.bo boVar) {
        super(context, attributeSet);
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (attributeSet == null) {
            defpackage.aooh.i("attrs");
        }
        if (boVar == null) {
            defpackage.aooh.i("fm");
        }
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.t.b, 0, 0);
        defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        defpackage.aw awVarD = boVar.d(id);
        if (classAttribute != null && awVarD == null) {
            if (id == -1) {
                throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((java.lang.Object) classAttribute) + (string != null ? " with tag ".concat(string) : ""));
            }
            defpackage.bc bcVarH = boVar.h();
            context.getClassLoader();
            defpackage.aw awVarB = bcVarH.b(classAttribute);
            defpackage.aooh.e(awVarB, "instantiate(...)");
            awVarB.F = id;
            awVarB.G = id;
            awVarB.H = string;
            awVarB.B = boVar;
            awVarB.C = boVar.n;
            awVarB.aN();
            defpackage.u uVar = new defpackage.u(boVar);
            uVar.s();
            uVar.t(this, awVarB, string);
            uVar.d();
        }
        boVar.M(this);
    }

    private final void a(android.view.View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            defpackage.aooh.i("child");
        }
        if (defpackage.bo.g(view) == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            defpackage.aooh.i("insets");
        }
        defpackage.eax eaxVarQ = defpackage.eax.q(windowInsets, null);
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        defpackage.eax eaxVarQ2 = onApplyWindowInsetsListener != null ? defpackage.eax.q(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null) : defpackage.dzs.e(this, eaxVarQ);
        if (!eaxVarQ2.x()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                defpackage.dzs.d(getChildAt(i), eaxVarQ2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        if (canvas == null) {
            defpackage.aooh.i("canvas");
        }
        if (this.a) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (android.view.View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        if (canvas == null) {
            defpackage.aooh.i("canvas");
        }
        if (view == null) {
            defpackage.aooh.i("child");
        }
        if (this.a) {
            java.util.List list = this.b;
            if (!list.isEmpty() && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View view) {
        defpackage.aooh.f(view, "view");
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            defpackage.aooh.i("insets");
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                super.removeAllViewsInLayout();
                return;
            } else {
                android.view.View childAt = getChildAt(childCount);
                defpackage.aooh.c(childAt);
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        defpackage.aooh.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        android.view.View childAt = getChildAt(i);
        defpackage.aooh.c(childAt);
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View view) {
        defpackage.aooh.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            android.view.View childAt = getChildAt(i3);
            defpackage.aooh.c(childAt);
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            android.view.View childAt = getChildAt(i3);
            defpackage.aooh.c(childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View view) {
        defpackage.aooh.f(view, "view");
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context) {
        super(context);
        defpackage.aooh.f(context, "context");
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        java.lang.String str;
        super(context, attributeSet, i);
        defpackage.aooh.f(context, "context");
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.t.b, 0, 0);
            defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new java.lang.UnsupportedOperationException(defpackage.a.bm((byte) 34, classAttribute, str, "FragmentContainerView must be within a FragmentActivity to use ", "=\""));
            }
        }
    }

    public /* synthetic */ FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.aooc aoocVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        defpackage.aooh.f(context, "context");
    }
}
