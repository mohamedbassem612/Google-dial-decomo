package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ndr extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.nej e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndr(defpackage.nej nejVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.e = nejVar;
        this.f = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ndr(this.e, this.f, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:38:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0162  */
    /* JADX WARN: Code duplicated, block: B:45:0x0177  */
    /* JADX WARN: Code duplicated, block: B:47:0x018b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x020b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0234 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0235  */
    /* JADX WARN: Code duplicated, block: B:67:0x024b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0256 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:74:0x0284  */
    /* JADX WARN: Code duplicated, block: B:77:0x029f  */
    /* JADX WARN: Code duplicated, block: B:79:0x02af  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.nmo nmoVarB;
        defpackage.nmo nmoVar;
        aimw aimwVarL;
        java.lang.Object aepgVar;
        java.lang.Object objA;
        aimw aimwVar;
        aimw aimwVarL2;
        java.lang.Object obj2;
        defpackage.nej nejVar;
        defpackage.nmo nmoVar2;
        defpackage.nej nejVar2;
        defpackage.nmo nmoVar3;
        defpackage.nej nejVar3;
        defpackage.nmo nmoVar4;
        defpackage.nej nejVar4;
        defpackage.nmo nmoVar5;
        aimw aimwVarL3;
        aepg aepgVar2;
        java.lang.Object objA2;
        aimw aimwVar2;
        java.lang.Object obj3;
        pca pcaVar;
        aepg aepgVar3;
        aimw aimwVar3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aolu aoluVar = aolu.a;
        java.lang.Object obj6 = "NGCS.WrongStateStart.MCS state %s, events:%s";
        switch (this.d) {
            case 0:
                aooc.af(obj);
                defpackage.nej nejVar5 = this.e;
                this.d = 1;
                obj = nejVar5.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                nmoVar = nmoVarB;
                switch (nmoVar.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 16:
                        aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1258, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVar);
                        defpackage.nej nejVar6 = this.e;
                        this.a = aimwVarL;
                        this.b = "NGCS.WrongStateStart.MCS state %s, events:%s";
                        this.c = aepgVar;
                        this.d = 13;
                        objA = nejVar6.q.a(this);
                        if (objA != aoluVar) {
                            return aoluVar;
                        }
                        aimwVar = aimwVarL;
                        obj = objA;
                        aimwVar.I((java.lang.String) obj6, aepgVar, new aepg((aenj) obj));
                        this.e.n.a(mcd.F);
                        return aojh.a;
                    case 1:
                        defpackage.nej nejVar7 = this.e;
                        nejVar7.n.b(mce.cu);
                        aimwVarL2 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1240, "DobbyLifecycleController.kt");
                        this.a = aimwVarL2;
                        obj2 = "NGCS.WrongStateStart.MCS state NOT_A_DOBBY_CALL(Feature:%s), events:%s";
                        this.b = "NGCS.WrongStateStart.MCS state NOT_A_DOBBY_CALL(Feature:%s), events:%s";
                        this.d = 11;
                        obj = nejVar7.Y.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        pcaVar = (pca) obj;
                        if (pcaVar == null) {
                            pcaVar = pca.a;
                        }
                        aepgVar3 = new aepg(pcaVar);
                        defpackage.nej nejVar8 = this.e;
                        this.a = aimwVarL2;
                        this.b = obj2;
                        this.c = aepgVar3;
                        this.d = 12;
                        obj = nejVar8.q.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar3 = aimwVarL2;
                        obj4 = obj2;
                        obj5 = aepgVar3;
                        aimwVar3.I((java.lang.String) obj4, obj5, new aepg((aenj) obj));
                        return aojh.a;
                    case 2:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1161, "DobbyLifecycleController.kt").v("Starting manual screening");
                        defpackage.nej nejVar9 = this.e;
                        this.d = 2;
                        obj = defpackage.nej.aa(nejVar9.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1163, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            return aojh.a;
                        }
                        nejVar2 = this.e;
                        gus.aw("CEVT_CMD_ENTER_AUDIOPROCESSING");
                        nejVar2.s.c();
                        nejVar2.V.m();
                        if (this.f) {
                            nmoVar3 = defpackage.nmo.MANUAL_SCREENING;
                            this.d = 5;
                            if (nejVar2.O(nmoVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (!((java.lang.Boolean) nejVar2.E.a()).booleanValue()) {
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1181, "DobbyLifecycleController.kt").v("Failed to start manual screening without UI because the feature is not enabled.");
                                return aojh.a;
                            }
                            this.d = 3;
                            if (nejVar2.y(this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1176, "DobbyLifecycleController.kt").v("Starting manual screening without UI");
                            nejVar3 = this.e;
                            nmoVar4 = defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI;
                            this.d = 4;
                            if (nejVar3.O(nmoVar4, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 3:
                    case 4:
                        defpackage.nej nejVar10 = this.e;
                        this.d = 6;
                        obj = defpackage.nej.aa(nejVar10.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1193, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            return aojh.a;
                        }
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1196, "DobbyLifecycleController.kt").v("Switching from automatic to manual screening");
                        nejVar4 = this.e;
                        nmoVar5 = defpackage.nmo.MANUAL_SCREENING;
                        this.d = 7;
                        if (nejVar4.O(nmoVar5, this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 5:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1200, "DobbyLifecycleController.kt").v("already started manual screening");
                        return aojh.a;
                    case 6:
                        if (this.f) {
                            nejVar = this.e;
                            nmoVar2 = defpackage.nmo.MANUAL_SCREENING;
                            this.d = 8;
                            if (nejVar.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1206, "DobbyLifecycleController.kt").v("already started manual screening without UI");
                        }
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1210, "DobbyLifecycleController.kt").v("start MCS on already answered call");
                        this.e.n.b(mce.cs);
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        defpackage.nej nejVar11 = this.e;
                        this.a = nmoVar;
                        this.d = 9;
                        obj = defpackage.nej.aa(nejVar11.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1219, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            this.e.n.b(mce.ct);
                            return aojh.a;
                        }
                        aimwVarL3 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1225, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar);
                        defpackage.nej nejVar12 = this.e;
                        this.a = aimwVarL3;
                        this.b = "NGCS.WrongStateStart.MCS state %s, events:%s";
                        this.c = aepgVar2;
                        this.d = 10;
                        objA2 = nejVar12.q.a(this);
                        if (objA2 == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar2 = aimwVarL3;
                        obj = objA2;
                        obj3 = aepgVar2;
                        aimwVar2.I((java.lang.String) obj6, obj3, new aepg((aenj) obj));
                        this.e.n.b(mce.cu);
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 1:
                aooc.af(obj);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                nmoVar = nmoVarB;
                switch (nmoVar.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 16:
                        aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1258, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVar);
                        defpackage.nej nejVar13 = this.e;
                        this.a = aimwVarL;
                        this.b = "NGCS.WrongStateStart.MCS state %s, events:%s";
                        this.c = aepgVar;
                        this.d = 13;
                        objA = nejVar13.q.a(this);
                        if (objA != aoluVar) {
                            return aoluVar;
                        }
                        aimwVar = aimwVarL;
                        obj = objA;
                        aimwVar.I((java.lang.String) obj6, aepgVar, new aepg((aenj) obj));
                        this.e.n.a(mcd.F);
                        return aojh.a;
                    case 1:
                        defpackage.nej nejVar14 = this.e;
                        nejVar14.n.b(mce.cu);
                        aimwVarL2 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1240, "DobbyLifecycleController.kt");
                        this.a = aimwVarL2;
                        obj2 = "NGCS.WrongStateStart.MCS state NOT_A_DOBBY_CALL(Feature:%s), events:%s";
                        this.b = "NGCS.WrongStateStart.MCS state NOT_A_DOBBY_CALL(Feature:%s), events:%s";
                        this.d = 11;
                        obj = nejVar14.Y.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        pcaVar = (pca) obj;
                        if (pcaVar == null) {
                            pcaVar = pca.a;
                        }
                        aepgVar3 = new aepg(pcaVar);
                        defpackage.nej nejVar15 = this.e;
                        this.a = aimwVarL2;
                        this.b = obj2;
                        this.c = aepgVar3;
                        this.d = 12;
                        obj = nejVar15.q.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar3 = aimwVarL2;
                        obj4 = obj2;
                        obj5 = aepgVar3;
                        aimwVar3.I((java.lang.String) obj4, obj5, new aepg((aenj) obj));
                        return aojh.a;
                    case 2:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1161, "DobbyLifecycleController.kt").v("Starting manual screening");
                        defpackage.nej nejVar16 = this.e;
                        this.d = 2;
                        obj = defpackage.nej.aa(nejVar16.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1163, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            return aojh.a;
                        }
                        nejVar2 = this.e;
                        gus.aw("CEVT_CMD_ENTER_AUDIOPROCESSING");
                        nejVar2.s.c();
                        nejVar2.V.m();
                        if (this.f) {
                            nmoVar3 = defpackage.nmo.MANUAL_SCREENING;
                            this.d = 5;
                            if (nejVar2.O(nmoVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (!((java.lang.Boolean) nejVar2.E.a()).booleanValue()) {
                                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1181, "DobbyLifecycleController.kt").v("Failed to start manual screening without UI because the feature is not enabled.");
                                return aojh.a;
                            }
                            this.d = 3;
                            if (nejVar2.y(this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1176, "DobbyLifecycleController.kt").v("Starting manual screening without UI");
                            nejVar3 = this.e;
                            nmoVar4 = defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI;
                            this.d = 4;
                            if (nejVar3.O(nmoVar4, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 3:
                    case 4:
                        defpackage.nej nejVar17 = this.e;
                        this.d = 6;
                        obj = defpackage.nej.aa(nejVar17.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1193, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            return aojh.a;
                        }
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1196, "DobbyLifecycleController.kt").v("Switching from automatic to manual screening");
                        nejVar4 = this.e;
                        nmoVar5 = defpackage.nmo.MANUAL_SCREENING;
                        this.d = 7;
                        if (nejVar4.O(nmoVar5, this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 5:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1200, "DobbyLifecycleController.kt").v("already started manual screening");
                        return aojh.a;
                    case 6:
                        if (this.f) {
                            nejVar = this.e;
                            nmoVar2 = defpackage.nmo.MANUAL_SCREENING;
                            this.d = 8;
                            if (nejVar.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1206, "DobbyLifecycleController.kt").v("already started manual screening without UI");
                        }
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1210, "DobbyLifecycleController.kt").v("start MCS on already answered call");
                        this.e.n.b(mce.cs);
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        defpackage.nej nejVar18 = this.e;
                        this.a = nmoVar;
                        this.d = 9;
                        obj = defpackage.nej.aa(nejVar18.Y, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1219, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                            this.e.n.b(mce.ct);
                            return aojh.a;
                        }
                        aimwVarL3 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1225, "DobbyLifecycleController.kt");
                        aepgVar2 = new aepg(nmoVar);
                        defpackage.nej nejVar19 = this.e;
                        this.a = aimwVarL3;
                        this.b = "NGCS.WrongStateStart.MCS state %s, events:%s";
                        this.c = aepgVar2;
                        this.d = 10;
                        objA2 = nejVar19.q.a(this);
                        if (objA2 == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar2 = aimwVarL3;
                        obj = objA2;
                        obj3 = aepgVar2;
                        aimwVar2.I((java.lang.String) obj6, obj3, new aepg((aenj) obj));
                        this.e.n.b(mce.cu);
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 2:
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1163, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                    return aojh.a;
                }
                nejVar2 = this.e;
                gus.aw("CEVT_CMD_ENTER_AUDIOPROCESSING");
                nejVar2.s.c();
                nejVar2.V.m();
                if (this.f) {
                    nmoVar3 = defpackage.nmo.MANUAL_SCREENING;
                    this.d = 5;
                    if (nejVar2.O(nmoVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (!((java.lang.Boolean) nejVar2.E.a()).booleanValue()) {
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1181, "DobbyLifecycleController.kt").v("Failed to start manual screening without UI because the feature is not enabled.");
                        return aojh.a;
                    }
                    this.d = 3;
                    if (nejVar2.y(this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1176, "DobbyLifecycleController.kt").v("Starting manual screening without UI");
                    nejVar3 = this.e;
                    nmoVar4 = defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI;
                    this.d = 4;
                    if (nejVar3.O(nmoVar4, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1176, "DobbyLifecycleController.kt").v("Starting manual screening without UI");
                nejVar3 = this.e;
                nmoVar4 = defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI;
                this.d = 4;
                if (nejVar3.O(nmoVar4, this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 4:
            case 5:
            case 7:
            case 8:
                aooc.af(obj);
                return aojh.a;
            case 6:
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1193, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                    return aojh.a;
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1196, "DobbyLifecycleController.kt").v("Switching from automatic to manual screening");
                nejVar4 = this.e;
                nmoVar5 = defpackage.nmo.MANUAL_SCREENING;
                this.d = 7;
                if (nejVar4.O(nmoVar5, this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 9:
                nmoVar = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1219, "DobbyLifecycleController.kt").v("Failed to start manual screening since arbiter rejects.");
                    this.e.n.b(mce.ct);
                    return aojh.a;
                }
                aimwVarL3 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningDeferred$<anonymous>", 1225, "DobbyLifecycleController.kt");
                aepgVar2 = new aepg(nmoVar);
                defpackage.nej nejVar110 = this.e;
                this.a = aimwVarL3;
                this.b = "NGCS.WrongStateStart.MCS state %s, events:%s";
                this.c = aepgVar2;
                this.d = 10;
                objA2 = nejVar110.q.a(this);
                if (objA2 == aoluVar) {
                    return aoluVar;
                }
                aimwVar2 = aimwVarL3;
                obj = objA2;
                obj3 = aepgVar2;
                aimwVar2.I((java.lang.String) obj6, obj3, new aepg((aenj) obj));
                this.e.n.b(mce.cu);
                return aojh.a;
            case 10:
                obj3 = this.c;
                obj6 = this.b;
                aimwVar2 = (aimw) this.a;
                aooc.af(obj);
                aimwVar2.I((java.lang.String) obj6, obj3, new aepg((aenj) obj));
                this.e.n.b(mce.cu);
                return aojh.a;
            case 11:
                java.lang.Object obj7 = this.b;
                aimw aimwVar4 = (aimw) this.a;
                aooc.af(obj);
                obj2 = obj7;
                aimwVarL2 = aimwVar4;
                pcaVar = (pca) obj;
                if (pcaVar == null) {
                    pcaVar = pca.a;
                }
                aepgVar3 = new aepg(pcaVar);
                defpackage.nej nejVar111 = this.e;
                this.a = aimwVarL2;
                this.b = obj2;
                this.c = aepgVar3;
                this.d = 12;
                obj = nejVar111.q.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                aimwVar3 = aimwVarL2;
                obj4 = obj2;
                obj5 = aepgVar3;
                aimwVar3.I((java.lang.String) obj4, obj5, new aepg((aenj) obj));
                return aojh.a;
            case 12:
                obj5 = this.c;
                obj4 = this.b;
                aimwVar3 = (aimw) this.a;
                aooc.af(obj);
                aimwVar3.I((java.lang.String) obj4, obj5, new aepg((aenj) obj));
                return aojh.a;
            default:
                aepgVar = this.c;
                obj6 = this.b;
                aimwVar = (aimw) this.a;
                aooc.af(obj);
                aimwVar.I((java.lang.String) obj6, aepgVar, new aepg((aenj) obj));
                this.e.n.a(mcd.F);
                return aojh.a;
        }
    }
}
