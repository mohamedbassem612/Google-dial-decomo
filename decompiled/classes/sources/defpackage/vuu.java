package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vuu implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vuu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, vcg] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        int i = 12;
        int i2 = 19;
        int i3 = 20;
        int i4 = 16;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                return ((defpackage.vva) this.a).i.e("VisualVoicemailGroup");
            case 1:
                defpackage.rsr rsrVar = (defpackage.rsr) obj;
                java.lang.Object obj2 = rsrVar.b;
                java.lang.Object obj3 = rsrVar.a;
                defpackage.vva vvaVar = (defpackage.vva) this.a;
                return vvaVar.d.d(defpackage.vva.l(), defpackage.vva.k(), (java.lang.String) obj2, (java.lang.String[]) obj3, "date DESC").c(defpackage.ahqx.e(new defpackage.kwb(i3)), vvaVar.g).h();
            case 2:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                vmu vmuVar = new vmu(this.a, 15);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.vee) ((abtr) optionalOfNullable.get()).d).i((android.telecom.PhoneAccountHandle) vmuVar.a));
                }
                return (defpackage.ajcq) optionalOfNullable.orElse(defpackage.ajcm.a);
            case 3:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                vmu vmuVar2 = new vmu(this.a, 13);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((abtr) optionalOfNullable2.get()).f.b((android.telecom.PhoneAccountHandle) vmuVar2.a));
                }
                return (defpackage.ajcq) optionalOfNullable2.orElse(defpackage.aiql.z(defpackage.aikn.a));
            case 4:
                defpackage.aihd aihdVar = (defpackage.aihd) obj;
                defpackage.ahvr.bY(aihdVar.size() == 1);
                java.lang.String str = (java.lang.String) aihdVar.iterator().next();
                java.lang.Object obj4 = this.a;
                return defpackage.ahvr.F(new defpackage.vms(obj4, str, i, bArr), ((vvb) obj4).d);
            case 5:
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                vmu vmuVar3 = new vmu(this.a, 14);
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((defpackage.vee) ((abtr) optionalOfNullable3.get()).d).i((android.telecom.PhoneAccountHandle) vmuVar3.a));
                }
                return (defpackage.ajcq) optionalOfNullable3.orElse(defpackage.ajcm.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return defpackage.aiql.z(j$.util.Optional.empty());
                }
                defpackage.vzi vziVar = (defpackage.vzi) optional.orElseThrow();
                if (!defpackage.vvl.n(vziVar)) {
                    return defpackage.aiql.z(j$.util.Optional.empty());
                }
                java.lang.Object obj5 = this.a;
                defpackage.vvl vvlVar = (defpackage.vvl) obj5;
                defpackage.ajcq ajcqVarE = vvlVar.e(vziVar);
                defpackage.vmv vmvVar = new defpackage.vmv(obj5, vziVar, i4, bArr);
                defpackage.ajct ajctVar = vvlVar.c;
                defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarE, vmvVar, ajctVar);
                defpackage.ajcq ajcqVarG = vvlVar.g(vziVar);
                return defpackage.ahvr.ak(ajcqVarI, ajcqVarG).p(new kff(obj5, ajcqVarI, ajcqVarG, vziVar, 14), ajctVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalOfNullable4 = (j$.util.Optional) obj;
                vmu vmuVar4 = new vmu(this.a, 19);
                if (true == optionalOfNullable4.isPresent()) {
                    java.lang.Object obj6 = optionalOfNullable4.get();
                    java.lang.Object obj7 = vmuVar4.a;
                    zue zueVar = (zue) obj6;
                    wcz wczVar = (wcz) obj7;
                    optionalOfNullable4 = j$.util.Optional.ofNullable(defpackage.ahvr.H(wczVar.g.l().a(ztu.a, zueVar), new vfp(obj7, zueVar, 16, (byte[]) null), wczVar.b));
                }
                return (defpackage.ajcq) optionalOfNullable4.orElse(defpackage.ajcm.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) wcz.a.b()).l("com/android/dialer/wearsender/spamandcallerid/SpamAndCallerIdInfoSender", "onCallEventInternal", 93, "SpamAndCallerIdInfoSender.java")).v("not tethered to default dialer");
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                wcz wczVar2 = (wcz) obj8;
                return defpackage.ahrv.g(((wcy) defpackage.aooc.ar(wczVar2.h.Y(), wcy.class)).bE()).i(new defpackage.vuu(obj8, 7), wczVar2.b);
            case 9:
                long j = ((whk) obj).c;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.whj.a.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "getAnnotatedCallLogIdsToXatuDataMap", 190, "XatuCallLogDataSource.java")).x("lastSyncedXatuDataTimestamp %d", j);
                defpackage.adag adagVar = new defpackage.adag((byte[]) null);
                adagVar.n("SELECT * FROM xatu_data WHERE last_modified_timestamp_millis > ?");
                adagVar.o(java.lang.Long.valueOf(j));
                return ((defpackage.whj) this.a).c.m(adagVar.B());
            case 10:
                defpackage.aify aifyVar = (defpackage.aify) obj;
                if (aifyVar.isEmpty()) {
                    return defpackage.aiql.z(defpackage.aikj.b);
                }
                java.lang.Object obj9 = this.a;
                defpackage.aigf aigfVar = (defpackage.aigf) j$.util.Collection.-EL.stream(aifyVar).collect(defpackage.aido.b(new vun(12), new vun(13)));
                defpackage.whj whjVar = (defpackage.whj) obj9;
                return defpackage.ahvr.H(whjVar.e.ac(aigfVar.keySet()), new defpackage.vuj(aigfVar, i3), whjVar.b);
            case 11:
                defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream((defpackage.aify) obj).map(new vun(11)).filter(new defpackage.vgb(14)).collect(defpackage.aido.a);
                defpackage.whj whjVar2 = (defpackage.whj) this.a;
                return defpackage.ahrv.g(whjVar2.c.b(aifyVar2)).h(new defpackage.vrx(14), whjVar2.b);
            case 12:
                return ((defpackage.wqr) this.a).c.F(new jsh((defpackage.aify) obj, 16));
            case 13:
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) whs.a.b()).l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "clearDialerClearcutLogs", 175, "XatuLoggingCoordinatorImpl.java");
                mol molVar = (mol) this.a;
                java.lang.Object obj10 = molVar.a;
                aimwVar.y("clearing clearcut logs for [%s]", obj10);
                voc vocVar = ((whs) molVar.b).h;
                return defpackage.ahvr.H(defpackage.ahvr.F(new defpackage.vms(vocVar, obj10, i2, bArr), vocVar.b), new wie((amto) obj, 1), molVar.c);
            case 14:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) wjf.a.b()).i(defpackage.zct.a)).l("com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "downloadNecessaryModels", 'N', "XatuPipelineModelDownloader.java")).v("Duplex model already downloaded");
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj11 = this.a;
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) wjf.a.b()).i(defpackage.zct.a)).l("com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "downloadNecessaryModels", 'Q', "XatuPipelineModelDownloader.java")).v("Duplex model not downloaded, triggering download");
                wkc wkcVar = ((wjf) obj11).d;
                if (wkcVar.d.isPresent() && !((defpackage.ajcq) wkcVar.d.orElseThrow()).isDone()) {
                    ((defpackage.aimw) ((defpackage.aimw) wkc.a.b()).l("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelDownloader", "downloadNow", 45, "XatuDuplexModelDownloader.java")).v("previous download in progress");
                    return (defpackage.ajcq) wkcVar.d.orElseThrow();
                }
                defpackage.aoin aoinVar = wkcVar.c;
                defpackage.akzx akzxVarL = ((defpackage.acux) aoinVar.a()).L();
                defpackage.acuz acuzVar = ((defpackage.acux) aoinVar.a()).g;
                if (acuzVar == null) {
                    acuzVar = defpackage.acuz.a;
                }
                defpackage.akzx akzxVarL2 = acuzVar.L();
                akzxVarL2.u();
                defpackage.acuz acuzVar2 = (defpackage.acuz) akzxVarL2.b;
                acuzVar2.d = 0;
                acuzVar2.b |= 2;
                akzxVarL.u();
                defpackage.acux acuxVar = (defpackage.acux) akzxVarL.b;
                defpackage.acuz acuzVar3 = (defpackage.acuz) akzxVarL2.r();
                j$.util.Objects.requireNonNull(acuzVar3);
                acuxVar.g = acuzVar3;
                acuxVar.b |= 2048;
                defpackage.acux acuxVar2 = (defpackage.acux) akzxVarL.r();
                aliq aliqVar = new aliq((char[]) null, (byte[]) null);
                aliqVar.o(acuxVar2);
                acuo acuoVarN = aliqVar.n();
                acvi acviVarA = acvj.a();
                acviVarA.c(acuxVar2.c);
                defpackage.acuz acuzVar4 = acuxVar2.g;
                if (acuzVar4 == null) {
                    acuzVar4 = defpackage.acuz.a;
                }
                acviVarA.b(defpackage.ahyn.h(acuzVar4));
                acvj acvjVarA = acviVarA.a();
                ((defpackage.aimw) ((defpackage.aimw) wkc.a.b()).l("com/android/dialer/xatu/impl/pipeline/duplex/XatuDuplexModelDownloader", "downloadNow", 69, "XatuDuplexModelDownloader.java")).v("start downloading");
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(wkcVar.e.E(acuoVarN));
                whr whrVar = new whr(wkcVar, acvjVarA, 3);
                defpackage.ajct ajctVar2 = wkcVar.b;
                defpackage.ahrv ahrvVarH = ahrvVarG.i(whrVar, ajctVar2).h(new wkb(0), ajctVar2);
                wkcVar.d = j$.util.Optional.of(ahrvVarH);
                return ahrvVarH;
            case 15:
                return defpackage.aiql.z((java.io.InputStream) ((wkd) this.a).f.M((android.net.Uri) ((j$.util.Optional) obj).orElseThrow(new vjq(16)), new defpackage.affr()));
            case 16:
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream((java.io.InputStream) obj);
                wkd wkdVar = (wkd) this.a;
                return wkdVar.e.bh(bufferedInputStream, java.lang.String.valueOf(java.lang.String.valueOf(wkdVar.b.getFilesDir())).concat("/visual_calling_detection_model"));
            case 17:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) wkh.a.b()).l("com/android/dialer/xatu/impl/service/CachedIvrDataFetcher", "start", 109, "CachedIvrDataFetcher.java")).v("raw number not present");
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj12 = this.a;
                wkh wkhVar = (wkh) obj12;
                return defpackage.ahrv.g(wkhVar.k.v((java.lang.String) optional2.orElseThrow(), defpackage.rlt.a(wkhVar.d, null))).i(new defpackage.vuu(obj12, 18), wkhVar.f);
            case 18:
                java.lang.Object obj13 = this.a;
                return ((wkh) obj13).e.submit(defpackage.ahqx.i(new whv(obj13, (hkd) obj, 4, (byte[]) null)));
            case 19:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.akzx akzxVarM = wgu.a.m();
                akzxVarM.u();
                wgu wguVar = akzxVarM.b;
                wguVar.b |= 4;
                wguVar.e = true;
                akzxVarM.u();
                wgu wguVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                wguVar2.b |= 8;
                wguVar2.f = str2;
                wgu wguVarR = akzxVarM.r();
                wky wkyVar = (wky) this.a;
                return wkyVar.n.d(wkyVar.j, wguVarR);
            default:
                defpackage.akzx akzxVarM2 = wor.a.m();
                woc wocVar = woc.a;
                akzxVarM2.u();
                wor worVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(wocVar);
                worVar.c = wocVar;
                worVar.b = 13;
                wor worVarR = akzxVarM2.r();
                java.lang.Object obj14 = this.a;
                return ((wky) obj14).D.p(worVarR, new vfm(obj14, (j$.util.Optional) obj, 13, (byte[]) null));
        }
    }
}
