package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvo extends ajsz {
    public static final double a;
    private static final java.util.logging.Logger m = java.util.logging.Logger.getLogger(defpackage.anvo.class.getName());
    public final defpackage.anpk b;
    public final java.util.concurrent.Executor c;
    public final anve d;
    public final defpackage.anmv e;
    public defpackage.anvi f;
    public anmb g;
    public defpackage.anvp j;
    public final java.util.concurrent.ScheduledExecutorService k;
    public anmy l = anmy.b;
    private final boolean n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private final anys r;

    static {
        "gzip".getBytes(java.nio.charset.Charset.forName("US-ASCII"));
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        a = 1.0E9d;
    }

    public anvo(defpackage.anpk anpkVar, java.util.concurrent.Executor executor, anmb anmbVar, anys anysVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, anve anveVar) {
        anmk anmkVar = anmk.a;
        this.b = anpkVar;
        java.lang.String str = anpkVar.b;
        java.lang.System.identityHashCode(this);
        int i = defpackage.aoik.a;
        if (executor == ajbm.a) {
            this.c = new defpackage.aobz();
            this.n = true;
        } else {
            this.c = new defpackage.aocd(executor);
            this.n = false;
        }
        this.d = anveVar;
        this.e = defpackage.anmv.k();
        defpackage.anpj anpjVar = anpkVar.a;
        this.o = anpjVar == defpackage.anpj.a || anpjVar == defpackage.anpj.c;
        this.g = anmbVar;
        this.r = anysVar;
        this.k = scheduledExecutorService;
    }

    public static final void d(anty antyVar, anqw anqwVar, anph anphVar) {
        try {
            antyVar.a(anqwVar, anphVar);
        } catch (java.lang.RuntimeException e) {
            m.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (java.lang.Throwable) e);
        }
    }

    private final void e(java.lang.Object obj) {
        ahvr.bZ(this.j != null, "Not started");
        ahvr.bZ(!this.p, "call was cancelled");
        ahvr.bZ(!this.q, "call was half-closed");
        try {
            defpackage.anvp anvpVar = this.j;
            if (anvpVar instanceof defpackage.aobu) {
                defpackage.aobu aobuVar = (defpackage.aobu) anvpVar;
                defpackage.aobq aobqVar = aobuVar.r;
                if (aobqVar.a) {
                    aobqVar.f.a.n(aobuVar.f.a(obj));
                } else {
                    aobuVar.s(new defpackage.aobk(aobuVar, obj));
                }
            } else {
                anvpVar.n(this.b.a(obj));
            }
            if (this.o) {
                return;
            }
            this.j.d();
        } catch (java.lang.Error e) {
            this.j.c(anqw.c.f("Client sendMessage() failed with Error"));
            throw e;
        } catch (java.lang.RuntimeException e2) {
            this.j.c(anqw.c.e(e2).f("Failed to stream message"));
        }
    }

    public final void a(anty antyVar, anph anphVar) {
        defpackage.anvp aobuVar;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        anmb anmbVar;
        int i = defpackage.aoik.a;
        ahvr.bZ(this.j == null, "Already started");
        ahvr.bZ(!this.p, "call was cancelled");
        ahvr.cj(antyVar, "observer");
        ahvr.cj(anphVar, "headers");
        defpackage.anmv anmvVar = this.e;
        if (anmvVar.i()) {
            this.j = defpackage.aoaf.a;
            this.c.execute(new defpackage.anvh(this, antyVar));
            return;
        }
        anmb anmbVar2 = this.g;
        anma anmaVar = defpackage.anzq.a;
        defpackage.anzq anzqVar = (defpackage.anzq) anmbVar2.f(anmaVar);
        if (anzqVar != null) {
            java.lang.Long l = anzqVar.b;
            if (l != null) {
                anmw anmwVarC = anmw.c(l.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS);
                anmw anmwVar = this.g.b;
                if (anmwVar == null || anmwVarC.a(anmwVar) < 0) {
                    this.g = this.g.b(anmwVarC);
                }
            }
            java.lang.Boolean bool = anzqVar.c;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                anmb anmbVar3 = this.g;
                if (zBooleanValue) {
                    anlz anlzVarA = anmb.a(anmbVar3);
                    anlzVarA.e = java.lang.Boolean.TRUE;
                    anmbVar = new anmb(anlzVarA);
                } else {
                    anlz anlzVarA2 = anmb.a(anmbVar3);
                    anlzVarA2.e = java.lang.Boolean.FALSE;
                    anmbVar = new anmb(anlzVarA2);
                }
                this.g = anmbVar;
            }
            java.lang.Integer num = anzqVar.d;
            if (num != null) {
                anmb anmbVar4 = this.g;
                java.lang.Integer num2 = anmbVar4.e;
                if (num2 != null) {
                    this.g = anmbVar4.c(java.lang.Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = anmbVar4.c(num.intValue());
                }
            }
            java.lang.Integer num3 = anzqVar.e;
            if (num3 != null) {
                anmb anmbVar5 = this.g;
                java.lang.Integer num4 = anmbVar5.f;
                if (num4 != null) {
                    this.g = anmbVar5.d(java.lang.Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = anmbVar5.d(num3.intValue());
                }
            }
        }
        anmj anmjVar = anmh.a;
        anmy anmyVar = this.l;
        anphVar.f(anxo.g);
        anphVar.f(anxo.c);
        anpc anpcVar = anxo.d;
        anphVar.f(anpcVar);
        byte[] bArr = anmyVar.c;
        if (bArr.length != 0) {
            anphVar.h(anpcVar, bArr);
        }
        anphVar.f(anxo.e);
        anphVar.f(anxo.f);
        anmw anmwVarC2 = c();
        boolean z = anmwVarC2 != null && anmwVarC2.equals(anmvVar.b());
        defpackage.anvi anviVar = new defpackage.anvi(this, anmwVarC2, z);
        this.f = anviVar;
        if (anmwVarC2 == null || anviVar.c > 0) {
            anys anysVar = this.r;
            defpackage.anpk anpkVar = this.b;
            anmb anmbVar6 = this.g;
            anzg anzgVar = anysVar.b;
            if (anzgVar.R) {
                defpackage.anzq anzqVar2 = (defpackage.anzq) anmbVar6.f(anmaVar);
                aobuVar = new defpackage.aobu(anysVar, anpkVar, anphVar, anmbVar6, anzqVar2 == null ? null : anzqVar2.f, anzqVar2 != null ? anzqVar2.g : null, anmvVar);
            } else {
                anmg[] anmgVarArrK = anxo.k(anmbVar6, 0, false, false);
                defpackage.anmv anmvVarA = anmvVar.a();
                try {
                    aobuVar = anzgVar.z.b(anpkVar, anphVar, anmbVar6, anmgVarArrK);
                    anmvVar.f(anmvVarA);
                } catch (java.lang.Throwable th) {
                    anmvVar.f(anmvVarA);
                    throw th;
                }
            }
            this.j = aobuVar;
        } else {
            anmg[] anmgVarArrK2 = anxo.k(this.g, 0, false, false);
            java.lang.String str = true != z ? "CallOptions" : "Context";
            java.lang.Long l2 = (java.lang.Long) this.g.f(anmg.f);
            double d = this.f.c;
            double d2 = a;
            this.j = new defpackage.anwy(anqw.e.f(java.lang.String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, java.lang.Double.valueOf(d / d2), java.lang.Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), anmgVarArrK2);
        }
        if (this.n) {
            this.j.f();
        }
        java.lang.Integer num5 = this.g.e;
        if (num5 != null) {
            this.j.k(num5.intValue());
        }
        java.lang.Integer num6 = this.g.f;
        if (num6 != null) {
            this.j.l(num6.intValue());
        }
        if (anmwVarC2 != null) {
            this.j.i(anmwVarC2);
        }
        this.j.h(anmjVar);
        this.j.j(this.l);
        this.d.b();
        this.j.m(new defpackage.anvn(this, antyVar));
        defpackage.anvi anviVar2 = this.f;
        if (anviVar2.e) {
            return;
        }
        if (anviVar2.b && !anviVar2.a && (scheduledExecutorService = anviVar2.f.k) != null) {
            anviVar2.d = scheduledExecutorService.schedule(new defpackage.anyl(anviVar2), anviVar2.c, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        anviVar2.f.e.d(anviVar2, ajbm.a);
        if (anviVar2.e) {
            anviVar2.c();
        }
    }

    public final anmw c() {
        anmw anmwVar = this.g.b;
        anmw anmwVarB = this.e.b();
        if (anmwVar != null) {
            if (anmwVarB == null) {
                return anmwVar;
            }
            anmwVar.d(anmwVarB);
            if (true == anmwVar.e(anmwVarB)) {
                return anmwVar;
            }
        }
        return anmwVarB;
    }

    public final boolean du() {
        if (this.q) {
            return false;
        }
        return this.j.o();
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        int i = defpackage.aoik.a;
        if (str == null && th == null) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Cancelled without a message or cause");
            m.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (java.lang.Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.p) {
            return;
        }
        this.p = true;
        try {
            if (this.j != null) {
                anqw anqwVar = anqw.c;
                anqw anqwVarF = str != null ? anqwVar.f(str) : anqwVar.f("Call cancelled without message");
                if (th != null) {
                    anqwVarF = anqwVarF.e(th);
                }
                this.j.c(anqwVarF);
            }
        } finally {
            defpackage.anvi anviVar = this.f;
            if (anviVar != null) {
                anviVar.c();
            }
        }
    }

    public final void dw() {
        int i = defpackage.aoik.a;
        ahvr.bZ(this.j != null, "Not started");
        ahvr.bZ(!this.p, "call was cancelled");
        ahvr.bZ(!this.q, "call already half-closed");
        this.q = true;
        this.j.e();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public final void dx(int i) {
        int i2 = defpackage.aoik.a;
        ahvr.bZ(this.j != null, "Not started");
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "Number requested must be non-negative");
        this.j.g(i);
    }

    public final void dy(java.lang.Object obj) {
        int i = defpackage.aoik.a;
        e(obj);
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("method", this.b);
        return ahymVarL.toString();
    }
}
