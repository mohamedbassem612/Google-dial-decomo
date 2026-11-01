package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tfm implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ tfm(acrw acrwVar, defpackage.aoop aoopVar, defpackage.aoot aootVar, defpackage.aonj aonjVar, int i) {
        this.$cid = i;
        this.d = acrwVar;
        this.a = aoopVar;
        this.b = aootVar;
        this.c = aonjVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aonp, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        svt svtVar;
        svt svtVarA;
        java.lang.Object next;
        abgz abgzVar;
        int i = 0;
        defpackage.baz bazVar = null;
        switch (this.$cid) {
            case 0:
                defpackage.diq diqVar = (defpackage.diq) obj;
                defpackage.aooh.f(diqVar, "$this$clearAndSetSemantics");
                defpackage.dfb.j(diqVar, (java.lang.String) this.a);
                defpackage.dji djiVar = new defpackage.dji((java.lang.String) this.b);
                defpackage.dip dipVar = defpackage.din.D;
                java.util.List listSingletonList = java.util.Collections.singletonList(djiVar);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                diqVar.a(dipVar, listSingletonList);
                if (((java.lang.Boolean) this.c).booleanValue() && !((tfi) this.d).e) {
                    defpackage.dfb.d(diqVar);
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.aooh.f((svu) obj, "it");
                defpackage.aimz aimzVar = defpackage.swa.a;
                defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "fetchAndStoreDataAsync$<anonymous>$<anonymous>", 143, "PrefetchedCallDataCache.kt");
                defpackage.swa swaVar = (defpackage.swa) this.c;
                java.lang.String str = swaVar.d;
                aimwVar.y("%s: cache miss", str);
                ((defpackage.aoop) this.b).a = true;
                defpackage.swa swaVar2 = swaVar.c;
                if (swaVar2 == null || (svtVarA = swaVar2.a((svu) this.d)) == null) {
                    java.lang.Object obj2 = this.a;
                    defpackage.apni apniVar = swaVar.g;
                    defpackage.aosy aosyVarAm = defpackage.aoov.am(swaVar.e, 0, new rka(swaVar, obj2, (defpackage.aoln) null, 19), 3);
                    apniVar.i(aosyVarAm);
                    svtVar = new svt(aosyVarAm, (j$.time.Instant) null);
                } else {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "fetchAndStoreDataAsync$<anonymous>$<anonymous>$<anonymous>", 146, "PrefetchedCallDataCache.kt")).y("%s: parent cache hit", str);
                    svtVar = new svt(svtVarA.a, (j$.time.Instant) null);
                }
                return svtVar;
            case 2:
                return defpackage.aazc.f(this.d, this.c, this.a, this.b, (defpackage.aoln) obj);
            case 3:
                defpackage.cpm cpmVar = (defpackage.cpm) obj;
                ((aooq) this.b).a = 0.0f;
                java.util.Iterator it = defpackage.ajsz.co(((defpackage.bbh) this.d).j().k).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        defpackage.baz bazVar2 = (defpackage.baz) next;
                        int i2 = bazVar2.g;
                        int i3 = bazVar2.h + i2;
                        int iIntBitsToFloat = (int) java.lang.Float.intBitsToFloat((int) (cpmVar.a >> 32));
                        if (i2 > iIntBitsToFloat || iIntBitsToFloat > i3) {
                        }
                    } else {
                        next = null;
                    }
                }
                defpackage.baz bazVar3 = (defpackage.baz) next;
                if (bazVar3 != null) {
                    this.c.b(java.lang.Integer.valueOf(bazVar3.a));
                    bazVar = bazVar3;
                }
                if (bazVar != null) {
                    ((defpackage.kaw) this.a).ar(0);
                }
                return defpackage.aojh.a;
            case 4:
                java.lang.Float f = (java.lang.Float) obj;
                f.floatValue();
                defpackage.aoop aoopVar = (defpackage.aoop) this.a;
                if (!aoopVar.a && (abgzVar = (abgz) ((defpackage.aoot) this.b).a) != null) {
                    this.c.a(abgzVar);
                    aoopVar.a = true;
                }
                this.d.a(f);
                return defpackage.aojh.a;
            case 5:
                defpackage.bar barVar = (defpackage.bar) obj;
                defpackage.aooh.f(barVar, "$this$LazyRow");
                ?? r0 = this.a;
                ?? r1 = this.c;
                barVar.b(r1.size(), r0 != 0 ? new defpackage.abku(r0, r1) : null, new defpackage.abli(r1, 1), new defpackage.cja(2039820996, true, new defpackage.afns(r1, this.d, this.b, 1)));
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bar barVar2 = (defpackage.bar) obj;
                defpackage.aooh.f(barVar2, "$this$LazyColumn");
                aokn aoknVarBu = defpackage.ajsz.bu(this.c);
                aokm aokmVar = new aokm(aoknVarBu, 0);
                while (aokmVar.hasNext()) {
                    if (aokmVar.next() instanceof abof) {
                        ?? r8 = this.b;
                        barVar2.b(((defpackage.aojj) aoknVarBu).a(), new abdu(aoknVarBu, this.a, 9, (byte[]) null), bbb.a, new defpackage.cja(642169330, true, new abop(aoknVarBu, i, (afpl) this.d, (defpackage.aonp) r8, 0)));
                        return defpackage.aojh.a;
                    }
                    i++;
                }
                i = -1;
                ?? r9 = this.b;
                barVar2.b(((defpackage.aojj) aoknVarBu).a(), new abdu(aoknVarBu, this.a, 9, (byte[]) null), bbb.a, new defpackage.cja(642169330, true, new abop(aoknVarBu, i, (afpl) this.d, (defpackage.aonp) r9, 0)));
                return defpackage.aojh.a;
            default:
                java.lang.Long l = (java.lang.Long) obj;
                long jLongValue = l.longValue();
                acrw acrwVar = (acrw) this.d;
                long j = acrwVar.c;
                if (acrwVar.b < 120) {
                    long j2 = acrwVar.d;
                    if (jLongValue == j2 || jLongValue - j2 >= j || j2 == 0) {
                        ?? r4 = this.c;
                        java.lang.Object obj3 = this.b;
                        java.lang.Object obj4 = this.a;
                        acrwVar.d = jLongValue;
                        ((defpackage.aoop) obj4).a = true;
                        ((defpackage.aoot) obj3).a = r4.a(l);
                    }
                } else {
                    ?? r5 = this.c;
                    java.lang.Object obj5 = this.b;
                    java.lang.Object obj6 = this.a;
                    acrwVar.d = jLongValue;
                    ((defpackage.aoop) obj6).a = true;
                    ((defpackage.aoot) obj5).a = r5.a(l);
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ tfm(defpackage.aoop aoopVar, defpackage.aoot aootVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, int i) {
        this.$cid = i;
        this.a = aoopVar;
        this.b = aootVar;
        this.d = aonjVar;
        this.c = aonjVar2;
    }

    public /* synthetic */ tfm(aooq aooqVar, defpackage.bbh bbhVar, defpackage.kaw kawVar, defpackage.ccp ccpVar, int i) {
        this.$cid = i;
        this.b = aooqVar;
        this.d = bbhVar;
        this.a = kawVar;
        this.c = ccpVar;
    }

    public /* synthetic */ tfm(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, tfi tfiVar, int i) {
        this.$cid = i;
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = tfiVar;
    }

    public /* synthetic */ tfm(java.util.List list, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = list;
        this.a = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ tfm(defpackage.swa swaVar, defpackage.aoop aoopVar, svu svuVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.c = swaVar;
        this.b = aoopVar;
        this.d = svuVar;
        this.a = obj;
    }

    public /* synthetic */ tfm(defpackage.tuc tucVar, java.util.List list, java.util.List list2, java.util.List list3, int i) {
        this.$cid = i;
        this.d = tucVar;
        this.c = list;
        this.a = list2;
        this.b = list3;
    }
}
