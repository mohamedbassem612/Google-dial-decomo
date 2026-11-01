package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hs extends android.widget.MultiAutoCompleteTextView {
    private static final int[] a = {android.R.attr.popupBackground};
    private final hi b;
    private final ii c;
    private final vx d;

    public hs(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968665);
        lo.d(this, getContext());
        ajxw ajxwVarD = ajxw.D(getContext(), attributeSet, a, 2130968665, 0);
        if (ajxwVarD.z(0)) {
            setDropDownBackgroundDrawable(ajxwVarD.t(0));
        }
        ajxwVarD.x();
        hi hiVar = new hi(this);
        this.b = hiVar;
        hiVar.b(attributeSet, 2130968665);
        ii iiVar = new ii(this);
        this.c = iiVar;
        iiVar.c(attributeSet, 2130968665);
        iiVar.a();
        vx vxVar = new vx(this);
        this.d = vxVar;
        vxVar.h(attributeSet, 2130968665);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (vx.i(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener keyListenerJ = vx.j(keyListener);
            if (keyListenerJ != keyListener) {
                super.setKeyListener(keyListenerJ);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hi hiVar = this.b;
        if (hiVar != null) {
            hiVar.a();
        }
        ii iiVar = this.c;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        defpackage.kj.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.k(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hi hiVar = this.b;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hi hiVar = this.b;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ii iiVar = this.c;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ii iiVar = this.c;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(den.bO(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(vx.j(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        ii iiVar = this.c;
        if (iiVar != null) {
            iiVar.d(context, i);
        }
    }
}
