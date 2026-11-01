package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyg implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ acyg(java.lang.Object obj, alad aladVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aladVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v47, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v65, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r13v77, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        final ajcq ajcqVarG;
        int i = 13;
        int i2 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                ((acyu) this.a).b.p(acyu.v((defpackage.acvu) this.b), 4);
                return ajcm.a;
            case 1:
                defpackage.acvu acvuVar = (defpackage.acvu) this.b;
                adbe.j((acvh) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", new java.lang.Object[]{"FileGroupManager", acvuVar.d});
                ((acyu) this.a).b.p(acyu.v(acvuVar), 5);
                return ajcm.a;
            case 2:
                if (((defpackage.acvu) obj) == null) {
                    return ajcm.a;
                }
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                defpackage.acwb acwbVar = (defpackage.acwb) obj2;
                java.lang.String str = acwbVar.c;
                java.lang.String str2 = acwbVar.d;
                int i4 = adbe.a;
                acyu acyuVar = (acyu) obj3;
                acyuVar.b.l(1049);
                return acyuVar.q(acyuVar.d.i(acwbVar), new defpackage.acwk(obj3, i));
            case 3:
                defpackage.acvu acvuVar2 = (defpackage.acvu) obj;
                if (acvuVar2 == null) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                defpackage.acwb acwbVar2 = (defpackage.acwb) obj4;
                java.lang.String str3 = acwbVar2.c;
                java.lang.String str4 = acwbVar2.d;
                int i5 = adbe.a;
                acyu acyuVar2 = (acyu) obj5;
                acyu.A(1050, acyuVar2.b, acvuVar2);
                return acyuVar2.q(acyuVar2.d.i(acwbVar2), new defpackage.acyg(obj5, (alad) acvuVar2, 11));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.acvu acvuVar3 = (defpackage.acvu) aiql.H((java.util.concurrent.Future) this.a);
                if (acvuVar3 == null) {
                    return ajcm.a;
                }
                java.lang.Object obj6 = this.b;
                aiwm aiwmVarV = acyu.v(acvuVar3);
                defpackage.acvs acvsVar = acvuVar3.c;
                if (acvsVar == null) {
                    acvsVar = defpackage.acvs.a;
                }
                ((acyu) obj6).b.i(aiwmVarV, acvsVar.g);
                aify.p(acvuVar3);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.acvu acvuVar4 = (defpackage.acvu) obj;
                if (acvuVar4 != null) {
                    ((java.util.concurrent.atomic.AtomicReference) this.a).set(acvuVar4);
                    return aiql.z(acvuVar4);
                }
                java.lang.Object obj7 = this.b;
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.GROUP_NOT_FOUND_ERROR;
                ygVarB.d = "Nothing to download for file group: ".concat(java.lang.String.valueOf(((defpackage.acwb) obj7).c));
                return aiql.y(ygVarB.d());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.acvu acvuVar5 = (defpackage.acvu) this.b;
                return afsq.at(acvuVar5) ? ((acyu) this.a).d(acvuVar5) : ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj8 = this.a;
                acyu acyuVar3 = (acyu) obj8;
                return acyuVar3.p(acyuVar3.d.i((defpackage.acwb) this.b), new wym(obj8, (ahyn) obj, 9, (byte[]) null));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    yg ygVarB2 = acvh.b();
                    defpackage.acvg acvgVar = defpackage.acvg.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                    ygVarB2.b = acvgVar;
                    ygVarB2.d = acvgVar.name();
                    return aiql.y(ygVarB2.d());
                }
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                defpackage.acwb acwbVar3 = (defpackage.acwb) obj9;
                adbe.e("%s: Failed to remove pending version for group: '%s'; account: '%s'", new java.lang.Object[]{"FileGroupManager", acwbVar3.c, acwbVar3.e});
                ((acyu) obj10).b.l(1036);
                return aiql.y(new java.io.IOException("Failed to remove pending group: ".concat(java.lang.String.valueOf(acwbVar3.c))));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acvu acvuVar6 = (defpackage.acvu) obj;
                return acvuVar6 != null ? this.a.a(new defpackage.adac((defpackage.acwb) this.b, acvuVar6)) : ajcm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj11 = this.b;
                    if (!it.hasNext()) {
                        return abrz.ac(arrayList).D(new aczf(1), ((acyu) obj11).f);
                    }
                    defpackage.acwb acwbVar4 = (defpackage.acwb) it.next();
                    if (!acwbVar4.f) {
                        acyu acyuVar4 = (acyu) obj11;
                        arrayList.add(acyuVar4.q(acyuVar4.g(acwbVar4, false), new defpackage.acyh(obj11, acwbVar4, this.a, 12)));
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    acyu.A(1036, ((acyu) this.a).b, (defpackage.acvu) this.b);
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.a;
                if (zBooleanValue) {
                    ((acyu) obj13).b.p(acyu.v((defpackage.acvu) obj12), 3);
                    return ajcm.a;
                }
                defpackage.adcs adcsVarE = defpackage.adcs.e(((acyu) obj13).d((defpackage.acvu) obj12));
                alad aladVar = (alad) obj12;
                defpackage.acyg acygVar = new defpackage.acyg(obj13, aladVar, i2);
                ajbm ajbmVar = ajbm.a;
                return adcsVarE.d(acvh.class, acygVar, ajbmVar).g(new defpackage.acyg(obj13, aladVar, i3), ajbmVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.adac adacVar = (defpackage.adac) obj;
                defpackage.acvu acvuVar7 = adacVar.b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (defpackage.acvr acvrVar : acvuVar7.o) {
                    int iAQ = a.aQ(acvuVar7.j);
                    if (iAQ == 0) {
                        iAQ = 1;
                    }
                    java.lang.Object obj14 = this.a;
                    java.lang.Object obj15 = this.b;
                    final defpackage.acwe acweVarAB = afsq.aB(acvrVar, iAQ);
                    java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) obj14;
                    if (((java.util.Map) atomicReference.get()).containsKey(acweVarAB.e)) {
                        ajcqVarG = (ajcq) ((java.util.Map) atomicReference.get()).get(acweVarAB.e);
                    } else {
                        adlt adltVar = ((acyu) obj15).j;
                        ajcqVarG = defpackage.adcs.e(adltVar.k(acweVarAB)).g(new defpackage.aczq(adltVar, acweVarAB, acvrVar, 1, (int[]) null), adltVar.h);
                        j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(atomicReference, new java.util.function.UnaryOperator() { // from class: acye
                            @Override // java.util.function.Function
                            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                                return j$.util.function.Function.-CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final java.lang.Object apply(java.lang.Object obj16) {
                                java.util.Map map = (java.util.Map) obj16;
                                map.put(acweVarAB.e, ajcqVarG);
                                return map;
                            }

                            @Override // java.util.function.Function
                            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                                return j$.util.function.Function.-CC.$default$compose(this, function);
                            }
                        });
                    }
                    ahvr.ci(ajcqVarG);
                    arrayList2.add(ahvr.C(ajcqVarG, defpackage.aczv.class, new defpackage.zum(obj15, (alad) acvuVar7, (java.lang.Object) adacVar, 18), ((acyu) obj15).f));
                }
                return abrz.ac(arrayList2).D(new defpackage.vnc(16), ajbm.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((acyy) this.b).o((defpackage.adbw) this.a, (defpackage.adbw) obj, 1087);
            case 15:
                java.lang.Object obj16 = this.b;
                acyy acyyVar = (acyy) obj16;
                return ahvr.I(acyyVar.n(acyyVar.a.c()), new defpackage.acyh(obj16, (defpackage.adbw) obj, (java.util.Comparator) this.a, i), acyyVar.b);
            case 16:
                return ((acyy) this.b).o((defpackage.adbw) this.a, (defpackage.adbw) obj, 1094);
            case 17:
                return ((acyy) this.b).o((defpackage.adbw) this.a, (defpackage.adbw) obj, 1098);
            case 18:
                return ((acyy) this.b).o((defpackage.adbw) this.a, (defpackage.adbw) obj, 1096);
            case 19:
                java.lang.Object obj17 = this.b;
                acyy acyyVar2 = (acyy) obj17;
                return ahvr.I(acyyVar2.n(acyyVar2.a.m((java.util.List) this.a)), new defpackage.acyw(obj17, (defpackage.adbw) obj, i3), acyyVar2.b);
            default:
                return ((acyy) this.b).o((defpackage.adbw) this.a, (defpackage.adbw) obj, 1095);
        }
    }

    public /* synthetic */ acyg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
