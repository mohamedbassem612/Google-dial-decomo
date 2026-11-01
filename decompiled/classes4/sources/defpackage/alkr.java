package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkr implements defpackage.allg, alld {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionProcessor");
    public final defpackage.aljq b;
    public final defpackage.allj c;
    public defpackage.allb d;
    public boolean e;
    public alln f;
    public boolean g;
    public j$.util.Optional m;
    public j$.util.Optional n;
    private final defpackage.alkw o;
    private defpackage.aloa p;
    private final defpackage.amac q;
    private vqy s;
    private final ajwr r = new ajwr();
    public aihd h = aikn.a;
    public boolean i = false;
    public final java.util.concurrent.locks.ReentrantLock j = new java.util.concurrent.locks.ReentrantLock();
    public boolean k = false;
    public j$.util.Optional l = j$.util.Optional.empty();

    public alkr(defpackage.alli alliVar, defpackage.aljq aljqVar, defpackage.amac amacVar, defpackage.alkw alkwVar) {
        this.c = alliVar.a(defpackage.allh.b.name());
        this.b = aljqVar;
        this.q = amacVar;
        this.o = alkwVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.u(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_RINGING_STARTED, defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_RINGING_STARTED)) {
            this.i = true;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2.equals(defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING)) {
            this.i = false;
        }
        defpackage.almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar3.c);
        if (alnbVarB3 == null) {
            alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB3.equals(defpackage.alnb.EVENT_SAY)) {
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            aihd aihdVar = this.h;
            apdi apdiVar = defpackage.alol.f;
            almzVar4.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar4).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alsw alswVar = ((defpackage.alol) objJ).e;
            if (alswVar == null) {
                alswVar = defpackage.alsw.a;
            }
            if (!aihdVar.contains((alswVar.b == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a).c)) {
                this.b.b(almzVar4);
            }
        }
        if (anty.aH(almyVar)) {
            try {
                this.s.j(almyVar);
            } catch (defpackage.aljs e) {
                aimw aimwVarL = a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionProcessor", "consume", 216, "IntentExtractionProcessor.java");
                defpackage.almz almzVar5 = almyVar.h;
                if (almzVar5 == null) {
                    almzVar5 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB4 = defpackage.alnb.b(almzVar5.c);
                if (alnbVarB4 == null) {
                    alnbVarB4 = defpackage.alnb.EVENT_UNKNOWN;
                }
                aimwVarL.y("Consuming event %s failed.", alnbVarB4.name());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void c(aigf aigfVar) {
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS;
        defpackage.almy almyVar = defpackage.almy.a;
        defpackage.almz almzVar = ((defpackage.almy) aigfVar.getOrDefault(alnbVar, almyVar)).h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alpd.d;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        final defpackage.alpd alpdVar = (defpackage.alpd) objJ;
        final defpackage.almy almyVar2 = (defpackage.almy) aigfVar.getOrDefault(defpackage.alnb.EVENT_ASR_RESULT, almyVar);
        try {
            defpackage.amac amacVar = this.q;
            java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: alkp
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    defpackage.allb allbVar;
                    defpackage.almm almmVar;
                    defpackage.almy almyVar3 = almyVar2;
                    boolean z = alpdVar.c;
                    defpackage.almz almzVar2 = almyVar3.h;
                    if (almzVar2 == null) {
                        almzVar2 = defpackage.almz.a;
                    }
                    defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
                    if (alnbVarB == null) {
                        alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                    }
                    byte[] bArr = null;
                    if (alnbVarB.equals(defpackage.alnb.EVENT_ASR_RESULT)) {
                        defpackage.almz almzVar3 = almyVar3.h;
                        if (almzVar3 == null) {
                            almzVar3 = defpackage.almz.a;
                        }
                        apdi apdiVar2 = defpackage.alnj.f;
                        almzVar3.c(apdiVar2);
                        java.lang.Object objJ2 = ((alaa) almzVar3).n.j((alac) apdiVar2.a);
                        if (objJ2 == null) {
                            objJ2 = apdiVar2.b;
                        } else {
                            apdiVar2.c(objJ2);
                        }
                        alqu alquVar = ((defpackage.alnj) objJ2).c;
                        if (alquVar == null) {
                            alquVar = alqu.a;
                        }
                        if (alquVar.c == 1) {
                            defpackage.alkr alkrVar = this.a;
                            if (!alkrVar.i) {
                                defpackage.almz almzVar4 = almyVar3.h;
                                if (almzVar4 == null) {
                                    almzVar4 = defpackage.almz.a;
                                }
                                java.lang.String strE = defpackage.alkt.e(almzVar4);
                                if (!strE.isEmpty()) {
                                    java.util.concurrent.locks.ReentrantLock reentrantLock = alkrVar.j;
                                    reentrantLock.lock();
                                    try {
                                        if (alkrVar.k || (allbVar = alkrVar.d) == null) {
                                            alkrVar.j.unlock();
                                            return null;
                                        }
                                        defpackage.aljq aljqVar = alkrVar.b;
                                        defpackage.alla allaVarB = allbVar.b(strE, aljqVar);
                                        aigb aigbVar = new aigb(4);
                                        alic alicVar = allbVar.b;
                                        aigbVar.l(allbVar.a(alicVar.a(allaVarB.a)));
                                        j$.util.Optional optionalOfNullable = allaVarB.b;
                                        defpackage.xbz xbzVar = new defpackage.xbz(allbVar, 12);
                                        if (true == optionalOfNullable.isPresent()) {
                                            java.lang.Object obj = optionalOfNullable.get();
                                            java.lang.Object obj2 = xbzVar.a;
                                            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.allb) obj2).a(((defpackage.allb) obj2).b.a((java.lang.String) obj)));
                                        }
                                        defpackage.alju aljuVar = new defpackage.alju(aigbVar, 12);
                                        int i = 9;
                                        if (true == optionalOfNullable.isPresent()) {
                                            ((aigb) aljuVar.a).l((aigf) j$.util.Collection.-EL.stream(((aigf) optionalOfNullable.get()).e()).collect(aido.b(new defpackage.aite(i), new defpackage.alki(8))));
                                        }
                                        if (allbVar.c) {
                                            aigbVar.l((aigf) j$.util.Collection.-EL.stream(allbVar.a(alicVar.a(strE)).e()).collect(aido.b(new defpackage.aite(10, bArr), new defpackage.alki(8))));
                                        }
                                        aigf aigfVarE = aigbVar.e(true);
                                        defpackage.alla allaVarB2 = allbVar.b(strE, aljqVar);
                                        j$.util.Optional optional = allaVarB2.b;
                                        aift aiftVar = new aift(4);
                                        aiftVar.i(allaVarB2.a);
                                        j$.util.Objects.requireNonNull(aiftVar);
                                        defpackage.alju aljuVar2 = new defpackage.alju(aiftVar, 13);
                                        if (true == optional.isPresent()) {
                                            ((aift) aljuVar2.a).i(optional.get());
                                        }
                                        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aigfVarE.f());
                                        defpackage.alki alkiVar = new defpackage.alki(9);
                                        defpackage.alkx alkxVar = allbVar.d;
                                        j$.util.Objects.requireNonNull(alkxVar);
                                        aigf aigfVar2 = (aigf) stream.collect(aido.b(alkiVar, new defpackage.aite(alkxVar, 11)));
                                        akzx akzxVarM = defpackage.amas.a.m();
                                        akzx akzxVarM2 = defpackage.amap.a.m();
                                        int i2 = defpackage.alpr.a;
                                        aigb aigbVar2 = new aigb(4);
                                        java.util.Iterator itK = aigfVarE.e().k();
                                        while (itK.hasNext()) {
                                            java.util.Map.Entry entry = (java.util.Map.Entry) itK.next();
                                            if (aigfVar2.containsKey(entry.getKey())) {
                                                org.tensorflow.lite.TensorImpl tensorImpl = (org.tensorflow.lite.TensorImpl) aigfVar2.get(entry.getKey());
                                                java.lang.String str = (java.lang.String) entry.getKey();
                                                java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
                                                defpackage.aqaj aqajVar = tensorImpl.a;
                                                int[] iArr = tensorImpl.b;
                                                int[][] iArr2 = (int[][]) entry.getValue();
                                                akzx akzxVarB = defpackage.alpr.b(aqajVar, iArr);
                                                j$.util.stream.Stream streamFlatMap = j$.util.DesugarArrays.stream(iArr2).flatMap(new defpackage.alpp(2));
                                                j$.util.Objects.requireNonNull(akzxVarB);
                                                streamFlatMap.forEach(new defpackage.alkh(akzxVarB, 7));
                                                aigbVar2.i(str, (defpackage.aqag) akzxVarB.p());
                                                reentrantLock = reentrantLock2;
                                                itK = itK;
                                            }
                                        }
                                        java.util.concurrent.locks.ReentrantLock reentrantLock3 = reentrantLock;
                                        aigf aigfVarE2 = aigbVar2.e(true);
                                        akzxVarM2.u();
                                        defpackage.amap amapVar = (defpackage.amap) akzxVarM2.b;
                                        albe albeVar = amapVar.c;
                                        if (!albeVar.b) {
                                            amapVar.c = albeVar.a();
                                        }
                                        amapVar.c.putAll(aigfVarE2);
                                        aify aifyVarH = aiftVar.h();
                                        akzxVarM2.u();
                                        defpackage.amap amapVar2 = (defpackage.amap) akzxVarM2.b;
                                        alat alatVar = amapVar2.b;
                                        if (!alatVar.c()) {
                                            amapVar2.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, amapVar2.b);
                                        akzxVarM.u();
                                        defpackage.amas amasVar = (defpackage.amas) akzxVarM.b;
                                        defpackage.amap amapVar3 = (defpackage.amap) akzxVarM2.p();
                                        j$.util.Objects.requireNonNull(amapVar3);
                                        amasVar.c = amapVar3;
                                        amasVar.b = 2;
                                        defpackage.amas amasVar2 = (defpackage.amas) akzxVarM.p();
                                        if (alkrVar.e) {
                                            defpackage.allj alljVar = alkrVar.c;
                                            akzz akzzVarM = defpackage.almz.a.m();
                                            defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_PARSING_MODEL_INPUT;
                                            akzzVarM.u();
                                            defpackage.almz almzVar5 = akzzVarM.b;
                                            almzVar5.c = alnbVar2.aN;
                                            almzVar5.b |= 1;
                                            akzzVarM.bV(defpackage.aloc.b, amasVar2);
                                            alljVar.a((defpackage.almz) akzzVarM.p(), almyVar3);
                                        }
                                        defpackage.allf allfVarC = allbVar.c(amasVar2);
                                        if (alkrVar.e) {
                                            defpackage.allj alljVar2 = alkrVar.c;
                                            akzz akzzVarM2 = defpackage.almz.a.m();
                                            defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_PARSING_MODEL_OUTPUT;
                                            akzzVarM2.u();
                                            defpackage.almz almzVar6 = akzzVarM2.b;
                                            almzVar6.c = alnbVar3.aN;
                                            almzVar6.b |= 1;
                                            akzzVarM2.bV(defpackage.alod.b, allfVarC.d);
                                            alljVar2.a((defpackage.almz) akzzVarM2.p(), almyVar3);
                                        }
                                        if (!z || alkrVar.g) {
                                            j$.util.Optional optional2 = alkrVar.l;
                                            defpackage.alkq alkqVar = new defpackage.alkq(alkrVar, allfVarC, almyVar3, 0);
                                            if (true == optional2.isPresent()) {
                                                java.lang.Object obj3 = optional2.get();
                                                java.lang.Object obj4 = alkqVar.a;
                                                java.lang.Object obj5 = alkqVar.b;
                                                java.lang.Object obj6 = alkqVar.c;
                                                j$.util.Optional optionalFindFirst = defpackage.alkt.c((defpackage.allf) obj5, "outcome_argument_prediction_classes", "outcome_argument_prediction_scores").i(new defpackage.alks(((defpackage.almj) obj3).b, 6)).d(new defpackage.aitf(1)).findFirst();
                                                ida idaVar = new ida(obj3, 11);
                                                if (true == optionalFindFirst.isPresent()) {
                                                    if (((java.lang.Float) optionalFindFirst.get()).floatValue() <= ((defpackage.almj) idaVar.a).c) {
                                                        optionalFindFirst = j$.util.Optional.empty();
                                                    }
                                                }
                                                whq whqVar = new whq(obj4, obj6, 7);
                                                if (true == optionalFindFirst.isPresent()) {
                                                    java.lang.Object obj7 = optionalFindFirst.get();
                                                    java.lang.Object obj8 = whqVar.a;
                                                    java.lang.Object obj9 = whqVar.b;
                                                    defpackage.allj alljVar3 = ((defpackage.alkr) obj8).c;
                                                    akzz akzzVarM3 = defpackage.almz.a.m();
                                                    defpackage.alnb alnbVar4 = defpackage.alnb.EVENT_ROBOCALL_DETECTED;
                                                    akzzVarM3.u();
                                                    defpackage.almz almzVar7 = akzzVarM3.b;
                                                    almzVar7.c = alnbVar4.aN;
                                                    almzVar7.b |= 1;
                                                    alljVar3.a((defpackage.almz) akzzVarM3.p(), (defpackage.almy) obj9);
                                                }
                                            }
                                        }
                                        aify aifyVarB = defpackage.alkt.b(allfVarC, "robot_intent_score_distributions");
                                        aify aifyVarA = defpackage.alkt.a(allfVarC, "robot_intent_classes");
                                        if (aifyVarA.isEmpty()) {
                                            almmVar = defpackage.almm.a;
                                        } else {
                                            int i3 = 0;
                                            for (int i4 = 1; i4 < aifyVarB.size(); i4++) {
                                                if (((java.lang.Float) aifyVarB.get(i4)).floatValue() > ((java.lang.Float) aifyVarB.get(i3)).floatValue()) {
                                                    i3 = i4;
                                                }
                                            }
                                            akzx akzxVarM3 = defpackage.almm.a.m();
                                            java.lang.String str2 = (java.lang.String) aifyVarA.get(i3);
                                            akzxVarM3.u();
                                            defpackage.almm almmVar2 = (defpackage.almm) akzxVarM3.b;
                                            j$.util.Objects.requireNonNull(str2);
                                            almmVar2.b |= 1;
                                            almmVar2.c = str2;
                                            float fFloatValue = ((java.lang.Float) aifyVarB.get(i3)).floatValue();
                                            akzxVarM3.u();
                                            defpackage.almm almmVar3 = (defpackage.almm) akzxVarM3.b;
                                            almmVar3.b |= 2;
                                            almmVar3.d = fFloatValue;
                                            almmVar = (defpackage.almm) akzxVarM3.p();
                                        }
                                        defpackage.almm almmVar4 = almmVar;
                                        akzx akzxVarP = almmVar4.p();
                                        j$.util.Optional optional3 = alkrVar.m;
                                        oqg oqgVar = new oqg(alkrVar, akzxVarP, allfVarC, almmVar4, 3);
                                        if (true == optional3.isPresent()) {
                                            java.lang.Object obj10 = optional3.get();
                                            java.lang.Object obj11 = oqgVar.c;
                                            java.lang.Object obj12 = oqgVar.a;
                                            java.lang.Object obj13 = oqgVar.b;
                                            java.lang.Object obj14 = oqgVar.d;
                                            alln allnVar = ((defpackage.alkr) obj11).f;
                                            java.lang.String str3 = ((defpackage.almm) obj14).c;
                                            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(allnVar.d(str3).j).map(new defpackage.alki(12)).map(new defpackage.aite(str3, 12));
                                            j$.util.stream.Collector collector = aido.b;
                                            aihd aihdVar = (aihd) defpackage.alkt.c((defpackage.allf) obj13, ((defpackage.alnz) obj10).b, ((defpackage.alnz) obj10).c).i(new defpackage.alks((aihd) map.collect(collector), 0)).j(new defpackage.alks(obj10, 2)).d(new defpackage.aitf(2)).collect(collector);
                                            ((akzx) obj12).u();
                                            defpackage.almm almmVar5 = (defpackage.almm) ((akzx) obj12).b;
                                            alat alatVar2 = almmVar5.e;
                                            if (!alatVar2.c()) {
                                                almmVar5.e = alad.J(alatVar2);
                                            }
                                            akyl.i(aihdVar, almmVar5.e);
                                        }
                                        akzx akzxVarM4 = defpackage.almn.a.m();
                                        akzxVarM4.u();
                                        defpackage.almn almnVar = (defpackage.almn) akzxVarM4.b;
                                        defpackage.almm almmVar6 = (defpackage.almm) akzxVarP.p();
                                        j$.util.Objects.requireNonNull(almmVar6);
                                        almnVar.c = almmVar6;
                                        almnVar.b |= 1;
                                        j$.util.Optional optional4 = alkrVar.n;
                                        oqg oqgVar2 = new oqg(akzxVarM4, allbVar, allfVarC, strE, 4);
                                        if (true == optional4.isPresent()) {
                                            java.lang.Object obj15 = optional4.get();
                                            java.lang.Object obj16 = oqgVar2.a;
                                            java.lang.Object obj17 = oqgVar2.c;
                                            java.lang.Object obj18 = oqgVar2.b;
                                            final defpackage.alia aliaVarA = ((defpackage.allb) obj17).b.a((java.lang.String) oqgVar2.d);
                                            final defpackage.allf allfVar = (defpackage.allf) obj18;
                                            final defpackage.almk almkVar = (defpackage.almk) obj15;
                                            aify aifyVar = (aify) j$.util.stream.IntStream.-CC.range(0, aliaVarA.e.size()).mapToObj(new java.util.function.IntFunction() { // from class: alkz
                                                @Override // java.util.function.IntFunction
                                                public final java.lang.Object apply(int i5) {
                                                    akzx akzxVarM5 = defpackage.alpf.a.m();
                                                    defpackage.alia aliaVar = aliaVarA;
                                                    java.lang.String str4 = (java.lang.String) aliaVar.e.get(i5);
                                                    akzxVarM5.u();
                                                    defpackage.alpf alpfVar = (defpackage.alpf) akzxVarM5.b;
                                                    j$.util.Objects.requireNonNull(str4);
                                                    alpfVar.b |= 1;
                                                    alpfVar.c = str4;
                                                    defpackage.almk almkVar2 = almkVar;
                                                    defpackage.allf allfVar2 = allfVar;
                                                    aigf aigfVar3 = allfVar2.b;
                                                    java.lang.String str5 = almkVar2.b;
                                                    aify aifyVar2 = aike.a;
                                                    aify aifyVar3 = (aify) aigfVar3.getOrDefault(str5, aifyVar2);
                                                    aify aifyVar4 = (aify) allfVar2.c.getOrDefault(almkVar2.c, aifyVar2);
                                                    if (!aifyVar3.isEmpty() && !aifyVar4.isEmpty()) {
                                                        j$.util.stream.Stream streamSorted = j$.util.Collection.-EL.stream(aliaVar.f.e()).filter(new defpackage.alks(java.lang.Integer.valueOf(i5), 4)).map(new defpackage.alki(5)).sorted();
                                                        j$.util.stream.Collector collector2 = aido.a;
                                                        aifyVar2 = (aify) j$.util.Collection.-EL.stream((aify) streamSorted.collect(collector2)).map(new defpackage.allm(aifyVar3, aifyVar4, 1)).flatMap(new defpackage.alki(6)).collect(collector2);
                                                    }
                                                    akzxVarM5.u();
                                                    defpackage.alpf alpfVar2 = (defpackage.alpf) akzxVarM5.b;
                                                    alat alatVar3 = alpfVar2.d;
                                                    if (!alatVar3.c()) {
                                                        alpfVar2.d = alad.J(alatVar3);
                                                    }
                                                    akyl.i(aifyVar2, alpfVar2.d);
                                                    return (defpackage.alpf) akzxVarM5.p();
                                                }
                                            }).collect(aido.a);
                                            ((akzx) obj16).u();
                                            defpackage.almn almnVar2 = (defpackage.almn) ((akzx) obj16).b;
                                            alat alatVar3 = almnVar2.d;
                                            if (!alatVar3.c()) {
                                                almnVar2.d = alad.J(alatVar3);
                                            }
                                            akyl.i(aifyVar, almnVar2.d);
                                        }
                                        akzx akzxVarM5 = defpackage.alnm.a.m();
                                        akzxVarM5.u();
                                        defpackage.alnm alnmVar = (defpackage.alnm) akzxVarM5.b;
                                        defpackage.almn almnVar3 = (defpackage.almn) akzxVarM4.p();
                                        j$.util.Objects.requireNonNull(almnVar3);
                                        alnmVar.d = almnVar3;
                                        alnmVar.c = 8;
                                        akzxVarM5.u();
                                        defpackage.alnm alnmVar2 = (defpackage.alnm) akzxVarM5.b;
                                        alnmVar2.b |= 4;
                                        alnmVar2.f = z;
                                        boolean zContains = alkrVar.h.contains(almmVar4.c);
                                        akzxVarM5.u();
                                        defpackage.alnm alnmVar3 = (defpackage.alnm) akzxVarM5.b;
                                        alnmVar3.b |= 8;
                                        alnmVar3.g = zContains;
                                        defpackage.alnm alnmVar4 = (defpackage.alnm) akzxVarM5.p();
                                        defpackage.almz almzVar8 = defpackage.almz.a;
                                        akzz akzzVarM4 = almzVar8.m();
                                        defpackage.alnb alnbVar5 = defpackage.alnb.EVENT_INTENT_EXTRACTION;
                                        akzzVarM4.u();
                                        defpackage.almz almzVar9 = akzzVarM4.b;
                                        almzVar9.c = alnbVar5.aN;
                                        almzVar9.b |= 1;
                                        akzzVarM4.bV(defpackage.alnm.i, alnmVar4);
                                        defpackage.almz almzVarP = akzzVarM4.p();
                                        if (!alnmVar4.g) {
                                            defpackage.almz almzVar10 = almyVar3.h;
                                            if (almzVar10 != null) {
                                                almzVar8 = almzVar10;
                                            }
                                            aljqVar.b(almzVar8);
                                        }
                                        if (!z || alkrVar.g) {
                                            alkrVar.c.a(almzVarP, almyVar3);
                                        }
                                        reentrantLock3.unlock();
                                        return null;
                                    } catch (java.lang.Throwable th) {
                                        alkrVar.j.unlock();
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
            };
            j$.util.Optional optionalOf = j$.util.Optional.of(new uwo(this, almyVar2, 18));
            ajwr ajwrVar = this.r;
            amacVar.e();
            amacVar.d(ajwrVar.d(callable, (java.util.concurrent.Executor) ((j$.util.Optional) amacVar.b).get()), optionalOf, ((defpackage.alpg) amacVar.a).a());
        } catch (defpackage.aljs e) {
            aimw aimwVarL = a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionProcessor", "consumeEvents", 272, "IntentExtractionProcessor.java");
            defpackage.almz almzVar2 = almyVar2.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
            if (alnbVarB == null) {
                alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
            }
            aimwVarL.y("Consuming event %s failed.", alnbVarB.name());
        }
    }

    @Override // defpackage.allg
    public final void e() {
        this.j.lock();
        try {
            this.k = true;
            defpackage.allb allbVar = this.d;
            if (allbVar != null) {
                allbVar.close();
                this.d = null;
            }
        } finally {
            this.j.unlock();
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) throws defpackage.aljs {
        this.s = new vqy(this, aihd.r(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS));
        this.e = almlVar.k;
        int i = almlVar.c;
        if (i == 14) {
            this.l = j$.util.Optional.of(i == 14 ? (defpackage.almj) almlVar.d : defpackage.almj.a);
        }
        this.n = j$.util.Optional.empty();
        if ((almlVar.b & 8192) != 0) {
            defpackage.almk almkVar = almlVar.s;
            if (almkVar == null) {
                almkVar = defpackage.almk.a;
            }
            this.n = j$.util.Optional.of(almkVar);
        }
        this.g = almlVar.t;
        this.h = aihd.o(almlVar.u);
        this.f = alln.g(alqdVar, almbVar.f, alkfVar);
        try {
            vqy vqyVarK = vqy.k(alqdVar, almbVar);
            java.lang.Object obj = vqyVarK.b;
            defpackage.aloa aloaVar = (defpackage.aloa) obj;
            this.p = aloaVar;
            this.o.c(aloaVar);
            this.j.lock();
            try {
                defpackage.allb allbVar = this.d;
                if (allbVar != null) {
                    this.k = true;
                    allbVar.close();
                    this.d = null;
                }
                try {
                    defpackage.aqam aqamVar = new defpackage.aqam(null);
                    aqamVar.a = ((defpackage.aloa) obj).c;
                    java.lang.Object obj2 = vqyVarK.a;
                    defpackage.aqan aqanVarI = vqyVarK.i(((defpackage.almb) obj2).d, aqamVar);
                    defpackage.alkx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelAccessorImpl", "create", 28, "ModelAccessorImpl.java").v("TFLite model loaded.");
                    defpackage.alkx alkxVar = new defpackage.alkx(aqanVarI);
                    aigb aigbVar = new aigb(4);
                    java.io.BufferedReader bufferedReaderB = ((alqd) vqyVarK.c).b(((defpackage.almb) obj2).e);
                    try {
                        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(bufferedReaderB.readLine());
                        int i2 = 0;
                        while (optionalOfNullable.isPresent()) {
                            int i3 = i2 + 1;
                            aigbVar.i((java.lang.String) optionalOfNullable.get(), java.lang.Integer.valueOf(i2));
                            optionalOfNullable = j$.util.Optional.ofNullable(bufferedReaderB.readLine());
                            i2 = i3;
                        }
                        bufferedReaderB.close();
                        aikj aikjVarE = aigbVar.e(true);
                        defpackage.allb.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelClient", "create", 91, "ModelClient.java").w("dict size: %d", aikjVarE.d);
                        this.d = new defpackage.allb(alkxVar, ((defpackage.aloa) obj).d, aikjVarE, (aify) j$.util.Collection.-EL.stream(aify.o(alkxVar.b.d())).filter(new defpackage.alks(obj, 5)).collect(aido.a), (defpackage.aloa) obj);
                        this.k = false;
                        this.j.unlock();
                        this.m = j$.util.Optional.empty();
                        defpackage.aloa aloaVar2 = this.p;
                        if ((aloaVar2.b & 1024) != 0) {
                            defpackage.alnz alnzVar = aloaVar2.n;
                            if (alnzVar == null) {
                                alnzVar = defpackage.alnz.a;
                            }
                            this.m = j$.util.Optional.of(alnzVar);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            bufferedReaderB.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new defpackage.aljs("Failed to load model assets.", defpackage.aljr.c, e);
                }
            } catch (java.lang.Throwable th3) {
                this.j.unlock();
                throw th3;
            }
        } catch (java.io.IOException e2) {
            throw new defpackage.aljs("Failed to load robot intent spec.", defpackage.aljr.b, e2);
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
