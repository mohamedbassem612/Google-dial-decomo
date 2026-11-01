package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvx implements ajcb {
    final /* synthetic */ android.os.Messenger a;
    final /* synthetic */ int b;

    public abvx(defpackage.abvy abvyVar, android.os.Messenger messenger, int i) {
        this.a = messenger;
        this.b = i;
        j$.util.Objects.requireNonNull(abvyVar);
    }

    public final void a(java.lang.Throwable th) {
        com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.d(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.c(3, th.getMessage()), this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.d((android.os.Bundle) obj, this.a, this.b);
    }
}
