package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class ria implements agye {
    final /* synthetic */ defpackage.ric a;

    public ria(defpackage.ric ricVar) {
        j$.util.Objects.requireNonNull(ricVar);
        this.a = ricVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.ric.a.c(), "failed loading whether the international call on wifi has disconnected", "com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer$1", "onError", 'H', "InternationalCallOnWifiDialogFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            defpackage.ric.a.b().l("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer$1", "onNewData", 60, "InternationalCallOnWifiDialogFragmentPeer.java").v("hasInternationalCallOnWifiDisconnected is true, dismissing fragment");
            this.a.c.f();
        }
    }

    public final /* synthetic */ void c() {
    }
}
