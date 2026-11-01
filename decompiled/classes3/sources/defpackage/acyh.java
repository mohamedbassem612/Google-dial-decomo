package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyh implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ acyh(acyu acyuVar, akzx akzxVar, acvh acvhVar, int i) {
        this.$cid = i;
        this.c = acyuVar;
        this.a = akzxVar;
        this.b = acvhVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: acxw */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v53, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Object, java.util.Comparator] */
    public final ajcq a(java.lang.Object obj) throws java.io.IOException, acxw {
        int i = 9;
        int i2 = 11;
        int i3 = 4;
        int i4 = 15;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        switch (this.$cid) {
            case 0:
                defpackage.acvr acvrVar = (defpackage.acvr) this.b;
                java.lang.String str = acvrVar.c;
                defpackage.acvu acvuVar = (defpackage.acvu) this.c;
                java.lang.String str2 = acvuVar.d;
                int i8 = adbe.a;
                acyu.B(((acyu) this.a).b, acvuVar, acvrVar, ((defpackage.adbt) obj).a);
                return ajcm.a;
            case 1:
                return ((acyu) this.a).f((defpackage.acwg) obj, (defpackage.acvr) this.b, (defpackage.acvu) this.c);
            case 2:
                return ((acyu) this.a).d.l((defpackage.acwb) this.c, (defpackage.acvu) this.b);
            case 3:
                defpackage.acvu acvuVar2 = (defpackage.acvu) obj;
                java.lang.Object obj2 = this.a;
                if (acvuVar2 != null) {
                    int i9 = acvuVar2.f;
                    akzx akzxVar = (akzx) obj2;
                    akzxVar.u();
                    aiwm aiwmVar = akzxVar.b;
                    aiwm aiwmVar2 = aiwm.a;
                    aiwmVar.b |= 2;
                    aiwmVar.d = i9;
                }
                acvh acvhVar = (acvh) this.b;
                ((acyu) this.c).b.q(airh.j(acvhVar.a.aL), ((akzx) obj2).p(), a.aO(acvhVar.b - 1));
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj3 = this.a;
                acyu acyuVar = (acyu) obj3;
                acyv acyvVar = acyuVar.d;
                java.lang.Object obj4 = this.c;
                defpackage.adcs adcsVarE = defpackage.adcs.e(acyvVar.g((defpackage.acwb) obj4));
                defpackage.acyx acyxVar = new defpackage.acyx(1);
                java.util.concurrent.Executor executor = acyuVar.f;
                defpackage.adcs adcsVarF = adcsVarE.f(acyxVar, executor);
                return adcsVarF.g(new defpackage.zum(obj3, obj4, this.b, 14, (char[]) null), executor).g(new defpackage.zum(obj3, (alad) obj4, (java.lang.Object) adcsVarF, 15), executor);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.acvu acvuVar3 = (defpackage.acvu) obj;
                java.lang.Object obj5 = this.b;
                if (acvuVar3 != null) {
                    return aiql.z(acyu.a((defpackage.acvu) obj5, acvuVar3));
                }
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.a;
                akzx akzxVarP = ((alad) obj6).p();
                akzxVarP.u();
                defpackage.acwb acwbVar = (defpackage.acwb) akzxVarP.b;
                acwbVar.b |= 8;
                acwbVar.f = true;
                acyu acyuVar2 = (acyu) obj7;
                return acyuVar2.q(acyuVar2.d.g((defpackage.acwb) akzxVarP.p()), new defpackage.acwk(obj5, 14));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.acwc acwcVar = (defpackage.acwc) obj;
                if (acwcVar == null) {
                    acwcVar = defpackage.acwc.a;
                }
                if (acwcVar.b) {
                    return aiql.z((java.lang.Object) null);
                }
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.a;
                defpackage.acwb acwbVar2 = (defpackage.acwb) obj9;
                java.lang.String str3 = acwbVar2.c;
                java.lang.String str4 = acwbVar2.d;
                int i10 = adbe.a;
                acyu.A(1055, ((acyu) obj10).b, (defpackage.acvu) obj8);
                throw new acxw();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                alad aladVar = (alad) this.c;
                akzx akzxVarP2 = aladVar.p();
                akzxVarP2.u();
                defpackage.acwb acwbVar3 = (defpackage.acwb) akzxVarP2.b;
                acwbVar3.b |= 8;
                acwbVar3.f = false;
                defpackage.acwb acwbVar4 = (defpackage.acwb) akzxVarP2.p();
                java.lang.Object obj11 = this.a;
                acyu acyuVar3 = (acyu) obj11;
                return acyuVar3.q(acyuVar3.d.g(acwbVar4), new defpackage.acyh(obj11, (alad) this.b, aladVar, 5));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ahyn ahynVar = (ahyn) obj;
                boolean zF = ahynVar.f();
                java.lang.Object obj12 = this.c;
                if (!zF) {
                    java.lang.String str5 = ((defpackage.acwb) obj12).c;
                    int i11 = adbe.a;
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj13 = this.b;
                defpackage.acvu acvuVar4 = (defpackage.acvu) obj13;
                if (afsq.at(acvuVar4)) {
                    int i12 = airu.a;
                    airk airkVarE = airt.a.e();
                    airkVarE.j(acvuVar4.t);
                    airkVarE.j("|");
                    airkVarE.j(((defpackage.acwb) obj12).e);
                    airkVarE.j("|");
                    long j = acvuVar4.s;
                    airk airkVar = airkVarE;
                    java.nio.ByteBuffer byteBufferA = airkVar.a();
                    byteBufferA.putLong(j);
                    airkVar.d(byteBufferA, 8);
                    java.lang.String str6 = java.lang.String.format("%s_%s", acvuVar4.d, airkVarE.o().toString());
                    akzx akzxVarP3 = ((alad) obj13).p();
                    akzxVarP3.u();
                    defpackage.acvu acvuVar5 = (defpackage.acvu) akzxVarP3.b;
                    j$.util.Objects.requireNonNull(str6);
                    acvuVar5.b |= 524288;
                    acvuVar5.w = str6;
                    obj13 = (defpackage.acvu) akzxVarP3.p();
                }
                java.lang.Object obj14 = this.a;
                akzx akzxVarP4 = ((alad) obj12).p();
                akzxVarP4.u();
                defpackage.acwb acwbVar5 = (defpackage.acwb) akzxVarP4.b;
                acwbVar5.b |= 8;
                acwbVar5.f = false;
                acyu acyuVar4 = (acyu) obj14;
                return acyuVar4.q(acyuVar4.q(acyuVar4.d.g((defpackage.acwb) akzxVarP4.p()), new defpackage.acwk(obj13, 12)), new defpackage.acyh(obj14, (defpackage.acwb) obj12, ahynVar, i));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acvu acvuVar6 = (defpackage.acvu) obj;
                defpackage.acwb acwbVar6 = (defpackage.acwb) this.b;
                java.lang.String str7 = acwbVar6.c;
                int i13 = adbe.a;
                akzx akzxVarM = aiwm.a.m();
                java.lang.String str8 = acvuVar6.d;
                akzxVarM.u();
                aiwm aiwmVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str8);
                aiwmVar3.b |= 1;
                aiwmVar3.c = str8;
                java.lang.String str9 = acvuVar6.e;
                akzxVarM.u();
                aiwm aiwmVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str9);
                aiwmVar4.b |= 4;
                aiwmVar4.e = str9;
                int i14 = acvuVar6.f;
                akzxVarM.u();
                aiwm aiwmVar5 = akzxVarM.b;
                aiwmVar5.b |= 2;
                aiwmVar5.d = i14;
                long j2 = acvuVar6.s;
                akzxVarM.u();
                aiwm aiwmVar6 = akzxVarM.b;
                aiwmVar6.b |= 64;
                aiwmVar6.i = j2;
                java.lang.String str10 = acvuVar6.t;
                akzxVarM.u();
                aiwm aiwmVar7 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str10);
                aiwmVar7.b |= 128;
                aiwmVar7.j = str10;
                aiwm aiwmVarP = akzxVarM.p();
                akzx akzxVarM2 = aixf.a.m();
                aixh aixhVar = (aixh) ((ahyn) this.a).b();
                akzxVarM2.u();
                aixf aixfVar = akzxVarM2.b;
                aixfVar.c = aixhVar.a();
                aixfVar.b |= 1;
                aixf aixfVarP = akzxVarM2.p();
                java.lang.Object obj15 = this.c;
                acyu acyuVar5 = (acyu) obj15;
                acyuVar5.b.j(aiwmVarP, aixfVarP);
                return acyuVar5.q(acyuVar5.o(acvuVar6, 0, acvuVar6.o.size()), new defpackage.acyh(obj15, acwbVar6, acvuVar6, i2));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    ?? r0 = this.a;
                    java.lang.Object obj16 = this.b;
                    if (!it.hasNext()) {
                        return abrz.ac((java.lang.Iterable) r0).D(new defpackage.vnc(19), ((acyu) obj16).f);
                    }
                    java.lang.Object obj17 = this.c;
                    defpackage.acwb acwbVar7 = (defpackage.acwb) it.next();
                    acyu acyuVar6 = (acyu) obj16;
                    r0.add(acyuVar6.q(acyuVar6.d.g(acwbVar7), new defpackage.acyg(obj17, (alad) acwbVar7, i)));
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.io.IOException("Subscribing to group failed");
                }
                java.lang.Object obj18 = this.b;
                java.lang.Object obj19 = this.c;
                java.lang.Object obj20 = this.a;
                alad aladVar2 = (alad) obj19;
                akzx akzxVarP5 = aladVar2.p();
                akzxVarP5.u();
                defpackage.acwb acwbVar8 = (defpackage.acwb) akzxVarP5.b;
                acwbVar8.b |= 8;
                acwbVar8.f = false;
                defpackage.acwb acwbVar9 = (defpackage.acwb) akzxVarP5.p();
                acyu acyuVar7 = (acyu) obj20;
                ajcq ajcqVarG = acyuVar7.d.g(acwbVar9);
                defpackage.adcs adcsVarE2 = defpackage.adcs.e(ajcqVarG);
                defpackage.acyh acyhVar = new defpackage.acyh(obj20, acwbVar9, (defpackage.acvu) obj18, i5);
                java.util.concurrent.Executor executor2 = acyuVar7.f;
                return acyuVar7.q(adcsVarE2.g(acyhVar, executor2).g(new defpackage.acwk(obj20, i4), executor2).g(new defpackage.acwk(obj18, 16), executor2).g(new defpackage.acyg(obj20, ajcqVarG, i3), executor2), new defpackage.zum(obj20, obj18, aladVar2, 17));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.acvu acvuVar7 = (defpackage.acvu) obj;
                if (acvuVar7 == null) {
                    return aiql.z(defpackage.acyt.a);
                }
                ?? r1 = this.a;
                java.lang.Object obj21 = this.b;
                acyu acyuVar8 = (acyu) this.c;
                return acyuVar8.C((defpackage.acwb) obj21, acvuVar7, (ajat) r1, new defpackage.vaa(acyuVar8.b));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((acyy) this.b).p((defpackage.adbw) this.c, (defpackage.adbw) obj, (java.util.Comparator) this.a, 1093);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj22 = this.a;
                acyy acyyVar = (acyy) obj22;
                return ahvr.I(acyyVar.n(acyyVar.a.l((defpackage.acwb) this.c, (defpackage.acvu) this.b)), new defpackage.acyw(obj22, (defpackage.adbw) obj, i6), acyyVar.b);
            case 15:
                return ((acyy) this.b).p((defpackage.adbw) this.c, (defpackage.adbw) obj, (java.util.Comparator) this.a, 1092);
            case 16:
                acza aczaVar = (acza) this.a;
                return ahvr.H(aczaVar.c.h((defpackage.acwe) this.b, (defpackage.acwg) this.c), new defpackage.acym((java.lang.Boolean) obj, 2), aczaVar.d);
            case 17:
                acza aczaVar2 = (acza) this.b;
                defpackage.adbw adbwVar = (defpackage.adbw) obj;
                int iM = aczaVar2.e.m();
                java.lang.Object obj23 = this.c;
                if (adbe.a(iM)) {
                    if (defpackage.adbw.d((defpackage.adbw) obj23, adbwVar, this.a)) {
                        aczaVar2.a.k(1106, iM);
                    } else {
                        aczaVar2.a.k(1103, iM);
                    }
                }
                defpackage.adbw adbwVar2 = (defpackage.adbw) obj23;
                if (adbwVar2.a) {
                    java.util.List list = (java.util.List) adbwVar2.a();
                    ahvr.ci(list);
                    return aiql.z(list);
                }
                java.lang.Object objB = adbwVar2.b();
                ahvr.ci(objB);
                return aiql.y((java.lang.Throwable) objB);
            case 18:
                java.lang.Object obj24 = this.a;
                acza aczaVar3 = (acza) obj24;
                return ahvr.I(aczaVar3.b(aczaVar3.c.h((defpackage.acwe) this.b, (defpackage.acwg) this.c)), new defpackage.acyw(obj24, (defpackage.adbw) obj, i2), aczaVar3.d);
            case 19:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj25 = this.a;
                java.lang.Object obj26 = this.b;
                java.lang.Object obj27 = this.c;
                aczk aczkVar = (aczk) obj27;
                defpackage.acwb acwbVar10 = (defpackage.acwb) obj26;
                ajcq ajcqVarG2 = aczkVar.d.g(acwbVar10, false);
                defpackage.adcs adcsVarE3 = defpackage.adcs.e(ajcqVarG2);
                defpackage.acyh acyhVar2 = new defpackage.acyh(obj27, acwbVar10, obj25, 20);
                java.util.concurrent.Executor executor3 = aczkVar.i;
                return adcsVarE3.g(acyhVar2, executor3).g(new defpackage.acze(obj27, ajcqVarG2, i7), executor3);
            default:
                defpackage.acvu acvuVar8 = (defpackage.acvu) obj;
                if (acvuVar8 == null) {
                    return aiql.z(defpackage.acyt.a);
                }
                ?? r2 = this.a;
                java.lang.Object obj28 = this.b;
                aczk aczkVar2 = (aczk) this.c;
                return aczkVar2.d.C((defpackage.acwb) obj28, acvuVar8, (ajat) r2, new defpackage.vaa(aczkVar2.c));
        }
    }

    public /* synthetic */ acyh(acyu acyuVar, java.util.List list, ajat ajatVar, int i) {
        this.$cid = i;
        this.b = acyuVar;
        this.a = list;
        this.c = ajatVar;
    }

    public /* synthetic */ acyh(java.lang.Object obj, defpackage.acwb acwbVar, defpackage.acvu acvuVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = acwbVar;
        this.b = acvuVar;
    }

    public /* synthetic */ acyh(java.lang.Object obj, defpackage.acwb acwbVar, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = acwbVar;
        this.a = obj2;
    }

    public /* synthetic */ acyh(java.lang.Object obj, defpackage.adbw adbwVar, java.util.Comparator comparator, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = adbwVar;
        this.a = comparator;
    }

    public /* synthetic */ acyh(java.lang.Object obj, alad aladVar, alad aladVar2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aladVar;
        this.c = aladVar2;
    }
}
