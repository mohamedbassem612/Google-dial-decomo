package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bpj extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.ahc ahcVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ahcVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.bpj) c((defpackage.efd) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.bpj) c((defpackage.gds) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.bpj) c((hqf) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.bpj) c((defpackage.ipb) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.bpj) c((itc) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.bpj) c((itc) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.bpj) c((itc) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.bpj) c((defpackage.ixh) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.bpj) c((defpackage.jbr) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 12:
                return ((defpackage.bpj) c((defpackage.jbr) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 13:
                return ((defpackage.bpj) c((defpackage.jbr) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 14:
                return ((defpackage.bpj) c((kdy) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 15:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 16:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 17:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 18:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 19:
                return ((defpackage.bpj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.bpj) c((defpackage.nok) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        int i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.aoss aossVar = (defpackage.aoss) this.b;
                defpackage.aooc.af(obj);
                defpackage.aoov.an(aossVar, null, 0, new apw((bpk) this.a, new java.util.ArrayList(), (defpackage.aoln) null, 7), 3);
                return defpackage.aojh.a;
            case 1:
                defpackage.aoss aossVar2 = (defpackage.aoss) this.b;
                defpackage.aooc.af(obj);
                defpackage.ahc ahcVar = (defpackage.ahc) this.a;
                defpackage.ahy ahyVar = ahcVar.a;
                if (ahyVar.f()) {
                    defpackage.aoov.an(aossVar2, null, 0, new ahb(ahcVar, (defpackage.aoln) null, 0), 3);
                }
                if (ahyVar.g()) {
                    defpackage.aoov.an(aossVar2, null, 0, new ahb(ahcVar, (defpackage.aoln) null, 2, (byte[]) null), 3);
                }
                if (ahyVar.i()) {
                    defpackage.aoov.an(aossVar2, null, 0, new ahb(ahcVar, (defpackage.aoln) null, 3, (char[]) null), 3);
                }
                if (ahyVar.h()) {
                    defpackage.aoov.an(aossVar2, null, 0, new ahb(ahcVar, (defpackage.aoln) null, 4, (short[]) null), 3);
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.efd efdVar = (defpackage.efd) this.b;
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf((efdVar instanceof defpackage.ecr) && ((defpackage.ecr) efdVar).c <= ((defpackage.ecr) this.a).c);
            case 3:
                defpackage.gds gdsVar = (defpackage.gds) this.b;
                defpackage.aooc.af(obj);
                int i2 = -gdsVar.c;
                int i3 = ((defpackage.gbl) this.a).b.f;
                return java.lang.Boolean.valueOf(i2 > i3 || (-gdsVar.d) > i3);
            case 4:
                defpackage.aooc.af(obj);
                heq heqVarA = hht.a(((hqf) this.b).L());
                java.lang.Object obj2 = this.a;
                defpackage.aooh.f(obj2, "value");
                defpackage.akzx akzxVar = (defpackage.akzx) heqVarA.a;
                akzxVar.u();
                akzxVar.b.b = ((hqh) obj2).a();
                return heqVarA.f();
            case 5:
                defpackage.aooc.af(obj);
                try {
                    ((java.io.File) this.a).delete();
                    ((defpackage.aimw) hwj.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer", "deleteAudioFile$<anonymous>", 260, "VoiceAssistAudioPlayer.kt")).v("Generated audio file deleted.");
                    return defpackage.aojh.a;
                } catch (java.lang.Exception e) {
                    if (!(e instanceof java.util.concurrent.CancellationException)) {
                        defpackage.aimz aimzVar = defpackage.zih.a;
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zih.a.c()).k(e)).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt")).v("Unhandled coroutine exception!");
                    }
                    throw e;
                }
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                defpackage.ipc ipcVarE = defpackage.kcq.E(((defpackage.ipb) this.b).L());
                ((defpackage.iot) this.a).d.a(ipcVarE);
                return ipcVarE.a();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(obj);
                return itc.a((itc) this.b, new itp((kqy) this.a), (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Integer) null, (itt) null, (itt) null, 16381);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(obj);
                return itc.a((itc) this.b, new itu((itq) this.a), (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Integer) null, (itt) null, (itt) null, 16381);
            case 9:
                defpackage.aooc.af(obj);
                return itc.a((itc) this.b, (itr) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.Integer) this.a, (itt) null, (itt) null, 15871);
            case 10:
                defpackage.aooc.af(obj);
                defpackage.ixh ixhVar = (defpackage.ixh) this.b;
                defpackage.alat alatVar = ixhVar.e;
                defpackage.aooh.e(alatVar, "getBeeslyGreetingsList(...)");
                if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                    java.util.Iterator<E> it = alatVar.iterator();
                    while (it.hasNext()) {
                        if (ixc.a(((ixd) it.next()).b) == ixc.b && (i = i + 1) < 0) {
                            defpackage.ajsz.bg();
                        }
                    }
                    if (i >= 10) {
                        throw new java.lang.IllegalStateException("Maximum number of total greetings (10) reached.");
                    }
                }
                defpackage.aimw aimwVar = (defpackage.aimw) defpackage.ixt.b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "add$<anonymous>", 95, "BeeslyGreetingsDataService.kt");
                ixf ixfVar = (ixf) this.a;
                aimwVar.y("Adding custom greeting with id: %s", ixfVar.b);
                her herVarM = hhb.m(ixhVar.L());
                herVarM.n();
                ni niVarV = hgz.V(ixd.a.m());
                niVarV.S(ixfVar);
                herVarM.l(niVarV.R());
                return herVarM.h();
            case 11:
                defpackage.aooc.af(obj);
                defpackage.kaw kawVarH = defpackage.kcq.H(((defpackage.jbr) this.b).L());
                defpackage.akzx akzxVar2 = (defpackage.akzx) kawVarH.a;
                akzxVar2.u();
                defpackage.jbr jbrVar = (defpackage.jbr) akzxVar2.b;
                jbrVar.i = ((jbn) this.a).a();
                jbrVar.b |= 64;
                return kawVarH.f();
            case 12:
                defpackage.aooc.af(obj);
                defpackage.kaw kawVarH2 = defpackage.kcq.H(((defpackage.jbr) this.b).L());
                java.lang.Object obj3 = this.a;
                defpackage.aooh.f(obj3, "value");
                defpackage.akzx akzxVar3 = (defpackage.akzx) kawVarH2.a;
                akzxVar3.u();
                defpackage.jbr jbrVar2 = (defpackage.jbr) akzxVar3.b;
                j$.util.Objects.requireNonNull(obj3);
                jbrVar2.d = (defpackage.jbp) obj3;
                jbrVar2.b |= 2;
                return kawVarH2.f();
            case 13:
                defpackage.aooc.af(obj);
                defpackage.kaw kawVarH3 = defpackage.kcq.H(((defpackage.jbr) this.b).L());
                java.lang.Object obj4 = this.a;
                defpackage.aooh.f(obj4, "value");
                defpackage.akzx akzxVar4 = (defpackage.akzx) kawVarH3.a;
                akzxVar4.u();
                defpackage.jbr jbrVar3 = (defpackage.jbr) akzxVar4.b;
                jbrVar3.c = ((jbn) obj4).a();
                jbrVar3.b |= 1;
                return kawVarH3.f();
            case 14:
                defpackage.aooc.af(obj);
                kdy kdyVar = (kdy) this.b;
                java.lang.Object obj5 = this.a;
                defpackage.aooh.c(obj5);
                defpackage.aooh.f(obj5, "values");
                android.content.ContentValues contentValues = (android.content.ContentValues) obj5;
                java.lang.Long asLong = contentValues.getAsLong("_id");
                if (asLong != null) {
                    long j = kdyVar.a;
                    if (asLong.longValue() != j) {
                        throw new java.lang.IllegalArgumentException("Ids must match: " + contentValues.get("_id") + ", " + j);
                    }
                }
                android.content.ContentValues contentValuesA = kdyVar.a();
                contentValuesA.putAll(contentValues);
                return hgt.z(contentValuesA);
            case 15:
                defpackage.aooc.af(obj);
                try {
                    java.lang.Object obj6 = this.a;
                    defpackage.kaw kawVar = ((lmr) obj6).c;
                    long j2 = ((lmr) obj6).b;
                    if (((j$.util.concurrent.ConcurrentHashMap) kawVar.a).remove(java.lang.Long.valueOf(j2)) == null) {
                        ((defpackage.aimw) lmr.a.b().l("com/android/dialer/callscreeningservice/activecall/HasAnotherActiveCallCallScopeRemovedListener", "onCallScopeRemoved$<anonymous>", 26, "HasAnotherActiveCallCallScopeRemovedListener.kt")).x("did not remove result for time: %d", j2);
                        break;
                    }
                    return defpackage.aojh.a;
                } catch (java.lang.Exception e2) {
                    if (!(e2 instanceof java.util.concurrent.CancellationException)) {
                        defpackage.aimz aimzVar2 = defpackage.zih.a;
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zih.a.c()).k(e2)).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt")).v("Unhandled coroutine exception!");
                    }
                    throw e2;
                }
            case 16:
                defpackage.aooc.af(obj);
                try {
                    java.lang.Object obj7 = this.a;
                    oq oqVar = ((lnj) obj7).c;
                    long j3 = ((lnj) obj7).b;
                    if (((j$.util.concurrent.ConcurrentHashMap) oqVar.a).remove(java.lang.Long.valueOf(j3)) == null) {
                        ((defpackage.aimw) lnj.a.b().l("com/android/dialer/callscreeningservice/result/CallScreeningResultCallScopeRemovedListener", "onCallScopeRemoved$<anonymous>", 26, "CallScreeningResultCallScopeRemovedListener.kt")).x("did not remove result for time: %d", j3);
                        break;
                    }
                    return defpackage.aojh.a;
                } catch (java.lang.Exception e3) {
                    if (!(e3 instanceof java.util.concurrent.CancellationException)) {
                        defpackage.aimz aimzVar3 = defpackage.zih.a;
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zih.a.c()).k(e3)).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt")).v("Unhandled coroutine exception!");
                    }
                    throw e3;
                }
            case 17:
                defpackage.aooc.af(obj);
                return defpackage.aoov.an((defpackage.aoss) this.b, null, 0, new muz((nbv) this.a, (defpackage.aoln) null, 17, (byte[]) null), 3);
            case 18:
                defpackage.aooc.af(obj);
                defpackage.aoss aossVar3 = (defpackage.aoss) this.b;
                nej nejVar = (nej) this.a;
                return nejVar.T(aossVar3, new mva(nejVar, (defpackage.aoln) null, 4));
            case 19:
                defpackage.aooc.af(obj);
                defpackage.aoss aossVar4 = (defpackage.aoss) this.b;
                nej nejVar2 = (nej) this.a;
                return nejVar2.T(aossVar4, new mva(nejVar2, (defpackage.aoln) null, 5, (byte[]) null));
            default:
                defpackage.aooc.af(obj);
                defpackage.kaw kawVarAO = defpackage.gus.aO(((defpackage.nok) this.b).L());
                java.lang.Object obj8 = this.a;
                defpackage.aooh.f(obj8, "value");
                defpackage.akzx akzxVar5 = (defpackage.akzx) kawVarAO.a;
                akzxVar5.u();
                defpackage.nok nokVar = (defpackage.nok) akzxVar5.b;
                nokVar.j = ((nof) obj8).a();
                nokVar.b |= 64;
                return kawVarAO.D();
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.bpj bpjVar = new defpackage.bpj((bpk) this.a, aolnVar, 0);
                bpjVar.b = obj;
                return bpjVar;
            case 1:
                defpackage.bpj bpjVar2 = new defpackage.bpj((defpackage.ahc) this.a, aolnVar, 1);
                bpjVar2.b = obj;
                return bpjVar2;
            case 2:
                defpackage.bpj bpjVar3 = new defpackage.bpj((defpackage.efd) this.a, aolnVar, 2);
                bpjVar3.b = obj;
                return bpjVar3;
            case 3:
                defpackage.bpj bpjVar4 = new defpackage.bpj((defpackage.gbl) this.a, aolnVar, 3);
                bpjVar4.b = obj;
                return bpjVar4;
            case 4:
                defpackage.bpj bpjVar5 = new defpackage.bpj((hqh) this.a, aolnVar, 4);
                bpjVar5.b = obj;
                return bpjVar5;
            case 5:
                defpackage.bpj bpjVar6 = new defpackage.bpj(aolnVar, (java.io.File) this.a, 5);
                bpjVar6.b = obj;
                return bpjVar6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bpj bpjVar7 = new defpackage.bpj((defpackage.iot) this.a, aolnVar, 6);
                bpjVar7.b = obj;
                return bpjVar7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bpj bpjVar8 = new defpackage.bpj((kqy) this.a, aolnVar, 7);
                bpjVar8.b = obj;
                return bpjVar8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bpj bpjVar9 = new defpackage.bpj((itq) this.a, aolnVar, 8);
                bpjVar9.b = obj;
                return bpjVar9;
            case 9:
                defpackage.bpj bpjVar10 = new defpackage.bpj((java.lang.Integer) this.a, aolnVar, 9);
                bpjVar10.b = obj;
                return bpjVar10;
            case 10:
                defpackage.bpj bpjVar11 = new defpackage.bpj((ixf) this.a, aolnVar, 10);
                bpjVar11.b = obj;
                return bpjVar11;
            case 11:
                defpackage.bpj bpjVar12 = new defpackage.bpj((jbn) this.a, aolnVar, 11);
                bpjVar12.b = obj;
                return bpjVar12;
            case 12:
                defpackage.bpj bpjVar13 = new defpackage.bpj((defpackage.jbp) this.a, aolnVar, 12);
                bpjVar13.b = obj;
                return bpjVar13;
            case 13:
                defpackage.bpj bpjVar14 = new defpackage.bpj((jbn) this.a, aolnVar, 13, (byte[]) null);
                bpjVar14.b = obj;
                return bpjVar14;
            case 14:
                defpackage.bpj bpjVar15 = new defpackage.bpj((android.content.ContentValues) this.a, aolnVar, 14);
                bpjVar15.b = obj;
                return bpjVar15;
            case 15:
                defpackage.bpj bpjVar16 = new defpackage.bpj(aolnVar, (lmr) this.a, 15);
                bpjVar16.b = obj;
                return bpjVar16;
            case 16:
                defpackage.bpj bpjVar17 = new defpackage.bpj(aolnVar, (lnj) this.a, 16);
                bpjVar17.b = obj;
                return bpjVar17;
            case 17:
                defpackage.bpj bpjVar18 = new defpackage.bpj((nbv) this.a, aolnVar, 17);
                bpjVar18.b = obj;
                return bpjVar18;
            case 18:
                defpackage.bpj bpjVar19 = new defpackage.bpj((nej) this.a, aolnVar, 18);
                bpjVar19.b = obj;
                return bpjVar19;
            case 19:
                defpackage.bpj bpjVar20 = new defpackage.bpj((nej) this.a, aolnVar, 19, (byte[]) null);
                bpjVar20.b = obj;
                return bpjVar20;
            default:
                defpackage.bpj bpjVar21 = new defpackage.bpj((nof) this.a, aolnVar, 20);
                bpjVar21.b = obj;
                return bpjVar21;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(android.content.ContentValues contentValues, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = contentValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.aoln aolnVar, java.io.File file, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.aoln aolnVar, lmr lmrVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lmrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.aoln aolnVar, lnj lnjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lnjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(bpk bpkVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = bpkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.efd efdVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = efdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.gbl gblVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = gblVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(hqh hqhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hqhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.iot iotVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = iotVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(itq itqVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = itqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(ixf ixfVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ixfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(java.lang.Integer num, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(jbn jbnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(jbn jbnVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(defpackage.jbp jbpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jbpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(kqy kqyVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = kqyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(nbv nbvVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nbvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(nej nejVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(nej nejVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpj(nof nofVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nofVar;
    }
}
