package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class kkt extends defpackage.agwz {
    final /* synthetic */ defpackage.aoin a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkt(defpackage.kku kkuVar, defpackage.ahpz ahpzVar, java.util.concurrent.Executor executor, defpackage.aoin aoinVar) {
        super(ahpzVar, "SystemCallLogGlobalContentObserver", executor);
        this.a = aoinVar;
        j$.util.Objects.requireNonNull(kkuVar);
    }

    @Override // defpackage.agwz
    public final void a(boolean z, android.net.Uri uri) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.kku.a.b()).l("com/android/dialer/calllog/systemcalllogobserver/SystemCallLogGlobalContentObserver$1", "traceWrappedOnChange", 48, "SystemCallLogGlobalContentObserver.java")).K("change detected, selfChange: %b, URI: %s", z, uri);
        ((defpackage.kjr) this.a.a()).b();
    }
}
