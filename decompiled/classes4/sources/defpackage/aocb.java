package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocb extends defpackage.aoca {
    private final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a;

    public aocb(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.aoca
    public final boolean a(defpackage.aocd aocdVar) {
        return this.a.compareAndSet(aocdVar, 0, -1);
    }

    @Override // defpackage.aoca
    public final void b(defpackage.aocd aocdVar) {
        this.a.set(aocdVar, 0);
    }
}
