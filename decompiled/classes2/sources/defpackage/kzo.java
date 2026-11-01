package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kzo implements agtk {
    final /* synthetic */ defpackage.kzs a;

    public kzo(defpackage.kzs kzsVar) {
        j$.util.Objects.requireNonNull(kzsVar);
        this.a = kzsVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.kzs.a.c(), "fail to set auto deletion policy", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer$4", "onFailure", (char) 568, "CrosbySettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a.m.I(false);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        this.a.m.I(true);
    }
}
