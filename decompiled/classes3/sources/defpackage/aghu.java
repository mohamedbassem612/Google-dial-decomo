package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghu implements defpackage.aggl {
    public final com.google.android.setupcompat.internal.TemplateLayout a;
    boolean b = false;
    public int c = 0;
    public boolean d;

    public aghu(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        this.d = true;
        this.a = templateLayout;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.i, i, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.widget.Button d() {
        android.widget.Button button = (android.widget.Button) this.a.g(2131429062);
        if (button == null) {
            android.util.Log.w("FloatingBackButtonMixin", "Can't find the back button.");
        }
        return button;
    }

    public final android.widget.Button a() {
        android.view.View viewG;
        android.widget.Button buttonD = d();
        if (buttonD != null) {
            return buttonD;
        }
        if (!this.b) {
            this.b = true;
            com.google.android.setupcompat.internal.TemplateLayout templateLayout = this.a;
            android.view.ViewStub viewStub = (android.view.ViewStub) templateLayout.g(2131429063);
            if (viewStub != null) {
                try {
                    if (defpackage.agfz.A(templateLayout.getContext())) {
                        viewStub.setLayoutResource(2131624470);
                        android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            viewStub.setLayoutParams(layoutParams);
                        }
                    }
                    viewStub.setLayoutInflater(android.view.LayoutInflater.from(templateLayout.getContext()));
                    viewStub.inflate();
                    android.widget.Button button = (android.widget.Button) templateLayout.g(2131429062);
                    android.view.View viewG2 = templateLayout.g(2131429051);
                    if (button != null) {
                        defpackage.agig.a(button.getContext(), button);
                        if (viewG2 != null && !defpackage.agfz.A(templateLayout.getContext())) {
                            button.setAccessibilityTraversalBefore(viewG2.getId());
                        }
                        if (defpackage.agfz.u(templateLayout.getContext()) && (viewG = templateLayout.g(2131427348)) != null && defpackage.agfz.z(templateLayout.getContext()) && defpackage.agfz.E(templateLayout.getContext())) {
                            viewG.setAccessibilityTraversalBefore(button.getId());
                            viewG.setNextFocusForwardId(button.getId());
                            button.setAccessibilityTraversalAfter(viewG.getId());
                        }
                    }
                } catch (android.view.InflateException e) {
                    android.util.Log.w("FloatingBackButtonMixin", "Incorrect theme:".concat(java.lang.String.valueOf(e.toString())));
                    return null;
                }
            }
        }
        return d();
    }

    public final android.widget.FrameLayout b() {
        return (android.widget.FrameLayout) this.a.g(2131429104);
    }

    public final void c(int i) {
        android.widget.Button buttonA = a();
        if (buttonA != null) {
            buttonA.setVisibility(i);
            b().setVisibility(i);
        }
    }
}
