package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aflj extends defpackage.afke {
    public android.view.View ak;
    public android.view.View al;
    public android.view.View am;
    public com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback an;
    private android.widget.TextView d;
    private final defpackage.afli e = new defpackage.afli(this);
    private boolean ao = false;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate = layoutInflater.inflate(2131624651, viewGroup, false);
        this.ak = viewInflate.findViewById(2131429185);
        this.d = (android.widget.TextView) viewInflate.findViewById(2131429187);
        java.lang.CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = yv.f(s());
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.am = r();
        com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback scrollViewWithSizeCallback = (com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback) viewInflate.findViewById(2131429186);
        this.an = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.am);
        com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.an;
        defpackage.afli afliVar = this.e;
        scrollViewWithSizeCallback2.a = afliVar;
        if (!this.ao && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(afliVar);
            this.ao = true;
        }
        defpackage.afjs.c((android.widget.ImageView) viewInflate.findViewById(2131429175), this.c);
        defpackage.aflw aflwVarB = b();
        if (aflwVarB != null) {
            if (aflwVarB.aW()) {
                this.an.setVerticalScrollBarEnabled(false);
            }
            this.al = aflwVarB.b().findViewById(2131429157);
        }
        dzs.k(viewInflate, (java.lang.CharSequence) null);
        return viewInflate;
    }

    public final boolean aU() {
        return (z() == null || this.d == null || this.ak == null || this.al == null || this.am == null || this.an == null) ? false : true;
    }

    public final void i() {
        com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.ao && (scrollViewWithSizeCallback = this.an) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.ao = false;
        }
        super.i();
    }

    public void k(android.os.Bundle bundle) {
        android.widget.TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.afke
    public void p() {
        android.view.View view;
        aehj aehjVar = afjy.c;
        if ((!afjy.b(anlc.d(afjy.b)) || aU()) && afjz.k(z()) && (view = this.ak) != null) {
            view.requestFocus();
            this.ak.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.afke
    public final void q(java.lang.String str) {
        aehj aehjVar = afjy.c;
        if (!afjy.b(anlc.d(afjy.b)) || aU()) {
            android.text.Spanned spannedF = yv.f(str);
            this.d.setText(spannedF);
            this.d.setContentDescription(spannedF.toString());
        }
    }

    public abstract android.view.View r();

    public abstract java.lang.String s();
}
