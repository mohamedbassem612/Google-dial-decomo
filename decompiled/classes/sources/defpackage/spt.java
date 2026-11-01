package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class spt extends defpackage.agwz {
    final /* synthetic */ defpackage.aoin a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spt(defpackage.spu spuVar, defpackage.ahpz ahpzVar, java.util.concurrent.Executor executor, defpackage.aoin aoinVar) {
        super(ahpzVar, "SystemBlockedNumberGlobalContentObserver", executor);
        this.a = aoinVar;
        j$.util.Objects.requireNonNull(spuVar);
    }

    @Override // defpackage.agwz
    public final void a(boolean z, android.net.Uri uri) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.spu.a.b()).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberGlobalContentObserver$1", "traceWrappedOnChange", 47, "SystemBlockedNumberGlobalContentObserver.java")).K("change detected, selfChange: %b, URI: %s", z, uri);
        ((defpackage.kjr) this.a.a()).b();
    }
}
