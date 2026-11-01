package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lik implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ajcq a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ lik(acea aceaVar, java.util.List list, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, int i) {
        this.$cid = i;
        this.f = aceaVar;
        this.e = list;
        this.d = ajcqVar;
        this.a = ajcqVar2;
        this.b = ajcqVar3;
        this.c = ajcqVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [acal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [acal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v19, types: [acal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.util.Iterator it;
        int i;
        boolean zA;
        int i2 = this.$cid;
        ?? r2 = 0;
        if (i2 == 0) {
            boolean z = false;
            aiql.H(this.a);
            j$.util.Optional optionalOfNullable = (j$.util.Optional) aiql.H(this.b);
            defpackage.lin linVar = (defpackage.lin) aiql.H(this.c);
            defpackage.lio lioVar = (defpackage.lio) aiql.H((java.util.concurrent.Future) this.e);
            akzx akzxVarM = defpackage.lim.a.m();
            defpackage.lio lioVar2 = defpackage.lio.VOICE_STATUS_MULTIPLE_VOICES;
            akzxVarM.u();
            ((defpackage.lim) akzxVarM.b).c = lioVar == lioVar2;
            j$.util.Optional optionalOfNullable2 = true != optionalOfNullable.isPresent() ? optionalOfNullable : j$.util.Optional.ofNullable(((akff) optionalOfNullable.get()).q);
            java.lang.Object obj = this.f;
            defpackage.lil lilVar = (defpackage.lil) this.d;
            defpackage.liq liqVarC = lilVar.c((java.lang.String) optionalOfNullable2.orElse(""), linVar, lioVar);
            akzxVarM.u();
            defpackage.lim limVar = (defpackage.lim) akzxVarM.b;
            j$.util.Objects.requireNonNull(liqVarC);
            limVar.d = liqVarC;
            limVar.b |= 1;
            defpackage.lii liiVar = (defpackage.lii) obj;
            boolean z2 = liiVar.g && linVar == defpackage.lin.MODEL_UNREADY;
            akzxVarM.u();
            ((defpackage.lim) akzxVarM.b).f = z2;
            boolean z3 = liiVar.g && linVar == defpackage.lin.NEEDS_DOWNLOAD;
            akzxVarM.u();
            ((defpackage.lim) akzxVarM.b).e = z3;
            akzx akzxVarM2 = defpackage.lii.a.m();
            alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli());
            akzxVarM2.u();
            defpackage.lii liiVar2 = (defpackage.lii) akzxVarM2.b;
            j$.util.Objects.requireNonNull(alcfVarE);
            liiVar2.d = alcfVarE;
            liiVar2.b |= 2;
            boolean z4 = lioVar != defpackage.lio.VOICE_STATUS_DOWNLOAD_COMPLETED && liiVar.f;
            akzxVarM2.u();
            ((defpackage.lii) akzxVarM2.b).f = z4;
            if (linVar != defpackage.lin.READY && linVar != defpackage.lin.UNNECESSARY && liiVar.g) {
                z = true;
            }
            akzxVarM2.u();
            ((defpackage.lii) akzxVarM2.b).g = z;
            if (linVar.equals(defpackage.lin.NEEDS_DOWNLOAD) && (liiVar.b & 4) != 0) {
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                alcf alcfVar = liiVar.e;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                if (epochMilli - aldi.b(alcfVar) < aldf.a(defpackage.lil.c)) {
                    alcf alcfVar2 = liiVar.e;
                    if (alcfVar2 == null) {
                        alcfVar2 = alcf.a;
                    }
                    akzxVarM2.u();
                    defpackage.lii liiVar3 = (defpackage.lii) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(alcfVar2);
                    liiVar3.e = alcfVar2;
                    liiVar3.b |= 4;
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(((akff) optionalOfNullable.get()).q);
                    }
                    defpackage.liq liqVarC2 = lilVar.c((java.lang.String) optionalOfNullable.orElse(""), defpackage.lin.CURRENTLY_DOWNLOADING, lioVar);
                    akzxVarM.u();
                    defpackage.lim limVar2 = (defpackage.lim) akzxVarM.b;
                    j$.util.Objects.requireNonNull(liqVarC2);
                    limVar2.d = liqVarC2;
                    limVar2.b |= 1;
                }
            }
            akzxVarM2.u();
            defpackage.lii liiVar4 = (defpackage.lii) akzxVarM2.b;
            defpackage.lim limVar3 = (defpackage.lim) akzxVarM.p();
            j$.util.Objects.requireNonNull(limVar3);
            liiVar4.c = limVar3;
            liiVar4.b |= 1;
            return (defpackage.lii) akzxVarM2.p();
        }
        if (i2 == 1) {
            defpackage.lhc lhcVarA = defpackage.lhd.a(1, (defpackage.adnw) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.d)).orElseThrow(), (defpackage.adnw) ((j$.util.Optional) aiql.H(this.a)).orElseThrow());
            lhcVarA.d(((java.lang.Boolean) ((defpackage.lev) this.f).k.a()).booleanValue());
            j$.util.Optional optional = (j$.util.Optional) aiql.H(this.b);
            if (optional == null) {
                throw new java.lang.NullPointerException("Null pauseScreeningRequest");
            }
            ?? r3 = this.e;
            ajcq ajcqVar = this.c;
            lhcVarA.c = optional;
            lhcVarA.c((j$.util.Optional) aiql.H(ajcqVar));
            j$.util.Optional optional2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) r3);
            if (optional2 == null) {
                throw new java.lang.NullPointerException("Null acceptCallRequest");
            }
            lhcVarA.d = optional2;
            return lhcVarA.a();
        }
        ?? r1 = this.e;
        aooh.c((java.lang.Object) r1);
        java.lang.Object objH = aiql.H((java.util.concurrent.Future) this.d);
        aooh.e(objH, "getDone(...)");
        java.util.Map map = (java.util.Map) objH;
        java.lang.Object objH2 = aiql.H(this.a);
        aooh.e(objH2, "getDone(...)");
        java.util.Map map2 = (java.util.Map) objH2;
        java.lang.Object objH3 = aiql.H(this.b);
        aooh.e(objH3, "getDone(...)");
        java.util.Map map3 = (java.util.Map) objH3;
        java.lang.Object objH4 = aiql.H(this.c);
        aooh.e(objH4, "getDone(...)");
        java.util.Map map4 = (java.util.Map) objH4;
        r1.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = r1.iterator();
        while (it2.hasNext()) {
            java.lang.Object obj2 = this.f;
            java.lang.Object next = it2.next();
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) next;
            akhl akhlVarC = promoContext.c();
            acea aceaVar = (acea) obj2;
            afpl afplVar = (afpl) aceaVar.g.a();
            akit akitVar = akhlVarC.f;
            if (akitVar == null) {
                akitVar = akit.a;
            }
            akit akitVar2 = akitVar;
            aooh.e(akitVar2, "getTargeting(...)");
            akhq akhqVar = akhlVarC.c;
            if (akhqVar == null) {
                akhqVar = akhq.a;
            }
            aooh.e(akhqVar, "getPromoId(...)");
            accs accsVar = new accs(akhqVar, promoContext, map, map2, map3, map4);
            aooh.f(akitVar2, "clientSideTargetingRule");
            alat alatVar = akitVar2.b;
            aooh.e(alatVar, "getClauseList(...)");
            if (alatVar.isEmpty()) {
                afplVar.b.n(accsVar.a, (boolean) r2, aoke.a);
                it = it2;
                i = r2 == true ? 1 : 0;
            } else {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.util.Iterator it3 = alatVar.iterator();
                ?? r4 = r2;
                while (true) {
                    if (it3.hasNext()) {
                        akir akirVar = (akir) it3.next();
                        vqy vqyVar = (vqy) afplVar.a.a();
                        aooh.c(akirVar);
                        it = it2;
                        aooh.f(akirVar, "targetingClause");
                        alat alatVar2 = akirVar.b;
                        aooh.e(alatVar2, "getTermList(...)");
                        if (!(alatVar2 instanceof java.util.Collection) || !alatVar2.isEmpty()) {
                            java.util.Iterator it4 = alatVar2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    akis akisVar = (akis) it4.next();
                                    java.util.Iterator it5 = it4;
                                    int iAc = a.ac(akisVar.c);
                                    if (iAc == 0) {
                                        throw null;
                                    }
                                    int i3 = iAc - 1;
                                    java.util.Iterator it6 = it3;
                                    if (i3 == 0) {
                                        defpackage.acdf acdfVar = (defpackage.acdf) vqyVar.a.a();
                                        aooh.c(akisVar);
                                        zA = acdfVar.a(akisVar, accsVar, linkedHashSet);
                                    } else if (i3 == 1) {
                                        defpackage.acdf acdfVar2 = (defpackage.acdf) vqyVar.c.a();
                                        aooh.c(akisVar);
                                        zA = acdfVar2.a(akisVar, accsVar, linkedHashSet);
                                    } else if (i3 != 3) {
                                        linkedHashSet.add(akvm.c);
                                        zA = false;
                                    } else {
                                        defpackage.acdf acdfVar3 = (defpackage.acdf) vqyVar.b.a();
                                        aooh.c(akisVar);
                                        zA = acdfVar3.a(akisVar, accsVar, linkedHashSet);
                                    }
                                    if (zA) {
                                        it4 = it5;
                                        it3 = it6;
                                    } else {
                                        it2 = it;
                                        it3 = it6;
                                        r4 = 0;
                                    }
                                }
                            }
                        }
                        i = 0;
                        afplVar.b.n(accsVar.a, false, aoke.a);
                    } else {
                        it = it2;
                        i = r4;
                        afplVar.b.n(accsVar.a, true, ajsz.cf(linkedHashSet));
                        aceaVar.o.b(promoContext, "Failed Targeting.", new java.lang.Object[i]);
                    }
                    r2 = i;
                    it2 = it;
                }
            }
            arrayList.add(next);
            r2 = i;
            it2 = it;
        }
        return arrayList;
    }

    public /* synthetic */ lik(defpackage.lev levVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, ajcq ajcqVar5, int i) {
        this.$cid = i;
        this.f = levVar;
        this.d = ajcqVar;
        this.a = ajcqVar2;
        this.b = ajcqVar3;
        this.c = ajcqVar4;
        this.e = ajcqVar5;
    }

    public /* synthetic */ lik(defpackage.lil lilVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, defpackage.lii liiVar, int i) {
        this.$cid = i;
        this.d = lilVar;
        this.a = ajcqVar;
        this.b = ajcqVar2;
        this.c = ajcqVar3;
        this.e = ajcqVar4;
        this.f = liiVar;
    }
}
