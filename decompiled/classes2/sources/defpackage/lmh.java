package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lmh implements defpackage.odm {
    final /* synthetic */ defpackage.lmk a;

    public lmh(defpackage.lmk lmkVar) {
        j$.util.Objects.requireNonNull(lmkVar);
        this.a = lmkVar;
    }

    @Override // defpackage.odm
    public final /* synthetic */ void a(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        int iAN;
        defpackage.lmk lmkVar = this.a;
        lmkVar.k = (j$.util.Optional) obj;
        j$.util.Optional optional = lmkVar.k;
        defpackage.kwv kwvVar = new defpackage.kwv(lmkVar, 19);
        if (true == optional.isPresent()) {
            ((aw) ((defpackage.lmk) kwvVar.a).b).Q.findViewById(2131427826).setVisibility(true != ((defpackage.lex) optional.get()).g ? 8 : 0);
        }
        j$.util.Optional optional2 = lmkVar.k;
        defpackage.lmg lmgVar = new defpackage.lmg(lmkVar);
        if (true == optional2.isPresent()) {
            java.lang.Object obj2 = optional2.get();
            defpackage.lmk lmkVar2 = lmgVar.a;
            defpackage.lex lexVar = (defpackage.lex) obj2;
            defpackage.lgp lgpVar = lexVar.e;
            if (lgpVar == null) {
                lgpVar = defpackage.lgp.a;
            }
            if (lgpVar.b.size() > 0 && !lmkVar2.n) {
                int size = lgpVar.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        optionalEmpty = j$.util.Optional.empty();
                        break;
                    }
                    defpackage.lgo lgoVar = (defpackage.lgo) lgpVar.b.get(size);
                    int iAN2 = a.aN(lgoVar.g);
                    if (iAN2 != 0 && iAN2 == 3) {
                        optionalEmpty = j$.util.Optional.of(lgoVar);
                        break;
                    }
                    size--;
                }
                if (optionalEmpty.isPresent() && (iAN = a.aN(((defpackage.lgo) optionalEmpty.orElseThrow()).f)) != 0 && iAN == 3) {
                    j$.util.Optional optional3 = lmkVar2.k;
                    defpackage.kwv kwvVar2 = new defpackage.kwv(lmkVar2, 17);
                    if (true == optional3.isPresent()) {
                        java.lang.Object obj3 = optional3.get();
                        java.lang.Object obj4 = kwvVar2.a;
                        aify aifyVarN = aify.n(((defpackage.lex) obj3).f);
                        defpackage.lmb lmbVar = ((defpackage.lmk) obj4).e;
                        ahvr.cj(lmbVar.g, "expected non null suggestions");
                        lmbVar.g = aifyVarN;
                        lmbVar.f(lmbVar.a() - 1);
                    }
                    defpackage.lmb lmbVar2 = lmkVar2.e;
                    lmbVar2.h = false;
                    lmbVar2.f(lmbVar2.a() - 1);
                }
            }
            defpackage.lmb lmbVar3 = lmkVar2.e;
            defpackage.lgp lgpVar2 = lexVar.e;
            if (lgpVar2 == null) {
                lgpVar2 = defpackage.lgp.a;
            }
            abwd abwdVar = lexVar.d;
            if (abwdVar == null) {
                abwdVar = abwd.a;
            }
            if (!j$.util.Objects.equals(lgpVar2, lmbVar3.e)) {
                lmbVar3.a.o(rmx.bC);
            }
            defpackage.lgp lgpVar3 = lmbVar3.e;
            lmbVar3.e = lgpVar2;
            if (lmbVar3.e == null) {
                lmbVar3.e = defpackage.lgp.a;
            }
            if (lgpVar3.b.size() == 0) {
                defpackage.lgp lgpVar4 = lmbVar3.e;
                int size2 = lgpVar4.b.size();
                if (size2 > 1) {
                    lmbVar3.i = lgpVar4.b.size() - 1;
                } else if (size2 == 1) {
                    defpackage.lgo lgoVar2 = (defpackage.lgo) lgpVar4.b.get(0);
                    if ((lgoVar2.b & 64) == 0 || lgoVar2.i <= 0) {
                        lmbVar3.i = -1;
                    } else {
                        lmbVar3.i = 0;
                    }
                }
            }
            lmbVar3.f = abwdVar;
            int size3 = lmbVar3.e.b.size();
            int size4 = lgpVar3.b.size();
            if (size3 > size4) {
                while (size4 < lmbVar3.e.b.size()) {
                    lmbVar3.g(size4);
                    size4++;
                }
            } else {
                for (int i = 0; i < lmbVar3.e.b.size(); i++) {
                    if (!((defpackage.lgo) lgpVar3.b.get(i)).equals((defpackage.lgo) lmbVar3.e.b.get(i))) {
                        lmbVar3.f(i);
                    }
                }
            }
            if (!lmkVar2.m && lmkVar2.l) {
                ((aw) lmkVar2.b).Q.findViewById(2131427684).n.ae(lmbVar3.a() - 1);
            }
        }
        j$.util.Optional optional4 = lmkVar.k;
        defpackage.kwv kwvVar3 = new defpackage.kwv(lmkVar, 18);
        if (true == optional4.isPresent()) {
            java.lang.Object obj5 = optional4.get();
            java.lang.Object obj6 = kwvVar3.a;
            if (!((defpackage.lex) obj5).h) {
                defpackage.lmk lmkVar3 = (defpackage.lmk) obj6;
                defpackage.lmc lmcVar = lmkVar3.b;
                android.view.View viewFindViewById = ((aw) lmcVar).Q.findViewById(2131428426);
                viewFindViewById.setClickable(false);
                viewFindViewById.setAlpha(0.5f);
                android.view.View viewFindViewById2 = ((aw) lmcVar).Q.findViewById(2131428120);
                viewFindViewById2.setClickable(false);
                viewFindViewById2.setAlpha(0.5f);
                android.view.View viewFindViewById3 = ((aw) lmcVar).Q.findViewById(2131429000);
                viewFindViewById3.setClickable(false);
                viewFindViewById3.setAlpha(0.5f);
                lmkVar3.c.o(rmx.bu);
                return;
            }
            defpackage.lmk lmkVar4 = (defpackage.lmk) obj6;
            lmkVar4.c.o(rmx.bt);
            defpackage.lmc lmcVar2 = lmkVar4.b;
            android.view.View viewFindViewById4 = ((aw) lmcVar2).Q.findViewById(2131428426);
            viewFindViewById4.setClickable(true);
            viewFindViewById4.setAlpha(1.0f);
            android.view.View viewFindViewById5 = ((aw) lmcVar2).Q.findViewById(2131428120);
            viewFindViewById5.setClickable(true);
            viewFindViewById5.setAlpha(1.0f);
            if (((java.lang.Boolean) lmkVar4.f.a()).booleanValue()) {
                android.view.View viewFindViewById6 = ((aw) lmcVar2).Q.findViewById(2131429000);
                viewFindViewById6.setVisibility(0);
                viewFindViewById6.setClickable(true);
                viewFindViewById6.setAlpha(1.0f);
            }
        }
    }

    @Override // defpackage.odm
    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.lmk.a.c(), "failed producing call screen model", "com/android/dialer/callscreen/impl/ui/CallScreenFragmentPeer$1", "onDataLoadError", 'n', "CallScreenFragmentPeer.java", th, zct.b);
        this.a.p.i((java.lang.String) null).a(mcd.g);
    }
}
