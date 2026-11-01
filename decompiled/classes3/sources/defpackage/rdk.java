package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdk {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/ui/VoiceFragmentPeer");
    public com.google.android.material.bottomsheet.BottomSheetBehavior A;
    public ok B;
    public final odm C;
    public final agtk D;
    public final ccp E;
    public final ccp F;
    public final zpm G;
    public final gat H;
    public final gpd I;
    public final gpd J;
    public final defpackage.oyx K;
    public final her L;
    public final aais M;
    public final defpackage.afpl N;
    public final aogc O;
    private final ems P;
    private final defpackage.pyj Q;
    private final java.util.Map R;
    private final java.util.Map S;
    private final ruc T;
    private final defpackage.qhz U;
    private final defpackage.rcw V;
    private final aoin W;
    private final aoin X;
    private defpackage.agby Y;
    private final ccp Z;
    private defpackage.quo aa;
    private defpackage.qup ab;
    private boolean ac;
    private defpackage.qtr ad;
    private defpackage.qtu ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private final zzx aj;
    private final zzx ak;
    private final her al;
    public final java.lang.String b;
    public final defpackage.rcx c;
    public final rlv d;
    public final android.content.Context e;
    public final defpackage.pzn f;
    public final urs g;
    public final ahpz h;
    public final aoss i;
    public final defpackage.agzc j;
    public final odo k;
    public final tec l;
    public final agtj m;
    public final odp n;
    public final agsm o;
    public final aoin p;
    public final aoin q;
    public final aoin r;
    public final aoin s;
    public final aoin t;
    public final aoin u;
    public final aoin v;
    public final defpackage.ppb w;
    public final na x;
    public java.lang.String y;
    public defpackage.qtz z;

    public rdk(ems emsVar, java.lang.String str, gpd gpdVar, defpackage.pyj pyjVar, defpackage.afpl afplVar, zzx zzxVar, zzx zzxVar2, java.util.Map map, java.util.Map map2, defpackage.rcx rcxVar, her herVar, ruc rucVar, aogc aogcVar, rlv rlvVar, zpm zpmVar, gat gatVar, android.content.Context context, defpackage.pzn pznVar, her herVar2, urs ursVar, ahpz ahpzVar, aoss aossVar, gpd gpdVar2, defpackage.qhz qhzVar, defpackage.rcw rcwVar, aoin aoinVar, aoin aoinVar2, defpackage.agzc agzcVar, odo odoVar, tec tecVar, agtj agtjVar, odp odpVar, agsm agsmVar, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aais aaisVar, hwv hwvVar, aazc aazcVar, aoin aoinVar6, defpackage.oyx oyxVar, aoin aoinVar7, aoin aoinVar8, aoin aoinVar9) {
        aooh.f(emsVar, "lifecycle");
        aooh.f(rucVar, "metrics");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(zpmVar, "callScopes");
        aooh.f(gatVar, "placeOutgoingCallInteractionContextRegistry");
        aooh.f(pznVar, "earpieceOnDisplayTracker");
        aooh.f(herVar2, "voiceModelCache");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(aossVar, "activityCoroutineScope");
        aooh.f(gpdVar2, "cuiSemanticLoggerFactory");
        aooh.f(aoinVar, "enableBounceDialpadScalableContents");
        aooh.f(aoinVar2, "minScreenHeightForChipsDp");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(aoinVar3, "enableVoiceCallSubscribeToSameDataSource");
        aooh.f(aoinVar4, "enableUnifiedExpresso");
        aooh.f(aoinVar5, "enablePreserveSimNameColor");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar6, "enableIncallMeetApiIntegration");
        aooh.f(aoinVar7, "keepImmediateUiChangeDurationMillis");
        aooh.f(aoinVar9, "enableFixDialerButtonPadding");
        this.P = emsVar;
        this.b = str;
        this.I = gpdVar;
        this.Q = pyjVar;
        this.N = afplVar;
        this.aj = zzxVar;
        this.ak = zzxVar2;
        this.R = map;
        this.S = map2;
        this.c = rcxVar;
        this.al = herVar;
        this.T = rucVar;
        this.O = aogcVar;
        this.d = rlvVar;
        this.G = zpmVar;
        this.H = gatVar;
        this.e = context;
        this.f = pznVar;
        this.L = herVar2;
        this.g = ursVar;
        this.h = ahpzVar;
        this.i = aossVar;
        this.J = gpdVar2;
        this.U = qhzVar;
        this.V = rcwVar;
        this.W = aoinVar;
        this.X = aoinVar2;
        this.j = agzcVar;
        this.k = odoVar;
        this.l = tecVar;
        this.m = agtjVar;
        this.n = odpVar;
        this.o = agsmVar;
        this.p = aoinVar3;
        this.q = aoinVar4;
        this.r = aoinVar5;
        this.M = aaisVar;
        this.s = aoinVar6;
        this.K = oyxVar;
        this.t = aoinVar7;
        this.u = aoinVar8;
        this.v = aoinVar9;
        a.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "<init>", 283, "VoiceFragmentPeer.kt").v("enter");
        qhzVar.g(emsVar, new defpackage.pqf(this, 4));
        this.w = hwvVar.o(defpackage.pzp.VOICE_SCREEN);
        this.x = new defpackage.rdf(this);
        cdu cduVar = cdu.c;
        this.Z = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        boolean z = true;
        this.ac = true;
        this.ad = defpackage.qtr.BOTTOM_SHEET_FRAGMENT_KEY_NONE;
        this.af = true;
        this.C = new defpackage.quy(this, 5);
        this.D = new defpackage.rdg(this);
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.A;
        if (bottomSheetBehavior != null && bottomSheetBehavior.y == 5) {
            z = false;
        }
        this.E = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z), cduVar);
        this.F = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
    }

    private final void A(aify aifyVar) {
        com.android.dialer.incall.voice.ui.VoiceScreenChipView voiceScreenChipView = (com.android.dialer.incall.voice.ui.VoiceScreenChipView) this.c.N().findViewById(2131429454);
        if (voiceScreenChipView != null) {
            defpackage.rdp rdpVarY = voiceScreenChipView.y();
            aooh.f(aifyVar, "chips");
            ((defpackage.ahak) rdpVarY.d).x(aifyVar);
            boolean zIsEmpty = aifyVar.isEmpty();
            aimz aimzVar = a;
            if (zIsEmpty) {
                aimzVar.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "updateChipsInRecyclerView$<anonymous>", 1208, "VoiceFragmentPeer.kt").v("no chips available.");
            } else {
                aimzVar.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "updateChipsInRecyclerView$<anonymous>", 1210, "VoiceFragmentPeer.kt").w("updating %d chips", aifyVar.size());
                x(qbc.jd);
            }
        }
    }

    private static final void B(java.util.List list, boolean z) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null) {
                view.setImportantForAccessibility(true != z ? 0 : 4);
            }
        }
    }

    public static final aw a(java.lang.String str) {
        aooh.f(str, "keyForInitialDataModelLookup");
        defpackage.rcx rcxVar = new defpackage.rcx();
        amxr.g(rcxVar);
        ahgl.c(rcxVar, str);
        return rcxVar;
    }

    public static final void t(java.util.List list) {
        aooh.f(list, "views");
        B(list, true);
    }

    private final void u(aw awVar, defpackage.qup qupVar, boolean z, boolean z2) {
        int i;
        boolean z3;
        bo boVarI = this.c.I();
        u uVar = new u(boVarI);
        if (qupVar == defpackage.qup.a || qupVar == defpackage.qup.b) {
            aw awVarD = boVarI.d(2131429443);
            if (z) {
                if (z2) {
                    uVar.r(awVarD != null ? 2130772049 : 2130772048, 2130772050);
                } else {
                    if (awVarD != null) {
                        i = 2130772051;
                        z3 = true;
                    } else {
                        i = 0;
                        z3 = false;
                    }
                    uVar.r(i, true == z3 ? 2130772050 : 0);
                }
            } else if (z2) {
                uVar.r(2130772048, 0);
            }
            uVar.s();
        }
        uVar.q(2131429443, awVar, (java.lang.String) null);
        uVar.c();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    private final void v(defpackage.rcc rccVar, jxn jxnVar) {
        defpackage.qst qstVar = new defpackage.qst(new oen(this, jxnVar, 18, (byte[]) null), 17);
        j$.util.Optional optional = rccVar.b;
        if (true == optional.isPresent()) {
            qstVar.a.a(optional.get());
        }
    }

    private final void w() {
        android.view.View view;
        this.ad = defpackage.qtr.BOTTOM_SHEET_FRAGMENT_KEY_NONE;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.A;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.t(5);
        }
        k(false);
        aw awVarD = this.c.I().d(2131427591);
        if (awVarD == null || (view = awVarD.Q) == null) {
            return;
        }
        view.setVisibility(4);
    }

    private final void x(qbc qbcVar) {
        defpackage.rap rapVarB = b();
        if (rapVarB != null) {
            rapVarB.q.c(qbcVar);
        }
    }

    private final void y(com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
        defpackage.rap rapVarB = b();
        hrv hrvVar = new hrv();
        hrvVar.d(new defpackage.oxs(rapVarB, 10));
        hrvVar.c(new defpackage.oxr(rapVarB, 13));
        hry hryVar = new hry(this.P, hrvVar.a());
        lottieAnimationView.c.c.removeAllListeners();
        lottieAnimationView.a(hryVar);
        lottieAnimationView.e();
    }

    private final void z(defpackage.qup qupVar, boolean z) {
        defpackage.rcx rcxVar = this.c;
        aw awVarD = rcxVar.I().d(2131429443);
        if (awVarD != null) {
            u uVar = new u(rcxVar.I());
            if (z && (qupVar == defpackage.qup.a || qupVar == defpackage.qup.b)) {
                uVar.r(0, 2130772050);
            }
            uVar.k(awVarD);
            uVar.c();
        }
    }

    public final defpackage.rap b() {
        java.lang.String str;
        defpackage.rcc rccVarD = d();
        if (rccVarD == null || (str = rccVarD.a) == null) {
            return null;
        }
        j$.util.Optional optionalG = this.al.G(str);
        aooh.e(optionalG, "forCall(...)");
        return (defpackage.rap) aooh.q(optionalG);
    }

    public final defpackage.rap c(java.lang.String str) {
        j$.util.Optional optionalG = this.al.G(str);
        aooh.e(optionalG, "forCall(...)");
        return (defpackage.rap) aooh.q(optionalG);
    }

    public final defpackage.rcc d() {
        return (defpackage.rcc) this.Z.a();
    }

    public final java.lang.String e() {
        j$.util.Optional optionalH = this.G.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (java.lang.String) apqrVar.b;
        }
        return null;
    }

    public final void f() {
        h(mce.bn);
    }

    public final void g(mcd mcdVar) {
        this.J.i(e()).a(mcdVar);
    }

    public final void h(mce mceVar) {
        java.lang.String strE;
        defpackage.rcc rccVarD = d();
        if (rccVarD == null || (strE = rccVarD.a) == null) {
            strE = e();
        }
        this.J.i(strE).b(mceVar);
    }

    public final void i(qbc qbcVar) {
        defpackage.rap rapVarB = b();
        if (rapVarB != null) {
            rapVarB.e(qbcVar);
        }
    }

    public final void j(defpackage.qug qugVar) {
        a.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "emitCuiEventOnButtonClick", 2267, "VoiceFragmentPeer.kt").y("emitCuiEventOnButtonClick:%s", qugVar.name());
        defpackage.rdb rdbVar = defpackage.rdb.a;
        int iOrdinal = qugVar.ordinal();
        if (iOrdinal == 2) {
            h(mce.aR);
        } else if (iOrdinal == 3) {
            h(mce.aZ);
        } else if (iOrdinal == 4) {
            defpackage.rcc rccVarD = d();
            if (rccVarD != null) {
                defpackage.rcd rcdVarB = defpackage.rcd.b(rccVarD.k.c);
                if (rcdVarB == null) {
                    rcdVarB = defpackage.rcd.EMPTY;
                }
                if (rcdVarB != defpackage.rcd.DIALPAD) {
                    h(mce.bl);
                } else {
                    f();
                }
            }
        } else if (iOrdinal == 6) {
            h(mce.bc);
        } else if (iOrdinal == 17) {
            h(mce.dG);
        } else if (iOrdinal == 23) {
            h(mce.fu);
        } else if (iOrdinal == 10) {
            h(mce.dF);
        } else if (iOrdinal == 11) {
            h(mce.en);
        } else if (iOrdinal == 14) {
            h(mce.bd);
        } else if (iOrdinal == 15) {
            h(mce.bi);
        }
        defpackage.rap rapVarB = b();
        if (rapVarB == null) {
            g(mcd.v);
            return;
        }
        defpackage.qug qugVar2 = defpackage.qug.BUTTON_ADD_CALL;
        if (qugVar != qugVar2) {
            if (qugVar == defpackage.qug.BUTTON_MANAGE_CONFERENCE) {
                mni.bZ().r(this.c.I(), "ManageConferenceDialog");
            }
            rapVarB.f(qugVar);
            return;
        }
        defpackage.rcx rcxVar = this.c;
        android.app.KeyguardManager keyguardManager = rapVarB.d;
        az azVarG = rcxVar.G();
        if (keyguardManager.isKeyguardLocked()) {
            da$.ExternalSyntheticApiModelOutline1.m(keyguardManager, azVarG, new defpackage.ran(rapVarB));
        } else {
            rapVarB.f(qugVar2);
        }
    }

    public final void k(boolean z) {
        this.E.b(java.lang.Boolean.valueOf(z));
    }

    public final void l(boolean z) {
        this.F.b(java.lang.Boolean.valueOf(z));
    }

    public final void m(android.view.View view, aonn aonnVar) {
        ahpr ahprVar = new ahpr(this.h, 697, "setOnApplyWindowInsetsListener", new ebx(aonnVar, 6));
        int i = dzs.a;
        dzk.o(view, ahprVar);
    }

    public final void n(defpackage.rcc rccVar) {
        this.Z.b(rccVar);
    }

    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: pyh
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v17 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v19 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v16 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 3071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdk.o():void");
    }

    public final boolean p() {
        defpackage.rcx rcxVar = this.c;
        return rcxVar.dX().getBoolean(2131034147) && !this.l.a(rcxVar.A());
    }

    public final boolean q() {
        return this.c.dX().getConfiguration().getLayoutDirection() == 1;
    }

    public final boolean r() {
        return this.e.getResources().getBoolean(2131034171);
    }

    public final dwn s(dwn dwnVar, java.lang.Integer num, java.lang.Integer num2) {
        int i;
        int i2;
        java.lang.Integer num3 = true != q() ? null : num;
        if (true == q()) {
            num = null;
        }
        if (num3 != null) {
            num3.intValue();
            i = 0;
        } else {
            i = dwnVar.b;
        }
        int i3 = dwnVar.c;
        if (num != null) {
            num.intValue();
            i2 = 0;
        } else {
            i2 = dwnVar.d;
        }
        num2.intValue();
        return dwn.d(i, i3, i2, 0);
    }
}
