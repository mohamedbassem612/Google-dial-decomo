package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nyy implements qtx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nyy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v92, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    public final void a() {
        ajcq ajcqVarP;
        int i = 7;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.nyz.a;
                aimzVar.b().l("com/android/dialer/duo/tidepods/DuoUpgradeController", "onButtonClicked", 80, "DuoUpgradeController.java").v("upgrade to duo video clicked");
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                defpackage.nyz nyzVar = (defpackage.nyz) this.a;
                j$.util.Optional optionalOfNullable = nyzVar.j;
                pqu pquVar = new pqu(epochMilli, 1);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf((boolean) (((pquVar.a - ((java.lang.Long) optionalOfNullable.get()).longValue()) > 1000L ? 1 : ((pquVar.a - ((java.lang.Long) optionalOfNullable.get()).longValue()) == 1000L ? 0 : -1)) >>> 31)));
                }
                if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    aimzVar.b().l("com/android/dialer/duo/tidepods/DuoUpgradeController", "onButtonClicked", 86, "DuoUpgradeController.java").v("upgrade to Meet video clicked too frequently, throttled");
                    return;
                }
                nyzVar.j = j$.util.Optional.of(java.lang.Long.valueOf(epochMilli));
                nyzVar.k.a(qbc.eV);
                if (((java.lang.Boolean) nyzVar.i.a()).booleanValue()) {
                    nyzVar.f.j(nyzVar.d, nyzVar.e, nyzVar.a());
                    return;
                } else {
                    nyzVar.f.i(nyzVar.d, nyzVar.e);
                    return;
                }
            case 1:
                aimz aimzVar2 = defpackage.kxx.a;
                aimzVar2.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onButtonClicked", 166, "CallRecordingButtonController.java").v("call recording clicked");
                java.lang.Object obj = this.a;
                qbc qbcVar = qbc.eF;
                defpackage.kxx kxxVar = (defpackage.kxx) obj;
                qbe qbeVar = kxxVar.o;
                qbeVar.a(qbcVar);
                defpackage.kxr kxrVar = kxxVar.c;
                if (kxrVar.e()) {
                    aimzVar2.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onButtonClicked", 171, "CallRecordingButtonController.java").v("audio still playing, skipping recording start/stop");
                    return;
                }
                if (!kxrVar.f()) {
                    kxxVar.g.b(mce.ec);
                    kxxVar.h.set(false);
                    defpackage.lbo lboVar = (defpackage.lbo) kxxVar.d.a();
                    ahvr.J(ahrv.g(lboVar.d.bk()).h(new defpackage.kwz(20), lboVar.b), new defpackage.kxt(kxxVar, 0), kxxVar.b);
                    qbeVar.a(qbc.cX);
                    return;
                }
                kxxVar.g.b(mce.el);
                ahoq ahoqVarW = ahvr.W(237, "CallRecordingButtonController_onButtonClicked_endCallRecording");
                try {
                    aimzVar2.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "endCallRecording", 347, "CallRecordingButtonController.java").v("end call recording");
                    ((defpackage.kxx) obj).h.set(false);
                    kxrVar.d();
                    ajcq ajcqVarA = kxrVar.a();
                    defpackage.ibe ibeVar = new defpackage.ibe(i);
                    ajct ajctVar = ((defpackage.kxx) obj).b;
                    ahvr.J(ahvr.I(ajcqVarA, ibeVar, ajctVar), new defpackage.jya((defpackage.kxx) obj, 3), ajctVar);
                    ahoqVarW.close();
                    kxxVar.o.a(qbc.cY);
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 2:
                pgp.a.b().l("com/android/dialer/incall/buttonshared/MuteButtonController", "onButtonClicked", 52, "MuteButtonController.java").v("mute clicked");
                java.lang.Object obj2 = this.a;
                qbc qbcVar2 = qbc.eP;
                pgp pgpVar = (pgp) obj2;
                qbe qbeVar2 = pgpVar.h;
                qbeVar2.a(qbcVar2);
                boolean zG = pgpVar.c.g();
                pgpVar.d.c(!zG, true);
                if (!pgpVar.i.m()) {
                    pgpVar.f.g(pgpVar.g.h(!zG ? 2131951703 : 2131951702), 1L, java.util.concurrent.TimeUnit.MINUTES);
                    qbeVar2.a(!zG ? qbc.jw : qbc.jv);
                }
                if (zG) {
                    ruc rucVar = pgpVar.e;
                    aenj aenjVar = ruc.L;
                    rucVar.j(aenjVar);
                    rucVar.k(aenjVar);
                    qbeVar2.a(qbc.gl);
                    return;
                }
                ruc rucVar2 = pgpVar.e;
                aenj aenjVar2 = ruc.K;
                rucVar2.j(aenjVar2);
                rucVar2.k(aenjVar2);
                qbeVar2.a(qbc.gk);
                return;
            case 3:
                plv.a.b().l("com/android/dialer/incall/calltransfer/impl/service/CallTransferController", "onButtonClicked", 55, "CallTransferController.kt").v("transfer clicked");
                plv plvVar = (plv) this.a;
                plvVar.g.a(qbc.eS);
                if (plvVar.e.getAndSet(true)) {
                    return;
                }
                plvVar.h.a(ajcm.a);
                return;
            case 4:
                qvg.a.b().l("com/android/dialer/incall/voice/buttons/AddCallButtonController", "onButtonClicked", 31, "AddCallButtonController.java").v("add call clicked");
                qvg qvgVar = (qvg) this.a;
                qvgVar.e.a(qbc.eH);
                aenj aenjVar3 = ruc.J;
                ruc rucVar3 = qvgVar.d;
                rucVar3.j(aenjVar3);
                rucVar3.k(aenjVar3);
                zmo zmoVar = qvgVar.c;
                zmoVar.b();
                zmoVar.a();
                return;
            case 5:
                qvk qvkVar = (qvk) this.a;
                qvkVar.l.i(aoov.an(qvkVar.f, (aolr) null, 0, new oxe(qvkVar, (aoln) null, 14), 3));
                return;
            case 6:
                qvl.a.b().l("com/android/dialer/incall/voice/buttons/DialpadButtonController", "onButtonClicked", 32, "DialpadButtonController.java").v("dialpad clicked");
                qvl qvlVar = (qvl) this.a;
                qvlVar.d.a(qbc.eJ);
                rcd rcdVar = rcd.b;
                rap rapVar = qvlVar.c;
                qfb qfbVar = new qfb(rapVar, rcdVar, 7);
                ahda ahdaVar = rapVar.v;
                ajct ajctVar2 = rapVar.k;
                rapVar.h.g(ahvr.H(ahdaVar.g(qfbVar, ajctVar2), new qgx(rapVar, 13), ajctVar2), 5L, java.util.concurrent.TimeUnit.SECONDS);
                return;
            case 7:
                qvo.a.b().l("com/android/dialer/incall/voice/buttons/HoldButtonController", "onButtonClicked", 71, "HoldButtonController.java").v("hold clicked");
                java.lang.Object obj3 = this.a;
                qvo qvoVar = (qvo) obj3;
                qvoVar.i.a(qbc.eL);
                ajcq ajcqVarX = qvoVar.j.X();
                qgk qgkVar = new qgk(2);
                ajct ajctVar3 = qvoVar.b;
                qvoVar.h.a(ahrv.g(ahvr.I(ajcqVarX, qgkVar, ajctVar3)).h(new qgx(obj3, 6), ajctVar3));
                return;
            case 8:
                qvp.a.b().l("com/android/dialer/incall/voice/buttons/ManageConferenceButtonController", "onButtonClicked", 24, "ManageConferenceButtonController.java").v("manage conference clicked");
                ((qvp) this.a).c.c(qbc.eN);
                return;
            case 9:
                qvq.a.b().l("com/android/dialer/incall/voice/buttons/MergeButtonController", "onButtonClicked", 50, "MergeButtonController.kt").v("merge clicked");
                qvq qvqVar = (qvq) this.a;
                qvqVar.h.a(qbc.eO);
                if (!j$.util.Collection.-EL.stream(qvqVar.e.a()).anyMatch(new wrm(18))) {
                    qvqVar.g.o();
                    return;
                } else {
                    aimz aimzVar3 = zih.a;
                    aoov.al(qvqVar.b, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, qvqVar, 18));
                    return;
                }
            case 10:
                qvr.a.b().l("com/android/dialer/incall/voice/buttons/MoreButtonController", "onButtonClicked", 28, "MoreButtonController.java").v("more button clicked");
                qvr qvrVar = (qvr) this.a;
                qvrVar.d.a(qbc.eK);
                qvrVar.c.j(qtr.f);
                return;
            case 11:
                qvt.a.b().l("com/android/dialer/incall/voice/buttons/SwapButtonController", "onButtonClicked", 34, "SwapButtonController.java").v("swap clicked");
                qvt qvtVar = (qvt) this.a;
                qvtVar.d.a(qbc.eQ);
                j$.util.Optional optionalG = qvtVar.c.g();
                if (true == optionalG.isPresent()) {
                    agsm.i(665, ((defpackage.qvs) ((apqr) optionalG.get()).a(defpackage.qvs.class)).cq().l(), "failed to unhold the call", new java.lang.Object[0]);
                    return;
                }
                return;
            case 12:
                aimz aimzVar4 = qvx.a;
                aimzVar4.b().l("com/android/dialer/incall/voice/buttons/SwapSimButtonController", "onButtonClicked", 113, "SwapSimButtonController.java").v("swap sim clicked");
                j$.util.OptionalLong optionalLongOf = j$.util.OptionalLong.of(j$.time.Instant.now().toEpochMilli());
                java.lang.Object obj4 = this.a;
                qvx qvxVar = (qvx) obj4;
                qvxVar.h.set(optionalLongOf);
                qvxVar.k.a(ajcm.a);
                qay qayVarA = qvxVar.e.a("swap sim");
                zpm zpmVar = qvxVar.l;
                j$.util.Optional optionalH = zpmVar.h();
                if (optionalH.isPresent()) {
                    apqr apqrVar = (apqr) optionalH.orElseThrow();
                    ajcq ajcqVarK = zpmVar.k(apqrVar, defpackage.qvw.class, new defpackage.iry(11));
                    ajcq ajcqVarK2 = zpmVar.k(apqrVar, defpackage.qvw.class, new defpackage.iry(12));
                    ajcqVarP = ahvr.ak(new ajcq[]{ajcqVarK, ajcqVarK2}).p(new defpackage.kff(obj4, (java.lang.Object) apqrVar, ajcqVarK, ajcqVarK2, 7), qvxVar.d);
                } else {
                    aimzVar4.b().l("com/android/dialer/incall/voice/buttons/SwapSimButtonController", "swapSim", 157, "SwapSimButtonController.java").v("call scope isn't available.");
                    ajcqVarP = aiql.x();
                }
                ahvr.J(ajcqVarP, new defpackage.kxt(qvxVar, qayVarA, 16), qvxVar.d);
                if (true == optionalH.isPresent()) {
                    ((defpackage.qvu) ((apqr) optionalH.get()).a(defpackage.qvu.class)).cp().a(qbc.eR);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                qvy.a.b().l("com/android/dialer/incall/voice/buttons/UnholdButtonController", "onButtonClicked", 28, "UnholdButtonController.java").v("unhold clicked");
                qvy qvyVar = (qvy) this.a;
                qvyVar.d.a(qbc.eM);
                agsm.i(666, qvyVar.c.l(), "failed to unhold the call", new java.lang.Object[0]);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                qvz.a.b().l("com/android/dialer/incall/voice/buttons/UpgradeToRttButtonController", "onButtonClicked", 26, "UpgradeToRttButtonController.java").v("upgradeToRttClicked");
                qvz qvzVar = (qvz) this.a;
                qvzVar.d.a(qbc.eT);
                qvzVar.c.r();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                qwb.a.b().l("com/android/dialer/incall/voice/buttons/UpgradeToTransmissionOnlyVideoButtonController", "onButtonClicked", 35, "UpgradeToTransmissionOnlyVideoButtonController.java").v("upgrade to transmission only video clicked");
                qwb qwbVar = (qwb) this.a;
                j$.util.Optional optionalH2 = qwbVar.c.h();
                if (true == optionalH2.isPresent()) {
                    pvr pvrVarCo = ((defpackage.qwa) ((apqr) optionalH2.get()).a(defpackage.qwa.class)).co();
                    ahoq ahoqVarW2 = ahvr.W(554, "VideoControllerImpl_upgradeToTransmissionOnlyVideo");
                    try {
                        pvrVarCo.e.f(pur.c);
                        ajcq ajcqVarH = ahvr.H(pvrVarCo.o.k(true), new phr(pvrVarCo, 5), pvrVarCo.f);
                        pvrVarCo.l.a(ajcqVarH);
                        ahoqVarW2.a(ajcqVarH);
                        ahoqVarW2.close();
                        agsm.i(667, ajcqVarH, "Failed to upgrade to transmission only video.", new java.lang.Object[0]);
                    } catch (java.lang.Throwable th3) {
                        try {
                            ahoqVarW2.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                qwbVar.d.a(qbc.eW);
                return;
            case 16:
                qwd.a.b().l("com/android/dialer/incall/voice/buttons/UpgradeToVideoButtonController", "onButtonClicked", 34, "UpgradeToVideoButtonController.java").v("upgrade to video clicked");
                qwd qwdVar = (qwd) this.a;
                j$.util.Optional optionalH3 = qwdVar.c.h();
                if (true == optionalH3.isPresent()) {
                    pvr pvrVarCo2 = ((defpackage.qwc) ((apqr) optionalH3.get()).a(defpackage.qwc.class)).co();
                    ahoq ahoqVarW3 = ahvr.W(555, "VideoControllerImpl_upgradeToVideo");
                    try {
                        ajcq ajcqVarH2 = ahvr.H(pvrVarCo2.o.k(true), new phr(pvrVarCo2, 7), pvrVarCo2.f);
                        pvrVarCo2.l.a(ajcqVarH2);
                        ahoqVarW3.a(ajcqVarH2);
                        ahoqVarW3.close();
                        agsm.i(668, ajcqVarH2, "Failed to upgrade to video.", new java.lang.Object[0]);
                    } catch (java.lang.Throwable th5) {
                        try {
                            ahoqVarW3.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                }
                qwdVar.d.a(qbc.eU);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                tmj tmjVar = (tmj) this.a.a();
                tmj.a.b().l("com/android/dialer/sharpie/impl/service/InCallScreenActionControllerImpl", "onSharpieVoiceButtonClicked", 29, "InCallScreenActionControllerImpl.kt").v("User has clicked the Sharpie voice button.");
                tmjVar.e.i(aoov.an(tmjVar.b, (aolr) null, 0, new tkx(tmjVar, (aoln) null, 5), 3));
                return;
            default:
                uaq uaqVar = (uaq) this.a;
                uaqVar.l.a(qbc.hK);
                uaqVar.b.b(mce.cK);
                uaqVar.c();
                return;
        }
    }
}
