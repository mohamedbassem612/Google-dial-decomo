package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ndl extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    int g;
    final /* synthetic */ defpackage.nej h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndl(defpackage.nej nejVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.h = nejVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.ndl(this.h, (aoln) obj, 1, null).b(aojh.a);
        }
        return new defpackage.ndl(this.h, (aoln) obj, 0).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aimw aimwVar;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        aimw aimwVar2;
        defpackage.nej nejVar;
        defpackage.nmo nmoVar;
        int i = 1;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(obj);
                } else if (i2 != 2) {
                    i = this.f;
                    obj4 = this.e;
                    obj3 = this.d;
                    obj2 = this.c;
                    java.lang.Object obj10 = this.b;
                    obj5 = this.a;
                    aooc.af(obj);
                    aimwVar = obj10;
                    ((aenj[]) obj4)[i] = (aenj) obj;
                    java.lang.String str = (java.lang.String) obj2;
                    aimwVar.y(str, new aepg(aenj.b((aenj) obj3, (aenj[]) obj5)));
                } else {
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.nej nejVar2 = this.h;
            this.g = 1;
            obj = nejVar2.Z.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
            if (nmoVarB == null) {
                nmoVarB = defpackage.nmo.UNRECOGNIZED;
            }
            if (nmoVarB.ordinal() != 14) {
                aimw aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyWithUiDeferred$<anonymous>", 1354, "DobbyLifecycleController.kt");
                aenj aenjVarC = aenj.c((java.lang.String) null, nmoVarB);
                aenj[] aenjVarArr = new aenj[2];
                aenjVarArr[0] = new aenj(", events:");
                defpackage.nej nejVar3 = this.h;
                this.a = aenjVarArr;
                this.b = aimwVarL;
                obj2 = "Can't start Beesly with UI in state %s";
                this.c = "Can't start Beesly with UI in state %s";
                this.d = aenjVarC;
                this.e = aenjVarArr;
                this.f = 1;
                this.g = 3;
                java.lang.Object objA = nejVar3.q.a(this);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                obj3 = aenjVarC;
                obj4 = aenjVarArr;
                obj = objA;
                obj5 = obj4;
                aimwVar = aimwVarL;
                ((aenj[]) obj4)[i] = (aenj) obj;
                java.lang.String str2 = (java.lang.String) obj2;
                aimwVar.y(str2, new aepg(aenj.b((aenj) obj3, (aenj[]) obj5)));
            } else {
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyWithUiDeferred$<anonymous>", 1348, "DobbyLifecycleController.kt").v("starting Beesly with UI");
                defpackage.nej nejVar4 = this.h;
                defpackage.nmo nmoVar2 = defpackage.nmo.BEESLY_WITH_UI;
                this.g = 2;
                if (nejVar4.O(nmoVar2, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i3 = this.g;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(obj);
            } else if (i3 == 2) {
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBamDeferred$<anonymous>", 1382, "DobbyLifecycleController.kt").v("Failed to start BAM since arbiter rejects.");
                    return aojh.a;
                }
                nejVar = this.h;
                gus.aw("CEVT_CMD_ENTER_AUDIOPROCESSING");
                nejVar.s.c();
                nejVar.V.m();
                nmoVar = defpackage.nmo.BAM;
                this.g = 3;
                if (nejVar.O(nmoVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            } else if (i3 != 3) {
                i = this.f;
                obj8 = this.e;
                obj7 = this.d;
                obj6 = this.c;
                java.lang.Object obj11 = this.b;
                obj9 = this.a;
                aooc.af(obj);
                aimwVar2 = obj11;
                ((aenj[]) obj8)[i] = (aenj) obj;
                java.lang.String str3 = (java.lang.String) obj6;
                aimwVar2.y(str3, new aepg(aenj.b((aenj) obj7, (aenj[]) obj9)));
            } else {
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.nej nejVar5 = this.h;
        this.g = 1;
        obj = nejVar5.Z.a(this);
        if (obj == aoluVar2) {
            return aoluVar2;
        }
        defpackage.nmo nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
        if (nmoVarB2 == null) {
            nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
        }
        if (nmoVarB2.ordinal() == 2) {
            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBamDeferred$<anonymous>", 1380, "DobbyLifecycleController.kt").v("starting BAM");
            defpackage.nej nejVar6 = this.h;
            this.g = 2;
            obj = defpackage.nej.aa(nejVar6.Y, this);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBamDeferred$<anonymous>", 1382, "DobbyLifecycleController.kt").v("Failed to start BAM since arbiter rejects.");
                return aojh.a;
            }
            nejVar = this.h;
            gus.aw("CEVT_CMD_ENTER_AUDIOPROCESSING");
            nejVar.s.c();
            nejVar.V.m();
            nmoVar = defpackage.nmo.BAM;
            this.g = 3;
            if (nejVar.O(nmoVar, this) == aoluVar2) {
                return aoluVar2;
            }
            return aojh.a;
        }
        aimw aimwVarL2 = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBamDeferred$<anonymous>", 1398, "DobbyLifecycleController.kt");
        aenj aenjVarC2 = aenj.c((java.lang.String) null, nmoVarB2);
        aenj[] aenjVarArr2 = new aenj[2];
        aenjVarArr2[0] = new aenj(", events:");
        defpackage.nej nejVar7 = this.h;
        this.a = aenjVarArr2;
        this.b = aimwVarL2;
        obj6 = "Can't start BAM in state %s";
        this.c = "Can't start BAM in state %s";
        this.d = aenjVarC2;
        this.e = aenjVarArr2;
        this.f = 1;
        this.g = 4;
        java.lang.Object objA2 = nejVar7.q.a(this);
        if (objA2 == aoluVar2) {
            return aoluVar2;
        }
        obj7 = aenjVarC2;
        obj8 = aenjVarArr2;
        obj = objA2;
        obj9 = obj8;
        aimwVar2 = aimwVarL2;
        ((aenj[]) obj8)[i] = (aenj) obj;
        java.lang.String str4 = (java.lang.String) obj6;
        aimwVar2.y(str4, new aepg(aenj.b((aenj) obj7, (aenj[]) obj9)));
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndl(defpackage.nej nejVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.h = nejVar;
    }
}
