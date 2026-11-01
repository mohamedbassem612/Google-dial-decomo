package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mmo implements defpackage.geh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ mmo(defpackage.kzs kzsVar, aify aifyVar, int i) {
        this.$cid = i;
        this.b = kzsVar;
        this.a = aifyVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.geh
    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) throws aois {
        if (this.$cid != 0) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = this.b;
            if (!zBooleanValue) {
                defpackage.kzs kzsVar = (defpackage.kzs) obj2;
                kzsVar.h.i(zoe.N(kzsVar.f.c((defpackage.kun) ((aify) this.a).get(0))), kzsVar.w);
                kzsVar.i.o(rmx.nc);
                return false;
            }
            hgb.c(defpackage.kzs.a.b(), "Show use beep sound terms dialog", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "showUseBeepSoundTermsDialog", (char) 445, "CrosbySettingsFragmentPeer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            defpackage.lbc lbcVar = new defpackage.lbc();
            amxr.g(lbcVar);
            lbcVar.r(((defpackage.kzs) obj2).e.I(), "use_beep_sound_terms_dialog");
            return false;
        }
        aooh.f(obj, "newValue");
        urf urfVarA = urf.a(java.lang.Integer.parseInt(obj.toString()));
        defpackage.mmq mmqVar = (defpackage.mmq) this.a;
        urg urgVar = mmqVar.e;
        if (urfVarA != urgVar.h()) {
            java.lang.Object obj3 = this.b;
            defpackage.mmq.a.b().l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsFragmentPeer", "onThemePreferenceChange", 177, "DisplayOptionsSettingsFragmentPeer.kt").y("new theme: %s", urfVarA);
            urgVar.j(urfVarA);
            androidx.preference.Preference preference2 = (androidx.preference.Preference) obj3;
            preference2.p(mmqVar.c(urfVarA));
            int iOrdinal = urfVarA.ordinal();
            if (iOrdinal == 0) {
                mmqVar.f.n(rmw.jo);
                mmqVar.l.bm(rmu.c);
            } else if (iOrdinal == 1) {
                mmqVar.f.n(rmw.jp);
                mmqVar.l.bm(rmu.e);
            } else {
                if (iOrdinal != 2) {
                    throw new aois();
                }
                mmqVar.f.n(rmw.jq);
                mmqVar.l.bm(rmu.h);
            }
            android.content.Intent intentPutExtra = new android.content.Intent().setPackage("com.google.android.contacts").setAction("com.google.android.comms.action.THEME_CHANGE").putExtra("DARK_MODE_ENABLED", urfVarA == urf.b);
            int i = urfVarA.d;
            android.content.Intent intentAddFlags = intentPutExtra.putExtra("THEME", i).addFlags(32);
            aooh.e(intentAddFlags, "addFlags(...)");
            mmqVar.c.sendBroadcast(intentAddFlags);
            preference2.w = java.lang.String.valueOf(i);
            preference2.p(mmqVar.c(urfVarA));
        }
        return true;
    }

    public /* synthetic */ mmo(defpackage.mmq mmqVar, androidx.preference.ListPreference listPreference, int i) {
        this.$cid = i;
        this.a = mmqVar;
        this.b = listPreference;
    }
}
