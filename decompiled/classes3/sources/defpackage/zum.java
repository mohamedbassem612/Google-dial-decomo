package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zum implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ zum(java.lang.Object obj, alad aladVar, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = aladVar;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [albh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Object, zuq] */
    /* JADX WARN: Type inference failed for: r13v46, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v87, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, zta] */
    /* JADX WARN: Type inference failed for: r1v3, types: [albh, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int i = 14;
        int i2 = 3;
        int i3 = 4;
        final int i4 = 0;
        final int i5 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.afpl afplVar = (defpackage.afpl) obj;
                defpackage.zul zulVar = (defpackage.zul) afplVar.b;
                if (!zulVar.equals(defpackage.zul.a)) {
                    return aiql.z(defpackage.afpl.af(zulVar));
                }
                j$.util.Optional optional = (j$.util.Optional) afplVar.a;
                if (!optional.isPresent()) {
                    return aiql.z(defpackage.afpl.af(defpackage.zul.b));
                }
                java.lang.Object obj2 = this.c;
                ?? r1 = this.b;
                defpackage.zur zurVar = (defpackage.zur) this.a;
                defpackage.zup zupVar = new defpackage.zup(zurVar, ((com.google.android.gms.wearable.internal.NodeParcelable) optional.orElseThrow()).a, (java.lang.String) obj2, r1.i());
                final defpackage.aawd aawdVar = zurVar.d;
                j$.util.Objects.requireNonNull(aawdVar);
                return zupVar.a(new defpackage.zuq() { // from class: zuo
                    @Override // defpackage.zuq
                    public final aaum a(java.lang.String str, java.lang.String str2, byte[] bArr) {
                        int i6 = i5;
                        defpackage.aawd aawdVar2 = aawdVar;
                        return i6 != 0 ? aawdVar2.b(str, str2, bArr) : aawdVar2.c(str, str2, bArr);
                    }
                }, "Sending message");
            case 1:
                defpackage.zsz zszVar = (defpackage.zsz) obj;
                java.lang.Object obj3 = this.a;
                if (zszVar == defpackage.zsz.DECISION_RUN_WITHOUT_UI) {
                    return ahvr.H(this.c.c((defpackage.zrx) obj3), new defpackage.ymu(i2), (java.util.concurrent.Executor) ((defpackage.uzx) this.b).a);
                }
                akzx akzxVarM = defpackage.zsr.a.m();
                akzxVarM.u();
                defpackage.zsr zsrVar = (defpackage.zsr) akzxVarM.b;
                j$.util.Objects.requireNonNull(obj3);
                zsrVar.d = (defpackage.zrx) obj3;
                zsrVar.b |= 2;
                akzxVarM.u();
                defpackage.zsr zsrVar2 = (defpackage.zsr) akzxVarM.b;
                zsrVar2.c = zszVar.g;
                zsrVar2.b |= 1;
                return aiql.z((defpackage.zsr) akzxVarM.p());
            case 2:
                defpackage.afpl afplVar2 = (defpackage.afpl) obj;
                defpackage.zul zulVar2 = (defpackage.zul) afplVar2.b;
                if (!zulVar2.equals(defpackage.zul.a)) {
                    return aiql.z(defpackage.afpl.af(zulVar2));
                }
                j$.util.Optional optional2 = (j$.util.Optional) afplVar2.a;
                if (!optional2.isPresent()) {
                    return aiql.z(defpackage.afpl.af(defpackage.zul.b));
                }
                ?? r0 = this.b;
                java.lang.Object obj4 = this.c;
                defpackage.zur zurVar2 = (defpackage.zur) this.a;
                defpackage.zup zupVar2 = new defpackage.zup(zurVar2, ((com.google.android.gms.wearable.internal.NodeParcelable) optional2.orElseThrow()).a, (java.lang.String) obj4, r0.i());
                final defpackage.aawd aawdVar2 = zurVar2.d;
                j$.util.Objects.requireNonNull(aawdVar2);
                return zupVar2.a(new defpackage.zuq() { // from class: zuo
                    @Override // defpackage.zuq
                    public final aaum a(java.lang.String str, java.lang.String str2, byte[] bArr) {
                        int i6 = i4;
                        defpackage.aawd aawdVar3 = aawdVar2;
                        return i6 != 0 ? aawdVar3.b(str, str2, bArr) : aawdVar3.c(str, str2, bArr);
                    }
                }, "Sending request");
            case 3:
                aacw aacwVar = (java.lang.Throwable) obj;
                if (!(aacwVar instanceof aacw)) {
                    a.by(defpackage.zur.a.c(), "Failed to send message", "com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl$MessageSenderWithRetry", "executeWithRetry", (char) 213, "DialerMessageSenderImpl.java", aacwVar);
                    return ahvr.N(defpackage.afpl.af(defpackage.zul.d));
                }
                aacw aacwVar2 = aacwVar;
                defpackage.zup zupVar3 = (defpackage.zup) this.a;
                defpackage.zur.a.c().k(aacwVar).i(zct.b).l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl$MessageSenderWithRetry", "executeWithRetry", 222, "DialerMessageSenderImpl.java").G("Failed to send message to %s. Status code %d", zupVar3.b.b, aacwVar2.a());
                if (aacwVar2.a() != 7) {
                    return ahvr.N(defpackage.afpl.af(defpackage.zul.d));
                }
                int i6 = zupVar3.a;
                if (i6 > 2) {
                    return ahvr.N(defpackage.afpl.af(defpackage.zul.c));
                }
                java.lang.Object obj5 = this.c;
                ?? r13 = this.b;
                zupVar3.a = i6 + 1;
                return zupVar3.a(r13, (java.lang.String) obj5);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ailj ailjVarK = ((aifo) this.b).k();
                    while (ailjVarK.hasNext()) {
                        java.lang.Object obj6 = this.c;
                        java.lang.Object obj7 = this.a;
                        java.lang.String str = (java.lang.String) ailjVarK.next();
                        com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService messageBasedBlockingService = (com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService) obj7;
                        agsm agsmVar = messageBasedBlockingService.f;
                        ucr ucrVar = messageBasedBlockingService.d;
                        akzx akzxVarM2 = defpackage.ucq.a.m();
                        akzxVarM2.u();
                        defpackage.ucq ucqVar = (defpackage.ucq) akzxVarM2.b;
                        ucqVar.b |= 4;
                        ucqVar.e = 2;
                        akzxVarM2.u();
                        defpackage.ucq ucqVar2 = (defpackage.ucq) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(obj6);
                        ucqVar2.b |= 2;
                        ucqVar2.d = (java.lang.String) obj6;
                        akzx akzxVarM3 = aivu.a.m();
                        java.lang.String strCo = ahvr.co(str);
                        akzxVarM3.u();
                        aivu aivuVar = akzxVarM3.b;
                        j$.util.Objects.requireNonNull(strCo);
                        aivuVar.b |= 8;
                        aivuVar.g = strCo;
                        akzxVarM3.u();
                        aivu aivuVar2 = akzxVarM3.b;
                        aivuVar2.i = wsc.bH(2) - 1;
                        aivuVar2.b |= 32;
                        akzxVarM3.u();
                        aivu aivuVar3 = akzxVarM3.b;
                        aivuVar3.o = 4;
                        aivuVar3.b |= 4096;
                        defpackage.rms rmsVar = defpackage.rms.UNKNOWN_LOOKUP_RESULT_TYPE;
                        akzxVarM3.u();
                        aivu aivuVar4 = akzxVarM3.b;
                        aivuVar4.q = rmsVar.B;
                        aivuVar4.b |= 16384;
                        rmt rmtVar = rmt.a;
                        akzxVarM3.u();
                        aivu aivuVar5 = akzxVarM3.b;
                        aivuVar5.r = rmtVar.q;
                        aivuVar5.b |= 32768;
                        akzxVarM3.u();
                        aivu aivuVar6 = akzxVarM3.b;
                        j$.util.Objects.requireNonNull("thirdpartydialer");
                        aivuVar6.b |= 1;
                        aivuVar6.d = "thirdpartydialer";
                        aivt aivtVar = aivt.c;
                        akzxVarM3.u();
                        aivu aivuVar7 = akzxVarM3.b;
                        aivuVar7.f = aivtVar.e;
                        aivuVar7.b |= 4;
                        akzxVarM2.u();
                        defpackage.ucq ucqVar3 = (defpackage.ucq) akzxVarM2.b;
                        aivu aivuVarP = akzxVarM3.p();
                        j$.util.Objects.requireNonNull(aivuVarP);
                        ucqVar3.c = aivuVarP;
                        ucqVar3.b |= 1;
                        agsmVar.g(ucrVar.e(akzxVarM2), 5L, java.util.concurrent.TimeUnit.SECONDS);
                    }
                }
                return aiql.z((java.lang.Object) null);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                adub adubVar = (adtz) obj;
                aooh.f(adubVar, "result");
                if (!(adubVar instanceof adub) || !((abzt) adubVar.a).a()) {
                    return aiql.z(aojh.a);
                }
                java.lang.Object obj8 = this.c;
                defpackage.afpl afplVar3 = (defpackage.afpl) ((acea) this.a).v.a();
                akhp akhpVar = ((akhl) obj8).j;
                if (akhpVar == null) {
                    akhpVar = akhp.a;
                }
                akhp akhpVar2 = akhpVar;
                java.lang.Object obj9 = this.b;
                aooh.e(akhpVar2, "getOnDeviceCapping(...)");
                aooh.f(obj9, "presentedPromo");
                aooh.f(akhpVar2, "onDeviceImpressionCap");
                return aosv.F((aoss) afplVar3.a, 0, new defpackage.xhb(afplVar3, (akhi) obj9, akhpVar2, (aoln) null, 6), 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                acln aclnVar = (acln) this.a;
                zzd zzdVarA = ((defpackage.acly) this.c).a(aclnVar);
                if (zzdVarA == null) {
                    return ajcm.a;
                }
                defpackage.aclx aclxVar = (defpackage.aclx) this.b;
                zzc zzcVarH = zzdVarA.h(aclxVar.b, (zzu) ahyn.g((java.lang.Object) null).d(new defpackage.aclz()));
                ((zyy) zzcVarH).j = aclxVar.a;
                defpackage.aiva aivaVar = aclxVar.c;
                if (aivaVar != null) {
                    ((zyy) zzcVarH).c = aivaVar;
                }
                java.lang.Integer num = aclxVar.d;
                if (num != null) {
                    zzcVarH.m(num.intValue());
                }
                if (aclxVar.i != 1) {
                    ((zyy) zzcVarH).o = 0;
                }
                if (!((zyy) zzcVarH).a.d()) {
                    zzcVarH.g(aclxVar.f);
                }
                int[] iArr = aclxVar.g;
                if (iArr != null) {
                    while (i4 < iArr.length) {
                        int i7 = iArr[i4];
                        if (((zyy) zzcVarH).d == null) {
                            ((zyy) zzcVarH).d = new java.util.ArrayList();
                        }
                        ((zyy) zzcVarH).d.add(java.lang.Integer.valueOf(i7));
                        i4++;
                    }
                }
                zzl zzlVar = aclxVar.h;
                if (zzlVar != null) {
                    int i8 = zzlVar.b;
                    if (i8 != 6) {
                        android.util.Log.e("AbstractLogEventBuilder", "The given event-level ProductIdOrigin value " + java.lang.Integer.toString(i8 - 1) + " is not one of the values expected for a value set at the event-level: 5 or 6");
                    } else {
                        ((zyy) zzcVarH).m = zzlVar;
                    }
                }
                int i9 = aclnVar.b - 1;
                if (i9 == 0) {
                    zzcVarH.k(aclnVar.a);
                } else if (i9 == 1) {
                    zzcVarH.k((java.lang.String) null);
                } else if (i9 != 2) {
                    throw new java.lang.IllegalArgumentException("Dropped logs must not be logged.");
                }
                if (android.util.Log.isLoggable("Logging.Clearcut", 3)) {
                    android.util.Log.d("Logging.Clearcut", zzcVarH.toString());
                }
                return aazc.e(zzcVarH.d());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                acwx acwxVar = (acwx) this.b;
                return acwxVar.d.c((defpackage.acwb) this.a, (ahyn) this.c, acwxVar.i);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                acwx acwxVar2 = (acwx) this.c;
                defpackage.acvu acvuVar = (defpackage.acvu) obj;
                return acwx.n(acvuVar, acwx.h((defpackage.acwb) this.b, acvuVar, acwxVar2.e), (java.lang.String) null, ((defpackage.acvj) this.a).h, acwxVar2.d, acwxVar2.f, acwxVar2.l);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                acwx acwxVar3 = (acwx) this.b;
                return acwxVar3.d.c((defpackage.acwb) this.a, (ahyn) this.c, acwxVar3.i);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((acwx) this.a).b.b((java.lang.String) this.c, ahwt.a, (ahyn) this.b);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Throwable cause = (java.lang.Exception) obj;
                if (cause instanceof java.util.concurrent.ExecutionException) {
                    java.util.concurrent.ExecutionException executionException = (java.util.concurrent.ExecutionException) cause;
                    if (executionException.getCause() != null) {
                        cause = executionException.getCause();
                    }
                }
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.c;
                java.lang.Object obj12 = this.a;
                ahvr.ci(cause);
                acwx acwxVar4 = (acwx) obj12;
                return defpackage.adcs.e(acwxVar4.b.b((java.lang.String) obj11, ahyn.h(cause), (ahyn) obj10)).g(new defpackage.acwk(cause, i3), acwxVar4.f);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.acvu acvuVar2 = (defpackage.acvu) obj;
                if (acvuVar2 == null) {
                    int i10 = adbe.a;
                } else {
                    int i11 = adbe.a;
                }
                java.lang.Object obj13 = this.b;
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.c;
                acwx acwxVar5 = (acwx) obj15;
                defpackage.acwb acwbVar = (defpackage.acwb) obj13;
                ahyn ahynVarH = acwx.h(acwbVar, acvuVar2, acwxVar5.e);
                java.lang.String str2 = (acwbVar.b & 4) != 0 ? acwbVar.e : null;
                boolean z = ((defpackage.acvn) obj14).b;
                aczk aczkVar = acwxVar5.d;
                java.util.concurrent.Executor executor = acwxVar5.f;
                return ahvr.H(acwx.n(acvuVar2, ahynVarH, str2, z, aczkVar, executor, acwxVar5.l), new defpackage.zqi(obj15, i), executor);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                acwx acwxVar6 = (acwx) this.c;
                defpackage.acvu acvuVar3 = (defpackage.acvu) obj;
                return acwx.n(acvuVar3, acwx.h((defpackage.acwb) this.b, acvuVar3, acwxVar6.e), (java.lang.String) null, ((defpackage.acvj) this.a).h, acwxVar6.d, acwxVar6.f, acwxVar6.l);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((acyu) this.c).d.l((defpackage.acwb) this.b, (defpackage.acvu) this.a);
            case 15:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return this.c;
                }
                java.lang.Object obj16 = this.a;
                ((acyu) this.b).b.l(1036);
                return aiql.y(new java.io.IOException("Failed to write updated group: ".concat(java.lang.String.valueOf(((defpackage.acwb) obj16).c))));
            case 16:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj17 = this.b;
                    java.lang.Object obj18 = this.a;
                    java.lang.Object obj19 = this.c;
                    defpackage.acvr acvrVar = (defpackage.acvr) obj18;
                    defpackage.acvu acvuVar4 = (defpackage.acvu) obj17;
                    adbe.e("%s: Failed to set new state for file %s, filegroup %s", new java.lang.Object[]{"FileGroupManager", acvrVar.c, acvuVar4.d});
                    acyu.B(((acyu) obj19).b, acvuVar4, acvrVar, 14);
                }
                return ajcm.a;
            case 17:
                ahyn ahynVar = ((acyu) this.c).h;
                if (ahynVar.f()) {
                    defpackage.acvu acvuVar5 = (defpackage.acvu) this.a;
                    int iY = afsq.Y(acvuVar5.r);
                    if (iY != 0 && iY != 1) {
                        java.lang.Object obj20 = this.b;
                        defpackage.adez adezVar = (defpackage.adez) ((ahzi) ahynVar.b()).eZ();
                        int i12 = acvuVar5.r;
                        java.lang.String str3 = ((defpackage.acwb) obj20).c;
                        return adezVar.a();
                    }
                }
                return aiql.z(java.lang.Boolean.TRUE);
            case 18:
                java.lang.Object obj21 = this.a;
                acyu acyuVar = (acyu) this.b;
                acyu.A(1062, acyuVar.b, (defpackage.acvu) obj21);
                return acyuVar.i.y() ? acyuVar.q(acyuVar.d.i(((defpackage.adac) this.c).a), new defpackage.acwn(5)) : ajcm.a;
            case 19:
                acvh acvhVar = (java.lang.Exception) obj;
                defpackage.acvu acvuVar6 = (defpackage.acvu) ((java.util.concurrent.atomic.AtomicReference) this.c).get();
                if (acvuVar6 == null) {
                    acvuVar6 = defpackage.acvu.a;
                }
                defpackage.acvu acvuVar7 = acvuVar6;
                java.lang.Object obj22 = this.a;
                java.lang.Object obj23 = this.b;
                boolean z2 = acvhVar instanceof acvh;
                ajcq ajcqVarQ = ajcm.a;
                if (z2) {
                    acvh acvhVar2 = acvhVar;
                    defpackage.acvg acvgVar = acvhVar2.a;
                    int i13 = adbe.a;
                    ajcqVarQ = ((acyu) obj23).q(ajcqVarQ, new defpackage.acyj(obj23, (alad) obj22, (java.lang.Object) acvhVar2, (java.lang.Object) acvuVar7, 1));
                } else if (acvhVar instanceof acup) {
                    int i14 = adbe.a;
                    aike aikeVar = ((acup) acvhVar).a;
                    int i15 = aikeVar.d;
                    while (i4 < i15) {
                        acvh acvhVar3 = (java.lang.Throwable) aikeVar.get(i4);
                        if (acvhVar3 instanceof acvh) {
                            ajcqVarQ = ((acyu) obj23).q(ajcqVarQ, new defpackage.acyj(obj23, (alad) obj22, (java.lang.Object) acvhVar3, (java.lang.Object) acvuVar7, 0));
                        } else {
                            adbe.c("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        }
                        i4++;
                    }
                }
                return ((acyu) obj23).q(ajcqVarQ, new defpackage.acwk(acvhVar, 17));
            default:
                aigf aigfVar = (aigf) obj;
                ?? r2 = this.c;
                java.lang.Object obj24 = this.b;
                java.lang.Object obj25 = this.a;
                for (defpackage.acvr acvrVar2 : r2) {
                    try {
                        android.net.Uri uri = (android.net.Uri) ((aigf) obj24).get(acvrVar2);
                        ahvr.ci(uri);
                        android.net.Uri uri2 = (android.net.Uri) aigfVar.get(acvrVar2);
                        ahvr.ci(uri2);
                        android.net.Uri uri3 = android.net.Uri.parse(uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                        aogc aogcVar = ((acyu) obj25).m;
                        if (!aogcVar.R(uri3)) {
                            aogcVar.N(uri3);
                        }
                        afsq.aa(((acyu) obj25).a, uri, uri2);
                    } catch (java.io.IOException | java.lang.NullPointerException e) {
                        yg ygVarB = acvh.b();
                        ygVarB.b = defpackage.acvg.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                        ygVarB.d = "Unable to create symlink";
                        ygVarB.c = e;
                        return aiql.y(ygVarB.d());
                    }
                }
                return ajcm.a;
        }
    }

    public /* synthetic */ zum(java.lang.Object obj, java.lang.Object obj2, alad aladVar, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = aladVar;
    }

    public /* synthetic */ zum(java.lang.Object obj, java.lang.Object obj2, alad aladVar, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = aladVar;
    }

    public /* synthetic */ zum(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ zum(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ zum(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
