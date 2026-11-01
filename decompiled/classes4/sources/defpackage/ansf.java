package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class ansf implements android.os.IBinder.DeathRecipient {
    public static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.ansf.class.getName());
    public static final anlv g = new anlv("internal:remote-uid");
    public static final anlv h = new anlv("internal:server-authority");
    public static final anlv i = new anlv("internal:inbound-parcelable-policy");
    private final aoag a;
    private final anns b;
    public final java.util.concurrent.ScheduledExecutorService j;
    protected defpackage.anlw n;
    public anqw o;
    public anth p;
    public long r;
    public long s;
    public final java.util.LinkedHashSet m = new java.util.LinkedHashSet();
    private final java.util.List c = new java.util.ArrayList();
    public int t = 1;
    public final defpackage.ansz k = new defpackage.ansz(new defpackage.ansy() { // from class: anse
        @Override // defpackage.ansy
        public final boolean a(int i2, android.os.Parcel parcel) {
            defpackage.antk antkVar;
            defpackage.aodm aodmVar;
            defpackage.ansf ansfVar = this.a;
            try {
                if (i2 < 1001) {
                    synchronized (ansfVar) {
                        try {
                            if (i2 == 1) {
                                ansfVar.i(parcel);
                            } else if (i2 == 2) {
                                ansfVar.x(anqw.l.f("transport shutdown by peer"), true);
                            } else if (i2 != 3) {
                                if (i2 == 4) {
                                    int i3 = parcel.readInt();
                                    if (ansfVar.t == 3) {
                                        try {
                                            defpackage.antl antlVarC = defpackage.antl.c();
                                            try {
                                                antlVarC.a().writeInt(i3);
                                                ansfVar.p.a(5, antlVarC);
                                                antlVarC.close();
                                            } catch (java.lang.Throwable th) {
                                                try {
                                                    antlVarC.close();
                                                    throw th;
                                                } catch (java.lang.Throwable th2) {
                                                    th.addSuppressed(th2);
                                                    throw th;
                                                }
                                            }
                                        } catch (android.os.RemoteException unused) {
                                        }
                                    }
                                } else {
                                    if (i2 != 5) {
                                        return false;
                                    }
                                    ansfVar.g(parcel);
                                }
                            } else if (ansfVar.q.a(parcel.readLong())) {
                                defpackage.ansf.f.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(ansfVar.toString()));
                                java.util.LinkedHashSet linkedHashSet = ansfVar.m;
                                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ansfVar.l;
                                linkedHashSet.addAll(concurrentHashMap.keySet());
                                java.util.Iterator it = linkedHashSet.iterator();
                                while (ansfVar.z() && it.hasNext()) {
                                    defpackage.anst anstVar = (defpackage.anst) concurrentHashMap.get(it.next());
                                    it.remove();
                                    if (anstVar != null) {
                                        synchronized (anstVar) {
                                            try {
                                                antkVar = anstVar.e;
                                                aodmVar = anstVar.g;
                                            } catch (java.lang.Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        if (aodmVar != null) {
                                            aodmVar.e();
                                        }
                                        if (antkVar != null) {
                                            try {
                                                synchronized (antkVar) {
                                                    try {
                                                        antkVar.g();
                                                    } catch (java.lang.Throwable th4) {
                                                        throw th4;
                                                    }
                                                }
                                            } catch (anqx e) {
                                                synchronized (anstVar) {
                                                    anqw anqwVar = e.a;
                                                    anstVar.h(anqwVar, anqwVar, false);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            throw th5;
                        }
                    }
                } else {
                    int iDataSize = parcel.dataSize();
                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = ansfVar.l;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                    defpackage.anst anstVarFu = (defpackage.anst) concurrentHashMap2.get(numValueOf);
                    if (anstVarFu == null) {
                        synchronized (ansfVar) {
                            try {
                                if (!ansfVar.A() && (anstVarFu = ansfVar.fu(i2)) != null) {
                                    defpackage.anst anstVar2 = (defpackage.anst) ansfVar.l.put(numValueOf, anstVarFu);
                                    ahvr.bE(anstVar2 == null, "impossible appearance of %s", anstVar2);
                                }
                            } catch (java.lang.Throwable th6) {
                                throw th6;
                            }
                        }
                    }
                    if (anstVarFu != null) {
                        anstVarFu.k(parcel);
                    }
                    long j = ansfVar.r + ((long) iDataSize);
                    ansfVar.r = j;
                    if (j - ansfVar.s > 16384) {
                        synchronized (ansfVar) {
                            anth anthVar = ansfVar.p;
                            ahvr.ci(anthVar);
                            long j2 = ansfVar.r;
                            try {
                                defpackage.antl antlVarC2 = defpackage.antl.c();
                                try {
                                    antlVarC2.a().writeLong(j2);
                                    anthVar.a(3, antlVarC2);
                                    antlVarC2.close();
                                } catch (java.lang.Throwable th7) {
                                    try {
                                        antlVarC2.close();
                                        throw th7;
                                    } catch (java.lang.Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (android.os.RemoteException e2) {
                                ansfVar.x(defpackage.ansf.u(e2), true);
                            }
                        }
                        ansfVar.s = ansfVar.r;
                    }
                }
                return true;
            } catch (java.lang.RuntimeException e3) {
                defpackage.ansf.f.logp(java.util.logging.Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.bj(i2, "Terminating transport for uncaught Exception in transaction "), (java.lang.Throwable) e3);
                synchronized (ansfVar) {
                    ansfVar.x(anqw.k.e(e3), true);
                    return false;
                }
            }
        }
    });
    protected final j$.util.concurrent.ConcurrentHashMap l = new j$.util.concurrent.ConcurrentHashMap();
    public final defpackage.anso q = new defpackage.anso();

    protected ansf(aoag aoagVar, defpackage.anlw anlwVar, anns annsVar) {
        this.a = aoagVar;
        this.n = anlwVar;
        this.b = annsVar;
        this.j = (java.util.concurrent.ScheduledExecutorService) aoagVar.a();
    }

    private final void a() {
        anth anthVar = this.p;
        if (anthVar != null) {
            try {
                anthVar.d(this);
            } catch (java.util.NoSuchElementException unused) {
            }
            try {
                defpackage.antl antlVarC = defpackage.antl.c();
                try {
                    antlVarC.a().writeInt(0);
                    this.p.a(2, antlVarC);
                    antlVarC.close();
                } catch (java.lang.Throwable th) {
                    try {
                        antlVarC.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (android.os.RemoteException unused2) {
            }
        }
    }

    public static anqw u(android.os.RemoteException remoteException) {
        return ((remoteException instanceof android.os.DeadObjectException) || (remoteException instanceof android.os.TransactionTooLargeException)) ? anqw.l.e(remoteException) : anqw.k.e(remoteException);
    }

    final boolean A() {
        return D(4) || D(5);
    }

    protected final boolean B(anth anthVar) {
        this.p = anthVar;
        try {
            anthVar.c(this);
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    final void C(int i2) {
        int i3 = this.t;
        int i4 = i2 - 1;
        if (i4 == 1) {
            ahvr.bY(i3 == 1);
        } else if (i4 == 2) {
            ahvr.bY(i3 == 1 || i3 == 2);
        } else if (i4 != 3) {
            ahvr.bY(i3 == 4);
        } else {
            ahvr.bY(i3 == 1 || i3 == 2 || i3 == 3);
        }
        this.t = i2;
    }

    public final boolean D(int i2) {
        return this.t == i2;
    }

    protected final void E(java.util.concurrent.Future future) {
        this.c.add(future);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        x(anqw.l.f("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final anns c() {
        return this.b;
    }

    protected defpackage.anst fu(int i2) {
        return null;
    }

    public abstract void j(anqw anqwVar);

    public abstract void k();

    public void p() {
        this.a.b(this.j);
    }

    protected void s(defpackage.anst anstVar) {
        y(anstVar.d);
    }

    public final synchronized defpackage.anlw t() {
        return this.n;
    }

    final void v(anth anthVar) {
        try {
            defpackage.antl antlVarC = defpackage.antl.c();
            try {
                antlVarC.a().writeInt(1);
                antlVarC.a().writeStrongBinder(this.k);
                anthVar.a(1, antlVarC);
                antlVarC.close();
            } catch (java.lang.Throwable th) {
                try {
                    antlVarC.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (android.os.RemoteException e) {
            x(u(e), true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    final void w(int i2, defpackage.antl antlVar) throws anqx {
        int iDataSize = antlVar.a().dataSize();
        try {
            this.p.a(i2, antlVar);
            if (this.q.b(iDataSize)) {
                f.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (android.os.RemoteException e) {
            throw new anqx(u(e), (anph) null);
        }
    }

    public final void x(anqw anqwVar, boolean z) {
        if (!A()) {
            this.o = anqwVar;
            C(4);
            j(anqwVar);
        }
        if (D(5)) {
            return;
        }
        if (z || this.l.isEmpty()) {
            this.k.a = null;
            C(5);
            a();
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.l;
            java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            java.util.List list = this.c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
            list.clear();
            this.j.execute(new abb(this, arrayList, anqwVar, arrayList2, 15, (short[]) null));
        }
    }

    final void y(int i2) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap.remove(java.lang.Integer.valueOf(i2)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.j.execute(new defpackage.alvr(this, 9));
    }

    final boolean z() {
        return !this.q.a;
    }

    public void fv() {
    }

    protected void g(android.os.Parcel parcel) {
    }

    protected void i(android.os.Parcel parcel) {
    }
}
