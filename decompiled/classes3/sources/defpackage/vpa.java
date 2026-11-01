package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vpa implements agye {
    final /* synthetic */ defpackage.vpc a;

    public vpa(defpackage.vpc vpcVar) {
        j$.util.Objects.requireNonNull(vpcVar);
        this.a = vpcVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.vpc.a.c(), "onError", "com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer$1", "onError", (char) 152, "VoicemailSettingsFragmentPeer.java", th, zct.b);
        this.a.a();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0229  */
    public final /* synthetic */ void b(java.lang.Object obj) {
        boolean z;
        defpackage.vru vruVar = (defpackage.vru) obj;
        aimz aimzVar = defpackage.vpc.a;
        aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer$1", "onNewData", 110, "VoicemailSettingsFragmentPeer.java").v("new data");
        aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "setupActionBarTitleForMultipleSim", 408, "VoicemailSettingsFragmentPeer.java").v("voicemail");
        j$.util.Optional optional = vruVar.d;
        boolean zIsPresent = optional.isPresent();
        defpackage.vpc vpcVar = this.a;
        if (zIsPresent) {
            defpackage.voz vozVar = vpcVar.r;
            cp cpVarI = vozVar.G().i();
            if (cpVarI == null || android.text.TextUtils.isEmpty(cpVarI.d())) {
                a.bI(aimzVar.d(), "failed to get title of action bar", "com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "setupActionBarTitleForMultipleSim", (char) 416, "VoicemailSettingsFragmentPeer.java", zct.b);
            } else {
                cpVarI.j(((androidx.preference.Preference) vozVar.dW()).r);
                android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.valueOf(cpVarI.d()) + " (" + ((defpackage.sot) optional.orElseThrow()).c + ')');
                int iC = ((defpackage.sot) optional.orElseThrow()).d;
                if (iC == 0) {
                    iC = urg.c(vpcVar.p, android.R.attr.textColorSecondary);
                }
                spannableString.setSpan(new android.text.style.TextAppearanceSpan(vpcVar.q, 2132083248), cpVarI.d().length(), spannableString.length(), 18);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(iC), cpVarI.d().length(), spannableString.length(), 18);
                vpcVar.d = j$.util.Optional.of(spannableString);
                cpVarI.j(spannableString);
            }
        } else {
            a.bI(aimzVar.d(), "ignore to add label for non-dual sim", "com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "setupActionBarTitleForMultipleSim", (char) 411, "VoicemailSettingsFragmentPeer.java", zct.b);
        }
        defpackage.vrr vrrVar = vruVar.e;
        defpackage.vrr vrrVar2 = defpackage.vrr.a;
        if (vrrVar.equals(vrrVar2)) {
            vpcVar.i.R(true);
        } else {
            vpcVar.i.R(false);
        }
        vpcVar.g.R(true);
        vpcVar.g.t = vruVar.b;
        vpcVar.j.R(true);
        ((androidx.preference.Preference) vpcVar.j).t = vruVar.c;
        j$.util.Optional optional2 = vruVar.f;
        if (!optional2.isPresent() || ((defpackage.vrt) optional2.orElseThrow()).a) {
            vpcVar.a();
            j$.util.Optional optional3 = vruVar.h;
            defpackage.vdi vdiVar = new defpackage.vdi(vpcVar, 13);
            if (true == optional3.isPresent()) {
                java.lang.Object obj2 = optional3.get();
                defpackage.vpc vpcVar2 = (defpackage.vpc) vdiVar.a;
                vpcVar2.k.R(true);
                vpcVar2.k.k(false);
                com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat = vpcVar2.k;
                boolean zBooleanValue = ((java.lang.Boolean) vpcVar2.w.a()).booleanValue();
                android.content.Context context = vpcVar2.p;
                switchPreferenceWithClickableSummaryCompat.p(new defpackage.akwb(context, zBooleanValue).d((java.lang.String) obj2, context.getString(2132018781), context.getString(2132020940)));
                vpcVar2.k.I(false);
                com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat2 = vpcVar2.k;
                if (((androidx.preference.Preference) switchPreferenceWithClickableSummaryCompat2).z) {
                    ((androidx.preference.Preference) switchPreferenceWithClickableSummaryCompat2).z = false;
                    switchPreferenceWithClickableSummaryCompat2.d();
                    return;
                }
                return;
            }
            return;
        }
        defpackage.vrt vrtVar = (defpackage.vrt) optional2.orElseThrow();
        vpcVar.k.R(true);
        com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat3 = vpcVar.k;
        defpackage.vrr vrrVar3 = vrtVar.c;
        switchPreferenceWithClickableSummaryCompat3.k(vrrVar3.equals(vrrVar2));
        vpcVar.k.I(true);
        java.lang.String str = (java.lang.String) vrtVar.d.orElse("");
        if (str.contains("^")) {
            com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat4 = vpcVar.k;
            android.content.Context context2 = vpcVar.p;
            switchPreferenceWithClickableSummaryCompat4.p(new defpackage.akwb(context2, ((java.lang.Boolean) vpcVar.w.a()).booleanValue()).d(str, context2.getString(2132018781), context2.getString(2132020940)));
        } else {
            vpcVar.k.p(str);
        }
        if (vrrVar3.equals(vrrVar2) && vrtVar.b) {
            defpackage.vrr vrrVar4 = vrtVar.e;
            defpackage.vrr vrrVar5 = defpackage.vrr.c;
            if (vrrVar4.equals(vrrVar5)) {
                vpcVar.l.R(false);
                vpcVar.m.R(false);
            } else {
                vpcVar.l.R(true);
                vpcVar.l.k(vrrVar4.equals(vrrVar2));
                com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat5 = vpcVar.l;
                android.content.Context context3 = vpcVar.p;
                switchPreferenceWithClickableSummaryCompat5.p(new defpackage.akwb(context3, ((java.lang.Boolean) vpcVar.w.a()).booleanValue()).b(vpcVar.r.z().getText(2132020963), context3.getString(2132020954)));
                vpcVar.l.I(true);
                defpackage.vrr vrrVar6 = vrtVar.f;
                if (vrrVar6.equals(vrrVar5)) {
                    vpcVar.m.R(false);
                } else {
                    vpcVar.m.R(true);
                    vpcVar.m.I(true);
                    vpcVar.m.k(vrrVar6.equals(vrrVar2));
                    vpcVar.m.p((java.lang.CharSequence) vrtVar.g.orElse((java.lang.Object) null));
                }
            }
        } else {
            vpcVar.l.R(false);
            vpcVar.m.R(false);
        }
        if (vrtVar.l) {
            z = true;
            vpcVar.n.R(true);
            vpcVar.n.I(true);
        } else {
            z = true;
        }
        vpcVar.o.R(z);
        vpcVar.o.t = (android.content.Intent) vrtVar.k.orElse((java.lang.Object) null);
        vpcVar.o.Q((java.lang.CharSequence) vrtVar.j.orElse((java.lang.Object) null));
        vpcVar.o.p((java.lang.CharSequence) vrtVar.i.orElse((java.lang.Object) null));
        vpcVar.o.I(vrrVar3.equals(vrrVar2) && vrtVar.b);
        aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "setupChangeGreetingPreference", 553, "VoicemailSettingsFragmentPeer.java").y("updateGreeting current model %s", vrtVar);
        vpcVar.h.R(vrtVar.h.equals(vrrVar2));
        androidx.preference.Preference preference = vpcVar.h;
        java.lang.String name = defpackage.vqh.class.getName();
        aooh.e(name, "getName(...)");
        preference.u = name;
        aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "setupChangeGreetingPreference", 558, "VoicemailSettingsFragmentPeer.java").v("single-greeting UI is used");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("phone_account_handle", vpcVar.f);
        vpcVar.h.t().putAll(bundle);
        if (!vruVar.a) {
            vpcVar.k.I(false);
            vpcVar.l.I(false);
            vpcVar.m.I(false);
            vpcVar.n.I(false);
            vpcVar.o.I(false);
            vpcVar.h.I(false);
        }
        j$.util.Optional optional4 = vruVar.g;
        if (optional4.isPresent()) {
            defpackage.tyw tywVar = (defpackage.tyw) optional4.orElseThrow();
            defpackage.tyv tyvVarB = defpackage.tyv.b(tywVar.d);
            if (tyvVarB == null) {
                tyvVarB = defpackage.tyv.UNRECOGNIZED;
            }
            defpackage.tyv tyvVar = defpackage.tyv.ALREADY_AVAILABLE;
            if (tyvVarB != tyvVar) {
                vpcVar.l.I(false);
                vpcVar.m.I(false);
            }
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer$1", "onNewData", 144, "VoicemailSettingsFragmentPeer.java");
            defpackage.tyv tyvVarB2 = defpackage.tyv.b(tywVar.d);
            if (tyvVarB2 == null) {
                tyvVarB2 = defpackage.tyv.UNRECOGNIZED;
            }
            aimwVarL.y("Soda banner mode = %s", tyvVarB2);
            defpackage.tyv tyvVarB3 = defpackage.tyv.b(tywVar.d);
            if (tyvVarB3 == null) {
                tyvVarB3 = defpackage.tyv.UNRECOGNIZED;
            }
            if (tyvVarB3 != tyvVar || vpcVar.e.isPresent()) {
                vpcVar.e = j$.util.Optional.of(tywVar);
                defpackage.voz vozVar2 = vpcVar.r;
                defpackage.tyx tyxVar = (defpackage.tyx) vozVar2.N().findViewById(2131428975);
                if (tyxVar == null) {
                    defpackage.tyx tyxVarB = defpackage.tys.b(vpcVar.q, tywVar);
                    tyxVarB.setId(2131428975);
                    ((android.view.ViewGroup) vozVar2.N()).addView(tyxVarB, 0);
                } else {
                    tyxVar.y().a(tywVar);
                }
            } else {
                aimzVar.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "renderSodaBanner", 390, "VoicemailSettingsFragmentPeer.java").v("soda was previously available");
            }
        }
        vpcVar.v.m(ruc.bv);
    }

    public final /* synthetic */ void c() {
    }
}
