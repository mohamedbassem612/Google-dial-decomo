package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adnp {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;

    public adnp(java.util.concurrent.Executor executor) {
        if (executor == null) {
            defpackage.aooh.i("executorForThrowables");
        }
        this.a = executor;
        this.b = new java.util.concurrent.atomic.AtomicReference();
        this.c = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.d = new defpackage.abrw();
    }

    public static j$.util.Optional f(java.lang.String str, java.lang.String str2) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            return j$.util.Optional.of(defpackage.aish.g.f().k(messageDigest.digest((str + str2).getBytes(java.nio.charset.StandardCharsets.UTF_8))));
        } catch (java.security.NoSuchAlgorithmException unused) {
            return j$.util.Optional.empty();
        }
    }

    public final defpackage.cxy a() {
        java.lang.Object obj = this.e;
        if (obj != null) {
            return (defpackage.cxy) obj;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final defpackage.ajcq b(java.util.concurrent.Executor executor, defpackage.ajas ajasVar) {
        defpackage.aooh.f(executor, "executor");
        return defpackage.aiql.D(defpackage.ahqx.i(new defpackage.nyf(this, defpackage.aiql.E(defpackage.ahqx.b(ajasVar), new defpackage.aajr(this, 3)), 9)), executor);
    }

    public final java.lang.Object c(defpackage.ajas ajasVar) {
        defpackage.aajr aajrVar = new defpackage.aajr(this, 4);
        defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
        aajrVar.execute(ajdkVar);
        return d(ajdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x033b A[Catch: all -> 0x034c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x034c, blocks: (B:112:0x0291, B:114:0x02c1, B:125:0x031c, B:131:0x033b, B:117:0x02c9, B:119:0x02e3), top: B:153:0x0291 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0325 A[EDGE_INSN: B:167:0x0325->B:127:0x0325 BREAK  A[LOOP:2: B:149:0x01c6->B:169:0x01c6], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final java.lang.Object d(defpackage.ajcq ajcqVar) {
        defpackage.abry abryVarA;
        long jB;
        boolean z;
        boolean z2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        ?? r6;
        defpackage.abru abruVar;
        boolean z3;
        boolean z4;
        int i;
        ?? r7;
        defpackage.adnp adnpVar = this;
        defpackage.abrz abrzVar = defpackage.absb.a;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (threadCurrentThread == defpackage.absb.b) {
            abryVarA = defpackage.absb.c;
            if (abryVarA == null) {
                abryVarA = abrzVar.a();
            }
        } else if (threadCurrentThread instanceof defpackage.abrp) {
            abryVarA = ((defpackage.abrp) threadCurrentThread).c;
        } else {
            java.lang.Object obj = absa.a.get();
            if (obj == null) {
                defpackage.aooh.g();
            }
            abryVarA = (defpackage.abry) obj;
        }
        long j = 8796093022207L;
        int i2 = 2;
        boolean z5 = true;
        ?? r8 = 0;
        if (abryVarA.c) {
            long j2 = abryVarA.f.get();
            jB = defpackage.abrz.b(false, false, false, -21, -21, defpackage.abrx.f(defpackage.abrx.d(j2), defpackage.abrx.a(j2, 2), defpackage.abrx.a(j2, 1), defpackage.abrx.a(j2, 0)), j2 & 8796093022207L);
        } else {
            jB = defpackage.abrz.b(false, false, false, -21, -21, android.os.Process.getThreadPriority(abryVarA.b), 0L);
        }
        defpackage.abru abruVar2 = new defpackage.abru(jB, abryVarA, ajcqVar);
        while (!ajcqVar.isDone()) {
            if (defpackage.anty.aq((java.util.concurrent.atomic.AtomicReference) adnpVar.b, abruVar2)) {
                boolean z6 = abryVarA.d;
                if (!z6) {
                    abryVarA.d = z5;
                }
                ((defpackage.abrw) adnpVar.d).a(abryVarA.a);
                long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
                android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                boolean zInterrupted = java.lang.Thread.interrupted();
                ?? r9 = z5;
                while (true) {
                    try {
                        java.lang.Runnable runnable = (java.lang.Runnable) adnpVar.c.poll();
                        if (runnable != null) {
                            try {
                                try {
                                    runnable.run();
                                    zInterrupted |= java.lang.Thread.interrupted();
                                } catch (java.lang.Throwable th) {
                                    boolean zInterrupted2 = zInterrupted | java.lang.Thread.interrupted();
                                    throw th;
                                }
                            } catch (java.lang.Error e) {
                                adnpVar.e = e;
                                adnpVar.a.execute(defpackage.ahqx.h(new absj(e, (int) r9)));
                                zInterrupted |= java.lang.Thread.interrupted();
                            } catch (java.lang.RuntimeException e2) {
                                adnpVar.e = e2;
                                adnpVar.a.execute(defpackage.ahqx.h(new yne(e2, 20)));
                                zInterrupted |= java.lang.Thread.interrupted();
                            }
                        } else if (!ajcqVar.isDone()) {
                            java.lang.String strBg = defpackage.a.bg(ajcqVar, "Expected ", " to be done, as no runnables were queued");
                            if (adnpVar.e != null) {
                                throw new java.util.concurrent.ExecutionException(strBg, (java.lang.Throwable) adnpVar.e);
                            }
                            throw new defpackage.absc(strBg);
                        }
                        j = j;
                        if (ajcqVar.isDone()) {
                            ((defpackage.abrw) adnpVar.d).a(null);
                            ((java.util.concurrent.atomic.AtomicReference) adnpVar.b).set(null);
                            abruVar2.a();
                            if (!z6) {
                                abryVarA.d = r8;
                                if (abryVarA.e) {
                                    abryVarA.e = r8;
                                    abryVarA.b();
                                }
                            }
                            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                            android.os.StrictMode.setThreadPolicy(threadPolicy);
                            r8 = r8;
                            if (!zInterrupted) {
                                break;
                            }
                            abryVarA.a.interrupt();
                            r8 = r8;
                            break;
                        }
                        j = j;
                        r9 = 1;
                    } catch (java.lang.Throwable th2) {
                        ((defpackage.abrw) adnpVar.d).a(null);
                        ((java.util.concurrent.atomic.AtomicReference) adnpVar.b).set(null);
                        abruVar2.a();
                        if (!z6) {
                            abryVarA.d = r8;
                            if (abryVarA.e) {
                                abryVarA.e = r8;
                                abryVarA.b();
                            }
                        }
                        android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                        android.os.StrictMode.setThreadPolicy(threadPolicy);
                        if (zInterrupted) {
                            abryVarA.a.interrupt();
                        }
                        throw th2;
                    }
                }
            } else {
                j = j;
                defpackage.abru abruVar3 = (defpackage.abru) ((java.util.concurrent.atomic.AtomicReference) adnpVar.b).get();
                if (abruVar3 != null) {
                    defpackage.abry abryVar = abruVar3.a;
                    if (defpackage.aooh.n(abryVar, abryVarA)) {
                        throw new java.lang.IllegalStateException("Reentrant call would deadlock!");
                    }
                    if (abryVarA == null) {
                        defpackage.aooh.i("myIdentifier");
                    }
                    defpackage.abrt abrtVar = new defpackage.abrt(abryVarA);
                    r8 = r8;
                    while (true) {
                        java.util.concurrent.atomic.AtomicReference atomicReference2 = abruVar3.c;
                        defpackage.agab agabVar = (defpackage.agab) atomicReference2.get();
                        defpackage.abrs abrsVar = defpackage.abrs.a;
                        if (agabVar != abrsVar) {
                            abrtVar.b = (defpackage.abrt) agabVar;
                            if (defpackage.anty.Q(atomicReference2, agabVar, abrtVar)) {
                                boolean z7 = r8 == true ? 1 : 0;
                                while (true) {
                                    try {
                                        java.util.concurrent.atomic.AtomicLong atomicLong = abryVarA.f;
                                        long j3 = atomicLong.get();
                                        if (atomicLong.compareAndSet(j3, defpackage.abrx.e(j3, false, false, true, 0, 0, 0L, 123))) {
                                            int iF = abryVarA.c ? defpackage.abrx.f(defpackage.abrx.d(j3), defpackage.abrx.a(j3, i2), defpackage.abrx.a(j3, 1), defpackage.abrx.a(j3, r8)) : android.os.Process.getThreadPriority(abryVarA.b);
                                            while (true) {
                                                int i3 = abruVar3.get();
                                                if ((i3 & 1) == 0 && (i3 >> 2) > iF) {
                                                    if (abruVar3.compareAndSet(i3, defpackage.abrv.a(i3, iF, true, r8, 4))) {
                                                        long jB2 = defpackage.abrz.b(false, false, false, -21, -21, iF, abruVar3.b);
                                                        if (abryVar.c) {
                                                            while (true) {
                                                                java.util.concurrent.atomic.AtomicLong atomicLong2 = abryVar.f;
                                                                long j4 = atomicLong2.get();
                                                                if ((j4 & j) == (jB2 & j)) {
                                                                    abruVar3 = abruVar3;
                                                                    if (defpackage.abrx.a(j4, r8 == true ? 1 : 0) == -21 || defpackage.abrx.a(j4, r8 == true ? 1 : 0) > (((int) (jB2 >> 43)) & 63) - 21) {
                                                                        long jE = defpackage.abrx.e(j4, false, false, false, 0, (((int) (jB2 >> 43)) & 63) - 21, 0L, 95);
                                                                        if (!defpackage.abrx.c(j4)) {
                                                                            boolean zD = defpackage.abrx.d(j4);
                                                                            z = z7 ? 1 : 0;
                                                                            try {
                                                                                atomicReference = atomicReference2;
                                                                                abruVar = abruVar2;
                                                                                long j5 = jB2;
                                                                                if (defpackage.abrx.f(zD, defpackage.abrx.a(j4, 2), defpackage.abrx.a(j4, 1), defpackage.abrx.a(j4, 0)) == defpackage.abrx.f(defpackage.abrx.d(jE), defpackage.abrx.a(jE, 2), defpackage.abrx.a(jE, 1), defpackage.abrx.a(jE, 0))) {
                                                                                    if (atomicLong2.compareAndSet(j4, jE)) {
                                                                                        r6 = 0;
                                                                                        z2 = z;
                                                                                        i = 2;
                                                                                        z4 = true;
                                                                                        r7 = r6;
                                                                                        z3 = z2;
                                                                                    }
                                                                                } else if (atomicLong2.compareAndSet(j4, defpackage.abrx.e(jE, false, true, false, 0, 0, 0L, 125))) {
                                                                                    i = 2;
                                                                                    z4 = true;
                                                                                    r7 = 0;
                                                                                    abryVar.a(defpackage.abrx.f(defpackage.abrx.d(j4), defpackage.abrx.a(j4, 2), defpackage.abrx.a(j4, 1), defpackage.abrx.a(j4, 0)));
                                                                                    z3 = z;
                                                                                }
                                                                                z7 = z ? 1 : 0;
                                                                                atomicReference2 = atomicReference;
                                                                                abruVar2 = abruVar;
                                                                                jB2 = j5;
                                                                                r8 = 0;
                                                                            } catch (java.lang.Throwable th3) {
                                                                                th = th3;
                                                                                abryVarA.d();
                                                                                if (z) {
                                                                                    abryVarA.a.interrupt();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else if (!atomicLong2.compareAndSet(j4, jE)) {
                                                                        }
                                                                    }
                                                                    z2 = z7;
                                                                    atomicReference = atomicReference2;
                                                                    r6 = r8;
                                                                    abruVar = abruVar2;
                                                                    i = 2;
                                                                    z4 = true;
                                                                    r7 = r6;
                                                                    z3 = z2;
                                                                }
                                                            }
                                                        }
                                                        java.util.concurrent.locks.LockSupport.park(abruVar3);
                                                        if (atomicReference.get() == abrsVar) {
                                                            break;
                                                        }
                                                        z7 = z3 | (java.lang.Thread.interrupted() ? 1 : 0);
                                                        int i4 = i;
                                                        r8 = r7;
                                                        i2 = i4;
                                                        atomicReference2 = atomicReference;
                                                        abruVar2 = abruVar;
                                                        abruVar3 = abruVar3;
                                                    } else {
                                                        iF = iF;
                                                    }
                                                }
                                                abruVar3 = abruVar3;
                                                z2 = z7;
                                                atomicReference = atomicReference2;
                                                r6 = r8;
                                                abruVar = abruVar2;
                                                i = 2;
                                                z4 = true;
                                                r7 = r6;
                                                z3 = z2;
                                                java.util.concurrent.locks.LockSupport.park(abruVar3);
                                                if (atomicReference.get() == abrsVar) {
                                                    break;
                                                    break;
                                                }
                                                z7 = z3 | (java.lang.Thread.interrupted() ? 1 : 0);
                                                int i5 = i;
                                                r8 = r7;
                                                i2 = i5;
                                                atomicReference2 = atomicReference;
                                                abruVar2 = abruVar;
                                                abruVar3 = abruVar3;
                                            }
                                        } else {
                                            r8 = r8 == true ? 1 : 0;
                                            i2 = i2;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        z = z7 ? 1 : 0;
                                    }
                                }
                                abryVarA.d();
                                if (z3) {
                                    abryVarA.a.interrupt();
                                }
                                int i6 = i;
                                r8 = r7;
                                i2 = i6;
                                adnpVar = this;
                                z5 = z4;
                                j = j;
                                abruVar2 = abruVar;
                            } else {
                                r8 = r8 == true ? 1 : 0 ? 1 : 0;
                                i2 = i2;
                            }
                        }
                    }
                }
                r8 = r8 == true ? 1 : 0;
                i2 = i2;
                adnpVar = this;
            }
            j = j;
            z5 = true;
        }
        defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
        return defpackage.a.h(ajcqVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void e(java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("r");
        }
        this.c.add(runnable);
    }

    public adnp(defpackage.aoin aoinVar, defpackage.aiyy aiyyVar, defpackage.aoin aoinVar2, defpackage.lbw lbwVar) {
        this.b = aoinVar;
        this.c = aiyyVar;
        this.a = aoinVar2;
        this.d = lbwVar;
    }

    public adnp(defpackage.czq czqVar) {
        this.a = czqVar;
        this.c = new defpackage.bae(this, 11);
        this.d = new defpackage.bae(this, 12);
        this.b = new defpackage.bae(this, 13);
    }

    public adnp() {
        this((defpackage.czq) cym.a);
    }

    public adnp(defpackage.ajcu ajcuVar, defpackage.ahbv ahbvVar, defpackage.aogc aogcVar) {
        this.a = new defpackage.ajwr();
        this.e = j$.util.Optional.empty();
        this.c = ajcuVar;
        this.b = ahbvVar;
        this.d = aogcVar;
    }

    public adnp(defpackage.aoin aoinVar, defpackage.aiyy aiyyVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.b = aoinVar;
        this.a = aiyyVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
    }
}
