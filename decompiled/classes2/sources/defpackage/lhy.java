package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lhy implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lhy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [aoss, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarZ;
        int i = 17;
        int i2 = 3;
        int i3 = 18;
        int i4 = 2;
        char c = 1;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                return ((llz) this.a).b((defpackage.lhr) obj);
            case 1:
                lhp lhpVar = (lhp) this.a;
                return lhpVar.c.c(lhpVar.b, (adon) obj);
            case 2:
                return ((llz) this.a).b((defpackage.lhr) obj);
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aiql.z(defpackage.lin.MODEL_UNREADY);
                }
                defpackage.lil lilVar = (defpackage.lil) this.a;
                if (!lilVar.i.a(optional).contains(ypm.c)) {
                    return aiql.z(defpackage.lin.UNNECESSARY);
                }
                defpackage.lil.d.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "sodaDownloadStatus", 359, "CallScreenSettingsDataSource.java").v("Dialer SODA Infra used for checking SODA Availability");
                akff akffVar = (akff) optional.orElseThrow();
                twp twpVar = lilVar.k;
                ajcq ajcqVarE = twpVar.e();
                defpackage.lef lefVar = new defpackage.lef(i);
                ajcu ajcuVar = lilVar.e;
                ajcq ajcqVarH = ahvr.H(ajcqVarE, lefVar, ajcuVar);
                ajcq ajcqVarC = twpVar.c(akffVar);
                return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarC}).o(new defpackage.hsl(ajcqVarH, ajcqVarC, akffVar, 7, (byte[]) null), ajcuVar);
            case 4:
                java.lang.Object obj2 = this.a;
                defpackage.lil lilVar2 = (defpackage.lil) obj2;
                lht lhtVar = lilVar2.g;
                defpackage.lii liiVar = (defpackage.lii) obj;
                ajcq ajcqVarB = lhtVar.b();
                defpackage.lef lefVar2 = new defpackage.lef(20);
                ajcu ajcuVar2 = lilVar2.e;
                ajcq ajcqVarH2 = ahvr.H(ajcqVarB, lefVar2, ajcuVar2);
                ajcq ajcqVarC2 = lilVar2.f.c();
                boolean z = liiVar.f;
                ahrv ahrvVarG = ahrv.g(lhtVar.b());
                llz llzVar = lilVar2.h;
                j$.util.Objects.requireNonNull(llzVar);
                ajcq ajcqVarH3 = ahvr.H(ahrvVarG.i(new defpackage.lhy(llzVar, i4), ajcuVar2).h(new defpackage.lef(i3), ajcuVar2).h(new defpackage.lef(19), ajcuVar2), new qfm(obj2, z, 1), ajcuVar2);
                ajcq ajcqVarI = ahvr.I(ajcqVarH2, new defpackage.lhy(obj2, i2), ajcuVar2);
                return ahvr.ak(new ajcq[]{ajcqVarH2, ajcqVarC2, ajcqVarI, ajcqVarH3}).o(new defpackage.lik(lilVar2, ajcqVarC2, ajcqVarH2, ajcqVarI, ajcqVarH3, liiVar, 0), ajcuVar2);
            case 5:
                return ((defpackage.lil) this.a).m.bl(new jsd((defpackage.lii) obj, 13));
            case 6:
                aigf aigfVar = (aigf) obj;
                aimz aimzVar = ljd.a;
                aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "retryInitialization", 169, "AvatarSessionManagerCache.java").y("latest model availability map: %s", aigfVar);
                boolean zContainsValue = aigfVar.containsValue(lje.c);
                java.lang.Object obj3 = this.a;
                if (zContainsValue) {
                    ljd ljdVar = (ljd) obj3;
                    if (ljdVar.g < ljdVar.e) {
                        return ljdVar.b();
                    }
                    ljdVar.g = 0;
                } else {
                    ypm ypmVar = ypm.b;
                    lje ljeVar = lje.b;
                    lje ljeVar2 = (lje) aigfVar.getOrDefault(ypmVar, ljeVar);
                    lje ljeVar3 = lje.a;
                    ljd ljdVar2 = (ljd) obj3;
                    ljdVar2.c.o(ljeVar2.equals(ljeVar3) ? rmx.gZ : rmx.ha);
                    ljdVar2.g = 0;
                    ypm ypmVar2 = ypm.c;
                    if (aigfVar.get(ypmVar2) == ljeVar3) {
                        aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "handleSodaModelAvailableAfterTimingOutEarlier", 215, "AvatarSessionManagerCache.java").v("soda model is available");
                        ljdVar2.h.a(ahvr.H(((adnm) ljdVar2.b.b(aigfVar).orElseThrow()).b(adoa.a), new defpackage.iau(obj3, aigfVar, i3), ljdVar2.d));
                    } else {
                        ahvr.cc(aigfVar.get(ypmVar2) == ljeVar, "Soda model availability (expected to be unavailable) but is %s:", aigfVar.containsKey(ypmVar2) ? ((lje) aigfVar.get(ypmVar2)).toString() : "absent");
                        aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/AvatarSessionManagerCache", "retryInitialization", 194, "AvatarSessionManagerCache.java").v("updating the value of SODA model availability in the cache to unavailable");
                        ljdVar2.f = new defpackage.ljc(aigfVar, 0);
                    }
                }
                return ajcm.a;
            case 7:
                return ((defpackage.ljs) this.a).p.b();
            case 8:
                java.lang.Object obj4 = this.a;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                synchronized (((defpackage.ljs) obj4).e) {
                    defpackage.adpe adpeVar = ((defpackage.ljs) obj4).i;
                    if (adpeVar.h() && !adpeVar.b().f() && !((defpackage.ljs) obj4).k.get()) {
                        try {
                            adpeVar.b().d();
                        } catch (adpd e) {
                            defpackage.ljs.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "playAudioMessage", 854, "ForkedIncomingCallFlowManager.java").v("Mute controllers failed");
                            return aiql.y(new defpackage.adof((java.lang.Throwable) e, adoe.e));
                        }
                    }
                    ajcqVarZ = aiql.z(bool);
                    break;
                }
                return ajcqVarZ;
            case 9:
                aimz aimzVar2 = defpackage.ljs.a;
                return this.a;
            case 10:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.ljs ljsVar = (defpackage.ljs) this.a;
                ljsVar.n = zBooleanValue;
                return (zBooleanValue && ljsVar.a() == defpackage.ljr.b) ? ljsVar.h() : ajcm.a;
            case 11:
                return ((defpackage.ljs) this.a).p.b();
            case 12:
                aimz aimzVar3 = defpackage.ljs.a;
                return this.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                if (!zBooleanValue2) {
                    defpackage.ljs.a.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "stop", 504, "ForkedIncomingCallFlowManager.java").w("%d:stop():Could not play call stop message to caller", ((defpackage.ljs) obj5).j);
                }
                return ((defpackage.ljs) obj5).c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj6 = this.a;
                defpackage.ljs ljsVar2 = (defpackage.ljs) obj6;
                ljsVar2.p(defpackage.ljr.f);
                return ahvr.I(ljsVar2.c(), ahqx.c(new defpackage.ljp(obj6, (defpackage.adof) obj, c == true ? 1 : 0)), ljsVar2.f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return aiql.z(j$.util.Optional.empty());
                }
                for (acuh acuhVar : ((acui) optional2.orElseThrow()).h) {
                    if ("tts_language_pack".equals(acuhVar.c)) {
                        java.lang.Object obj7 = this.a;
                        return ahvr.F(new defpackage.lly(obj7, acuhVar, i5), ((llz) obj7).c);
                    }
                }
                llz.a.d().i(zct.b).l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "loadLanguagePack", 231, "TtsRepository.java").y("no TtsLanguagePack in group %s, returning empty", ((acui) optional2.orElseThrow()).c);
                return aiql.z(j$.util.Optional.empty());
            case 16:
                defpackage.kiq kiqVar = (defpackage.kiq) obj;
                aooh.f(kiqVar, "callDetailsList");
                defpackage.jyn jynVar = (defpackage.jyn) this.a;
                return aosv.F((aoss) jynVar.a, 0, new defpackage.kqd(jynVar, kiqVar, (aoln) null, 12, (byte[]) null), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj8 = this.a;
                defpackage.mjm mjmVar = (defpackage.mjm) obj8;
                return ((java.lang.Boolean) mjmVar.d.a()).booleanValue() ? mjmVar.f.g(new defpackage.lgc(obj8, i), mjmVar.b) : mjmVar.f.g(new defpackage.lgc(obj8, i3), mjmVar.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj9 = this.a;
                defpackage.lly llyVar = new defpackage.lly(obj9, (j$.util.Optional) obj, 7);
                defpackage.mjm mjmVar2 = (defpackage.mjm) obj9;
                return mjmVar2.f.g(llyVar, mjmVar2.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                final android.telephony.ims.ImsMmTelManager imsMmTelManagerM = baa$.ExternalSyntheticApiModelOutline1.m(obj);
                final defpackage.nwb nwbVar = (defpackage.nwb) this.a;
                return dff.m(new dsf() { // from class: nvz
                    public final java.lang.Object a(dsd dsdVar) {
                        baa$.ExternalSyntheticApiModelOutline1.m(imsMmTelManagerM, nwbVar.e, new defpackage.fcg(dsdVar, 12));
                        return "isRegistrationStateRegistered";
                    }
                });
            default:
                final android.telephony.ims.ImsMmTelManager imsMmTelManagerM2 = baa$.ExternalSyntheticApiModelOutline1.m(obj);
                final defpackage.nwb nwbVar2 = (defpackage.nwb) this.a;
                return dff.m(new dsf() { // from class: nwa
                    public final java.lang.Object a(dsd dsdVar) {
                        baa$.ExternalSyntheticApiModelOutline1.m$1(imsMmTelManagerM2, nwbVar2.e, new defpackage.fcg(dsdVar, 13));
                        return "isTransportTypeIwlan";
                    }
                });
        }
    }
}
