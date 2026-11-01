package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghz implements defpackage.aggl {
    public final com.google.android.setupcompat.internal.TemplateLayout a;
    public float c;
    public float d;
    public int e;
    private float g;
    public boolean b = false;
    final java.util.ArrayList f = new java.util.ArrayList();

    public aghz(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        android.widget.TextView textViewA;
        android.widget.TextView textViewA2;
        this.a = templateLayout;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, defpackage.agfi.c, i, 0);
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(4);
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(5);
        typedArrayObtainStyledAttributes.recycle();
        if (a() != null) {
            a().getTextSize();
            a().getLineHeight();
        }
        c();
        if (text != null && (textViewA2 = a()) != null) {
            if (this.b) {
                b(textViewA2);
            }
            textViewA2.setText(text);
        }
        if (colorStateList == null || (textViewA = a()) == null) {
            return;
        }
        textViewA.setTextColor(colorStateList);
    }

    public final android.widget.TextView a() {
        return (android.widget.TextView) this.a.g(2131429051);
    }

    public final void b(android.widget.TextView textView) {
        if (textView != null) {
            textView.setTextSize(0, this.g);
            textView.getTextSize();
            ft$.ExternalSyntheticApiModelOutline0.m(textView, java.lang.Math.round(this.d + this.g));
            textView.getLineHeight();
            textView.setMaxLines(6);
            defpackage.aggu agguVar = new defpackage.aggu(this, textView, 2);
            textView.getViewTreeObserver().addOnPreDrawListener(agguVar);
            this.f.add(agguVar);
        }
    }

    public final void c() {
        com.google.android.setupcompat.internal.TemplateLayout templateLayout = this.a;
        android.content.Context context = templateLayout.getContext();
        if (!defpackage.aftt.o(templateLayout)) {
            this.b = false;
            return;
        }
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_HEADER_AUTO_SIZE_ENABLED;
        if (agfzVarI.v(agfxVar)) {
            this.b = defpackage.agfz.i(context).m(context, agfxVar, this.b);
        }
        if (this.b) {
            android.content.Context context2 = templateLayout.getContext();
            defpackage.agfz agfzVarI2 = defpackage.agfz.i(context2);
            defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE;
            if (agfzVarI2.v(agfxVar2)) {
                this.g = defpackage.agfz.i(context2).a(context2, agfxVar2, 0.0f);
            }
            defpackage.agfz agfzVarI3 = defpackage.agfz.i(context2);
            defpackage.agfx agfxVar3 = defpackage.agfx.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE;
            if (agfzVarI3.v(agfxVar3)) {
                this.c = defpackage.agfz.i(context2).a(context2, agfxVar3, 0.0f);
            }
            defpackage.agfz agfzVarI4 = defpackage.agfz.i(context2);
            defpackage.agfx agfxVar4 = defpackage.agfx.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA;
            if (agfzVarI4.v(agfxVar4)) {
                this.d = defpackage.agfz.i(context2).a(context2, agfxVar4, 0.0f);
            }
            defpackage.agfz agfzVarI5 = defpackage.agfz.i(context2);
            defpackage.agfx agfxVar5 = defpackage.agfx.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE;
            if (agfzVarI5.v(agfxVar5)) {
                this.e = defpackage.agfz.i(context2).c(context2, agfxVar5, 0);
            }
            if (this.e > 0) {
                float f = this.c;
                if (f > 0.0f && this.g >= f) {
                    return;
                }
            }
            android.util.Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
            this.b = false;
        }
    }
}
