package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aero extends defpackage.aerl implements defpackage.aeqv, defpackage.aepo, defpackage.aepj {
    volatile defpackage.aenj a;
    public final defpackage.amwu b;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.ahbv f;
    public final defpackage.aevd g;
    public final defpackage.tvn h;
    private final java.util.concurrent.Executor j;
    private final defpackage.aequ k;
    private final defpackage.aepm l;
    private final defpackage.aoin q;
    private final defpackage.ahyn r;
    private final defpackage.aoin s;
    private final defpackage.aoin t;
    private final defpackage.tvn u;
    private final defpackage.zzx v;
    private final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicInteger m = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger n = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger o = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public aero(defpackage.gou gouVar, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.tvn tvnVar, defpackage.aepm aepmVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.ahbv ahbvVar, defpackage.aevd aevdVar, defpackage.ahyn ahynVar, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.tvn tvnVar2) {
        this.b = amwuVar;
        this.u = tvnVar;
        this.l = aepmVar;
        this.v = zzxVar;
        this.k = gouVar.D(defpackage.ajbm.INSTANCE, amwuVar, null);
        this.j = executor;
        this.q = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = ahbvVar;
        this.g = aevdVar;
        this.r = ahynVar;
        this.s = aoinVar4;
        this.t = aoinVar5;
        this.h = tvnVar2;
    }

    private final void q(final int i, final java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        this.j.execute(new defpackage.ajdk(new defpackage.ajas() { // from class: aerm
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return defpackage.ajcm.a;
                }
                int i2 = i;
                defpackage.aero aeroVar = this.a;
                return aeroVar.o(i2, (defpackage.aerg) aeroVar.b.a());
            }
        }));
    }

    @Override // defpackage.aepo
    public final void c(android.app.Activity activity) {
        this.j.execute(new defpackage.ajdk(new defpackage.nya(this, 7)));
    }

    @Override // defpackage.aepo
    public final void d(android.app.Activity activity) {
        this.a = new defpackage.aenj(activity.getClass().getSimpleName());
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        this.a = null;
    }

    @Override // defpackage.aepo
    public final void h() {
        if (this.p.getAndSet(true)) {
            return;
        }
        q(4, this.n);
    }

    @Override // defpackage.aerl
    public final void k() {
        if (this.i.compareAndSet(false, true)) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.aern(this, java.lang.Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f0 A[PHI: r4 r17
      0x01f0: PHI (r4v2 apgi) = (r4v1 apgi), (r4v20 apgi), (r4v20 apgi) binds: [B:65:0x01ec, B:62:0x01e5, B:63:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r17v1 boolean) = (r17v0 boolean), (r17v13 boolean), (r17v13 boolean) binds: [B:65:0x01ec, B:62:0x01e5, B:63:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa A[Catch: InterruptedException -> 0x026a, all -> 0x0271, TryCatch #10 {InterruptedException -> 0x026a, all -> 0x0271, blocks: (B:67:0x01f2, B:69:0x01fa, B:71:0x020b, B:70:0x0203), top: B:106:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0203 A[Catch: InterruptedException -> 0x026a, all -> 0x0271, TryCatch #10 {InterruptedException -> 0x026a, all -> 0x0271, blocks: (B:67:0x01f2, B:69:0x01fa, B:71:0x020b, B:70:0x0203), top: B:106:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0279 A[LOOP:0: B:74:0x0271->B:76:0x0279, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0283  */
    /* JADX WARN: Code duplicated, block: B:86:0x02aa A[LOOP:2: B:84:0x02a2->B:86:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b3 A[LOOP:1: B:82:0x029a->B:90:0x02b3, LOOP_END] */
    public final void l(defpackage.apgi apgiVar, aerz aerzVar) {
        aeox aeoxVar;
        boolean z;
        defpackage.apgi apgiVar2;
        boolean z2;
        boolean zG;
        defpackage.aoin aoinVar;
        int i;
        apgf apgfVarR;
        java.io.IOException iOException;
        int iY;
        defpackage.aerg aergVar = (defpackage.aerg) this.b.a();
        if (aergVar.b()) {
            java.lang.Object obj = ((defpackage.adai) ((defpackage.ahys) this.r).a).a;
            synchronized (obj) {
                if (((java.util.WeakHashMap) obj).isEmpty()) {
                    aeoxVar = aeox.a;
                } else {
                    aeoxVar = new aeox((defpackage.aeoz[]) ((java.util.WeakHashMap) obj).values().toArray(new defpackage.aeoz[0]));
                }
            }
            boolean z3 = true;
            try {
                if (m()) {
                    defpackage.ahbv ahbvVar = this.f;
                    if (((java.util.concurrent.atomic.AtomicBoolean) ahbvVar.d).getAndSet(false)) {
                        java.lang.Object obj2 = ahbvVar.e;
                        defpackage.akzx akzxVarM = apgf.a.m();
                        defpackage.aerr aerrVar = (defpackage.aerr) obj2;
                        defpackage.aeri aeriVar = (defpackage.aeri) aerrVar.c.a();
                        if (android.os.SystemClock.uptimeMillis() - aerrVar.d <= aeriVar.e) {
                            defpackage.ahzi ahziVar = aerrVar.a;
                            defpackage.ahzi ahziVar2 = aerrVar.b;
                            defpackage.ahyn ahynVar = (defpackage.ahyn) ahziVar.eZ();
                            boolean zF = ahynVar.f();
                            java.lang.Object objEZ = ahziVar2.eZ();
                            if (zF) {
                                defpackage.ahyn ahynVar2 = (defpackage.ahyn) objEZ;
                                if (ahynVar2.f()) {
                                    aerh aerhVar = new aerh((java.io.File) ahynVar.b(), (java.lang.String) ahynVar2.b());
                                    int iA = aerhVar.a();
                                    akzxVarM.u();
                                    apgf apgfVar = akzxVarM.b;
                                    apgfVar.b |= 2;
                                    apgfVar.d = iA;
                                    int i2 = iA + 1;
                                    if (i2 >= aeriVar.d) {
                                        akzxVarM.u();
                                        apgf apgfVar2 = akzxVarM.b;
                                        apgfVar2.c = 5;
                                        apgfVar2.b |= 1;
                                        apgfVarR = (apgf) akzxVarM.r();
                                    } else {
                                        if (!aerhVar.c()) {
                                            z = z3;
                                            break;
                                        }
                                        aerhVar.b++;
                                        defpackage.akzx akzxVarM2 = aerk.a.m();
                                        int i3 = aerhVar.b;
                                        akzxVarM2.u();
                                        aerk aerkVar = akzxVarM2.b;
                                        aerkVar.b |= 1;
                                        aerkVar.c = i3;
                                        aerk aerkVarR = akzxVarM2.r();
                                        boolean z4 = false;
                                        while (true) {
                                            try {
                                                try {
                                                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(aerhVar.b());
                                                    try {
                                                        aerkVarR.h(fileOutputStream);
                                                        try {
                                                            fileOutputStream.close();
                                                            z = z3;
                                                            break;
                                                        } catch (java.io.IOException e) {
                                                            iOException = e;
                                                            z = z3;
                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(iOException)).l("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).v("failed to write counter to disk.");
                                                        }
                                                    } catch (java.lang.Throwable th) {
                                                        z = z3;
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (java.lang.Throwable th2) {
                                                            try {
                                                                th.addSuppressed(th2);
                                                            } catch (java.io.FileNotFoundException unused) {
                                                                if (z4) {
                                                                    if (i2 >= aeriVar.c) {
                                                                        akzxVarM.u();
                                                                        apgf apgfVar3 = akzxVarM.b;
                                                                        apgfVar3.c = 4;
                                                                        apgfVar3.b |= 1;
                                                                        apgfVarR = (apgf) akzxVarM.r();
                                                                    } else {
                                                                        akzxVarM.u();
                                                                        apgf apgfVar4 = akzxVarM.b;
                                                                        apgfVar4.c = 3;
                                                                        apgfVar4.b |= 1;
                                                                        apgfVarR = (apgf) akzxVarM.r();
                                                                    }
                                                                    defpackage.akzx akzxVarL = apgiVar.L();
                                                                    akzxVarL.u();
                                                                    defpackage.apgi apgiVar3 = (defpackage.apgi) akzxVarL.b;
                                                                    j$.util.Objects.requireNonNull(apgfVarR);
                                                                    apgiVar3.k = apgfVarR;
                                                                    apgiVar3.b |= 2048;
                                                                    apgiVar2 = (defpackage.apgi) akzxVarL.r();
                                                                    iY = defpackage.a.Y(apgfVarR.c);
                                                                    if (iY == 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    zG = defpackage.afec.g();
                                                                    aoinVar = this.q;
                                                                    if (zG) {
                                                                        i = ((defpackage.aerp) aoinVar.a()).b;
                                                                    } else {
                                                                        i = ((defpackage.aerp) aoinVar.a()).c;
                                                                    }
                                                                    long j = i;
                                                                    defpackage.aequ aequVar = this.k;
                                                                    defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                                                                    defpackage.akzx akzxVarM3 = defpackage.apgu.a.m();
                                                                    akzxVarM3.u();
                                                                    defpackage.apgu apguVar = (defpackage.apgu) akzxVarM3.b;
                                                                    j$.util.Objects.requireNonNull(apgiVar2);
                                                                    apguVar.i = apgiVar2;
                                                                    apguVar.b |= 64;
                                                                    aeqqVarA.f((defpackage.apgu) akzxVarM3.r());
                                                                    aeqqVarA.g = aeoxVar;
                                                                    aeqqVarA.b(aergVar.b);
                                                                    aeqqVarA.g(((java.lang.Boolean) this.s.a()).booleanValue());
                                                                    aeqqVarA.e(((java.lang.Long) this.t.a()).intValue());
                                                                    aeqqVarA.e = aerzVar;
                                                                    aequVar.a(aeqqVarA.a()).get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
                                                                    while (this.m.getAndDecrement() > 0) {
                                                                        o(3, aergVar);
                                                                    }
                                                                    if (m()) {
                                                                        p(6, aergVar, ((defpackage.aeri) this.e.a()).f);
                                                                    }
                                                                    while (this.n.getAndDecrement() > 0) {
                                                                        o(4, aergVar);
                                                                    }
                                                                    while (this.o.getAndDecrement() > 0) {
                                                                        o(5, aergVar);
                                                                    }
                                                                    if (z2) {
                                                                        defpackage.ahyn ahynVar3 = aergVar.c;
                                                                    }
                                                                }
                                                                aerhVar.a.mkdirs();
                                                                z3 = z;
                                                                z4 = z3;
                                                            } catch (java.io.IOException e2) {
                                                                e = e2;
                                                                iOException = e;
                                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(iOException)).l("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).v("failed to write counter to disk.");
                                                                if (i2 >= aeriVar.c) {
                                                                    akzxVarM.u();
                                                                    apgf apgfVar5 = akzxVarM.b;
                                                                    apgfVar5.c = 4;
                                                                    apgfVar5.b |= 1;
                                                                    apgfVarR = (apgf) akzxVarM.r();
                                                                } else {
                                                                    akzxVarM.u();
                                                                    apgf apgfVar6 = akzxVarM.b;
                                                                    apgfVar6.c = 3;
                                                                    apgfVar6.b |= 1;
                                                                    apgfVarR = (apgf) akzxVarM.r();
                                                                }
                                                                defpackage.akzx akzxVarL2 = apgiVar.L();
                                                                akzxVarL2.u();
                                                                defpackage.apgi apgiVar4 = (defpackage.apgi) akzxVarL2.b;
                                                                j$.util.Objects.requireNonNull(apgfVarR);
                                                                apgiVar4.k = apgfVarR;
                                                                apgiVar4.b |= 2048;
                                                                apgiVar2 = (defpackage.apgi) akzxVarL2.r();
                                                                iY = defpackage.a.Y(apgfVarR.c);
                                                                if (iY == 0) {
                                                                    z2 = false;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                zG = defpackage.afec.g();
                                                                aoinVar = this.q;
                                                                if (zG) {
                                                                    i = ((defpackage.aerp) aoinVar.a()).b;
                                                                } else {
                                                                    i = ((defpackage.aerp) aoinVar.a()).c;
                                                                }
                                                                long j2 = i;
                                                                defpackage.aequ aequVar2 = this.k;
                                                                defpackage.aeqq aeqqVarA2 = defpackage.aeqr.a();
                                                                defpackage.akzx akzxVarM4 = defpackage.apgu.a.m();
                                                                akzxVarM4.u();
                                                                defpackage.apgu apguVar2 = (defpackage.apgu) akzxVarM4.b;
                                                                j$.util.Objects.requireNonNull(apgiVar2);
                                                                apguVar2.i = apgiVar2;
                                                                apguVar2.b |= 64;
                                                                aeqqVarA2.f((defpackage.apgu) akzxVarM4.r());
                                                                aeqqVarA2.g = aeoxVar;
                                                                aeqqVarA2.b(aergVar.b);
                                                                aeqqVarA2.g(((java.lang.Boolean) this.s.a()).booleanValue());
                                                                aeqqVarA2.e(((java.lang.Long) this.t.a()).intValue());
                                                                aeqqVarA2.e = aerzVar;
                                                                aequVar2.a(aeqqVarA2.a()).get(j2, java.util.concurrent.TimeUnit.MILLISECONDS);
                                                                while (this.m.getAndDecrement() > 0) {
                                                                    o(3, aergVar);
                                                                }
                                                                if (m()) {
                                                                    p(6, aergVar, ((defpackage.aeri) this.e.a()).f);
                                                                }
                                                                while (this.n.getAndDecrement() > 0) {
                                                                    o(4, aergVar);
                                                                }
                                                                while (this.o.getAndDecrement() > 0) {
                                                                    o(5, aergVar);
                                                                }
                                                                if (z2) {
                                                                    defpackage.ahyn ahynVar4 = aergVar.c;
                                                                }
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.io.IOException e3) {
                                                    e = e3;
                                                    z = z3;
                                                }
                                            } catch (java.io.FileNotFoundException unused2) {
                                                z = z3;
                                            }
                                            aerhVar.a.mkdirs();
                                            z3 = z;
                                            z4 = z3;
                                        }
                                        if (i2 >= aeriVar.c) {
                                            akzxVarM.u();
                                            apgf apgfVar7 = akzxVarM.b;
                                            apgfVar7.c = 4;
                                            apgfVar7.b |= 1;
                                            apgfVarR = (apgf) akzxVarM.r();
                                        } else {
                                            akzxVarM.u();
                                            apgf apgfVar8 = akzxVarM.b;
                                            apgfVar8.c = 3;
                                            apgfVar8.b |= 1;
                                            apgfVarR = (apgf) akzxVarM.r();
                                        }
                                    }
                                } else {
                                    z = true;
                                    akzxVarM.u();
                                    apgf apgfVar9 = akzxVarM.b;
                                    apgfVar9.c = 6;
                                    apgfVar9.b |= 1;
                                    apgfVarR = akzxVarM.r();
                                }
                            } else {
                                z = true;
                                akzxVarM.u();
                                apgf apgfVar10 = akzxVarM.b;
                                apgfVar10.c = 6;
                                apgfVar10.b |= 1;
                                apgfVarR = akzxVarM.r();
                            }
                            defpackage.akzx akzxVarL3 = apgiVar.L();
                            akzxVarL3.u();
                            defpackage.apgi apgiVar5 = (defpackage.apgi) akzxVarL3.b;
                            j$.util.Objects.requireNonNull(apgfVarR);
                            apgiVar5.k = apgfVarR;
                            apgiVar5.b |= 2048;
                            apgiVar2 = (defpackage.apgi) akzxVarL3.r();
                            iY = defpackage.a.Y(apgfVarR.c);
                            if (iY == 0 && iY == 5) {
                                z2 = z;
                            }
                            zG = defpackage.afec.g();
                            aoinVar = this.q;
                            if (zG) {
                                i = ((defpackage.aerp) aoinVar.a()).b;
                            } else {
                                i = ((defpackage.aerp) aoinVar.a()).c;
                            }
                            long j3 = i;
                            defpackage.aequ aequVar3 = this.k;
                            defpackage.aeqq aeqqVarA3 = defpackage.aeqr.a();
                            defpackage.akzx akzxVarM5 = defpackage.apgu.a.m();
                            akzxVarM5.u();
                            defpackage.apgu apguVar3 = (defpackage.apgu) akzxVarM5.b;
                            j$.util.Objects.requireNonNull(apgiVar2);
                            apguVar3.i = apgiVar2;
                            apguVar3.b |= 64;
                            aeqqVarA3.f((defpackage.apgu) akzxVarM5.r());
                            aeqqVarA3.g = aeoxVar;
                            aeqqVarA3.b(aergVar.b);
                            aeqqVarA3.g(((java.lang.Boolean) this.s.a()).booleanValue());
                            aeqqVarA3.e(((java.lang.Long) this.t.a()).intValue());
                            aeqqVarA3.e = aerzVar;
                            aequVar3.a(aeqqVarA3.a()).get(j3, java.util.concurrent.TimeUnit.MILLISECONDS);
                            while (this.m.getAndDecrement() > 0) {
                                o(3, aergVar);
                            }
                            if (m() && !this.c.getAndSet(z)) {
                                p(6, aergVar, ((defpackage.aeri) this.e.a()).f);
                            }
                            while (this.n.getAndDecrement() > 0) {
                                o(4, aergVar);
                            }
                            while (this.o.getAndDecrement() > 0) {
                                o(5, aergVar);
                            }
                            if (z2) {
                                defpackage.ahyn ahynVar5 = aergVar.c;
                            }
                        }
                        akzxVarM.u();
                        apgf apgfVar11 = akzxVarM.b;
                        apgfVar11.c = 2;
                        apgfVar11.b |= 1;
                        apgfVarR = (apgf) akzxVarM.r();
                    } else {
                        defpackage.akzx akzxVarM6 = apgf.a.m();
                        akzxVarM6.u();
                        apgf apgfVar12 = akzxVarM6.b;
                        apgfVar12.c = 1;
                        apgfVar12.b |= 1;
                        apgfVarR = (apgf) akzxVarM6.r();
                    }
                    z = true;
                    defpackage.akzx akzxVarL4 = apgiVar.L();
                    akzxVarL4.u();
                    defpackage.apgi apgiVar6 = (defpackage.apgi) akzxVarL4.b;
                    j$.util.Objects.requireNonNull(apgfVarR);
                    apgiVar6.k = apgfVarR;
                    apgiVar6.b |= 2048;
                    apgiVar2 = (defpackage.apgi) akzxVarL4.r();
                    iY = defpackage.a.Y(apgfVarR.c);
                    if (iY == 0) {
                    }
                    zG = defpackage.afec.g();
                    aoinVar = this.q;
                    if (zG) {
                        i = ((defpackage.aerp) aoinVar.a()).b;
                    } else {
                        i = ((defpackage.aerp) aoinVar.a()).c;
                    }
                    long j4 = i;
                    defpackage.aequ aequVar4 = this.k;
                    defpackage.aeqq aeqqVarA4 = defpackage.aeqr.a();
                    defpackage.akzx akzxVarM7 = defpackage.apgu.a.m();
                    akzxVarM7.u();
                    defpackage.apgu apguVar4 = (defpackage.apgu) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(apgiVar2);
                    apguVar4.i = apgiVar2;
                    apguVar4.b |= 64;
                    aeqqVarA4.f((defpackage.apgu) akzxVarM7.r());
                    aeqqVarA4.g = aeoxVar;
                    aeqqVarA4.b(aergVar.b);
                    aeqqVarA4.g(((java.lang.Boolean) this.s.a()).booleanValue());
                    aeqqVarA4.e(((java.lang.Long) this.t.a()).intValue());
                    aeqqVarA4.e = aerzVar;
                    aequVar4.a(aeqqVarA4.a()).get(j4, java.util.concurrent.TimeUnit.MILLISECONDS);
                    while (this.m.getAndDecrement() > 0) {
                        o(3, aergVar);
                    }
                    if (m()) {
                        p(6, aergVar, ((defpackage.aeri) this.e.a()).f);
                    }
                    while (this.n.getAndDecrement() > 0) {
                        o(4, aergVar);
                    }
                    while (this.o.getAndDecrement() > 0) {
                        o(5, aergVar);
                    }
                    if (z2) {
                        defpackage.ahyn ahynVar6 = aergVar.c;
                    }
                }
                z = true;
                apgiVar2 = apgiVar;
                zG = defpackage.afec.g();
                aoinVar = this.q;
                if (zG) {
                    i = ((defpackage.aerp) aoinVar.a()).b;
                } else {
                    i = ((defpackage.aerp) aoinVar.a()).c;
                }
                long j5 = i;
                defpackage.aequ aequVar5 = this.k;
                defpackage.aeqq aeqqVarA5 = defpackage.aeqr.a();
                defpackage.akzx akzxVarM8 = defpackage.apgu.a.m();
                akzxVarM8.u();
                defpackage.apgu apguVar5 = (defpackage.apgu) akzxVarM8.b;
                j$.util.Objects.requireNonNull(apgiVar2);
                apguVar5.i = apgiVar2;
                apguVar5.b |= 64;
                aeqqVarA5.f((defpackage.apgu) akzxVarM8.r());
                aeqqVarA5.g = aeoxVar;
                aeqqVarA5.b(aergVar.b);
                aeqqVarA5.g(((java.lang.Boolean) this.s.a()).booleanValue());
                aeqqVarA5.e(((java.lang.Long) this.t.a()).intValue());
                aeqqVarA5.e = aerzVar;
                aequVar5.a(aeqqVarA5.a()).get(j5, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused3) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.lang.Throwable unused4) {
            }
            z2 = false;
            while (this.m.getAndDecrement() > 0) {
                o(3, aergVar);
            }
            if (m()) {
                p(6, aergVar, ((defpackage.aeri) this.e.a()).f);
            }
            while (this.n.getAndDecrement() > 0) {
                o(4, aergVar);
            }
            while (this.o.getAndDecrement() > 0) {
                o(5, aergVar);
            }
            if (z2) {
                defpackage.ahyn ahynVar7 = aergVar.c;
            }
        }
    }

    public final boolean m() {
        return ((defpackage.aeri) this.e.a()).b;
    }

    @Override // defpackage.aeqv
    public final void n() {
        this.u.w(this);
        this.l.a(this);
        q(3, this.m);
        this.j.execute(new defpackage.ajdk(new defpackage.nya(this, 6)));
    }

    public final defpackage.ajcq o(int i, defpackage.aerg aergVar) {
        return p(i, aergVar, aergVar.a / 100.0f);
    }

    public final defpackage.ajcq p(int i, defpackage.aerg aergVar, float f) {
        if (!aergVar.b()) {
            return defpackage.ajcm.a;
        }
        if (!this.v.K(f).a()) {
            return defpackage.ajcm.a;
        }
        defpackage.aequ aequVar = this.k;
        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
        defpackage.akzx akzxVarM = defpackage.apgu.a.m();
        defpackage.akzx akzxVarM2 = defpackage.apgs.a.m();
        float f2 = 1.0f / f;
        akzxVarM2.u();
        defpackage.apgs apgsVar = (defpackage.apgs) akzxVarM2.b;
        apgsVar.b |= 2;
        apgsVar.d = (int) f2;
        akzxVarM2.u();
        defpackage.apgs apgsVar2 = (defpackage.apgs) akzxVarM2.b;
        apgsVar2.c = i - 1;
        apgsVar2.b |= 1;
        akzxVarM.u();
        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
        defpackage.apgs apgsVar3 = (defpackage.apgs) akzxVarM2.r();
        j$.util.Objects.requireNonNull(apgsVar3);
        apguVar.x = apgsVar3;
        apguVar.b |= 16777216;
        aeqqVarA.f((defpackage.apgu) akzxVarM.r());
        return aequVar.a(aeqqVarA.a());
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void b(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.aepj
    public final /* synthetic */ void j(defpackage.aenj aenjVar) {
    }
}
