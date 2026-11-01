package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kzn implements agtk {
    final /* synthetic */ defpackage.kzs a;

    public kzn(defpackage.kzs kzsVar) {
        j$.util.Objects.requireNonNull(kzsVar);
        this.a = kzsVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.kzs.a.c(), "failed to fetch auto delete count", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$3", "onFailure", (char) 541, "CrosbySettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.Integer num2 = (java.lang.Integer) obj2;
        defpackage.kwx kwxVarB = defpackage.kwx.b(num.intValue());
        if (kwxVarB == null) {
            a.bt(defpackage.kzs.a.c().m(aioa.b), "cannot parse policy %d", num, "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$3", "onSuccess", (char) 523, "CrosbySettingsFragmentPeer.java", zct.b);
            return;
        }
        akzx akzxVarM = defpackage.kzd.a.m();
        akzxVarM.u();
        defpackage.kzd kzdVar = (defpackage.kzd) akzxVarM.b;
        kzdVar.c = kwxVarB.f;
        kzdVar.b |= 1;
        int iIntValue = num2.intValue();
        akzxVarM.u();
        defpackage.kzd kzdVar2 = (defpackage.kzd) akzxVarM.b;
        kzdVar2.b |= 2;
        kzdVar2.d = iIntValue;
        defpackage.kzd kzdVar3 = (defpackage.kzd) akzxVarM.p();
        defpackage.kzc kzcVar = new defpackage.kzc();
        amxr.g(kzcVar);
        ahgl.b(kzcVar, kzdVar3);
        kzcVar.r(this.a.e.I(), "deletion_confirmation_dialog");
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
