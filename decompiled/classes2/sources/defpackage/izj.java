package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class izj implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ izj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r12v29, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [aoss, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        int i = 18;
        switch (this.$cid) {
            case 0:
                aooh.f((eoq) obj, "$this$initializer");
                return new vol(((defpackage.izm) this.a).b.H().getApplication(), true);
            case 1:
                int iAa = anty.aa((defpackage.hhe) obj);
                java.lang.Object obj2 = this.a;
                if (iAa == -1) {
                    throw new java.lang.IllegalArgumentException("Item cannot be null");
                }
                if (iAa == 0) {
                    return ((defpackage.iyi) obj2).e;
                }
                if (iAa == 1) {
                    return ((defpackage.iyi) obj2).f;
                }
                throw new aois();
            case 2:
                android.content.Context context = (android.content.Context) obj;
                aooh.f(context, "context");
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
                android.view.View viewG = defpackage.hgz.g(((defpackage.izp) this.a).b);
                viewG.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                frameLayout.addView(viewG);
                return frameLayout;
            case 3:
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) obj;
                aooh.f(frameLayout2, "frameLayout");
                android.view.View childAt = frameLayout2.getChildAt(0);
                aooh.e(childAt, "getChildAt(...)");
                defpackage.heq heqVarL = defpackage.hhb.l(defpackage.iek.a.m());
                heqVarL.z(((defpackage.izp) this.a).a);
                defpackage.hgz.c(childAt, heqVarL.y());
                return aojh.a;
            case 4:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyColumn");
                defpackage.guv guvVar = new defpackage.guv(i);
                aokv aokvVar = ((defpackage.izq) this.a).c;
                barVar.b(aokvVar.b, new defpackage.dev(guvVar, aokvVar, 3), new defpackage.aib(aokvVar, 20), new cja(802480018, true, new defpackage.izz(aokvVar)));
                return aojh.a;
            case 5:
                defpackage.jac jacVar = (defpackage.jac) obj;
                aooh.f(jacVar, "newState");
                this.a.b(jacVar);
                return aojh.a;
            case 6:
                return a.K((java.lang.String) this.a, (diq) obj);
            case 7:
                tkl tklVar = (tkl) obj;
                aooh.f(tklVar, "sharpie");
                java.lang.Object obj3 = tklVar.a;
                defpackage.jjo jjoVar = (defpackage.jjo) this.a;
                defpackage.jjx jjxVar = jjoVar.f.d;
                if (jjxVar == null) {
                    jjxVar = defpackage.jjx.a;
                }
                agtj agtjVar = jjoVar.e;
                j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(jjxVar.k);
                aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
                tki tkiVar = tki.b;
                aooh.f(instantOfEpochMilli, "callInstant");
                rsr rsrVar = (rsr) obj3;
                agtjVar.i(zoe.N(aosv.F((aoss) rsrVar.a, 0, new rjk(rsrVar, instantOfEpochMilli, tkiVar, (aoln) null, 15), 3)), jjoVar.o);
                return aojh.a;
            case 8:
                mnp mnpVar = (mnp) obj;
                aooh.f(mnpVar, "dobby");
                aogc aogcVar = mnpVar.f;
                defpackage.jjo jjoVar2 = (defpackage.jjo) this.a;
                defpackage.jjx jjxVar2 = jjoVar2.f.d;
                if (jjxVar2 == null) {
                    jjxVar2 = defpackage.jjx.a;
                }
                jjoVar2.e.i(zoe.N(aogcVar.aN(jjxVar2.k)), jjoVar2.n);
                return aojh.a;
            case 9:
                aogc aogcVar2 = (aogc) obj;
                aooh.f(aogcVar2, "beeslyStorage");
                defpackage.jjo jjoVar3 = (defpackage.jjo) this.a;
                jjoVar3.e.i(zoe.N(aosv.F(jjoVar3.g, 0, new defpackage.jcu(jjoVar3, aogcVar2, (aoln) null, 8), 3)), jjoVar3.p);
                return aojh.a;
            case 10:
                mnp mnpVar2 = (mnp) obj;
                aooh.f(mnpVar2, "dobby");
                aogc aogcVar3 = mnpVar2.f;
                defpackage.jke jkeVar = (defpackage.jke) this.a;
                defpackage.jjx jjxVar3 = jkeVar.f.d;
                if (jjxVar3 == null) {
                    jjxVar3 = defpackage.jjx.a;
                }
                jkeVar.e.i(zoe.N(aogcVar3.aN(jjxVar3.k)), jkeVar.k);
                return aojh.a;
            case 11:
                aogc aogcVar4 = (aogc) obj;
                aooh.f(aogcVar4, "beeslyStorage");
                defpackage.jke jkeVar2 = (defpackage.jke) this.a;
                jkeVar2.e.i(zoe.N(aosv.F(jkeVar2.g, 0, new defpackage.jcu(aogcVar4, jkeVar2, (aoln) null, 18), 3)), jkeVar2.l);
                return aojh.a;
            case 12:
                mnp mnpVar3 = (mnp) obj;
                aooh.f(mnpVar3, "dobby");
                defpackage.jkv jkvVar = (defpackage.jkv) this.a;
                return aosv.F(jkvVar.h, 0, new defpackage.jcu(mnpVar3, jkvVar, (aoln) null, 20), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aogc aogcVar5 = (aogc) obj;
                aooh.f(aogcVar5, "beeslyStorage");
                defpackage.jkv jkvVar2 = (defpackage.jkv) this.a;
                return aosv.F(jkvVar2.h, 0, new defpackage.jcu(aogcVar5, jkvVar2, (aoln) null, 19), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooh.f((wsc) obj, "feedback");
                defpackage.jld.a.b().l("com/android/dialer/blockreportspam/ReportSpamAndBlockNumberDialogFragmentPeer", "onPositiveClick$<anonymous>", 242, "ReportSpamAndBlockNumberDialogFragmentPeer.kt").v("startFeedbackConsentActivity.");
                defpackage.jld jldVar = (defpackage.jld) this.a;
                defpackage.jmk jmkVar = jldVar.g;
                android.content.Context contextA = jldVar.b.A();
                defpackage.jjx jjxVar4 = jmkVar.d;
                if (jjxVar4 == null) {
                    jjxVar4 = defpackage.jjx.a;
                }
                utu utuVar = jjxVar4.i;
                if (utuVar == null) {
                    utuVar = utu.a;
                }
                wsc.bg(contextA, utuVar);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aogc aogcVar6 = (aogc) obj;
                aooh.f(aogcVar6, "beeslyStorage");
                defpackage.jld jldVar2 = (defpackage.jld) this.a;
                jldVar2.e.i(zoe.N(aosv.F(jldVar2.h, 0, new defpackage.jpj(jldVar2, aogcVar6, (aoln) null, 1), 3)), jldVar2.m);
                return aojh.a;
            case 16:
                mnp mnpVar4 = (mnp) obj;
                aooh.f(mnpVar4, "dobby");
                aogc aogcVar7 = mnpVar4.f;
                defpackage.jld jldVar3 = (defpackage.jld) this.a;
                defpackage.jjx jjxVar5 = jldVar3.g.d;
                if (jjxVar5 == null) {
                    jjxVar5 = defpackage.jjx.a;
                }
                jldVar3.e.i(zoe.N(aogcVar7.aN(jjxVar5.k)), jldVar3.l);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                j$.util.Optional optionalG = ((zjm) this.a).g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((defpackage.jns) optionalG.get()).b());
                }
                return (ajcq) optionalG.orElse(ajcm.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.aiyh aiyhVar = (defpackage.aiyh) obj;
                java.util.Set set = defpackage.jpk.a;
                aooh.f(aiyhVar, "it");
                aooh.f(aiyhVar, "value");
                akzx akzxVar = (akzx) ((uzx) this.a).a;
                akzxVar.u();
                defpackage.aixo aixoVar = (defpackage.aixo) akzxVar.b;
                defpackage.aixo aixoVar2 = defpackage.aixo.a;
                aixoVar.u = aiyhVar.d;
                aixoVar.b |= 1048576;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.aiyn aiynVar = (defpackage.aiyn) obj;
                java.util.Set set2 = defpackage.jpk.a;
                aooh.f(aiynVar, "it");
                aooh.f(aiynVar, "value");
                akzx akzxVar2 = (akzx) ((uzx) this.a).a;
                akzxVar2.u();
                defpackage.aixo aixoVar3 = (defpackage.aixo) akzxVar2.b;
                defpackage.aixo aixoVar4 = defpackage.aixo.a;
                aixoVar3.v = aiynVar.e;
                aixoVar3.b |= 2097152;
                return aojh.a;
            default:
                java.util.Set set3 = defpackage.jpk.a;
                return java.lang.Long.valueOf(((java.lang.Long) obj).longValue() - ((android.telecom.Call.Details) this.a).getConnectTimeMillis());
        }
    }
}
