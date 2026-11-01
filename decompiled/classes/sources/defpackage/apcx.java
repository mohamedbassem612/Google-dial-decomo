package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcx extends java.lang.Thread {
    public final defpackage.aoro a;
    public boolean b;
    final /* synthetic */ defpackage.apcy c;
    public int d;
    public final defpackage.gou e;
    private final defpackage.aoot f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile java.lang.Object nextParkedWorker;

    public apcx(defpackage.apcy apcyVar, int i) {
        this.c = apcyVar;
        setDaemon(true);
        setContextClassLoader(apcyVar.getClass().getClassLoader());
        this.e = new defpackage.gou();
        this.f = new defpackage.aoot();
        this.d = 4;
        this.a = new defpackage.aoro(0, defpackage.aorr.a);
        this.nextParkedWorker = defpackage.apcy.a;
        int iNanoTime = (int) java.lang.System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final defpackage.apdc e() {
        int iA = a(2);
        defpackage.apcy apcyVar = this.c;
        if (iA == 0) {
            defpackage.apdc apdcVar = (defpackage.apdc) apcyVar.i.X();
            return apdcVar == null ? (defpackage.apdc) apcyVar.j.X() : apdcVar;
        }
        defpackage.apdc apdcVar2 = (defpackage.apdc) apcyVar.j.X();
        return apdcVar2 == null ? (defpackage.apdc) apcyVar.i.X() : apdcVar2;
    }

    private final defpackage.apdc f(int i) {
        long j;
        defpackage.apdc apdcVarS;
        long j2;
        java.lang.Object obj;
        long j3;
        long j4;
        defpackage.apcy apcyVar = this.c;
        int i2 = (int) (apcyVar.h.b & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iA = a(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iA++;
            if (iA > i2) {
                iA = 1;
            }
            defpackage.apcx apcxVar = (defpackage.apcx) apcyVar.g.a(iA);
            if (apcxVar != null && apcxVar != this) {
                defpackage.gou gouVar = apcxVar.e;
                defpackage.aoot aootVar = this.f;
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = ((defpackage.aoro) gouVar.c).b;
                    j = 0;
                    int i5 = ((defpackage.aoro) gouVar.e).b;
                    while (true) {
                        if (i4 == i5 || (z && ((defpackage.aoro) gouVar.b).b == 0)) {
                            apdcVarS = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        defpackage.apdc apdcVarT = gouVar.t(i4, z);
                        if (apdcVarT != null) {
                            apdcVarS = apdcVarT;
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    apdcVarS = gouVar.s();
                    j = 0;
                }
                if (apdcVarS != null) {
                    aootVar.a = apdcVarS;
                    obj = null;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        defpackage.aorq aorqVar = (defpackage.aorq) gouVar.a;
                        defpackage.apdc apdcVar = (defpackage.apdc) aorqVar.a;
                        j2 = -2;
                        if (apdcVar != null) {
                            j3 = -1;
                            if (((true != apdcVar.h ? 2 : 1) & i) != 0) {
                                java.lang.String str = defpackage.apde.a;
                                defpackage.gou gouVar2 = gouVar;
                                long jNanoTime = java.lang.System.nanoTime() - apdcVar.g;
                                long j5 = defpackage.apde.b;
                                if (jNanoTime < j5) {
                                    j2 = j5 - jNanoTime;
                                } else {
                                    obj = null;
                                    if (aorqVar.d(apdcVar, null)) {
                                        aootVar.a = apdcVar;
                                        j2 = -1;
                                        break;
                                    }
                                    gouVar = gouVar2;
                                }
                            }
                            obj = null;
                            break;
                        }
                        obj = null;
                        j3 = -1;
                        break;
                    }
                    j4 = j2;
                }
                if (j4 == j3) {
                    defpackage.apdc apdcVar2 = (defpackage.apdc) aootVar.a;
                    aootVar.a = obj;
                    return apdcVar2;
                }
                if (j4 > j) {
                    jMin = java.lang.Math.min(jMin, j4);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.h = jMin;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != defpackage.apcy.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final defpackage.apdc b(boolean z) {
        defpackage.apdc apdcVarE;
        defpackage.apdc apdcVarE2;
        defpackage.aorp aorpVar;
        long j;
        defpackage.apdc apdcVar = null;
        if (this.d != 1) {
            defpackage.apcy apcyVar = this.c;
            do {
                aorpVar = apcyVar.h;
                j = aorpVar.b;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    defpackage.gou gouVar = this.e;
                    while (true) {
                        defpackage.aorq aorqVar = (defpackage.aorq) gouVar.a;
                        defpackage.apdc apdcVar2 = (defpackage.apdc) aorqVar.a;
                        if (apdcVar2 == null || !apdcVar2.h) {
                            int i = ((defpackage.aoro) gouVar.c).b;
                            int i2 = ((defpackage.aoro) gouVar.e).b;
                            while (i != i2 && ((defpackage.aoro) gouVar.b).b != 0) {
                                i2--;
                                defpackage.apdc apdcVarT = gouVar.t(i2, true);
                                if (apdcVarT != null) {
                                    apdcVar = apdcVarT;
                                    break;
                                }
                            }
                            break;
                        }
                        if (aorqVar.d(apdcVar2, null)) {
                            apdcVar = apdcVar2;
                            break;
                        }
                    }
                    if (apdcVar != null) {
                        return apdcVar;
                    }
                    defpackage.apdc apdcVar3 = (defpackage.apdc) apcyVar.j.X();
                    return apdcVar3 == null ? f(1) : apdcVar3;
                }
            } while (!aorpVar.c(j, (-4398046511104L) + j));
            this.d = 1;
        }
        if (z) {
            boolean z2 = a(this.c.b << 1) == 0;
            if (z2 && (apdcVarE2 = e()) != null) {
                return apdcVarE2;
            }
            defpackage.gou gouVar2 = this.e;
            defpackage.apdc apdcVar4 = (defpackage.apdc) ((defpackage.aorq) gouVar2.a).a(null);
            defpackage.apdc apdcVarS = apdcVar4 == null ? gouVar2.s() : apdcVar4;
            if (apdcVarS != null) {
                return apdcVarS;
            }
            if (!z2 && (apdcVarE = e()) != null) {
                return apdcVarE;
            }
        } else {
            defpackage.apdc apdcVarE3 = e();
            if (apdcVarE3 != null) {
                return apdcVarE3;
            }
        }
        return f(3);
    }

    public final void c(int i) {
        java.lang.String strValueOf = i == 0 ? "TERMINATED" : java.lang.String.valueOf(i);
        setName(this.c.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.d;
        boolean z = i2 == 1;
        if (z) {
            this.c.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.d = i;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[DONT_GENERATE] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                defpackage.apcy apcyVar = this.c;
                if (apcyVar.d() || this.d == 5) {
                    break loop0;
                }
                defpackage.apdc apdcVarB = b(this.b);
                if (apdcVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.d == 3) {
                        boolean z2 = defpackage.aosu.a;
                        this.d = 2;
                    }
                    if (!apdcVarB.h) {
                        defpackage.apcy.e(apdcVarB);
                        break;
                    }
                    if (d(2)) {
                        apcyVar.c();
                    }
                    defpackage.apcy.e(apdcVarB);
                    apcyVar.h.a(-2097152L);
                    if (this.d == 5) {
                        break;
                    }
                    boolean z3 = defpackage.aosu.a;
                    this.d = 4;
                    break;
                }
                this.b = false;
                if (this.h == 0) {
                    long j2 = 2097151;
                    if (g()) {
                        defpackage.aoro aoroVar = this.a;
                        aoroVar.b = -1;
                        while (g() && aoroVar.b == -1 && !apcyVar.d() && this.d != 5) {
                            d(3);
                            java.lang.Thread.interrupted();
                            if (this.g == 0) {
                                this.g = java.lang.System.nanoTime() + apcyVar.d;
                            }
                            java.util.concurrent.locks.LockSupport.parkNanos(apcyVar.d);
                            long j3 = j2;
                            if (java.lang.System.nanoTime() - this.g >= 0) {
                                this.g = 0L;
                                defpackage.apci apciVar = apcyVar.g;
                                synchronized (apciVar) {
                                    if (!apcyVar.d()) {
                                        defpackage.aorp aorpVar = apcyVar.h;
                                        if (((int) (aorpVar.b & j3)) > apcyVar.b && aoroVar.c(-1, 1)) {
                                            int i = this.indexInArray;
                                            c(0);
                                            apcyVar.b(this, i, 0);
                                            int andDecrement = (int) (defpackage.aorp.a.getAndDecrement(aorpVar) & j3);
                                            if (andDecrement != i) {
                                                java.lang.Object objA = apciVar.a(andDecrement);
                                                defpackage.aooh.c(objA);
                                                defpackage.apcx apcxVar = (defpackage.apcx) objA;
                                                apciVar.b(i, apcxVar);
                                                apcxVar.c(i);
                                                apcyVar.b(apcxVar, andDecrement, i);
                                            }
                                            apciVar.b(andDecrement, null);
                                            this.d = 5;
                                        }
                                    }
                                }
                            }
                            j2 = j3;
                        }
                    } else if (this.nextParkedWorker == defpackage.apcy.a) {
                        defpackage.aorp aorpVar2 = apcyVar.f;
                        while (true) {
                            long j4 = aorpVar2.b;
                            int i2 = this.indexInArray;
                            boolean z4 = defpackage.aosu.a;
                            long j5 = j;
                            this.nextParkedWorker = apcyVar.g.a((int) (j4 & 2097151));
                            j = aorpVar2.c(j4, ((2097152 + j4) & j5) | ((long) i2)) ? -2097152L : j5;
                        }
                    }
                } else {
                    if (z) {
                        d(3);
                        java.lang.Thread.interrupted();
                        java.util.concurrent.locks.LockSupport.parkNanos(this.h);
                        this.h = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        d(5);
    }
}
