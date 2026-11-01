package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflv {
    public static aigf a;
    public defpackage.amip b;
    public amje c;
    public com.google.android.libraries.surveys.internal.view.SurveyViewPager d;
    public com.google.android.libraries.surveys.internal.model.Answer e;
    public android.widget.ScrollView g;
    public com.google.android.material.card.MaterialCardView h;
    public android.widget.LinearLayout i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public java.lang.Integer r;
    public boolean s;
    public defpackage.afiz t;
    public final android.app.Activity u;
    public final defpackage.aflw v;
    public final bo w;
    public defpackage.wyw x;
    public android.os.Bundle f = new android.os.Bundle();
    public final android.os.Handler p = new android.os.Handler();
    public final java.lang.Runnable q = new defpackage.aflt(this, 0);

    public aflv(android.app.Activity activity, bo boVar, defpackage.aflw aflwVar) {
        this.u = activity;
        this.w = boVar;
        this.v = aflwVar;
    }

    private final void q() {
        if (this.d.D() || !aehj.x(a(), this.b, this.e)) {
            t();
        } else {
            s(((androidx.viewpager.widget.ViewPager) this.d).d + 1);
        }
    }

    private final void r(android.view.ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof android.view.ViewGroup) {
                r((android.view.ViewGroup) childAt, z);
            } else if (childAt.getId() == 2131429166 && z) {
                b(2131429166).setEnabled(this.k);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    private final void s(int i) {
        aehj aehjVar = afjy.c;
        if (afjy.b(anlc.d(afjy.b))) {
            j(m());
        }
        h();
        o(5);
        this.d.A(i);
        l();
        k();
        ((aw) this.d.x()).Q.sendAccessibilityEvent(32);
        long j = afjz.a;
    }

    private final void t() {
        long j = afjz.a;
        o(5);
        this.j = true;
        i(false);
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity activity = this.u;
        activity.setResult(-1, intent);
        aehj aehjVar = afjy.c;
        if (!afjy.c(defpackage.anlf.c(afjy.b))) {
            this.d.z();
            return;
        }
        if (this.t == defpackage.afiz.a) {
            this.d.z();
            return;
        }
        this.h.setVisibility(8);
        defpackage.afiz afizVar = this.t;
        if (afizVar != defpackage.afiz.b) {
            if (afizVar == defpackage.afiz.c) {
                android.util.Log.v("SurveyActivityImpl", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
                activity.finish();
                return;
            }
            return;
        }
        android.view.View viewFindViewById = activity.getWindow().findViewById(android.R.id.content);
        defpackage.amhw amhwVar = this.b.d;
        if (amhwVar == null) {
            amhwVar = defpackage.amhw.b;
        }
        defpackage.agby.q(viewFindViewById, amhwVar.c, -1).h();
        e();
    }

    public final int a() {
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = ((androidx.viewpager.widget.ViewPager) surveyViewPager).d;
        if (afjy.a()) {
            return i + this.l;
        }
        return this.s ? i + 1 : i;
    }

    public final android.view.View b(int i) {
        return this.u.findViewById(i);
    }

    public final afjj c() {
        java.lang.String stringExtra = this.u.getIntent().getStringExtra("TriggerId");
        amje amjeVar = this.c;
        if (amjeVar == null || stringExtra == null) {
            long j = afjz.a;
            return null;
        }
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        aliqVar.i(amjeVar.b);
        aliqVar.k(stringExtra);
        aliqVar.j(defpackage.afjk.b);
        return aliqVar.h();
    }

    public final amig d() {
        return this.e.a;
    }

    public final void e() {
        this.u.setResult(-1, new android.content.Intent());
        this.p.postDelayed(this.q, 2400L);
    }

    public final void f() {
        int iAb;
        int iAb2;
        int iAb3;
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.C()) {
            defpackage.amil amilVar = this.b.c;
            if (amilVar == null) {
                amilVar = defpackage.amil.a;
            }
            if (!amilVar.b) {
                o(3);
            }
        }
        afjz.h(this.i);
        p();
        afjj afjjVarC = c();
        if (afjjVarC != null) {
            int iAb4 = a.ab(((defpackage.amiv) this.b.g.get(a())).i);
            if (iAb4 == 0) {
                iAb4 = 1;
            }
            int i = iAb4 - 2;
            if (i == 1) {
                amig amigVarY = this.d.y();
                defpackage.amie amieVar = (amigVarY.b == 2 ? (amif) amigVarY.c : amif.a).c;
                if (amieVar == null) {
                    amieVar = defpackage.amie.a;
                }
                int i2 = amieVar.c;
                defpackage.aprf.w(aehj.b, afjjVarC);
            } else if (i == 2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                amig amigVarY2 = this.d.y();
                java.util.Iterator it = (amigVarY2.b == 3 ? (amib) amigVarY2.c : amib.a).b.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((defpackage.amie) it.next()).c - 1));
                }
                defpackage.aprf aprfVar = aehj.b;
                aify.n(arrayList);
                defpackage.aprf.w(aprfVar, afjjVarC);
            } else if (i == 3) {
                amig amigVarY3 = this.d.y();
                defpackage.amie amieVar2 = (amigVarY3.b == 4 ? (amid) amigVarY3.c : amid.a).c;
                if (amieVar2 == null) {
                    amieVar2 = defpackage.amie.a;
                }
                int i3 = amieVar2.c;
                defpackage.aprf.w(aehj.b, afjjVarC);
            } else if (i == 4) {
                defpackage.aprf.w(aehj.b, afjjVarC);
            }
        }
        aehj aehjVar = afjy.c;
        if (!afjy.b(anlc.d(afjy.b))) {
            defpackage.amiv amivVar = (defpackage.amiv) this.b.g.get(a());
            if (m() && (iAb3 = a.ab(amivVar.i)) != 0 && iAb3 == 5) {
                j(true);
            }
        }
        amig amigVarY4 = this.d.y();
        if (amigVarY4 != null) {
            this.e.a = amigVarY4;
        }
        if (!afjy.a()) {
            q();
            return;
        }
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager2 = this.d;
        if (surveyViewPager2 == null) {
            q();
            return;
        }
        defpackage.amiv amivVar2 = surveyViewPager2.x().a;
        defpackage.amiu amiuVar = amivVar2.k;
        if (amiuVar == null) {
            amiuVar = defpackage.amiu.a;
        }
        if ((amiuVar.b & 1) != 0) {
            defpackage.amiu amiuVar2 = amivVar2.k;
            if (amiuVar2 == null) {
                amiuVar2 = defpackage.amiu.a;
            }
            amho amhoVar = amiuVar2.d;
            if (amhoVar == null) {
                amhoVar = amho.a;
            }
            int iW = a.W(amhoVar.b);
            if (iW != 0 && iW == 5) {
                t();
                return;
            }
        }
        aehj aehjVar2 = afjy.c;
        int iL = 0;
        if (afjy.c(anke.d(afjy.b)) && (iAb2 = a.ab(amivVar2.i)) != 0 && iAb2 == 5) {
            amig amigVarY5 = this.d.y();
            defpackage.amie amieVar3 = (amigVarY5.b == 4 ? (amid) amigVarY5.c : amid.a).c;
            if (amieVar3 == null) {
                amieVar3 = defpackage.amie.a;
            }
            int iF = new xm((char[]) null, (byte[]) null).f(a, this.b.g.size(), amieVar3.c, amivVar2);
            if (iF == -1) {
                q();
                return;
            } else if (iF - 1 == this.b.g.size()) {
                t();
                return;
            } else {
                defpackage.afmc afmcVar = ((androidx.viewpager.widget.ViewPager) this.d).c;
                s(afmcVar != null ? afmcVar.l(iF) : 0);
                return;
            }
        }
        aehj aehjVar3 = afjy.c;
        if (!afjy.c(anke.c(afjy.b)) || (iAb = a.ab(amivVar2.i)) == 0 || iAb != 3) {
            q();
            return;
        }
        defpackage.amhm amhmVar = defpackage.amhm.a;
        amhn amhnVar = (amivVar2.c == 4 ? (defpackage.amjf) amivVar2.d : defpackage.amjf.a).c;
        if (amhnVar == null) {
            amhnVar = amhn.a;
        }
        for (defpackage.amhm amhmVar2 : amhnVar.b) {
            int i4 = amhmVar2.d;
            amig amigVarY6 = this.d.y();
            defpackage.amie amieVar4 = (amigVarY6.b == 2 ? (amif) amigVarY6.c : amif.a).c;
            if (amieVar4 == null) {
                amieVar4 = defpackage.amie.a;
            }
            if (i4 == amieVar4.c) {
                amhmVar = amhmVar2;
                break;
            }
        }
        if (((amivVar2.c == 4 ? (defpackage.amjf) amivVar2.d : defpackage.amjf.a).b & 1) == 0 || (amhmVar.b & 1) == 0) {
            q();
            return;
        }
        amho amhoVar2 = amhmVar.g;
        if (amhoVar2 == null) {
            amhoVar2 = amho.a;
        }
        int iW2 = a.W(amhoVar2.b);
        int i5 = (iW2 != 0 ? iW2 : 1) - 2;
        if (i5 != 2) {
            if (i5 != 3) {
                q();
                return;
            } else {
                t();
                return;
            }
        }
        amho amhoVar3 = amhmVar.g;
        if (amhoVar3 == null) {
            amhoVar3 = amho.a;
        }
        java.lang.String str = amhoVar3.c;
        defpackage.afmc afmcVar2 = ((androidx.viewpager.widget.ViewPager) this.d).c;
        if (afmcVar2 != null && a.containsKey(str)) {
            iL = afmcVar2.l(((java.lang.Integer) a.get(str)).intValue());
        }
        s(iL);
    }

    public final void g(boolean z) {
        this.i.setDescendantFocusability(true != z ? 262144 : 393216);
        this.i.setAlpha(true != z ? 1.0f : 0.4f);
        if (z) {
            this.k = b(2131429166).isEnabled();
        }
        r(this.i, !z);
    }

    public final void h() {
        int iAc = a.ac(d().b);
        if (iAc == 0) {
            throw null;
        }
        if (iAc == 1) {
            android.os.Bundle bundle = this.f;
            java.lang.String strValueOf = java.lang.String.valueOf(d().d);
            amig amigVarD = d();
            defpackage.amie amieVar = (amigVarD.b == 2 ? (amif) amigVarD.c : amif.a).c;
            if (amieVar == null) {
                amieVar = defpackage.amie.a;
            }
            bundle.putString(strValueOf, amieVar.d);
        }
    }

    public final void i(boolean z) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        this.k = z;
    }

    public final void j(boolean z) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton == null || !this.d.D() || this.m) {
            return;
        }
        materialButton.setText(2132020358);
    }

    public final void l() {
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null || !surveyViewPager.E()) {
            defpackage.amiv amivVar = (defpackage.amiv) this.b.g.get(a());
            java.lang.String str = amivVar.g.isEmpty() ? amivVar.f : amivVar.g;
            int size = amivVar.h.size();
            java.lang.String[] strArr = new java.lang.String[size];
            java.lang.String[] strArr2 = new java.lang.String[size];
            for (int i = 0; i < size; i++) {
                defpackage.amjh amjhVar = (defpackage.amjh) amivVar.h.get(i);
                int i2 = amjhVar.b;
                if (amjk.b(i2) == 3) {
                    int i3 = (i2 == 2 ? (defpackage.amjg) amjhVar.c : defpackage.amjg.a).b;
                    java.lang.String string = this.f.getString(java.lang.String.valueOf(i3));
                    if (string != null) {
                        strArr[i] = amjhVar.d;
                        strArr2[i] = string;
                    } else {
                        android.util.Log.e("SurveyActivityImpl", a.bs(i3, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.d.B(android.text.TextUtils.replace(str, strArr, strArr2).toString());
        }
    }

    public final boolean m() {
        return afjz.n(this.b);
    }

    public final boolean n(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.h.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.j) {
                long j = afjz.a;
                this.u.finish();
                return true;
            }
        }
        aehj aehjVar = afjy.c;
        android.app.Activity activity = this.u;
        if (ankq.c(activity)) {
            return false;
        }
        return activity.onTouchEvent(motionEvent);
    }

    public final void o(int i) {
        com.google.android.libraries.surveys.internal.model.Answer answer = this.e;
        answer.g = i;
        this.x.h(answer, afjz.l(this.b));
    }

    public final void p() {
        b(2131429158).setVisibility(8);
        b(2131429159).setVisibility(8);
    }
}
