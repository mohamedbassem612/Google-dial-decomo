package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wqg implements agye {
    final /* synthetic */ defpackage.wqh a;
    private final androidx.preference.SwitchPreference b;
    private final j$.util.Optional c;
    private final j$.util.Optional d;

    public wqg(defpackage.wqh wqhVar, androidx.preference.SwitchPreference switchPreference, j$.util.Optional optional, j$.util.Optional optional2) {
        j$.util.Objects.requireNonNull(wqhVar);
        this.a = wqhVar;
        this.b = switchPreference;
        this.c = optional;
        this.d = optional2;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.wqh.a.d(), "failed to load XatuSettingsFragmentModel", "com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer$OnModelLoadedCallbacks", "onError", '~', "XatuSettingsFragmentPeer.java", th, zct.b);
        this.b.I(true);
        j$.util.Optional optional = this.c;
        if (true == optional.isPresent()) {
            ((androidx.preference.Preference) optional.get()).I(true);
        }
        j$.util.Optional optional2 = this.d;
        optional2.isPresent();
        ((androidx.preference.Preference) optional2.get()).I(true);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.wqc wqcVar = (defpackage.wqc) obj;
        defpackage.wqh.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer$OnModelLoadedCallbacks", "onNewData", 97, "XatuSettingsFragmentPeer.java").y("data=%s", wqcVar);
        boolean z = wqcVar.c;
        androidx.preference.SwitchPreference switchPreference = this.b;
        switchPreference.k(z);
        switchPreference.I(wqcVar.e);
        defpackage.wqh wqhVar = this.a;
        wqhVar.m.I(wqcVar.e);
        defpackage.wlm wlmVar = new defpackage.wlm(wqcVar, 2);
        j$.util.Optional optional = this.c;
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            defpackage.wqc wqcVar2 = (defpackage.wqc) wlmVar.a;
            ((androidx.preference.TwoStatePreference) obj2).k(wqcVar2.f);
            androidx.preference.Preference preference = (androidx.preference.Preference) obj2;
            preference.I(wqcVar2.e && wqcVar2.c);
            preference.q = -1;
        }
        j$.util.Optional optional2 = this.d;
        defpackage.wlm wlmVar2 = new defpackage.wlm(wqcVar, 3);
        optional2.isPresent();
        java.lang.Object obj3 = wlmVar2.a;
        java.lang.Object obj4 = optional2.get();
        defpackage.wqc wqcVar3 = (defpackage.wqc) obj3;
        ((androidx.preference.TwoStatePreference) obj4).k(wqcVar3.g);
        androidx.preference.Preference preference2 = (androidx.preference.Preference) obj4;
        preference2.I(wqcVar3.e && wqcVar3.c);
        preference2.q = -1;
        if ((wqcVar.b & 4) != 0) {
            defpackage.tyw tywVar = wqcVar.d;
            if (tywVar == null) {
                tywVar = defpackage.tyw.a;
            }
            defpackage.tyv tyvVarB = defpackage.tyv.b(tywVar.d);
            if (tyvVarB == null) {
                tyvVarB = defpackage.tyv.UNRECOGNIZED;
            }
            if (tyvVarB != defpackage.tyv.ALREADY_AVAILABLE || wqhVar.n.isPresent()) {
                wqhVar.n = j$.util.Optional.of(tywVar);
                defpackage.wqb wqbVar = wqhVar.g;
                defpackage.tyx tyxVarB = (defpackage.tyx) wqbVar.N().findViewById(2131428975);
                if (tyxVarB == null) {
                    tyxVarB = defpackage.tys.b(wqhVar.f, tywVar);
                    tyxVarB.setId(2131428975);
                    ((android.view.ViewGroup) wqbVar.N()).addView(tyxVarB, 0);
                } else {
                    tyxVarB.y().a(tywVar);
                }
                tyxVarB.setVisibility(0);
            }
        }
    }

    public final /* synthetic */ void c() {
    }
}
