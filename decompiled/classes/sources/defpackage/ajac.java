package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajac extends defpackage.ajaj {
    public static final /* synthetic */ int i = 0;

    private static java.lang.Object d(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    defpackage.aiql.o();
                }
                throw th;
            }
        }
        if (z) {
            defpackage.aiql.o();
        }
        return obj;
    }

    private final void e(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objD = d(this);
            sb.append("SUCCESS, result=[");
            if (objD == null) {
                sb.append("null");
            } else if (objD == this) {
                sb.append("this future");
            } else {
                sb.append(objD.getClass().getName());
                sb.append('@');
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(objD)));
            }
            sb.append(']');
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(']');
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void f(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            k.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    static java.lang.Object h(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof defpackage.aizv) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(((defpackage.aizv) obj).d);
            throw cancellationException;
        }
        if (obj instanceof defpackage.aizy) {
            throw new java.util.concurrent.ExecutionException(((defpackage.aizy) obj).b);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object i(defpackage.ajcq ajcqVar) {
        java.lang.Object aizvVar;
        java.lang.Throwable thJ;
        if (ajcqVar instanceof defpackage.ajaa) {
            java.lang.Object aizvVar2 = ((defpackage.ajac) ajcqVar).valueField;
            if (aizvVar2 instanceof defpackage.aizv) {
                defpackage.aizv aizvVar3 = (defpackage.aizv) aizvVar2;
                if (aizvVar3.c) {
                    java.lang.Throwable th = aizvVar3.d;
                    aizvVar2 = th != null ? new defpackage.aizv(false, th) : defpackage.aizv.b;
                }
            }
            return j$.util.Objects.requireNonNull(aizvVar2);
        }
        if ((ajcqVar instanceof defpackage.ajdm) && (thJ = ((defpackage.ajdm) ajcqVar).j()) != null) {
            return new defpackage.aizy(thJ);
        }
        boolean zIsCancelled = ajcqVar.isCancelled();
        if ((!l) && zIsCancelled) {
            return j$.util.Objects.requireNonNull(defpackage.aizv.b);
        }
        try {
            java.lang.Object objD = d(ajcqVar);
            if (zIsCancelled) {
                objD = new defpackage.aizv(false, new java.lang.IllegalArgumentException(defpackage.a.bH(ajcqVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: ")));
            } else if (objD == null) {
                return j;
            }
            return objD;
        } catch (java.lang.Error e) {
            e = e;
            return new defpackage.aizy(e);
        } catch (java.util.concurrent.CancellationException e2) {
            if (zIsCancelled) {
                return new defpackage.aizv(false, e2);
            }
            aizvVar = new defpackage.aizy(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajcqVar))), e2));
            return aizvVar;
        } catch (java.util.concurrent.ExecutionException e3) {
            if (!zIsCancelled) {
                return new defpackage.aizy(e3.getCause());
            }
            aizvVar = new defpackage.aizv(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajcqVar))), e3));
            return aizvVar;
        } catch (java.lang.Exception e4) {
            e = e4;
            return new defpackage.aizy(e);
        }
    }

    public static void k(defpackage.ajac ajacVar, boolean z) {
        defpackage.aizz aizzVar = null;
        while (true) {
            for (defpackage.ajai ajaiVarB = defpackage.ajaj.m.b(ajacVar, defpackage.ajai.a); ajaiVarB != null; ajaiVarB = ajaiVarB.next) {
                java.lang.Thread thread = ajaiVarB.thread;
                if (thread != null) {
                    ajaiVarB.thread = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            if (z) {
                ajacVar.l();
            }
            ajacVar.a();
            defpackage.aizz aizzVar2 = aizzVar;
            defpackage.aizz aizzVarA = defpackage.ajaj.m.a(ajacVar, defpackage.aizz.a);
            defpackage.aizz aizzVar3 = aizzVar2;
            while (aizzVarA != null) {
                defpackage.aizz aizzVar4 = aizzVarA.next;
                aizzVarA.next = aizzVar3;
                aizzVar3 = aizzVarA;
                aizzVarA = aizzVar4;
            }
            while (aizzVar3 != null) {
                java.lang.Runnable runnable = aizzVar3.b;
                aizzVar = aizzVar3.next;
                java.lang.Runnable runnable2 = (java.lang.Runnable) j$.util.Objects.requireNonNull(runnable);
                if (runnable2 instanceof defpackage.aizw) {
                    defpackage.aizw aizwVar = (defpackage.aizw) runnable2;
                    ajacVar = aizwVar.a;
                    if (ajacVar.valueField == aizwVar) {
                        if (defpackage.ajaj.m.f(ajacVar, aizwVar, i(aizwVar.b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    f(runnable2, (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(aizzVar3.c));
                }
                aizzVar3 = aizzVar;
            }
            return;
        }
    }

    static boolean n(java.lang.Object obj) {
        return !(obj instanceof defpackage.aizw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String b() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.ajcq
    public void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.aizz aizzVar;
        if (runnable == null) {
            throw new java.lang.NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor was null.");
        }
        if (!isDone() && (aizzVar = this.listenersField) != defpackage.aizz.a) {
            defpackage.aizz aizzVar2 = new defpackage.aizz(runnable, executor);
            do {
                aizzVar2.next = aizzVar;
                if (defpackage.ajaj.m.e(this, aizzVar, aizzVar2)) {
                    return;
                } else {
                    aizzVar = this.listenersField;
                }
            } while (aizzVar != defpackage.aizz.a);
        }
        f(runnable, executor);
    }

    public boolean cancel(boolean z) {
        java.lang.Object objRequireNonNull;
        java.lang.Object obj = this.valueField;
        if (!(obj == null) && !(obj instanceof defpackage.aizw)) {
            return false;
        }
        if (l) {
            objRequireNonNull = new defpackage.aizv(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            objRequireNonNull = j$.util.Objects.requireNonNull(z ? defpackage.aizv.a : defpackage.aizv.b);
        }
        boolean z2 = false;
        while (true) {
            if (defpackage.ajaj.m.f(this, obj, objRequireNonNull)) {
                k(this, z);
                if (obj instanceof defpackage.aizw) {
                    defpackage.ajcq ajcqVar = ((defpackage.aizw) obj).b;
                    if (ajcqVar instanceof defpackage.ajaa) {
                        this = (defpackage.ajac) ajcqVar;
                        obj = this.valueField;
                        if ((obj == null) | (obj instanceof defpackage.aizw)) {
                            z2 = true;
                        }
                    } else {
                        ajcqVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.valueField;
            if (!(obj instanceof defpackage.aizw)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof defpackage.aizv;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.valueField;
        return (obj != null) & (!(obj instanceof defpackage.aizw));
    }

    @Override // defpackage.ajdm
    public final java.lang.Throwable j() {
        if (this instanceof defpackage.ajaa) {
            java.lang.Object obj = this.valueField;
            if (obj instanceof defpackage.aizy) {
                return ((defpackage.aizy) obj).b;
            }
        }
        return null;
    }

    public final void m(java.util.concurrent.Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    public final boolean o(java.lang.Object obj) {
        if (obj == null) {
            obj = j;
        }
        if (!defpackage.ajaj.m.f(this, null, obj)) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean p(java.lang.Throwable th) {
        if (!defpackage.ajaj.m.f(this, null, new defpackage.aizy(th))) {
            return false;
        }
        k(this, false);
        return true;
    }

    public final boolean q(defpackage.ajcq ajcqVar) {
        defpackage.aizy aizyVar;
        ajcqVar.getClass();
        java.lang.Object obj = this.valueField;
        if (obj == null) {
            if (ajcqVar.isDone()) {
                if (!defpackage.ajaj.m.f(this, null, i(ajcqVar))) {
                    return false;
                }
                k(this, false);
            } else {
                defpackage.aizw aizwVar = new defpackage.aizw(this, ajcqVar);
                if (defpackage.ajaj.m.f(this, null, aizwVar)) {
                    try {
                        ajcqVar.c(aizwVar, defpackage.ajbm.INSTANCE);
                    } catch (java.lang.Throwable th) {
                        try {
                            aizyVar = new defpackage.aizy(th);
                        } catch (java.lang.Error | java.lang.Exception unused) {
                            aizyVar = defpackage.aizy.a;
                        }
                        defpackage.ajaj.m.f(this, aizwVar, aizyVar);
                    }
                } else {
                    obj = this.valueField;
                }
            }
            return true;
        }
        if (!(obj instanceof defpackage.aizv)) {
            return false;
        }
        ajcqVar.cancel(((defpackage.aizv) obj).c);
        return false;
    }

    public final boolean r() {
        java.lang.Object obj = this.valueField;
        return (obj instanceof defpackage.aizv) && ((defpackage.aizv) obj).c;
    }

    public java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            java.lang.Object obj = this.valueField;
            if (obj instanceof defpackage.aizw) {
                sb.append(", setFuture=[");
                defpackage.ajcq ajcqVar = ((defpackage.aizw) obj).b;
                try {
                    if (ajcqVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ajcqVar);
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.aiql.q(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(']');
            } else {
                try {
                    strConcat = defpackage.ahvr.cn(b());
                } catch (java.lang.Throwable th2) {
                    defpackage.aiql.q(th2);
                    strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append(']');
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                e(sb);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return t(j, timeUnit);
    }

    protected void a() {
    }

    protected void l() {
    }
}
