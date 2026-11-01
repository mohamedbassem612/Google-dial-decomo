package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class ubg implements agtk {
    public ubg(defpackage.ubh ubhVar) {
        j$.util.Objects.requireNonNull(ubhVar);
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return;
        }
        a.bq(defpackage.ubh.a.c(), "failed to update settings", "com/android/dialer/sonic/impl/settings/SonicSettingsFragmentPeer$2", "onFailure", 'C', "SonicSettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ubh.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsFragmentPeer$2", "onSuccess", 61, "SonicSettingsFragmentPeer.java").v("successfully updated settings");
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
