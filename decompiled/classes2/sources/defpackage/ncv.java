package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ncv extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.nej e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncv(defpackage.nej nejVar, aoln aolnVar) {
        super(1, aolnVar);
        this.e = nejVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ncv(this.e, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:59:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.nej nejVar;
        defpackage.nmo nmoVar;
        defpackage.nej nejVar2;
        defpackage.nmo nmoVarB;
        java.lang.Object aepgVar;
        java.lang.Object obj2;
        defpackage.nej nejVar3;
        defpackage.nej nejVar4;
        boolean zBooleanValue;
        defpackage.nej nejVar5;
        boolean zBooleanValue2;
        defpackage.nej nejVar6;
        boolean zBooleanValue3;
        defpackage.nej nejVar7;
        boolean zBooleanValue4;
        defpackage.nej nejVar8;
        defpackage.nvp nvpVar;
        aimw aimwVar;
        aolu aoluVar = aolu.a;
        switch (this.d) {
            case 0:
                aooc.af(obj);
                defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 446, "DobbyLifecycleController.kt").v("onAudioProcessingStarted");
                defpackage.nej nejVar9 = this.e;
                gus.aw("CEVT_CALL_AUDIO_PROCESSING_STARTED");
                nejVar9.s.c();
                this.d = 1;
                obj = defpackage.nej.Z(nejVar9.Y, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 454, "DobbyLifecycleController.kt").v("onAudioProcessingStarted: skip since Dobby is not triggered.");
                    nejVar = this.e;
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.d = 2;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar10 = this.e;
                    this.d = 3;
                    obj = nejVar10.Y(nejVar10.Y, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 459, "DobbyLifecycleController.kt").v("No active feature is triggered but call is in AUDIO_PROCESSING, ringing to user.");
                        nejVar2 = this.e;
                        this.d = 4;
                        if (nejVar2.I(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                defpackage.nej nejVar11 = this.e;
                this.d = 5;
                obj = nejVar11.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                switch (nmoVarB.ordinal()) {
                    case 0:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    case 16:
                        aimw aimwVarL = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 521, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVarB);
                        defpackage.nej nejVar12 = this.e;
                        this.a = aimwVarL;
                        obj2 = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.b = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.c = aepgVar;
                        this.d = 17;
                        obj = nejVar12.q.a(this);
                        aimwVar = aimwVarL;
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar.I((java.lang.String) obj2, aepgVar, new aepg((aenj) obj));
                        return aojh.a;
                    case 1:
                        nejVar3 = this.e;
                        this.d = 16;
                        if (nejVar3.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 2:
                        nejVar4 = this.e;
                        this.d = 6;
                        if (nejVar4.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 3:
                        defpackage.nej nejVar13 = this.e;
                        defpackage.nje njeVar = defpackage.nje.b;
                        this.d = 7;
                        obj = nejVar13.K(njeVar, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        nejVar5 = this.e;
                        if (zBooleanValue) {
                            nejVar5.M = defpackage.nje.b;
                        } else {
                            this.d = 8;
                            if (nejVar5.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 5:
                    case 6:
                        defpackage.nej nejVar14 = this.e;
                        this.d = 9;
                        obj = nejVar14.q(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar6 = this.e;
                        if (zBooleanValue2) {
                            this.d = 10;
                            if (nejVar6.C(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            this.d = 11;
                            if (nejVar6.F(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 7:
                        defpackage.nej nejVar15 = this.e;
                        defpackage.nje njeVar2 = defpackage.nje.c;
                        this.d = 12;
                        obj = nejVar15.K(njeVar2, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar7 = this.e;
                        if (zBooleanValue3) {
                            nejVar7.M = defpackage.nje.c;
                        } else {
                            this.d = 13;
                            if (nejVar7.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        defpackage.nej nejVar16 = this.e;
                        defpackage.nje njeVar3 = defpackage.nje.d;
                        this.d = 14;
                        obj = nejVar16.K(njeVar3, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar8 = this.e;
                        if (zBooleanValue4) {
                            nejVar8.M = defpackage.nje.d;
                        } else {
                            nvpVar = defpackage.nvp.EVENT_BEESLY_FAIL_TO_START_SESSION;
                            this.d = 15;
                            if (nejVar8.j.x(nvpVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej nejVar17 = this.e;
                            nejVar17.n.a(mcd.aP);
                            nejVar17.V();
                        }
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 1:
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 454, "DobbyLifecycleController.kt").v("onAudioProcessingStarted: skip since Dobby is not triggered.");
                    nejVar = this.e;
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.d = 2;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar18 = this.e;
                    this.d = 3;
                    obj = nejVar18.Y(nejVar18.Y, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 459, "DobbyLifecycleController.kt").v("No active feature is triggered but call is in AUDIO_PROCESSING, ringing to user.");
                        nejVar2 = this.e;
                        this.d = 4;
                        if (nejVar2.I(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                defpackage.nej nejVar19 = this.e;
                this.d = 5;
                obj = nejVar19.Z.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                switch (nmoVarB.ordinal()) {
                    case 0:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    case 16:
                        aimw aimwVarL2 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 521, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVarB);
                        defpackage.nej nejVar110 = this.e;
                        this.a = aimwVarL2;
                        obj2 = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.b = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.c = aepgVar;
                        this.d = 17;
                        obj = nejVar110.q.a(this);
                        aimwVar = aimwVarL2;
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar.I((java.lang.String) obj2, aepgVar, new aepg((aenj) obj));
                        return aojh.a;
                    case 1:
                        nejVar3 = this.e;
                        this.d = 16;
                        if (nejVar3.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 2:
                        nejVar4 = this.e;
                        this.d = 6;
                        if (nejVar4.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 3:
                        defpackage.nej nejVar111 = this.e;
                        defpackage.nje njeVar4 = defpackage.nje.b;
                        this.d = 7;
                        obj = nejVar111.K(njeVar4, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        nejVar5 = this.e;
                        if (zBooleanValue) {
                            this.d = 8;
                            if (nejVar5.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVar5.M = defpackage.nje.b;
                        }
                        return aojh.a;
                    case 5:
                    case 6:
                        defpackage.nej nejVar112 = this.e;
                        this.d = 9;
                        obj = nejVar112.q(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar6 = this.e;
                        if (zBooleanValue2) {
                            this.d = 10;
                            if (nejVar6.C(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            this.d = 11;
                            if (nejVar6.F(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 7:
                        defpackage.nej nejVar113 = this.e;
                        defpackage.nje njeVar5 = defpackage.nje.c;
                        this.d = 12;
                        obj = nejVar113.K(njeVar5, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar7 = this.e;
                        if (zBooleanValue3) {
                            this.d = 13;
                            if (nejVar7.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVar7.M = defpackage.nje.c;
                        }
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        defpackage.nej nejVar114 = this.e;
                        defpackage.nje njeVar6 = defpackage.nje.d;
                        this.d = 14;
                        obj = nejVar114.K(njeVar6, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar8 = this.e;
                        if (zBooleanValue4) {
                            nvpVar = defpackage.nvp.EVENT_BEESLY_FAIL_TO_START_SESSION;
                            this.d = 15;
                            if (nejVar8.j.x(nvpVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej nejVar115 = this.e;
                            nejVar115.n.a(mcd.aP);
                            nejVar115.V();
                        } else {
                            nejVar8.M = defpackage.nje.d;
                        }
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 2:
                aooc.af(obj);
                defpackage.nej nejVar116 = this.e;
                this.d = 3;
                obj = nejVar116.Y(nejVar116.Y, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 459, "DobbyLifecycleController.kt").v("No active feature is triggered but call is in AUDIO_PROCESSING, ringing to user.");
                    nejVar2 = this.e;
                    this.d = 4;
                    if (nejVar2.I(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 459, "DobbyLifecycleController.kt").v("No active feature is triggered but call is in AUDIO_PROCESSING, ringing to user.");
                    nejVar2 = this.e;
                    this.d = 4;
                    if (nejVar2.I(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case 16:
                aooc.af(obj);
                return aojh.a;
            case 5:
                aooc.af(obj);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                switch (nmoVarB.ordinal()) {
                    case 0:
                    case 4:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    case 16:
                        aimw aimwVarL3 = defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onAudioProcessingStartedDeferred$<anonymous>", 521, "DobbyLifecycleController.kt");
                        aepgVar = new aepg(nmoVarB);
                        defpackage.nej nejVar117 = this.e;
                        this.a = aimwVarL3;
                        obj2 = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.b = "onAudioProcessingStarted in unexpected state: %s, events: %s";
                        this.c = aepgVar;
                        this.d = 17;
                        obj = nejVar117.q.a(this);
                        aimwVar = aimwVarL3;
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        aimwVar.I((java.lang.String) obj2, aepgVar, new aepg((aenj) obj));
                        return aojh.a;
                    case 1:
                        nejVar3 = this.e;
                        this.d = 16;
                        if (nejVar3.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 2:
                        nejVar4 = this.e;
                        this.d = 6;
                        if (nejVar4.I(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case 3:
                        defpackage.nej nejVar118 = this.e;
                        defpackage.nje njeVar7 = defpackage.nje.b;
                        this.d = 7;
                        obj = nejVar118.K(njeVar7, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        nejVar5 = this.e;
                        if (zBooleanValue) {
                            this.d = 8;
                            if (nejVar5.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVar5.M = defpackage.nje.b;
                        }
                        return aojh.a;
                    case 5:
                    case 6:
                        defpackage.nej nejVar119 = this.e;
                        this.d = 9;
                        obj = nejVar119.q(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar6 = this.e;
                        if (zBooleanValue2) {
                            this.d = 10;
                            if (nejVar6.C(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            this.d = 11;
                            if (nejVar6.F(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    case 7:
                        defpackage.nej nejVar1110 = this.e;
                        defpackage.nje njeVar8 = defpackage.nje.c;
                        this.d = 12;
                        obj = nejVar1110.K(njeVar8, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar7 = this.e;
                        if (zBooleanValue3) {
                            this.d = 13;
                            if (nejVar7.J(this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVar7.M = defpackage.nje.c;
                        }
                        return aojh.a;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        defpackage.nej nejVar1111 = this.e;
                        defpackage.nje njeVar9 = defpackage.nje.d;
                        this.d = 14;
                        obj = nejVar1111.K(njeVar9, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                        nejVar8 = this.e;
                        if (zBooleanValue4) {
                            nvpVar = defpackage.nvp.EVENT_BEESLY_FAIL_TO_START_SESSION;
                            this.d = 15;
                            if (nejVar8.j.x(nvpVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.nej nejVar1112 = this.e;
                            nejVar1112.n.a(mcd.aP);
                            nejVar1112.V();
                        } else {
                            nejVar8.M = defpackage.nje.d;
                        }
                        return aojh.a;
                    default:
                        throw new aois();
                }
            case 7:
                aooc.af(obj);
                zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                nejVar5 = this.e;
                if (zBooleanValue) {
                    this.d = 8;
                    if (nejVar5.J(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar5.M = defpackage.nje.b;
                }
                return aojh.a;
            case 9:
                aooc.af(obj);
                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                nejVar6 = this.e;
                if (zBooleanValue2) {
                    this.d = 10;
                    if (nejVar6.C(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    this.d = 11;
                    if (nejVar6.F(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 12:
                aooc.af(obj);
                zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                nejVar7 = this.e;
                if (zBooleanValue3) {
                    this.d = 13;
                    if (nejVar7.J(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar7.M = defpackage.nje.c;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                nejVar8 = this.e;
                if (zBooleanValue4) {
                    nvpVar = defpackage.nvp.EVENT_BEESLY_FAIL_TO_START_SESSION;
                    this.d = 15;
                    if (nejVar8.j.x(nvpVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar1113 = this.e;
                    nejVar1113.n.a(mcd.aP);
                    nejVar1113.V();
                } else {
                    nejVar8.M = defpackage.nje.d;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                defpackage.nej nejVar1114 = this.e;
                nejVar1114.n.a(mcd.aP);
                nejVar1114.V();
                return aojh.a;
            default:
                aepgVar = this.c;
                obj2 = this.b;
                java.lang.Object obj3 = this.a;
                aooc.af(obj);
                aimwVar = obj3;
                aimwVar.I((java.lang.String) obj2, aepgVar, new aepg((aenj) obj));
                return aojh.a;
        }
    }
}
