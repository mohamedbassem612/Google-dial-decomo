package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbc implements defpackage.ajcq {
    private final defpackage.aoub a;
    private final defpackage.ajdd b = new defpackage.ajdd();
    private boolean c;

    public apbc(defpackage.aoub aoubVar) {
        this.a = aoubVar;
    }

    private static final void d(java.lang.Object obj) throws java.lang.Throwable {
        if (obj instanceof defpackage.apbb) {
            throw new java.util.concurrent.CancellationException().initCause(((defpackage.apbb) obj).a);
        }
    }

    public final void a(java.lang.Object obj) {
        this.b.o(obj);
    }

    public final void b(java.lang.Throwable th) {
        boolean z = th instanceof java.util.concurrent.CancellationException;
        defpackage.ajdd ajddVar = this.b;
        if (z) {
            ajddVar.o(new defpackage.apbb((java.util.concurrent.CancellationException) th));
        } else if (ajddVar.p(th)) {
            this.c = true;
        }
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.s(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.Throwable {
        java.lang.Object objS = this.b.s();
        d(objS);
        return objS;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        defpackage.ajdd ajddVar = this.b;
        if (ajddVar.isCancelled()) {
            return true;
        }
        if (isDone() && !this.c) {
            try {
                if (defpackage.a.h(ajddVar) instanceof defpackage.apbb) {
                    return true;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                return true;
            } catch (java.util.concurrent.ExecutionException unused2) {
                this.c = true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                java.lang.Object objH = defpackage.a.h(this.b);
                if (objH instanceof defpackage.apbb) {
                    sb.append("CANCELLED, cause=[" + ((defpackage.apbb) objH).a + ']');
                } else {
                    sb.append("SUCCESS, result=[" + objH + ']');
                }
            } catch (java.util.concurrent.CancellationException unused) {
                sb.append("CANCELLED");
            } catch (java.util.concurrent.ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (java.lang.Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + ']');
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.Throwable {
        java.lang.Object objT = this.b.t(j, timeUnit);
        d(objT);
        return objT;
    }
}
