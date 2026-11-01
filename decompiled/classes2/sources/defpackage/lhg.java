package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lhg implements agye {
    final /* synthetic */ defpackage.lhh a;
    private final androidx.preference.Preference b;

    public lhg(defpackage.lhh lhhVar, androidx.preference.Preference preference) {
        j$.util.Objects.requireNonNull(lhhVar);
        this.a = lhhVar;
        this.b = preference;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.lhh.a.c(), "failed to preparing call screen settings", "com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer$OnSettingsModelUpdatedSubscriptionCallbacks", "onError", 'p', "CallScreenSettingsFragmentPeer.java", th, zct.b);
        akzx akzxVarM = defpackage.liq.a.m();
        akzxVarM.u();
        ((defpackage.liq) akzxVarM.b).c = a.Q(5);
        akzxVarM.u();
        ((defpackage.liq) akzxVarM.b).d = a.Q(4);
        defpackage.lhh lhhVar = this.a;
        java.lang.String string = lhhVar.b.getString(2132018787);
        akzxVarM.u();
        defpackage.liq liqVar = (defpackage.liq) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        liqVar.f = string;
        lhhVar.a((defpackage.liq) akzxVarM.p());
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.lim limVar = (defpackage.lim) obj;
        if (limVar.c) {
            this.b.R(true);
        } else {
            defpackage.lhh.a.b().l("com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer$OnSettingsModelUpdatedSubscriptionCallbacks", "onNewData", 87, "CallScreenSettingsFragmentPeer.java").v("no voice or only one voice, don't show Voice preference");
            this.b.R(false);
        }
        defpackage.liq liqVar = limVar.d;
        if (liqVar == null) {
            liqVar = defpackage.liq.a;
        }
        defpackage.liq liqVar2 = defpackage.liq.a;
        if (!liqVar.equals(liqVar2)) {
            defpackage.lhh lhhVar = this.a;
            defpackage.liq liqVar3 = limVar.d;
            if (liqVar3 == null) {
                liqVar3 = liqVar2;
            }
            lhhVar.a(liqVar3);
        }
        if (limVar.e) {
            defpackage.lhh lhhVar2 = this.a;
            defpackage.liq liqVar4 = limVar.d;
            if (liqVar4 != null) {
                liqVar2 = liqVar4;
            }
            lhhVar2.b(liqVar2.b);
            lhhVar2.d.a();
            return;
        }
        if (limVar.f) {
            defpackage.lhh lhhVar3 = this.a;
            defpackage.lhv lhvVar = new defpackage.lhv();
            amxr.g(lhvVar);
            lhvVar.r(lhhVar3.c.I(), "voice_model_not_ready_dialog_fragment");
            lhhVar3.d.a();
        }
    }

    public final void c() {
        akzx akzxVarM = defpackage.liq.a.m();
        akzxVarM.u();
        ((defpackage.liq) akzxVarM.b).c = a.Q(4);
        akzxVarM.u();
        ((defpackage.liq) akzxVarM.b).d = a.Q(5);
        defpackage.lhh lhhVar = this.a;
        java.lang.String string = lhhVar.b.getString(2132018789);
        akzxVarM.u();
        defpackage.liq liqVar = (defpackage.liq) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        liqVar.f = string;
        lhhVar.a((defpackage.liq) akzxVarM.p());
    }
}
