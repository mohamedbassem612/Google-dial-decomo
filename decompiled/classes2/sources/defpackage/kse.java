package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kse implements oi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kse(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0264  */
    /* JADX WARN: Type inference failed for: r0v1, types: [aowv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, twa] */
    /* JADX WARN: Type inference failed for: r2v84, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aoss, java.lang.Object] */
    public final void a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ?? r0 = this.a;
                java.lang.Object objH = aoil.h((aowv) r0, obj);
                if (objH instanceof aowl) {
                    aowm.b(objH);
                    defpackage.ksg.a.d().l("com/android/dialer/callnotesinfra/ui/CallNotesUiModelsMappers", "launchAwaitingForResult$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 360, "CallNotesUiModelsMappers.kt").v("Error sending activity result");
                }
                r0.e((java.lang.Throwable) null);
                break;
            case 1:
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                aooh.f(activityResult, "result");
                int i = activityResult.a;
                if (i == -1) {
                    defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "greetingRecorderLauncher$<anonymous>", 127, "BeeslyGreetingSettingsFragmentPeer.kt").v("RecordGreetingActivity saved the greeting successfully.");
                    android.content.Intent intent = activityResult.b;
                    ((defpackage.iyi) this.a).q = intent != null ? intent.getStringExtra("greeting_id") : null;
                } else if (i != 0) {
                    defpackage.iyi.a.d().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "greetingRecorderLauncher$<anonymous>", 137, "BeeslyGreetingSettingsFragmentPeer.kt").w("RecordGreetingActivity finished with unexpected result code: %d", i);
                } else {
                    defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "greetingRecorderLauncher$<anonymous>", 132, "BeeslyGreetingSettingsFragmentPeer.kt").v("RecordGreetingActivity is canceled.");
                }
                break;
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                java.lang.Object obj2 = this.a;
                rmx rmxVar = rmx.gR;
                defpackage.lij lijVar = ((defpackage.lhe) obj2).b;
                lijVar.c.o(rmxVar);
                if (!optional.isPresent() || (((yqi) optional.orElseThrow()).b & 1) == 0) {
                    a.bI(defpackage.lij.a.c().m(aioa.b), "EnqueueStatus of SODA download not received", "com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataService", "onSodaDownloadEnqueued", 'J', "CallScreenSettingsDataService.java", zct.b);
                } else {
                    int iAS = a.aS(((yqi) optional.orElseThrow()).c);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i2 = iAS - 1;
                    if (i2 == 1 || i2 == 2) {
                        defpackage.lij.a.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataService", "onSodaDownloadEnqueued", 81, "CallScreenSettingsDataService.java").v("SODA download started");
                        lijVar.d.s(lijVar.e.bl(new jsd(lijVar, 11)), defpackage.lil.b);
                    } else {
                        defpackage.lij.a.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataService", "onSodaDownloadEnqueued", 107, "CallScreenSettingsDataService.java").v("SODA download failed to start");
                    }
                }
                break;
            case 3:
                for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    if (!((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        java.lang.Object obj3 = this.a;
                        defpackage.mhw.a.b().l("com/android/dialer/defaultdialer/impl/DefaultDialerFragmentPeer", "onCreate", 97, "DefaultDialerFragmentPeer.java").y("User denied permission: %s", entry.getKey());
                        ((defpackage.mhw) obj3).d.n(rmw.ki);
                    }
                }
                break;
            case 4:
                java.util.Map map = (java.util.Map) obj;
                aooh.f(map, "result");
                java.util.Collection collectionValues = map.values();
                boolean z = collectionValues instanceof java.util.Collection;
                java.lang.Object obj4 = this.a;
                if (!z || !collectionValues.isEmpty()) {
                    java.util.Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (!((java.lang.Boolean) it.next()).booleanValue()) {
                            defpackage.oiz oizVar = (defpackage.oiz) obj4;
                            agtj agtjVar = oizVar.f;
                            defpackage.jiv jivVar = oizVar.j;
                            ajcq ajcqVarF = aosv.F((aoss) jivVar.a, 0, new defpackage.ogf(jivVar, (aoln) null, 8), 3);
                            ((aogc) jivVar.b).s(ajcqVarF, defpackage.oiw.a);
                            agtjVar.i(zoe.N(ajcqVarF), oizVar.h);
                            break;
                        }
                    }
                }
                ((defpackage.oiz) obj4).k.s(ajcm.a, defpackage.oiw.a);
                break;
            case 5:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                java.lang.Object obj5 = this.a;
                if (zBooleanValue) {
                    j$.util.Optional optionalF = ((qhj) obj5).f();
                    if (true == optionalF.isPresent()) {
                        qfj qfjVar = (qfj) optionalF.get();
                        if (((java.lang.Boolean) qfjVar.j.a()).booleanValue()) {
                            qfjVar.f.f();
                        } else {
                            qfjVar.o.a(ajcm.a);
                        }
                    }
                }
                ((qhj) obj5).k.o(bool.booleanValue() ? rmx.hp : rmx.hq);
                break;
            case 6:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                java.lang.Object obj6 = this.a;
                if (zBooleanValue2) {
                    j$.util.Optional optionalK = ((qtd) obj6).k();
                    if (true == optionalK.isPresent()) {
                        qrv qrvVar = (qrv) optionalK.get();
                        if (((java.lang.Boolean) qrvVar.o.a()).booleanValue()) {
                            qrvVar.n.f();
                        } else {
                            qrvVar.s.a(ajcm.a);
                        }
                    }
                }
                ((qtd) obj6).k.o(bool2.booleanValue() ? rmx.hp : rmx.hq);
                break;
            case 7:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    j$.util.Optional optionalK2 = ((qtd) this.a).k();
                    if (true == optionalK2.isPresent()) {
                        ((qrv) optionalK2.get()).q.j();
                    }
                } else {
                    a.bI(qtd.b.d(), "camera permission denied", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "<init>", (char) 1562, "VideoScreenFragmentPeer.java", zct.b);
                }
                break;
            case 8:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                aooh.f(bool3, "userGrantedPermission");
                rdk rdkVar = (rdk) this.a;
                rap rapVarB = rdkVar.b();
                if (rapVarB == null) {
                    rdk.a.d().i(zct.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "createBluetoothPermissionRequestLauncher$<anonymous>", 440, "VoiceFragmentPeer.kt").v("controller is empty.");
                } else {
                    if (bool3.booleanValue()) {
                        rapVarB.l();
                    }
                    rcc rccVarD = rdkVar.d();
                    rce rceVar = rccVarD != null ? rccVarD.k : null;
                    if (rceVar != null) {
                        rce rceVar2 = rcf.a;
                        if (!aooh.n(rceVar, rcf.a(qtr.g))) {
                            rapVarB.i();
                        }
                    } else {
                        rapVarB.i();
                    }
                    rapVarB.t.a(false);
                    rdkVar.d.o(bool3.booleanValue() ? rmx.hp : rmx.hq);
                }
                break;
            case 9:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                aooh.f(bool4, "it");
                boolean zBooleanValue3 = bool4.booleanValue();
                rxo.a.b().l("com/android/dialer/opsrecordaudioaccess/precall/OpsRecordAudioPrecallIntegrationDialogFragmentPeer", "onPermissionResult", 128, "OpsRecordAudioPrecallIntegrationDialogFragmentPeer.kt").y("mic permission granted: %b", bool4);
                rxo rxoVar = (rxo) this.a;
                if (((java.lang.Boolean) rxoVar.e.a()).booleanValue()) {
                    if (zBooleanValue3) {
                        ahvr.h(new ztc(rxoVar.f), rxoVar.b);
                    } else {
                        ahvr.h(new zsy(), rxoVar.b);
                    }
                    rxoVar.b.f();
                } else {
                    aw awVarE = rxoVar.c.a().e("PRECALL_FRAGMENT_TAG");
                    if (zBooleanValue3) {
                        ahvr.i(new ztc(rxoVar.f), awVarE);
                    } else {
                        ahvr.i(new zsy(), awVarE);
                    }
                }
                break;
            case 10:
                android.net.Uri uri = (android.net.Uri) obj;
                if (uri != null) {
                    sfz sfzVar = (sfz) this.a;
                    sfzVar.h.o(rmx.yB);
                    sfzVar.g(uri, "");
                } else {
                    sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "contactPickerLauncher$<anonymous>", 211, "CallingCardSettingsFragmentPeer.kt").v("Contact picker returned null result");
                }
                break;
            case 11:
                sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer", "savePatrickResult", 321, "CallingCardSettingsFragmentPeer.kt").v("savePatrickResult");
                sfz sfzVar2 = (sfz) this.a;
                aoov.an(sfzVar2.e, (aolr) null, 0, new rir((abxt) obj, sfzVar2, (aoln) null, 5), 3);
                break;
            case 12:
                java.util.Map map2 = (java.util.Map) obj;
                aooh.f(map2, "result");
                java.util.Collection collectionValues2 = map2.values();
                boolean z2 = collectionValues2 instanceof java.util.Collection;
                java.lang.Object obj7 = this.a;
                if (!z2 || !collectionValues2.isEmpty()) {
                    java.util.Iterator it2 = collectionValues2.iterator();
                    while (it2.hasNext()) {
                        if (!((java.lang.Boolean) it2.next()).booleanValue()) {
                            sgh sghVar = new sgh();
                            amxr.g(sghVar);
                            sghVar.r(((sfz) obj7).d.I(), "patrick_settings_permissions_dialog_tag");
                            break;
                        }
                    }
                }
                ((sfz) obj7).n.b(aojh.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                abxt abxtVar = (abxt) obj;
                if (abxtVar != null && !aooh.n(abxtVar, abxt.a)) {
                    sfz sfzVar3 = (sfz) this.a;
                    sfzVar3.b().b(mce.hL);
                    java.lang.String strY = sfzVar3.d.Y(2132017957);
                    aooh.e(strY, "getString(...)");
                    sfzVar3.h(strY, -1);
                    break;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                abxn abxnVar = (abxn) obj;
                if (abxnVar != null) {
                    java.lang.Object obj8 = this.a;
                    vaa vaaVarC = abxl.C(abxnVar.p());
                    vaaVarC.R(5);
                    vaaVarC.Q(3);
                    ((sfz) obj8).t.b(vaaVarC.M());
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                abxt abxtVar2 = (abxt) obj;
                if (abxtVar2 != null) {
                    java.lang.Object obj9 = this.a;
                    if ((abxtVar2.b & 1) != 0) {
                        ((sfz) obj9).u.b(abxtVar2);
                    } else {
                        sfz sfzVar4 = (sfz) obj9;
                        agtj agtjVar2 = sfzVar4.g;
                        uss ussVar = sfzVar4.w;
                        agtjVar2.i(new zoe(aosv.F((aoss) ussVar.e, 0, new defpackage.mel(ussVar, (aoln) null, 2), 3)), sfzVar4.l);
                    }
                }
                break;
            case 16:
                abxn abxnVar2 = (abxn) obj;
                if (abxnVar2 != null) {
                    ((sfz) this.a).t.b(abxnVar2);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.net.Uri uri2 = (android.net.Uri) obj;
                if (uri2 != null) {
                    sle sleVar = (sle) this.a;
                    uhp uhpVar = sleVar.K;
                    aoov.an((aoss) uhpVar.f, (aolr) null, 0, new roz(uhpVar, uri2, (aoln) null, 6), 3);
                    sleVar.e(uri2);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                androidx.activity.result.ActivityResult activityResult2 = (androidx.activity.result.ActivityResult) obj;
                aooh.f(activityResult2, "activityResult");
                if (activityResult2.a == -1) {
                    sle sleVar2 = (sle) this.a;
                    sleVar2.O.i(ahvr.ag(sleVar2.g, sleVar2.M, new sfo(sleVar2, (aoln) null, 7, (byte[]) null)));
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj10 = this.a;
                if (zBooleanValue4) {
                    ((sle) obj10).d();
                } else {
                    ((sle) obj10).K.z(new defpackage.cos(3, 6, null));
                }
                break;
            default:
                this.a.a();
                break;
        }
    }
}
