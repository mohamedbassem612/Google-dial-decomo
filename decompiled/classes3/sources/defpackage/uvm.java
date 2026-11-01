package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class uvm implements agtk {
    final /* synthetic */ defpackage.uvo a;

    public uvm(defpackage.uvo uvoVar) {
        j$.util.Objects.requireNonNull(uvoVar);
        this.a = uvoVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.uvo.a.c(), "feedback option preparation failed", "com/android/dialer/transcriptaudiofeedback/impl/FeedbackMainFragmentPeer$1", "onFailure", (char) 343, "FeedbackMainFragmentPeer.java", th, zct.b);
        defpackage.uvo uvoVar = this.a;
        defpackage.agby.q(((aw) uvoVar.c).Q, uvoVar.b.getText(2132018702), 0).h();
        uvoVar.a(true);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.uvo.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackMainFragmentPeer$1", "onSuccess", 329, "FeedbackMainFragmentPeer.java").v("start feedback successfully");
        this.a.a(false);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
