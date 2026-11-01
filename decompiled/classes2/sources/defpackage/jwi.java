package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jwi implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jwi(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, utx] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, utx] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, lbi] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object[] objArr = 0;
        int i = 9;
        int i2 = 7;
        int i3 = 2;
        int i4 = 4;
        switch (this.$cid) {
            case 0:
                defpackage.jvz jvzVar = (defpackage.jvz) obj;
                final jwu jwuVar = ((jwk) this.b).a;
                if (jwuVar.d.m()) {
                    return aiql.y(new defpackage.jwt());
                }
                final long j = this.a;
                java.util.Map map = jwuVar.b;
                java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                defpackage.jvz jvzVar2 = (defpackage.jvz) map.get(lValueOf);
                if (jvzVar2 == null) {
                    jvzVar2 = defpackage.jvz.a;
                }
                if (jvzVar2.equals(jvzVar)) {
                    return aiql.z((java.lang.Object) null);
                }
                jwu.a.b().l("com/android/dialer/callingnetworks/impl/CallingNetworksStorage", "addCallingNetworks", 113, "CallingNetworksStorage.java").v("Saving new calling network info.");
                akzx akzxVarP = jvzVar2.p();
                akzxVarP.z(jvzVar);
                final defpackage.jvz jvzVar3 = (defpackage.jvz) akzxVarP.p();
                final android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("call_creation_time_millis", lValueOf);
                contentValues.put("calling_network_features", jvzVar3.i());
                aazc aazcVar = jwuVar.c;
                contentValues.put("last_modified_timestamp_millis", java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                return jwuVar.e.G(new afii() { // from class: jws
                    public final void a(adag adagVar) {
                        adagVar.k("calling_network_properties", contentValues, 5);
                        jwuVar.b.put(java.lang.Long.valueOf(j), jvzVar3);
                    }
                });
            case 1:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.ibd.a.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl", "getNextActiveCallAudio", 96, "CallAudioManagerImpl.java").v("constraints not fulfilled");
                    return aiql.z(j$.util.Optional.empty());
                }
                long j2 = this.a;
                java.lang.Object obj2 = this.b;
                return ahvr.B(aiql.G(dff.m(new defpackage.hyd(obj2, i3)), j2, java.util.concurrent.TimeUnit.MILLISECONDS, ((defpackage.ibd) obj2).d), java.util.concurrent.TimeoutException.class, new defpackage.exn(i), ajbm.a);
            case 2:
                if (((defpackage.jxl) obj) == defpackage.jxl.b) {
                    return ((gat) this.b).j(this.a);
                }
                return ajcm.a;
            case 3:
                return ((defpackage.kvb) this.b).b.g(this.a);
            case 4:
                java.lang.String absolutePath = ((java.io.File) obj).getAbsolutePath();
                akzx akzxVarM = kui.a.m();
                akzxVarM.u();
                kui kuiVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(absolutePath);
                kuiVar.b |= 1;
                kuiVar.c = absolutePath;
                kui kuiVarP = akzxVarM.p();
                long j3 = this.a;
                pgi pgiVar = ((defpackage.kxr) this.b).t;
                ?? r4 = pgiVar.b;
                defpackage.lbg lbgVarA = defpackage.lbh.a();
                lbgVarA.b(j3);
                java.lang.Object obj3 = pgiVar.a;
                lbgVarA.e(j$.time.Instant.now().toEpochMilli());
                lbgVarA.c(kuiVarP);
                return r4.a(lbgVarA.a());
            case 5:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                long j4 = this.a;
                java.lang.Object obj4 = this.b;
                defpackage.lcu.a.b().l("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration", "doOnFeedbackSubmitted", 200, "CallScreenFeedbackIntegration.java").v("call has been surveyed, setting callDataNeedsUpload to true");
                return ((defpackage.lcu) obj4).b.e(java.lang.Long.toString(j4), new defpackage.lct(objArr == true ? 1 : 0), j$.time.Instant.now().toEpochMilli());
            case 6:
                final vwb vwbVar = new vwb();
                final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
                final java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger();
                akzc akzcVar = akzc.d;
                final akzb akzbVar = new akzb(128);
                akzb akzbVar2 = new akzb(128);
                defpackage.lgz lgzVar = (defpackage.lgz) this.b;
                final defpackage.lei leiVar = lgzVar.j;
                ahrv ahrvVarG = ahrv.g(leiVar.g.a(5000L));
                defpackage.ibe ibeVar = new defpackage.ibe(11);
                ajbm ajbmVar = ajbm.a;
                ahrv ahrvVarH = ahrvVarG.i(ibeVar, ajbmVar).h(new defpackage.lef(3), ajbmVar);
                ajat ajatVar = new ajat() { // from class: leg
                    public final ajcq a(java.lang.Object obj5) {
                        defpackage.hzb hzbVar = (defpackage.hzb) obj5;
                        defpackage.lei.a.b().l("com/android/dialer/callscreen/impl/recording/impl/CallRecorderImpl", "readAudioFromTee", 165, "CallRecorderImpl.java").v("enter");
                        android.media.AudioFormat audioFormat = hzbVar.b;
                        int i5 = 0;
                        ahvr.bM(audioFormat.getEncoding() == 2);
                        atomicInteger.set(audioFormat.getSampleRate());
                        atomicInteger2.set(audioFormat.getChannelCount());
                        return hzbVar.b(1000, new defpackage.leh(vwbVar, akzbVar, hzbVar, i5), leiVar.c);
                    }
                };
                ajct ajctVar = leiVar.c;
                ahrv ahrvVarI = ahrvVarH.i(ajatVar, ajctVar).h(new defpackage.lda(leiVar, akzbVar, atomicInteger2, akzbVar2, 2), ajctVar).i(new vkh(leiVar, this.a, atomicInteger, akzbVar2, 1), ajctVar);
                ahrvVarI.c(new defpackage.ldf(leiVar, i2), leiVar.d);
                ahvr.bY(vwbVar.c == null);
                vwbVar.c = ahrvVarI;
                lgzVar.b.h = j$.util.Optional.of(vwbVar);
                return vwbVar.c;
            case 7:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                long j5 = this.a;
                java.lang.Object obj5 = this.b;
                java.lang.String path = ((java.io.File) optional.orElseThrow()).getPath();
                java.lang.String strValueOf = java.lang.String.valueOf(j5);
                defpackage.fcg fcgVar = new defpackage.fcg(path, i);
                defpackage.lgz lgzVar2 = (defpackage.lgz) obj5;
                return ahvr.H(lgzVar2.f.e(strValueOf, fcgVar, j$.time.Instant.now().toEpochMilli()), new defpackage.lgd(obj5, i4), lgzVar2.d);
            case 8:
                return ((defpackage.nzg) this.b).e.bl(new defpackage.jwe(this.a, 4));
            case 9:
                tbf tbfVar = (tbf) obj;
                akzx akzxVarM2 = amre.a.m();
                tbe tbeVarB = tbe.b(tbfVar.e);
                if (tbeVarB == null) {
                    tbeVarB = tbe.a;
                }
                akzxVarM2.u();
                amre amreVar = akzxVarM2.b;
                amreVar.d = tbeVarB.e;
                amreVar.b |= 2;
                tbe tbeVarB2 = tbe.b(tbfVar.f);
                if (tbeVarB2 == null) {
                    tbeVarB2 = tbe.a;
                }
                akzxVarM2.u();
                amre amreVar2 = akzxVarM2.b;
                amreVar2.e = tbeVarB2.e;
                amreVar2.b |= 4;
                tbe tbeVarB3 = tbe.b(tbfVar.g);
                if (tbeVarB3 == null) {
                    tbeVarB3 = tbe.a;
                }
                akzxVarM2.u();
                amre amreVar3 = akzxVarM2.b;
                amreVar3.f = tbeVarB3.e;
                amreVar3.b |= 8;
                tbe tbeVarB4 = tbe.b(tbfVar.h);
                if (tbeVarB4 == null) {
                    tbeVarB4 = tbe.a;
                }
                akzxVarM2.u();
                amre amreVar4 = akzxVarM2.b;
                amreVar4.g = tbeVarB4.e;
                amreVar4.b |= 16;
                amre amreVarP = akzxVarM2.p();
                aimw aimwVarL = swv.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl", "appendSettingsMetrics", 191, "TidepodsRevelioImpl.java");
                tbe tbeVarB5 = tbe.b(tbfVar.e);
                if (tbeVarB5 == null) {
                    tbeVarB5 = tbe.a;
                }
                java.lang.String strName = tbeVarB5.name();
                tbe tbeVarB6 = tbe.b(tbfVar.f);
                if (tbeVarB6 == null) {
                    tbeVarB6 = tbe.a;
                }
                java.lang.String strName2 = tbeVarB6.name();
                tbe tbeVarB7 = tbe.b(tbfVar.g);
                if (tbeVarB7 == null) {
                    tbeVarB7 = tbe.a;
                }
                java.lang.String strName3 = tbeVarB7.name();
                tbe tbeVarB8 = tbe.b(tbfVar.h);
                if (tbeVarB8 == null) {
                    tbeVarB8 = tbe.a;
                }
                long j6 = this.a;
                java.lang.Object obj6 = this.b;
                aimwVarL.N("Spam: %s, Possibly faked numbers: %s, First time callers: %s, Private or hidden: %s", strName, strName2, strName3, tbeVarB8.name());
                return ((swv) obj6).a(j6, new oxs(amreVarP, 13));
            case 10:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return this.b.b(this.a);
                }
                return ajcm.a;
            case 11:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return this.b.g(this.a);
                }
                return aiql.z(java.lang.Boolean.TRUE);
            case 12:
                a.bI(vkj.a.b(), "Clicking subscribe link", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "performClickSubscribeLink", (char) 348, "AccountSubscriber.java", zct.a);
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                long j7 = this.a;
                vkj vkjVar = (vkj) this.b;
                ahrv ahrvVarG2 = ahrv.g(vkjVar.d((java.lang.String) obj, "application/x-www-form-urlencoded", optionalEmpty, j7));
                vju vjuVar = new vju(6);
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = vkjVar.c;
                return ahrvVarG2.e(java.util.concurrent.TimeoutException.class, vjuVar, scheduledExecutorService).h(new vju(7), scheduledExecutorService);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                long j8 = this.a;
                java.lang.Object obj7 = this.b;
                wih.a.b().l("com/android/dialer/xatu/impl/feedback/XatuFeedbackIntegration", "doOnFeedbackSubmitted", 267, "XatuFeedbackIntegration.java").v("call has been surveyed, setting callDataNeedsUpload to true");
                akzx akzxVarM3 = wgu.a.m();
                akzxVarM3.u();
                wgu wguVar = akzxVarM3.b;
                wguVar.b |= 2;
                wguVar.d = true;
                return ((wih) obj7).b.d(j8, akzxVarM3.p());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((wys) this.b).b.a(this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                akzx akzxVarM4 = xac.a.m();
                java.lang.String string = java.util.UUID.randomUUID().toString();
                akzxVarM4.u();
                xac xacVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(string);
                xacVar.b |= 16;
                xacVar.i = string;
                alat alatVar = ((amoc) obj).c;
                akzxVarM4.u();
                xac xacVar2 = akzxVarM4.b;
                alat alatVar2 = xacVar2.g;
                if (!alatVar2.c()) {
                    xacVar2.g = alad.J(alatVar2);
                }
                java.lang.Object obj8 = this.b;
                long j9 = this.a;
                akyl.i(alatVar, xacVar2.g);
                return ((wys) obj8).f.h(j9, akzxVarM4.p());
            case 16:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return ajcm.a;
                }
                if (((wyz) optional2.orElseThrow()).d == null || ((wyz) optional2.orElseThrow()).c == null) {
                    return ajcm.a;
                }
                wyb wybVar = ((wyz) optional2.orElseThrow()).c.c;
                if (wybVar == null) {
                    wybVar = wyb.a;
                }
                int iAd = a.ad(wybVar.d);
                if (iAd == 0) {
                    iAd = 1;
                }
                if (iAd != 2 && iAd != 4) {
                    return ajcm.a;
                }
                boolean zIsEmpty = ((wyz) optional2.orElseThrow()).d.c.isEmpty();
                boolean zAllMatch = j$.util.Collection.-EL.stream(((wyz) optional2.orElseThrow()).d.d).allMatch(new wrm(6));
                if (zIsEmpty || zAllMatch) {
                    return ajcm.a;
                }
                long j10 = this.a;
                java.lang.Object obj9 = this.b;
                akzx akzxVarM5 = wxp.a.m();
                akzxVarM5.u();
                wxp wxpVar = akzxVarM5.b;
                wxpVar.b |= 128;
                wxpVar.i = true;
                return ((wzd) ((wyw) obj9).b).g(j10, akzxVarM5.p());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                long j11 = this.a;
                java.lang.Object obj10 = this.b;
                wzp.a.b().l("com/android/incallui/atlas/ui/impl/feedbackintegration/AtlasFeedbackIntegration", "doOnFeedbackSubmitted", 233, "AtlasFeedbackIntegration.java").v("call has been surveyed, setting callDataNeedsUpload to true");
                akzx akzxVarM6 = wxp.a.m();
                akzxVarM6.u();
                wxp wxpVar2 = akzxVarM6.b;
                wxpVar2.b |= 64;
                wxpVar2.h = true;
                return ((wzp) obj10).b.g(j11, akzxVarM6.p());
            default:
                return ((agpb) this.b).b(this.a, (agpc) obj);
        }
    }
}
