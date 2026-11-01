package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class lau implements agtk {
    public lau(defpackage.lay layVar) {
        j$.util.Objects.requireNonNull(layVar);
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.lay.a.c(), "failed to fetch the picked number or update the list.", "com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer$4", "onFailure", (char) 205, "SelectedContactNumbersFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer$4", "onSuccess", 196, "SelectedContactNumbersFragmentPeer.java").v("completed the request to add the picked number");
    }
}
