package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppb {
    private final android.content.Context a;
    private final defpackage.pnr b;
    private final defpackage.pzp c;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean k;
    private final zpm l;
    private final gat m;
    private final gpd n;
    private final java.util.Set d = new java.util.LinkedHashSet();
    private final java.util.Set j = new java.util.LinkedHashSet();

    public ppb(gpd gpdVar, gat gatVar, android.content.Context context, zpm zpmVar, defpackage.pnr pnrVar, defpackage.pzp pzpVar) {
        this.n = gpdVar;
        this.m = gatVar;
        this.a = context;
        this.l = zpmVar;
        this.b = pnrVar;
        this.c = pzpVar;
    }

    private final defpackage.ppa b(java.lang.String str) {
        j$.util.Optional optionalE = this.l.e(str);
        aooh.e(optionalE, "get(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
        if (apqrVar != null) {
            return (defpackage.ppa) apqrVar.a(defpackage.ppa.class);
        }
        return null;
    }

    private final void c(java.lang.Long l, jxn jxnVar) {
        if (l != null) {
            agsm.i(494, this.m.i(l.longValue(), jxnVar), "Emitting event {event.name} failed.", new java.lang.Object[0]);
        }
    }

    private final void d(java.lang.String str, qbc qbcVar, boolean z) {
        defpackage.ppa ppaVarB = b(str);
        if (ppaVarB != null) {
            if (z) {
                ppaVarB.cp().c(qbcVar);
            } else {
                ppaVarB.cp().a(qbcVar);
            }
        }
    }

    private final boolean e(defpackage.pom pomVar) {
        return this.l.e(pomVar.a).isPresent();
    }

    public final void a(defpackage.pom pomVar) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        defpackage.ppa ppaVarB;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        aooh.f(pomVar, "model");
        gpd gpdVar = this.n;
        java.lang.String str = pomVar.a;
        zas zasVarI = gpdVar.i(str);
        defpackage.poj pojVar = pomVar.e;
        defpackage.pmp pmpVar = pojVar.b;
        defpackage.pog pogVar = pomVar.f;
        if (pogVar.c) {
            java.util.Set set = this.d;
            if (!set.contains(str)) {
                set.add(str);
                zasVarI.b(mce.aC);
                d(str, qbc.fC, false);
            }
        }
        if (pmpVar == null || ((pmpVar.b & 2) == 0 && (pmpVar.b & 1) == 0)) {
            zasVarI.b(mce.hD);
        } else {
            zasVarI.b(mce.hC);
        }
        if (!this.f && pomVar.d.a != null) {
            this.f = true;
            d(str, qbc.fD, false);
        }
        if (!this.e && (charSequence4 = pomVar.d.a) != null && charSequence4.length() != 0) {
            this.e = true;
            zasVarI.b(mce.D);
            if (e(pomVar)) {
                defpackage.zpo zpoVar = pomVar.l;
                if ((zpoVar == defpackage.zpo.c || zpoVar == defpackage.zpo.i) && !pomVar.m) {
                    zasVarI.b(mce.E);
                }
            } else if (aooh.n(pomVar.g, pez.Z(this.a))) {
                zasVarI.b(mce.E);
            }
        }
        if (!this.g && pojVar.a != null) {
            this.g = true;
            d(str, qbc.fA, false);
        }
        java.util.Set set2 = this.j;
        if (!set2.contains(str) && (charSequence3 = pojVar.a) != null && charSequence3.length() != 0 && e(pomVar)) {
            set2.add(str);
            zasVarI.b(mce.aE);
            d(str, qbc.fB, false);
        }
        if (!this.h) {
            this.h = true;
            d(str, qbc.fE, false);
        }
        if (pogVar.b != null) {
            d(str, qbc.hf, true);
        }
        if (aooh.n(pomVar.g, this.a.getString(2132019028)) && (ppaVarB = b(str)) != null) {
            ppaVarB.ah().c();
        }
        if (!this.i && this.c == defpackage.pzp.VOICE_SCREEN && (charSequence2 = pomVar.d.a) != null && charSequence2.length() != 0) {
            this.i = true;
            c(pomVar.b, jxn.h);
        }
        if (!this.k && this.c == defpackage.pzp.VOICE_SCREEN && (charSequence = pojVar.a) != null && charSequence.length() != 0) {
            this.k = true;
            c(pomVar.b, jxn.i);
        }
        defpackage.pnr pnrVar = this.b;
        java.util.List list = pomVar.o;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.pnf pnfVarB = defpackage.pnf.b(((defpackage.png) it.next()).e);
            if (pnfVarB == null) {
                pnfVarB = defpackage.pnf.UNRECOGNIZED;
            }
            arrayList.add(pnfVarB);
        }
        java.util.Set setCf = ajsz.cf(arrayList);
        aooh.f(setCf, "indicatorKeys");
        aooh.f(str, "callId");
        if (aooh.n(setCf, pnrVar.b)) {
            return;
        }
        j$.util.Optional optionalE = pnrVar.c.e(str);
        aooh.e(optionalE, "get(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
        defpackage.pnq pnqVar = apqrVar != null ? (defpackage.pnq) apqrVar.a(defpackage.pnq.class) : null;
        if (pnqVar == null) {
            defpackage.pnr.a.b().l("com/android/dialer/incall/contactgrid/dataservice/ContactGridIndicatorUpdateListener", "onIndicatorSet", 36, "ContactGridIndicatorUpdateListener.kt").v("No call scope when indicator is updated");
            pnrVar.b = setCf;
            return;
        }
        java.util.Set set3 = pnrVar.b;
        java.util.Set setAH = ajsz.aH(set3, setCf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = setAH.iterator();
        while (it2.hasNext()) {
            defpackage.ppq ppqVar = (defpackage.ppq) wsc.D(pnqVar.kT(), (defpackage.pnf) it2.next());
            if (ppqVar != null) {
                arrayList2.add(ppqVar);
            }
        }
        java.util.Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((defpackage.ppq) it3.next()).a();
        }
        pnrVar.b = setCf;
        java.util.Set setAH2 = ajsz.aH(setCf, set3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it4 = setAH2.iterator();
        while (it4.hasNext()) {
            defpackage.ppr pprVar = (defpackage.ppr) wsc.D(pnqVar.kU(), (defpackage.pnf) it4.next());
            if (pprVar != null) {
                arrayList3.add(pprVar);
            }
        }
        java.util.Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((defpackage.ppr) it5.next()).b();
        }
    }
}
