package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kzs {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer");
    public static final aify b = aify.s(defpackage.kwx.NEVER, defpackage.kwx.AFTER_7_DAYS, defpackage.kwx.AFTER_14_DAYS, defpackage.kwx.AFTER_30_DAYS);
    public final gou A;
    public final aogc B;
    public final ipc C;
    public final az c;
    public final lbi d;
    public final defpackage.kzk e;
    public final kvy f;
    public final defpackage.kvb g;
    public final agtj h;
    public final rlv i;
    public final ahso j;
    public androidx.preference.SwitchPreference k;
    public androidx.preference.Preference l;
    public androidx.preference.ListPreference m;
    public androidx.preference.Preference n;
    public com.android.dialer.widget.TextViewPreferenceCompat o;
    public androidx.preference.PreferenceCategory p;
    public int q;
    public long r;
    public final agtk s = new defpackage.kzl(this);
    public final agtk t = new defpackage.kzm(this);
    public final agtk u = new defpackage.kzn(this);
    public final agtk v = new defpackage.kzo(this);
    public final agtk w = new defpackage.kzp(this);
    public final agye x = new defpackage.kzq(this);
    public final agtk y = new defpackage.kzr(this);
    public final ajwr z;

    public kzs(az azVar, lbi lbiVar, defpackage.kzk kzkVar, kvy kvyVar, defpackage.kvb kvbVar, aogc aogcVar, agtj agtjVar, ajwr ajwrVar, rlv rlvVar, ahso ahsoVar, gou gouVar, ipc ipcVar) {
        this.c = azVar;
        this.d = lbiVar;
        this.e = kzkVar;
        this.f = kvyVar;
        this.g = kvbVar;
        this.B = aogcVar;
        this.h = agtjVar;
        this.z = ajwrVar;
        this.i = rlvVar;
        this.j = ahsoVar;
        this.A = gouVar;
        this.C = ipcVar;
    }

    public static java.lang.String b(defpackage.kwx kwxVar) {
        if (kwxVar == defpackage.kwx.UNSPECIFIED) {
            kwxVar = defpackage.kwx.NEVER;
        }
        return java.lang.String.valueOf(kwxVar.f);
    }

    public final java.lang.String a(defpackage.kwx kwxVar) {
        int iOrdinal = kwxVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return this.e.Y(2132017483);
        }
        if (iOrdinal == 2) {
            return this.e.Y(2132017482);
        }
        if (iOrdinal == 3) {
            return this.e.Y(2132017480);
        }
        if (iOrdinal == 4) {
            return this.e.Y(2132017481);
        }
        throw new java.lang.AssertionError("exhaustive switch");
    }

    public final void c(boolean z) {
        defpackage.kzk kzkVar = this.e;
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompatEe = kzkVar.ee(kzkVar.Y(2132018873));
        akwb akwbVar = new akwb(this.c, false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (!z) {
            footerPreferenceCompatEe.R(false);
            return;
        }
        spannableStringBuilder.append((java.lang.CharSequence) akwbVar.d(kzkVar.U(2132018875), kzkVar.Y(2132018874), kzkVar.Y(2132018876))).append((java.lang.CharSequence) "\n\n");
        footerPreferenceCompatEe.Q(spannableStringBuilder);
    }

    public final void d() {
        defpackage.kzk kzkVar = this.e;
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompatEe = kzkVar.ee(kzkVar.Y(2132018883));
        akwb akwbVar = new akwb(this.c, false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(kzkVar.U(2132017633)).append((java.lang.CharSequence) "\n\n");
        spannableStringBuilder.append((java.lang.CharSequence) akwbVar.d(kzkVar.U(2132018881), kzkVar.Y(2132018880), kzkVar.Y(2132018882))).append((java.lang.CharSequence) "\n\n");
        spannableStringBuilder.append((java.lang.CharSequence) akwbVar.d(kzkVar.U(2132018878), kzkVar.Y(2132018877), kzkVar.Y(2132018879)));
        footerPreferenceCompatEe.Q(spannableStringBuilder);
    }

    public final void e(boolean z) {
        this.h.j(zoe.N(this.f.d(z)), new zoe(java.lang.Boolean.valueOf(z)), this.s);
    }
}
