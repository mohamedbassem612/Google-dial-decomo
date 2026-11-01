package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcy implements java.util.concurrent.Executor, java.io.Closeable {
    public static final defpackage.apcm a = new defpackage.apcm("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final java.lang.String e;
    public final defpackage.aorp f;
    public final defpackage.apci g;
    public final defpackage.aorp h;
    public final defpackage.zzx i;
    public final defpackage.zzx j;
    private final defpackage.aorn k;

    public apcy(int i, int i2, long j, java.lang.String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bf(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bC(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.i = new defpackage.zzx((byte[]) null, (byte[]) null, (char[]) null);
        this.j = new defpackage.zzx((byte[]) null, (byte[]) null, (char[]) null);
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.f = new defpackage.aorp(0L, aorrVar);
        this.g = new defpackage.apci((i + 1) << 1);
        this.h = new defpackage.aorp(((long) i) << 42, aorrVar);
        this.k = new defpackage.aorn(false, aorrVar);
    }

    public static final void e(defpackage.apdc apdcVar) {
        try {
            apdcVar.run();
        } catch (java.lang.Throwable th) {
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final int g() {
        defpackage.apci apciVar = this.g;
        synchronized (apciVar) {
            if (d()) {
                return -1;
            }
            defpackage.aorp aorpVar = this.h;
            long j = aorpVar.b;
            int i = (int) (j & 2097151);
            int iT = defpackage.aooc.t(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iT >= this.b || i >= this.c) {
                return 0;
            }
            int i2 = ((int) (aorpVar.b & 2097151)) + 1;
            if (apciVar.a(i2) != null) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            defpackage.apcx apcxVar = new defpackage.apcx(this, i2);
            apciVar.b(i2, apcxVar);
            if (i2 != ((int) (defpackage.aorp.a.incrementAndGet(aorpVar) & 2097151))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            int i3 = iT + 1;
            apcxVar.start();
            return i3;
        }
    }

    private final defpackage.apcx h() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        defpackage.apcx apcxVar = threadCurrentThread instanceof defpackage.apcx ? (defpackage.apcx) threadCurrentThread : null;
        if (apcxVar == null || !defpackage.aooh.n(apcxVar.c, this)) {
            return null;
        }
        return apcxVar;
    }

    private final boolean i(long j) {
        int iT = defpackage.aooc.t(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (iT >= i) {
            return false;
        }
        int iG = g();
        if (iG == 1) {
            if (i > 1) {
                g();
            }
        } else if (iG <= 0) {
            return false;
        }
        return true;
    }

    private final boolean j() {
        defpackage.apcx apcxVar;
        do {
            defpackage.aorp aorpVar = this.f;
            while (true) {
                long j = aorpVar.b;
                apcxVar = (defpackage.apcx) this.g.a((int) (2097151 & j));
                if (apcxVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(apcxVar);
                    if (iK >= 0 && aorpVar.c(j, (j2 & (-2097152)) | ((long) iK))) {
                        apcxVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    apcxVar = null;
                    break;
                }
            }
            if (apcxVar == null) {
                return false;
            }
        } while (!apcxVar.a.c(-1, 0));
        java.util.concurrent.locks.LockSupport.unpark(apcxVar);
        return true;
    }

    private static final int k(defpackage.apcx apcxVar) {
        int i;
        do {
            java.lang.Object obj = apcxVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            apcxVar = (defpackage.apcx) obj;
            i = apcxVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(java.lang.Runnable runnable, boolean z, boolean z2) {
        defpackage.apdc apddVar;
        int i;
        java.lang.String str = defpackage.apde.a;
        long jNanoTime = java.lang.System.nanoTime();
        if (runnable instanceof defpackage.apdc) {
            apddVar = (defpackage.apdc) runnable;
            apddVar.g = jNanoTime;
            apddVar.h = z;
        } else {
            apddVar = new defpackage.apdd(runnable, jNanoTime, z);
        }
        boolean z3 = apddVar.h;
        long jA = z3 ? this.h.a(2097152L) : 0L;
        defpackage.apcx apcxVarH = h();
        if (apcxVarH != null && (i = apcxVarH.d) != 5 && (apddVar.h || i != 2)) {
            apcxVarH.b = true;
            defpackage.gou gouVar = apcxVarH.e;
            if (z2) {
                apddVar = gouVar.r(apddVar);
            } else {
                defpackage.apdc apdcVar = (defpackage.apdc) ((defpackage.aorq) gouVar.a).a(apddVar);
                apddVar = apdcVar == null ? null : gouVar.r(apdcVar);
            }
        }
        if (apddVar != null) {
            if (!(apddVar.h ? this.j.Z(apddVar) : this.i.Z(apddVar))) {
                throw new java.util.concurrent.RejectedExecutionException(java.lang.String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(defpackage.apcx apcxVar, int i, int i2) {
        while (true) {
            defpackage.aorp aorpVar = this.f;
            long j = aorpVar.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(apcxVar) : i2;
            }
            if (iK >= 0 && aorpVar.c(j, (j2 & (-2097152)) | ((long) iK))) {
                return;
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        a(runnable, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    public final void f() {
        long j;
        defpackage.apdc apdcVarB;
        if (this.k.b()) {
            defpackage.apcx apcxVarH = h();
            synchronized (this.g) {
                j = this.h.b & 2097151;
            }
            int i = (int) j;
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Object objA = this.g.a(i2);
                    defpackage.aooh.c(objA);
                    defpackage.apcx apcxVar = (defpackage.apcx) objA;
                    if (apcxVar != apcxVarH) {
                        while (apcxVar.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(apcxVar);
                            apcxVar.join(10000L);
                        }
                        boolean z = defpackage.aosu.a;
                        defpackage.gou gouVar = apcxVar.e;
                        defpackage.zzx zzxVar = this.j;
                        defpackage.apdc apdcVar = (defpackage.apdc) ((defpackage.aorq) gouVar.a).a(null);
                        if (apdcVar != null) {
                            zzxVar.Z(apdcVar);
                        }
                        while (true) {
                            defpackage.apdc apdcVarS = gouVar.s();
                            if (apdcVarS == null) {
                                break;
                            } else {
                                zzxVar.Z(apdcVarS);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            defpackage.zzx zzxVar2 = this.j;
            zzxVar2.Y();
            defpackage.zzx zzxVar3 = this.i;
            zzxVar3.Y();
            while (true) {
                if (apcxVarH == null) {
                    apdcVarB = (defpackage.apdc) zzxVar3.X();
                    if (apdcVarB == null && (apdcVarB = (defpackage.apdc) zzxVar2.X()) == null) {
                        break;
                    }
                } else {
                    apdcVarB = apcxVarH.b(true);
                    if (apdcVarB == null) {
                        apdcVarB = (defpackage.apdc) zzxVar3.X();
                        if (apdcVarB == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                e(apdcVarB);
            }
            if (apcxVarH != null) {
                apcxVarH.d(5);
            }
            boolean z2 = defpackage.aosu.a;
            this.f.b = 0L;
            this.h.b = 0L;
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.apci apciVar = this.g;
        int length = apciVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            defpackage.apcx apcxVar = (defpackage.apcx) apciVar.a(i6);
            if (apcxVar != null) {
                defpackage.gou gouVar = apcxVar.e;
                java.lang.Object obj = ((defpackage.aorq) gouVar.a).a;
                int iQ = gouVar.q();
                if (obj != null) {
                    iQ++;
                }
                int i7 = apcxVar.d;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(iQ);
                    sb.append('c');
                    arrayList.add(sb.toString());
                    i++;
                } else if (i8 == 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(iQ);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iQ > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(iQ);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i8 != 4) {
                        throw new defpackage.aois();
                    }
                    i5++;
                }
            }
        }
        defpackage.aorp aorpVar = this.h;
        java.lang.String str = this.e;
        long j = aorpVar.b;
        java.lang.String strB = defpackage.aosv.b(this);
        int i9 = this.b;
        int i10 = this.c;
        defpackage.zzx zzxVar = this.i;
        defpackage.zzx zzxVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + '@' + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + zzxVar.W() + ", global blocking queue size = " + zzxVar2.W() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
