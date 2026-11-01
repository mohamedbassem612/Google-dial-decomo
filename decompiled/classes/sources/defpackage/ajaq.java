package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ajaq extends defpackage.ajar {
    private static final defpackage.ajcp c = new defpackage.ajcp(defpackage.ajaq.class);
    private defpackage.aifo d;
    private final boolean e;
    private final boolean f;

    public ajaq(defpackage.aifo aifoVar, boolean z, boolean z2) {
        super(aifoVar.size());
        aifoVar.getClass();
        this.d = aifoVar;
        this.e = z;
        this.f = z2;
    }

    private static boolean A(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void x(int i, defpackage.ajcq ajcqVar) {
        try {
            e(i, defpackage.a.h(ajcqVar));
        } catch (java.util.concurrent.ExecutionException e) {
            y(e.getCause());
        } catch (java.lang.Throwable th) {
            y(th);
        }
    }

    private final void y(java.lang.Throwable th) {
        th.getClass();
        if (this.e && !p(th)) {
            java.util.Set set = this.seenExceptionsField;
            if (set == null) {
                java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
                d(setNewSetFromMap);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.ajar.a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, setNewSetFromMap) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                set = (java.util.Set) j$.util.Objects.requireNonNull(this.seenExceptionsField);
            }
            if (A(set, th)) {
                z(th);
                return;
            }
        }
        if (th instanceof java.lang.Error) {
            z(th);
        }
    }

    private static void z(java.lang.Throwable th) {
        c.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof java.lang.Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    @Override // defpackage.ajac
    protected final void a() {
        defpackage.aifo aifoVar = this.d;
        w(1);
        if (isCancelled() && (aifoVar != null)) {
            boolean zR = r();
            defpackage.ailj it = aifoVar.iterator();
            while (it.hasNext()) {
                ((defpackage.ajcq) it.next()).cancel(zR);
            }
        }
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.aifo aifoVar = this.d;
        return aifoVar != null ? "futures=".concat(aifoVar.toString()) : super.b();
    }

    @Override // defpackage.ajar
    public final void d(java.util.Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        A(set, (java.lang.Throwable) j$.util.Objects.requireNonNull(j()));
    }

    public abstract void e(int i, java.lang.Object obj);

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final void f(defpackage.aifo aifoVar) {
        int iDecrementAndGet = defpackage.ajar.b.decrementAndGet(this);
        defpackage.ahvr.bZ((iDecrementAndGet ^ (-1)) >>> 31, "Less than 0 remaining futures");
        if (iDecrementAndGet == 0) {
            if (aifoVar != null) {
                defpackage.ailj it = aifoVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    defpackage.ajcq ajcqVar = (defpackage.ajcq) it.next();
                    if (!ajcqVar.isCancelled()) {
                        x(i, ajcqVar);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            g();
            w(2);
        }
    }

    public abstract void g();

    final void u() {
        j$.util.Objects.requireNonNull(this.d);
        if (this.d.isEmpty()) {
            g();
            return;
        }
        boolean z = this.e;
        defpackage.aifo aifoVar = this.d;
        if (!z) {
            final defpackage.aifo aifoVar2 = true != this.f ? null : aifoVar;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ajap
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(aifoVar2);
                }
            };
            defpackage.ailj it = aifoVar.iterator();
            while (it.hasNext()) {
                defpackage.ajcq ajcqVar = (defpackage.ajcq) it.next();
                if (ajcqVar.isDone()) {
                    f(aifoVar2);
                } else {
                    ajcqVar.c(runnable, defpackage.ajbm.INSTANCE);
                }
            }
            return;
        }
        defpackage.ailj it2 = aifoVar.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final defpackage.ajcq ajcqVar2 = (defpackage.ajcq) it2.next();
            int i2 = i + 1;
            if (ajcqVar2.isDone()) {
                v(i, ajcqVar2);
            } else {
                ajcqVar2.c(new java.lang.Runnable() { // from class: ajao
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.v(i, ajcqVar2);
                    }
                }, defpackage.ajbm.INSTANCE);
            }
            i = i2;
        }
    }

    public final void v(int i, defpackage.ajcq ajcqVar) {
        try {
            if (ajcqVar.isCancelled()) {
                this.d = null;
                cancel(false);
            } else {
                x(i, ajcqVar);
            }
        } finally {
            f(null);
        }
    }

    public void w(int i) {
        this.d = null;
    }
}
