package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ncg extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    int g;
    final /* synthetic */ defpackage.nej h;
    final /* synthetic */ alta i;
    final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncg(defpackage.nej nejVar, alta altaVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.h = nejVar;
        this.i = altaVar;
        this.j = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ncg(this.h, this.i, this.j, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:38:0x012b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0153  */
    /* JADX WARN: Code duplicated, block: B:45:0x017d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0183  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0203  */
    /* JADX WARN: Code duplicated, block: B:66:0x0211  */
    /* JADX WARN: Code duplicated, block: B:71:0x0236  */
    /* JADX WARN: Code duplicated, block: B:76:0x0266  */
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
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nmo nmoVarB;
        defpackage.nej nejVar;
        defpackage.nej nejVar2;
        defpackage.nmo nmoVar;
        defpackage.nej nejVar3;
        defpackage.nej nejVar4;
        boolean z;
        defpackage.nej nejVar5;
        aimw aimwVarL;
        aenj aenjVarC;
        aenj[] aenjVarArr;
        java.lang.Object obj2;
        java.lang.Object objA;
        java.lang.Object obj3;
        aenj[] aenjVarArr2;
        defpackage.nej nejVar6;
        alta altaVar;
        boolean z2;
        defpackage.nej nejVar7;
        alta altaVar2;
        boolean z3;
        alsz alszVarB;
        defpackage.nej nejVar8;
        alsp alspVar;
        defpackage.nej nejVar9;
        alta altaVar3;
        boolean z4;
        defpackage.nej nejVar10;
        defpackage.nej nejVar11;
        defpackage.nmo nmoVar2;
        defpackage.nej nejVar12;
        alta altaVar4;
        defpackage.nmo nmoVar3;
        java.lang.Object obj4;
        aimw aimwVar;
        aolu aoluVar = aolu.a;
        int i = 1;
        try {
            switch (this.g) {
                case 0:
                    aooc.af(obj);
                    defpackage.nej nejVar13 = this.h;
                    defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_REQUEST_DECLINE;
                    this.g = 1;
                    if (nejVar13.q.x(nvpVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar14 = this.h;
                    this.g = 2;
                    obj = nejVar14.Z.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    switch (nmoVarB.ordinal()) {
                        case 2:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1994, "DobbyLifecycleController.kt").v("Declining call before screening");
                            this.h.V();
                            return aojh.a;
                        case 3:
                        case 6:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1949, "DobbyLifecycleController.kt").v("Declining Dobby call in the background");
                            nejVar = this.h;
                            this.g = 5;
                            if (nejVar.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar7 = this.h;
                            altaVar2 = this.i;
                            z3 = this.j;
                            this.g = 6;
                            if (nejVar7.f(altaVar2, z3, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 4:
                        case 5:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1970, "DobbyLifecycleController.kt").v("Declining call in the foreground");
                            nejVar2 = this.h;
                            this.a = nmoVarB;
                            this.g = 10;
                            if (nejVar2.d(this) == aoluVar) {
                                return aoluVar;
                            }
                            nmoVar = nmoVarB;
                            nejVar10 = this.h;
                            this.a = nmoVar;
                            this.g = 11;
                            if (nejVar10.k(false, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar11 = this.h;
                            nmoVar2 = defpackage.nmo.FOREGROUND_DECLINING;
                            this.a = nmoVar;
                            this.g = 12;
                            if (nejVar11.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar12 = this.h;
                            nejVar12.n.b(mce.bT);
                            altaVar4 = this.i;
                            this.a = nmoVar;
                            this.g = 13;
                            if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                                return aoluVar;
                            }
                            nmoVar3 = nmoVar;
                            this = this.h;
                            this.n.b(mce.cd);
                            if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                                this.K = false;
                            }
                            this.V();
                            return aojh.a;
                        case 7:
                        case 8:
                        case 10:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1956, "DobbyLifecycleController.kt").v("Declining call in the background");
                            nejVar3 = this.h;
                            this.g = 7;
                            if (nejVar3.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            alszVarB = alsz.b(this.i.f);
                            if (alszVarB == null) {
                                alszVarB = alsz.a;
                            }
                            if (alszVarB == alsz.b) {
                                nejVar8 = this.h;
                                alspVar = alsp.c;
                                this.g = 8;
                                if (nejVar8.w(alspVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                            nejVar9 = this.h;
                            nejVar9.o.a();
                            nejVar9.i.v();
                            altaVar3 = this.i;
                            z4 = this.j;
                            this.g = 9;
                            if (nejVar9.f(altaVar3, z4, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 9:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1998, "DobbyLifecycleController.kt").v("Declining call during not active session");
                            nejVar4 = this.h;
                            z = this.j;
                            this.g = 14;
                            if (nejVar4.k(z, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.V();
                            return aojh.a;
                        case 11:
                        case 12:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2004, "DobbyLifecycleController.kt").v("Ignoring declining call in FOREGROUND/BACKGROUND_DECLINING state");
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        default:
                            aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2009, "DobbyLifecycleController.kt");
                            aenjVarC = aenj.c((java.lang.String) null, nmoVarB);
                            aenjVarArr = new aenj[2];
                            aenjVarArr[0] = new aenj(", events:");
                            defpackage.nej nejVar15 = this.h;
                            this.a = aenjVarArr;
                            this.b = aimwVarL;
                            obj2 = "Can't decline call in state %s";
                            this.c = "Can't decline call in state %s";
                            this.d = aenjVarC;
                            this.e = aenjVarArr;
                            this.f = 1;
                            this.g = 15;
                            objA = nejVar15.q.a(this);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            obj3 = aenjVarC;
                            obj = objA;
                            aenjVarArr2 = aenjVarArr;
                            aimwVar = aimwVarL;
                            obj4 = aenjVarArr;
                            ((aenj[]) obj4)[i] = (aenj) obj;
                            aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) obj3, aenjVarArr2)));
                            this.h.n.a(mcd.O);
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1940, "DobbyLifecycleController.kt").v("Declining Beesly call in the background");
                            nejVar5 = this.h;
                            this.g = 3;
                            if (nejVar5.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar6 = this.h;
                            altaVar = this.i;
                            z2 = this.j;
                            this.g = 4;
                            if (nejVar6.f(altaVar, z2, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.K = true;
                            return aojh.a;
                    }
                case 1:
                    aooc.af(obj);
                    defpackage.nej nejVar16 = this.h;
                    this.g = 2;
                    obj = nejVar16.Z.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    switch (nmoVarB.ordinal()) {
                        case 2:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1994, "DobbyLifecycleController.kt").v("Declining call before screening");
                            this.h.V();
                            return aojh.a;
                        case 3:
                        case 6:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1949, "DobbyLifecycleController.kt").v("Declining Dobby call in the background");
                            nejVar = this.h;
                            this.g = 5;
                            if (nejVar.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar7 = this.h;
                            altaVar2 = this.i;
                            z3 = this.j;
                            this.g = 6;
                            if (nejVar7.f(altaVar2, z3, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 4:
                        case 5:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1970, "DobbyLifecycleController.kt").v("Declining call in the foreground");
                            nejVar2 = this.h;
                            this.a = nmoVarB;
                            this.g = 10;
                            if (nejVar2.d(this) == aoluVar) {
                                return aoluVar;
                            }
                            nmoVar = nmoVarB;
                            nejVar10 = this.h;
                            this.a = nmoVar;
                            this.g = 11;
                            if (nejVar10.k(false, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar11 = this.h;
                            nmoVar2 = defpackage.nmo.FOREGROUND_DECLINING;
                            this.a = nmoVar;
                            this.g = 12;
                            if (nejVar11.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar12 = this.h;
                            nejVar12.n.b(mce.bT);
                            altaVar4 = this.i;
                            this.a = nmoVar;
                            this.g = 13;
                            if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                                return aoluVar;
                            }
                            nmoVar3 = nmoVar;
                            this = this.h;
                            this.n.b(mce.cd);
                            if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                                this.K = false;
                            }
                            this.V();
                            return aojh.a;
                        case 7:
                        case 8:
                        case 10:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1956, "DobbyLifecycleController.kt").v("Declining call in the background");
                            nejVar3 = this.h;
                            this.g = 7;
                            if (nejVar3.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            alszVarB = alsz.b(this.i.f);
                            if (alszVarB == null) {
                                alszVarB = alsz.a;
                            }
                            if (alszVarB == alsz.b) {
                                nejVar8 = this.h;
                                alspVar = alsp.c;
                                this.g = 8;
                                if (nejVar8.w(alspVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                            nejVar9 = this.h;
                            nejVar9.o.a();
                            nejVar9.i.v();
                            altaVar3 = this.i;
                            z4 = this.j;
                            this.g = 9;
                            if (nejVar9.f(altaVar3, z4, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 9:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1998, "DobbyLifecycleController.kt").v("Declining call during not active session");
                            nejVar4 = this.h;
                            z = this.j;
                            this.g = 14;
                            if (nejVar4.k(z, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.V();
                            return aojh.a;
                        case 11:
                        case 12:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2004, "DobbyLifecycleController.kt").v("Ignoring declining call in FOREGROUND/BACKGROUND_DECLINING state");
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        default:
                            aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2009, "DobbyLifecycleController.kt");
                            aenjVarC = aenj.c((java.lang.String) null, nmoVarB);
                            aenjVarArr = new aenj[2];
                            aenjVarArr[0] = new aenj(", events:");
                            defpackage.nej nejVar17 = this.h;
                            this.a = aenjVarArr;
                            this.b = aimwVarL;
                            obj2 = "Can't decline call in state %s";
                            this.c = "Can't decline call in state %s";
                            this.d = aenjVarC;
                            this.e = aenjVarArr;
                            this.f = 1;
                            this.g = 15;
                            objA = nejVar17.q.a(this);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            obj3 = aenjVarC;
                            obj = objA;
                            aenjVarArr2 = aenjVarArr;
                            aimwVar = aimwVarL;
                            obj4 = aenjVarArr;
                            ((aenj[]) obj4)[i] = (aenj) obj;
                            aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) obj3, aenjVarArr2)));
                            this.h.n.a(mcd.O);
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1940, "DobbyLifecycleController.kt").v("Declining Beesly call in the background");
                            nejVar5 = this.h;
                            this.g = 3;
                            if (nejVar5.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar6 = this.h;
                            altaVar = this.i;
                            z2 = this.j;
                            this.g = 4;
                            if (nejVar6.f(altaVar, z2, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.K = true;
                            return aojh.a;
                    }
                case 2:
                    aooc.af(obj);
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    switch (nmoVarB.ordinal()) {
                        case 2:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1994, "DobbyLifecycleController.kt").v("Declining call before screening");
                            this.h.V();
                            return aojh.a;
                        case 3:
                        case 6:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1949, "DobbyLifecycleController.kt").v("Declining Dobby call in the background");
                            nejVar = this.h;
                            this.g = 5;
                            if (nejVar.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar7 = this.h;
                            altaVar2 = this.i;
                            z3 = this.j;
                            this.g = 6;
                            if (nejVar7.f(altaVar2, z3, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 4:
                        case 5:
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1970, "DobbyLifecycleController.kt").v("Declining call in the foreground");
                            nejVar2 = this.h;
                            this.a = nmoVarB;
                            this.g = 10;
                            if (nejVar2.d(this) == aoluVar) {
                                return aoluVar;
                            }
                            nmoVar = nmoVarB;
                            nejVar10 = this.h;
                            this.a = nmoVar;
                            this.g = 11;
                            if (nejVar10.k(false, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar11 = this.h;
                            nmoVar2 = defpackage.nmo.FOREGROUND_DECLINING;
                            this.a = nmoVar;
                            this.g = 12;
                            if (nejVar11.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar12 = this.h;
                            nejVar12.n.b(mce.bT);
                            altaVar4 = this.i;
                            this.a = nmoVar;
                            this.g = 13;
                            if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                                return aoluVar;
                            }
                            nmoVar3 = nmoVar;
                            this = this.h;
                            this.n.b(mce.cd);
                            if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                                this.K = false;
                            }
                            this.V();
                            return aojh.a;
                        case 7:
                        case 8:
                        case 10:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1956, "DobbyLifecycleController.kt").v("Declining call in the background");
                            nejVar3 = this.h;
                            this.g = 7;
                            if (nejVar3.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            alszVarB = alsz.b(this.i.f);
                            if (alszVarB == null) {
                                alszVarB = alsz.a;
                            }
                            if (alszVarB == alsz.b) {
                                nejVar8 = this.h;
                                alspVar = alsp.c;
                                this.g = 8;
                                if (nejVar8.w(alspVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                            nejVar9 = this.h;
                            nejVar9.o.a();
                            nejVar9.i.v();
                            altaVar3 = this.i;
                            z4 = this.j;
                            this.g = 9;
                            if (nejVar9.f(altaVar3, z4, this) == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        case 9:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1998, "DobbyLifecycleController.kt").v("Declining call during not active session");
                            nejVar4 = this.h;
                            z = this.j;
                            this.g = 14;
                            if (nejVar4.k(z, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.V();
                            return aojh.a;
                        case 11:
                        case 12:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2004, "DobbyLifecycleController.kt").v("Ignoring declining call in FOREGROUND/BACKGROUND_DECLINING state");
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        default:
                            aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 2009, "DobbyLifecycleController.kt");
                            aenjVarC = aenj.c((java.lang.String) null, nmoVarB);
                            aenjVarArr = new aenj[2];
                            aenjVarArr[0] = new aenj(", events:");
                            defpackage.nej nejVar18 = this.h;
                            this.a = aenjVarArr;
                            this.b = aimwVarL;
                            obj2 = "Can't decline call in state %s";
                            this.c = "Can't decline call in state %s";
                            this.d = aenjVarC;
                            this.e = aenjVarArr;
                            this.f = 1;
                            this.g = 15;
                            objA = nejVar18.q.a(this);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            obj3 = aenjVarC;
                            obj = objA;
                            aenjVarArr2 = aenjVarArr;
                            aimwVar = aimwVarL;
                            obj4 = aenjVarArr;
                            ((aenj[]) obj4)[i] = (aenj) obj;
                            aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) obj3, aenjVarArr2)));
                            this.h.n.a(mcd.O);
                            return aojh.a;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1940, "DobbyLifecycleController.kt").v("Declining Beesly call in the background");
                            nejVar5 = this.h;
                            this.g = 3;
                            if (nejVar5.y.n(this) == aoluVar) {
                                return aoluVar;
                            }
                            nejVar6 = this.h;
                            altaVar = this.i;
                            z2 = this.j;
                            this.g = 4;
                            if (nejVar6.f(altaVar, z2, this) == aoluVar) {
                                return aoluVar;
                            }
                            this.h.K = true;
                            return aojh.a;
                    }
                case 3:
                    aooc.af(obj);
                    nejVar6 = this.h;
                    altaVar = this.i;
                    z2 = this.j;
                    this.g = 4;
                    if (nejVar6.f(altaVar, z2, this) == aoluVar) {
                        return aoluVar;
                    }
                    this.h.K = true;
                    return aojh.a;
                case 4:
                    aooc.af(obj);
                    this.h.K = true;
                    return aojh.a;
                case 5:
                    aooc.af(obj);
                    nejVar7 = this.h;
                    altaVar2 = this.i;
                    z3 = this.j;
                    this.g = 6;
                    if (nejVar7.f(altaVar2, z3, this) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 6:
                case 9:
                    aooc.af(obj);
                    return aojh.a;
                case 7:
                    aooc.af(obj);
                    alszVarB = alsz.b(this.i.f);
                    if (alszVarB == null) {
                        alszVarB = alsz.a;
                    }
                    if (alszVarB == alsz.b) {
                        nejVar8 = this.h;
                        alspVar = alsp.c;
                        this.g = 8;
                        if (nejVar8.w(alspVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    nejVar9 = this.h;
                    nejVar9.o.a();
                    nejVar9.i.v();
                    altaVar3 = this.i;
                    z4 = this.j;
                    this.g = 9;
                    if (nejVar9.f(altaVar3, z4, this) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 8:
                    aooc.af(obj);
                    nejVar9 = this.h;
                    nejVar9.o.a();
                    nejVar9.i.v();
                    altaVar3 = this.i;
                    z4 = this.j;
                    this.g = 9;
                    if (nejVar9.f(altaVar3, z4, this) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 10:
                    nmoVar = (defpackage.nmo) this.a;
                    aooc.af(obj);
                    nejVar10 = this.h;
                    this.a = nmoVar;
                    this.g = 11;
                    if (nejVar10.k(false, this) == aoluVar) {
                        return aoluVar;
                    }
                    nejVar11 = this.h;
                    nmoVar2 = defpackage.nmo.FOREGROUND_DECLINING;
                    this.a = nmoVar;
                    this.g = 12;
                    if (nejVar11.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    nejVar12 = this.h;
                    nejVar12.n.b(mce.bT);
                    altaVar4 = this.i;
                    this.a = nmoVar;
                    this.g = 13;
                    if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                        return aoluVar;
                    }
                    nmoVar3 = nmoVar;
                    this = this.h;
                    this.n.b(mce.cd);
                    if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                        this.K = false;
                    }
                    this.V();
                    return aojh.a;
                case 11:
                    nmoVar = (defpackage.nmo) this.a;
                    aooc.af(obj);
                    nejVar11 = this.h;
                    nmoVar2 = defpackage.nmo.FOREGROUND_DECLINING;
                    this.a = nmoVar;
                    this.g = 12;
                    if (nejVar11.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    nejVar12 = this.h;
                    nejVar12.n.b(mce.bT);
                    altaVar4 = this.i;
                    this.a = nmoVar;
                    this.g = 13;
                    if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                        return aoluVar;
                    }
                    nmoVar3 = nmoVar;
                    this = this.h;
                    this.n.b(mce.cd);
                    if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                        this.K = false;
                    }
                    this.V();
                    return aojh.a;
                case 12:
                    nmoVar = (defpackage.nmo) this.a;
                    aooc.af(obj);
                    nejVar12 = this.h;
                    nejVar12.n.b(mce.bT);
                    altaVar4 = this.i;
                    this.a = nmoVar;
                    this.g = 13;
                    if (nejVar12.t(altaVar4, false, this) != aoluVar) {
                        return aoluVar;
                    }
                    nmoVar3 = nmoVar;
                    this = this.h;
                    this.n.b(mce.cd);
                    if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                        this.K = false;
                    }
                    this.V();
                    return aojh.a;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    nmoVar3 = (defpackage.nmo) this.a;
                    aooc.af(obj);
                    this = this.h;
                    this.n.b(mce.cd);
                    if (nmoVar3 == defpackage.nmo.BEESLY_WITH_UI) {
                        this.K = false;
                    }
                    this.V();
                    return aojh.a;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    aooc.af(obj);
                    this.h.V();
                    return aojh.a;
                default:
                    i = this.f;
                    java.lang.Object obj5 = this.e;
                    obj3 = this.d;
                    obj2 = this.c;
                    java.lang.Object obj6 = this.b;
                    aenj[] aenjVarArr3 = (aenj[]) this.a;
                    aooc.af(obj);
                    aimwVar = obj6;
                    obj4 = obj5;
                    aenjVarArr2 = aenjVarArr3;
                    ((aenj[]) obj4)[i] = (aenj) obj;
                    aimwVar.y((java.lang.String) obj2, new aepg(aenj.b((aenj) obj3, aenjVarArr2)));
                    this.h.n.a(mcd.O);
                    return aojh.a;
            }
        } catch (java.util.concurrent.CancellationException e) {
            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "declineCallDeferred$<anonymous>", 1980, "DobbyLifecycleController.kt").v("declineCall foreground audio playback was cancelled");
            this.h.n.b(mce.cw);
            throw e;
        }
    }
}
