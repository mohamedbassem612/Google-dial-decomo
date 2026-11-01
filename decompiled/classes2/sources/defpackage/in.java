package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class in extends android.widget.ToggleButton {
    private final hi a;
    private final ii b;
    private nf c;

    public in(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.buttonStyleToggle);
        lo.d(this, getContext());
        hi hiVar = new hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, android.R.attr.buttonStyleToggle);
        ii iiVar = new ii(this);
        this.b = iiVar;
        iiVar.c(attributeSet, android.R.attr.buttonStyleToggle);
        a().s(attributeSet, android.R.attr.buttonStyleToggle);
    }

    private final nf a() {
        nf nfVar = this.c;
        if (nfVar != null) {
            return nfVar;
        }
        nf nfVar2 = new nf(this);
        this.c = nfVar2;
        return nfVar2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.a();
        }
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        ekb ekbVar = ekb.b;
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        a();
        ekb ekbVar = ekb.b;
        super.setFilters(inputFilterArr);
    }
}
