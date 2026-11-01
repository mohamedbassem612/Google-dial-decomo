package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oom implements defpackage.lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ oom(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.lot
    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aimw aimwVarL = defpackage.oon.a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsFragmentCompatPeer", "onPreferenceChange", 130, "FlipToSilenceSettingsFragmentCompatPeer.java");
            java.lang.Object obj2 = this.b;
            aimwVarL.y("successfully changed flip to silence to: %b", obj2);
            boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
            rmx rmxVar = zBooleanValue ? rmx.dC : rmx.dD;
            defpackage.oon oonVar = (defpackage.oon) this.a;
            oonVar.f.o(rmxVar);
            if (zBooleanValue) {
                oonVar.g.g.bm(rmu.s);
            }
            oonVar.c.k(zBooleanValue);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            aimz aimzVar = defpackage.joz.c;
            aimw aimwVarL2 = aimzVar.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat", "onPreferenceChange", 145, "CallAnnouncerSettingsFragmentCompat.java");
            java.lang.Object obj3 = this.a;
            aimwVarL2.y("successfully changed caller id announcement preference to: %s", obj3);
            java.lang.Object obj4 = this.b;
            defpackage.joz jozVar = (defpackage.joz) obj4;
            if (jozVar.an.g().isPresent()) {
                defpackage.jns jnsVar = (defpackage.jns) jozVar.an.g().orElseThrow();
                defpackage.jor jorVar = (defpackage.jor) obj3;
                int i3 = 0;
                if (jorVar.equals(defpackage.jor.ALWAYS) || jorVar.equals(defpackage.jor.HEADSET)) {
                    jnsVar.c();
                    jozVar.d.b(((aw) obj4).z(), jnsVar.b(), new defpackage.joy(i2), new defpackage.jox(0));
                } else {
                    defpackage.lpa lpaVar = jozVar.d;
                    android.content.Context contextZ = ((aw) obj4).z();
                    defpackage.jns.a.b().l("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "cancelPeriodicTtsPrewarmForSystemLocale", 141, "CallAnnouncerTtsPrewarmerImpl.java").v("Cancelling periodic pre-warm");
                    lpaVar.b(contextZ, ahvr.H(((zjx) jnsVar.d.a()).a("com.android.dialer.texttospeech.PrewarmTextToSpeechWorker"), new defpackage.exn(15), jnsVar.c), new defpackage.joy(i3), new defpackage.jox(2));
                }
            } else {
                a.bI(aimzVar.c().m(aioa.b), "call announcer preference updated while feature disabled", "com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat", "handleCallAnnouncerPreferenceChange", (char) 204, "CallAnnouncerSettingsFragmentCompat.java", zct.b);
            }
            if (jozVar.ak) {
                defpackage.jor jorVar2 = (defpackage.jor) obj3;
                if (jorVar2.equals(defpackage.jor.NEVER)) {
                    jozVar.al.o(rmx.en);
                    return;
                } else {
                    if (jorVar2.equals(defpackage.jor.ALWAYS)) {
                        jozVar.al.o(rmx.eo);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            aimw aimwVarL3 = tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "onSaveAudioPreferenceChanged", 291, "RevelioSettingsFragmentPeer.java");
            java.lang.Object obj5 = this.b;
            aimwVarL3.y("saveAudioPreferenceChanged: value changed successfully %s", obj5);
            ((tax) this.a).l.k(((java.lang.Boolean) obj5).booleanValue());
            return;
        }
        if (i == 3) {
            aimw aimwVarL4 = tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "onDeleteOldRecordingsPreferenceChanged", 363, "RevelioSettingsFragmentPeer.java");
            java.lang.Object obj6 = this.b;
            aimwVarL4.y("Value changed successfully %s", obj6);
            ((tax) this.a).o.k(((java.lang.Boolean) obj6).booleanValue());
            return;
        }
        aimw aimwVarL5 = com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "onPreferenceChanged", 235, "TidepodsCallerActionPreferenceCompat.java");
        java.lang.Object obj7 = this.b;
        java.lang.Object obj8 = this.a;
        androidx.preference.Preference preference = (androidx.preference.Preference) obj8;
        tbe tbeVar = (tbe) obj7;
        aimwVarL5.I("change listener for \"%s\": option changed successfully %s", preference.r, tbeVar.name());
        com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompat = (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj8;
        tidepodsCallerActionPreferenceCompat.l(tbeVar);
        if (obj7 == tbe.c) {
            android.content.Intent intent = new android.content.Intent("com.android.dialer.revelio.ACTION_REVELIO_ENABLED_BY_USER");
            android.content.Context context = preference.j;
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(tidepodsCallerActionPreferenceCompat.h);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((tap) optionalOfNullable.get()).d);
        }
        if (true == optionalOfNullable.isPresent()) {
            ((android.app.Dialog) optionalOfNullable.get()).dismiss();
        }
    }

    public /* synthetic */ oom(defpackage.joz jozVar, defpackage.jor jorVar, int i) {
        this.$cid = i;
        this.b = jozVar;
        this.a = jorVar;
    }
}
