package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aitv implements java.lang.Runnable {
    final int a;
    java.lang.Thread b;
    volatile java.lang.Thread c;
    defpackage.aitu d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ defpackage.aitw h;
    volatile int i;

    public aitv(defpackage.aitw aitwVar, int i) {
        j$.util.Objects.requireNonNull(aitwVar);
        this.h = aitwVar;
        this.i = 2;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(defpackage.aitu aituVar) {
        int i = this.e;
        if (i < 5) {
            aituVar.a = this.d;
            aituVar.b = this.a;
            this.d = aituVar;
            this.e = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zInterrupted;
        int i;
        int i2;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        this.b = threadCurrentThread;
        this.c = threadCurrentThread;
        defpackage.aitw aitwVar = this.h;
        if (aitwVar.h.get()) {
            a();
            return;
        }
        loop0: while (true) {
            defpackage.aitu aituVar = (defpackage.aitu) aitwVar.c.poll();
            if (aituVar != null) {
                aitwVar.a();
                java.lang.Runnable runnable = (java.lang.Runnable) aituVar.a;
                c(aituVar);
                try {
                    aitwVar.k.run();
                    try {
                        runnable.run();
                        try {
                            aitwVar.l.run();
                            d();
                            java.lang.Thread.interrupted();
                            if (aitwVar.g) {
                                break;
                            }
                        } catch (java.lang.Throwable th) {
                            d();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        try {
                            this.h.l.run();
                            throw th2;
                        } finally {
                            d();
                        }
                    }
                } catch (java.lang.Error | java.lang.RuntimeException e) {
                    if (this.h.h.get()) {
                        a();
                    } else {
                        b();
                    }
                    throw e;
                }
            } else {
                this.i = 2;
                defpackage.aitu aituVar2 = null;
                while (true) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = aitwVar.p;
                    defpackage.aitu aituVar3 = (defpackage.aitu) atomicReference.get();
                    java.lang.Object obj = aituVar3.a;
                    zInterrupted = false;
                    if (obj == defpackage.aitw.a) {
                        int i3 = aituVar3.b;
                        if (i3 == 0) {
                            i = 3;
                            break;
                        } else if (defpackage.anty.Q(atomicReference, aituVar3, aitwVar.n[i3 - 1])) {
                            if (aituVar2 != null) {
                                c(aituVar2);
                            }
                            i = 1;
                            break;
                        }
                    } else if (obj != defpackage.aitw.b || (i2 = aituVar3.b) <= 0) {
                        if (aituVar2 == null) {
                            aituVar2 = this.d;
                            if (aituVar2 == null) {
                                aituVar2 = new defpackage.aitu(aitwVar.m[0], this.a);
                            } else {
                                this.d = (defpackage.aitu) aituVar2.a;
                                this.e--;
                            }
                        }
                        aituVar2.a = aituVar3;
                        if (defpackage.anty.Q(atomicReference, aituVar3, aituVar2)) {
                            i = 2;
                            break;
                        }
                    } else if (defpackage.anty.Q(atomicReference, aituVar3, aitwVar.m[i2 - 1])) {
                        if (aituVar2 != null) {
                            c(aituVar2);
                        }
                        i = 1;
                        break;
                    }
                }
                int i4 = i - 1;
                if (i4 == 0) {
                    this.i = 1;
                } else {
                    if (i4 == 2) {
                        this.i = 3;
                        break;
                    }
                    while (true) {
                        java.util.concurrent.locks.LockSupport.park(aitwVar);
                        int i5 = this.i;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 == 0) {
                            if (!zInterrupted) {
                                break;
                            }
                            ((java.lang.Thread) j$.util.Objects.requireNonNull(this.b)).interrupt();
                            break;
                        } else if (i6 == 1) {
                            zInterrupted |= java.lang.Thread.interrupted();
                        } else if (i6 == 2) {
                            break loop0;
                        }
                    }
                }
            }
        }
        a();
    }
}
