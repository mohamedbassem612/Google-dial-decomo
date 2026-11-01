package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kzq implements agye {
    final /* synthetic */ defpackage.kzs a;

    public kzq(defpackage.kzs kzsVar) {
        j$.util.Objects.requireNonNull(kzsVar);
        this.a = kzsVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.kzs.a.c(), "failed to retrieve CallRecordingSettingsDataModel", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$6", "onError", (char) 700, "CrosbySettingsFragmentPeer.java", th, zct.b);
        this.a.k.I(false);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str;
        defpackage.kzh kzhVar = (defpackage.kzh) obj;
        defpackage.kzs kzsVar = this.a;
        kzsVar.k.k(kzhVar.c);
        kzsVar.k.I(true);
        androidx.preference.Preference preference = kzsVar.n;
        int i = kzhVar.f;
        boolean z = kzhVar.e;
        defpackage.kzk kzkVar = kzsVar.e;
        android.content.res.Resources resources = kzkVar.z().getResources();
        java.lang.String string = resources.getString(true != z ? 2132020069 : 2132020070);
        preference.p(i == 0 ? resources.getString(2132020071, string) : resources.getQuantityString(2131886109, i, string, java.lang.Integer.valueOf(i)));
        androidx.preference.ListPreference listPreference = kzsVar.m;
        defpackage.kwx kwxVarB = defpackage.kwx.b(kzhVar.d);
        if (kwxVarB == null) {
            kwxVarB = defpackage.kwx.UNSPECIFIED;
        }
        listPreference.p(kzsVar.a(kwxVarB));
        androidx.preference.ListPreference listPreference2 = kzsVar.m;
        defpackage.kwx kwxVarB2 = defpackage.kwx.b(kzhVar.d);
        if (kwxVarB2 == null) {
            kwxVarB2 = defpackage.kwx.UNSPECIFIED;
        }
        listPreference2.q(defpackage.kzs.b(kwxVarB2));
        int i2 = kzhVar.h;
        kzsVar.q = i2;
        kzsVar.r = kzhVar.i;
        kzsVar.l.I(i2 > 0);
        androidx.preference.Preference preference2 = kzsVar.l;
        int i3 = kzsVar.q;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        long j = kzsVar.r;
        numValueOf.getClass();
        if (i3 == 0) {
            str = "";
        } else {
            android.content.res.Resources resources2 = kzkVar.z().getResources();
            numValueOf.getClass();
            str = java.lang.String.format(java.util.Locale.US, "%s %s, %s", numValueOf, resources2.getQuantityString(2131886110, i3), apqv.a(j));
        }
        preference2.p(str);
        defpackage.lbb lbbVarB = defpackage.lbb.b(kzhVar.g);
        if (lbbVarB == null) {
            lbbVarB = defpackage.lbb.UNKNOWN;
        }
        defpackage.kzs.a.b().l("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "setUiMode", 344, "CrosbySettingsFragmentPeer.java").y("UiMode: %s", lbbVarB);
        int iOrdinal = lbbVarB.ordinal();
        if (iOrdinal == 1) {
            kzsVar.o.R(false);
            kzsVar.k.I(true);
            kzsVar.d();
            kzsVar.c(true);
        } else if (iOrdinal == 2) {
            kzsVar.k.I(false);
            kzsVar.d();
            kzsVar.c(true);
        } else if (iOrdinal == 3) {
            kzsVar.o.Q(kzkVar.Y(2132020086));
            kzsVar.o.R(true);
            kzsVar.k.I(false);
            kzsVar.d();
            kzsVar.c(true);
        } else if (iOrdinal == 4) {
            kzsVar.k.I(false);
            kzsVar.p.R(false);
            kzsVar.d();
            kzsVar.c(false);
        } else if (iOrdinal == 5) {
            kzsVar.o.Q(kzkVar.Y(2132020085));
            kzsVar.o.R(true);
            kzsVar.k.I(false);
            kzsVar.p.R(false);
            kzsVar.d();
            kzsVar.c(false);
        }
        androidx.preference.SwitchPreference switchPreference = (androidx.preference.SwitchPreference) kzkVar.ee(kzkVar.Y(2132020667));
        defpackage.kun kunVarB = defpackage.kun.b(kzhVar.j);
        if (kunVarB == null) {
            kunVarB = defpackage.kun.CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED;
        }
        switchPreference.k(kunVarB.equals(defpackage.kun.BEEP_SOUND));
    }

    public final void c() {
        this.a.k.I(false);
    }
}
