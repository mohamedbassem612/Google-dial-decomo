package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class afir {
    final java.lang.Object a;
    public final java.lang.String b;
    public final defpackage.afio[] c;
    java.util.HashMap d;
    public int e;
    private final defpackage.aoin f;
    private boolean g = true;

    public afir(java.lang.String str, defpackage.aoin aoinVar, defpackage.afio... afioVarArr) {
        this.b = str;
        this.c = afioVarArr;
        int length = afioVarArr.length;
        java.util.HashMap map = new java.util.HashMap(length > 0 ? 10 : 1);
        this.d = map;
        if (length == 0) {
            map.put(defpackage.afij.b, a());
        }
        this.e = 0;
        this.f = aoinVar;
        this.a = new java.lang.Object();
    }

    public abstract defpackage.afik a();

    public final void c() {
        this.g = false;
    }

    protected final void d(java.lang.Object obj, defpackage.afij afijVar) {
        synchronized (this.a) {
            defpackage.afik afikVarA = (defpackage.afik) this.d.get(afijVar);
            if (afikVarA == null) {
                afikVarA = a();
                this.d.put(afijVar, afikVarA);
            }
            afikVarA.b(obj);
            this.e++;
        }
        defpackage.afis afisVar = ((defpackage.afit) this.f).c;
        if (afisVar != null) {
            defpackage.afiv afivVar = (defpackage.afiv) afisVar;
            java.util.concurrent.atomic.AtomicLong atomicLong = afivVar.c;
            int i = 18;
            if (atomicLong.incrementAndGet() >= 100) {
                java.lang.Object obj2 = afivVar.e;
                synchronized (obj2) {
                    if (atomicLong.get() >= 100) {
                        synchronized (obj2) {
                            try {
                                java.util.concurrent.ScheduledFuture scheduledFuture = ((defpackage.afiv) afisVar).d;
                                if (scheduledFuture == null || scheduledFuture.isDone() || ((defpackage.afiv) afisVar).d.isCancelled()) {
                                    ((defpackage.afiv) afisVar).d = ((defpackage.afiv) afisVar).a.schedule(new defpackage.abqg(afisVar, i), 1L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                } else if (((defpackage.afiv) afisVar).d.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) > 100) {
                                    ((defpackage.afiv) afisVar).a();
                                    ((defpackage.afiv) afisVar).d = ((defpackage.afiv) afisVar).a.schedule(new defpackage.abqg(afisVar, i), 1L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                }
            }
            synchronized (afivVar.e) {
                java.util.concurrent.ScheduledFuture scheduledFuture2 = ((defpackage.afiv) afisVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((defpackage.afiv) afisVar).d.isCancelled()) {
                    ((defpackage.afiv) afisVar).d = ((defpackage.afiv) afisVar).a.schedule(new defpackage.abqg(afisVar, i), ((defpackage.afiv) afisVar).b, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void e(java.lang.Object... objArr) {
        defpackage.afio[] afioVarArr = this.c;
        defpackage.ahvr.bM(afioVarArr.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                java.lang.Object obj = objArr[i];
                if (obj == null) {
                    throw new java.lang.NullPointerException("Streamz " + this.b + " has null parameter: " + java.util.Arrays.toString(objArr));
                }
                if (!afioVarArr[i].b.isInstance(obj)) {
                    java.lang.String str = this.b;
                    java.lang.String string = obj.toString();
                    java.lang.String strValueOf = java.lang.String.valueOf(obj.getClass());
                    defpackage.afio afioVar = afioVarArr[i];
                    throw new java.lang.IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + string + ", type: " + strValueOf + "}, but expected: {name: " + afioVar.a + ", type: " + afioVar.b.toString() + '}');
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afiu */
    final void f(defpackage.afio... afioVarArr) throws afiu {
        defpackage.afio[] afioVarArr2 = this.c;
        if (java.util.Arrays.equals(afioVarArr2, afioVarArr)) {
            return;
        }
        throw new afiu("Streamz " + this.b + " with field diffs: " + java.util.Arrays.toString(afioVarArr2) + " and " + java.util.Arrays.toString(afioVarArr));
    }
}
