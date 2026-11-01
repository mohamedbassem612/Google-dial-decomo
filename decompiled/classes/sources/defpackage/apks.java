package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apks implements java.lang.Cloneable, defpackage.apif {
    public final defpackage.apje a;
    public final defpackage.apjh b;
    public volatile defpackage.apis c;
    public final defpackage.apkr d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public defpackage.apkt f;
    public boolean g;
    public defpackage.apkl h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public volatile boolean n;
    public volatile defpackage.apkl o;
    public final java.util.concurrent.CopyOnWriteArrayList p;
    public defpackage.apko q;
    private final defpackage.apkv r;
    private java.lang.Object s;

    static {
        defpackage.aooh.e(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.apks.class, defpackage.apis.class, "c"), "newUpdater(...)");
    }

    public apks(defpackage.apje apjeVar, defpackage.apjh apjhVar) {
        this.a = apjeVar;
        this.b = apjhVar;
        this.r = (defpackage.apkv) apjeVar.B.a;
        java.lang.Object obj = apjeVar.z.a;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        this.c = (defpackage.apis) obj;
        defpackage.apkr apkrVar = new defpackage.apkr(this);
        apkrVar.f(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.d = apkrVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean();
        this.m = true;
        this.p = new java.util.concurrent.CopyOnWriteArrayList();
        new java.util.concurrent.atomic.AtomicReference(apjhVar.f);
    }

    private final java.io.IOException j(java.io.IOException iOException) {
        java.io.IOException iOException2;
        java.io.InterruptedIOException interruptedIOException;
        java.net.Socket socketE;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apkt apktVar = this.f;
        if (apktVar != null) {
            synchronized (apktVar) {
                socketE = e();
            }
            if (this.f == null) {
                if (socketE != null) {
                    defpackage.apjx.h(socketE);
                }
                defpackage.apis apisVar = this.c;
            } else if (socketE != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
        if (this.g || !this.d.e()) {
            iOException2 = iOException;
        } else {
            interruptedIOException = new java.io.InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2 = interruptedIOException;
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        }
        iOException2 = interruptedIOException;
        defpackage.apis apisVar2 = this.c;
        if (iOException != null) {
            defpackage.aooh.c(iOException2);
            defpackage.aooh.f(iOException2, "ioe");
        }
        return iOException2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aplp, java.lang.Object] */
    @Override // defpackage.apif
    public final void a() {
        if (this.n) {
            return;
        }
        this.n = true;
        defpackage.apkl apklVar = this.o;
        if (apklVar != null) {
            apklVar.c.g();
        }
        java.util.Iterator it = this.p.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.apkz) it.next()).f();
        }
        defpackage.apis apisVar = this.c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[DONT_INVERT, PHI: r7
      0x0024: PHI (r7v3 boolean) = (r7v0 boolean), (r7v5 boolean), (r7v0 boolean), (r7v0 boolean) binds: [B:8:0x000f, B:18:0x0023, B:14:0x001b, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0026 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x002e A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0032 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0046  */
    /* JADX WARN: Code duplicated, block: B:38:0x0049 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:20:0x0026, B:22:0x002a, B:24:0x002e, B:26:0x0032, B:27:0x0034, B:29:0x0038, B:31:0x003c, B:33:0x0040, B:38:0x0049, B:10:0x0013, B:13:0x0019, B:16:0x001f), top: B:60:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0050  */
    public final java.io.IOException b(defpackage.apkl apklVar, boolean z, boolean z2, boolean z3, boolean z4, java.io.IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (!defpackage.aooh.n(apklVar, this.o)) {
            return iOException;
        }
        synchronized (this) {
            z5 = false;
            if (z) {
                if (this.i) {
                    if (z) {
                        this.i = false;
                    }
                    if (z2) {
                        this.j = false;
                    }
                    if (z4) {
                        this.k = false;
                    }
                    if (z3) {
                        this.l = false;
                    }
                    if (!this.i || this.j || this.k || this.l) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7 || this.m) {
                        z5 = z7;
                        z6 = false;
                    } else {
                        z5 = z7;
                        z6 = true;
                    }
                }
            }
            if ((z2 && this.j) || (z4 && this.k)) {
                if (z) {
                    this.i = false;
                }
                if (z2) {
                    this.j = false;
                }
                if (z4) {
                    this.k = false;
                }
                if (z3) {
                    this.l = false;
                }
                if (this.i) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z7) {
                    z5 = z7;
                    z6 = false;
                } else {
                    z5 = z7;
                    z6 = false;
                }
            } else if (z3 && this.l) {
                z3 = true;
                if (z) {
                    this.i = false;
                }
                if (z2) {
                    this.j = false;
                }
                if (z4) {
                    this.k = false;
                }
                if (z3) {
                    this.l = false;
                }
                if (this.i) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z7) {
                    z5 = z7;
                    z6 = false;
                } else {
                    z5 = z7;
                    z6 = false;
                }
            } else {
                z6 = false;
            }
        }
        if (z5) {
            this.o = null;
            defpackage.apkt apktVar = this.f;
            if (apktVar != null) {
                synchronized (apktVar) {
                    apktVar.k++;
                }
            }
        }
        return z6 ? j(iOException) : iOException;
    }

    public final java.io.IOException c(java.io.IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.m) {
                this.m = false;
                if (!this.i && !this.j && !this.k && !this.l) {
                    z = true;
                }
            }
        }
        return z ? j(iOException) : iOException;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return new defpackage.apks(this.a, this.b);
    }

    public final java.lang.String d() {
        return this.b.a.e();
    }

    public final java.net.Socket e() {
        defpackage.apkt apktVar = this.f;
        defpackage.aooh.c(apktVar);
        java.util.TimeZone timeZone = defpackage.apjx.a;
        java.util.List list = apktVar.m;
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (defpackage.aooh.n(((java.lang.ref.Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.f = null;
        if (!list.isEmpty()) {
            return null;
        }
        apktVar.n = java.lang.System.nanoTime();
        defpackage.apkv apkvVar = this.r;
        defpackage.aooh.f(apktVar, "connection");
        if (!apktVar.h) {
            apkvVar.a();
            return null;
        }
        apktVar.i();
        j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (j$.util.concurrent.ConcurrentLinkedQueue) apkvVar.d;
        concurrentLinkedQueue.remove(apktVar);
        if (concurrentLinkedQueue.isEmpty()) {
            ((defpackage.apkb) apkvVar.c).a();
        }
        return apktVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    public final defpackage.apjm f() throws java.lang.Throwable {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.apje apjeVar = this.a;
        defpackage.ajsz.bv(arrayList, apjeVar.d);
        arrayList.add(new defpackage.aplt());
        arrayList.add(new defpackage.aplj());
        arrayList.add(new defpackage.apjy());
        arrayList.add(defpackage.apke.a);
        defpackage.ajsz.bv(arrayList, apjeVar.e);
        arrayList.add(defpackage.apll.a);
        defpackage.apjh apjhVar = this.b;
        try {
            defpackage.apjm apjmVarA = new defpackage.aplr(this, arrayList, 0, null, apjhVar, apjeVar.v, apjeVar.w, apjeVar.x, apjeVar.g, apjeVar.t, apjeVar.B, apjeVar.i, apjeVar.j, apjeVar.s, apjeVar.k, apjeVar.m, apjeVar.l, apjeVar.f, apjeVar.n, apjeVar.o, apjeVar.p, apjeVar.u).a(apjhVar);
            if (this.n) {
                defpackage.apjv.j(apjmVarA);
                throw new java.io.IOException("Canceled");
            }
            c(null);
            return apjmVarA;
        } catch (java.io.IOException e) {
            try {
                java.io.IOException iOExceptionC = c(e);
                if (iOExceptionC == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionC;
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    c(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                c(null);
            }
            throw th;
        }
    }

    public final void g(defpackage.apkt apktVar) {
        if (apktVar == null) {
            defpackage.aooh.i("connection");
        }
        java.util.TimeZone timeZone = defpackage.apjx.a;
        if (this.f != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f = apktVar;
        apktVar.m.add(new defpackage.apkq(this, this.s));
    }

    public final void h() {
        defpackage.apnn apnnVar = defpackage.apnn.b;
        android.util.CloseGuard closeGuard = new android.util.CloseGuard();
        baa$.ExternalSyntheticApiModelOutline1.m(closeGuard, "response.body().close()");
        this.s = closeGuard;
        defpackage.apis apisVar = this.c;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [aplp, java.lang.Object] */
    public final void i(boolean z) {
        defpackage.apkl apklVar;
        synchronized (this) {
            if (!this.m) {
                throw new java.lang.IllegalStateException("released");
            }
        }
        if (z && (apklVar = this.o) != null) {
            apklVar.c.g();
            ((defpackage.apks) apklVar.b).b(apklVar, true, true, true, true, null);
        }
        this.h = null;
    }
}
