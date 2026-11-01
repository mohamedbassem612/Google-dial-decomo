package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflb extends defpackage.afke {
    public com.google.android.libraries.surveys.internal.model.QuestionMetrics ak;
    private android.widget.TextView al;
    public java.lang.String d;
    public int e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate = layoutInflater.inflate(2131624645, viewGroup, false);
        android.os.Bundle bundle2 = ((aw) this).m;
        defpackage.afjs.c((android.widget.ImageView) viewInflate.findViewById(2131429175), bundle2.containsKey("DisplayLogoResId") ? java.lang.Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null);
        java.lang.CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            boolean zIsEmpty = this.a.g.isEmpty();
            defpackage.amiv amivVar = this.a;
            charSequence = yv.f(zIsEmpty ? amivVar.f : amivVar.g);
        }
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131429187);
        this.al = textView;
        textView.setText(charSequence);
        this.al.setContentDescription(charSequence.toString());
        defpackage.aflh aflhVar = new defpackage.aflh(viewInflate.getContext());
        defpackage.amiv amivVar2 = this.a;
        aflhVar.e(amivVar2.c == 6 ? (defpackage.amix) amivVar2.d : defpackage.amix.a);
        aflhVar.a = new defpackage.aflg() { // from class: afla
            @Override // defpackage.aflg
            public final void a(int i) {
                defpackage.aflb aflbVar = this.a;
                aflbVar.d = java.lang.Integer.toString(i);
                aflbVar.e = i;
                aflbVar.ak.a();
                int iAb = a.ab(aflbVar.a.i);
                if (iAb == 0) {
                    iAb = 1;
                }
                defpackage.aflw aflwVarB = aflbVar.b();
                if (aflwVarB == null) {
                    android.util.Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (iAb == 5) {
                    aflwVarB.p();
                } else {
                    aflwVarB.q(aflbVar.r(), aflbVar);
                }
            }
        };
        ((android.view.ViewGroup) viewInflate.findViewById(2131429188)).addView(aflhVar);
        return viewInflate;
    }

    @Override // defpackage.afke
    public final amig c() {
        akzx akzxVarM = amig.a.m();
        if (this.ak.c() && this.d != null) {
            akzx akzxVarM2 = defpackage.amie.a.m();
            int i = this.e;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).c = i;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).b = a.Q(3);
            java.lang.String str = this.d;
            akzxVarM2.u();
            defpackage.amie amieVar = (defpackage.amie) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            amieVar.d = str;
            defpackage.amie amieVar2 = (defpackage.amie) akzxVarM2.p();
            akzx akzxVarM3 = amid.a.m();
            akzxVarM3.u();
            amid amidVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(amieVar2);
            amidVar.c = amieVar2;
            amidVar.b |= 1;
            amid amidVarP = akzxVarM3.p();
            int i2 = this.a.e;
            akzxVarM.u();
            akzxVarM.b.d = i2;
            akzxVarM.u();
            amig amigVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(amidVarP);
            amigVar.c = amidVarP;
            amigVar.b = 4;
            long j = afjz.a;
        }
        return akzxVarM.p();
    }

    @Override // defpackage.afke
    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ak = (com.google.android.libraries.surveys.internal.model.QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ak == null) {
            this.ak = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
        }
    }

    public final void k(android.os.Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ak);
        android.widget.TextView textView = this.al;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.afke
    public final void p() {
        android.widget.TextView textView;
        this.ak.b();
        if (b() != null) {
            b().aY();
        }
        b().q(r(), this);
        if (!afjz.k(z()) || (textView = this.al) == null) {
            return;
        }
        textView.requestFocus();
        this.al.sendAccessibilityEvent(8);
    }

    @Override // defpackage.afke
    public final void q(java.lang.String str) {
        aehj aehjVar = afjy.c;
        if (afjy.b(anlc.d(afjy.b)) && (z() == null || this.al == null)) {
            return;
        }
        android.text.Spanned spannedF = yv.f(str);
        this.al.setText(spannedF);
        this.al.setContentDescription(spannedF.toString());
    }

    public final boolean r() {
        return this.d != null;
    }
}
