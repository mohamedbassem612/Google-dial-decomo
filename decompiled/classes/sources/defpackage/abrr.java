package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abrr implements java.util.concurrent.ThreadFactory {
    private final int c;
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    private aliq d = null;

    public abrr(int i) {
        this.c = i;
    }

    public final void a(aliq aliqVar) {
        java.lang.Object obj = aliqVar.b;
        if (obj != null) {
            ((aliq) obj).a = aliqVar.a;
        } else if (this.d == aliqVar) {
            this.d = (aliq) aliqVar.a;
        }
        java.lang.Object obj2 = aliqVar.a;
        if (obj2 != null) {
            ((aliq) obj2).b = obj;
        }
        aliqVar.b = null;
        aliqVar.a = null;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        defpackage.abrp abrpVar = new defpackage.abrp(runnable);
        aliq aliqVar = new aliq(abrpVar);
        abrpVar.a = new defpackage.gsb(this, aliqVar, abrpVar, 7, (char[]) null);
        abrpVar.b = new aawj(this, aliqVar, 6, (byte[]) null);
        synchronized (this.a) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.b;
            if (atomicInteger.incrementAndGet() >= 10) {
                java.lang.Object obj = this.d;
                while (obj != null) {
                    java.lang.Object obj2 = ((aliq) obj).a;
                    java.lang.Object obj3 = ((aliq) obj).c;
                    if ((obj3 instanceof defpackage.abrp ? (defpackage.abrp) obj3 : (defpackage.abrp) ((java.lang.ref.WeakReference) obj3).get()) == null) {
                        a((aliq) obj);
                    }
                    obj = obj2;
                }
                atomicInteger.set(0);
            }
            aliq aliqVar2 = this.d;
            if (aliqVar2 != null) {
                aliqVar2.b = aliqVar;
                aliqVar.a = aliqVar2;
            }
            this.d = aliqVar;
            int i = this.c;
            defpackage.abry abryVar = abrpVar.c;
            if (!abryVar.c) {
                throw new java.lang.IllegalStateException("Cannot override priority of non-boostable thread");
            }
            while (true) {
                java.util.concurrent.atomic.AtomicLong atomicLong = abryVar.f;
                long j = atomicLong.get();
                long jE = defpackage.abrx.e(j, false, false, false, i, 0, 0L, 119);
                if (defpackage.abrx.c(j)) {
                    if (atomicLong.compareAndSet(j, jE)) {
                        break;
                    }
                } else if (defpackage.abrx.f(defpackage.abrx.d(j), defpackage.abrx.a(j, 2), defpackage.abrx.a(j, 1), defpackage.abrx.a(j, 0)) == defpackage.abrx.f(defpackage.abrx.d(jE), defpackage.abrx.a(jE, 2), defpackage.abrx.a(jE, 1), defpackage.abrx.a(jE, 0))) {
                    if (atomicLong.compareAndSet(j, jE)) {
                        break;
                    }
                } else if (atomicLong.compareAndSet(j, defpackage.abrx.e(jE, false, true, false, 0, 0, 0L, 125))) {
                    abryVar.a(defpackage.abrx.f(defpackage.abrx.d(j), defpackage.abrx.a(j, 2), defpackage.abrx.a(j, 1), defpackage.abrx.a(j, 0)));
                    break;
                }
            }
        }
        return abrpVar;
    }
}
