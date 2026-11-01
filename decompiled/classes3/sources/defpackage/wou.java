package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wou implements defpackage.wot {
    private java.util.List a;
    private java.util.List b;
    private boolean c;

    public wou() {
        aokc aokcVar = aokc.a;
        this.a = aokcVar;
        this.b = aokcVar;
    }

    @Override // defpackage.wot
    public final defpackage.wos a(defpackage.wos wosVar) {
        aooh.f(wosVar, "model");
        defpackage.vqf vqfVarP = wsc.P(wosVar.p());
        defpackage.vqu vquVarR = wsc.R(vqfVarP.f().p());
        akzx akzxVar = (akzx) vquVarR.a;
        defpackage.wpf wpfVar = ((defpackage.wpg) akzxVar.b).e;
        if (wpfVar == null) {
            wpfVar = defpackage.wpf.a;
        }
        aooh.e(wpfVar, "getTranscript(...)");
        akzx akzxVarP = wpfVar.p();
        aooh.f(akzxVarP, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.wpf) akzxVarP.b).b);
        aooh.e(listUnmodifiableList, "getCurrentSessionTreeItemsList(...)");
        new alct(listUnmodifiableList);
        java.util.List list = this.a;
        aooh.f(list, "values");
        akzxVarP.u();
        defpackage.wpf wpfVar2 = (defpackage.wpf) akzxVarP.b;
        alat alatVar = wpfVar2.b;
        if (!alatVar.c()) {
            wpfVar2.b = alad.J(alatVar);
        }
        akyl.i(list, wpfVar2.b);
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.wpf) akzxVarP.b).c);
        aooh.e(listUnmodifiableList2, "getCompletedSessionsTranscriptsList(...)");
        new alct(listUnmodifiableList2);
        java.util.List<java.util.List> list2 = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list2, 10));
        for (java.util.List list3 : list2) {
            akzx akzxVarM = defpackage.wpe.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((defpackage.wpe) akzxVarM.b).b);
            aooh.e(listUnmodifiableList3, "getTreeItemsList(...)");
            new alct(listUnmodifiableList3);
            aooh.f(list3, "values");
            akzxVarM.u();
            defpackage.wpe wpeVar = (defpackage.wpe) akzxVarM.b;
            alat alatVar2 = wpeVar.b;
            if (!alatVar2.c()) {
                wpeVar.b = alad.J(alatVar2);
            }
            akyl.i(list3, wpeVar.b);
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            arrayList.add((defpackage.wpe) aladVarP);
        }
        akzxVarP.u();
        defpackage.wpf wpfVar3 = (defpackage.wpf) akzxVarP.b;
        alat alatVar3 = wpfVar3.c;
        if (!alatVar3.c()) {
            wpfVar3.c = alad.J(alatVar3);
        }
        akyl.i(arrayList, wpfVar3.c);
        boolean z = this.c;
        akzxVarP.u();
        ((defpackage.wpf) akzxVarP.b).d = z;
        alad aladVarP2 = akzxVarP.p();
        aooh.e(aladVarP2, "build(...)");
        defpackage.wpf wpfVar4 = (defpackage.wpf) aladVarP2;
        aooh.f(wpfVar4, "value");
        akzxVar.u();
        defpackage.wpg wpgVar = (defpackage.wpg) akzxVar.b;
        j$.util.Objects.requireNonNull(wpfVar4);
        wpgVar.e = wpfVar4;
        wpgVar.b |= 2;
        vqfVarP.g(vquVarR.q());
        return vqfVarP.e();
    }

    @Override // defpackage.wot
    public final void b(defpackage.wor worVar) {
        boolean z;
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int i = worVar.b;
        int iH = wsc.H(i);
        if (iH == 0) {
            throw null;
        }
        int i2 = iH - 1;
        if (i2 == 5) {
            alat alatVar = (i == 6 ? (defpackage.wog) worVar.c : defpackage.wog.a).b;
            aooh.e(alatVar, "getTreeItemsList(...)");
            this.a = alatVar;
        } else {
            if (i2 == 6) {
                java.util.List listCb = ajsz.cb(this.b);
                listCb.add(this.a);
                this.b = ajsz.bZ(listCb);
                this.a = aokc.a;
                return;
            }
            if (i2 == 7) {
                z = false;
            } else {
                if (i2 != 20) {
                    throw new java.lang.IllegalStateException("Unsupported Action");
                }
                z = true;
            }
            this.c = z;
        }
    }

    @Override // defpackage.wot
    public final int c(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        int i = worVar.b;
        int iH = wsc.H(i);
        if (iH == 0) {
            throw null;
        }
        int i2 = iH - 1;
        if (i2 == 5) {
            if (aooh.n((i == 6 ? (defpackage.wog) worVar.c : defpackage.wog.a).b, this.a)) {
                return 3;
            }
        } else if (i2 != 6) {
            if (i2 != 7) {
                if (i2 != 20) {
                    return 1;
                }
                if (this.c) {
                    return 3;
                }
            } else if (!this.c) {
                return 3;
            }
        }
        return 2;
    }

    @Override // defpackage.wot
    public final void d(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
    }
}
