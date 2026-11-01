package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkh extends defpackage.aflj {
    private boolean[] ao;
    private android.view.ViewGroup ap;
    public com.google.android.libraries.surveys.internal.model.QuestionMetrics d;
    public defpackage.afpl e;

    public final void af(android.os.Bundle bundle) {
        super.af(bundle);
        b().q(t(), this);
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.afke
    public final amig c() {
        akzx akzxVarM = amig.a.m();
        if (this.d.c()) {
            akzx akzxVarM2 = amib.a.m();
            defpackage.amiv amivVar = this.a;
            amhn amhnVar = (amivVar.c == 5 ? (defpackage.amin) amivVar.d : defpackage.amin.a).c;
            if (amhnVar == null) {
                amhnVar = amhn.a;
            }
            alat alatVar = amhnVar.b;
            int i = 0;
            while (true) {
                boolean[] zArr = (boolean[]) this.e.b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    java.lang.Object obj = ((defpackage.amhm) alatVar.get(i)).e;
                    int iW = a.W(((defpackage.amhm) alatVar.get(i)).c);
                    int i2 = 4;
                    if (iW != 0 && iW == 4 && !android.text.TextUtils.isEmpty(this.e.a)) {
                        obj = this.e.a;
                    }
                    akzx akzxVarM3 = defpackage.amie.a.m();
                    int i3 = ((defpackage.amhm) alatVar.get(i)).d;
                    akzxVarM3.u();
                    ((defpackage.amie) akzxVarM3.b).c = i3;
                    akzxVarM3.u();
                    defpackage.amie amieVar = (defpackage.amie) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(obj);
                    amieVar.d = (java.lang.String) obj;
                    int iW2 = a.W(((defpackage.amhm) alatVar.get(i)).c);
                    if (iW2 == 0) {
                        iW2 = 1;
                    }
                    int i4 = iW2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    akzxVarM3.u();
                    ((defpackage.amie) akzxVarM3.b).b = a.Q(i2);
                    akzxVarM2.bg((defpackage.amie) akzxVarM3.p());
                    this.d.a();
                }
                int i5 = this.a.e;
                akzxVarM.u();
                akzxVarM.b.d = i5;
                amib amibVarP = akzxVarM2.p();
                akzxVarM.u();
                amig amigVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(amibVarP);
                amigVar.c = amibVarP;
                amigVar.b = 3;
                i++;
            }
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
            this.d = (com.google.android.libraries.surveys.internal.model.QuestionMetrics) bundle.getParcelable("QuestionMetrics");
            this.ao = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
        }
        boolean[] zArr = this.ao;
        defpackage.amiv amivVar = this.a;
        if (zArr == null) {
            amhn amhnVar = (amivVar.c == 5 ? (defpackage.amin) amivVar.d : defpackage.amin.a).c;
            if (amhnVar == null) {
                amhnVar = amhn.a;
            }
            this.ao = new boolean[amhnVar.b.size()];
            return;
        }
        amhn amhnVar2 = (amivVar.c == 5 ? (defpackage.amin) amivVar.d : defpackage.amin.a).c;
        if (amhnVar2 == null) {
            amhnVar2 = amhn.a;
        }
        if (zArr.length != amhnVar2.b.size()) {
            android.util.Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.ao.length);
            defpackage.amiv amivVar2 = this.a;
            amhn amhnVar3 = (amivVar2.c == 5 ? (defpackage.amin) amivVar2.d : defpackage.amin.a).c;
            if (amhnVar3 == null) {
                amhnVar3 = amhn.a;
            }
            this.ao = new boolean[amhnVar3.b.size()];
        }
    }

    @Override // defpackage.aflj
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.ao);
    }

    @Override // defpackage.aflj, defpackage.afke
    public final void p() {
        super.p();
        this.d.b();
        defpackage.aflw aflwVarB = b();
        if (aflwVarB != null) {
            aflwVarB.q(t(), this);
        }
    }

    @Override // defpackage.aflj
    public final android.view.View r() {
        this.ap = (android.widget.LinearLayout) android.view.LayoutInflater.from(z()).inflate(2131624652, (android.view.ViewGroup) null).findViewById(2131429154);
        defpackage.afkk afkkVar = new defpackage.afkk(z());
        afkkVar.c = new defpackage.afkv(this, 1);
        defpackage.amiv amivVar = this.a;
        afkkVar.a(amivVar.c == 5 ? (defpackage.amin) amivVar.d : defpackage.amin.a, this.ao);
        this.ap.addView(afkkVar);
        return this.ap;
    }

    @Override // defpackage.aflj
    public final java.lang.String s() {
        boolean zIsEmpty = this.a.g.isEmpty();
        defpackage.amiv amivVar = this.a;
        return zIsEmpty ? amivVar.f : amivVar.g;
    }

    public final boolean t() {
        defpackage.afpl afplVar = this.e;
        if (afplVar == null) {
            return false;
        }
        return afplVar.e();
    }
}
