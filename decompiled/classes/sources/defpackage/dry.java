package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dry extends defpackage.drt {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e;

    public dry(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.drt
    public final void a(defpackage.dsb dsbVar, defpackage.dsb dsbVar2) {
        this.b.lazySet(dsbVar, dsbVar2);
    }

    @Override // defpackage.drt
    public final void b(defpackage.dsb dsbVar, java.lang.Thread thread) {
        this.a.lazySet(dsbVar, thread);
    }

    @Override // defpackage.drt
    public final boolean c(defpackage.dsc dscVar, defpackage.drx drxVar, defpackage.drx drxVar2) {
        return defpackage.anty.ag(this.d, dscVar, drxVar, drxVar2);
    }

    @Override // defpackage.drt
    public final boolean d(defpackage.dsc dscVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.anty.ag(this.e, dscVar, obj, obj2);
    }

    @Override // defpackage.drt
    public final boolean e(defpackage.dsc dscVar, defpackage.dsb dsbVar, defpackage.dsb dsbVar2) {
        return defpackage.anty.ag(this.c, dscVar, dsbVar, dsbVar2);
    }
}
