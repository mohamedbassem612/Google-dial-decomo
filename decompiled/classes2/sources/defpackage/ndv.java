package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ndv extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    int g;
    final /* synthetic */ defpackage.nej h;
    final /* synthetic */ alta i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndv(defpackage.nej nejVar, alta altaVar, aoln aolnVar) {
        super(1, aolnVar);
        this.h = nejVar;
        this.i = altaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ndv(this.h, this.i, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163 A[Catch: CancellationException -> 0x01b6, TryCatch #0 {CancellationException -> 0x01b6, blocks: (B:7:0x0031, B:60:0x0198, B:8:0x0036, B:58:0x016e, B:9:0x003b, B:54:0x015b, B:56:0x0163, B:10:0x0040, B:52:0x014e, B:44:0x0129, B:46:0x012d, B:48:0x0131, B:50:0x0141), top: B:76:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nmo nmoVarB;
        defpackage.nmo nmoVar;
        defpackage.nej nejVar;
        ptx ptxVar;
        aimw aimwVarL;
        java.lang.Object objC;
        aenj[] aenjVarArr;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aenj[] aenjVarArr2;
        java.lang.Object objC2;
        java.lang.Object obj4;
        aimw aimwVar;
        aenj[] aenjVarArr3;
        aimw aimwVar2;
        alta altaVar;
        defpackage.nej nejVar2;
        defpackage.nej nejVar3;
        defpackage.nej nejVar4;
        defpackage.nmo nmoVar2;
        java.lang.Object obj5;
        aolu aoluVar = aolu.a;
        int i = 1;
        try {
            switch (this.g) {
                case 0:
                    aooc.af(obj);
                    defpackage.nej nejVar5 = this.h;
                    this.g = 1;
                    obj = nejVar5.Z.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    nmoVar = nmoVarB;
                    nejVar = this.h;
                    ptxVar = nejVar.W;
                    if (!ptxVar.l() || ptxVar.r()) {
                        aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDeferred$<anonymous>", 1477, "DobbyLifecycleController.kt");
                        objC = aenj.c((java.lang.String) null, nmoVar);
                        aenjVarArr = new aenj[2];
                        aenjVarArr[0] = new aenj(", events:");
                        defpackage.mqt mqtVar = nejVar.q;
                        this.a = aenjVarArr;
                        this.b = aimwVarL;
                        this.c = "Ignore ringing in state %s";
                        this.d = objC;
                        this.e = aenjVarArr;
                        this.f = 1;
                        this.g = 2;
                        obj = mqtVar.a(this);
                        if (obj != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = aenjVarArr;
                        obj3 = "Ignore ringing in state %s";
                        aenjVarArr2 = obj2;
                        aimwVar2 = aimwVarL;
                        ((aenj[]) obj2)[i] = (aenj) obj;
                        aimwVar2.y((java.lang.String) obj3, new aepg(aenj.b((aenj) objC, aenjVarArr2)));
                        this.h.n.b(mce.cs);
                        return aojh.a;
                    }
                    if (nmoVar == defpackage.nmo.AUTO_SCREENING || nmoVar == defpackage.nmo.AUTO_SCREENING_WITH_UI || nmoVar == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI || ((((java.lang.Boolean) nejVar.A.a()).booleanValue() || ((java.lang.Boolean) nejVar.z.a()).booleanValue()) && nmoVar == defpackage.nmo.MANUAL_SCREENING)) {
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDeferred$<anonymous>", 1500, "DobbyLifecycleController.kt").v("Starting ringing");
                        this.a = nmoVar;
                        this.g = 3;
                        if (nejVar.d(this) == aoluVar) {
                            return aoluVar;
                        }
                        altaVar = this.i;
                        if (altaVar != null && (nmoVar != defpackage.nmo.MANUAL_SCREENING || ((java.lang.Boolean) this.h.A.a()).booleanValue())) {
                            nejVar2 = this.h;
                            this.a = null;
                            this.g = 4;
                            if (nejVar2.t(altaVar, false, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        defpackage.nej nejVar6 = this.h;
                        this.a = null;
                        this.g = 5;
                        obj = nejVar6.q(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            nejVar3 = this.h;
                            this.g = 6;
                            if (nejVar3.x(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        defpackage.nej nejVar7 = this.h;
                        nejVar7.ab.a.put(java.lang.Long.valueOf(nejVar7.b), "Dobby");
                        defpackage.mfz mfzVar = nejVar7.s;
                        gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
                        mfzVar.c();
                        ajcq ajcqVarG = nejVar7.V.g(true);
                        this.g = 7;
                        obj = aosv.D(ajcqVarG, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nejVar4 = this.h;
                        nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                        this.g = 9;
                        if (nejVar4.O(nmoVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.nej nejVar8 = this.h;
                        nejVar8.T(nejVar8.f, new defpackage.ndu(nejVar8, (aoln) null, 0));
                    } else if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                        this.h.n.b(mce.cy);
                    } else {
                        aimw aimwVarL2 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDeferred$<anonymous>", 1531, "DobbyLifecycleController.kt");
                        objC2 = aenj.c((java.lang.String) null, nmoVar);
                        aenj[] aenjVarArr4 = new aenj[2];
                        aenjVarArr4[0] = new aenj(", events:");
                        defpackage.nej nejVar9 = this.h;
                        this.a = aenjVarArr4;
                        this.b = aimwVarL2;
                        obj4 = "ACS failed to quit with ringing in state %s";
                        this.c = "ACS failed to quit with ringing in state %s";
                        this.d = objC2;
                        this.e = aenjVarArr4;
                        this.f = 1;
                        this.g = 10;
                        java.lang.Object objA = nejVar9.q.a(this);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar = aimwVarL2;
                        obj = objA;
                        aenjVarArr3 = aenjVarArr4;
                        obj5 = aenjVarArr4;
                        ((aenj[]) obj5)[i] = (aenj) obj;
                        aimwVar.y((java.lang.String) obj4, new aepg(aenj.b((aenj) objC2, aenjVarArr3)));
                        this.h.n.a(mcd.ai);
                    }
                    return aojh.a;
                case 1:
                    aooc.af(obj);
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    nmoVar = nmoVarB;
                    nejVar = this.h;
                    ptxVar = nejVar.W;
                    if (ptxVar.l()) {
                        break;
                    }
                    aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDeferred$<anonymous>", 1477, "DobbyLifecycleController.kt");
                    objC = aenj.c((java.lang.String) null, nmoVar);
                    aenjVarArr = new aenj[2];
                    aenjVarArr[0] = new aenj(", events:");
                    defpackage.mqt mqtVar2 = nejVar.q;
                    this.a = aenjVarArr;
                    this.b = aimwVarL;
                    this.c = "Ignore ringing in state %s";
                    this.d = objC;
                    this.e = aenjVarArr;
                    this.f = 1;
                    this.g = 2;
                    obj = mqtVar2.a(this);
                    if (obj != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = aenjVarArr;
                    obj3 = "Ignore ringing in state %s";
                    aenjVarArr2 = obj2;
                    aimwVar2 = aimwVarL;
                    ((aenj[]) obj2)[i] = (aenj) obj;
                    aimwVar2.y((java.lang.String) obj3, new aepg(aenj.b((aenj) objC, aenjVarArr2)));
                    this.h.n.b(mce.cs);
                    return aojh.a;
                case 2:
                    i = this.f;
                    obj2 = this.e;
                    objC = this.d;
                    obj3 = this.c;
                    java.lang.Object obj6 = this.b;
                    aenj[] aenjVarArr5 = (aenj[]) this.a;
                    aooc.af(obj);
                    aimwVar2 = obj6;
                    aenjVarArr2 = aenjVarArr5;
                    ((aenj[]) obj2)[i] = (aenj) obj;
                    aimwVar2.y((java.lang.String) obj3, new aepg(aenj.b((aenj) objC, aenjVarArr2)));
                    this.h.n.b(mce.cs);
                    return aojh.a;
                case 3:
                    nmoVar = (defpackage.nmo) this.a;
                    aooc.af(obj);
                    altaVar = this.i;
                    if (altaVar != null) {
                        nejVar2 = this.h;
                        this.a = null;
                        this.g = 4;
                        if (nejVar2.t(altaVar, false, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.nej nejVar10 = this.h;
                    this.a = null;
                    this.g = 5;
                    obj = nejVar10.q(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        nejVar3 = this.h;
                        this.g = 6;
                        if (nejVar3.x(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.nej nejVar11 = this.h;
                    nejVar11.ab.a.put(java.lang.Long.valueOf(nejVar11.b), "Dobby");
                    defpackage.mfz mfzVar2 = nejVar11.s;
                    gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
                    mfzVar2.c();
                    ajcq ajcqVarG2 = nejVar11.V.g(true);
                    this.g = 7;
                    obj = aosv.D(ajcqVarG2, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nejVar4 = this.h;
                    nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.g = 9;
                    if (nejVar4.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar12 = this.h;
                    nejVar12.T(nejVar12.f, new defpackage.ndu(nejVar12, (aoln) null, 0));
                    return aojh.a;
                case 4:
                    aooc.af(obj);
                    defpackage.nej nejVar13 = this.h;
                    this.a = null;
                    this.g = 5;
                    obj = nejVar13.q(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        nejVar3 = this.h;
                        this.g = 6;
                        if (nejVar3.x(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.nej nejVar14 = this.h;
                    nejVar14.ab.a.put(java.lang.Long.valueOf(nejVar14.b), "Dobby");
                    defpackage.mfz mfzVar3 = nejVar14.s;
                    gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
                    mfzVar3.c();
                    ajcq ajcqVarG3 = nejVar14.V.g(true);
                    this.g = 7;
                    obj = aosv.D(ajcqVarG3, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nejVar4 = this.h;
                    nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.g = 9;
                    if (nejVar4.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar15 = this.h;
                    nejVar15.T(nejVar15.f, new defpackage.ndu(nejVar15, (aoln) null, 0));
                    return aojh.a;
                case 5:
                    aooc.af(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        nejVar3 = this.h;
                        this.g = 6;
                        if (nejVar3.x(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.nej nejVar16 = this.h;
                    nejVar16.ab.a.put(java.lang.Long.valueOf(nejVar16.b), "Dobby");
                    defpackage.mfz mfzVar4 = nejVar16.s;
                    gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
                    mfzVar4.c();
                    ajcq ajcqVarG4 = nejVar16.V.g(true);
                    this.g = 7;
                    obj = aosv.D(ajcqVarG4, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nejVar4 = this.h;
                    nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.g = 9;
                    if (nejVar4.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar17 = this.h;
                    nejVar17.T(nejVar17.f, new defpackage.ndu(nejVar17, (aoln) null, 0));
                    return aojh.a;
                case 6:
                    aooc.af(obj);
                    defpackage.nej nejVar18 = this.h;
                    nejVar18.ab.a.put(java.lang.Long.valueOf(nejVar18.b), "Dobby");
                    defpackage.mfz mfzVar5 = nejVar18.s;
                    gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
                    mfzVar5.c();
                    ajcq ajcqVarG5 = nejVar18.V.g(true);
                    this.g = 7;
                    obj = aosv.D(ajcqVarG5, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nejVar4 = this.h;
                    nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.g = 9;
                    if (nejVar4.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar19 = this.h;
                    nejVar19.T(nejVar19.f, new defpackage.ndu(nejVar19, (aoln) null, 0));
                    return aojh.a;
                case 7:
                    aooc.af(obj);
                    nejVar4 = this.h;
                    nmoVar2 = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.g = 9;
                    if (nejVar4.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar110 = this.h;
                    nejVar110.T(nejVar110.f, new defpackage.ndu(nejVar110, (aoln) null, 0));
                    return aojh.a;
                case 8:
                    java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) this.a;
                    aooc.af(obj);
                    throw cancellationException;
                case 9:
                    aooc.af(obj);
                    defpackage.nej nejVar111 = this.h;
                    nejVar111.T(nejVar111.f, new defpackage.ndu(nejVar111, (aoln) null, 0));
                    return aojh.a;
                default:
                    i = this.f;
                    java.lang.Object obj7 = this.e;
                    objC2 = this.d;
                    obj4 = this.c;
                    java.lang.Object obj8 = this.b;
                    aenj[] aenjVarArr6 = (aenj[]) this.a;
                    aooc.af(obj);
                    aimwVar = obj8;
                    obj5 = obj7;
                    aenjVarArr3 = aenjVarArr6;
                    ((aenj[]) obj5)[i] = (aenj) obj;
                    aimwVar.y((java.lang.String) obj4, new aepg(aenj.b((aenj) objC2, aenjVarArr3)));
                    this.h.n.a(mcd.ai);
                    return aojh.a;
            }
        } catch (java.util.concurrent.CancellationException e) {
            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDeferred$<anonymous>", 1520, "DobbyLifecycleController.kt").v("startRinging was cancelled");
            defpackage.nej nejVar20 = this.h;
            aour aourVar = aour.a;
            defpackage.ndu nduVar = new defpackage.ndu(nejVar20, (aoln) null, 1, (byte[]) null);
            this.a = e;
            this.g = 8;
            if (aoov.aj(aourVar, nduVar, this) != aoluVar) {
                throw e;
            }
            return aoluVar;
        }
    }
}
