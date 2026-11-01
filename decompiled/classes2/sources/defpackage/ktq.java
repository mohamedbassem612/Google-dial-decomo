package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ktq implements android.content.DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ktq(defpackage.gee geeVar, int i) {
        this.$cid = i;
        this.a = geeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        zrz zrzVarCg;
        svi sviVar;
        alin alinVar = null;
        switch (this.$cid) {
            case 0:
                ((defpackage.kts) this.a).c = i;
                return;
            case 1:
                java.lang.Object obj = this.a;
                ((defpackage.gee) obj).ak = i;
                ((defpackage.gel) obj).ao = -1;
                dialogInterface.dismiss();
                return;
            case 2:
                ((defpackage.kth) this.a).d();
                return;
            case 3:
                ((defpackage.kth) this.a).e();
                return;
            case 4:
                java.lang.Object obj2 = this.a;
                defpackage.hhe.J(((aw) obj2).z()).bt().o(rmx.af);
                defpackage.ldw ldwVar = (defpackage.ldw) obj2;
                defpackage.leb lebVar = ldwVar.ak;
                akzx akzxVarM = defpackage.lck.a.m();
                int i2 = lebVar.h;
                akzxVarM.u();
                defpackage.lck lckVar = (defpackage.lck) akzxVarM.b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                lckVar.c = i3;
                lckVar.b |= 1;
                try {
                    lebVar.f.isPresent();
                    ldwVar.ak.a();
                    return;
                } catch (alaz e) {
                    throw new java.lang.IllegalStateException((java.lang.Throwable) e);
                }
            case 5:
                java.lang.Object obj3 = this.a;
                defpackage.hhe.J(((aw) obj3).z()).bt().o(rmx.ag);
                ((defpackage.ldw) obj3).ak.e.finish();
                return;
            case 6:
                java.lang.Object obj4 = this.a;
                defpackage.hhe.I(((aw) obj4).z()).bt().o(rmx.cr);
                defpackage.ldz ldzVar = (defpackage.ldz) obj4;
                ldzVar.ak.c(2);
                ldzVar.ak.a();
                return;
            case 7:
                java.lang.Object obj5 = this.a;
                defpackage.hhe.I(((aw) obj5).z()).bt().o(rmx.cs);
                defpackage.ldz ldzVar2 = (defpackage.ldz) obj5;
                ldzVar2.ak.c(3);
                ldzVar2.ak.a();
                return;
            case 8:
                java.lang.Object obj6 = this.a;
                defpackage.lvk lvkVar = (defpackage.lvk) obj6;
                lvkVar.an = true;
                android.telecom.PhoneAccountHandle phoneAccountHandleBM = mni.bM((defpackage.lvl) lvkVar.al.g.get(i));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("extra_selected_account_handle", phoneAccountHandleBM);
                bundle.putBoolean("extra_set_default", lvkVar.am);
                bundle.putString("extra_call_id", lvkVar.aV());
                defpackage.ve veVar = lvkVar.ao;
                if (veVar != null) {
                    veVar.c(1, bundle, (aw) obj6);
                    return;
                }
                return;
            case 9:
                ahvr.h(new zsy(), (defpackage.al) ((defpackage.nwj) this.a).a);
                return;
            case 10:
                aooh.f(dialogInterface, "dialog");
                defpackage.nwp nwpVar = (defpackage.nwp) this.a;
                nwpVar.c = true;
                android.telecom.PhoneAccountHandle phoneAccountHandleBM2 = mni.bM((defpackage.lvl) nwpVar.a().g.get(i));
                zrx zrxVar = nwpVar.a;
                zsc zscVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).p;
                if (zscVar == null) {
                    zscVar = zsc.a;
                }
                aooh.e(zscVar, "getCallingAccountSelectorAsyncData(...)");
                defpackage.hwv hwvVar = nwpVar.f;
                java.lang.String str = zrxVar.e;
                aooh.e(str, "getPhoneNumber(...)");
                android.net.Uri uri = android.net.Uri.parse(str);
                aooh.e(uri, "parse(...)");
                java.lang.String schemeSpecificPart = uri.getSchemeSpecificPart();
                zsb zsbVar = zscVar.d;
                if (zsbVar == null) {
                    zsbVar = zsb.a;
                }
                aooh.e(zsbVar, "getSuggestion(...)");
                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(zsbVar.c);
                if (componentNameUnflattenFromString != null) {
                    android.telecom.PhoneAccountHandle phoneAccountHandle = new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, zsbVar.d);
                    int iAW = a.aW(zsbVar.e);
                    switch ((iAW != 0 ? iAW : 1) - 2) {
                        case 0:
                        case 1:
                        default:
                            sviVar = svi.a;
                            break;
                        case 2:
                            sviVar = svi.b;
                            break;
                        case 3:
                            sviVar = svi.c;
                            break;
                        case 4:
                            sviVar = svi.d;
                            break;
                        case 5:
                            sviVar = svi.e;
                            break;
                        case 6:
                            sviVar = svi.f;
                            break;
                    }
                    alinVar = new alin(phoneAccountHandle, sviVar, zsbVar.f);
                }
                alat alatVar = zscVar.e;
                aooh.e(alatVar, "getDataIdsList(...)");
                hwvVar.p(schemeSpecificPart, alinVar, ahvr.bx(alatVar)).f(phoneAccountHandleBM2, nwpVar.d);
                zoe zoeVarCi = aehj.ci(zrxVar.p());
                if (phoneAccountHandleBM2 != null && (zrzVarCg = aehj.cg(phoneAccountHandleBM2)) != null) {
                    zoeVarCi.c(zrzVarCg);
                }
                ahvr.i(new ztc(zoeVarCi.a()), nwpVar.b);
                return;
            case 11:
                tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "showUserDialogToEnableCallerIdAndSpamSetting", 476, "RevelioSettingsFragmentPeer.java").v("User confirmed enabling caller ID and spam setting");
                java.lang.Object obj7 = this.a;
                tax taxVar = (tax) obj7;
                taxVar.s.b(taxVar.g, taxVar.D.g(), new defpackage.kll(obj7, 7), new defpackage.jox(13));
                return;
            case 12:
                com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "showUserDialogToEnableCallerIdAndSpamSetting", 289, "TidepodsCallerActionPreferenceCompat.java").v("User confirmed enabling caller ID and spam setting");
                java.lang.Object obj8 = this.a;
                com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompat = (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj8;
                tidepodsCallerActionPreferenceCompat.L.b(((androidx.preference.Preference) obj8).j, tidepodsCallerActionPreferenceCompat.ae().g(), new defpackage.kll(obj8, 9), new defpackage.jox(16));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.al) this.a).s(false, false);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((uho) this.a).aU();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity.n.b().l("com/android/dialer/voicemail/settings/RecordVoicemailGreetingActivity", "redo", 403, "RecordVoicemailGreetingActivity.java").v("re-recording greeting");
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a;
                recordVoicemailGreetingActivity.t.n(rmw.cm);
                recordVoicemailGreetingActivity.r.f();
                return;
            case 16:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).t.n(rmw.cl);
                dialogInterface.dismiss();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity2 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a;
                recordVoicemailGreetingActivity2.t.n(rmw.cq);
                recordVoicemailGreetingActivity2.x();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity3 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a;
                recordVoicemailGreetingActivity3.t.n(rmw.cp);
                dialogInterface.dismiss();
                if (recordVoicemailGreetingActivity3.p.isShowing()) {
                    recordVoicemailGreetingActivity3.p.dismiss();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj9 = this.a;
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity4 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj9;
                recordVoicemailGreetingActivity4.t.n(rmw.cj);
                recordVoicemailGreetingActivity4.w();
                ((mp) obj9).fc().e();
                return;
            default:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).t.n(rmw.ci);
                dialogInterface.dismiss();
                return;
        }
    }

    public /* synthetic */ ktq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
