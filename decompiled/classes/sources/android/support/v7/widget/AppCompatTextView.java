package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class AppCompatTextView extends android.widget.TextView {
    private final defpackage.hi a;
    private final defpackage.ii b;
    private boolean c;
    private ij d;
    private defpackage.cix e;
    private defpackage.nf f;

    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = null;
        defpackage.lo.d(this, getContext());
        defpackage.hi hiVar = new defpackage.hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, i);
        defpackage.ii iiVar = new defpackage.ii(this);
        this.b = iiVar;
        iiVar.c(attributeSet, i);
        iiVar.a();
        a().s(attributeSet, i);
    }

    private final defpackage.nf a() {
        defpackage.nf nfVar = this.f;
        if (nfVar != null) {
            return nfVar;
        }
        defpackage.nf nfVar2 = new defpackage.nf(this);
        this.f = nfVar2;
        return nfVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.a();
        }
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        defpackage.dzq.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) l().a;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final android.view.textclassifier.TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) l().c;
    }

    final ij k() {
        if (this.d == null) {
            this.d = android.os.Build.VERSION.SDK_INT >= 34 ? new il(this) : new ik(this);
        }
        return this.d;
    }

    final defpackage.cix l() {
        defpackage.cix cixVar = this.e;
        if (cixVar != null) {
            return cixVar;
        }
        defpackage.cix cixVar2 = new defpackage.cix(this, new defpackage.ax(this, 6));
        this.e = cixVar2;
        return cixVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kj.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        defpackage.ekb ekbVar = defpackage.ekb.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? defpackage.den.bO(context, i) : null, i2 != 0 ? defpackage.den.bO(context, i2) : null, i3 != 0 ? defpackage.den.bO(context, i3) : null, i4 != 0 ? defpackage.den.bO(context, i4) : null);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? defpackage.den.bO(context, i) : null, i2 != 0 ? defpackage.den.bO(context, i2) : null, i3 != 0 ? defpackage.den.bO(context, i3) : null, i4 != 0 ? defpackage.den.bO(context, i4) : null);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        a();
        defpackage.ekb ekbVar = defpackage.ekb.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        k().a(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return l().e(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        k().b(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            k().c(i, f);
        } else {
            defpackage.dzq.e(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            android.content.Context context = getContext();
            defpackage.add addVar = defpackage.dwq.a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typeface = android.graphics.Typeface.create(typeface, i);
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        defpackage.dzq.d(this, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface) {
        l().d(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public AppCompatTextView(android.content.Context context) {
        this(context, null);
    }
}
