package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adot implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ adot(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x02b4 A[Catch: all -> 0x02cd, TRY_LEAVE, TryCatch #8 {all -> 0x02cd, blocks: (B:74:0x025f, B:76:0x0265, B:77:0x0284, B:79:0x028a, B:80:0x02b4), top: B:163:0x025f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v92, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [aezm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v40, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v84, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ajct, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) throws java.lang.Throwable {
        ajcq ajcqVarZ;
        ajcq ajcqVarG;
        aaum aaumVarR;
        int i = 11;
        int i2 = 12;
        int i3 = 0;
        boolean zA = true;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                aimw aimwVarL = defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 486, "IncomingCallFlowManager.java");
                defpackage.adow adowVar = (defpackage.adow) this.a;
                aimwVarL.w("%d:pause():Starting shutdown sequence", adowVar.j);
                return adowVar.d(this.b);
            case 1:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = ((defpackage.adow) obj2).d;
                java.lang.Object obj4 = this.b;
                synchronized (obj3) {
                    if (((defpackage.adow) obj2).a() == defpackage.adov.d && ((j$.util.Optional) obj4).isPresent()) {
                        defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 475, "IncomingCallFlowManager.java").w("%d:pause():Playing pause message", ((defpackage.adow) obj2).j);
                        ((defpackage.adow) obj2).o.d(((defpackage.adow) obj2).i.e());
                        ajcqVarZ = ((defpackage.adow) obj2).e((adnw) ((j$.util.Optional) obj4).get());
                    } else {
                        defpackage.adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "pause", 479, "IncomingCallFlowManager.java").w("%d:pause():Skipping pause message", ((defpackage.adow) obj2).j);
                        ajcqVarZ = aiql.z((java.lang.Object) null);
                    }
                }
                return ajcqVarZ;
            case 2:
                defpackage.adow adowVar2 = (defpackage.adow) this.b;
                adowVar2.l();
                adowVar2.p(defpackage.adov.g, null, false);
                throw ((java.lang.Throwable) this.a);
            case 3:
                for (android.accounts.Account account : (java.util.List) obj) {
                    java.lang.Object obj5 = this.b;
                    if (((java.lang.String) obj5).equals(account.name)) {
                        java.lang.Object obj6 = this.a;
                        ajcq ajcqVarC = ((adak) ((ahbq) obj6).c).f(account).c();
                        return ahvr.ai(new ajcq[]{ajcqVarC}).o(new defpackage.wwx(obj6, obj5, ajcqVarC, 11, (int[]) null), ajbm.a);
                    }
                }
                return aiql.z((java.lang.Object) null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aemr aemrVar = (aemr) this.a;
                aemrVar.h((aemn) obj);
                return aemrVar.a.b((java.lang.String) this.b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzz akzzVarP = ((defpackage.aevu) obj).p();
                akzzVarP.u();
                defpackage.aevu aevuVar = akzzVarP.b;
                java.lang.Object obj7 = this.b;
                j$.util.Objects.requireNonNull(obj7);
                aevuVar.c = (apgu) obj7;
                aevuVar.b |= 1;
                defpackage.aevu aevuVarP = akzzVarP.p();
                defpackage.ahex ahexVar = (defpackage.ahex) this.a;
                return ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) ahexVar.d).a((android.content.Context) ahexVar.e, aevuVarP);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int i4 = defpackage.aezf.a;
                aift aiftVar = new aift(4);
                android.content.Context context = ((aewq) this.a).c;
                aiftVar.i(context);
                int i5 = abyl.a;
                aiftVar.i(abyl.a(context));
                aike aikeVarH = aiftVar.h();
                int i6 = aikeVarH.d;
                while (i3 < i6) {
                    java.lang.Object obj8 = this.b;
                    java.io.File file = new java.io.File(java.lang.String.valueOf(((android.content.Context) aikeVarH.get(i3)).getFilesDir()) + "/phenotype/shared/" + ((java.lang.String) obj8));
                    android.util.Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                    if (file.exists()) {
                        zA = defpackage.aezf.a(file);
                    }
                    i3++;
                }
                return zA ? ajcm.a : aiql.y(new java.io.IOException("Unable to remove snapshots for removed user"));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aezi aeziVar = (aezi) this.a;
                return ((aexi) aeziVar.a.eZ()).j(new aezh(aeziVar, (aezm) this.b));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj9 = this.a;
                return ajan.g((ajcq) this.b, ahqx.c(new adfd(obj9, 18)), ((afgx) obj9).c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return aiql.z(((afgx) this.b).c((android.net.Uri) this.a));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return aiql.z(((afgx) this.b).i((android.net.Uri) this.a));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ?? r13 = this.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(r13.size());
                java.util.Iterator it = r13.iterator();
                while (it.hasNext()) {
                    arrayList.add(new defpackage.adck((xtq) it.next(), this.a, 6));
                }
                evz evzVar = new evz(12);
                ajbm ajbmVar = ajbm.a;
                return ajan.f(defpackage.agwm.d(arrayList, evzVar, ajbmVar), ahqx.a(new aeqw(11)), ajbmVar);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.util.Pair pair = (android.util.Pair) obj;
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                ajcq ajcqVarW = ahvr.W(1289, "AccountUiService handle selection result");
                if (pair != null) {
                    try {
                        if (pair.first instanceof defpackage.agre) {
                            android.content.Intent intent = (android.content.Intent) pair.second;
                            ajcqVarG = ajan.f(aiql.z(intent), ahqx.a(new defpackage.agnw(obj11, 0)), ajbm.a);
                            ajcqVarW.a(ajcqVarG);
                        } else if (pair.first instanceof defpackage.agra) {
                            com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) pair.second;
                            ajcqVarG = ajan.g(((adag) ((defpackage.abtr) obj10).e).g(accountId), ahqx.c(new defpackage.aczq(obj10, obj11, accountId, 17, (int[]) null)), ajbm.a);
                            ajcqVarW.a(ajcqVarG);
                        } else {
                            ajcqVarG = aiql.z(new com.google.apps.tiktok.account.api.controller.AccountActionResult(null, agoq.a, null, null, (com.google.apps.tiktok.account.api.AccountOperationContext) obj11));
                            ajcqVarW.a(ajcqVarG);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            ajcqVarW.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    ajcqVarG = aiql.z(new com.google.apps.tiktok.account.api.controller.AccountActionResult(null, agoq.a, null, null, (com.google.apps.tiktok.account.api.AccountOperationContext) obj11));
                    ajcqVarW.a(ajcqVarG);
                }
                ajcqVarW.close();
                ajcqVarW = ajcqVarG;
                return ajcqVarW;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                zwj zwjVar = (zwj) obj;
                aooh.f(zwjVar, "e");
                agpt.a.b().k(zwjVar).l("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$<anonymous>$<anonymous>", 374, "GmsAccounts.kt").v("Fast Auth.getAccountId() Failed");
                java.lang.Object obj12 = this.a;
                java.lang.Object obj13 = this.b;
                ahoq ahoqVarW = ahvr.W(1297, "GoogleAuthUtilWrapper.getToken");
                try {
                    zwr zwrVar = ((agpt) obj12).g;
                    try {
                        aaumVarR = aazc.s(((zxi) zwrVar.b.eZ()).b(zwrVar.a, new android.accounts.Account((java.lang.String) obj13, "com.google"), "oauth2:https://www.googleapis.com/auth/userinfo.email"));
                        break;
                    } catch (zwj | java.io.IOException e) {
                        aaumVarR = aazc.r(e);
                    }
                    ajcq ajcqVarE = aazc.e(aaumVarR);
                    ahoqVarW.a(ajcqVarE);
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return ajck.w(ajcqVarE).y(ahqx.c(new defpackage.adot(obj12, obj13, 14)), ((agpt) obj12).b).x(ahqx.a(new aeqw(20)), ajbm.a);
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahoqVarW, th3);
                        throw th4;
                    }
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooh.f((java.lang.String) obj, "it");
                java.lang.Object obj14 = this.b;
                java.lang.Object obj15 = this.a;
                ahoq ahoqVarW2 = ahvr.W(1298, "GoogleAuthUtilWrapper.getAccountId");
                try {
                    ajcq ajcqVarE2 = aazc.e(((agpt) obj15).g.a((java.lang.String) obj14));
                    ahoqVarW2.a(ajcqVarE2);
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    return ajcqVarE2;
                } catch (java.lang.Throwable th5) {
                    try {
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak(ahoqVarW2, th5);
                        throw th6;
                    }
                }
            case 15:
                java.lang.Object obj16 = this.b;
                java.util.Set set = (java.util.Set) ((agqj) obj16).g.a();
                java.lang.Object obj17 = this.a;
                return agqj.a((defpackage.agos) obj17, set).c(ahqx.b(new defpackage.adck(obj16, obj17, i2)), ajbm.a);
            case 16:
                java.lang.Object obj18 = this.a;
                com.google.apps.tiktok.account.AccountId accountId2 = (com.google.apps.tiktok.account.AccountId) obj18;
                agqm agqmVarM = adai.m((agqk) obj, accountId2);
                int iAQ = a.aQ(agqmVarM.e);
                if (iAQ != 0 && iAQ == 2) {
                    return aiql.z((java.lang.Object) null);
                }
                java.lang.Object obj19 = this.b;
                defpackage.agos agosVar = new defpackage.agos(accountId2, aogc.H(agqmVarM).b);
                java.util.Set set2 = (java.util.Set) ((agqj) obj19).c.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(set2.size());
                java.util.Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    try {
                        java.lang.Object obj20 = ((defpackage.aprf) it2.next()).a;
                        arrayList2.add(((adai) obj20).a.eT(new defpackage.agrz(obj20, agosVar.a, 1, null)));
                    } catch (java.lang.Exception e2) {
                        arrayList2.add(aiql.y(e2));
                    }
                }
                anpu anpuVarAa = aiql.aa(arrayList2);
                ajas ajasVarB = ahqx.b(new defpackage.adck(obj19, obj18, i));
                ajbm ajbmVar2 = ajbm.a;
                return ajan.g(anpuVarAa.c(ajasVarB, ajbmVar2), ahqx.c(new defpackage.adot(obj19, agosVar, 15, bArr)), ajbmVar2);
            case 17:
                aihd aihdVarF = ahvr.am((java.util.Set) this.b, (java.util.Set) obj).f();
                adai adaiVar = ((defpackage.agqp) this.a).h;
                aike aikeVarL = adaiVar.l(aihdVarF, (aihd) null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int i7 = aikeVarL.d;
                while (i3 < i7) {
                    arrayList3.add(((adai) adaiVar.b).k((java.io.File) aikeVarL.get(i3)));
                    i3++;
                }
                return aiql.Y(arrayList3).b(new agqr(arrayList3, 1), ajbm.a);
            case 18:
                return ((defpackage.agro) this.b).q.f((com.google.apps.tiktok.account.AccountId) this.a);
            case 19:
                aexg aexgVar = (aexg) obj;
                ahoq ahoqVarX = ahvr.X(1375, "ConsistencyTierState.setNewValues", ahot.a, true);
                java.lang.Object obj21 = this.b;
                java.lang.Object obj22 = this.a;
                try {
                    if (((defpackage.ahdv) obj22).b.get(obj21) != ahav.b) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    java.lang.Object obj23 = ((defpackage.ahdv) obj22).e;
                    aooh.c(aexgVar);
                    ajcq ajcqVarF = ajan.f(((ahbq) obj23).a((java.lang.String) obj21, aexgVar), ahqx.a(new defpackage.agnx(obj22, obj21, 8)), ajbm.a);
                    ahoqVarX.a(ajcqVarF);
                    ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
                    return ajcqVarF;
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        ajsz.ak(ahoqVarX, th7);
                        throw th8;
                    }
                }
            default:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "packageName");
                aooh.f(str, "mendelPackage");
                return ((ahbz) this.b).e(str, (com.google.apps.tiktok.account.AccountId) this.a);
        }
    }

    public /* synthetic */ adot(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
