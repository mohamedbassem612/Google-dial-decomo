package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ncw extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.nej e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncw(defpackage.nej nejVar, aoln aolnVar) {
        super(1, aolnVar);
        this.e = nejVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ncw(this.e, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x0138  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a A[PHI: r1
      0x021a: PHI (r1v39 nmo) = (r1v26 nmo), (r1v31 nmo), (r1v36 nmo), (r1v36 nmo), (r1v41 nmo) binds: [B:55:0x01cf, B:69:0x0219, B:65:0x0206, B:67:0x0216, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0221  */
    /* JADX WARN: Code duplicated, block: B:74:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x023f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0273  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.nej nejVar;
        defpackage.nmo nmoVar;
        defpackage.nmo nmoVarB;
        defpackage.nmo nmoVar2;
        aimw aimwVarL;
        java.lang.Object aepgVar;
        java.lang.String str;
        java.lang.Object objA;
        aimw aimwVar;
        defpackage.nej nejVar2;
        defpackage.nej nejVar3;
        defpackage.nej nejVar4;
        defpackage.nmo nmoVar3;
        defpackage.nej nejVar5;
        alsp alspVar;
        defpackage.nej nejVar6;
        java.lang.Object objH;
        defpackage.nej nejVar7;
        defpackage.nmo nmoVar4;
        defpackage.nej nejVar8;
        aimw aimwVarL2;
        aepg aepgVar2;
        java.lang.String str2;
        java.lang.Object objA2;
        java.lang.Object obj2;
        defpackage.nej nejVar9;
        defpackage.nmr nmrVar;
        aoub aoubVar;
        defpackage.nhq nhqVar;
        aolu aoluVar = aolu.a;
        switch (this.d) {
            case 0:
                aooc.af(obj);
                aimz aimzVar = defpackage.nej.a;
                aimzVar.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 632, "DobbyLifecycleController.kt").v("onCallAnswered");
                defpackage.nej nejVar10 = this.e;
                gus.aw("CEVT_CALL_ANSWERED");
                nejVar10.s.c();
                if (nejVar10.N != 0) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 640, "DobbyLifecycleController.kt").v("Skipping handling a non-incoming call");
                    return aojh.a;
                }
                pci pciVar = nejVar10.Y;
                this.d = 1;
                obj = defpackage.nej.Z(pciVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej nejVar11 = this.e;
                    this.d = 3;
                    obj = nejVar11.Z.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    nmoVar2 = nmoVarB;
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            aimwVarL = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 710, "DobbyLifecycleController.kt");
                            aepgVar = new aepg(nmoVar2);
                            defpackage.nej nejVar12 = this.e;
                            this.a = aimwVarL;
                            str = "onCallAnswered in unexpected state: %s, events: %s";
                            this.b = "onCallAnswered in unexpected state: %s, events: %s";
                            this.c = aepgVar;
                            this.d = 16;
                            objA = nejVar12.q.a(this);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            obj = objA;
                            aimwVar = aimwVarL;
                            aimwVar.I(str, aepgVar, new aepg((aenj) obj));
                            break;
                            break;
                        case 1:
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            if (nmoVar2 == defpackage.nmo.TAKING_MESSAGE) {
                                defpackage.nej nejVar13 = this.e;
                                ote.a.b().l("com/android/dialer/incall/activity/InCallUiLock", "acquireCallScopeInCallLock", 26, "InCallUiLock.java").v("Attempt to acquire InCallUiLock");
                                aimw aimwVarL3 = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 73, "CallScopeLockHolder.java");
                                oti otiVar = nejVar13.o.b;
                                aimwVarL3.I("InCallUiLock attempting to lock by %s with callId %s", "dobby", otiVar.e);
                                otiVar.e();
                            }
                            nejVar2 = this.e;
                            this.a = nmoVar2;
                            this.d = 4;
                            if (nejVar2.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar3 = this.e;
                            this.a = nmoVar2;
                            this.d = 5;
                            if (nejVar3.v.e(1, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar4 = this.e;
                            nmoVar3 = defpackage.nmo.ANSWERED;
                            this.a = nmoVar2;
                            this.d = 6;
                            if (nejVar4.O(nmoVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                            if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                                nejVar5 = this.e;
                                alspVar = alsp.d;
                                this.a = nmoVar2;
                                this.d = 7;
                                if (nejVar5.w(alspVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                            defpackage.nej nejVar14 = this.e;
                            this.a = nmoVar2;
                            this.d = 8;
                            obj = nejVar14.Z.a(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((defpackage.nmu) obj).l) {
                                nejVar6 = this.e;
                                this.a = nmoVar2;
                                this.b = nejVar6;
                                this.d = 9;
                                objH = nejVar6.h(this);
                                if (objH != aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nmo nmoVar5 = nmoVar2;
                                nejVar7 = nejVar6;
                                obj = objH;
                                nmoVar4 = nmoVar5;
                                if (nejVar7.W((android.telecom.Call.Details) obj)) {
                                    defpackage.nej nejVar15 = this.e;
                                    this.a = nmoVar4;
                                    this.b = null;
                                    this.d = 10;
                                    obj = nejVar15.m.c(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    nmoVar2 = nmoVar4;
                                    if (((defpackage.nqi) obj).a != udj.c) {
                                        nejVar8 = this.e;
                                        this.a = nmoVar2;
                                        this.d = 11;
                                        if (nejVar8.v.j(this) == aoluVar) {
                                            return aoluVar;
                                        }
                                    }
                                } else {
                                    nmoVar2 = nmoVar4;
                                }
                                switch (nmoVar2.ordinal()) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 11:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    case 16:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        defpackage.nej nejVar16 = this.e;
                                        this.a = nmoVar2;
                                        this.b = null;
                                        this.d = 12;
                                        obj = nejVar16.n(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        break;
                                    default:
                                        throw new aois();
                                }
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                    aepgVar2 = new aepg(nmoVar2);
                                    defpackage.nej nejVar17 = this.e;
                                    this.a = aimwVarL2;
                                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.c = aepgVar2;
                                    this.d = 13;
                                    objA2 = nejVar17.q.a(this);
                                    if (objA2 != aoluVar) {
                                        return aoluVar;
                                    }
                                    obj2 = aepgVar2;
                                    obj = objA2;
                                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                                }
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                                nejVar9 = this.e;
                                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = 14;
                                if (nejVar9.N(nmrVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nej nejVar18 = this.e;
                                aoubVar = nejVar18.H;
                                if (aoubVar != null) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                nhqVar = nejVar18.u;
                                this.d = 15;
                                if (nhqVar.o(this) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                switch (nmoVar2.ordinal()) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 11:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    case 16:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        defpackage.nej nejVar19 = this.e;
                                        this.a = nmoVar2;
                                        this.b = null;
                                        this.d = 12;
                                        obj = nejVar19.n(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        break;
                                    default:
                                        throw new aois();
                                }
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                    aepgVar2 = new aepg(nmoVar2);
                                    defpackage.nej nejVar110 = this.e;
                                    this.a = aimwVarL2;
                                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.c = aepgVar2;
                                    this.d = 13;
                                    objA2 = nejVar110.q.a(this);
                                    if (objA2 != aoluVar) {
                                        return aoluVar;
                                    }
                                    obj2 = aepgVar2;
                                    obj = objA2;
                                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                                }
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                                nejVar9 = this.e;
                                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = 14;
                                if (nejVar9.N(nmrVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nej nejVar111 = this.e;
                                aoubVar = nejVar111.H;
                                if (aoubVar != null) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                nhqVar = nejVar111.u;
                                this.d = 15;
                                if (nhqVar.o(this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        default:
                            throw new aois();
                    }
                } else {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 645, "DobbyLifecycleController.kt").v("onCallAnswered: skip since Dobby is not triggered.");
                    nejVar = this.e;
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.d = 2;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 645, "DobbyLifecycleController.kt").v("onCallAnswered: skip since Dobby is not triggered.");
                    nejVar = this.e;
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.d = 2;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.nej nejVar112 = this.e;
                    this.d = 3;
                    obj = nejVar112.Z.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    nmoVar2 = nmoVarB;
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            aimwVarL = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 710, "DobbyLifecycleController.kt");
                            aepgVar = new aepg(nmoVar2);
                            defpackage.nej nejVar113 = this.e;
                            this.a = aimwVarL;
                            str = "onCallAnswered in unexpected state: %s, events: %s";
                            this.b = "onCallAnswered in unexpected state: %s, events: %s";
                            this.c = aepgVar;
                            this.d = 16;
                            objA = nejVar113.q.a(this);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            obj = objA;
                            aimwVar = aimwVarL;
                            aimwVar.I(str, aepgVar, new aepg((aenj) obj));
                            break;
                            break;
                        case 1:
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            if (nmoVar2 == defpackage.nmo.TAKING_MESSAGE) {
                                defpackage.nej nejVar114 = this.e;
                                ote.a.b().l("com/android/dialer/incall/activity/InCallUiLock", "acquireCallScopeInCallLock", 26, "InCallUiLock.java").v("Attempt to acquire InCallUiLock");
                                aimw aimwVarL4 = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 73, "CallScopeLockHolder.java");
                                oti otiVar2 = nejVar114.o.b;
                                aimwVarL4.I("InCallUiLock attempting to lock by %s with callId %s", "dobby", otiVar2.e);
                                otiVar2.e();
                            }
                            nejVar2 = this.e;
                            this.a = nmoVar2;
                            this.d = 4;
                            if (nejVar2.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar3 = this.e;
                            this.a = nmoVar2;
                            this.d = 5;
                            if (nejVar3.v.e(1, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar4 = this.e;
                            nmoVar3 = defpackage.nmo.ANSWERED;
                            this.a = nmoVar2;
                            this.d = 6;
                            if (nejVar4.O(nmoVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                            if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                                nejVar5 = this.e;
                                alspVar = alsp.d;
                                this.a = nmoVar2;
                                this.d = 7;
                                if (nejVar5.w(alspVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                            defpackage.nej nejVar115 = this.e;
                            this.a = nmoVar2;
                            this.d = 8;
                            obj = nejVar115.Z.a(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((defpackage.nmu) obj).l) {
                                nejVar6 = this.e;
                                this.a = nmoVar2;
                                this.b = nejVar6;
                                this.d = 9;
                                objH = nejVar6.h(this);
                                if (objH != aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nmo nmoVar6 = nmoVar2;
                                nejVar7 = nejVar6;
                                obj = objH;
                                nmoVar4 = nmoVar6;
                                if (nejVar7.W((android.telecom.Call.Details) obj)) {
                                    defpackage.nej nejVar116 = this.e;
                                    this.a = nmoVar4;
                                    this.b = null;
                                    this.d = 10;
                                    obj = nejVar116.m.c(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    nmoVar2 = nmoVar4;
                                    if (((defpackage.nqi) obj).a != udj.c) {
                                        nejVar8 = this.e;
                                        this.a = nmoVar2;
                                        this.d = 11;
                                        if (nejVar8.v.j(this) == aoluVar) {
                                            return aoluVar;
                                        }
                                    }
                                } else {
                                    nmoVar2 = nmoVar4;
                                }
                                switch (nmoVar2.ordinal()) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 11:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    case 16:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        defpackage.nej nejVar117 = this.e;
                                        this.a = nmoVar2;
                                        this.b = null;
                                        this.d = 12;
                                        obj = nejVar117.n(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        break;
                                    default:
                                        throw new aois();
                                }
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                    aepgVar2 = new aepg(nmoVar2);
                                    defpackage.nej nejVar118 = this.e;
                                    this.a = aimwVarL2;
                                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.c = aepgVar2;
                                    this.d = 13;
                                    objA2 = nejVar118.q.a(this);
                                    if (objA2 != aoluVar) {
                                        return aoluVar;
                                    }
                                    obj2 = aepgVar2;
                                    obj = objA2;
                                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                                }
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                                nejVar9 = this.e;
                                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = 14;
                                if (nejVar9.N(nmrVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nej nejVar119 = this.e;
                                aoubVar = nejVar119.H;
                                if (aoubVar != null) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                nhqVar = nejVar119.u;
                                this.d = 15;
                                if (nhqVar.o(this) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                switch (nmoVar2.ordinal()) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 9:
                                    case 11:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    case 16:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 12:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        defpackage.nej nejVar1110 = this.e;
                                        this.a = nmoVar2;
                                        this.b = null;
                                        this.d = 12;
                                        obj = nejVar1110.n(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        break;
                                    default:
                                        throw new aois();
                                }
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                    aepgVar2 = new aepg(nmoVar2);
                                    defpackage.nej nejVar1111 = this.e;
                                    this.a = aimwVarL2;
                                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                    this.c = aepgVar2;
                                    this.d = 13;
                                    objA2 = nejVar1111.q.a(this);
                                    if (objA2 != aoluVar) {
                                        return aoluVar;
                                    }
                                    obj2 = aepgVar2;
                                    obj = objA2;
                                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                                }
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                                nejVar9 = this.e;
                                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.d = 14;
                                if (nejVar9.N(nmrVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                defpackage.nej nejVar1112 = this.e;
                                aoubVar = nejVar1112.H;
                                if (aoubVar != null) {
                                    aoubVar.s((java.util.concurrent.CancellationException) null);
                                }
                                nhqVar = nejVar1112.u;
                                this.d = 15;
                                if (nhqVar.o(this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        default:
                            throw new aois();
                    }
                }
                return aojh.a;
            case 2:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                return aojh.a;
            case 3:
                aooc.af(obj);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                nmoVar2 = nmoVarB;
                switch (nmoVar2.ordinal()) {
                    case 0:
                    case 11:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case 16:
                        aimwVarL = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 710, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVar2);
                        defpackage.nej nejVar1113 = this.e;
                        this.a = aimwVarL;
                        str = "onCallAnswered in unexpected state: %s, events: %s";
                        this.b = "onCallAnswered in unexpected state: %s, events: %s";
                        this.c = aepgVar;
                        this.d = 16;
                        objA = nejVar1113.q.a(this);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        obj = objA;
                        aimwVar = aimwVarL;
                        aimwVar.I(str, aepgVar, new aepg((aenj) obj));
                        return aojh.a;
                    case 1:
                        return aojh.a;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        if (nmoVar2 == defpackage.nmo.TAKING_MESSAGE) {
                            defpackage.nej nejVar1114 = this.e;
                            ote.a.b().l("com/android/dialer/incall/activity/InCallUiLock", "acquireCallScopeInCallLock", 26, "InCallUiLock.java").v("Attempt to acquire InCallUiLock");
                            aimw aimwVarL5 = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "acquireInCallUiLock", 73, "CallScopeLockHolder.java");
                            oti otiVar3 = nejVar1114.o.b;
                            aimwVarL5.I("InCallUiLock attempting to lock by %s with callId %s", "dobby", otiVar3.e);
                            otiVar3.e();
                        }
                        nejVar2 = this.e;
                        this.a = nmoVar2;
                        this.d = 4;
                        if (nejVar2.y.n(this) == aoluVar) {
                            return aoluVar;
                        }
                        nejVar3 = this.e;
                        this.a = nmoVar2;
                        this.d = 5;
                        if (nejVar3.v.e(1, this) == aoluVar) {
                            return aoluVar;
                        }
                        nejVar4 = this.e;
                        nmoVar3 = defpackage.nmo.ANSWERED;
                        this.a = nmoVar2;
                        this.d = 6;
                        if (nejVar4.O(nmoVar3, this) == aoluVar) {
                            return aoluVar;
                        }
                        if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                            nejVar5 = this.e;
                            alspVar = alsp.d;
                            this.a = nmoVar2;
                            this.d = 7;
                            if (nejVar5.w(alspVar, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        defpackage.nej nejVar1115 = this.e;
                        this.a = nmoVar2;
                        this.d = 8;
                        obj = nejVar1115.Z.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (((defpackage.nmu) obj).l) {
                            nejVar6 = this.e;
                            this.a = nmoVar2;
                            this.b = nejVar6;
                            this.d = 9;
                            objH = nejVar6.h(this);
                            if (objH != aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nmo nmoVar7 = nmoVar2;
                            nejVar7 = nejVar6;
                            obj = objH;
                            nmoVar4 = nmoVar7;
                            if (nejVar7.W((android.telecom.Call.Details) obj)) {
                                defpackage.nej nejVar1116 = this.e;
                                this.a = nmoVar4;
                                this.b = null;
                                this.d = 10;
                                obj = nejVar1116.m.c(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVar2 = nmoVar4;
                                if (((defpackage.nqi) obj).a != udj.c) {
                                    nejVar8 = this.e;
                                    this.a = nmoVar2;
                                    this.d = 11;
                                    if (nejVar8.v.j(this) == aoluVar) {
                                        return aoluVar;
                                    }
                                }
                            } else {
                                nmoVar2 = nmoVar4;
                            }
                            switch (nmoVar2.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                case 9:
                                case 11:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                case 16:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                    defpackage.nej nejVar1117 = this.e;
                                    this.a = nmoVar2;
                                    this.b = null;
                                    this.d = 12;
                                    obj = nejVar1117.n(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    break;
                                default:
                                    throw new aois();
                            }
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                aepgVar2 = new aepg(nmoVar2);
                                defpackage.nej nejVar1118 = this.e;
                                this.a = aimwVarL2;
                                str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                this.c = aepgVar2;
                                this.d = 13;
                                objA2 = nejVar1118.q.a(this);
                                if (objA2 != aoluVar) {
                                    return aoluVar;
                                }
                                obj2 = aepgVar2;
                                obj = objA2;
                                aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                            }
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                            nejVar9 = this.e;
                            nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = 14;
                            if (nejVar9.N(nmrVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej nejVar1119 = this.e;
                            aoubVar = nejVar1119.H;
                            if (aoubVar != null) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            nhqVar = nejVar1119.u;
                            this.d = 15;
                            if (nhqVar.o(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            switch (nmoVar2.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                case 9:
                                case 11:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                case 16:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                    defpackage.nej nejVar11110 = this.e;
                                    this.a = nmoVar2;
                                    this.b = null;
                                    this.d = 12;
                                    obj = nejVar11110.n(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    break;
                                default:
                                    throw new aois();
                            }
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                                aepgVar2 = new aepg(nmoVar2);
                                defpackage.nej nejVar11111 = this.e;
                                this.a = aimwVarL2;
                                str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                                this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                                this.c = aepgVar2;
                                this.d = 13;
                                objA2 = nejVar11111.q.a(this);
                                if (objA2 != aoluVar) {
                                    return aoluVar;
                                }
                                obj2 = aepgVar2;
                                obj = objA2;
                                aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                            }
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                            nejVar9 = this.e;
                            nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = 14;
                            if (nejVar9.N(nmrVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej nejVar11112 = this.e;
                            aoubVar = nejVar11112.H;
                            if (aoubVar != null) {
                                aoubVar.s((java.util.concurrent.CancellationException) null);
                            }
                            nhqVar = nejVar11112.u;
                            this.d = 15;
                            if (nhqVar.o(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 4:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                nejVar3 = this.e;
                this.a = nmoVar2;
                this.d = 5;
                if (nejVar3.v.e(1, this) == aoluVar) {
                    return aoluVar;
                }
                nejVar4 = this.e;
                nmoVar3 = defpackage.nmo.ANSWERED;
                this.a = nmoVar2;
                this.d = 6;
                if (nejVar4.O(nmoVar3, this) == aoluVar) {
                    return aoluVar;
                }
                if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                    nejVar5 = this.e;
                    alspVar = alsp.d;
                    this.a = nmoVar2;
                    this.d = 7;
                    if (nejVar5.w(alspVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.nej nejVar11113 = this.e;
                this.a = nmoVar2;
                this.d = 8;
                obj = nejVar11113.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).l) {
                    nejVar6 = this.e;
                    this.a = nmoVar2;
                    this.b = nejVar6;
                    this.d = 9;
                    objH = nejVar6.h(this);
                    if (objH != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar8 = nmoVar2;
                    nejVar7 = nejVar6;
                    obj = objH;
                    nmoVar4 = nmoVar8;
                    if (nejVar7.W((android.telecom.Call.Details) obj)) {
                        defpackage.nej nejVar11114 = this.e;
                        this.a = nmoVar4;
                        this.b = null;
                        this.d = 10;
                        obj = nejVar11114.m.c(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVar2 = nmoVar4;
                        if (((defpackage.nqi) obj).a != udj.c) {
                            nejVar8 = this.e;
                            this.a = nmoVar2;
                            this.d = 11;
                            if (nejVar8.v.j(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        nmoVar2 = nmoVar4;
                    }
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar11115 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar11115.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar11116 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar11116.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar11117 = this.e;
                    aoubVar = nejVar11117.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar11117.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar11118 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar11118.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar11119 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar11119.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar111110 = this.e;
                    aoubVar = nejVar111110.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar111110.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                nejVar4 = this.e;
                nmoVar3 = defpackage.nmo.ANSWERED;
                this.a = nmoVar2;
                this.d = 6;
                if (nejVar4.O(nmoVar3, this) == aoluVar) {
                    return aoluVar;
                }
                if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                    nejVar5 = this.e;
                    alspVar = alsp.d;
                    this.a = nmoVar2;
                    this.d = 7;
                    if (nejVar5.w(alspVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.nej nejVar111111 = this.e;
                this.a = nmoVar2;
                this.d = 8;
                obj = nejVar111111.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).l) {
                    nejVar6 = this.e;
                    this.a = nmoVar2;
                    this.b = nejVar6;
                    this.d = 9;
                    objH = nejVar6.h(this);
                    if (objH != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar9 = nmoVar2;
                    nejVar7 = nejVar6;
                    obj = objH;
                    nmoVar4 = nmoVar9;
                    if (nejVar7.W((android.telecom.Call.Details) obj)) {
                        defpackage.nej nejVar111112 = this.e;
                        this.a = nmoVar4;
                        this.b = null;
                        this.d = 10;
                        obj = nejVar111112.m.c(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVar2 = nmoVar4;
                        if (((defpackage.nqi) obj).a != udj.c) {
                            nejVar8 = this.e;
                            this.a = nmoVar2;
                            this.d = 11;
                            if (nejVar8.v.j(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        nmoVar2 = nmoVar4;
                    }
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar111113 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar111113.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar111114 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar111114.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar111115 = this.e;
                    aoubVar = nejVar111115.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar111115.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar111116 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar111116.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar111117 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar111117.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar111118 = this.e;
                    aoubVar = nejVar111118.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar111118.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 6:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (nmoVar2 == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                    nejVar5 = this.e;
                    alspVar = alsp.d;
                    this.a = nmoVar2;
                    this.d = 7;
                    if (nejVar5.w(alspVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.nej nejVar111119 = this.e;
                this.a = nmoVar2;
                this.d = 8;
                obj = nejVar111119.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).l) {
                    nejVar6 = this.e;
                    this.a = nmoVar2;
                    this.b = nejVar6;
                    this.d = 9;
                    objH = nejVar6.h(this);
                    if (objH != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar10 = nmoVar2;
                    nejVar7 = nejVar6;
                    obj = objH;
                    nmoVar4 = nmoVar10;
                    if (nejVar7.W((android.telecom.Call.Details) obj)) {
                        defpackage.nej nejVar1111110 = this.e;
                        this.a = nmoVar4;
                        this.b = null;
                        this.d = 10;
                        obj = nejVar1111110.m.c(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVar2 = nmoVar4;
                        if (((defpackage.nqi) obj).a != udj.c) {
                            nejVar8 = this.e;
                            this.a = nmoVar2;
                            this.d = 11;
                            if (nejVar8.v.j(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        nmoVar2 = nmoVar4;
                    }
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar1111111 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar1111111.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar1111112 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar1111112.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar1111113 = this.e;
                    aoubVar = nejVar1111113.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar1111113.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar1111114 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar1111114.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar1111115 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar1111115.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar1111116 = this.e;
                    aoubVar = nejVar1111116.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar1111116.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 7:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                defpackage.nej nejVar1111117 = this.e;
                this.a = nmoVar2;
                this.d = 8;
                obj = nejVar1111117.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).l) {
                    nejVar6 = this.e;
                    this.a = nmoVar2;
                    this.b = nejVar6;
                    this.d = 9;
                    objH = nejVar6.h(this);
                    if (objH != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar11 = nmoVar2;
                    nejVar7 = nejVar6;
                    obj = objH;
                    nmoVar4 = nmoVar11;
                    if (nejVar7.W((android.telecom.Call.Details) obj)) {
                        defpackage.nej nejVar1111118 = this.e;
                        this.a = nmoVar4;
                        this.b = null;
                        this.d = 10;
                        obj = nejVar1111118.m.c(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVar2 = nmoVar4;
                        if (((defpackage.nqi) obj).a != udj.c) {
                            nejVar8 = this.e;
                            this.a = nmoVar2;
                            this.d = 11;
                            if (nejVar8.v.j(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        nmoVar2 = nmoVar4;
                    }
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar1111119 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar1111119.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar11111110 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar11111110.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar11111111 = this.e;
                    aoubVar = nejVar11111111.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar11111111.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar11111112 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar11111112.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar11111113 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar11111113.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar11111114 = this.e;
                    aoubVar = nejVar11111114.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar11111114.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 8:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (((defpackage.nmu) obj).l) {
                    nejVar6 = this.e;
                    this.a = nmoVar2;
                    this.b = nejVar6;
                    this.d = 9;
                    objH = nejVar6.h(this);
                    if (objH != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar12 = nmoVar2;
                    nejVar7 = nejVar6;
                    obj = objH;
                    nmoVar4 = nmoVar12;
                    if (nejVar7.W((android.telecom.Call.Details) obj)) {
                        defpackage.nej nejVar11111115 = this.e;
                        this.a = nmoVar4;
                        this.b = null;
                        this.d = 10;
                        obj = nejVar11111115.m.c(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVar2 = nmoVar4;
                        if (((defpackage.nqi) obj).a != udj.c) {
                            nejVar8 = this.e;
                            this.a = nmoVar2;
                            this.d = 11;
                            if (nejVar8.v.j(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        nmoVar2 = nmoVar4;
                    }
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar11111116 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar11111116.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar11111117 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar11111117.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar11111118 = this.e;
                    aoubVar = nejVar11111118.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar11111118.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    switch (nmoVar2.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 9:
                        case 11:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        case 16:
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej nejVar11111119 = this.e;
                            this.a = nmoVar2;
                            this.b = null;
                            this.d = 12;
                            obj = nejVar11111119.n(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            break;
                        default:
                            throw new aois();
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar2);
                        defpackage.nej nejVar111111110 = this.e;
                        this.a = aimwVarL2;
                        str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                        this.c = aepgVar2;
                        this.d = 13;
                        objA2 = nejVar111111110.q.a(this);
                        if (objA2 != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aepgVar2;
                        obj = objA2;
                        aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                    nejVar9 = this.e;
                    nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 14;
                    if (nejVar9.N(nmrVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar111111111 = this.e;
                    aoubVar = nejVar111111111.H;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    nhqVar = nejVar111111111.u;
                    this.d = 15;
                    if (nhqVar.o(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 9:
                nejVar7 = (defpackage.nej) this.b;
                nmoVar4 = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (nejVar7.W((android.telecom.Call.Details) obj)) {
                    defpackage.nej nejVar111111112 = this.e;
                    this.a = nmoVar4;
                    this.b = null;
                    this.d = 10;
                    obj = nejVar111111112.m.c(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVar2 = nmoVar4;
                    if (((defpackage.nqi) obj).a != udj.c) {
                        nejVar8 = this.e;
                        this.a = nmoVar2;
                        this.d = 11;
                        if (nejVar8.v.j(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    nmoVar2 = nmoVar4;
                }
                switch (nmoVar2.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 9:
                    case 11:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case 16:
                        return aojh.a;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        defpackage.nej nejVar111111113 = this.e;
                        this.a = nmoVar2;
                        this.b = null;
                        this.d = 12;
                        obj = nejVar111111113.n(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    default:
                        throw new aois();
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                    aepgVar2 = new aepg(nmoVar2);
                    defpackage.nej nejVar111111114 = this.e;
                    this.a = aimwVarL2;
                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.c = aepgVar2;
                    this.d = 13;
                    objA2 = nejVar111111114.q.a(this);
                    if (objA2 != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aepgVar2;
                    obj = objA2;
                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                nejVar9 = this.e;
                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 14;
                if (nejVar9.N(nmrVar, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar111111115 = this.e;
                aoubVar = nejVar111111115.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar111111115.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 10:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (((defpackage.nqi) obj).a != udj.c) {
                    nejVar8 = this.e;
                    this.a = nmoVar2;
                    this.d = 11;
                    if (nejVar8.v.j(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                switch (nmoVar2.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 9:
                    case 11:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case 16:
                        return aojh.a;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        defpackage.nej nejVar111111116 = this.e;
                        this.a = nmoVar2;
                        this.b = null;
                        this.d = 12;
                        obj = nejVar111111116.n(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    default:
                        throw new aois();
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                    aepgVar2 = new aepg(nmoVar2);
                    defpackage.nej nejVar111111117 = this.e;
                    this.a = aimwVarL2;
                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.c = aepgVar2;
                    this.d = 13;
                    objA2 = nejVar111111117.q.a(this);
                    if (objA2 != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aepgVar2;
                    obj = objA2;
                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                nejVar9 = this.e;
                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 14;
                if (nejVar9.N(nmrVar, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar111111118 = this.e;
                aoubVar = nejVar111111118.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar111111118.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 11:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                switch (nmoVar2.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 9:
                    case 11:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case 16:
                        return aojh.a;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        defpackage.nej nejVar111111119 = this.e;
                        this.a = nmoVar2;
                        this.b = null;
                        this.d = 12;
                        obj = nejVar111111119.n(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    default:
                        throw new aois();
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                    aepgVar2 = new aepg(nmoVar2);
                    defpackage.nej nejVar1111111110 = this.e;
                    this.a = aimwVarL2;
                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.c = aepgVar2;
                    this.d = 13;
                    objA2 = nejVar1111111110.q.a(this);
                    if (objA2 != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aepgVar2;
                    obj = objA2;
                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                nejVar9 = this.e;
                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 14;
                if (nejVar9.N(nmrVar, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar1111111111 = this.e;
                aoubVar = nejVar1111111111.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar1111111111.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 12:
                nmoVar2 = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 686, "DobbyLifecycleController.kt");
                    aepgVar2 = new aepg(nmoVar2);
                    defpackage.nej nejVar1111111112 = this.e;
                    this.a = aimwVarL2;
                    str2 = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.b = "onCallAnswered stops non-started session in state: %s, events: %s";
                    this.c = aepgVar2;
                    this.d = 13;
                    objA2 = nejVar1111111112.q.a(this);
                    if (objA2 != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aepgVar2;
                    obj = objA2;
                    aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                nejVar9 = this.e;
                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 14;
                if (nejVar9.N(nmrVar, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar1111111113 = this.e;
                aoubVar = nejVar1111111113.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar1111111113.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                obj2 = this.c;
                str2 = (java.lang.String) this.b;
                aimwVarL2 = (aimw) this.a;
                aooc.af(obj);
                aimwVarL2.I(str2, obj2, new aepg((aenj) obj));
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallAnsweredDeferred$<anonymous>", 694, "DobbyLifecycleController.kt").v("Ending session");
                nejVar9 = this.e;
                nmrVar = defpackage.nmr.USER_ACCEPT_CALL;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 14;
                if (nejVar9.N(nmrVar, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar1111111114 = this.e;
                aoubVar = nejVar1111111114.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar1111111114.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                defpackage.nej nejVar1111111115 = this.e;
                aoubVar = nejVar1111111115.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = nejVar1111111115.u;
                this.d = 15;
                if (nhqVar.o(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            default:
                aepgVar = this.c;
                str = (java.lang.String) this.b;
                aimwVar = (aimw) this.a;
                aooc.af(obj);
                aimwVar.I(str, aepgVar, new aepg((aenj) obj));
                return aojh.a;
        }
    }
}
