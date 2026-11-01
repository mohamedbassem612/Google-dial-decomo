package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qao implements odm {
    final /* synthetic */ defpackage.qar a;

    public qao(defpackage.qar qarVar) {
        j$.util.Objects.requireNonNull(qarVar);
        this.a = qarVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
    public final /* synthetic */ void a(java.lang.Object obj) {
        boolean z;
        j$.util.Optional optional = (j$.util.Optional) obj;
        ahoq ahoqVarW = ahvr.W(564, "ScreenHostFragmentPeer_subscriptionCallbacks_onDataLoad");
        try {
            if (optional.isPresent()) {
                defpackage.pzu pzuVar = (defpackage.pzu) optional.orElseThrow();
                defpackage.qar qarVar = this.a;
                tec tecVar = qarVar.i;
                defpackage.qah qahVar = qarVar.c;
                boolean zA = tecVar.a(qahVar.z());
                j$.util.Optional optionalOf = zA ? j$.util.Optional.of(((defpackage.pzs) ((aoin) qarVar.h.get(pzuVar.b)).a()).b()) : j$.util.Optional.of(pzuVar.b);
                j$.util.Optional optionalOf2 = zA ? j$.util.Optional.of(java.lang.Boolean.valueOf(((defpackage.pzs) ((aoin) qarVar.h.get(optionalOf.orElse((java.lang.Object) null))).a()).e())) : j$.util.Optional.of(java.lang.Boolean.valueOf(pzuVar.c));
                aimz aimzVar = defpackage.qar.a;
                aimzVar.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer$2", "onDataLoad", 140, "ScreenHostFragmentPeer.java").K("showOnSmallSecondaryWindow: %s, newAllowOrientationChange: %s", zA, optionalOf2);
                if (!optionalOf2.equals(qarVar.k)) {
                    ahvr.i(new defpackage.qab(((java.lang.Boolean) optionalOf2.orElseThrow()).booleanValue()), qahVar);
                    qarVar.k = optionalOf2;
                }
                j$.util.Optional optionalOf3 = j$.util.Optional.of(java.lang.Boolean.valueOf(pzuVar.e));
                if (!optionalOf3.equals(qarVar.l)) {
                    ahvr.i(new defpackage.qac(((java.lang.Boolean) optionalOf3.orElseThrow()).booleanValue()), qahVar);
                    qarVar.l = optionalOf3;
                }
                na naVar = qarVar.m;
                if (zA) {
                    if (((defpackage.pzs) ((aoin) qarVar.h.get(optionalOf.orElse((java.lang.Object) null))).a()).d()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (pzuVar.d) {
                    z = false;
                } else {
                    z = true;
                }
                naVar.f(z);
                if (!qarVar.j.equals(optionalOf)) {
                    aimzVar.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer$2", "onDataLoad", 168, "ScreenHostFragmentPeer.java").y("Showing in-call screen: %s", optionalOf);
                    j$.util.Optional optionalE = qarVar.o.e(pzuVar.a);
                    if (optionalE.isPresent()) {
                        defpackage.pzt pztVarAg = ((defpackage.qap) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.qap.class)).ag();
                        defpackage.pzp pzpVar = (defpackage.pzp) optionalOf.orElseThrow();
                        aoin aoinVar = (aoin) pztVarAg.a.get(pzpVar);
                        if (aoinVar == null) {
                            throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
                        }
                        aw awVarA = ((defpackage.pzs) aoinVar.a()).a();
                        u uVar = new u(qahVar.I());
                        uVar.q(2131429273, awVarA, (java.lang.String) null);
                        uVar.c();
                        agsm.i(565, ahvr.G(new jsr(pztVarAg, (defpackage.pzp) optionalOf.orElseThrow(), pzuVar.f, 13, (byte[]) null), pztVarAg.b), "failed notifying that a new screen has been shown", new java.lang.Object[0]);
                        defpackage.pzp pzpVar2 = (defpackage.pzp) optionalOf.orElseThrow();
                        if ((!qarVar.j.isPresent() || defpackage.qar.a((defpackage.pzp) qarVar.j.orElseThrow())) && !defpackage.qar.a(pzpVar2)) {
                            defpackage.qal qalVar = qarVar.d;
                            aooh.f(optionalE, "callScopeOptional");
                            aogc aogcVar = qalVar.e;
                            defpackage.qah qahVar2 = qalVar.b;
                            aogcVar.aF(qahVar2.N(), new defpackage.pmx(optionalE, 9));
                            qahVar2.N().getViewTreeObserver().addOnGlobalLayoutListener(new oge(qalVar, optionalE, 2));
                        }
                        qarVar.j = optionalOf;
                    }
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.qar.a.c(), "failed to load InCallScreenHostModel", "com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer$2", "onDataLoadError", (char) 211, "ScreenHostFragmentPeer.java", th, zct.b);
        defpackage.qar qarVar = this.a;
        j$.util.Optional optionalH = qarVar.o.h();
        if (true == optionalH.isPresent()) {
            optionalH = j$.util.Optional.ofNullable(((defpackage.apqr) optionalH.get()).b);
        }
        qarVar.r.i((java.lang.String) optionalH.orElse((java.lang.Object) null)).a(mcd.t);
    }
}
