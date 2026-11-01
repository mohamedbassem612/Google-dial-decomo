package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hv extends android.widget.RadioButton {
    private final defpackage.hm a;
    private final hi b;
    private final ii c;
    private nf d;

    public hv(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        lo.d(this, getContext());
        defpackage.hm hmVar = new defpackage.hm(this);
        this.a = hmVar;
        hmVar.b(attributeSet, i);
        hi hiVar = new hi(this);
        this.b = hiVar;
        hiVar.b(attributeSet, i);
        ii iiVar = new ii(this);
        this.c = iiVar;
        iiVar.c(attributeSet, i);
        a().s(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        ekb ekbVar = ekb.b;
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(den.bO(getContext(), i));
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

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        a();
        ekb ekbVar = ekb.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        defpackage.hm hmVar = this.a;
        if (hmVar != null) {
            hmVar.c();
        }
    }

    public hv(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970272);
    }

    public hv(android.content.Context context) {
        this(context, null);
    }
}
