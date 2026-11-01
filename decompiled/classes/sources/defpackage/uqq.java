package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class uqq extends defpackage.agwz {
    final /* synthetic */ defpackage.aoin a;
    final /* synthetic */ defpackage.ajct b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqq(defpackage.uqr uqrVar, defpackage.ahpz ahpzVar, java.util.concurrent.Executor executor, defpackage.aoin aoinVar, defpackage.ajct ajctVar) {
        super(ahpzVar, "SuggestContactsGlobalContentObserver", executor);
        this.a = aoinVar;
        this.b = ajctVar;
        j$.util.Objects.requireNonNull(uqrVar);
    }

    @Override // defpackage.agwz
    public final void a(boolean z, android.net.Uri uri) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqr.a.b()).l("com/android/dialer/suggestcontacts/impl/SuggestContactsGlobalContentObserver$1", "traceWrappedOnChange", 54, "SuggestContactsGlobalContentObserver.java")).K("change detected, selfChange: %b, URI: %s", z, uri);
        defpackage.aoin aoinVar = this.a;
        defpackage.ahvr.J(((uqp) aoinVar.a()).e(((uqp) aoinVar.a()).j(1)), new jya(this, 11), this.b);
    }
}
