package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjf {
    public android.view.View a;
    public final java.util.Set b = new java.util.HashSet();
    public final defpackage.amip c;
    public final android.view.LayoutInflater d;
    public com.google.android.libraries.surveys.internal.view.SurveyViewPager e;
    public final com.google.android.libraries.surveys.internal.model.Answer f;
    public final android.os.Bundle g;
    public final com.google.android.material.card.MaterialCardView h;
    public final android.widget.LinearLayout i;
    public boolean j;
    public final defpackage.afma k;
    public final defpackage.aflw l;
    public final bo m;
    private aigf n;
    private final defpackage.wyw o;

    public afjf(android.view.LayoutInflater layoutInflater, bo boVar, defpackage.aflw aflwVar, defpackage.afma afmaVar) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(layoutInflater.getContext(), 2132085218);
        if (afmaVar.n != 0) {
            contextThemeWrapper.getTheme().applyStyle(afmaVar.n, true);
        }
        android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.d = layoutInflaterCloneInContext;
        this.a = layoutInflaterCloneInContext.inflate(2131624633, (android.view.ViewGroup) null, false);
        this.m = boVar;
        defpackage.amip amipVar = afmaVar.a;
        this.c = amipVar;
        this.f = afmaVar.b;
        this.j = afmaVar.c;
        this.k = afmaVar;
        this.l = aflwVar;
        this.g = afmaVar.m;
        java.util.HashMap map = new java.util.HashMap();
        for (defpackage.amiv amivVar : amipVar.g) {
            if ((amivVar.b & 1) != 0) {
                defpackage.amiu amiuVar = amivVar.k;
                if (!map.containsKey((amiuVar == null ? defpackage.amiu.a : amiuVar).c)) {
                    defpackage.amiu amiuVar2 = amivVar.k;
                    map.put((amiuVar2 == null ? defpackage.amiu.a : amiuVar2).c, java.lang.Integer.valueOf(amivVar.e - 1));
                }
            }
        }
        this.n = aigf.i(map);
        this.o = new defpackage.wyw(a(), afmaVar.e, afmaVar.f);
        this.i = (android.widget.LinearLayout) b(2131429156);
        this.h = (com.google.android.material.card.MaterialCardView) b(2131429172);
    }

    private final void o() {
        if (this.e.D() || !aehj.x(d(), this.c, this.f)) {
            q();
        } else {
            p(((androidx.viewpager.widget.ViewPager) this.e).d + 1);
        }
    }

    private final void p(int i) {
        aehj aehjVar = afjy.c;
        if (afjy.b(anlc.d(afjy.b))) {
            j(l());
        }
        int iAc = a.ac(f().b);
        if (iAc == 0) {
            throw null;
        }
        if (iAc == 1) {
            android.os.Bundle bundle = this.g;
            java.lang.String strValueOf = java.lang.String.valueOf(f().d);
            amig amigVarF = f();
            defpackage.amie amieVar = (amigVarF.b == 2 ? (amif) amigVarF.c : amif.a).c;
            if (amieVar == null) {
                amieVar = defpackage.amie.a;
            }
            bundle.putString(strValueOf, amieVar.d);
        }
        m(5);
        this.e.A(i);
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null || !surveyViewPager.E()) {
            defpackage.amiv amivVar = (defpackage.amiv) this.c.g.get(d());
            java.lang.String str = amivVar.g.isEmpty() ? amivVar.f : amivVar.g;
            int size = amivVar.h.size();
            java.lang.String[] strArr = new java.lang.String[size];
            java.lang.String[] strArr2 = new java.lang.String[size];
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.amjh amjhVar = (defpackage.amjh) amivVar.h.get(i2);
                int i3 = amjhVar.b;
                if (amjk.b(i3) == 3) {
                    defpackage.amjg amjgVar = i3 == 2 ? (defpackage.amjg) amjhVar.c : defpackage.amjg.a;
                    android.os.Bundle bundle2 = this.g;
                    int i4 = amjgVar.b;
                    java.lang.String string = bundle2.getString(java.lang.String.valueOf(i4));
                    if (string != null) {
                        strArr[i2] = amjhVar.d;
                        strArr2[i2] = string;
                    } else {
                        android.util.Log.e("SurveyContainer", a.bs(i4, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.e.B(android.text.TextUtils.replace(str, strArr, strArr2).toString());
        }
        k();
        ((aw) this.e.x()).Q.sendAccessibilityEvent(32);
        long j = afjz.a;
    }

    private final void q() {
        long j = afjz.a;
        m(5);
        this.j = true;
        h(false);
        java.util.Iterator it = c().iterator();
        while (it.hasNext()) {
            ((defpackage.afly) it.next()).s();
        }
        aehj aehjVar = afjy.c;
        if (!afjy.c(defpackage.anlf.c(afjy.b))) {
            this.e.z();
            return;
        }
        if (this.k.i == defpackage.afiz.a) {
            this.e.z();
            return;
        }
        b(2131429162).setVisibility(8);
        for (defpackage.afly aflyVar : c()) {
            defpackage.amhw amhwVar = this.c.d;
            if (amhwVar == null) {
                amhwVar = defpackage.amhw.b;
            }
            aflyVar.aU(amhwVar.c);
        }
    }

    public final android.content.Context a() {
        return this.a.getContext();
    }

    public final android.view.View b(int i) {
        return this.a.findViewById(i);
    }

    public final java.util.Set c() {
        return aihd.o(this.b);
    }

    public final int d() {
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = ((androidx.viewpager.widget.ViewPager) surveyViewPager).d;
        return afjy.a() ? i + this.k.g : i;
    }

    public final afjj e() {
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        defpackage.afma afmaVar = this.k;
        aliqVar.i(afmaVar.f.b);
        aliqVar.k(afmaVar.e);
        aliqVar.j(afmaVar.l);
        return aliqVar.h();
    }

    public final amig f() {
        return this.f.a;
    }

    public final void g() {
        int iAb;
        int iAb2;
        int iAb3;
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null && surveyViewPager.C()) {
            defpackage.amil amilVar = this.c.c;
            if (amilVar == null) {
                amilVar = defpackage.amil.a;
            }
            if (!amilVar.b) {
                m(3);
            }
        }
        afjz.h(this.i);
        n();
        afjj afjjVarE = e();
        defpackage.amip amipVar = this.c;
        int iAb4 = a.ab(((defpackage.amiv) amipVar.g.get(d())).i);
        if (iAb4 == 0) {
            iAb4 = 1;
        }
        int i = iAb4 - 2;
        if (i == 1) {
            amig amigVarY = this.e.y();
            defpackage.amie amieVar = (amigVarY.b == 2 ? (amif) amigVarY.c : amif.a).c;
            if (amieVar == null) {
                amieVar = defpackage.amie.a;
            }
            int i2 = amieVar.c;
            defpackage.aprf.w(aehj.b, afjjVarE);
        } else if (i == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            amig amigVarY2 = this.e.y();
            java.util.Iterator it = (amigVarY2.b == 3 ? (amib) amigVarY2.c : amib.a).b.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((defpackage.amie) it.next()).c - 1));
            }
            defpackage.aprf aprfVar = aehj.b;
            aify.n(arrayList);
            defpackage.aprf.w(aprfVar, afjjVarE);
        } else if (i == 3) {
            amig amigVarY3 = this.e.y();
            defpackage.amie amieVar2 = (amigVarY3.b == 4 ? (amid) amigVarY3.c : amid.a).c;
            if (amieVar2 == null) {
                amieVar2 = defpackage.amie.a;
            }
            int i3 = amieVar2.c;
            defpackage.aprf.w(aehj.b, afjjVarE);
        } else if (i == 4) {
            defpackage.aprf.w(aehj.b, afjjVarE);
        }
        aehj aehjVar = afjy.c;
        if (!afjy.b(anlc.d(afjy.b))) {
            defpackage.amiv amivVar = (defpackage.amiv) amipVar.g.get(d());
            if (l() && (iAb3 = a.ab(amivVar.i)) != 0 && iAb3 == 5) {
                j(true);
            }
        }
        amig amigVarY4 = this.e.y();
        if (amigVarY4 != null) {
            this.f.a = amigVarY4;
        }
        if (!afjy.a()) {
            o();
            return;
        }
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager2 = this.e;
        if (surveyViewPager2 == null) {
            o();
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
                q();
                return;
            }
        }
        aehj aehjVar2 = afjy.c;
        int iL = 0;
        if (afjy.c(anke.d(afjy.b)) && (iAb2 = a.ab(amivVar2.i)) != 0 && iAb2 == 5) {
            amig amigVarY5 = this.e.y();
            defpackage.amie amieVar3 = (amigVarY5.b == 4 ? (amid) amigVarY5.c : amid.a).c;
            if (amieVar3 == null) {
                amieVar3 = defpackage.amie.a;
            }
            int iF = new xm((char[]) null, (byte[]) null).f(this.n, amipVar.g.size(), amieVar3.c, amivVar2);
            if (iF == -1) {
                o();
                return;
            } else if (iF - 1 == amipVar.g.size()) {
                q();
                return;
            } else {
                defpackage.afmc afmcVar = ((androidx.viewpager.widget.ViewPager) this.e).c;
                p(afmcVar != null ? afmcVar.l(iF) : 0);
                return;
            }
        }
        aehj aehjVar3 = afjy.c;
        if (!afjy.c(anke.c(afjy.b)) || (iAb = a.ab(amivVar2.i)) == 0 || iAb != 3) {
            o();
            return;
        }
        defpackage.amhm amhmVar = defpackage.amhm.a;
        amhn amhnVar = (amivVar2.c == 4 ? (defpackage.amjf) amivVar2.d : defpackage.amjf.a).c;
        if (amhnVar == null) {
            amhnVar = amhn.a;
        }
        for (defpackage.amhm amhmVar2 : amhnVar.b) {
            int i4 = amhmVar2.d;
            amig amigVarY6 = this.e.y();
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
            o();
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
                o();
                return;
            } else {
                q();
                return;
            }
        }
        amho amhoVar3 = amhmVar.g;
        if (amhoVar3 == null) {
            amhoVar3 = amho.a;
        }
        java.lang.String str = amhoVar3.c;
        defpackage.afmc afmcVar2 = ((androidx.viewpager.widget.ViewPager) this.e).c;
        if (afmcVar2 != null && this.n.containsKey(str)) {
            iL = afmcVar2.l(((java.lang.Integer) this.n.get(str)).intValue());
        }
        p(iL);
    }

    public final void h(boolean z) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    public final void i(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        defpackage.aflu afluVar = new defpackage.aflu(this, str, 2);
        defpackage.amip amipVar = this.c;
        defpackage.amim amimVar = amipVar.i;
        if (amimVar == null) {
            amimVar = defpackage.amim.a;
        }
        java.lang.String str4 = null;
        if ((amimVar.b & 1) == 0) {
            str2 = null;
        } else {
            defpackage.amim amimVar2 = amipVar.i;
            if (amimVar2 == null) {
                amimVar2 = defpackage.amim.a;
            }
            if (amimVar2.c.length() > 0) {
                defpackage.amim amimVar3 = amipVar.i;
                if (amimVar3 == null) {
                    amimVar3 = defpackage.amim.a;
                }
                str2 = amimVar3.c;
            } else {
                str2 = null;
            }
        }
        defpackage.amim amimVar4 = amipVar.i;
        if (((amimVar4 == null ? defpackage.amim.a : amimVar4).b & 2) == 0) {
            str3 = null;
        } else {
            if (amimVar4 == null) {
                amimVar4 = defpackage.amim.a;
            }
            if (amimVar4.d.length() > 0) {
                defpackage.amim amimVar5 = amipVar.i;
                if (amimVar5 == null) {
                    amimVar5 = defpackage.amim.a;
                }
                str3 = amimVar5.d;
            } else {
                str3 = null;
            }
        }
        defpackage.amim amimVar6 = amipVar.i;
        if (((amimVar6 == null ? defpackage.amim.a : amimVar6).b & 4) != 0) {
            if (amimVar6 == null) {
                amimVar6 = defpackage.amim.a;
            }
            if (amimVar6.e.length() > 0) {
                defpackage.amim amimVar7 = amipVar.i;
                if (amimVar7 == null) {
                    amimVar7 = defpackage.amim.a;
                }
                str4 = amimVar7.e;
            }
        }
        aehj.H(this.l.b(), (android.widget.TextView) b(2131429159), str, str2, str3, str4, afluVar);
    }

    public final void j(boolean z) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) b(2131429166);
        if (materialButton == null || !this.e.D()) {
            return;
        }
        materialButton.setText(2132020358);
    }

    public final boolean l() {
        return afjz.n(this.c);
    }

    public final void m(int i) {
        com.google.android.libraries.surveys.internal.model.Answer answer = this.f;
        answer.g = i;
        this.o.h(answer, afjz.l(this.c));
    }

    public final void n() {
        b(2131429158).setVisibility(8);
        b(2131429159).setVisibility(8);
    }
}
