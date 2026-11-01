package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afko extends defpackage.aflj {
    public java.lang.String d;
    private com.google.android.libraries.surveys.internal.model.QuestionMetrics e;

    private final defpackage.afkq t(java.lang.String str) {
        defpackage.afkq afkqVar = new defpackage.afkq(z());
        ((android.widget.EditText) afkqVar.findViewById(2131429167)).setText(str);
        defpackage.amiv amivVar = this.a;
        afkqVar.a(amivVar.c == 7 ? (defpackage.amio) amivVar.d : defpackage.amio.a);
        afkqVar.a = new defpackage.afku(this, 1);
        return afkqVar;
    }

    public final void af(android.os.Bundle bundle) {
        super.af(bundle);
        defpackage.aflw aflwVarB = b();
        if (aflwVarB != null) {
            aflwVarB.q(true, this);
        }
    }

    @Override // defpackage.afke
    public final amig c() {
        akzx akzxVarM = amig.a.m();
        if (this.e.c()) {
            this.e.a();
            java.lang.String strCo = ahvr.co(this.d);
            akzx akzxVarM2 = amic.a.m();
            akzxVarM2.u();
            amic amicVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(strCo);
            amicVar.b = strCo;
            amic amicVarP = akzxVarM2.p();
            int i = this.a.e;
            akzxVarM.u();
            akzxVarM.b.d = i;
            akzxVarM.u();
            amig amigVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(amicVarP);
            amigVar.c = amicVarP;
            amigVar.b = 5;
        }
        return akzxVarM.p();
    }

    @Override // defpackage.afke
    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.e = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
        } else {
            this.e = (com.google.android.libraries.surveys.internal.model.QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.aflj
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.View view;
        super.onConfigurationChanged(configuration);
        aehj aehjVar = afjy.c;
        if (ankw.a.b().a(z()) && configuration.orientation == 2 && (view = ((aw) this).Q) != null) {
            android.widget.EditText editText = (android.widget.EditText) view.findViewById(2131429167);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(2131429154);
            if (linearLayout == null || editText == null) {
                return;
            }
            linearLayout.removeAllViews();
            linearLayout.addView(t(editText.getText().toString()));
        }
    }

    @Override // defpackage.aflj, defpackage.afke
    public final void p() {
        super.p();
        this.e.b();
        defpackage.aflw aflwVarB = b();
        if (aflwVarB != null) {
            aflwVarB.q(true, this);
        }
    }

    @Override // defpackage.aflj
    public final android.view.View r() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(z()).inflate(2131624652, (android.view.ViewGroup) null).findViewById(2131429154);
        linearLayout.addView(t(""));
        return linearLayout;
    }

    @Override // defpackage.aflj
    public final java.lang.String s() {
        boolean zIsEmpty = this.a.g.isEmpty();
        defpackage.amiv amivVar = this.a;
        return zIsEmpty ? amivVar.f : amivVar.g;
    }
}
