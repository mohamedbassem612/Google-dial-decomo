package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ghv extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(aoln aolnVar, aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((ggv) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((defpackage.igh) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((ixh) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((ixh) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((sfd) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((twk) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((achs) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((achw) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aegw) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aegw) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v3, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        boolean zN;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ggv ggvVar = (ggv) this.b;
                aooh.d(ggvVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.a.a(ggvVar.b());
            case 1:
                aoss aossVar = (aoss) this.b;
                aooc.af(obj);
                this.a.a(aossVar);
                return aojh.a;
            case 2:
                aooc.af(obj);
                return new aoiu(this.a, (defpackage.igh) this.b);
            case 3:
                aooc.af(obj);
                ixh ixhVar = (ixh) this.b;
                int size = ixhVar.e.size();
                alat alatVar = ixhVar.e;
                aooh.e(alatVar, "getBeeslyGreetingsList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = alatVar.iterator();
                while (true) {
                    java.lang.Object obj2 = this.a;
                    if (!it.hasNext()) {
                        if (arrayList.size() < size) {
                            ixt.b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "deleteCustomGreeting$<anonymous>", 111, "BeeslyGreetingsDataService.kt").y("Deleting custom greeting with id: %s", obj2);
                        } else {
                            ixt.b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "deleteCustomGreeting$<anonymous>", 113, "BeeslyGreetingsDataService.kt").y("Delete failed: greeting with id: %s not found", obj2);
                        }
                        defpackage.her herVarM = defpackage.hhb.m(ixhVar.p());
                        herVarM.n();
                        herVarM.m();
                        herVarM.n();
                        herVarM.k(arrayList);
                        if (aooh.n(ixhVar.d, obj2)) {
                            ixt.b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "deleteCustomGreeting$<anonymous>$<anonymous>", 121, "BeeslyGreetingsDataService.kt").v("Cleared selected greeting ID as it was deleted.");
                            akzx akzxVar = (akzx) herVarM.a;
                            akzxVar.u();
                            ixh ixhVar2 = akzxVar.b;
                            ixhVar2.b &= -2;
                            ixhVar2.d = ixh.a.d;
                        }
                        return herVarM.h();
                    }
                    java.lang.Object next = it.next();
                    defpackage.ixd ixdVar = (defpackage.ixd) next;
                    int i = ixdVar.b;
                    if (defpackage.ixc.a(i) == defpackage.ixc.b) {
                        if (!aooh.n((i == 2 ? (defpackage.ixf) ixdVar.c : defpackage.ixf.a).b, obj2)) {
                        }
                    }
                    arrayList.add(next);
                }
                break;
            case 4:
                aooc.af(obj);
                ixh ixhVar3 = (ixh) this.b;
                alat alatVar2 = ixhVar3.e;
                aooh.e(alatVar2, "getBeeslyGreetingsList(...)");
                java.util.List listCb = ajsz.cb(alatVar2);
                for (java.lang.Object obj3 : listCb) {
                    java.lang.Object obj4 = this.a;
                    defpackage.ixd ixdVar2 = (defpackage.ixd) obj3;
                    int iOrdinal = defpackage.ixc.a(ixdVar2.b).ordinal();
                    if (iOrdinal == 0) {
                        zN = aooh.n((ixdVar2.b == 1 ? (defpackage.ixe) ixdVar2.c : defpackage.ixe.a).b, obj4);
                    } else if (iOrdinal != 1) {
                        zN = false;
                    } else {
                        zN = aooh.n((ixdVar2.b == 2 ? (defpackage.ixf) ixdVar2.c : defpackage.ixf.a).b, obj4);
                    }
                    if (zN) {
                        defpackage.ixd ixdVar3 = (defpackage.ixd) obj3;
                        listCb.remove(ixdVar3);
                        listCb.add(0, ixdVar3);
                        defpackage.her herVarM2 = defpackage.hhb.m(ixhVar3.p());
                        herVarM2.n();
                        herVarM2.m();
                        herVarM2.n();
                        herVarM2.k(listCb);
                        return herVarM2.h();
                    }
                }
                obj3 = null;
                defpackage.ixd ixdVar4 = (defpackage.ixd) obj3;
                listCb.remove(ixdVar4);
                listCb.add(0, ixdVar4);
                defpackage.her herVarM3 = defpackage.hhb.m(ixhVar3.p());
                herVarM3.n();
                herVarM3.m();
                herVarM3.n();
                herVarM3.k(listCb);
                return herVarM3.h();
            case 5:
                aooc.af(obj);
                ryg rygVarK = snl.K(((sfd) this.b).p());
                java.lang.Object obj5 = this.a;
                aooh.f(obj5, "value");
                akzx akzxVar2 = (akzx) rygVarK.a;
                akzxVar2.u();
                sfd sfdVar = akzxVar2.b;
                j$.util.Objects.requireNonNull(obj5);
                sfdVar.b |= 1;
                sfdVar.c = (java.lang.String) obj5;
                return rygVarK.a();
            case 6:
                aooc.af(obj);
                twk twkVar = (twk) this.b;
                uzx uzxVarCh = wsc.ch(twk.a.m());
                uzxVarCh.B();
                ?? r10 = this.a;
                aooh.f((java.lang.Object) r10, "map");
                akzx akzxVar3 = (akzx) uzxVarCh.a;
                akzxVar3.u();
                akzxVar3.b.b().putAll(r10);
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(twkVar.b);
                aooh.e(mapUnmodifiableMap, "getLanguageCodeToLanguagePackInfoMap(...)");
                for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    tvz tvzVar = (tvz) entry.getValue();
                    if (!r10.containsKey(str)) {
                        uzxVarCh.B();
                        aooh.c(str);
                        vqu vquVarCr = wsc.cr(tvz.a.m());
                        vquVarCr.W(tvy.d);
                        java.lang.String str2 = tvzVar.e;
                        aooh.e(str2, "getLanguageCode(...)");
                        vquVarCr.X(str2);
                        uzxVarCh.A(str, vquVarCr.V());
                    }
                }
                return uzxVarCh.z();
            case 7:
                aooc.af(obj);
                akzx akzxVarP = ((achs) this.b).p();
                aooh.f(akzxVarP, "builder");
                abxl.o(akzxVarP);
                alcv alcvVarO = abxl.o(akzxVarP);
                java.lang.Object obj6 = this.a;
                java.lang.Integer num = (java.lang.Integer) alcvVarO.get(obj6);
                int iIntValue = num != null ? num.intValue() : 0;
                j$.util.Objects.requireNonNull(obj6);
                akzxVarP.u();
                achs achsVar = akzxVarP.b;
                albe albeVar = achsVar.b;
                if (!albeVar.b) {
                    achsVar.b = albeVar.a();
                }
                achsVar.b.put(obj6, java.lang.Integer.valueOf(iIntValue + 1));
                achs achsVarP = akzxVarP.p();
                aooh.e(achsVarP, "build(...)");
                return achsVarP;
            case 8:
                aooc.af(obj);
                adae adaeVarY = abrz.y(((achw) this.b).p());
                java.lang.Object obj7 = this.a;
                aooh.f(obj7, "value");
                akzx akzxVar4 = (akzx) adaeVarY.a;
                akzxVar4.u();
                achw achwVar = akzxVar4.b;
                j$.util.Objects.requireNonNull(obj7);
                achwVar.b |= 8;
                achwVar.f = (java.lang.String) obj7;
                return adaeVarY.B();
            case 9:
                aooc.af(obj);
                tvn tvnVarBS = agab.bS(((aegw) this.b).p());
                tvnVarBS.A((java.lang.String) ((aoot) this.a).a);
                return tvnVarBS.z();
            case 10:
                aooc.af(obj);
                tvn tvnVarBS2 = agab.bS(((aegw) this.b).p());
                tvnVarBS2.B((java.lang.String) this.a);
                return tvnVarBS2.z();
            default:
                aooc.af(obj);
                ahrc.k((java.lang.Throwable) this.a);
                return aojh.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aosy, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.ghv ghvVar = new defpackage.ghv(aolnVar, (aonj) this.a, 0);
                ghvVar.b = obj;
                return ghvVar;
            case 1:
                defpackage.ghv ghvVar2 = new defpackage.ghv((aonj) this.a, aolnVar, 1);
                ghvVar2.b = obj;
                return ghvVar2;
            case 2:
                defpackage.ghv ghvVar3 = new defpackage.ghv((aosy) this.a, aolnVar, 2);
                ghvVar3.b = obj;
                return ghvVar3;
            case 3:
                defpackage.ghv ghvVar4 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 3);
                ghvVar4.b = obj;
                return ghvVar4;
            case 4:
                defpackage.ghv ghvVar5 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 4, (byte[]) null);
                ghvVar5.b = obj;
                return ghvVar5;
            case 5:
                defpackage.ghv ghvVar6 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 5, (char[]) null);
                ghvVar6.b = obj;
                return ghvVar6;
            case 6:
                defpackage.ghv ghvVar7 = new defpackage.ghv((java.util.Map) this.a, aolnVar, 6);
                ghvVar7.b = obj;
                return ghvVar7;
            case 7:
                defpackage.ghv ghvVar8 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 7, (short[]) null);
                ghvVar8.b = obj;
                return ghvVar8;
            case 8:
                defpackage.ghv ghvVar9 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 8, (int[]) null);
                ghvVar9.b = obj;
                return ghvVar9;
            case 9:
                defpackage.ghv ghvVar10 = new defpackage.ghv((aoot) this.a, aolnVar, 9);
                ghvVar10.b = obj;
                return ghvVar10;
            case 10:
                defpackage.ghv ghvVar11 = new defpackage.ghv((java.lang.String) this.a, aolnVar, 10, (boolean[]) null);
                ghvVar11.b = obj;
                return ghvVar11;
            default:
                defpackage.ghv ghvVar12 = new defpackage.ghv(aolnVar, (java.lang.Throwable) this.a, 11);
                ghvVar12.b = obj;
                return ghvVar12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(aoln aolnVar, java.lang.Throwable th, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(aoot aootVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aootVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(aosy aosyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aosyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.lang.String str, aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(java.util.Map map, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = map;
    }
}
