package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dsc implements defpackage.ajcq {
    static final defpackage.drt b;
    public static final /* synthetic */ int c = 0;
    private static final java.lang.Object e;
    volatile defpackage.drx listeners;
    public volatile java.lang.Object value;
    volatile defpackage.dsb waiters;
    static final boolean a = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final java.util.logging.Logger d = java.util.logging.Logger.getLogger(defpackage.dsc.class.getName());

    static {
        defpackage.dry dsaVar;
        try {
            dsaVar = new defpackage.dry(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsb.class, java.lang.Thread.class, "thread"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsb.class, defpackage.dsb.class, "next"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsc.class, defpackage.dsb.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsc.class, defpackage.drx.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dsc.class, java.lang.Object.class, "value"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            dsaVar = new dsa();
        }
        b = dsaVar;
        if (th != null) {
            d.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new java.lang.Object();
    }

    protected dsc() {
    }

    static java.lang.Object a(defpackage.ajcq ajcqVar) {
        java.lang.Object drwVar;
        if (ajcqVar instanceof defpackage.dsc) {
            java.lang.Object obj = ((defpackage.dsc) ajcqVar).value;
            if (!(obj instanceof defpackage.dru)) {
                return obj;
            }
            defpackage.dru druVar = (defpackage.dru) obj;
            if (!druVar.c) {
                return obj;
            }
            java.lang.Throwable th = druVar.d;
            if (th == null) {
                return defpackage.dru.b;
            }
            drwVar = new defpackage.dru(false, th);
        } else {
            boolean zIsCancelled = ajcqVar.isCancelled();
            if ((!a) && zIsCancelled) {
                return defpackage.dru.b;
            }
            try {
                java.lang.Object objH = defpackage.a.h(ajcqVar);
                return objH == null ? e : objH;
            } catch (java.util.concurrent.CancellationException e2) {
                if (zIsCancelled) {
                    return new defpackage.dru(false, e2);
                }
                drwVar = new defpackage.drw(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajcqVar))), e2));
            } catch (java.util.concurrent.ExecutionException e3) {
                drwVar = new defpackage.drw(e3.getCause());
            } catch (java.lang.Throwable th2) {
                drwVar = new defpackage.drw(th2);
            }
        }
        return drwVar;
    }

    static void e(defpackage.dsc dscVar) {
        defpackage.drx drxVar;
        defpackage.drx drxVar2;
        defpackage.drx drxVar3 = null;
        while (true) {
            defpackage.dsb dsbVar = dscVar.waiters;
            if (b.e(dscVar, dsbVar, defpackage.dsb.a)) {
                while (dsbVar != null) {
                    java.lang.Thread thread = dsbVar.thread;
                    if (thread != null) {
                        dsbVar.thread = null;
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                    dsbVar = dsbVar.next;
                }
                dscVar.d();
                do {
                    drxVar = dscVar.listeners;
                } while (!b.c(dscVar, drxVar, defpackage.drx.a));
                while (true) {
                    drxVar2 = drxVar3;
                    drxVar3 = drxVar;
                    if (drxVar3 == null) {
                        break;
                    }
                    drxVar = drxVar3.next;
                    drxVar3.next = drxVar2;
                }
                while (drxVar2 != null) {
                    java.lang.Runnable runnable = drxVar2.b;
                    defpackage.drx drxVar4 = drxVar2.next;
                    if (runnable instanceof defpackage.drz) {
                        defpackage.drz drzVar = (defpackage.drz) runnable;
                        dscVar = drzVar.a;
                        if (dscVar.value == drzVar) {
                            if (b.d(dscVar, drzVar, a(drzVar.b))) {
                                drxVar3 = drxVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        k(runnable, drxVar2.c);
                    }
                    drxVar2 = drxVar4;
                }
                return;
            }
        }
    }

    static void h(java.lang.Object obj) {
        obj.getClass();
    }

    private final java.lang.String i(java.lang.Object obj) {
        return obj == this ? "this future" : java.lang.String.valueOf(obj);
    }

    private final void j(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objH = defpackage.a.h(this);
            sb.append("SUCCESS, result=[");
            sb.append(i(objH));
            sb.append(']');
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(']');
        }
    }

    private static void k(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e2) {
            d.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e2);
        }
    }

    private final void l(defpackage.dsb dsbVar) {
        dsbVar.thread = null;
        while (true) {
            defpackage.dsb dsbVar2 = this.waiters;
            if (dsbVar2 != defpackage.dsb.a) {
                defpackage.dsb dsbVar3 = null;
                while (dsbVar2 != null) {
                    defpackage.dsb dsbVar4 = dsbVar2.next;
                    if (dsbVar2.thread != null) {
                        dsbVar3 = dsbVar2;
                    } else if (dsbVar3 != null) {
                        dsbVar3.next = dsbVar4;
                        if (dsbVar3.thread == null) {
                        }
                    } else if (b.e(this, dsbVar2, dsbVar4)) {
                    }
                    dsbVar2 = dsbVar4;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object m(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof defpackage.dru) {
            java.lang.Throwable th = ((defpackage.dru) obj).d;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof defpackage.drw) {
            throw new java.util.concurrent.ExecutionException(((defpackage.drw) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String b() {
        java.lang.Object obj = this.value;
        if (obj instanceof defpackage.drz) {
            return "setFuture=[" + i(((defpackage.drz) obj).b) + ']';
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        runnable.getClass();
        executor.getClass();
        defpackage.drx drxVar = this.listeners;
        if (drxVar != defpackage.drx.a) {
            defpackage.drx drxVar2 = new defpackage.drx(runnable, executor);
            do {
                drxVar2.next = drxVar;
                if (b.c(this, drxVar, drxVar2)) {
                    return;
                } else {
                    drxVar = this.listeners;
                }
            } while (drxVar != defpackage.drx.a);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        defpackage.dru druVar;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof defpackage.drz)) {
            return false;
        }
        if (a) {
            druVar = new defpackage.dru(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            druVar = z ? defpackage.dru.a : defpackage.dru.b;
        }
        boolean z2 = false;
        while (true) {
            if (b.d(this, obj, druVar)) {
                e(this);
                if (!(obj instanceof defpackage.drz)) {
                    break;
                }
                defpackage.ajcq ajcqVar = ((defpackage.drz) obj).b;
                if (!(ajcqVar instanceof defpackage.dsc)) {
                    ajcqVar.cancel(z);
                    break;
                }
                this = (defpackage.dsc) ajcqVar;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof defpackage.drz)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof defpackage.drz)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final boolean f(java.lang.Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public final boolean g(java.lang.Throwable th) {
        h(th);
        if (!b.d(this, null, new defpackage.drw(th))) {
            return false;
        }
        e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof defpackage.drz))) {
            return m(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            defpackage.dsb dsbVar = this.waiters;
            if (dsbVar != defpackage.dsb.a) {
                defpackage.dsb dsbVar2 = new defpackage.dsb();
                while (true) {
                    dsbVar2.a(dsbVar);
                    if (b.e(this, dsbVar, dsbVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                l(dsbVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof defpackage.drz))) {
                                return m(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        l(dsbVar2);
                        break;
                    }
                    dsbVar = this.waiters;
                    if (dsbVar == defpackage.dsb.a) {
                    }
                }
            }
            return m(this.value);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof defpackage.drz))) {
                return m(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String strConcat = "Waited " + j + ' ' + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                java.lang.String strConcat3 = strConcat2 + jConvert + ' ' + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(defpackage.a.br(string, strConcat, " for "));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof defpackage.dru;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.value;
        return (obj != null) & (!(obj instanceof defpackage.drz));
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            j(sb);
        } else {
            try {
                strConcat = b();
            } catch (java.lang.RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e2.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(']');
            } else if (isDone()) {
                j(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    protected void d() {
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof defpackage.drz))) {
                return m(obj2);
            }
            defpackage.dsb dsbVar = this.waiters;
            if (dsbVar != defpackage.dsb.a) {
                defpackage.dsb dsbVar2 = new defpackage.dsb();
                do {
                    dsbVar2.a(dsbVar);
                    if (b.e(this, dsbVar, dsbVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                l(dsbVar2);
                                throw new java.lang.InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof defpackage.drz))));
                        return m(obj);
                    }
                    dsbVar = this.waiters;
                } while (dsbVar != defpackage.dsb.a);
            }
            return m(this.value);
        }
        throw new java.lang.InterruptedException();
    }
}
