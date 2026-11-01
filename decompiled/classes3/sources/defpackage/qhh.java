package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qhh implements agtk {
    final /* synthetic */ defpackage.qhj a;

    public qhh(defpackage.qhj qhjVar) {
        j$.util.Objects.requireNonNull(qhjVar);
        this.a = qhjVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.qhj.a.c(), "Failed to send emergency message.", "com/android/dialer/incall/rtt/ui/RttChatFragmentPeer$EmergencyMessageSentCallback", "onFailure", (char) 1113, "RttChatFragmentPeer.java", th, zct.b);
        defpackage.qhj qhjVar = this.a;
        qhjVar.c().setEnabled(true);
        qhjVar.a().setEnabled(true);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.qhj qhjVar = this.a;
        qhjVar.c().setEnabled(true);
        qhjVar.a().setEnabled(true);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
