package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nec extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    int g;
    final /* synthetic */ defpackage.nej h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nec(defpackage.nej nejVar, aoln aolnVar) {
        super(1, aolnVar);
        this.h = nejVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.nec(this.h, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0158  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objA;
        defpackage.nmo nmoVarB;
        java.lang.Object objC;
        aenj[] aenjVarArr;
        java.lang.Object obj2;
        java.lang.Object objA2;
        java.lang.Object obj3;
        ajcq ajcqVarO;
        defpackage.nej nejVar;
        defpackage.nmo nmoVar;
        defpackage.nej nejVar2;
        aimw aimwVar;
        aolu aoluVar = aolu.a;
        int i = this.g;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
                objA = obj;
            } else if (i == 2) {
                nmoVarB = (defpackage.nmo) this.a;
                aooc.af(obj);
                defpackage.nej nejVar3 = this.h;
                nejVar3.o.a();
                zjs zjsVar = nejVar3.i;
                zrw zrwVar = zjsVar.j;
                ajcq ajcqVarF = aosv.F(zrwVar.d, 0, new zqs(zrwVar, (aoln) null, 9, (boolean[]) null), 3);
                ajcq ajcqVarF2 = aosv.F(zjsVar.c, 0, new xtn(zjsVar, (aoln) null, 12), 3);
                ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarF2}).o(new wwx(ajcqVarF, ajcqVarF2, zjsVar, 4, (char[]) null), zjsVar.f);
                this.a = nmoVarB;
                this.g = 3;
                if (aosv.D(ajcqVarO, this) == aoluVar) {
                    return aoluVar;
                }
                nejVar = this.h;
                nmoVar = defpackage.nmo.TAKING_MESSAGE;
                this.a = nmoVarB;
                this.g = 4;
                if (nejVar.O(nmoVar, this) == aoluVar) {
                    return aoluVar;
                }
                if (nmoVarB == defpackage.nmo.BAM) {
                    nejVar2 = this.h;
                    this.a = null;
                    this.g = 5;
                    if (nejVar2.l(this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i == 3) {
                nmoVarB = (defpackage.nmo) this.a;
                aooc.af(obj);
                nejVar = this.h;
                nmoVar = defpackage.nmo.TAKING_MESSAGE;
                this.a = nmoVarB;
                this.g = 4;
                if (nejVar.O(nmoVar, this) == aoluVar) {
                    return aoluVar;
                }
                if (nmoVarB == defpackage.nmo.BAM) {
                    nejVar2 = this.h;
                    this.a = null;
                    this.g = 5;
                    if (nejVar2.l(this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i == 4) {
                nmoVarB = (defpackage.nmo) this.a;
                aooc.af(obj);
                if (nmoVarB == defpackage.nmo.BAM) {
                    nejVar2 = this.h;
                    this.a = null;
                    this.g = 5;
                    if (nejVar2.l(this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i != 5) {
                i2 = this.f;
                obj3 = this.e;
                objC = this.d;
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.b;
                aenj[] aenjVarArr2 = (aenj[]) this.a;
                aooc.af(obj);
                obj2 = obj4;
                aenjVarArr = aenjVarArr2;
                objA2 = obj;
                aimwVar = obj5;
                ((aenj[]) obj3)[i2] = (aenj) objA2;
                aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) objC, aenjVarArr)));
            } else {
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.nej nejVar4 = this.h;
        this.g = 1;
        objA = nejVar4.Z.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        int iOrdinal = nmoVarB.ordinal();
        if (iOrdinal != 14 && iOrdinal != 15) {
            switch (iOrdinal) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startTakingMessageFromCallerDeferred$<anonymous>", 1759, "DobbyLifecycleController.kt").v("Starting to take a message from the caller");
                    defpackage.nej nejVar5 = this.h;
                    nejVar5.n.b(mce.cW);
                    this.a = nmoVarB;
                    this.g = 2;
                    if (nejVar5.y.n(this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar6 = this.h;
                    nejVar6.o.a();
                    zjs zjsVar2 = nejVar6.i;
                    zrw zrwVar2 = zjsVar2.j;
                    ajcq ajcqVarF3 = aosv.F(zrwVar2.d, 0, new zqs(zrwVar2, (aoln) null, 9, (boolean[]) null), 3);
                    ajcq ajcqVarF4 = aosv.F(zjsVar2.c, 0, new xtn(zjsVar2, (aoln) null, 12), 3);
                    ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarF3, ajcqVarF4}).o(new wwx(ajcqVarF3, ajcqVarF4, zjsVar2, 4, (char[]) null), zjsVar2.f);
                    this.a = nmoVarB;
                    this.g = 3;
                    if (aosv.D(ajcqVarO, this) == aoluVar) {
                        return aoluVar;
                    }
                    nejVar = this.h;
                    nmoVar = defpackage.nmo.TAKING_MESSAGE;
                    this.a = nmoVarB;
                    this.g = 4;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    if (nmoVarB == defpackage.nmo.BAM) {
                        nejVar2 = this.h;
                        this.a = null;
                        this.g = 5;
                        if (nejVar2.l(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    break;
                default:
                    aimw aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startTakingMessageFromCallerDeferred$<anonymous>", 1780, "DobbyLifecycleController.kt");
                    objC = aenj.c((java.lang.String) null, nmoVarB);
                    aenjVarArr = new aenj[2];
                    aenjVarArr[0] = new aenj(", events:");
                    defpackage.nej nejVar7 = this.h;
                    this.a = aenjVarArr;
                    this.b = aimwVarL;
                    obj2 = "Can't take message in state %s";
                    this.c = "Can't take message in state %s";
                    this.d = objC;
                    this.e = aenjVarArr;
                    this.f = 1;
                    this.g = 6;
                    objA2 = nejVar7.q.a(this);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    obj3 = aenjVarArr;
                    aimwVar = aimwVarL;
                    ((aenj[]) obj3)[i2] = (aenj) objA2;
                    aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) objC, aenjVarArr)));
                    break;
                    break;
            }
        } else {
            this.h.n.b(mce.gY);
            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startTakingMessageFromCallerDeferred$<anonymous>", 1775, "DobbyLifecycleController.kt").v("Beesly is starting to take a message");
        }
        return aojh.a;
    }
}
