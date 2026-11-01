package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kwa implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ kwa(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0200  */
    /* JADX WARN: Type inference failed for: r10v72, types: [android.media.AudioManager$OnAudioFocusChangeListener, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) throws java.io.IOException {
        j$.util.Optional optionalOf;
        int i = 15;
        byte[] bArr = null;
        int i2 = 5;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                defpackage.kwc kwcVar = (defpackage.kwc) this.a;
                ajcq ajcqVarV = kwcVar.j.v((java.lang.String) obj, (java.lang.String) obj2);
                sqn sqnVar = kwcVar.d;
                j$.util.Objects.requireNonNull(sqnVar);
                return ahvr.I(ajcqVarV, new defpackage.kvd(sqnVar, i), kwcVar.e);
            case 1:
                kvy kvyVar = (kvy) this.a;
                ajcq ajcqVarV2 = kvyVar.k.v((java.lang.String) obj, (java.lang.String) this.b);
                sqn sqnVar2 = kvyVar.d;
                j$.util.Objects.requireNonNull(sqnVar2);
                return ahvr.I(ajcqVarV2, new defpackage.kvd(sqnVar2, i2), kvyVar.f);
            case 2:
                return ((lbl) this.a).l((aihd) this.b);
            case 3:
                return ((lbl) this.a).l((aihd) this.b);
            case 4:
                java.lang.Object obj3 = this.b;
                if (((aihd) obj3).isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                jsd jsdVar = new jsd(obj3, 7);
                kvj kvjVar = ((lbl) obj4).c;
                return kvjVar.c.p(kvjVar.d.bl(jsdVar));
            case 5:
                akzx akzxVarM = defpackage.idt.a.m();
                akzxVarM.u();
                defpackage.idt idtVar = (defpackage.idt) akzxVarM.b;
                java.lang.Object obj5 = this.b;
                j$.util.Objects.requireNonNull(obj5);
                idtVar.b |= 1;
                idtVar.e = (java.lang.String) obj5;
                akzx akzxVarM2 = defpackage.idr.a.m();
                akzxVarM2.u();
                defpackage.idr idrVar = (defpackage.idr) akzxVarM2.b;
                idrVar.b |= 1;
                idrVar.e = 16000;
                akzxVarM2.u();
                defpackage.idr idrVar2 = (defpackage.idr) akzxVarM2.b;
                idrVar2.b |= 2;
                idrVar2.f = 1;
                akzxVarM2.u();
                defpackage.idr idrVar3 = (defpackage.idr) akzxVarM2.b;
                idrVar3.b |= 4;
                idrVar3.g = 2;
                akzxVarM2.u();
                defpackage.idr idrVar4 = (defpackage.idr) akzxVarM2.b;
                idrVar4.b |= 8;
                idrVar4.h = 16000;
                akzx akzxVarM3 = defpackage.idq.a.m();
                akzxVarM3.u();
                defpackage.idq idqVar = (defpackage.idq) akzxVarM3.b;
                idqVar.b |= 1;
                idqVar.c = 8;
                akzxVarM2.u();
                defpackage.idr idrVar5 = (defpackage.idr) akzxVarM2.b;
                defpackage.idq idqVar2 = (defpackage.idq) akzxVarM3.p();
                j$.util.Objects.requireNonNull(idqVar2);
                idrVar5.d = idqVar2;
                idrVar5.c = 5;
                akzxVarM.u();
                defpackage.idt idtVar2 = (defpackage.idt) akzxVarM.b;
                defpackage.idr idrVar6 = (defpackage.idr) akzxVarM2.p();
                j$.util.Objects.requireNonNull(idrVar6);
                idtVar2.d = idrVar6;
                idtVar2.c = 2;
                return ((defpackage.lcl) this.a).f.n((defpackage.idt) akzxVarM.p(), (akzc) obj);
            case 6:
                if (((apjb) obj).n()) {
                    a.bI(lcp.a.d(), "exception uploading audio to Scotty", "com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsWorker", "handleUploadToScotty", 'p', "CallScreenMetricsWorker.java", zct.b);
                    return ajcm.a;
                }
                return ((lcp) this.a).e.a(aify.p(((defpackage.lkq) this.b).a), j$.time.Instant.now().toEpochMilli());
            case 7:
                defpackage.ldq ldqVar = (defpackage.ldq) this.b;
                adao adaoVar = new adao(ldqVar.k, ldqVar.f);
                ldqVar.i.set(true);
                return acvh.a(adaoVar.a((android.net.Uri) this.a), acvg.Z, "Failed to parse the manifest file.");
            case 8:
                return ((defpackage.adnj) obj).c(new defpackage.adoo(defpackage.adnw.a((java.io.File) this.a, (java.lang.String) this.b)));
            case 9:
                akzx akzxVarM4 = ucq.a.m();
                akzxVarM4.u();
                ucq ucqVar = akzxVarM4.b;
                ucqVar.b |= 4;
                ucqVar.e = 1;
                akzxVarM4.u();
                ucq ucqVar2 = akzxVarM4.b;
                java.lang.Object obj6 = this.b;
                j$.util.Objects.requireNonNull(obj6);
                ucqVar2.b |= 2;
                ucqVar2.d = (java.lang.String) obj6;
                akzx akzxVarM5 = defpackage.aivu.a.m();
                java.lang.String strCo = ahvr.co((java.lang.String) ((j$.util.Optional) obj).orElseThrow());
                akzxVarM5.u();
                defpackage.aivu aivuVar = (defpackage.aivu) akzxVarM5.b;
                j$.util.Objects.requireNonNull(strCo);
                aivuVar.b |= 8;
                aivuVar.g = strCo;
                akzxVarM5.u();
                defpackage.aivu aivuVar2 = (defpackage.aivu) akzxVarM5.b;
                aivuVar2.i = wsc.bH(1) - 1;
                aivuVar2.b |= 32;
                akzxVarM5.u();
                defpackage.aivu aivuVar3 = (defpackage.aivu) akzxVarM5.b;
                aivuVar3.o = 5;
                aivuVar3.b |= 4096;
                rms rmsVar = rms.a;
                akzxVarM5.u();
                defpackage.aivu aivuVar4 = (defpackage.aivu) akzxVarM5.b;
                aivuVar4.q = rmsVar.B;
                aivuVar4.b |= 16384;
                rmt rmtVar = rmt.a;
                akzxVarM5.u();
                defpackage.aivu aivuVar5 = (defpackage.aivu) akzxVarM5.b;
                aivuVar5.r = rmtVar.q;
                aivuVar5.b |= 32768;
                akzxVarM5.u();
                defpackage.aivu aivuVar6 = (defpackage.aivu) akzxVarM5.b;
                j$.util.Objects.requireNonNull("dialer");
                aivuVar6.b |= 1;
                aivuVar6.d = "dialer";
                defpackage.aivt aivtVar = defpackage.aivt.SPAM;
                akzxVarM5.u();
                defpackage.aivu aivuVar7 = (defpackage.aivu) akzxVarM5.b;
                aivuVar7.f = aivtVar.e;
                aivuVar7.b |= 4;
                java.lang.Object obj7 = this.a;
                akzxVarM4.u();
                ucq ucqVar3 = akzxVarM4.b;
                defpackage.aivu aivuVar8 = (defpackage.aivu) akzxVarM5.p();
                j$.util.Objects.requireNonNull(aivuVar8);
                ucqVar3.c = aivuVar8;
                ucqVar3.b |= 1;
                akzxVarM4.u();
                ucq ucqVar4 = akzxVarM4.b;
                ucqVar4.b |= 8;
                defpackage.lgn lgnVar = (defpackage.lgn) obj7;
                ucqVar4.f = lgnVar.g;
                return lgnVar.a.e(akzxVarM4);
            case 10:
                return ((defpackage.lgn) this.a).b.d((java.io.File) ((j$.util.Optional) obj).orElseThrow(), (java.lang.String) this.b);
            case 11:
                java.lang.String str = ((defpackage.lgk) this.a).h;
                defpackage.ldn ldnVar = ((defpackage.lgn) this.b).f;
                return ahvr.E(new defpackage.jnv(ldnVar, str, 18, bArr), ldnVar.g);
            case 12:
                defpackage.lgk lgkVar = (defpackage.lgk) this.a;
                android.net.Uri uri = android.net.Uri.parse(lgkVar.f);
                java.lang.Object obj8 = this.b;
                defpackage.lgn lgnVar2 = (defpackage.lgn) obj8;
                return ahvr.I(lgnVar2.c.a(uri), new defpackage.kwa(obj8, lgkVar.d, 10), lgnVar2.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.lgn) this.b).a(new alam(((defpackage.lgk) this.a).e, defpackage.lgk.a), 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                int iOrdinal = ((defpackage.lgq) this.a).ordinal();
                java.lang.Object obj9 = this.b;
                if (iOrdinal == 0) {
                    optionalOf = j$.util.Optional.of(((defpackage.lgv) obj9).f.getString(2132017805));
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    optionalOf = j$.util.Optional.of(((defpackage.lgv) obj9).f.getString(2132017804));
                } else if (iOrdinal == 3) {
                    optionalOf = j$.util.Optional.of(((defpackage.lgv) obj9).f.getString(2132019924));
                } else if (iOrdinal != 4) {
                    optionalOf = iOrdinal != 5 ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.lgv) obj9).f.getString(2132019923));
                } else {
                    optionalOf = j$.util.Optional.of(((defpackage.lgv) obj9).f.getString(2132017805));
                }
                return optionalOf.isPresent() ? ((defpackage.lgv) obj9).i.a((java.lang.String) optionalOf.orElseThrow()) : ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                double dFloatValue = ((java.lang.Float) ((adok) this.b).a().c.orElse(java.lang.Float.valueOf(0.0f))).floatValue();
                defpackage.ldn ldnVar2 = ((defpackage.lha) this.a).c;
                return ahvr.E(new defpackage.jnv(ldnVar2, java.lang.Double.valueOf(dFloatValue), 13, bArr), ldnVar2.g);
            case 16:
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(((adok) this.b).a().a.length());
                defpackage.ldn ldnVar3 = ((defpackage.lha) this.a).c;
                return ahvr.E(new defpackage.jnv(ldnVar3, numValueOf, i, bArr), ldnVar3.g);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                ahvr.bR(optional.isPresent(), "file for %s wasn't present", this.a);
                ?? r10 = this.b;
                final defpackage.lhl lhlVar = (defpackage.lhl) r10;
                defpackage.oii oiiVar = lhlVar.c;
                if (oiiVar.o()) {
                    defpackage.lhl.a.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 80, "DemoAudioPlayer.java").v("MediaPlayer already playing, calling stop");
                    oiiVar.n();
                }
                final android.media.AudioFocusRequest audioFocusRequestM = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m$1(da$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(4), new android.media.AudioAttributes.Builder().setUsage(1).setContentType(1).build()), false), (android.media.AudioManager.OnAudioFocusChangeListener) r10));
                int iD = lhlVar.b.d(audioFocusRequestM);
                ahvr.ca(iD == 1, "unable to get audio focus, was %s", iD);
                aimz aimzVar = defpackage.lhl.a;
                aimzVar.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 90, "DemoAudioPlayer.java").v("received audio focus, continuing with playback");
                java.lang.String absolutePath = ((java.io.File) optional.orElseThrow()).getAbsolutePath();
                aimzVar.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 93, "DemoAudioPlayer.java").y("setting data source to %s", absolutePath);
                oiiVar.f();
                oiiVar.i(absolutePath);
                aimzVar.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 97, "DemoAudioPlayer.java").v("preparing MediaPlayer and starting playback");
                oiiVar.c();
                oiiVar.m();
                oiiVar.j(new aonj() { // from class: lhk
                    public final java.lang.Object a(java.lang.Object obj10) {
                        aimz aimzVar2 = defpackage.lhl.a;
                        aimzVar2.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 104, "DemoAudioPlayer.java").v("playback complete, abandoning focus");
                        aimzVar2.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 106, "DemoAudioPlayer.java").w("abandon focus result: %d", lhlVar.b.a(audioFocusRequestM));
                        return aojh.a;
                    }
                });
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj10 = this.b;
                lht lhtVar = (lht) this.a;
                return ahvr.H(lhtVar.e.bl(new defpackage.olx(optional2, obj10, i3)), new defpackage.lef(14), lhtVar.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((ljn) this.a).c((adoa) this.b);
            default:
                adso adsoVar = (adso) obj;
                defpackage.ljs.a.c().i(zct.b).k(adsoVar).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "playAudioMessage", 830, "ForkedIncomingCallFlowManager.java").B("%d:Error during uplink audio playback for message text: %s", ((defpackage.ljs) this.a).j, defpackage.ljs.k((defpackage.adnw) this.b));
                return aiql.y(new defpackage.adof((java.lang.Throwable) adsoVar, adoe.c));
        }
    }

    public /* synthetic */ kwa(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
