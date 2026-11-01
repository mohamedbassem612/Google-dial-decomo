package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anrx extends defpackage.ansf implements defpackage.anwc {
    private final aprf A;
    public final java.util.concurrent.Executor a;
    public final anrt b;
    public final defpackage.anrw c;
    public anzt d;
    public java.util.concurrent.ScheduledFuture e;
    private final aoag u;
    private final java.util.concurrent.atomic.AtomicInteger v;
    private final long w;
    private final boolean x;
    private int y;
    private final defpackage.antw z;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public anrx(anrz anrzVar, anrk anrkVar, defpackage.anvu anvuVar) {
        aoag aoagVar = anrzVar.c;
        defpackage.anlw anlwVar = anvuVar.b;
        android.content.Context context = anrzVar.a;
        anrq anrqVar = anrzVar.g;
        defpackage.anlw anlwVar2 = defpackage.anlw.a;
        defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
        anttVar.c(defpackage.anxi.a, defpackage.anqj.a);
        anttVar.c(defpackage.anxi.b, anlwVar);
        anttVar.c(defpackage.annh.b, anrk.b(context));
        anttVar.c(defpackage.annh.a, anrkVar);
        anttVar.c(i, anrqVar);
        super(aoagVar, anttVar.a(), anns.a(defpackage.anrx.class, anrzVar.a.getClass().getSimpleName() + "->" + java.lang.String.valueOf(anrkVar)));
        this.y = 1001;
        aoag aoagVar2 = anrzVar.d;
        this.u = aoagVar2;
        this.b = anrzVar.e;
        this.a = aoagVar2.a();
        this.w = 60000L;
        java.lang.Boolean bool = (java.lang.Boolean) anvuVar.b.a(anrl.c);
        this.x = bool != null ? bool.booleanValue() : false;
        this.A = new aprf(this);
        this.v = new java.util.concurrent.atomic.AtomicInteger();
        ahzp ahzpVar = ahzp.a;
        this.z = new defpackage.antw();
        this.c = new defpackage.ants(anrzVar.b, anrzVar.a, anrkVar.a.cloneFilter(), anrkVar.b, anrzVar.f.b, this);
    }

    private static defpackage.anvp F(anqw anqwVar, defpackage.anlw anlwVar, anmg[] anmgVarArr) {
        defpackage.aodj.h(anmgVarArr, anlwVar).a();
        return new defpackage.anwy(anqwVar, anmgVarArr);
    }

    public final ajcq a(int i) {
        anrm anrmVar = this.b;
        return anrmVar instanceof anrm ? anrmVar.b(i) : aiql.D(new lqh(this, i, 12), this.a);
    }

    public final synchronized defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.anvp anvpVarF;
        try {
            try {
                try {
                    if (D(3)) {
                        int i = this.y;
                        int i2 = i + 1;
                        this.y = i2;
                        if (i2 == 16777215) {
                            this.y = 1001;
                        }
                        defpackage.aodj aodjVarH = defpackage.aodj.h(anmgVarArr, this.n);
                        defpackage.ansp anspVar = new defpackage.ansp(this, this.n, i, anxo.i(anmbVar));
                        if (this.l.putIfAbsent(java.lang.Integer.valueOf(i), anspVar) == null) {
                            if (anspVar.a && this.v.getAndIncrement() == 0) {
                                this.d.a(true);
                            }
                            defpackage.anti antiVar = new defpackage.anti(this, i, anpkVar, anphVar, aodjVarH);
                            anvpVarF = anpkVar.a.a() ? new defpackage.antu(anspVar, antiVar) : new defpackage.antc(anspVar, antiVar);
                        } else {
                            anqw anqwVarF = anqw.k.f("Clashing call IDs");
                            x(anqwVarF, true);
                            anvpVarF = F(anqwVarF, this.n, anmgVarArr);
                        }
                    } else {
                        anvpVarF = F(A() ? this.o : anqw.k.f("newStream() before transportReady()"), this.n, anmgVarArr);
                    }
                    return anvpVarF;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    public final synchronized java.lang.Runnable d(anzt anztVar) {
        this.d = anztVar;
        return new defpackage.alvr(this, 7);
    }

    public final synchronized void e(anqw anqwVar) {
        if (D(2)) {
            if (!anqwVar.h()) {
                x(anqwVar, true);
                return;
            }
            java.lang.Object obj = this.A.a;
            ((defpackage.ansf) obj).C(3);
            anzt anztVar = ((defpackage.anrx) obj).d;
            defpackage.anlw anlwVar = ((defpackage.anrx) obj).n;
            anztVar.h();
            ((defpackage.anrx) obj).n = anlwVar;
            ((defpackage.anrx) obj).d.b();
            java.util.concurrent.ScheduledFuture scheduledFuture = ((defpackage.anrx) obj).e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                ((defpackage.anrx) obj).e = null;
            }
        }
    }

    public final synchronized void f(java.lang.Throwable th) {
        x(anqw.k.f("Could not evaluate SecurityPolicy").e(th), true);
    }

    @Override // defpackage.ansf
    protected final void g(android.os.Parcel parcel) {
        parcel.readInt();
        this.z.k();
    }

    public final synchronized void h(anqw anqwVar) {
        if (D(2)) {
            if (anqwVar.h()) {
                this.c.a();
            } else {
                x(anqwVar, true);
            }
        }
    }

    @Override // defpackage.ansf
    protected final void i(android.os.Parcel parcel) {
        if (D(2)) {
            if (parcel.readInt() != 1) {
                x(anqw.l.f("Wire format version mismatch"), true);
                return;
            }
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                x(anqw.l.f("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            if (!B(anth.e(strongBinder, this.a))) {
                x(anqw.l.f("Failed to observe outgoing binder"), true);
                return;
            }
            java.lang.Object obj = this.A.a;
            defpackage.ansf ansfVar = (defpackage.ansf) obj;
            defpackage.ansz anszVar = ansfVar.k;
            int callingUid = android.os.Binder.getCallingUid();
            defpackage.ansy ansyVar = anszVar.a;
            if (ansyVar != null) {
                anszVar.a = new defpackage.antx(callingUid, java.util.logging.Logger.getLogger(anty.class.getName()), ansyVar);
            }
            defpackage.anrx anrxVar = (defpackage.anrx) obj;
            defpackage.antt anttVar = new defpackage.antt(anrxVar.n);
            anttVar.c(g, java.lang.Integer.valueOf(callingUid));
            anttVar.c(defpackage.anxi.a, callingUid == android.os.Process.myUid() ? defpackage.anqj.c : defpackage.anqj.b);
            anrxVar.n = anttVar.a();
            ajcq ajcqVarA = anrxVar.a(callingUid);
            ansfVar.E(ajcqVarA);
            aiql.I(ajcqVarA, new uwo(anrxVar, 20, (byte[]) null), anrxVar.a);
        }
    }

    @Override // defpackage.ansf
    public final void j(anqw anqwVar) {
        this.d.c(anqwVar, defpackage.aodh.UNKNOWN);
    }

    @Override // defpackage.ansf
    public final void k() {
        if (this.v.getAndSet(0) > 0) {
            this.d.a(false);
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        ((defpackage.ants) this.c).c(anqw.c);
        this.d.d();
    }

    public final synchronized void l(android.os.IBinder iBinder) {
        ((defpackage.ansf) this.A.a).v(anth.e(iBinder, this.a));
    }

    public final synchronized void m() {
        if (D(2)) {
            this.e = null;
            long j = this.w;
            x(anqw.e.f("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    public final synchronized void n(anqw anqwVar) {
        x(anqwVar, true);
    }

    public final synchronized void o() {
        if (D(1)) {
            C(2);
            try {
                boolean z = this.x;
                defpackage.anrw anrwVar = this.c;
                if (z) {
                    android.content.pm.PackageManager packageManager = ((defpackage.ants) anrwVar).d().getPackageManager();
                    android.content.Intent intent = ((defpackage.ants) anrwVar).a;
                    android.content.pm.ResolveInfo resolveInfoResolveService = packageManager.resolveService(intent, 268435456);
                    if (resolveInfoResolveService == null) {
                        throw new anqx(anqw.j.f("resolveService(" + java.lang.String.valueOf(intent) + " / " + java.lang.String.valueOf(((defpackage.ants) anrwVar).b) + ") was null"), (anph) null);
                    }
                    ajcq ajcqVarA = a(resolveInfoResolveService.serviceInfo.applicationInfo.uid);
                    E(ajcqVarA);
                    aiql.I(ajcqVarA, new uwo(this, 19), this.a);
                } else {
                    anrwVar.a();
                }
                this.e = this.j.schedule(new defpackage.alvr(this, 6), this.w, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (anqx e) {
                x(e.a, true);
            }
        }
    }

    @Override // defpackage.ansf
    public final void p() {
        super.p();
        this.u.b(this.a);
    }

    public final synchronized void q(anqw anqwVar) {
        ahvr.cj(anqwVar, "reason");
        x(anqwVar, false);
    }

    public final synchronized void r(anqw anqwVar) {
        ahvr.cj(anqwVar, "reason");
        x(anqwVar, true);
    }

    @Override // defpackage.ansf
    protected final void s(defpackage.anst anstVar) {
        if (anstVar.e() && this.v.decrementAndGet() == 0) {
            this.d.a(false);
        }
        super.s(anstVar);
    }
}
