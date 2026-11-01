package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jjg implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jjg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r15v97, types: [java.lang.Object, obg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ahrv ahrvVarH;
        int i = 16;
        int i2 = 11;
        byte[] bArr = null;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.jjo jjoVar = (defpackage.jjo) this.a;
                boolean z = !jjoVar.i;
                jjoVar.i = z;
                ((android.widget.CheckBox) this.b).setChecked(z);
                return;
            case 1:
                defpackage.jjo jjoVar2 = (defpackage.jjo) this.a;
                boolean z2 = !jjoVar2.h;
                jjoVar2.h = z2;
                ((android.widget.CheckBox) this.b).setChecked(z2);
                return;
            case 2:
                defpackage.kis kisVar = ((kiu) this.b).u;
                if (kisVar == null) {
                    kisVar = defpackage.kis.a;
                }
                java.lang.Object obj = this.a;
                java.lang.Long l = (java.lang.Long) kisVar.d.get(0);
                aooh.c(l);
                ((defpackage.kjd) obj).d(l.longValue());
                return;
            case 3:
                int iAQ = a.aQ(((defpackage.lcg) this.a).e);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                defpackage.lce lceVar = (defpackage.lce) this.b;
                defpackage.lch lchVar = lceVar.f;
                defpackage.lyt lytVar = lchVar.d;
                int i4 = iAQ - 1;
                if (i4 == 1) {
                    ahrvVarH = ahrv.g(lytVar.a()).h(new defpackage.lbs(7), (java.util.concurrent.Executor) lytVar.b);
                } else {
                    if (i4 != 2) {
                        throw new java.lang.IllegalArgumentException("Invalid audio demo type.");
                    }
                    ahrvVarH = ahrv.g(lytVar.a()).h(new defpackage.lbs(6), (java.util.concurrent.Executor) lytVar.b);
                }
                lceVar.d.i(zoe.N(ahvr.I(ahrvVarH, new defpackage.kxm(lchVar, i), lchVar.b)), lceVar.g);
                return;
            case 4:
                aimw aimwVarL = com.android.dialer.callscreen.impl.ui.SuggestionsView.a.b().l("com/android/dialer/callscreen/impl/ui/SuggestionsView", "populateSuggestionsView", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "SuggestionsView.java");
                java.lang.Object obj2 = this.b;
                aimwVarL.y("Suggestion '%s' clicked", obj2.getClass().getName());
                rai raiVar = ((com.android.dialer.callscreen.impl.ui.SuggestionsView) this.a).d;
                if (raiVar != null) {
                    defpackage.lgk lgkVar = (defpackage.lgk) obj2;
                    alak alakVar = lgkVar.e;
                    alal alalVar = defpackage.lgk.a;
                    alam alamVar = new alam(alakVar, alalVar);
                    defpackage.lln llnVar = defpackage.lln.END_CALL;
                    if (alamVar.contains(llnVar)) {
                        ((defpackage.lmk) raiVar.a).b();
                    } else {
                        ((defpackage.lmk) raiVar.a).e.w();
                    }
                    defpackage.lmk.a.b().l("com/android/dialer/callscreen/impl/ui/CallScreenFragmentPeer$2", "primaryActionPerformed", 127, "CallScreenFragmentPeer.java").y("actionPerformed, isTerminal: %b", java.lang.Boolean.valueOf(new alam(lgkVar.e, alalVar).contains(llnVar)));
                    defpackage.lmk lmkVar = (defpackage.lmk) raiVar.a;
                    lmkVar.c.o(rmx.bA);
                    j$.util.Optional optionalA = lmkVar.a();
                    defpackage.lwx lwxVar = new defpackage.lwx(obj2, i3);
                    if (true == optionalA.isPresent()) {
                        java.lang.Object obj3 = optionalA.get();
                        java.lang.Object obj4 = lwxVar.a;
                        defpackage.lgn lgnVar = ((defpackage.lev) obj3).g;
                        defpackage.lgk lgkVar2 = (defpackage.lgk) obj4;
                        if (new alam(lgkVar2.e, alalVar).contains(llnVar)) {
                            lgnVar.e.e(false);
                        }
                        defpackage.ldn ldnVar = lgnVar.f;
                        akzx akzxVarM = defpackage.ljw.a.m();
                        akzx akzxVarM2 = defpackage.lkc.a.m();
                        aazc aazcVar = lgnVar.h;
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        akzxVarM2.u();
                        defpackage.lkc lkcVar = (defpackage.lkc) akzxVarM2.b;
                        lkcVar.b |= 1;
                        lkcVar.c = jElapsedRealtime;
                        java.lang.String str = lgkVar2.h;
                        akzxVarM2.u();
                        defpackage.lkc lkcVar2 = (defpackage.lkc) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        lkcVar2.b |= 2;
                        lkcVar2.d = str;
                        alam alamVar2 = new alam(lgkVar2.e, alalVar);
                        akzxVarM2.u();
                        defpackage.lkc lkcVar3 = (defpackage.lkc) akzxVarM2.b;
                        alak alakVar2 = lkcVar3.e;
                        if (!alakVar2.c()) {
                            lkcVar3.e = alad.H(alakVar2);
                        }
                        java.util.Iterator it = alamVar2.iterator();
                        while (it.hasNext()) {
                            lkcVar3.e.g(((defpackage.lln) it.next()).d);
                        }
                        akzxVarM.u();
                        defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM.b;
                        defpackage.lkc lkcVar4 = (defpackage.lkc) akzxVarM2.p();
                        j$.util.Objects.requireNonNull(lkcVar4);
                        ljwVar.c = lkcVar4;
                        ljwVar.b = 1;
                        ahrv ahrvVarG = ahrv.g(ldnVar.a((defpackage.ljw) akzxVarM.p()));
                        defpackage.kwa kwaVar = new defpackage.kwa(lgnVar, obj4, i2, bArr);
                        java.util.concurrent.Executor executor = lgnVar.d;
                        agsm.i(268, ahrvVarG.i(kwaVar, executor).i(new defpackage.kwa(lgnVar, obj4, 12, bArr), executor).i(new defpackage.kwa(lgnVar, obj4, 13, bArr), executor), "failed to process chip click", new java.lang.Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                java.lang.Object obj5 = this.a;
                defpackage.lqi lqiVar = (defpackage.lqi) this.b;
                defpackage.lqp lqpVar = (defpackage.lqp) obj5;
                lqpVar.e(lqiVar.c, qbc.fS);
                j$.util.Optional optionalD = lqpVar.d(lqiVar.c);
                if (true == optionalD.isPresent()) {
                    agsm.i(317, ((pqm) optionalD.get()).f(), "failed to disconnect child from conference.", new java.lang.Object[0]);
                    return;
                }
                return;
            case 6:
                java.lang.Object obj6 = this.a;
                defpackage.lqi lqiVar2 = (defpackage.lqi) this.b;
                defpackage.lqp lqpVar2 = (defpackage.lqp) obj6;
                lqpVar2.e(lqiVar2.c, qbc.fR);
                j$.util.Optional optionalD2 = lqpVar2.d(lqiVar2.c);
                if (true == optionalD2.isPresent()) {
                    java.lang.Object obj7 = optionalD2.get();
                    pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "splitFromConference", 590, "CallControllerImpl.java").v("splitFromConference");
                    pqm pqmVar = (pqm) obj7;
                    pqmVar.f.a(defpackage.mfy.CALL_SPLIT_FROM_CONFERENCE);
                    pqmVar.b.splitFromConference();
                    return;
                }
                return;
            case 7:
                defpackage.lyi lyiVar = (defpackage.lyi) this.a;
                ((defpackage.khd) this.b).c(mni.bB(lyiVar.G.u(lyiVar.g), 11));
                return;
            case 8:
                defpackage.lyi lyiVar2 = (defpackage.lyi) this.a;
                ((defpackage.khd) this.b).c(mni.bB(lyiVar2.G.u(lyiVar2.g), 11));
                return;
            case 9:
                defpackage.obd obdVarA = ((defpackage.obl) this.a).a((defpackage.obf) this.b);
                if (obdVarA != null) {
                    obdVarA.b();
                    return;
                }
                return;
            case 10:
                defpackage.obd obdVarA2 = ((defpackage.obl) this.a).a((defpackage.obf) this.b);
                if (obdVarA2 != null) {
                    obdVarA2.b();
                    return;
                }
                return;
            case 11:
                defpackage.obd obdVarA3 = ((defpackage.obl) this.a).a((defpackage.obf) this.b);
                if (obdVarA3 != null) {
                    obdVarA3.b();
                    return;
                }
                return;
            case 12:
                defpackage.obd obdVarA4 = ((defpackage.obl) this.a).a((defpackage.obf) this.b);
                if (obdVarA4 != null) {
                    obdVarA4.b();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.obd obdVarA5 = ((defpackage.obr) this.a).a((defpackage.obf) this.b);
                if (obdVarA5 != null) {
                    obdVarA5.b();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.obd obdVarA6 = ((defpackage.obr) this.a).a((defpackage.obf) this.b);
                if (obdVarA6 != null) {
                    obdVarA6.b();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.obd obdVarA7 = ((defpackage.obr) this.a).a((defpackage.obf) this.b);
                if (obdVarA7 != null) {
                    obdVarA7.b();
                    return;
                }
                return;
            case 16:
                defpackage.obd obdVarA8 = ((defpackage.obr) this.a).a((defpackage.obf) this.b);
                if (obdVarA8 != null) {
                    obdVarA8.b();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.obd obdVarA9 = ((defpackage.obr) this.a).a((defpackage.obf) this.b);
                if (obdVarA9 != null) {
                    obdVarA9.b();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str2 = ((defpackage.obf) this.b).g;
                defpackage.oby obyVar = (defpackage.oby) this.a;
                obyVar.u.i(str2).b(mce.aS);
                defpackage.obd obdVarD = obyVar.d();
                if (obdVarD != null) {
                    obdVarD.c();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.nzp nzpVarAL = pez.aL((defpackage.obg) this.b);
                boolean z3 = nzpVarAL != null ? nzpVarAL.i : false;
                defpackage.obd obdVarD2 = ((defpackage.oby) this.a).d();
                if (obdVarD2 != null) {
                    defpackage.obd.a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "onCenterButtonClicked", 172, "EmergencyVoiceController.kt").v("enter");
                    defpackage.ocv ocvVar = (defpackage.ocv) aooh.q(obdVarD2.b);
                    if (ocvVar == null) {
                        throw new java.lang.IllegalStateException("Center button listener should not be null if button is present!");
                    }
                    defpackage.ocv.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSButtonController", "onButtonClicked", 51, "SatelliteSOSButtonController.kt").v("enter");
                    ahoq ahoqVarW = ahvr.W(401, "SatelliteSOSButtonController_onButtonClicked");
                    try {
                        ocvVar.d.b(mce.fh);
                        if (z3) {
                            ocvVar.i.a(qbc.gS);
                        } else {
                            ocvVar.i.a(qbc.gR);
                        }
                        apni apniVar = ocvVar.j;
                        aimz aimzVar = zih.a;
                        apniVar.i(aoov.al(ocvVar.c, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, ocvVar, 16)));
                        ocvVar.b.g(ocvVar.h.f(), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak(ahoqVarW, th);
                            throw th2;
                        }
                    }
                }
                return;
            default:
                java.lang.String str3 = ((defpackage.obf) this.b).g;
                defpackage.oby obyVar2 = (defpackage.oby) this.a;
                obyVar2.u.i(str3).b(mce.eH);
                defpackage.obd obdVarD3 = obyVar2.d();
                if (obdVarD3 != null) {
                    obdVarD3.d();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jjg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
