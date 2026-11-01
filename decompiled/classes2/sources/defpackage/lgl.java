package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lgl implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ lgl(afgn afgnVar, int i, java.util.List list, int i2) {
        this.$cid = i2;
        this.b = afgnVar;
        this.a = i;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public final ajcq a(java.lang.Object obj) {
        java.util.Set set;
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.lgn) this.b).a(this.c, this.a + 1);
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVarM = defpackage.jtx.a.m();
                akzxVarM.u();
                defpackage.jtx jtxVar = (defpackage.jtx) akzxVarM.b;
                jtxVar.b |= 2;
                jtxVar.d = zBooleanValue;
                defpackage.jrz jrzVar = (defpackage.jrz) this.b;
                alcf alcfVarE = aldi.e(jrzVar.e);
                akzxVarM.u();
                defpackage.jtx jtxVar2 = (defpackage.jtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                jtxVar2.c = alcfVarE;
                jtxVar2.b |= 1;
                defpackage.hkd hkdVar = jrzVar.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                java.lang.Object obj2 = this.c;
                int i3 = this.a;
                java.lang.String str = hkdVar.c;
                akzxVarM.u();
                defpackage.jtx jtxVar3 = (defpackage.jtx) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                jtxVar3.b |= 8;
                jtxVar3.f = str;
                akzxVarM.u();
                defpackage.jtx jtxVar4 = (defpackage.jtx) akzxVarM.b;
                jtxVar4.e = i3 - 1;
                jtxVar4.b |= 4;
                jsd jsdVar = new jsd((defpackage.jtx) akzxVarM.p(), 4);
                defpackage.jiv jivVar = ((defpackage.jtt) obj2).c;
                return ahrv.g(((aogc) jivVar.d).bl(jsdVar)).i(new defpackage.hky(jivVar, 9), (java.util.concurrent.Executor) jivVar.e);
            case 2:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return aiql.z(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.c(1, "Message from app with invalid signature"));
                }
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.b;
                com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService messageBasedBlockingService = ((abvy) obj3).a;
                java.lang.String str2 = (java.lang.String) messageBasedBlockingService.h.a().b().orElse((java.lang.Object) null);
                android.os.Bundle bundle = (android.os.Bundle) obj4;
                java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("phoneNumbers");
                aca acaVar = new aca();
                int size = stringArrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    java.lang.String str3 = stringArrayList.get(i4);
                    ((java.util.List) j$.util.Map.-EL.computeIfAbsent(acaVar, android.telephony.PhoneNumberUtils.normalizeNumber(str3), new adci(1))).add(str3);
                }
                int i5 = this.a;
                aigf aigfVarI = aigf.i(acaVar);
                aihd aihdVarF = aigfVarI.f();
                if (i5 == 1) {
                    return ajan.f(messageBasedBlockingService.i.k(aihdVarF, str2), ahqx.a(new wym(aigfVarI, str2, 6, (byte[]) null)), messageBasedBlockingService.a);
                }
                if (i5 != 2) {
                    return i5 != 3 ? aiql.z(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.c(2, "Message not supported")) : ajan.f(messageBasedBlockingService.i.l(aihdVarF, str2), ahqx.a(new ymu(12)), messageBasedBlockingService.a);
                }
                if (bundle.getBoolean("markAsSpam", false)) {
                    ahrv.g(messageBasedBlockingService.g.c()).i(new zum(messageBasedBlockingService, aihdVarF, str2, 4), messageBasedBlockingService.a);
                }
                return ajan.f(messageBasedBlockingService.i.j(aihdVarF, str2), ahqx.a(new ymu(11)), messageBasedBlockingService.a);
            case 3:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj5 = this.b;
                int i6 = this.a;
                aczp aczpVar = (aczp) this.c;
                afsq.aE(aczpVar.a, aczc.a(i6));
                return aczpVar.b((aczc) obj5, i6 + 1);
            case 4:
                java.util.List<acvu> list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    arrayList.add((adac) it.next());
                }
                for (acvu acvuVar : list) {
                    akzx akzxVarM2 = acwb.a.m();
                    java.lang.String str4 = acvuVar.d;
                    akzxVarM2.u();
                    acwb acwbVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str4);
                    acwbVar.b |= 1;
                    acwbVar.c = str4;
                    if (acvuVar.e.isEmpty()) {
                        akzxVarM2.u();
                        acwb acwbVar2 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull("com.google.android.gms");
                        acwbVar2.b |= 2;
                        acwbVar2.d = "com.google.android.gms";
                    } else {
                        java.lang.String str5 = acvuVar.e;
                        akzxVarM2.u();
                        acwb acwbVar3 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str5);
                        acwbVar3.b |= 2;
                        acwbVar3.d = str5;
                    }
                    arrayList.add(new adac(akzxVarM2.p(), acvuVar));
                }
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap map2 = new java.util.HashMap();
                java.util.HashMap map3 = new java.util.HashMap();
                java.util.HashMap map4 = new java.util.HashMap();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(0L);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size2 = arrayList.size();
                while (true) {
                    java.lang.Object obj6 = this.b;
                    if (i >= size2) {
                        agqj agqjVar = (agqj) obj6;
                        return abrz.ac(arrayList2).D(new adbq(agqjVar, map, map4, atomicLong, this.a), (java.util.concurrent.Executor) agqjVar.d);
                    }
                    adac adacVar = (adac) arrayList.get(i);
                    int i7 = i2;
                    acwb acwbVar4 = adacVar.a;
                    java.util.Set setC = agqj.c(map2, agqj.b(acwbVar4));
                    java.lang.String strB = agqj.b(acwbVar4);
                    adbr adbrVar = (adbr) map.get(strB);
                    if (adbrVar == null) {
                        map.put(strB, new adbr());
                        adbrVar = (adbr) map.get(strB);
                    }
                    adbr adbrVar2 = adbrVar;
                    if (acwbVar4.f) {
                        java.util.Set setC2 = agqj.c(map3, agqj.b(acwbVar4));
                        map4.put(agqj.b(acwbVar4), adacVar.b);
                        set = setC2;
                    } else {
                        set = null;
                    }
                    acvu acvuVar2 = adacVar.b;
                    int size3 = acvuVar2.o.size();
                    for (acvr acvrVar : acvuVar2.o) {
                        java.util.HashMap map5 = map2;
                        boolean zAs = afsq.as(acvrVar);
                        java.util.ArrayList arrayList3 = arrayList;
                        int iAQ = a.aQ(acvuVar2.j);
                        if (iAQ == 0) {
                            iAQ = i7;
                        }
                        acwe acweVarAB = afsq.aB(acvrVar, iAQ);
                        agqj agqjVar2 = (agqj) obj6;
                        acvu acvuVar3 = acvuVar2;
                        adcs adcsVarE = adcs.e(((adlt) agqjVar2.c).i(acweVarAB));
                        acwn acwnVar = new acwn(11);
                        ?? r3 = agqjVar2.d;
                        adac adacVar2 = adacVar;
                        java.util.concurrent.atomic.AtomicLong atomicLong2 = atomicLong;
                        arrayList2.add(ahvr.H(adcsVarE.d(aczv.class, acwnVar, (java.util.concurrent.Executor) r3).f(new aczo(obj6, 14), (java.util.concurrent.Executor) r3), new adbp(hashSet, acweVarAB, atomicLong2, setC, zAs, adbrVar2, adacVar2, set), (java.util.concurrent.Executor) r3));
                        map2 = map5;
                        atomicLong = atomicLong2;
                        adacVar = adacVar2;
                        arrayList = arrayList3;
                        acvuVar2 = acvuVar3;
                        map3 = map3;
                    }
                    adbrVar2.e = size3;
                    i++;
                    i2 = i7;
                }
                break;
            case 5:
                adfl adflVar = (adfl) obj;
                boolean zI = adff.i(adflVar);
                int i8 = this.a;
                java.lang.Object obj7 = this.c;
                if (!zI || !adff.h(adflVar)) {
                    return ((adff) obj7).k(i8);
                }
                adag adagVar = ((adff) obj7).d;
                adfk adfkVar = adflVar.c;
                if (adfkVar == null) {
                    adfkVar = adfk.a;
                }
                java.lang.Object obj8 = this.b;
                ahrv ahrvVarG = ahrv.g(adagVar.c(adfkVar, i8));
                adfe adfeVar = new adfe(1);
                ajbm ajbmVar = ajbm.a;
                return ahrvVarG.h(adfeVar, ajbmVar).e(java.lang.Exception.class, new adfe(0), ajbmVar).i(new vlq(obj7, adflVar, obj8, i8, 3), ajbmVar);
            case 6:
                final albh albhVar = (albh) obj;
                final ?? r2 = this.c;
                final int i9 = this.a;
                final afgn afgnVar = (afgn) this.b;
                return aiql.Y((java.lang.Iterable) r2).c(ahqx.b(new ajas() { // from class: afgm
                    public final ajcq a() {
                        ajcq ajcqVarZ = aiql.z(albhVar);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r2.get(i10))).booleanValue()) {
                                ajcqVarZ = ajan.g(ajcqVarZ, ahqx.c(new adfd((afgl) afgnVar.a.get(i10), 16)), ajbm.a);
                            }
                        }
                        return ajcqVarZ;
                    }
                }), afgnVar.b);
            default:
                int i10 = this.a;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(i10);
                while (i < i10) {
                    if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c.get(i))).booleanValue()) {
                        arrayList4.add(((afgl) ((afgn) this.b).a.get(i)).a());
                    }
                    i++;
                }
                return aiql.aa(arrayList4).b(new kve(12), ajbm.a);
        }
    }

    public /* synthetic */ lgl(java.lang.Object obj, int i, java.lang.Object obj2, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ lgl(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public /* synthetic */ lgl(java.lang.Object obj, java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = list;
        this.a = i;
    }
}
