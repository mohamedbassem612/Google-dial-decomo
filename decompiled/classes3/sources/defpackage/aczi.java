package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczi implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aczi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v85, types: [acwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [acwi, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) throws java.lang.Throwable {
        int i = 11;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                aczk aczkVar = (aczk) obj2;
                android.content.SharedPreferences sharedPreferencesD = abrz.D(aczkVar.b, "gms_icing_mdd_manager_metadata", aczkVar.h);
                if (!sharedPreferencesD.contains("gms_icing_mdd_reset_trigger")) {
                    sharedPreferencesD.edit().putInt("gms_icing_mdd_reset_trigger", aczkVar.k.k()).commit();
                }
                int i2 = sharedPreferencesD.getInt("gms_icing_mdd_reset_trigger", 0);
                int iK = aczkVar.k.k();
                if (i2 >= iK) {
                    return ajcm.a;
                }
                sharedPreferencesD.edit().putInt("gms_icing_mdd_reset_trigger", iK).commit();
                int i3 = adbe.a;
                aczkVar.c.l(1045);
                adlt adltVar = aczkVar.m;
                return ahvr.I(ahvr.I(adltVar.e.c(), new defpackage.aczi(adltVar, 5), (java.util.concurrent.Executor) adltVar.h), new defpackage.aczi(obj2, 2), aczkVar.i);
            case 1:
                aczk aczkVar2 = (aczk) this.a;
                if (!aczkVar2.k.C()) {
                    return aiql.z(-1);
                }
                defpackage.adcs adcsVarE = defpackage.adcs.e(aczkVar2.l.b());
                defpackage.acyx acyxVar = new defpackage.acyx(7);
                ajbm ajbmVar = ajbm.a;
                return adcsVarE.b(java.io.IOException.class, acyxVar, ajbmVar).f(new defpackage.acyx(8), ajbmVar);
            case 2:
                java.lang.Object obj3 = this.a;
                aczk aczkVar3 = (aczk) obj3;
                return ahvr.I(aczkVar3.f.a(), new defpackage.acyq(obj3, i), aczkVar3.i);
            case 3:
                defpackage.acyx acyxVar2 = new defpackage.acyx(11);
                aczl aczlVar = (aczl) this.a;
                return aczlVar.c.a(acyxVar2, aczlVar.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.acwg acwgVar = (defpackage.acwg) obj;
                if (acwgVar != null) {
                    return aiql.z(acwgVar);
                }
                adbe.d("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", this.a);
                return aiql.y(new defpackage.aczv());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.util.List<defpackage.acwe> list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.Object obj4 = this.a;
                try {
                    for (defpackage.acwe acweVar : list) {
                        arrayList.add(ahvr.I(((adlt) obj4).e.e(acweVar), new defpackage.acze(obj4, acweVar, 6, bArr), (java.util.concurrent.Executor) ((adlt) obj4).h));
                    }
                } catch (java.lang.Exception unused) {
                    ((adlt) obj4).d.a();
                }
                return abrz.ac(arrayList).E(new xbw(obj4, 19), ((adlt) obj4).h);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                adbe.d("%s: Unable to modify file subscription for key %s", "SharedFileManager", this.a);
                return aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                adbe.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", this.a);
                return aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.util.List list2 = (java.util.List) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list2.iterator();
                while (true) {
                    java.lang.Object obj5 = this.a;
                    if (!it.hasNext()) {
                        return abrz.ac(arrayList2).E(new defpackage.wwg(list2, arrayList2, 20, bArr), ((aczx) obj5).a);
                    }
                    arrayList2.add(((aczx) obj5).g((defpackage.acwb) it.next()));
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((acvh) this.a).addSuppressed((java.io.IOException) obj);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return aiql.y((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                adbe.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", this.a);
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return aiql.y(ygVarB.d());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((acvh) this.a).addSuppressed((java.io.IOException) obj);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return aiql.y((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acwg acwgVar2 = (defpackage.acwg) obj;
                if (acwgVar2 != null) {
                    return aiql.z(acwgVar2);
                }
                adbe.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", this.a);
                yg ygVarB2 = acvh.b();
                ygVarB2.b = defpackage.acvg.SHARED_FILE_NOT_FOUND_ERROR;
                return aiql.y(ygVarB2.d());
            case 15:
                throw ((java.lang.Throwable) this.a);
            case 16:
                acwd acwdVar = (acwd) obj;
                defpackage.acwf acwfVar = acwdVar.f;
                if (acwfVar == null) {
                    acwfVar = defpackage.acwf.a;
                }
                if ((acwfVar.b & 1) != 0) {
                    defpackage.acwf acwfVar2 = acwdVar.f;
                    if (acwfVar2 == null) {
                        acwfVar2 = defpackage.acwf.a;
                    }
                    return aiql.z(acwfVar2);
                }
                java.lang.Object obj6 = this.a;
                defpackage.aczo aczoVar = new defpackage.aczo(obj6, 10);
                adbo adboVar = (adbo) obj6;
                java.util.concurrent.Executor executor = adboVar.a;
                return defpackage.adcs.e(adboVar.c.a(aczoVar, executor)).g(new defpackage.aczi(obj6, 17), executor).f(new aczn(12), executor);
            case 17:
                return ((adbo) this.a).c.c();
            case 18:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                ahyn ahynVar = ahwt.a;
                for (acux acuxVar : (java.util.List) obj) {
                    if (acuxVar != null && !acuxVar.c.isEmpty()) {
                        java.lang.Object obj7 = this.a;
                        defpackage.aliq aliqVar = new defpackage.aliq(null, null);
                        aliqVar.o(acuxVar);
                        aliqVar.c = ahynVar;
                        defpackage.acuo acuoVarN = aliqVar.n();
                        defpackage.vqy vqyVar = (defpackage.vqy) obj7;
                        ?? r8 = vqyVar.c;
                        ajcq ajcqVarA = r8.a(acuoVarN);
                        vqyVar.d(ajcqVarA, acuxVar.c, ahynVar, ahynVar);
                        arrayList3.add(ajcqVarA);
                        for (android.accounts.Account account : vqyVar.b) {
                            aliqVar.b = ahyn.h(account);
                            ajcq ajcqVarA2 = r8.a(aliqVar.n());
                            vqyVar.d(ajcqVarA2, acuxVar.c, ahyn.h(account), ahynVar);
                            arrayList3.add(ajcqVarA2);
                        }
                    }
                }
                return abrz.ac(arrayList3).D(new defpackage.zpk(arrayList3, 8), ajbm.a);
            case 19:
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.a;
                akzx akzxVarP = ((defpackage.adco) atomicReference.get()).p();
                akzxVarP.u();
                defpackage.adco adcoVar = (defpackage.adco) akzxVarP.b;
                adcoVar.e = 3;
                adcoVar.b |= 4;
                atomicReference.set((defpackage.adco) akzxVarP.p());
                return ajcm.a;
            default:
                ahyn ahynVar2 = (ahyn) obj;
                if (!ahynVar2.f() || ((acux) ahynVar2.b()).c.isEmpty()) {
                    int i4 = adbe.a;
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                ?? r12 = this.a;
                defpackage.aliq aliqVar2 = new defpackage.aliq(null, null);
                aliqVar2.o((acux) ahynVar2.b());
                return r12.a(aliqVar2.n());
        }
    }
}
