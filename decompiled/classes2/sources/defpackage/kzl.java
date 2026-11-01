package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kzl implements agtk {
    final /* synthetic */ defpackage.kzs a;

    public kzl(defpackage.kzs kzsVar) {
        j$.util.Objects.requireNonNull(kzsVar);
        this.a = kzsVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.kzs.a.c(), "failed to update setting AlwaysRecordNonContact", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$1", "onFailure", (char) 241, "CrosbySettingsFragmentPeer.java", th, zct.b);
        this.a.k.I(true);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a.k.I(false);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        defpackage.kzs.a.b().l("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$1", "onSuccess", 227, "CrosbySettingsFragmentPeer.java").y("updated setting AlwaysRecordNonContact to %s", bool);
        defpackage.kzs kzsVar = this.a;
        kzsVar.k.I(true);
        kzsVar.i.o(bool.booleanValue() ? rmx.fC : rmx.fD);
    }
}
