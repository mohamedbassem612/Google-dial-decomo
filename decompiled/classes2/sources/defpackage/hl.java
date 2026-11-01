package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hl extends android.widget.CheckedTextView {
    private final hi a;
    private final ii b;
    private final ygq c;
    private nf d;

    public hl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968853);
        lo.d(this, getContext());
        ii iiVar = new ii(this);
        this.b = iiVar;
        iiVar.c(attributeSet, 2130968853);
        iiVar.a();
        hi hiVar = new hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, 2130968853);
        ygq ygqVar = new ygq(this);
        this.c = ygqVar;
        ygqVar.k(attributeSet);
        a().s(attributeSet, 2130968853);
    }

    private final nf a() {
        nf nfVar = this.d;
        if (nfVar != null) {
            return nfVar;
        }
        nf nfVar2 = new nf(this);
        this.d = nfVar2;
        return nfVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.a();
        }
        ygq ygqVar = this.c;
        if (ygqVar != null) {
            ygqVar.j();
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
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        ekb ekbVar = ekb.b;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(android.graphics.drawable.Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        ygq ygqVar = this.c;
        if (ygqVar != null) {
            if (ygqVar.a) {
                ygqVar.a = false;
            } else {
                ygqVar.a = true;
                ygqVar.j();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(den.bO(getContext(), i));
    }
}
