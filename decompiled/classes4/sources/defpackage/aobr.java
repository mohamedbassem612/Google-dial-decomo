package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobr implements defpackage.anvr {
    final defpackage.aobs a;
    public final /* synthetic */ defpackage.aobu b;

    public aobr(defpackage.aobu aobuVar, defpackage.aobs aobsVar) {
        j$.util.Objects.requireNonNull(aobuVar);
        this.b = aobuVar;
        this.a = aobsVar;
    }

    private static final java.lang.Integer b(anph anphVar) {
        java.lang.String str = (java.lang.String) anphVar.c(defpackage.aobu.b);
        if (str == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.anvr
    public final void a(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        int i;
        int i2;
        defpackage.aobo aoboVar;
        java.lang.String string;
        defpackage.aobu aobuVar = this.b;
        synchronized (aobuVar.m) {
            defpackage.aobq aobqVar = aobuVar.r;
            defpackage.aobs aobsVar = this.a;
            aobsVar.b = true;
            java.util.Collection collection = aobqVar.c;
            if (collection.contains(aobsVar)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(collection);
                arrayList.remove(aobsVar);
                aobqVar = new defpackage.aobq(aobqVar.b, j$.util.DesugarCollections.unmodifiableCollection(arrayList), aobqVar.d, aobqVar.f, aobqVar.g, aobqVar.a, aobqVar.h, aobqVar.e);
            }
            aobuVar.r = aobqVar;
            aobuVar.q.a(anqwVar.o);
        }
        defpackage.aobu aobuVar2 = this.b;
        if (aobuVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            aobuVar2.h.execute(new defpackage.aobd(this, 5));
            return;
        }
        defpackage.aobs aobsVar2 = this.a;
        if (aobsVar2.c) {
            aobuVar2.r(aobsVar2);
            if (aobuVar2.r.f == aobsVar2) {
                aobuVar2.v(anqwVar, anvqVar, anphVar);
                return;
            }
            return;
        }
        defpackage.anvq anvqVar2 = defpackage.anvq.d;
        if (anvqVar == anvqVar2 && aobuVar2.t.incrementAndGet() > 1000) {
            aobuVar2.r(aobsVar2);
            if (aobuVar2.r.f == aobsVar2) {
                anqt anqtVar = anqt.n;
                java.nio.charset.Charset charset = anxo.a;
                anqw anqwVarA = anqtVar.a();
                java.lang.String str = anqwVar.p;
                if (str == null) {
                    string = anqwVar.o.toString();
                } else {
                    string = anqwVar.o.toString() + ": " + str;
                }
                aobuVar2.v(anqwVarA.f("Too many transparent retries. Might be a bug in gRPC: ".concat(java.lang.String.valueOf(string))).e(anqwVar.q), anvqVar, anphVar);
                return;
            }
            return;
        }
        if (aobuVar2.r.f == null) {
            if (anvqVar == anvqVar2 || (anvqVar == defpackage.anvq.b && aobuVar2.s.compareAndSet(false, true))) {
                defpackage.aobu aobuVar3 = this.b;
                defpackage.aobs aobsVar3 = this.a;
                defpackage.aobs aobsVarP = aobuVar3.p(aobsVar3.d, true, false);
                if (aobsVarP != null) {
                    if (aobuVar3.l) {
                        synchronized (aobuVar3.m) {
                            defpackage.aobq aobqVar2 = aobuVar3.r;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(aobqVar2.d);
                            arrayList2.remove(aobsVar3);
                            arrayList2.add(aobsVarP);
                            aobuVar3.r = new defpackage.aobq(aobqVar2.b, aobqVar2.c, j$.util.DesugarCollections.unmodifiableCollection(arrayList2), aobqVar2.f, aobqVar2.g, aobqVar2.a, aobqVar2.h, aobqVar2.e);
                        }
                    }
                    this.b.g.execute(new anxz(this, aobsVarP, 8));
                    return;
                }
                return;
            }
            if (anvqVar != defpackage.anvq.c) {
                aobuVar2.s.set(true);
                if (aobuVar2.l) {
                    java.lang.Integer numB = b(anphVar);
                    defpackage.aobu aobuVar4 = this.b;
                    boolean zContains = aobuVar4.k.c.contains(anqwVar.o);
                    defpackage.aobt aobtVar = aobuVar4.p;
                    boolean z = (aobtVar == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !aobtVar.b();
                    if (zContains && !z && !anqwVar.h() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            aobuVar4.u();
                        } else {
                            java.lang.Object obj = aobuVar4.m;
                            synchronized (obj) {
                                defpackage.aobo aoboVar2 = aobuVar4.y;
                                if (aoboVar2 != null) {
                                    java.util.concurrent.Future futureA = aoboVar2.a();
                                    defpackage.aobo aoboVar3 = new defpackage.aobo(obj);
                                    aobuVar4.y = aoboVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    aoboVar3.b(aobuVar4.i.schedule((java.lang.Runnable) new aaed(aobuVar4, aoboVar3, 2), numB.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    defpackage.aobu aobuVar5 = this.b;
                    synchronized (aobuVar5.m) {
                        defpackage.aobq aobqVar3 = aobuVar5.r;
                        defpackage.aobs aobsVar4 = this.a;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(aobqVar3.d);
                        arrayList3.remove(aobsVar4);
                        aobuVar5.r = new defpackage.aobq(aobqVar3.b, aobqVar3.c, j$.util.DesugarCollections.unmodifiableCollection(arrayList3), aobqVar3.f, aobqVar3.g, aobqVar3.a, aobqVar3.h, aobqVar3.e);
                        if (z2 && (aobuVar5.w(aobuVar5.r) || !aobuVar5.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    defpackage.aobv aobvVar = aobuVar2.j;
                    long j = 0;
                    if (aobvVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = aobvVar.f.contains(anqwVar.o);
                        java.lang.Integer numB2 = b(anphVar);
                        defpackage.aobt aobtVar2 = aobuVar2.p;
                        boolean z3 = (aobtVar2 == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !aobtVar2.b();
                        if (aobvVar.a <= aobsVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = aobuVar2.z;
                                    double dNextDouble = defpackage.aobu.e ? (defpackage.aobu.d.nextDouble() * 0.4d) + 0.8d : defpackage.aobu.d.nextDouble();
                                    i = 1;
                                    aobuVar2.z = java.lang.Math.min((long) (aobuVar2.z * aobvVar.d), aobvVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    aobuVar2.z = aobvVar.b;
                                    j = nanos;
                                } else {
                                    i2 = 0;
                                }
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        defpackage.aobs aobsVarP2 = aobuVar2.p(aobsVar2.d + i, false, false);
                        if (aobsVarP2 != null) {
                            java.lang.Object obj2 = aobuVar2.m;
                            synchronized (obj2) {
                                aoboVar = new defpackage.aobo(obj2);
                                aobuVar2.x = aoboVar;
                            }
                            aoboVar.b(this.b.i.schedule(new defpackage.apwa(this, aoboVar, aobsVarP2, i), j, java.util.concurrent.TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (aobuVar2.l) {
                aobuVar2.u();
            }
        }
        defpackage.aobu aobuVar6 = this.b;
        defpackage.aobs aobsVar5 = this.a;
        aobuVar6.r(aobsVar5);
        if (aobuVar6.r.f == aobsVar5) {
            aobuVar6.v(anqwVar, anvqVar, anphVar);
        }
    }

    @Override // defpackage.anvr
    public final void c(anph anphVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        defpackage.aobs aobsVar = this.a;
        int i3 = aobsVar.d;
        if (i3 > 0) {
            anpc anpcVar = defpackage.aobu.a;
            anphVar.f(anpcVar);
            anphVar.h(anpcVar, java.lang.String.valueOf(i3));
        }
        defpackage.aobu aobuVar = this.b;
        aobuVar.r(aobsVar);
        if (aobuVar.r.f == aobsVar) {
            defpackage.aobt aobtVar = aobuVar.p;
            if (aobtVar != null) {
                do {
                    atomicInteger = aobtVar.d;
                    i = atomicInteger.get();
                    i2 = aobtVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, java.lang.Math.min(aobtVar.c + i, i2)));
            }
            aobuVar.h.execute(new anxz(this, anphVar, 6));
        }
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        defpackage.aobu aobuVar = this.b;
        defpackage.aobs aobsVar = aobuVar.r.f;
        ahvr.bZ(aobsVar != null, "Headers should be received prior to messages.");
        if (aobsVar != this.a) {
            anxo.g(aodlVar);
        } else {
            aobuVar.h.execute(new anxz(this, aodlVar, 9));
        }
    }

    @Override // defpackage.aodm
    public final void e() {
        defpackage.aobu aobuVar = this.b;
        if (aobuVar.o()) {
            aobuVar.h.execute(new defpackage.aobd(this, 6, (byte[]) null));
        }
    }
}
