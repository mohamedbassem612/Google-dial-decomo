package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kll implements defpackage.lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kll(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.lot
    public final void a(java.lang.Object obj) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                rmw rmwVar = rmw.hl;
                defpackage.klo kloVar = ((defpackage.klm) obj2).a;
                kloVar.g.n(rmwVar);
                kloVar.L.i((java.lang.String) null).b(mce.dj);
                break;
            case 1:
                ((defpackage.joz) this.a).aW((defpackage.jnm) obj);
                break;
            case 2:
                android.content.Intent intent = (android.content.Intent) obj;
                if (intent != null) {
                    android.content.Context context = ((android.view.View) this.a).getContext();
                    aooh.e(context, "getContext(...)");
                    ahqx.l(context, intent);
                }
                break;
            case 3:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.oon.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsFragmentCompatPeer", "addFlipToSilenceSettings", 109, "FlipToSilenceSettingsFragmentCompatPeer.java").y("Updating Flip to Silence preference UI to: %s", bool);
                ((defpackage.oon) this.a).c.k(java.lang.Boolean.TRUE.equals(bool));
                break;
            case 4:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "loadDeleteOldRecordingsPreferenceData", 387, "RevelioSettingsFragmentPeer.java").y("Should save audio preference loaded successfully %s.", bool2);
                tax taxVar = (tax) this.a;
                taxVar.o.k(bool2.booleanValue());
                taxVar.o.I(true);
                break;
            case 5:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "loadShouldSaveAudioPreferenceData", 318, "RevelioSettingsFragmentPeer.java").y("loadShouldSaveAudioPreferenceData: should save audio preference loaded successfully %s", bool3);
                tax taxVar2 = (tax) this.a;
                taxVar2.l.k(bool3.booleanValue());
                taxVar2.l.I(true);
                break;
            case 6:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj3 = this.a;
                if (!zBooleanValue) {
                    ((tax) obj3).a();
                } else {
                    tax taxVar3 = (tax) obj3;
                    taxVar3.D.f(taxVar3.g, new defpackage.ktq(obj3, 11), new usq(1));
                }
                break;
            case 7:
                ((tax) this.a).a();
                break;
            case 8:
                tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "hideActivatingCallScreenPreferenceAndEnableVoicePreference", 467, "RevelioSettingsFragmentPeer.java").v("hiding activation preference");
                tax taxVar4 = (tax) this.a;
                taxVar4.f.dW().af(taxVar4.j);
                taxVar4.t.I(true);
                break;
            case 9:
                com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompat = (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) this.a;
                tidepodsCallerActionPreferenceCompat.n();
                tidepodsCallerActionPreferenceCompat.k(tbe.c);
                break;
            case 10:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj4 = this.a;
                if (!zBooleanValue2) {
                    com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompat2 = (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj4;
                    tidepodsCallerActionPreferenceCompat2.n();
                    tidepodsCallerActionPreferenceCompat2.k(tbe.c);
                } else {
                    ((com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj4).ae().f(((androidx.preference.Preference) obj4).j, new defpackage.ktq(obj4, 12), new defpackage.jlg(obj4, 10));
                }
                break;
            case 11:
                tbe tbeVar = (tbe) obj;
                aimw aimwVarL = com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "setupAndLoadInitialValue", 148, "TidepodsCallerActionPreferenceCompat.java");
                java.lang.Object obj5 = this.a;
                androidx.preference.Preference preference = (androidx.preference.Preference) obj5;
                aimwVarL.I("setup for \"%s\": call action loaded successfully %s", preference.r, tbeVar.name());
                ((com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj5).l(tbeVar);
                preference.I(true);
                break;
            case 12:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj6 = this.a;
                    com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "updateAudioStoragePreference", 210, "TidepodsCallerActionPreferenceCompat.java").v("Turning on audio-storage setting");
                    ((tav) ((com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj6).J.orElseThrow()).be().b();
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                tdt tdtVar = (tdt) obj;
                if (tdtVar != null) {
                    java.lang.Object obj7 = this.a;
                    tdv tdvVar = (tdv) obj7;
                    tdvVar.f = tdtVar;
                    while (true) {
                        int i2 = i + 1;
                        if (i2 < tdtVar.f.size() && ((tdy) tdtVar.f.get(i)).e == ((tdy) tdtVar.f.get(i2)).e) {
                            i = i2;
                        }
                    }
                    tdvVar.g = i;
                    ((kh) obj7).e();
                } else {
                    a.bI(tdv.a.d(), "null RttTranscript", "com/android/dialer/rtt/transcript/RttTranscriptAdapter", "setRttTranscript", 'Z', "RttTranscriptAdapter.java", zct.b);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aify aifyVar = (aify) obj;
                tkd tkdVar = (tkd) this.a;
                tkdVar.b.o(rmx.ik);
                tkdVar.al.C(aifyVar, 2);
                if (!aifyVar.isEmpty()) {
                    tkdVar.s(j$.util.OptionalInt.of(2132018225));
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                wgi wgiVar = (wgi) obj;
                tjv tjvVar = ((tkd) this.a).al;
                if (!tjvVar.a.equals(wgiVar)) {
                    tjvVar.a = wgiVar;
                    tjvVar.e();
                }
                break;
            case 16:
                tcp tcpVar = (tcp) obj;
                tkd tkdVar2 = (tkd) this.a;
                tkdVar2.d.d = tcpVar;
                tkdVar2.ao = j$.util.Optional.of(tcpVar);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a;
                recordVoicemailGreetingActivity.t.n(rmw.cn);
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity.n.b().l("com/android/dialer/voicemail/settings/RecordVoicemailGreetingActivity", "uploadGreeting", 350, "RecordVoicemailGreetingActivity.java").v("intent back to settings activity");
                recordVoicemailGreetingActivity.p.dismiss();
                recordVoicemailGreetingActivity.setResult(-1);
                recordVoicemailGreetingActivity.finish();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity2 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a;
                recordVoicemailGreetingActivity2.s.d = recordVoicemailGreetingActivity2.r.i;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                xap xapVar = (xap) obj;
                java.lang.Object obj8 = this.a;
                if (xapVar == xap.b || xapVar == xap.d) {
                    xal xalVar = new xal();
                    xalVar.c(true);
                    xalVar.b(true);
                    ((xan) obj8).b(xalVar.a());
                } else {
                    xan.a.b().l("com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "autoOptIn", 407, "AtlasSettingsFragmentPeer.java").v("auto-enabling opt-in");
                    xan xanVar = (xan) obj8;
                    android.content.Context contextZ = xanVar.d.z();
                    android.view.View viewFindViewById = xanVar.l.findViewById(2131427491);
                    vet vetVar = new vet(obj8, 14);
                    if (viewFindViewById != null) {
                        int color = contextZ.getColor(2131099712);
                        defpackage.hsh hshVarB = defpackage.hsh.b();
                        hshVarB.k(new defpackage.eyd(color, viewFindViewById, 10));
                        hshVarB.h(new vxs(viewFindViewById, 2));
                        hshVarB.i(new wdm(viewFindViewById, vetVar, 4));
                        hshVarB.setDuration(wsc.bp(contextZ, urp.p));
                        hshVarB.start();
                    } else {
                        vetVar.run();
                    }
                }
                break;
            default:
                ((xan) this.a).k.R(false);
                break;
        }
    }
}
