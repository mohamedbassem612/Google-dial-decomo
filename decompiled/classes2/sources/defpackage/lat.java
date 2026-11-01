package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class lat implements agtk {
    final /* synthetic */ defpackage.lay a;

    public lat(defpackage.lay layVar) {
        j$.util.Objects.requireNonNull(layVar);
        this.a = layVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.lay.a.c(), "failed to update AlwaysRecordSelectedNumbers setting", "com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer$3", "onFailure", (char) 182, "SelectedContactNumbersFragmentPeer.java", th, zct.b);
        this.a.a().setEnabled(true);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a.a().setEnabled(false);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer$3", "onSuccess", 168, "SelectedContactNumbersFragmentPeer.java").v("success");
        defpackage.lay layVar = this.a;
        layVar.a().setEnabled(true);
        layVar.f.o(((java.lang.Boolean) obj).booleanValue() ? rmx.fJ : rmx.fK);
    }
}
