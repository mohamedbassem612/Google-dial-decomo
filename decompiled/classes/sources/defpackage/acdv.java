package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdv implements defpackage.acdo {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.amwu b;
    public final defpackage.aduj c;
    private final defpackage.acdk d;
    private final defpackage.ajwr e = new defpackage.ajwr();

    public acdv(defpackage.acdk acdkVar, defpackage.amwu amwuVar, defpackage.aduj adujVar) {
        this.d = acdkVar;
        this.b = amwuVar;
        this.c = adujVar;
    }

    private final defpackage.ajcq c(final defpackage.acba acbaVar, final defpackage.acdk acdkVar, final defpackage.acdl acdlVar, final boolean z) {
        final com.google.android.libraries.notifications.platform.registration.Zwieback zwieback = com.google.android.libraries.notifications.platform.registration.Zwieback.a;
        defpackage.ajas ajasVar = new defpackage.ajas() { // from class: acdu
            /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
            /* JADX WARN: Code duplicated, block: B:36:0x0106 A[LOOP:0: B:34:0x0100->B:36:0x0106, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:39:0x0166  */
            /* JADX WARN: Code duplicated, block: B:40:0x016f  */
            /* JADX WARN: Code duplicated, block: B:42:0x0179  */
            /* JADX WARN: Type inference failed for: r10v5, types: [aolr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                final defpackage.acea aceaVar;
                java.util.ArrayList arrayList;
                java.util.Iterator it;
                defpackage.adao adaoVar;
                defpackage.adai adaiVar;
                defpackage.ajcq ajcqVarB;
                defpackage.anfq anfqVar = defpackage.anfq.a;
                boolean zF = anfqVar.eZ().f();
                final defpackage.acdv acdvVar = this.a;
                final boolean z2 = z;
                final com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation = zwieback;
                final defpackage.acdl acdlVar2 = acdlVar;
                if (zF && z2) {
                    defpackage.amwu amwuVar = acdvVar.b;
                    if (!((acdj) amwuVar.a()).a(accountRepresentation).contains(acdlVar2)) {
                        return new defpackage.ajcm(new defpackage.adub(new defpackage.abzt(null)));
                    }
                    ((acdj) amwuVar.a()).b(accountRepresentation, acdlVar2);
                }
                defpackage.acba acbaVar2 = acbaVar;
                int i = acbaVar2.b;
                if (i == 1) {
                    int i2 = (i == 1 ? (defpackage.akiq) acbaVar2.c : defpackage.akiq.a).d;
                    int i3 = acbaVar2.b;
                    int i4 = (i3 == 1 ? (defpackage.akiq) acbaVar2.c : defpackage.akiq.a).c;
                    java.lang.String str = (i3 == 1 ? (defpackage.akiq) acbaVar2.c : defpackage.akiq.a).e;
                }
                int i5 = acbaVar2.b;
                if (acdlVar2 == null) {
                    defpackage.aooh.i("processingContext");
                }
                defpackage.acdk acdkVar2 = acdkVar;
                if (anfqVar.eZ().f() && z2) {
                    long epochMilli = j$.time.Instant.now().toEpochMilli() - acdlVar2.b;
                    defpackage.amwu amwuVar2 = ((defpackage.acea) acdkVar2).l;
                    ((defpackage.acal) amwuVar2.a()).u(epochMilli);
                    if (epochMilli > anfqVar.eZ().a()) {
                        ((defpackage.acal) amwuVar2.a()).t(epochMilli);
                        ajcqVarB = new defpackage.ajcm(defpackage.aokc.a);
                    } else {
                        aceaVar = (defpackage.acea) acdkVar2;
                        defpackage.ajcq ajcqVarC = ((defpackage.acgr) aceaVar.y.o(null)).c();
                        defpackage.aooh.e(ajcqVarC, "getAll(...)");
                        defpackage.aduj adujVar = aceaVar.n;
                        defpackage.ahyc ahycVarB = adujVar.b(new defpackage.kvf(17));
                        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                        int i6 = defpackage.ajan.c;
                        final defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarC, ahycVarB);
                        ajcqVarC.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
                        java.util.List listB = aceaVar.h.b();
                        arrayList = new java.util.ArrayList(listB.size());
                        it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((defpackage.acgr) aceaVar.z.o((java.lang.String) it.next())).c());
                        }
                        java.util.List listBU = defpackage.ajsz.bU(arrayList, ((defpackage.acgr) aceaVar.z.o(null)).c());
                        final defpackage.ajcq ajcqVarB2 = new defpackage.anpu(true, defpackage.aify.j(listBU)).b(adujVar.d(new defpackage.vcz(listBU, 6)), ajbmVar);
                        final defpackage.ajcq ajcqVarC2 = ((defpackage.acgr) aceaVar.A.o(null)).c();
                        adaoVar = aceaVar.x;
                        com.google.android.libraries.notifications.platform.registration.Zwieback zwieback2 = com.google.android.libraries.notifications.platform.registration.Zwieback.a;
                        if (((java.lang.Boolean) defpackage.aoov.ah(adaoVar.a, new defpackage.aegc(adaoVar, (defpackage.aoln) null, 1))).booleanValue()) {
                            adaiVar = (defpackage.adai) aceaVar.r.a();
                        } else {
                            adaiVar = (defpackage.adai) aceaVar.q.a();
                        }
                        if (adaiVar == null) {
                            defpackage.aooh.g();
                        }
                        final defpackage.ajcq ajcqVarF = defpackage.aosv.F(adaiVar.b, 0, new defpackage.aeef(adaiVar, zwieback2, (defpackage.aoln) null, 0), 3);
                        ajcqVarB = new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajamVar, ajcqVarB2, ajcqVarC2, ajcqVarF})).b(adujVar.d(new java.util.concurrent.Callable() { // from class: acdz
                            /* JADX WARN: Type inference failed for: r11v16, types: [acbd, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r11v17, types: [amwu, java.lang.Object] */
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                defpackage.aduy aduyVar;
                                defpackage.acdl acdlVar3;
                                int i7;
                                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext;
                                boolean z3;
                                java.util.Iterator it2;
                                int i8;
                                defpackage.ajcq ajcqVar = ajcqVarB2;
                                defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                                java.lang.Object objH = defpackage.a.h(ajcqVar);
                                defpackage.aooh.e(objH, "getDone(...)");
                                boolean zBooleanValue = ((java.lang.Boolean) objH).booleanValue();
                                defpackage.ajcq ajcqVar2 = ajamVar;
                                defpackage.ahvr.cc(ajcqVar2.isDone(), "Future was expected to be done: %s", ajcqVar2);
                                java.lang.Object objH2 = defpackage.a.h(ajcqVar2);
                                defpackage.aooh.e(objH2, "getDone(...)");
                                java.util.List list = (java.util.List) objH2;
                                defpackage.ajcq ajcqVar3 = ajcqVarC2;
                                defpackage.ahvr.cc(ajcqVar3.isDone(), "Future was expected to be done: %s", ajcqVar3);
                                java.util.Map map = (java.util.Map) defpackage.a.h(ajcqVar3);
                                defpackage.ajcq ajcqVar4 = ajcqVarF;
                                defpackage.ahvr.cc(ajcqVar4.isDone(), "Future was expected to be done: %s", ajcqVar4);
                                java.lang.Object objH3 = defpackage.a.h(ajcqVar4);
                                defpackage.aooh.e(objH3, "getDone(...)");
                                defpackage.adtz adtzVar = (defpackage.adtz) objH3;
                                if (map == null) {
                                    defpackage.aooh.g();
                                }
                                list.size();
                                if (adtzVar instanceof defpackage.adub) {
                                    aduyVar = (defpackage.aduy) ((defpackage.adub) adtzVar).a;
                                } else {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.acea.a.d()).k(adtzVar.f())).v("Failed to fetch GnpAccount in the TriggeringEventProcessor, not setting rtid");
                                    aduyVar = null;
                                }
                                java.lang.String str2 = aduyVar != null ? aduyVar.i : null;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                                java.util.Iterator it3 = list.iterator();
                                while (true) {
                                    acdlVar3 = acdlVar2;
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    akhl akhlVar = (akhl) it3.next();
                                    adrp adrpVarH = com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.h();
                                    adrpVarH.a = null;
                                    adrpVarH.h(akhlVar);
                                    adrpVarH.i(acdlVar3.b);
                                    adrpVarH.d = (aksc) map.get(abxl.q(akhlVar));
                                    adrpVarH.c = str2;
                                    arrayList2.add(adrpVarH.f());
                                }
                                defpackage.acea aceaVar2 = aceaVar;
                                java.util.List listA = ((defpackage.acdm) aceaVar2.t.a()).a(arrayList2);
                                defpackage.aogc aogcVar = (defpackage.aogc) aceaVar2.s.a();
                                if (listA == null) {
                                    defpackage.aooh.i("promotions");
                                }
                                defpackage.alfc alfcVarB = defpackage.anfn.a.eZ().b();
                                int i9 = 0;
                                if (!alfcVarB.b.isEmpty()) {
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    for (java.lang.Object obj : listA) {
                                        if (alfcVarB.b.contains(((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj).c().d)) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    defpackage.aoiu aoiuVar = new defpackage.aoiu(arrayList3, arrayList4);
                                    java.util.List<com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext> list2 = (java.util.List) aoiuVar.a;
                                    listA = (java.util.List) aoiuVar.b;
                                    for (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 : list2) {
                                        aogcVar.c.b(promoContext2, "Promotion is disabled by phenotype.", new java.lang.Object[0]);
                                        ((defpackage.acal) aogcVar.a.a()).e(promoContext2);
                                    }
                                    if (!list2.isEmpty()) {
                                        java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
                                        java.util.Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList5.add(abxl.q(((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) it4.next()).c()));
                                        }
                                        ((defpackage.acgr) ((defpackage.adao) aogcVar.b).o(null)).f(arrayList5);
                                    }
                                }
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                for (java.lang.Object obj2 : listA) {
                                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext3 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj2;
                                    akhl akhlVarC = promoContext3.c();
                                    java.util.Set set = aceaVar2.i;
                                    akjx akjxVar = akhlVarC.h;
                                    if (akjxVar == null) {
                                        akjxVar = akjx.a;
                                    }
                                    defpackage.akjw akjwVarB = defpackage.akjw.b(akjxVar.e);
                                    if (akjwVarB == null) {
                                        akjwVarB = defpackage.akjw.UITYPE_NONE;
                                    }
                                    if (set.contains(akjwVarB)) {
                                        arrayList6.add(obj2);
                                    } else {
                                        defpackage.acbd acbdVar = aceaVar2.o;
                                        akhq akhqVar = akhlVarC.c;
                                        if (akhqVar == null) {
                                            akhqVar = akhq.a;
                                        }
                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(akhqVar.b);
                                        akjx akjxVar2 = akhlVarC.h;
                                        if (akjxVar2 == null) {
                                            akjxVar2 = akjx.a;
                                        }
                                        defpackage.akjw akjwVarB2 = defpackage.akjw.b(akjxVar2.e);
                                        if (akjwVarB2 == null) {
                                            akjwVarB2 = defpackage.akjw.UITYPE_NONE;
                                        }
                                        acbdVar.a(promoContext3, "Promotion [%d] has an unsupported UI type [%s] for the SDK triggering flow", numValueOf, akjwVarB2.name());
                                    }
                                }
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                java.util.Iterator it5 = arrayList6.iterator();
                                while (it5.hasNext()) {
                                    java.lang.Object next = it5.next();
                                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext4 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) next;
                                    akhl akhlVarC2 = promoContext4.c();
                                    akkl akklVar = akhlVarC2.g;
                                    if (akklVar == null) {
                                        akklVar = akkl.a;
                                    }
                                    defpackage.alat alatVar = akklVar.c;
                                    defpackage.aooh.e(alatVar, "getEventList(...)");
                                    java.util.Iterator it6 = alatVar.iterator();
                                    int i10 = i9;
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            i7 = i9;
                                            i10 = -1;
                                            break;
                                        }
                                        akkk akkkVar = (akkk) it6.next();
                                        akhq akhqVar2 = akhlVarC2.c;
                                        if (akhqVar2 == null) {
                                            akhqVar2 = akhq.a;
                                        }
                                        defpackage.aooh.e(akhqVar2, "getPromoId(...)");
                                        i7 = i9;
                                        accv accvVar = new accv(akhqVar2, acdlVar3.a);
                                        java.util.Set<defpackage.accw> set2 = aceaVar2.f;
                                        if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                                            for (defpackage.accw accwVar : set2) {
                                                if (akkkVar == null) {
                                                    defpackage.aooh.g();
                                                }
                                                if (accwVar.a(akkkVar, accvVar)) {
                                                    break;
                                                }
                                            }
                                        }
                                        i10++;
                                        i9 = i7;
                                    }
                                    if (i10 < 0) {
                                        z3 = zBooleanValue;
                                        it2 = it5;
                                        i8 = i7;
                                    } else {
                                        defpackage.accu accuVar = aceaVar2.e;
                                        akkl akklVar2 = akhlVarC2.g;
                                        if (akklVar2 == null) {
                                            akklVar2 = akkl.a;
                                        }
                                        akkj akkjVar = akklVar2.d;
                                        if (akkjVar == null) {
                                            akkjVar = akkj.a;
                                        }
                                        defpackage.aooh.e(akkjVar, "getConditions(...)");
                                        akhq akhqVar3 = akhlVarC2.c;
                                        if (akhqVar3 == null) {
                                            akhqVar3 = akhq.a;
                                        }
                                        defpackage.aooh.e(akhqVar3, "getPromoId(...)");
                                        acct acctVar = new acct(akhqVar3, promoContext4, zBooleanValue);
                                        if (akkjVar == null) {
                                            defpackage.aooh.i("triggeringConditions");
                                        }
                                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                        defpackage.accy accyVar = (defpackage.accy) accuVar;
                                        java.util.Iterator it7 = accyVar.a.iterator();
                                        while (true) {
                                            promoContext = acctVar.b;
                                            if (!it7.hasNext()) {
                                                break;
                                            }
                                            defpackage.accr accrVar = (defpackage.accr) it7.next();
                                            if (!accrVar.b(akkjVar, acctVar)) {
                                                arrayList8.add(accrVar.a());
                                                defpackage.acbd acbdVar2 = accyVar.c;
                                                java.util.Iterator it8 = it5;
                                                java.lang.Object[] objArr = new java.lang.Object[1];
                                                objArr[i7] = accrVar.a().name();
                                                acbdVar2.b(promoContext, "Failed Triggering Condition for [%s]", objArr);
                                                it5 = it8;
                                                zBooleanValue = zBooleanValue;
                                            }
                                        }
                                        z3 = zBooleanValue;
                                        it2 = it5;
                                        accyVar.b.d(promoContext, arrayList8);
                                        if (arrayList8.isEmpty()) {
                                            i8 = i7;
                                            ((defpackage.acal) aceaVar2.l.a()).o(promoContext4, i10);
                                            arrayList7.add(next);
                                        } else {
                                            i8 = i7;
                                            aceaVar2.o.b(promoContext4, "Failed Triggering Conditions.", new java.lang.Object[i8]);
                                        }
                                    }
                                    i9 = i8;
                                    it5 = it2;
                                    zBooleanValue = z3;
                                }
                                return arrayList7;
                            }
                        }), ajbmVar);
                    }
                } else {
                    aceaVar = (defpackage.acea) acdkVar2;
                    defpackage.ajcq ajcqVarC3 = ((defpackage.acgr) aceaVar.y.o(null)).c();
                    defpackage.aooh.e(ajcqVarC3, "getAll(...)");
                    defpackage.aduj adujVar2 = aceaVar.n;
                    defpackage.ahyc ahycVarB2 = adujVar2.b(new defpackage.kvf(17));
                    defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                    int i7 = defpackage.ajan.c;
                    final defpackage.ajcq ajamVar2 = new defpackage.ajam(ajcqVarC3, ahycVarB2);
                    ajcqVarC3.c(ajamVar2, defpackage.aiql.t(ajbmVar2, ajamVar2));
                    java.util.List listB2 = aceaVar.h.b();
                    arrayList = new java.util.ArrayList(listB2.size());
                    it = listB2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((defpackage.acgr) aceaVar.z.o((java.lang.String) it.next())).c());
                    }
                    java.util.List listBU2 = defpackage.ajsz.bU(arrayList, ((defpackage.acgr) aceaVar.z.o(null)).c());
                    final defpackage.ajcq ajcqVarB3 = new defpackage.anpu(true, defpackage.aify.j(listBU2)).b(adujVar2.d(new defpackage.vcz(listBU2, 6)), ajbmVar2);
                    final defpackage.ajcq ajcqVarC4 = ((defpackage.acgr) aceaVar.A.o(null)).c();
                    adaoVar = aceaVar.x;
                    com.google.android.libraries.notifications.platform.registration.Zwieback zwieback3 = com.google.android.libraries.notifications.platform.registration.Zwieback.a;
                    if (((java.lang.Boolean) defpackage.aoov.ah(adaoVar.a, new defpackage.aegc(adaoVar, (defpackage.aoln) null, 1))).booleanValue()) {
                        adaiVar = (defpackage.adai) aceaVar.r.a();
                    } else {
                        adaiVar = (defpackage.adai) aceaVar.q.a();
                    }
                    if (adaiVar == null) {
                        defpackage.aooh.g();
                    }
                    final defpackage.ajcq ajcqVarF2 = defpackage.aosv.F(adaiVar.b, 0, new defpackage.aeef(adaiVar, zwieback3, (defpackage.aoln) null, 0), 3);
                    ajcqVarB = new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajamVar2, ajcqVarB3, ajcqVarC4, ajcqVarF2})).b(adujVar2.d(new java.util.concurrent.Callable() { // from class: acdz
                        /* JADX WARN: Type inference failed for: r11v16, types: [acbd, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r11v17, types: [amwu, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            defpackage.aduy aduyVar;
                            defpackage.acdl acdlVar3;
                            int i8;
                            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext;
                            boolean z3;
                            java.util.Iterator it2;
                            int i9;
                            defpackage.ajcq ajcqVar = ajcqVarB3;
                            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                            java.lang.Object objH = defpackage.a.h(ajcqVar);
                            defpackage.aooh.e(objH, "getDone(...)");
                            boolean zBooleanValue = ((java.lang.Boolean) objH).booleanValue();
                            defpackage.ajcq ajcqVar2 = ajamVar2;
                            defpackage.ahvr.cc(ajcqVar2.isDone(), "Future was expected to be done: %s", ajcqVar2);
                            java.lang.Object objH2 = defpackage.a.h(ajcqVar2);
                            defpackage.aooh.e(objH2, "getDone(...)");
                            java.util.List list = (java.util.List) objH2;
                            defpackage.ajcq ajcqVar3 = ajcqVarC4;
                            defpackage.ahvr.cc(ajcqVar3.isDone(), "Future was expected to be done: %s", ajcqVar3);
                            java.util.Map map = (java.util.Map) defpackage.a.h(ajcqVar3);
                            defpackage.ajcq ajcqVar4 = ajcqVarF2;
                            defpackage.ahvr.cc(ajcqVar4.isDone(), "Future was expected to be done: %s", ajcqVar4);
                            java.lang.Object objH3 = defpackage.a.h(ajcqVar4);
                            defpackage.aooh.e(objH3, "getDone(...)");
                            defpackage.adtz adtzVar = (defpackage.adtz) objH3;
                            if (map == null) {
                                defpackage.aooh.g();
                            }
                            list.size();
                            if (adtzVar instanceof defpackage.adub) {
                                aduyVar = (defpackage.aduy) ((defpackage.adub) adtzVar).a;
                            } else {
                                ((defpackage.aiob) ((defpackage.aiob) defpackage.acea.a.d()).k(adtzVar.f())).v("Failed to fetch GnpAccount in the TriggeringEventProcessor, not setting rtid");
                                aduyVar = null;
                            }
                            java.lang.String str2 = aduyVar != null ? aduyVar.i : null;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                            java.util.Iterator it3 = list.iterator();
                            while (true) {
                                acdlVar3 = acdlVar2;
                                if (!it3.hasNext()) {
                                    break;
                                }
                                akhl akhlVar = (akhl) it3.next();
                                adrp adrpVarH = com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.h();
                                adrpVarH.a = null;
                                adrpVarH.h(akhlVar);
                                adrpVarH.i(acdlVar3.b);
                                adrpVarH.d = (aksc) map.get(abxl.q(akhlVar));
                                adrpVarH.c = str2;
                                arrayList2.add(adrpVarH.f());
                            }
                            defpackage.acea aceaVar2 = aceaVar;
                            java.util.List listA = ((defpackage.acdm) aceaVar2.t.a()).a(arrayList2);
                            defpackage.aogc aogcVar = (defpackage.aogc) aceaVar2.s.a();
                            if (listA == null) {
                                defpackage.aooh.i("promotions");
                            }
                            defpackage.alfc alfcVarB = defpackage.anfn.a.eZ().b();
                            int i10 = 0;
                            if (!alfcVarB.b.isEmpty()) {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                for (java.lang.Object obj : listA) {
                                    if (alfcVarB.b.contains(((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj).c().d)) {
                                        arrayList3.add(obj);
                                    } else {
                                        arrayList4.add(obj);
                                    }
                                }
                                defpackage.aoiu aoiuVar = new defpackage.aoiu(arrayList3, arrayList4);
                                java.util.List<com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext> list2 = (java.util.List) aoiuVar.a;
                                listA = (java.util.List) aoiuVar.b;
                                for (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 : list2) {
                                    aogcVar.c.b(promoContext2, "Promotion is disabled by phenotype.", new java.lang.Object[0]);
                                    ((defpackage.acal) aogcVar.a.a()).e(promoContext2);
                                }
                                if (!list2.isEmpty()) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
                                    java.util.Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList5.add(abxl.q(((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) it4.next()).c()));
                                    }
                                    ((defpackage.acgr) ((defpackage.adao) aogcVar.b).o(null)).f(arrayList5);
                                }
                            }
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : listA) {
                                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext3 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj2;
                                akhl akhlVarC = promoContext3.c();
                                java.util.Set set = aceaVar2.i;
                                akjx akjxVar = akhlVarC.h;
                                if (akjxVar == null) {
                                    akjxVar = akjx.a;
                                }
                                defpackage.akjw akjwVarB = defpackage.akjw.b(akjxVar.e);
                                if (akjwVarB == null) {
                                    akjwVarB = defpackage.akjw.UITYPE_NONE;
                                }
                                if (set.contains(akjwVarB)) {
                                    arrayList6.add(obj2);
                                } else {
                                    defpackage.acbd acbdVar = aceaVar2.o;
                                    akhq akhqVar = akhlVarC.c;
                                    if (akhqVar == null) {
                                        akhqVar = akhq.a;
                                    }
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(akhqVar.b);
                                    akjx akjxVar2 = akhlVarC.h;
                                    if (akjxVar2 == null) {
                                        akjxVar2 = akjx.a;
                                    }
                                    defpackage.akjw akjwVarB2 = defpackage.akjw.b(akjxVar2.e);
                                    if (akjwVarB2 == null) {
                                        akjwVarB2 = defpackage.akjw.UITYPE_NONE;
                                    }
                                    acbdVar.a(promoContext3, "Promotion [%d] has an unsupported UI type [%s] for the SDK triggering flow", numValueOf, akjwVarB2.name());
                                }
                            }
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.util.Iterator it5 = arrayList6.iterator();
                            while (it5.hasNext()) {
                                java.lang.Object next = it5.next();
                                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext4 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) next;
                                akhl akhlVarC2 = promoContext4.c();
                                akkl akklVar = akhlVarC2.g;
                                if (akklVar == null) {
                                    akklVar = akkl.a;
                                }
                                defpackage.alat alatVar = akklVar.c;
                                defpackage.aooh.e(alatVar, "getEventList(...)");
                                java.util.Iterator it6 = alatVar.iterator();
                                int i11 = i10;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        i8 = i10;
                                        i11 = -1;
                                        break;
                                    }
                                    akkk akkkVar = (akkk) it6.next();
                                    akhq akhqVar2 = akhlVarC2.c;
                                    if (akhqVar2 == null) {
                                        akhqVar2 = akhq.a;
                                    }
                                    defpackage.aooh.e(akhqVar2, "getPromoId(...)");
                                    i8 = i10;
                                    accv accvVar = new accv(akhqVar2, acdlVar3.a);
                                    java.util.Set<defpackage.accw> set2 = aceaVar2.f;
                                    if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                                        for (defpackage.accw accwVar : set2) {
                                            if (akkkVar == null) {
                                                defpackage.aooh.g();
                                            }
                                            if (accwVar.a(akkkVar, accvVar)) {
                                                break;
                                            }
                                        }
                                    }
                                    i11++;
                                    i10 = i8;
                                }
                                if (i11 < 0) {
                                    z3 = zBooleanValue;
                                    it2 = it5;
                                    i9 = i8;
                                } else {
                                    defpackage.accu accuVar = aceaVar2.e;
                                    akkl akklVar2 = akhlVarC2.g;
                                    if (akklVar2 == null) {
                                        akklVar2 = akkl.a;
                                    }
                                    akkj akkjVar = akklVar2.d;
                                    if (akkjVar == null) {
                                        akkjVar = akkj.a;
                                    }
                                    defpackage.aooh.e(akkjVar, "getConditions(...)");
                                    akhq akhqVar3 = akhlVarC2.c;
                                    if (akhqVar3 == null) {
                                        akhqVar3 = akhq.a;
                                    }
                                    defpackage.aooh.e(akhqVar3, "getPromoId(...)");
                                    acct acctVar = new acct(akhqVar3, promoContext4, zBooleanValue);
                                    if (akkjVar == null) {
                                        defpackage.aooh.i("triggeringConditions");
                                    }
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                    defpackage.accy accyVar = (defpackage.accy) accuVar;
                                    java.util.Iterator it7 = accyVar.a.iterator();
                                    while (true) {
                                        promoContext = acctVar.b;
                                        if (!it7.hasNext()) {
                                            break;
                                        }
                                        defpackage.accr accrVar = (defpackage.accr) it7.next();
                                        if (!accrVar.b(akkjVar, acctVar)) {
                                            arrayList8.add(accrVar.a());
                                            defpackage.acbd acbdVar2 = accyVar.c;
                                            java.util.Iterator it8 = it5;
                                            java.lang.Object[] objArr = new java.lang.Object[1];
                                            objArr[i8] = accrVar.a().name();
                                            acbdVar2.b(promoContext, "Failed Triggering Condition for [%s]", objArr);
                                            it5 = it8;
                                            zBooleanValue = zBooleanValue;
                                        }
                                    }
                                    z3 = zBooleanValue;
                                    it2 = it5;
                                    accyVar.b.d(promoContext, arrayList8);
                                    if (arrayList8.isEmpty()) {
                                        i9 = i8;
                                        ((defpackage.acal) aceaVar2.l.a()).o(promoContext4, i11);
                                        arrayList7.add(next);
                                    } else {
                                        i9 = i8;
                                        aceaVar2.o.b(promoContext4, "Failed Triggering Conditions.", new java.lang.Object[i9]);
                                    }
                                }
                                i10 = i9;
                                it5 = it2;
                                zBooleanValue = z3;
                            }
                            return arrayList7;
                        }
                    }), ajbmVar2);
                }
                final defpackage.acea aceaVar2 = (defpackage.acea) acdkVar2;
                defpackage.aduj adujVar3 = aceaVar2.n;
                defpackage.ajat ajatVarC = adujVar3.c(new defpackage.ajat() { // from class: acdx
                    /* JADX WARN: Type inference failed for: r0v17, types: [aoss, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v4, types: [aoss, java.lang.Object] */
                    @Override // defpackage.ajat
                    public final defpackage.ajcq a(java.lang.Object obj) {
                        defpackage.ajcq ajcqVarF3;
                        defpackage.ajcq ajcmVar;
                        java.util.List list = (java.util.List) obj;
                        if (list == null) {
                            defpackage.aooh.i("triggeredPromotions");
                        }
                        if (list.isEmpty()) {
                            return new defpackage.ajcm(defpackage.aokc.a);
                        }
                        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                        java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
                        java.util.LinkedHashSet linkedHashSet4 = new java.util.LinkedHashSet();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            akit akitVar = ((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) it2.next()).c().f;
                            if (akitVar == null) {
                                akitVar = akit.a;
                            }
                            defpackage.alat alatVar = akitVar.b;
                            defpackage.aooh.e(alatVar, "getClauseList(...)");
                            defpackage.ajsz.bv(arrayList2, alatVar);
                        }
                        java.util.ArrayList<akis> arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            defpackage.alat alatVar2 = ((akir) it3.next()).b;
                            defpackage.aooh.e(alatVar2, "getTermList(...)");
                            defpackage.ajsz.bv(arrayList3, alatVar2);
                        }
                        for (akis akisVar : arrayList3) {
                            int i8 = akisVar.c;
                            int iAc = defpackage.a.ac(i8);
                            if (iAc == 0) {
                                throw null;
                            }
                            int i9 = iAc - 1;
                            if (i9 == 0) {
                                for (akiu akiuVar : (i8 == 2 ? (akiy) akisVar.d : akiy.a).c) {
                                    int i10 = akiuVar.b;
                                    int iX = defpackage.a.X(i10);
                                    int i11 = iX - 1;
                                    if (iX == 0) {
                                        throw null;
                                    }
                                    if (i11 == 0) {
                                        defpackage.akiq akiqVar = i10 == 1 ? (defpackage.akiq) akiuVar.c : defpackage.akiq.a;
                                        defpackage.aooh.e(akiqVar, "getClearcutEvent(...)");
                                        linkedHashSet.add(akiqVar);
                                    } else if (i11 == 1) {
                                        akkn akknVar = i10 == 2 ? (akkn) akiuVar.c : akkn.a;
                                        defpackage.aooh.e(akknVar, "getVeEvent(...)");
                                        linkedHashSet2.add(akknVar);
                                    }
                                }
                            } else if (i9 == 1) {
                                java.lang.String str2 = (i8 == 3 ? (akip) akisVar.d : akip.a).e;
                                defpackage.aooh.e(str2, "getStateId(...)");
                                linkedHashSet3.add(str2);
                            } else if (i9 == 3) {
                                defpackage.akgw akgwVarB = defpackage.akgw.b((i8 == 5 ? (akim) akisVar.d : akim.a).c);
                                if (akgwVarB == null) {
                                    akgwVarB = defpackage.akgw.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                }
                                if (abxl.w(akgwVarB)) {
                                    linkedHashSet4.add(abxl.x(akgwVarB));
                                }
                            }
                        }
                        defpackage.acea aceaVar3 = aceaVar2;
                        acdw acdwVar = new acdw(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4);
                        java.util.Set set = acdwVar.a;
                        defpackage.ajcq ajcmVar2 = set.isEmpty() ? new defpackage.ajcm(defpackage.aokd.a) : ((defpackage.acgp) aceaVar3.b.a()).f(set);
                        java.util.Set set2 = acdwVar.b;
                        defpackage.ajcq ajcmVar3 = set2.isEmpty() ? new defpackage.ajcm(defpackage.aokd.a) : ((defpackage.acgu) aceaVar3.c.a()).e(set2);
                        defpackage.acdl acdlVar3 = acdlVar2;
                        java.util.Set set3 = acdwVar.c;
                        if (set3.isEmpty()) {
                            ajcqVarF3 = new defpackage.ajcm(defpackage.aokd.a);
                        } else {
                            afpl afplVar = (afpl) aceaVar3.k.a();
                            if (acdlVar3 == null) {
                                defpackage.aooh.i("processingContext");
                            }
                            ajcqVarF3 = defpackage.aosv.F(afplVar.a, 0, new xhb(afplVar, acdlVar3, set3, (defpackage.aoln) null, 7), 3);
                        }
                        if (acdwVar.d.isEmpty()) {
                            ajcmVar = new defpackage.ajcm(defpackage.aokd.a);
                        } else {
                            defpackage.acxg acxgVar = (defpackage.acxg) ((defpackage.ahys) aceaVar3.d).a;
                            ajcmVar = defpackage.aosv.C(defpackage.aoov.am(acxgVar.b, 0, new acbt(acxgVar, (defpackage.aoln) null, 8), 3));
                        }
                        return new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcmVar2, ajcmVar3, ajcqVarF3, ajcmVar})).b(aceaVar3.n.d(new lik(aceaVar3, list, ajcmVar2, ajcmVar3, ajcqVarF3, ajcmVar, 2)), defpackage.ajbm.INSTANCE);
                    }
                });
                defpackage.ajbm ajbmVar3 = defpackage.ajbm.INSTANCE;
                int i8 = defpackage.ajan.c;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarB, ajatVarC);
                ajcqVarB.c(ajalVar, defpackage.aiql.t(ajbmVar3, ajalVar));
                defpackage.ajck ajckVarY = defpackage.ajck.w(ajalVar).y(adujVar3.c(new defpackage.vmn(acdkVar2, 11)), ajbmVar3);
                defpackage.ajal ajalVar2 = new defpackage.ajal(ajckVarY, adujVar3.c(new defpackage.ajat() { // from class: acdy
                    /* JADX WARN: Type inference failed for: r10v7, types: [aoss, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r7v18, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [aoin, java.lang.Object] */
                    @Override // defpackage.ajat
                    public final defpackage.ajcq a(java.lang.Object obj) {
                        defpackage.ajcq ajcmVar;
                        defpackage.ajcq ajcqVarW;
                        defpackage.ahyn ahynVar = (defpackage.ahyn) obj;
                        if (ahynVar == null) {
                            defpackage.aooh.i("optionalPromo");
                        }
                        if (!ahynVar.f()) {
                            return new defpackage.ajcm(new defpackage.adub(new defpackage.abzt(null)));
                        }
                        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) ahynVar.b();
                        akhl akhlVarC = promoContext.c();
                        if (akhlVarC == null) {
                            defpackage.aooh.g();
                        }
                        ajyi ajyiVarJ = akky.j(akhi.a.m());
                        akhq akhqVar = akhlVarC.c;
                        if (akhqVar == null) {
                            akhqVar = akhq.a;
                        }
                        defpackage.aooh.e(akhqVar, "getPromoId(...)");
                        ajyiVarJ.g(akhqVar);
                        akjx akjxVar = akhlVarC.h;
                        if (akjxVar == null) {
                            akjxVar = akjx.a;
                        }
                        int i9 = akjxVar.f ? 6 : 2;
                        defpackage.acdl acdlVar3 = acdlVar2;
                        defpackage.acea aceaVar3 = aceaVar2;
                        ajyiVarJ.h(i9);
                        defpackage.xtq xtqVarC = akmr.C(defpackage.alcf.a.m());
                        long j = acdlVar3.b;
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        xtqVarC.am(j / 1000);
                        ajyiVarJ.f(xtqVarC.al());
                        defpackage.albh albhVarE = ajyiVarJ.e();
                        defpackage.ajcq ajcqVarD = ((defpackage.acgr) aceaVar3.z.o(null)).d(abxl.q(akhlVarC), albhVarE);
                        defpackage.aooh.e(ajcqVarD, "put(...)");
                        akjx akjxVar2 = akhlVarC.h;
                        if (akjxVar2 == null) {
                            akjxVar2 = akjx.a;
                        }
                        defpackage.aooh.e(akjxVar2, "getUi(...)");
                        int i10 = akjxVar2.c;
                        int i11 = 8;
                        if (i10 == 2) {
                            defpackage.alat alatVar = (i10 == 2 ? (akjh) akjxVar2.d : akjh.a).g;
                            defpackage.aooh.e(alatVar, "getUserActionList(...)");
                            int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(alatVar, 10));
                            if (iAL < 16) {
                                iAL = 16;
                            }
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL);
                            for (java.lang.Object obj2 : alatVar) {
                                akjc akjcVar = (akjc) obj2;
                                afpl afplVar = (afpl) aceaVar3.m.a();
                                akik akikVar = akjcVar.c == i11 ? (akik) akjcVar.d : akik.a;
                                defpackage.aooh.e(akikVar, "getIntentTarget(...)");
                                if (akjcVar == null) {
                                    defpackage.aooh.g();
                                }
                                if (akikVar == null) {
                                    defpackage.aooh.i("intentTarget");
                                }
                                if (akjcVar == null) {
                                    defpackage.aooh.i("action");
                                }
                                linkedHashMap.put(obj2, defpackage.aosv.F(afplVar.a, 0, new xla(afplVar, akikVar, 3, akjcVar, (defpackage.aoln) null, 4), 3));
                                i11 = 8;
                            }
                            ajcmVar = new defpackage.anpu(true, defpackage.aify.j(linkedHashMap.values())).b(aceaVar3.n.d(new zpk(linkedHashMap, 5)), defpackage.ajbm.INSTANCE);
                        } else {
                            ajcmVar = new defpackage.ajcm(defpackage.aokd.a);
                        }
                        defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[3];
                        akjx akjxVar3 = akhlVarC.h;
                        if ((akjxVar3 == null ? akjx.a : akjxVar3).c == 2) {
                            afpl afplVar2 = (afpl) ((defpackage.ahys) aceaVar3.p).a.a();
                            akjx akjxVar4 = akhlVarC.h;
                            if (akjxVar4 == null) {
                                akjxVar4 = akjx.a;
                            }
                            akjh akjhVar = akjxVar4.c == 2 ? (akjh) akjxVar4.d : akjh.a;
                            defpackage.aooh.e(akjhVar, "getRatingPromptUi(...)");
                            ajcqVarW = afplVar2.w(akjhVar);
                        } else {
                            if (akjxVar3 == null) {
                                akjxVar3 = akjx.a;
                            }
                            if (akjxVar3.c == 6) {
                                afpl afplVar3 = (afpl) ((defpackage.ahys) aceaVar3.p).a.a();
                                akjx akjxVar5 = akhlVarC.h;
                                if (akjxVar5 == null) {
                                    akjxVar5 = akjx.a;
                                }
                                akjh akjhVar2 = (akjxVar5.c == 6 ? (akju) akjxVar5.d : akju.a).d;
                                if (akjhVar2 == null) {
                                    akjhVar2 = akjh.a;
                                }
                                defpackage.aooh.e(akjhVar2, "getWarmupPromptUi(...)");
                                ajcqVarW = afplVar3.w(akjhVar2);
                            } else {
                                ajcqVarW = defpackage.ajcm.a;
                            }
                        }
                        ajcqVarArr[0] = ajcqVarW;
                        ajcqVarArr[1] = ajcmVar;
                        ajcqVarArr[2] = ajcqVarD;
                        java.util.List listAsList = java.util.Arrays.asList(ajcqVarArr);
                        defpackage.aooh.e(listAsList, "asList(...)");
                        defpackage.anpu anpuVar = new defpackage.anpu(true, defpackage.aify.j(listAsList));
                        defpackage.aduj adujVar4 = aceaVar3.n;
                        java.util.concurrent.Callable callableD = adujVar4.d(new wzc(promoContext, ajcmVar, 13));
                        defpackage.ajbm ajbmVar4 = defpackage.ajbm.INSTANCE;
                        defpackage.ajcq ajcqVarB4 = anpuVar.b(callableD, ajbmVar4);
                        defpackage.ajat ajatVarC2 = adujVar4.c(new acwk(aceaVar3, 1));
                        int i12 = defpackage.ajan.c;
                        defpackage.ajal ajalVar3 = new defpackage.ajal(ajcqVarB4, ajatVarC2);
                        ajcqVarB4.c(ajalVar3, defpackage.aiql.t(ajbmVar4, ajalVar3));
                        defpackage.ajal ajalVar4 = new defpackage.ajal(ajalVar3, adujVar4.c(new wzg(aceaVar3, akhlVarC, 8, (byte[]) null)));
                        ajalVar3.c(ajalVar4, defpackage.aiql.t(ajbmVar4, ajalVar4));
                        defpackage.ajal ajalVar5 = new defpackage.ajal(ajalVar3, adujVar4.c(new zum(aceaVar3, albhVarE, akhlVarC, 5)));
                        ajalVar3.c(ajalVar5, defpackage.aiql.t(ajbmVar4, ajalVar5));
                        defpackage.ajal ajalVar6 = new defpackage.ajal(ajalVar3, adujVar4.c(new xcv(aceaVar3, 20)));
                        ajalVar3.c(ajalVar6, defpackage.aiql.t(ajbmVar4, ajalVar6));
                        return new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ajalVar4, ajalVar5, ajalVar6})).b(adujVar4.d(new zpk(ajalVar3, 6)), ajbmVar4);
                    }
                }));
                ajckVarY.c(ajalVar2, defpackage.aiql.t(ajbmVar3, ajalVar2));
                defpackage.ajck ajckVarW = defpackage.ajck.w(ajalVar2);
                defpackage.aduj adujVar4 = acdvVar.c;
                return defpackage.ajck.w(ajckVarW.x(adujVar4.b(new defpackage.ahyc() { // from class: acdt
                    @Override // defpackage.ahyc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        defpackage.adtz adtzVar = (defpackage.adtz) obj;
                        if (defpackage.anfq.a.eZ().f() && !z2 && adtzVar.i() && adtzVar.d() != null && ((defpackage.abzt) adtzVar.d()).a()) {
                            defpackage.acdl acdlVar3 = acdlVar2;
                            ((acdj) acdvVar.b.a()).b(accountRepresentation, acdlVar3);
                        }
                        return adtzVar;
                    }
                }), ajbmVar3)).x(adujVar4.b(new defpackage.kvf(15)), ajbmVar3).u(java.lang.Throwable.class, adujVar4.b(new defpackage.kvf(16)), ajbmVar3);
            }
        };
        long j = defpackage.ahqx.a;
        return this.e.e(new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.acdo
    public final void a(java.lang.String str) {
        if (defpackage.anfq.a.eZ().f()) {
            for (defpackage.acdl acdlVar : ((acdj) this.b.a()).a(defpackage.agab.bx(str))) {
                c(acdlVar.a, this.d, acdlVar, true);
            }
        }
    }

    @Override // defpackage.acdo
    public final defpackage.ajcq b(defpackage.akiq akiqVar) {
        defpackage.akzx akzxVarM = defpackage.acba.a.m();
        akzxVarM.u();
        defpackage.acba acbaVar = (defpackage.acba) akzxVarM.b;
        j$.util.Objects.requireNonNull(akiqVar);
        acbaVar.c = akiqVar;
        acbaVar.b = 1;
        defpackage.acba acbaVar2 = (defpackage.acba) akzxVarM.r();
        defpackage.acdl acdlVar = new defpackage.acdl(acbaVar2, j$.time.Instant.now().toEpochMilli());
        if (defpackage.anfq.a.eZ().f() && acbaVar2.b == 1) {
            ((acdj) this.b.a()).c();
        }
        return c(acbaVar2, this.d, acdlVar, false);
    }
}
