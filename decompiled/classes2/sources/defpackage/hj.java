package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hj extends android.widget.Button {
    public final hi a;
    private final ii b;
    private cix c;
    private nf d;

    public hj(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        lo.d(this, getContext());
        hi hiVar = new hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, i);
        ii iiVar = new ii(this);
        this.b = iiVar;
        iiVar.c(attributeSet, i);
        iiVar.a();
        c().s(attributeSet, i);
    }

    private final nf c() {
        nf nfVar = this.d;
        if (nfVar != null) {
            return nfVar;
        }
        nf nfVar2 = new nf(this);
        this.d = nfVar2;
        return nfVar2;
    }

    final cix b() {
        cix cixVar = this.c;
        if (cixVar != null) {
            return cixVar;
        }
        cix cixVar2 = new cix(this, new defpackage.hp(this, 1));
        this.c = cixVar2;
        return cixVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
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
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        dzq.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) b().a;
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) b().c;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        ekb ekbVar = ekb.b;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        c();
        ekb ekbVar = ekb.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return b().e(str);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface) {
        b().d(typeface);
    }

    public hj(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968792);
    }

    public hj(android.content.Context context) {
        this(context, null);
    }
}
