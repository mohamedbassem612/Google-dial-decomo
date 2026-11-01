package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hh extends android.widget.AutoCompleteTextView {
    private static final int[] a = {android.R.attr.popupBackground};
    private final hi b;
    private final ii c;
    private final vx d;

    public hh(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        lo.d(this, getContext());
        ajxw ajxwVarD = ajxw.D(getContext(), attributeSet, a, i, 0);
        if (ajxwVarD.z(0)) {
            setDropDownBackgroundDrawable(ajxwVarD.t(0));
        }
        ajxwVarD.x();
        hi hiVar = new hi(this);
        this.b = hiVar;
        hiVar.b(attributeSet, i);
        ii iiVar = new ii(this);
        this.c = iiVar;
        iiVar.c(attributeSet, i);
        iiVar.a();
        vx vxVar = new vx(this);
        this.d = vxVar;
        vxVar.h(attributeSet, i);
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

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        dzq.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
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

    public hh(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968665);
    }

    public hh(android.content.Context context) {
        this(context, null);
    }
}
