package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nbt extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.nbv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbt(defpackage.nbv nbvVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = nbvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.nbt(this.b, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nbv nbvVar;
        defpackage.nej nejVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        switch (i) {
            case 0:
                defpackage.nbv.a.b().l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController", "joinCallButtonClicked$<anonymous>", 107, "DobbyInCallScreenButtonsController.kt").v("join call button was clicked");
                defpackage.nbv nbvVar2 = this.b;
                defpackage.nvp nvpVar = defpackage.nvp.EVENT_USER_MANUAL_SCREENING_ANSWER_CALL_BUTTON_CLICKED;
                this.a = 1;
                if (nbvVar2.i.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
            case 1:
                defpackage.nbv nbvVar3 = this.b;
                if (nbvVar3.q.r()) {
                    defpackage.nbv.a.d().l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController", "joinCallButtonClicked$<anonymous>", 111, "DobbyInCallScreenButtonsController.kt").v("Cancel JoinCall from stale UI");
                    nbvVar3.j.b(mce.cr);
                    return aojh.a;
                }
                if (((java.lang.Boolean) nbvVar3.m.a()).booleanValue() || ((java.lang.Boolean) nbvVar3.n.a()).booleanValue()) {
                    pci pciVar = nbvVar3.s;
                    zie zieVar = zie.b;
                    this.a = 2;
                    if (pciVar.e(zieVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            case 2:
                defpackage.nbv nbvVar4 = this.b;
                this.a = 3;
                if (nbvVar4.b(this) == aoluVar) {
                    return aoluVar;
                }
            case 3:
                defpackage.nbv nbvVar5 = this.b;
                this.a = 4;
                obj = nbvVar5.v.d(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            case 4:
                defpackage.nbv nbvVar6 = this.b;
                if (obj != null) {
                    nbvVar6.k.r();
                    return aojh.a;
                }
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                defpackage.nwj nwjVarK = mni.K(defpackage.nmj.a.m());
                nwjVarK.u();
                npwVarAB.M(nwjVarK.t());
                defpackage.nmk nmkVarD = npwVarAB.D();
                this.a = 5;
                if (nbvVar6.t.b(nmkVarD, this) == aoluVar) {
                    return aoluVar;
                }
            case 5:
                defpackage.nbv nbvVar7 = this.b;
                this.a = 6;
                obj = nbvVar7.t.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            case 6:
                if (((defpackage.nmu) obj).r) {
                    defpackage.nbv nbvVar8 = this.b;
                    this.a = 7;
                    obj = nbvVar8.t.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nbvVar = this.b;
                    if (((java.lang.Boolean) nbvVar.l.a()).booleanValue()) {
                        aoov.an(nbvVar.d, (aolr) null, 0, new defpackage.muz(nbvVar, (aoln) null, 16), 3);
                    } else {
                        nejVar = nbvVar.f;
                        this.a = 9;
                        if (nejVar.a(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 7:
                defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.BEESLY_WITH_UI) {
                    defpackage.nbv nbvVar9 = this.b;
                    this.a = 8;
                    obj = nbvVar9.t.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nbvVar = this.b;
                    if (((java.lang.Boolean) nbvVar.l.a()).booleanValue()) {
                        aoov.an(nbvVar.d, (aolr) null, 0, new defpackage.muz(nbvVar, (aoln) null, 16), 3);
                    } else {
                        nejVar = nbvVar.f;
                        this.a = 9;
                        if (nejVar.a(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 8:
                defpackage.nmo nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB2 == null) {
                    nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB2 != defpackage.nmo.BEESLY) {
                    ajyi ajyiVarI = ahus.I(alro.a.m());
                    apdi apdiVar = alsc.b;
                    aooh.e(apdiVar, "manualAnswerCallEvent");
                    ajyiVarI.be(apdiVar, ahus.D(alsc.a.m()).am());
                    alro alroVarBa = ajyiVarI.ba();
                    defpackage.nbv nbvVar10 = this.b;
                    this.a = 10;
                    obj = nbvVar10.e.a(alroVarBa, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nbvVar = this.b;
                    if (((java.lang.Boolean) nbvVar.l.a()).booleanValue()) {
                        aoov.an(nbvVar.d, (aolr) null, 0, new defpackage.muz(nbvVar, (aoln) null, 16), 3);
                    } else {
                        nejVar = nbvVar.f;
                        this.a = 9;
                        if (nejVar.a(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            default:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nbv.a.d().l("com/android/dialer/dobby/impl/service/DobbyInCallScreenButtonsController", "joinCallButtonClicked$<anonymous>", 156, "DobbyInCallScreenButtonsController.kt").v("InCallScreenButtons.RelayAnswerCallFailed");
                    break;
                }
            case 9:
                return aojh.a;
        }
    }
}
