package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class joz extends defpackage.jpa implements defpackage.geh {
    public static final aimz c = aimz.i("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat");
    public boolean ak = false;
    public rlv al;
    public defpackage.ifb am;
    public zjm an;
    public zjm ao;
    private androidx.preference.ListPreference ap;
    private defpackage.lpa aq;
    public defpackage.lpa d;
    public defpackage.lpa e;

    @Override // defpackage.geh
    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        defpackage.jor jorVar;
        ajcq ajcqVarP;
        java.lang.String str = (java.lang.String) obj;
        if (str.equals(Y(2132017624))) {
            this.al.o(rmx.ej);
            jorVar = defpackage.jor.ALWAYS;
        } else if (str.equals(Y(2132017625))) {
            this.al.o(rmx.el);
            jorVar = defpackage.jor.HEADSET;
        } else {
            if (!str.equals(Y(2132017626))) {
                throw new java.lang.EnumConstantNotPresentException(defpackage.jor.class, str);
            }
            this.al.o(rmx.ek);
            jorVar = defpackage.jor.NEVER;
        }
        defpackage.lpa lpaVar = this.aq;
        android.content.Context contextZ = z();
        defpackage.ifb ifbVar = this.am;
        int i = 1;
        if (((zzx) ifbVar.d).m()) {
            ajcqVarP = defpackage.ifb.b();
        } else {
            java.lang.Object obj2 = ifbVar.b;
            kaw kawVar = (kaw) obj2;
            ajcqVarP = kawVar.p(((aogc) ifbVar.a).bl(new jsd(jorVar, 1)));
        }
        lpaVar.b(contextZ, ajcqVarP, new defpackage.oom(this, jorVar, i), new defpackage.jox(1));
        return true;
    }

    @Override // defpackage.ger
    public final void aU(java.lang.String str) {
        this.aq = defpackage.lpa.a(I(), "CallAnnouncerSettingsFragment.callAnnouncerEnabledUiListener");
        this.d = defpackage.lpa.a(I(), "CallAnnouncerSettingsFragment.callAnnouncerTtsPrewarmSchedulingUiListener");
        this.e = defpackage.lpa.a(I(), "CallAnnouncerSettingsFragment.callAnnouncerPreferenceConfigUiListener");
        c(2132213767);
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) ee(dX().getString(2132017622));
        this.ap = listPreference;
        listPreference.q = -1;
        listPreference.n = this;
        android.os.Bundle bundle = ((aw) this).m;
        if (bundle != null && !bundle.isEmpty()) {
            rvq rvqVarP = akmr.p(bundle, "extra_settings_launch_config", rvq.a, akzq.a());
            rvo rvoVar = rvqVarP.c == 2 ? (rvo) rvqVarP.d : rvo.a;
            this.ak = (rvoVar.b == 6 ? (rvh) rvoVar.c : rvh.a).b;
            c.b().l("com/android/dialer/callannouncer/impl/settings/CallAnnouncerSettingsFragmentCompat", "onCreatePreferences", 97, "CallAnnouncerSettingsFragmentCompat.java").y("should log if settings got changed: %b", java.lang.Boolean.valueOf(this.ak));
        }
        j$.util.Optional optionalG = this.ao.g();
        defpackage.hrx hrxVar = new defpackage.hrx(this, 15);
        int i = 1;
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            java.lang.Object obj2 = hrxVar.a;
            izg izgVar = (izg) obj;
            defpackage.joz jozVar = (defpackage.joz) obj2;
            jozVar.aW(izgVar.h());
            jozVar.e.b(((aw) obj2).z(), izgVar.i(), new defpackage.kll(obj2, i), new defpackage.jox(3));
        }
    }

    public final void aW(defpackage.jnm jnmVar) {
        java.lang.String strY;
        this.ap.Q(jnmVar.e);
        boolean z = jnmVar.c;
        androidx.preference.ListPreference listPreference = this.ap;
        if (!z) {
            listPreference.p(jnmVar.d);
            this.ap.I(false);
            return;
        }
        java.lang.String str = jnmVar.f;
        if (str.equals(defpackage.jor.NEVER.name()) || str.equals(defpackage.jor.INVALID.name())) {
            strY = Y(2132017626);
        } else if (str.equals(defpackage.jor.ALWAYS.name())) {
            strY = Y(2132017624);
        } else {
            if (!str.equals(defpackage.jor.HEADSET.name())) {
                throw new java.lang.EnumConstantNotPresentException(defpackage.jor.class, str);
            }
            strY = Y(2132017625);
        }
        listPreference.q(strY);
    }

    public final void an() {
        super.an();
        G().i().j(dW().r);
    }

    @Override // defpackage.ger
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        super.ao(view, bundle);
        ft$.ExternalSyntheticApiModelOutline0.m(((aw) this).Q, dW().r);
    }
}
