package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class slv implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ slv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, ruc] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, thd] */
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.tuf tufVarK = null;
        int i = 1;
        switch (this.$cid) {
            case 0:
                cra craVar = (cra) obj;
                ?? r2 = this.b;
                java.util.List list = defpackage.sme.a;
                aooh.f(craVar, "$this$graphicsLayer");
                craVar.B(mni.bj(0.5f, ((defpackage.sml) this.a).a));
                craVar.w(a.G((cer) r2));
                craVar.x(a.G((cer) r2));
                return aojh.a;
            case 1:
                defpackage.abjl abjlVar = (defpackage.abjl) obj;
                java.util.List list2 = defpackage.sme.a;
                aooh.f(abjlVar, "it");
                ((defpackage.smu) this.a).m.a(abjlVar);
                this.b.b(abjlVar);
                return aojh.a;
            case 2:
                java.util.List list3 = defpackage.sme.a;
                ((defpackage.smu) this.a).g.a(new defpackage.smt((defpackage.sjz) this.b));
                return aojh.a;
            case 3:
                this.b.b(new cpm(((cpm) obj).a));
                a.E((ccp) this.a, true);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    java.lang.Object obj3 = this.b;
                    dfb.m(diqVar, (java.lang.String) obj2);
                    diqVar.a(din.f, new dhu(((defpackage.tha) obj3).f, 1));
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyColumn");
                aoor aoorVar = new aoor();
                ?? r9 = this.a;
                java.util.Iterator it = ((defpackage.tha) r9).c.iterator();
                while (true) {
                    java.lang.Object obj4 = this.b;
                    if (!it.hasNext()) {
                        barVar.a((java.lang.Object) null, "QueryActionsFooter", new cja(644871618, true, new jai(obj4, (java.lang.Object) r9, aoorVar, 6)));
                        return aojh.a;
                    }
                    defpackage.thb thbVar = (defpackage.thb) it.next();
                    java.lang.Object obj5 = ((defpackage.tgf) obj4).f.get(thbVar.a);
                    if (obj5 == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    java.util.List<defpackage.thc> list4 = thbVar.b;
                    defpackage.teu teuVar = (defpackage.teu) obj5;
                    if (!list4.isEmpty()) {
                        java.lang.Integer numD = teuVar.d();
                        if (numD != null) {
                            barVar.a(numD, "SectionHeader", new cja(1450534734, true, new bli(obj4, numD, 8)));
                        }
                        for (defpackage.thc thcVar : list4) {
                            defpackage.tgy tgyVar = thcVar.a;
                            if (tgyVar != null) {
                                barVar.a(tgyVar.a(), tufVarK, new cja(173020035, true, new bli(teuVar, tgyVar, 9)));
                            }
                            int i2 = aoorVar.a;
                            java.util.List list5 = thcVar.b;
                            barVar.b(list5.size(), new tge(thcVar, 1), new tge(teuVar, 0), new cja(800050773, true, new defpackage.abop(thcVar, teuVar, i2, (defpackage.thd) r9, 1)));
                            aoorVar.a += list5.size();
                            tufVarK = null;
                        }
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                gin ginVarA = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(tuc.k(ginVarA));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((tuc) this.b).a.c((gjh) obj, (java.util.Collection) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Integer.valueOf(((tuc) this.b).b.c((gjh) obj, (java.lang.Iterable) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA2.m()) {
                        arrayList2.add(tuc.k(ginVarA2));
                    }
                    ginVarA2.close();
                    return arrayList2;
                } catch (java.lang.Throwable th2) {
                    ginVarA2.close();
                    throw th2;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                gin ginVarA3 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA3);
                    if (ginVarA3.m()) {
                        tufVarK = tuc.k(ginVarA3);
                        break;
                    }
                    return tufVarK;
                } finally {
                    ginVarA3.close();
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Integer.valueOf(((tuc) this.b).c.c((gjh) obj, (java.lang.Iterable) this.a));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return aazc.g((abwx) this.b, (java.lang.String) this.a, (aoln) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                gjh gjhVar = (gjh) obj;
                gin ginVarA4 = gjhVar.a((java.lang.String) this.b);
                ?? r0 = this.a;
                try {
                    if (r0 == 0) {
                        ginVarA4.i(1);
                    } else {
                        for (java.lang.String str : r0) {
                            if (str == null) {
                                ginVarA4.i(i);
                            } else {
                                ginVarA4.j(i, str);
                            }
                            i++;
                        }
                    }
                    ginVarA4.m();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(dez.i(gjhVar));
                    ginVarA4.close();
                    return numValueOf;
                } catch (java.lang.Throwable th3) {
                    ginVarA4.close();
                    throw th3;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                gjh gjhVar2 = (gjh) obj;
                gin ginVarA5 = gjhVar2.a("UPDATE spamcall SET persistableSpamStatus = ? WHERE id = ?");
                try {
                    ginVarA5.f(1, ((akym) this.b).i());
                    java.lang.Object obj6 = this.a;
                    if (obj6 == null) {
                        ginVarA5.i(2);
                    } else {
                        ginVarA5.j(2, (java.lang.String) obj6);
                    }
                    ginVarA5.m();
                    return java.lang.Integer.valueOf(dez.i(gjhVar2));
                } finally {
                    ginVarA5.close();
                }
            case 15:
                ((ucy) this.a).b.e((gjh) obj, this.b);
                return null;
            case 16:
                gin ginVarA6 = ((gjh) obj).a((java.lang.String) this.b);
                ?? r1 = this.a;
                try {
                    if (r1 == 0) {
                        ginVarA6.i(1);
                    } else {
                        for (java.lang.String str2 : r1) {
                            if (str2 == null) {
                                ginVarA6.i(i);
                            } else {
                                ginVarA6.j(i, str2);
                            }
                            i++;
                        }
                    }
                    int iS = dzk.S(ginVarA6, "id");
                    int iS2 = dzk.S(ginVarA6, "persistableSpamStatus");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (ginVarA6.m()) {
                        arrayList3.add(new defpackage.taq(ginVarA6.l(iS) ? null : ginVarA6.e(iS), defpackage.ucv.a(ginVarA6.l(iS2) ? null : ginVarA6.n(iS2))));
                        break;
                    }
                    ginVarA6.close();
                    return arrayList3;
                } catch (java.lang.Throwable th4) {
                    ginVarA6.close();
                    throw th4;
                }
            case 17:
                aeun aeunVar = (aeun) obj;
                aooh.f(aeunVar, "it");
                this.b.q(aeunVar, ((defpackage.ugi) this.a).c, rub.b);
                return aojh.a;
            case 18:
                aeun aeunVar2 = (aeun) obj;
                aooh.f(aeunVar2, "it");
                this.b.q(aeunVar2, ((defpackage.ugi) this.a).c, rub.c);
                return aojh.a;
            case 19:
                aeun aeunVar3 = (aeun) obj;
                aooh.f(aeunVar3, "it");
                this.b.q(aeunVar3, ((defpackage.ugm) this.a).c, rub.b);
                return aojh.a;
            default:
                aeun aeunVar4 = (aeun) obj;
                aooh.f(aeunVar4, "it");
                this.b.q(aeunVar4, ((defpackage.ugm) this.a).c, rub.c);
                return aojh.a;
        }
    }

    public /* synthetic */ slv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
