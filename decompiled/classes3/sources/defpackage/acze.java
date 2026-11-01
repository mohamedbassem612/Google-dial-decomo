package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acze implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ acze(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v41, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v54, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v64, types: [adaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v77, types: [acwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v27, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [adaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [acxa, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        acvh acvhVarD;
        switch (this.$cid) {
            case 0:
                if (((defpackage.acyt) obj) == defpackage.acyt.b) {
                    ?? r15 = this.b;
                    java.lang.Object obj2 = this.a;
                    defpackage.acvu acvuVar = (defpackage.acvu) aiql.H((java.util.concurrent.Future) r15);
                    ahvr.ci(acvuVar);
                    ((aczk) obj2).c.m(1034, acvuVar.d, acvuVar.f, acvuVar.s, acvuVar.t);
                }
                return ajcm.a;
            case 1:
                aczk aczkVar = (aczk) this.a;
                if (!aczkVar.k.R()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.b;
                aczkVar.c.l(1032);
                acyu acyuVar = aczkVar.d;
                return acyuVar.q(acyuVar.d.d(), ahqx.c(new defpackage.acyg(acyuVar, obj3, 10)));
            case 2:
                return aczk.f(((defpackage.adac) this.b).b);
            case 3:
                defpackage.adac adacVar = (defpackage.adac) this.b;
                defpackage.acvu acvuVar2 = adacVar.b;
                defpackage.acvs acvsVar = acvuVar2.c;
                if (acvsVar == null) {
                    acvsVar = defpackage.acvs.a;
                }
                java.lang.Object obj4 = this.a;
                akzx akzxVarP = acvsVar.p();
                akzxVarP.u();
                defpackage.acvs acvsVar2 = (defpackage.acvs) akzxVarP.b;
                acvsVar2.b |= 32;
                acvsVar2.h = true;
                defpackage.acvs acvsVar3 = (defpackage.acvs) akzxVarP.p();
                akzx akzxVarP2 = acvuVar2.p();
                akzxVarP2.u();
                defpackage.acvu acvuVar3 = (defpackage.acvu) akzxVarP2.b;
                j$.util.Objects.requireNonNull(acvsVar3);
                acvuVar3.c = acvsVar3;
                acvuVar3.b |= 1;
                aczk aczkVar2 = (aczk) obj4;
                return ahvr.H(aczkVar2.e.l(adacVar.a, (defpackage.acvu) akzxVarP2.p()), new defpackage.acyx(5), aczkVar2.i);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((aczp) this.b).i((defpackage.aczc) this.a);
                return aiql.y((java.lang.Exception) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((aczp) this.b).i((defpackage.aczc) this.a);
                return aiql.z((java.lang.Boolean) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.acwg acwgVar = (defpackage.acwg) obj;
                if (acwgVar == null) {
                    adbe.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return aiql.y(new defpackage.aczv());
                }
                defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
                if (acwaVarB == null) {
                    acwaVarB = defpackage.acwa.NONE;
                }
                if (acwaVarB != defpackage.acwa.DOWNLOAD_COMPLETE) {
                    java.lang.Object obj5 = this.a;
                    java.lang.Object obj6 = this.b;
                    defpackage.acwe acweVar = (defpackage.acwe) obj5;
                    int iAQ = a.aQ(acweVar.f);
                    adlt adltVar = (adlt) obj6;
                    android.net.Uri uriP = abrz.P((android.content.Context) adltVar.l, iAQ == 0 ? 1 : iAQ, acwgVar.c, acweVar.e, (acxa) adltVar.d, (ahyn) adltVar.i, false);
                    if (uriP != null) {
                        ((adax) adltVar.f).d(acweVar.e, uriP);
                    }
                    defpackage.acwa acwaVarB2 = defpackage.acwa.b(acwgVar.d);
                    if (acwaVarB2 == null) {
                        acwaVarB2 = defpackage.acwa.NONE;
                    }
                    if (acwaVarB2 == defpackage.acwa.DOWNLOAD_IN_PROGRESS) {
                        ?? r1 = adltVar.e;
                        akzx akzxVarP3 = acwgVar.p();
                        defpackage.acwa acwaVar = defpackage.acwa.SUBSCRIBED;
                        akzxVarP3.u();
                        defpackage.acwg acwgVar2 = (defpackage.acwg) akzxVarP3.b;
                        acwgVar2.d = acwaVar.h;
                        acwgVar2.b |= 2;
                        return ahvr.I(r1.h(acweVar, (defpackage.acwg) akzxVarP3.p()), new defpackage.acwn(8), (java.util.concurrent.Executor) adltVar.h);
                    }
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (((defpackage.acwg) obj) != null) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                java.lang.Object obj7 = this.a;
                adlt adltVar2 = (adlt) this.b;
                android.content.SharedPreferences sharedPreferencesD = abrz.D((android.content.Context) adltVar2.l, "gms_icing_mdd_shared_file_manager_metadata", (ahyn) adltVar2.i);
                long j = sharedPreferencesD.getLong("next_file_name_v2", java.lang.System.currentTimeMillis());
                if (!sharedPreferencesD.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    adbe.d("%s: Unable to update file name %s", "SharedFileManager", obj7);
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.String strBz = a.bz(j, "datadownloadfile_");
                akzx akzxVarM = defpackage.acwg.a.m();
                defpackage.acwa acwaVar2 = defpackage.acwa.SUBSCRIBED;
                akzxVarM.u();
                defpackage.acwg acwgVar3 = (defpackage.acwg) akzxVarM.b;
                acwgVar3.d = acwaVar2.h;
                acwgVar3.b |= 2;
                akzxVarM.u();
                defpackage.acwg acwgVar4 = (defpackage.acwg) akzxVarM.b;
                j$.util.Objects.requireNonNull(strBz);
                acwgVar4.b |= 1;
                acwgVar4.c = strBz;
                return ahvr.I(adltVar2.e.h((defpackage.acwe) obj7, (defpackage.acwg) akzxVarM.p()), new defpackage.aczi(obj7, 7), (java.util.concurrent.Executor) adltVar2.h);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.acwg acwgVar5 = (defpackage.acwg) obj;
                java.lang.Object obj8 = this.a;
                if (acwgVar5 == null) {
                    adbe.d("%s: No file entry with key %s", "SharedFileManager", obj8);
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj9 = this.b;
                defpackage.acwe acweVar2 = (defpackage.acwe) obj8;
                int iAQ2 = a.aQ(acweVar2.f);
                adlt adltVar3 = (adlt) obj9;
                android.net.Uri uriP2 = abrz.P((android.content.Context) adltVar3.l, iAQ2 == 0 ? 1 : iAQ2, acwgVar5.c, acweVar2.e, (acxa) adltVar3.d, (ahyn) adltVar3.i, false);
                if (uriP2 != null) {
                    ((adax) adltVar3.f).d(acweVar2.e, uriP2);
                }
                return ahvr.I(adltVar3.e.g(acweVar2), new defpackage.aczi(obj8, 6), (java.util.concurrent.Executor) adltVar3.h);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aigf aigfVar = (aigf) obj;
                aigb aigbVar = new aigb(4);
                ailj ailjVarK = ((aihd) this.b).k();
                while (ailjVarK.hasNext()) {
                    defpackage.acwe acweVar3 = (defpackage.acwe) ailjVarK.next();
                    if (!aigfVar.containsKey(acweVar3)) {
                        adbe.d("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", acweVar3);
                        return aiql.y(new defpackage.aczv());
                    }
                    java.lang.Object obj10 = this.a;
                    defpackage.acwg acwgVar6 = (defpackage.acwg) aigfVar.get(acweVar3);
                    int iAQ3 = a.aQ(acweVar3.f);
                    adlt adltVar4 = (adlt) obj10;
                    android.net.Uri uriP3 = abrz.P((android.content.Context) adltVar4.l, iAQ3 == 0 ? 1 : iAQ3, acwgVar6.c, acwgVar6.g, (acxa) adltVar4.d, (ahyn) adltVar4.i, acwgVar6.e);
                    if (uriP3 != null) {
                        aigbVar.i(acweVar3, uriP3);
                    }
                }
                return aiql.z(aigbVar.e(false));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                adbe.d("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", this.a);
                ((adlt) this.b).d.a();
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.SHARED_FILE_NOT_FOUND_ERROR;
                ygVarB.c = (defpackage.aczv) obj;
                return aiql.y(ygVarB.d());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.adas adasVar = (defpackage.adas) this.b;
                defpackage.acvr acvrVar = adasVar.d;
                java.lang.String str = acvrVar.g;
                aogc aogcVar = adasVar.o;
                java.lang.Object obj11 = this.a;
                if (defpackage.adau.e(aogcVar, (android.net.Uri) obj11, str)) {
                    return defpackage.adat.c(defpackage.acwa.DOWNLOAD_COMPLETE, acvrVar, adasVar.m, adasVar.b, adasVar.l);
                }
                adbe.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", obj11);
                yg ygVarB2 = acvh.b();
                ygVarB2.b = defpackage.acvg.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return aiql.y(ygVarB2.d());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return this.b.a((android.net.Uri) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                acvh acvhVar = (java.lang.Exception) obj;
                if (acvhVar instanceof acvh) {
                    acvhVarD = acvhVar;
                } else {
                    yg ygVarB3 = acvh.b();
                    ygVarB3.c = acvhVar;
                    ygVarB3.b = defpackage.acvg.UNKNOWN_ERROR;
                    acvhVarD = ygVarB3.d();
                }
                return ahvr.I(this.a.b(acvhVarD), new defpackage.aczi(acvhVar, 15), ((adax) this.b).f);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj12 = this.b;
                aogc aogcVar2 = (aogc) this.a;
                return ((ahbq) (zBooleanValue ? aogcVar2.c : aogcVar2.b)).g((java.lang.String) obj12);
            case 15:
                java.lang.Object obj13 = this.b;
                return defpackage.vqy.e(this.a, (defpackage.acvd) obj, ((adcn) obj13).e, aike.a);
            case 16:
                adfl adflVar = (adfl) obj;
                if (((akof) this.b).b.size() > 0) {
                    akof akofVar = adflVar.b;
                    if (akofVar == null) {
                        akofVar = akof.a;
                    }
                    if (akofVar.b.size() == 0) {
                        adff adffVar = (adff) this.a;
                        adqg adqgVar = adffVar.e;
                        ((afgk) ((adak) adqgVar.b).a).a((android.net.Uri) adqgVar.a);
                        return adffVar.f.ad();
                    }
                }
                return aiql.z(adflVar);
            case 17:
                ahyn ahynVar = (ahyn) obj;
                if (!ahynVar.f()) {
                    return aiql.z(((adff) this.a).a());
                }
                if (adff.j((adfl) this.b)) {
                    return aiql.z(ahynVar);
                }
                afsq.X((java.io.InputStream) ahynVar.b());
                return aiql.y(new defpackage.adfc());
            case 18:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj14 = this.b;
                if (!zBooleanValue2) {
                    defpackage.adow.a.d().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "startInternal", 288, "IncomingCallFlowManager.java").w("%d:start():Unpaused message was not fully played.", ((defpackage.adow) obj14).j);
                }
                defpackage.adow adowVar = (defpackage.adow) obj14;
                return !adowVar.m ? adowVar.e((adnw) this.a) : aiql.z(java.lang.Boolean.TRUE);
            case 19:
                java.lang.String string = java.util.UUID.randomUUID().toString();
                defpackage.adow adowVar2 = (defpackage.adow) this.b;
                return adowVar2.o.a((java.io.File) obj, new adou(adowVar2, adowVar2.b, (adnw) this.a, string), adowVar2.g, adowVar2.h);
            default:
                defpackage.adso adsoVar = (defpackage.adso) obj;
                defpackage.adow.a.c().k(adsoVar).l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "playAudioMessage", 746, "IncomingCallFlowManager.java").B("%d:Error during uplink audio playback for message text: %s", ((defpackage.adow) this.b).j, defpackage.adow.i((adnw) this.a));
                return aiql.y(new adof(adsoVar, defpackage.adoe.c));
        }
    }

    public /* synthetic */ acze(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
