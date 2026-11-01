package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wie implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wie(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v17, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 5;
        int i2 = 16;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                defpackage.wqs wqsVar = (defpackage.wqs) obj;
                akzx akzxVarM = defpackage.uts.a.m();
                int size = wqsVar.c.size();
                defpackage.utw utwVar = defpackage.utw.a;
                akzx akzxVarM2 = utwVar.m();
                java.lang.String str = (java.lang.String) this.a;
                java.lang.String strBS = afsq.bS(str, "activated");
                akzxVarM2.u();
                defpackage.utw utwVar2 = (defpackage.utw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strBS);
                utwVar2.b |= 1;
                utwVar2.c = strBS;
                java.lang.String string = java.lang.Boolean.toString(size > 0);
                akzxVarM2.u();
                defpackage.utw utwVar3 = (defpackage.utw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string);
                utwVar3.b |= 2;
                utwVar3.d = string;
                akzxVarM.U((defpackage.utw) akzxVarM2.p());
                if (size == 0) {
                    return (defpackage.uts) akzxVarM.p();
                }
                boolean zAnyMatch = j$.util.Collection.-EL.stream(wqsVar.c).anyMatch(new vgb(16));
                akzx akzxVarM3 = utwVar.m();
                java.lang.String strBS2 = afsq.bS(str, "show_ahead_activated");
                akzxVarM3.u();
                defpackage.utw utwVar4 = (defpackage.utw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(strBS2);
                utwVar4.b |= 1;
                utwVar4.c = strBS2;
                java.lang.String string2 = java.lang.Boolean.toString(zAnyMatch);
                akzxVarM3.u();
                defpackage.utw utwVar5 = (defpackage.utw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string2);
                utwVar5.b |= 2;
                utwVar5.d = string2;
                akzxVarM.U((defpackage.utw) akzxVarM3.p());
                akzx akzxVarM4 = utwVar.m();
                java.lang.String strBS3 = afsq.bS(str, "num_sessions");
                akzxVarM4.u();
                defpackage.utw utwVar6 = (defpackage.utw) akzxVarM4.b;
                j$.util.Objects.requireNonNull(strBS3);
                utwVar6.b |= 1;
                utwVar6.c = strBS3;
                java.lang.String strValueOf = java.lang.String.valueOf(size);
                akzxVarM4.u();
                defpackage.utw utwVar7 = (defpackage.utw) akzxVarM4.b;
                j$.util.Objects.requireNonNull(strValueOf);
                utwVar7.b |= 2;
                utwVar7.d = strValueOf;
                akzxVarM.U((defpackage.utw) akzxVarM4.p());
                akzx akzxVarM5 = utwVar.m();
                java.lang.String strBS4 = afsq.bS(str, "upload_id");
                akzxVarM5.u();
                defpackage.utw utwVar8 = (defpackage.utw) akzxVarM5.b;
                j$.util.Objects.requireNonNull(strBS4);
                utwVar8.b |= 1;
                utwVar8.c = strBS4;
                java.lang.String str2 = wqsVar.d;
                akzxVarM5.u();
                defpackage.utw utwVar9 = (defpackage.utw) akzxVarM5.b;
                j$.util.Objects.requireNonNull(str2);
                utwVar9.b |= 2;
                utwVar9.d = str2;
                akzxVarM.U((defpackage.utw) akzxVarM5.p());
                return (defpackage.uts) akzxVarM.p();
            case 1:
                return this.a;
            case 2:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (!bool.booleanValue()) {
                    this.a.o(rmx.gF);
                }
                return defpackage.abxl.L("XATU_MODELS_DOWNLOADED", bool.booleanValue() ? 1 : 0);
            case 3:
                defpackage.wpu wpuVar = (defpackage.wpu) obj;
                if (wpuVar != defpackage.wpu.UNKNOWN) {
                    this.a.o(rmx.gE);
                }
                return defpackage.abxl.L("XATU_ENROLLMENT_STATUS", wpuVar.e);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.wpw wpwVar = (defpackage.wpw) obj;
                if (wpwVar != defpackage.wpw.SHOW_AHEAD_AUTO_ENROLLED) {
                    this.a.o(rmx.jh);
                }
                return defpackage.abxl.L("XATU_SHOW_AHEAD_ENROLLMENT_STATUS", wpwVar.e);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.wpu wpuVar2 = (defpackage.wpu) obj;
                int i3 = (wpuVar2 == defpackage.wpu.AUTO_ENROLLED || wpuVar2 == defpackage.wpu.USER_OPTED_IN) ? 1 : 0;
                ?? r13 = this.a;
                if (i3 != 0) {
                    r13.o(rmx.jk);
                } else if (wpuVar2 == defpackage.wpu.UNKNOWN) {
                    r13.o(rmx.jj);
                } else if (wpuVar2 == defpackage.wpu.USER_OPTED_OUT) {
                    r13.o(rmx.ji);
                }
                return defpackage.abxl.L("XATU_USER_ENROLLED", i3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.tvz tvzVar = (defpackage.tvz) obj;
                defpackage.tvy tvyVarB = defpackage.tvy.b(tvzVar.c);
                if (tvyVarB == null) {
                    tvyVarB = defpackage.tvy.UNKNOWN;
                }
                if (!tvyVarB.equals(defpackage.tvy.ON_DEVICE)) {
                    defpackage.wjf.a.b().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "isSupportedSodaLanguagePackAvailable", 133, "XatuPipelineModelDownloader.java").v("SODA language pack not available");
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Object obj2 = this.a;
                int i4 = tvzVar.d;
                defpackage.wjf.a.b().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "isSupportedSodaLanguagePackAvailable", 137, "XatuPipelineModelDownloader.java").w("soda language pack has version %d", i4);
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream(((yqa) ((defpackage.wjf) obj2).c.a()).b).anyMatch(new defpackage.sst(i4, 4)));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    a.bI(defpackage.wkd.a.d(), "No model has been downloaded yet.", "com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelRepository", "getDownloadedZipFileUri", (char) 131, "XatuDuplexModelRepository.java", zct.b);
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj3 = this.a;
                long j = acuiVar.f;
                aoin aoinVar = ((defpackage.wkd) obj3).d;
                if (j < ((java.lang.Long) aoinVar.a()).longValue()) {
                    defpackage.wkd.a.d().i(zct.b).l("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelRepository", "getDownloadedZipFileUri", 139, "XatuDuplexModelRepository.java").M("MDD ClientFileGroup (groupName: %s, version %s) does not meet minimum version requirement (version %s).", acuiVar.c, java.lang.Integer.valueOf(acuiVar.f), aoinVar.a());
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar.h).filter(new vgb(17)).findAny();
                if (optionalFindAny.isPresent()) {
                    return j$.util.Optional.of(android.net.Uri.parse(((defpackage.acuh) optionalFindAny.orElseThrow()).d));
                }
                a.bI(defpackage.wkd.a.d(), "No detection model found in downloaded file group.", "com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelRepository", "getDownloadedZipFileUri", (char) 157, "XatuDuplexModelRepository.java", zct.b);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                java.lang.Object obj4 = this.a;
                defpackage.wky wkyVar = (defpackage.wky) obj4;
                defpackage.wkh wkhVar = wkyVar.d;
                agsm.i(1070, ahrv.g(ahrv.g(wkhVar.j).h(new defpackage.wkb(3), wkhVar.f)).i(new defpackage.wkv(obj4, i), wkyVar.g), "Failed to check for cached IVR data.", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.amtj amtjVar = (defpackage.amtj) obj;
                defpackage.wky.a.b().l("com/android/dialer/xatu/impl/service/XatuController", "startPipeline", 486, "XatuController.java").y("XatuAudioPrismPipelineRunner start result: %s", amtjVar);
                defpackage.wky wkyVar2 = (defpackage.wky) this.a;
                wkyVar2.o.a(wkyVar2.m, amtjVar);
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.who whoVar = new defpackage.who((defpackage.wpw) obj, z ? 1 : 0);
                defpackage.wky wkyVar3 = (defpackage.wky) this.a;
                wkyVar3.o.h.f(wkyVar3.m, whoVar);
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.amtj amtjVar2 = (defpackage.amtj) obj;
                defpackage.wky.a.b().l("com/android/dialer/xatu/impl/service/XatuController", "stopPipeline", 631, "XatuController.java").y("XatuAudioPrismPipelineRunner stop result: %s", amtjVar2);
                defpackage.wky wkyVar4 = (defpackage.wky) this.a;
                wkyVar4.o.a(wkyVar4.m, amtjVar2);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                long jLongValue = ((java.lang.Long) obj).longValue();
                akzx akzxVarM6 = defpackage.wor.a.m();
                java.lang.Object obj5 = this.a;
                if (jLongValue < 3) {
                    defpackage.wnx wnxVar = defpackage.wnx.a;
                    akzxVarM6.u();
                    defpackage.wor worVar = (defpackage.wor) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(wnxVar);
                    worVar.c = wnxVar;
                    worVar.b = 5;
                } else if (((java.lang.Boolean) ((defpackage.wky) obj5).k.a()).booleanValue()) {
                    defpackage.wky.a.b().l("com/android/dialer/xatu/impl/service/XatuController", "setHeaderItemState", 284, "XatuController.java").v("Show-ahead is enabled, show intro banner");
                    defpackage.wnj wnjVar = defpackage.wnj.a;
                    akzxVarM6.u();
                    defpackage.wor worVar2 = (defpackage.wor) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(wnjVar);
                    worVar2.c = wnjVar;
                    worVar2.b = 16;
                } else {
                    defpackage.wky.a.b().l("com/android/dialer/xatu/impl/service/XatuController", "setHeaderItemState", 287, "XatuController.java").v("Show-ahead is not enabled, show intro ribbon");
                    defpackage.wob wobVar = defpackage.wob.a;
                    akzxVarM6.u();
                    defpackage.wor worVar3 = (defpackage.wor) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(wobVar);
                    worVar3.c = wobVar;
                    worVar3.b = 4;
                }
                agsm.i(1087, ((defpackage.wky) obj5).D.o((defpackage.wor) akzxVarM6.p()), "Failed to update header", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.vel velVar = new defpackage.vel((defpackage.wpu) obj, 14);
                defpackage.wky wkyVar5 = (defpackage.wky) this.a;
                wkyVar5.o.h.f(wkyVar5.m, velVar);
                return null;
            case 15:
                defpackage.vel velVar2 = new defpackage.vel((defpackage.wpt) obj, i2);
                defpackage.wky wkyVar6 = (defpackage.wky) this.a;
                wkyVar6.o.h.f(wkyVar6.m, velVar2);
                return null;
            case 16:
                ((defpackage.wpm) this.a).b.set(j$.util.Optional.empty());
                return null;
            case 17:
                ((defpackage.txk) obj).a((akff) this.a);
                return null;
            case 18:
                ((kjr) ((wqr) this.a).b.a()).a();
                return null;
            case 19:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() <= 0) {
                    return num;
                }
                ((kjr) ((wqr) this.a).b.a()).a();
                return num;
            default:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                if (num2.intValue() <= 0) {
                    return num2;
                }
                ((kjr) ((wqr) this.a).b.a()).a();
                return num2;
        }
    }
}
