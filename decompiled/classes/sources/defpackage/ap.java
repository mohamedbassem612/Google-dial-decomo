package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ap extends defpackage.ok {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;

    public ap(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.ok
    public final void a() {
        throw null;
    }

    @Override // defpackage.ok
    public final void b(java.lang.Object obj) {
        defpackage.ok okVar = (defpackage.ok) this.a.get();
        if (okVar == null) {
            throw new java.lang.IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        okVar.b(obj);
    }
}
