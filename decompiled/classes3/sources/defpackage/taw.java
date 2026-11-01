package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class taw implements los {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ taw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                a.bq(defpackage.tax.a.c(), "loadShouldSaveAudioPreferenceData: unable to load current should save audio preference", "com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "loadShouldSaveAudioPreferenceData", (char) 330, "RevelioSettingsFragmentPeer.java", th, zct.b);
                android.content.Context context = ((defpackage.tax) this.a).g;
                android.widget.Toast.makeText(context, context.getString(2132020011), 1).show();
                break;
            case 1:
                a.bq(defpackage.tax.a.c(), "Unable to load current should save audio preference.", "com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "loadDeleteOldRecordingsPreferenceData", (char) 397, "RevelioSettingsFragmentPeer.java", th, zct.b);
                defpackage.tax taxVar = (defpackage.tax) this.a;
                java.lang.Object[] objArr = {taxVar.o.v()};
                android.content.Context context2 = taxVar.g;
                android.widget.Toast.makeText(context2, context2.getString(2132018237, objArr), 1).show();
                break;
            case 2:
                a.bq(defpackage.tax.a.c(), "saveAudioPreferenceChanged: value change failed", "com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "onSaveAudioPreferenceChanged", (char) 300, "RevelioSettingsFragmentPeer.java", th, zct.b);
                android.content.Context context3 = ((defpackage.tax) this.a).g;
                android.widget.Toast.makeText(context3, context3.getString(2132020012), 1).show();
                break;
            case 3:
                a.bq(defpackage.tax.a.c(), "Value change failed.", "com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "onDeleteOldRecordingsPreferenceChanged", (char) 367, "RevelioSettingsFragmentPeer.java", th, zct.b);
                defpackage.tax taxVar2 = (defpackage.tax) this.a;
                java.lang.Object[] objArr2 = {taxVar2.o.v()};
                android.content.Context context4 = taxVar2.g;
                android.widget.Toast.makeText(context4, context4.getString(2132018238, objArr2), 1).show();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj = this.a;
                ((com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj).o();
                androidx.preference.Preference preference = (androidx.preference.Preference) obj;
                com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.c().i(zct.b).k(th).l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "onPreferenceChanged", 253, "TidepodsCallerActionPreferenceCompat.java").y("change listener for \"%s\": option change failed", preference.r);
                android.content.Context context5 = preference.j;
                android.widget.Toast.makeText(context5.getApplicationContext(), context5.getString(2132017889, preference.r), 1).show();
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimw aimwVarL = com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.c().i(zct.b).k(th).l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "setupAndLoadInitialValue", 159, "TidepodsCallerActionPreferenceCompat.java");
                androidx.preference.Preference preference2 = (androidx.preference.Preference) this.a;
                aimwVarL.y("unable to load current option for \"%s\"", preference2.r);
                android.content.Context context6 = preference2.j;
                android.widget.Toast.makeText(context6.getApplicationContext(), context6.getString(2132017888, preference2.r), 1).show();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.tkd) this.a).d.d = tcp.e;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj2 = this.a;
                ((aw) obj2).G().runOnUiThread(new defpackage.sxq(obj2, 14));
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.tkd tkdVar = (defpackage.tkd) this.a;
                tkdVar.b.o(rmx.il);
                tkdVar.al.C(aike.a, 2);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                a.bq(com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity.n.c(), "caught failure", "com/android/dialer/voicemail/settings/RecordVoicemailGreetingActivity", "uploadGreeting", (char) 356, "RecordVoicemailGreetingActivity.java", th, zct.b);
                java.lang.Object obj3 = this.a;
                com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj3;
                recordVoicemailGreetingActivity.v.f(true);
                defpackage.afsn afsnVar = new defpackage.afsn((android.content.Context) obj3, 0);
                afsnVar.x(2132019836);
                afsnVar.r(2132019837);
                afsnVar.w(2132019838, new defpackage.ahpt(recordVoicemailGreetingActivity.u, 999, "Positive button clicked", new ktq(obj3, 17)));
                afsnVar.t(2132019831, new ktq(obj3, 18));
                cy cyVarCreate = afsnVar.create();
                cyVarCreate.setOnShowListener(new jlg(obj3, 13));
                cyVarCreate.show();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                a.bq(defpackage.xan.a.c(), "failed to check existing opt-in preference; auto-enable it anyway", "com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "autoOptIn", (char) 418, "AtlasSettingsFragmentPeer.java", th, zct.b);
                ((defpackage.xan) this.a).c(true);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                a.bq(defpackage.xan.a.c(), "unable to load model availability", "com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "refreshUi", (char) 446, "AtlasSettingsFragmentPeer.java", th, zct.b);
                defpackage.xan xanVar = (defpackage.xan) this.a;
                xanVar.k.R(true);
                xanVar.a();
                break;
            default:
                a.bq(defpackage.xan.a.c(), "unable to load opt-in preference", "com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "loadOptInPreference", (char) 358, "AtlasSettingsFragmentPeer.java", th, zct.b);
                defpackage.xal xalVar = new defpackage.xal();
                xalVar.b(false);
                xalVar.c(false);
                ((defpackage.xan) this.a).b(xalVar.a());
                break;
        }
    }
}
