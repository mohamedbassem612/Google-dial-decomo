package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alkh implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ alkh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0480  */
    /* JADX WARN: Code duplicated, block: B:181:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0486  */
    /* JADX WARN: Code duplicated, block: B:209:0x048a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Type inference failed for: r10v46, types: [allj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.almz almzVar;
        alrb alrbVar;
        defpackage.amdb amdbVar;
        alra alraVar;
        defpackage.amdb amdbVar2;
        int i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.alkj alkjVar = (defpackage.alkj) obj;
                java.lang.Object obj2 = this.a;
                defpackage.alkk alkkVar = (defpackage.alkk) obj2;
                java.util.List list = alkkVar.b.a;
                java.util.ListIterator listIterator = list.listIterator(list.size());
                char c = 1;
                while (listIterator.hasPrevious()) {
                    defpackage.almz almzVar2 = (defpackage.almz) listIterator.previous();
                    defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
                    if (alnbVarB == null) {
                        alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                    }
                    if (alnbVarB.equals(defpackage.alnb.EVENT_ASR_RESULT)) {
                        apdi apdiVar = defpackage.alnj.f;
                        almzVar2.c(apdiVar);
                        java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
                        if (objJ == null) {
                            objJ = apdiVar.b;
                        } else {
                            apdiVar.c(objJ);
                        }
                        alqu alquVar = ((defpackage.alnj) objJ).c;
                        if (alquVar == null) {
                            alquVar = alqu.a;
                        }
                        int i2 = alquVar.c;
                        if (i2 != 1) {
                            if (i2 == 2 && !defpackage.alph.c(alquVar)) {
                                if (c == 1) {
                                    c = 2;
                                } else {
                                    c = 3;
                                }
                            }
                        }
                        if (!alkkVar.f.equals(alkjVar.a.f)) {
                            alkkVar.h(alkjVar, true);
                        } else if (c == 3) {
                            alkkVar.h(alkjVar, false);
                        } else {
                            try {
                                ((defpackage.alkk) obj2).e = ((defpackage.alkk) obj2).g.c(new defpackage.alkh(obj2, i), alkjVar, ((defpackage.alkk) obj2).d);
                            } catch (defpackage.aljs e) {
                                a.by(defpackage.alkk.a.c(), "Setting a timer to publish a possibly incomplete IntentExtraction event failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/FlowSignalsProcessor", "resolveCompletenessAndPublishFlowSignalEvent", (char) 519, "FlowSignalsProcessor.java", e);
                                return;
                            }
                        }
                        break;
                    }
                }
                if (!alkkVar.f.equals(alkjVar.a.f)) {
                    alkkVar.h(alkjVar, true);
                } else if (c == 3) {
                    ((defpackage.alkk) obj2).e = ((defpackage.alkk) obj2).g.c(new defpackage.alkh(obj2, i), alkjVar, ((defpackage.alkk) obj2).d);
                } else {
                    alkkVar.h(alkjVar, false);
                }
                break;
            case 1:
                defpackage.alqw alqwVar = (defpackage.alqw) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.alql alqlVar = (defpackage.alql) akzxVar.b;
                defpackage.alql alqlVar2 = defpackage.alql.a;
                j$.util.Objects.requireNonNull(alqwVar);
                alat alatVar = alqlVar.b;
                if (!alatVar.c()) {
                    alqlVar.b = alad.J(alatVar);
                }
                alqlVar.b.add(alqwVar);
                break;
            case 2:
                ((defpackage.alkk) this.a).c((defpackage.alkj) obj);
                break;
            case 3:
                ((defpackage.alkv) this.a).h((defpackage.alpm) obj);
                break;
            case 4:
                defpackage.alsf alsfVar = (defpackage.alsf) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.alsg alsgVar = (defpackage.alsg) akzxVar2.b;
                defpackage.alsg alsgVar2 = defpackage.alsg.a;
                j$.util.Objects.requireNonNull(alsfVar);
                alat alatVar2 = alsgVar.b;
                if (!alatVar2.c()) {
                    alsgVar.b = alad.J(alatVar2);
                }
                alsgVar.b.add(alsfVar);
                break;
            case 5:
                ((defpackage.alqf) this.a).a((java.lang.String) obj);
                break;
            case 6:
                defpackage.allw allwVar = (defpackage.allw) obj;
                defpackage.allx allxVar = (defpackage.allx) this.a;
                if (allxVar.c) {
                    allxVar.c(new defpackage.allw(allwVar.a.plus(allxVar.e), false, allwVar.c), defpackage.allx.a);
                } else if (allwVar.b && allxVar.d) {
                    allxVar.c(new defpackage.allw(allwVar.a.plus(allxVar.e), false, allwVar.c), allxVar.e);
                } else {
                    defpackage.allj alljVar = allxVar.b;
                    if (allwVar.c - 1 != 1) {
                        akzz akzzVarM = defpackage.almz.a.m();
                        defpackage.alnb alnbVar = defpackage.alnb.EVENT_TIMEOUT;
                        akzzVarM.u();
                        defpackage.almz almzVar3 = akzzVarM.b;
                        almzVar3.c = alnbVar.aN;
                        almzVar3.b |= 1;
                        apdi apdiVar2 = defpackage.alpc.d;
                        akzx akzxVarM = defpackage.alpc.a.m();
                        akzm akzmVarDH = ajsz.dH(allwVar.a);
                        akzxVarM.u();
                        defpackage.alpc alpcVar = (defpackage.alpc) akzxVarM.b;
                        j$.util.Objects.requireNonNull(akzmVarDH);
                        alpcVar.c = akzmVarDH;
                        alpcVar.b |= 1;
                        akzzVarM.bV(apdiVar2, (defpackage.alpc) akzxVarM.p());
                        almzVar = (defpackage.almz) akzzVarM.p();
                    } else {
                        akzz akzzVarM2 = defpackage.almz.a.m();
                        defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_TIMEOUT_AFTER_HUMAN_SPEECH;
                        akzzVarM2.u();
                        defpackage.almz almzVar4 = akzzVarM2.b;
                        almzVar4.c = alnbVar2.aN;
                        almzVar4.b |= 1;
                        apdi apdiVar3 = defpackage.alpb.d;
                        akzx akzxVarM2 = defpackage.alpb.a.m();
                        akzm akzmVarDH2 = ajsz.dH(allwVar.a);
                        akzxVarM2.u();
                        defpackage.alpb alpbVar = (defpackage.alpb) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(akzmVarDH2);
                        alpbVar.c = akzmVarDH2;
                        alpbVar.b |= 1;
                        akzzVarM2.bV(apdiVar3, (defpackage.alpb) akzxVarM2.p());
                        almzVar = (defpackage.almz) akzzVarM2.p();
                    }
                    alljVar.b(almzVar);
                }
                break;
            case 7:
                ((akzx) this.a).bO(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                ((akzx) this.a).bN(((java.lang.Float) obj).floatValue());
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                int i3 = defpackage.alpr.a;
                akzc akzcVarW = akzc.w((java.lang.String) obj);
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.aqag aqagVar = (defpackage.aqag) akzxVar3.b;
                defpackage.aqag aqagVar2 = defpackage.aqag.a;
                j$.util.Objects.requireNonNull(akzcVarW);
                alat alatVar3 = aqagVar.g;
                if (!alatVar3.c()) {
                    aqagVar.g = alad.J(alatVar3);
                }
                aqagVar.g.add(akzcVarW);
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.alvq alvqVar = (defpackage.alvq) this.a;
                alvqVar.e.v(alvqVar.a(defpackage.alwk.HOLD_TIMEOUT_TRIGGER, "CustomerNotReachedBailout", defpackage.alsz.BOT), (defpackage.almy) obj);
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                ((defpackage.alqf) this.a).a((java.lang.String) obj);
                break;
            case 12:
                defpackage.alvx alvxVar = (defpackage.alvx) this.a;
                alvxVar.a.v(alvxVar.b(defpackage.alyl.MESSAGE_TOO_LONG_TRIGGER, "AcknowledgeAndGoodbye", defpackage.alsz.BOT), (defpackage.almy) obj);
                break;
            case 13:
                defpackage.alwq alwqVar = (defpackage.alwq) obj;
                aifl aiflVar = defpackage.alzb.a;
                java.lang.String lowerCase = alwqVar.equals(defpackage.alwq.TYPE_HIDDEN_NUMBER) ? "hidden" : alwqVar.name().substring(5).toLowerCase(java.util.Locale.ROOT);
                java.lang.Object obj3 = this.a;
                akzx akzxVarM3 = defpackage.alxp.a.m();
                akzxVarM3.u();
                defpackage.alxp alxpVar = (defpackage.alxp) akzxVarM3.b;
                alxpVar.c = alwqVar.i;
                alxpVar.b |= 1;
                akzxVarM3.u();
                defpackage.alxp alxpVar2 = (defpackage.alxp) akzxVarM3.b;
                j$.util.Objects.requireNonNull(lowerCase);
                alxpVar2.b |= 2;
                alxpVar2.d = lowerCase;
                defpackage.alxp alxpVar3 = (defpackage.alxp) akzxVarM3.p();
                akzx akzxVar4 = (akzx) obj3;
                akzxVar4.u();
                defpackage.alxu alxuVar = (defpackage.alxu) akzxVar4.b;
                defpackage.alxu alxuVar2 = defpackage.alxu.a;
                j$.util.Objects.requireNonNull(alxpVar3);
                alat alatVar4 = alxuVar.k;
                if (!alatVar4.c()) {
                    alxuVar.k = alad.J(alatVar4);
                }
                alxuVar.k.add(alxpVar3);
                break;
            case 14:
                this.a.b((defpackage.almz) obj);
                break;
            case 15:
                ((defpackage.amcm) this.a).u((defpackage.amce) obj);
                break;
            case 16:
                defpackage.almy almyVar = (defpackage.almy) obj;
                defpackage.almz almzVar5 = almyVar.h;
                if (almzVar5 == null) {
                    almzVar5 = defpackage.almz.a;
                }
                apdi apdiVar4 = defpackage.alnj.f;
                almzVar5.c(apdiVar4);
                java.lang.Object objJ2 = ((alaa) almzVar5).n.j((alac) apdiVar4.a);
                if (objJ2 == null) {
                    objJ2 = apdiVar4.b;
                } else {
                    apdiVar4.c(objJ2);
                }
                alqu alquVar2 = ((defpackage.alnj) objJ2).c;
                if (alquVar2 == null) {
                    alquVar2 = alqu.a;
                }
                defpackage.alqm alqmVar = alquVar2.c == 1 ? (defpackage.alqm) alquVar2.d : defpackage.alqm.a;
                java.lang.Object obj4 = this.a;
                if (alqmVar.b.size() <= 0) {
                    if (alquVar2.c == 2) {
                        defpackage.amcq amcqVar = ((defpackage.amcz) obj4).b;
                        if (!amcqVar.b.isEmpty()) {
                            alcf alcfVar = almyVar.c;
                            if (alcfVar == null) {
                                alcfVar = alcf.a;
                            }
                            if (j$.time.Duration.between(ajsz.dK((alcf) amcqVar.b.get()), ajsz.dK(alcfVar)).compareTo(ajsz.dJ(defpackage.amcq.a)) < 0) {
                            }
                        }
                        alcf alcfVar2 = almyVar.c;
                        if (alcfVar2 == null) {
                            alcfVar2 = alcf.a;
                        }
                        amcqVar.b = j$.util.Optional.of(alcfVar2);
                    }
                }
                ((defpackage.amcz) obj4).g(almyVar);
                break;
            case 17:
                defpackage.almy almyVar2 = (defpackage.almy) obj;
                defpackage.almz almzVar6 = almyVar2.h;
                if (almzVar6 == null) {
                    almzVar6 = defpackage.almz.a;
                }
                apdi apdiVar5 = defpackage.almu.b;
                almzVar6.c(apdiVar5);
                java.lang.Object objJ3 = ((alaa) almzVar6).n.j((alac) apdiVar5.a);
                if (objJ3 == null) {
                    objJ3 = apdiVar5.b;
                } else {
                    apdiVar5.c(objJ3);
                }
                alrc alrcVar = (alrc) objJ3;
                defpackage.amcz amczVar = (defpackage.amcz) this.a;
                if (!amczVar.d.isPresent()) {
                    defpackage.aljs aljsVar = new defpackage.aljs("Error while checking DaredevilStateTracker.", defpackage.aljr.g);
                    amczVar.f.a(aljsVar, "Error while checking DaredevilStateTracker.", "logDaredevilEventIfNecessary", aljsVar.a);
                } else {
                    java.lang.Object obj5 = amczVar.d.get();
                    java.util.Iterator it = alrcVar.e.iterator();
                    do {
                        if (it.hasNext()) {
                            alraVar = (alra) it.next();
                            alrbVar = alrb.b;
                            amdbVar2 = (defpackage.amdb) obj5;
                            if (!amdbVar2.a(alraVar, alrbVar)) {
                                alrbVar = alrb.c;
                                if (!amdbVar2.a(alraVar, alrbVar)) {
                                    alrbVar = alrb.e;
                                    if (!amdbVar2.a(alraVar, alrbVar)) {
                                        alrbVar = alrb.d;
                                    }
                                }
                            }
                        } else {
                            alrbVar = alrb.a;
                        }
                        amdbVar = (defpackage.amdb) obj5;
                        if (!amdbVar.a.equals(alrbVar)) {
                            amdbVar.a = alrbVar;
                            amczVar.g(almyVar2);
                        }
                        break;
                    } while (!amdbVar2.a(alraVar, alrbVar));
                    amdbVar = (defpackage.amdb) obj5;
                    if (!amdbVar.a.equals(alrbVar)) {
                        amdbVar.a = alrbVar;
                        amczVar.g(almyVar2);
                    }
                }
                break;
            case 18:
                defpackage.almy almyVar3 = (defpackage.almy) obj;
                defpackage.almz almzVar7 = almyVar3.h;
                if (almzVar7 == null) {
                    almzVar7 = defpackage.almz.a;
                }
                apdi apdiVar6 = defpackage.almr.b;
                almzVar7.c(apdiVar6);
                java.lang.Object objJ4 = ((alaa) almzVar7).n.j((alac) apdiVar6.a);
                if (objJ4 == null) {
                    objJ4 = apdiVar6.b;
                } else {
                    apdiVar6.c(objJ4);
                }
                defpackage.amgq amgqVar = (defpackage.amgq) objJ4;
                defpackage.amfv amfvVar = amgqVar.e;
                if (amfvVar == null) {
                    amfvVar = defpackage.amfv.a;
                }
                defpackage.amfu amfuVar = amfvVar.c;
                if (amfuVar == null) {
                    amfuVar = defpackage.amfu.a;
                }
                alcf alcfVar3 = almyVar3.c;
                if (alcfVar3 == null) {
                    alcfVar3 = alcf.a;
                }
                java.lang.Object obj6 = this.a;
                boolean z = amgqVar.f;
                defpackage.amcz amczVar2 = (defpackage.amcz) obj6;
                defpackage.amcy amcyVar = amczVar2.c;
                if (!z && !amcyVar.b.isEmpty() && amfuVar.b.size() == amcyVar.d && defpackage.amcy.a(amfuVar).equals(amcyVar.c)) {
                    if (j$.time.Duration.between(ajsz.dK((alcf) amcyVar.b.get()), ajsz.dK(alcfVar3)).compareTo(ajsz.dJ(defpackage.amcy.a)) < 0) {
                    }
                }
                amcyVar.d = amfuVar.b.size();
                amcyVar.c = defpackage.amcy.a(amfuVar);
                amcyVar.b = j$.util.Optional.of(alcfVar3);
                amczVar2.g(almyVar3);
                break;
            case 19:
                ((defpackage.amcz) this.a).g(defpackage.amcz.f((defpackage.almy) obj));
                break;
            default:
                aike aikeVarH = ((aift) obj).h();
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                aift aiftVar = new aift(4);
                while (i < aikeVarH.d) {
                    defpackage.amce amceVar = (defpackage.amce) aikeVarH.get(i);
                    if (!amceVar.l()) {
                        defpackage.amft amftVar = amceVar.b;
                        int i4 = amftVar.c;
                        j$.util.Optional optionalOf = i4 == 2 ? j$.util.Optional.of((i4 == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).c) : j$.util.Optional.empty();
                        if (!optionalOf.isEmpty()) {
                            if (linkedHashSet.contains(optionalOf.get()) && i > 0) {
                                aiftVar.i(java.lang.Integer.valueOf(i - 1));
                                linkedHashSet = new java.util.LinkedHashSet();
                            }
                            linkedHashSet.add(optionalOf.get());
                        }
                    }
                    i++;
                }
                ((aift) this.a).k(defpackage.amjk.h(aikeVarH, aiftVar.h()));
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
