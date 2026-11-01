package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajae extends ajad {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(ajai.class, java.lang.Thread.class, "thread");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(ajai.class, ajai.class, "next");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(ajaj.class, ajai.class, "waitersField");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(ajaj.class, aizz.class, "listenersField");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(ajaj.class, java.lang.Object.class, "valueField");

    public final aizz a(ajaj ajajVar, aizz aizzVar) {
        return (aizz) d.getAndSet(ajajVar, aizzVar);
    }

    public final ajai b(ajaj ajajVar, ajai ajaiVar) {
        return (ajai) c.getAndSet(ajajVar, ajaiVar);
    }

    public final void c(ajai ajaiVar, ajai ajaiVar2) {
        b.lazySet(ajaiVar, ajaiVar2);
    }

    public final void d(ajai ajaiVar, java.lang.Thread thread) {
        a.lazySet(ajaiVar, thread);
    }

    public final boolean e(ajaj ajajVar, aizz aizzVar, aizz aizzVar2) {
        return anty.ag(d, ajajVar, aizzVar, aizzVar2);
    }

    public final boolean f(ajaj ajajVar, java.lang.Object obj, java.lang.Object obj2) {
        return anty.ag(e, ajajVar, obj, obj2);
    }

    public final boolean g(ajaj ajajVar, ajai ajaiVar, ajai ajaiVar2) {
        return anty.ag(c, ajajVar, ajaiVar, ajaiVar2);
    }
}
