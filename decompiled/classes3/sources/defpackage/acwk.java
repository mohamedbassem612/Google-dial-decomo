package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acwk implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ acwk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v10, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v45, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v24, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [adba, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) throws java.lang.Throwable {
        long jV;
        int i = 2;
        int i2 = 17;
        int i3 = 8;
        byte[] bArr = null;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                return aiql.z((defpackage.acui) aiql.H((java.util.concurrent.Future) this.a));
            case 1:
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj;
                defpackage.afpl afplVar = (defpackage.afpl) ((acea) this.a).w.a();
                aooh.c(promoContext);
                aooh.f(promoContext, "promoContext");
                return aosv.F((aoss) afplVar.a, 0, new defpackage.abvg(afplVar, promoContext, (aoln) null, 8), 3);
            case 2:
                return ((acwx) this.a).k();
            case 3:
                int i5 = adbe.a;
                acwx acwxVar = (acwx) this.a;
                aczk aczkVar = acwxVar.d;
                return ahvr.I(aczkVar.e(), new defpackage.acze(aczkVar, acwxVar.i, i4), aczkVar.i);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return aiql.y((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.adac) it.next()).b);
                }
                java.lang.Object obj2 = this.a;
                adak adakVar = (adak) obj2;
                return ahvr.H(adakVar.g.e(), new icy(obj2, arrayList, hashSet, 20, (int[]) null), (java.util.concurrent.Executor) adakVar.f);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it2 = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj3 = this.a;
                    if (!it2.hasNext()) {
                        adak adakVar2 = (adak) obj3;
                        return ahvr.H(adakVar2.g.j(arrayList2), new defpackage.zqi(obj3, 18), (java.util.concurrent.Executor) adakVar2.f);
                    }
                    defpackage.adac adacVar = (defpackage.adac) it2.next();
                    defpackage.acwb acwbVar = adacVar.a;
                    defpackage.acvu acvuVar = adacVar.b;
                    long jAl = afsq.al(acvuVar);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(jAl);
                    int i6 = adbe.a;
                    lValueOf.getClass();
                    if (afsq.av(jAl)) {
                        adak adakVar3 = (adak) obj3;
                        adakVar3.j.m(1051, acvuVar.d, acvuVar.f, acvuVar.s, acvuVar.t);
                        arrayList2.add(acwbVar);
                        if (afsq.at(acvuVar)) {
                            afsq.cU((android.content.Context) adakVar3.h, (ahyn) adakVar3.k, acvuVar, (aogc) adakVar3.e);
                        }
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj4 = this.a;
                adak adakVar4 = (adak) obj4;
                ajcq ajcqVarC = adakVar4.g.c();
                defpackage.acwk acwkVar = new defpackage.acwk(obj4, 6);
                ?? r14 = adakVar4.f;
                return ahvr.I(ahvr.I(ajcqVarC, acwkVar, (java.util.concurrent.Executor) r14), new defpackage.acwk(obj4, 10), (java.util.concurrent.Executor) r14);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj5 = this.a;
                adak adakVar5 = (adak) obj5;
                return ahvr.I(adakVar5.i.c(), new defpackage.wzg(obj5, (java.util.Set) obj, 16, bArr), (java.util.concurrent.Executor) adakVar5.f);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj6 = this.a;
                    if (!it3.hasNext()) {
                        adak adakVar6 = (adak) obj6;
                        return ahvr.I(adakVar6.g.k(), new defpackage.wzg(obj6, arrayList3, i2, bArr), (java.util.concurrent.Executor) adakVar6.f);
                    }
                    defpackage.acvu acvuVar2 = (defpackage.acvu) it3.next();
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    defpackage.acvs acvsVar = acvuVar2.c;
                    if (acvsVar == null) {
                        acvsVar = defpackage.acvs.a;
                    }
                    if (afsq.av(java.lang.Math.min(timeUnit.toMillis(acvsVar.c), afsq.al(acvuVar2)))) {
                        adak adakVar7 = (adak) obj6;
                        adakVar7.j.m(1052, acvuVar2.d, acvuVar2.f, acvuVar2.s, acvuVar2.t);
                        if (afsq.at(acvuVar2)) {
                            afsq.cU((android.content.Context) adakVar7.h, (ahyn) adakVar7.k, acvuVar2, (aogc) adakVar7.e);
                        }
                    } else {
                        arrayList3.add(acvuVar2);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj7 = this.a;
                adak adakVar8 = (adak) obj7;
                ajcq ajcqVarC2 = adakVar8.g.c();
                defpackage.acwk acwkVar2 = new defpackage.acwk(obj7, 5);
                ?? r15 = adakVar8.f;
                return ahvr.I(ahvr.I(ajcqVarC2, acwkVar2, (java.util.concurrent.Executor) r15), new defpackage.acwk(obj7, i3), (java.util.concurrent.Executor) r15);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((adak) this.a).j.l(1036);
                    adbe.c("%s: Failed to write back stale groups!", "ExpirationHandler");
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.acvu acvuVar3 = (defpackage.acvu) obj;
                java.lang.Object obj8 = this.a;
                if (acvuVar3 == null || !acyu.s((defpackage.acvu) obj8, acvuVar3)) {
                    jV = abrz.V();
                } else {
                    defpackage.acvs acvsVar2 = acvuVar3.c;
                    if (acvsVar2 == null) {
                        acvsVar2 = defpackage.acvs.a;
                    }
                    jV = acvsVar2.d;
                }
                defpackage.acvs acvsVar3 = ((defpackage.acvu) obj8).c;
                if (acvsVar3 == null) {
                    acvsVar3 = defpackage.acvs.a;
                }
                akzx akzxVarP = acvsVar3.p();
                akzxVarP.u();
                defpackage.acvs acvsVar4 = (defpackage.acvs) akzxVarP.b;
                acvsVar4.b |= 2;
                acvsVar4.d = jV;
                defpackage.acvs acvsVar5 = (defpackage.acvs) akzxVarP.p();
                akzx akzxVarP2 = ((alad) obj8).p();
                akzxVarP2.u();
                defpackage.acvu acvuVar4 = (defpackage.acvu) akzxVarP2.b;
                j$.util.Objects.requireNonNull(acvsVar5);
                acvuVar4.c = acvsVar5;
                acvuVar4.b |= 1;
                return aiql.z((defpackage.acvu) akzxVarP2.p());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((acyu) this.a).b.l(1036);
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acvu acvuVar5 = (defpackage.acvu) obj;
                return aiql.z(acvuVar5 == null ? ahyn.h(aixh.b) : acyu.a((defpackage.acvu) this.a, acvuVar5));
            case 15:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                ((acyu) this.a).b.l(1036);
                return aiql.y(new java.io.IOException("Failed to commit new group metadata to disk."));
            case 16:
                java.lang.String str = ((defpackage.acvu) this.a).d;
                return ajcm.a;
            case 17:
                throw ((java.lang.Throwable) this.a);
            case 18:
                ahyn ahynVar = (ahyn) obj;
                if (!ahynVar.f()) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.a;
                acyu acyuVar = (acyu) obj9;
                return acyuVar.q(acyuVar.d.a((defpackage.acvu) ahynVar.b()), new defpackage.acyq(obj9, i4));
            case 19:
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it4 = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj10 = this.a;
                    if (!it4.hasNext()) {
                        return abrz.ac(arrayList4).D(new defpackage.vnc(17), ((acyu) obj10).f);
                    }
                    defpackage.acwb acwbVar2 = (defpackage.acwb) it4.next();
                    acyu acyuVar2 = (acyu) obj10;
                    if (!acyuVar2.t(acwbVar2.d)) {
                        arrayList4.add(acyuVar2.q(acyuVar2.d.g(acwbVar2), new defpackage.acyg(obj10, (alad) acwbVar2, i)));
                    }
                }
                break;
            default:
                return ((acyu) this.a).p(ajcm.a, new defpackage.acym((defpackage.acyt) obj, 1));
        }
    }
}
