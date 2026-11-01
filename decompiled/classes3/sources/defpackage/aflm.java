package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflm extends defpackage.aflj {
    public int ao;
    private android.widget.LinearLayout ap;
    private com.google.android.libraries.surveys.internal.model.QuestionMetrics aq;
    public java.lang.String d;
    public int e = -1;

    @Override // defpackage.afke
    public final amig c() {
        akzx akzxVarM = amig.a.m();
        if (this.aq.c() && this.d != null) {
            this.aq.a();
            akzx akzxVarM2 = defpackage.amie.a.m();
            int i = this.e;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).c = i;
            int i2 = this.ao;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).b = a.Q(i2);
            java.lang.String str = this.d;
            akzxVarM2.u();
            defpackage.amie amieVar = (defpackage.amie) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            amieVar.d = str;
            defpackage.amie amieVar2 = (defpackage.amie) akzxVarM2.p();
            akzx akzxVarM3 = amif.a.m();
            akzxVarM3.u();
            amif amifVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(amieVar2);
            amifVar.c = amieVar2;
            amifVar.b |= 1;
            amif amifVarP = akzxVarM3.p();
            akzxVarM.u();
            amig amigVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(amifVarP);
            amigVar.c = amifVarP;
            amigVar.b = 2;
            int i3 = this.a.e;
            akzxVarM.u();
            akzxVarM.b.d = i3;
        }
        return akzxVarM.p();
    }

    @Override // defpackage.afke
    public final void f() {
        if (this.ap != null) {
            int i = 0;
            while (i < this.ap.getChildCount()) {
                android.view.View childAt = this.ap.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.afke
    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.aq = (com.google.android.libraries.surveys.internal.model.QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.aq == null) {
            this.aq = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
        }
    }

    @Override // defpackage.aflj
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.aq);
    }

    @Override // defpackage.aflj, defpackage.afke
    public final void p() {
        android.widget.EditText editText;
        super.p();
        this.aq.b();
        defpackage.aflw aflwVarB = b();
        if (aflwVarB != null) {
            android.widget.LinearLayout linearLayout = this.ap;
            boolean z = false;
            if (linearLayout != null && (editText = (android.widget.EditText) linearLayout.findViewById(2131429169)) != null && editText.hasFocus()) {
                z = true;
            }
            aflwVarB.q(z, this);
        }
    }

    @Override // defpackage.aflj
    public final android.view.View r() {
        android.view.View viewInflate = android.view.LayoutInflater.from(z()).inflate(2131624652, (android.view.ViewGroup) null);
        this.ap = (android.widget.LinearLayout) viewInflate.findViewById(2131429154);
        defpackage.aflq aflqVar = new defpackage.aflq(z());
        aflqVar.a = new defpackage.aflp() { // from class: afll
            @Override // defpackage.aflp
            public final void a(aogw aogwVar) {
                defpackage.aflm aflmVar = this.a;
                defpackage.aflw aflwVarB = aflmVar.b();
                if (aflwVarB == null) {
                    android.util.Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                int i = aogwVar.a;
                aflmVar.ao = i;
                aflmVar.d = (java.lang.String) aogwVar.c;
                aflmVar.e = aogwVar.b;
                if (i == 4) {
                    aflwVarB.t(true);
                } else {
                    aflwVarB.p();
                }
            }
        };
        defpackage.amiv amivVar = this.a;
        aflqVar.a(amivVar.c == 4 ? (defpackage.amjf) amivVar.d : defpackage.amjf.a);
        this.ap.addView(aflqVar);
        if (!b().aX()) {
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), dX().getDimensionPixelSize(2131167812));
        }
        return viewInflate;
    }

    @Override // defpackage.aflj
    public final java.lang.String s() {
        boolean zIsEmpty = this.a.g.isEmpty();
        defpackage.amiv amivVar = this.a;
        return zIsEmpty ? amivVar.f : amivVar.g;
    }
}
