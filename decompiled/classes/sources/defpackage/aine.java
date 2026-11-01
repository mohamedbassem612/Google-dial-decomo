package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aine implements defpackage.ainm, defpackage.aiom {
    private static final java.lang.String a = new java.lang.String();
    public final long b;
    public defpackage.aind c;
    public defpackage.ainu d;
    private final java.util.logging.Level e;
    private defpackage.ainh f;
    private defpackage.aipn g;
    private java.lang.Object[] h;

    protected aine(java.util.logging.Level level) {
        long jB = defpackage.aipl.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        defpackage.aiql.l(level, "level");
        this.e = level;
        this.b = jB;
    }

    private final void Z(java.lang.String str, java.lang.Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj instanceof adno) {
                objArr[i] = java.lang.Integer.valueOf(j$.util.Collection.-EL.stream(((adno) obj).a).mapToInt(new rar(15)).sum());
            }
        }
        if (str != a) {
            this.g = new defpackage.aipn(a(), str);
        }
        defpackage.aiqs aiqsVarK = defpackage.aipl.k();
        if (!aiqsVarK.a()) {
            defpackage.aior aiorVarN = n();
            defpackage.ainp ainpVar = defpackage.ainc.h;
            defpackage.aiqs aiqsVar = (defpackage.aiqs) aiorVarN.d(ainpVar);
            if (aiqsVar != null && !aiqsVar.a()) {
                aiqsVarK = aiqsVarK.a() ? aiqsVar : new defpackage.aiqs(new defpackage.aiqq(aiqsVarK.c, aiqsVar.c));
            }
            s(ainpVar, aiqsVarK);
        }
        defpackage.aimp aimpVarC = c();
        try {
            defpackage.airf airfVar = (defpackage.airf) defpackage.airf.a.get();
            int i2 = airfVar.b + 1;
            airfVar.b = i2;
            if (i2 == 0) {
                throw new java.lang.AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    aimpVarC.a.a(this);
                } else {
                    defpackage.aimp.f("unbounded recursion in log statement", this);
                }
                if (airfVar != null) {
                    airfVar.close();
                }
            } catch (java.lang.Throwable th) {
                if (airfVar != null) {
                    try {
                        airfVar.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.RuntimeException e) {
            try {
                aimpVarC.a.c(e, this);
            } catch (defpackage.aioo e2) {
                throw e2;
            } catch (java.lang.RuntimeException e3) {
                defpackage.aimp.f(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(java.lang.System.err);
                } catch (java.lang.RuntimeException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean aa() {
        ainy ainyVarB;
        int i;
        defpackage.aind aindVar;
        defpackage.ainh ainhVarA = this.f;
        if (ainhVarA == null) {
            ainhVarA = defpackage.aipl.g().a(defpackage.aine.class, 1);
            this.f = ainhVarA;
        }
        if (ainhVarA != defpackage.ainh.a) {
            ainyVarB = this.f;
            defpackage.aind aindVar2 = this.c;
            if (aindVar2 != null && aindVar2.b > 0) {
                defpackage.aiql.l(ainyVarB, "logSiteKey");
                int i2 = aindVar2.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (defpackage.ainc.f.equals(aindVar2.c(i3))) {
                        java.lang.Object objE = aindVar2.e(i3);
                        ainyVarB = objE instanceof ainn ? ((ainn) objE).b() : new ainy(ainyVarB, objE);
                    }
                }
            }
        } else {
            ainyVarB = null;
        }
        boolean zB = b(ainyVarB);
        defpackage.ainu ainuVar = this.d;
        if (ainuVar == null) {
            return zB;
        }
        defpackage.aint aintVar = (defpackage.aint) defpackage.aint.a.b(ainyVarB, this.c);
        int iIncrementAndGet = aintVar.c.incrementAndGet();
        if (ainuVar == defpackage.ainu.c || !aintVar.b.compareAndSet(false, true)) {
            i = -1;
        } else {
            try {
                ainuVar.a();
                aintVar.b.set(false);
                aintVar.c.addAndGet(-iIncrementAndGet);
                i = iIncrementAndGet - 1;
            } catch (java.lang.Throwable th) {
                aintVar.b.set(false);
                throw th;
            }
        }
        if (zB && i > 0 && (aindVar = this.c) != null) {
            aindVar.f(defpackage.ainc.e, java.lang.Integer.valueOf(i));
        }
        return (zB ? 1 : 0) & ((i ^ (-1)) >>> 31);
    }

    @Override // defpackage.ainm
    public final void A(java.lang.String str, int i, long j) {
        if (aa()) {
            Z(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ainm
    public final void B(java.lang.String str, int i, java.lang.Object obj) {
        if (aa()) {
            Z(str, java.lang.Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.ainm
    public final void C(java.lang.String str, int i, boolean z) {
        if (aa()) {
            Z(str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ainm
    public final void D(java.lang.String str, long j, long j2) {
        if (aa()) {
            Z(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        }
    }

    @Override // defpackage.ainm
    public final void E(java.lang.String str, long j, java.lang.Object obj) {
        if (aa()) {
            Z(str, java.lang.Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ainm
    public final void F(java.lang.String str, java.lang.Object obj, float f) {
        if (aa()) {
            Z(str, obj, java.lang.Float.valueOf(f));
        }
    }

    @Override // defpackage.ainm
    public final void G(java.lang.String str, java.lang.Object obj, int i) {
        if (aa()) {
            Z(str, obj, java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ainm
    public final void H(java.lang.String str, java.lang.Object obj, long j) {
        if (aa()) {
            Z(str, obj, java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ainm
    public final void I(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (aa()) {
            Z(str, obj, obj2);
        }
    }

    @Override // defpackage.ainm
    public final void J(java.lang.String str, java.lang.Object obj, boolean z) {
        if (aa()) {
            Z(str, obj, java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ainm
    public final void K(java.lang.String str, boolean z, java.lang.Object obj) {
        if (aa()) {
            Z(str, java.lang.Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.ainm
    public final void L(java.lang.String str, boolean z, boolean z2) {
        if (aa()) {
            Z(str, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.ainm
    public final void M(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (aa()) {
            Z(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ainm
    public final void N(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (aa()) {
            Z(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ainm
    public final void O(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (aa()) {
            Z(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ainm
    public final void P(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        if (aa()) {
            Z(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.ainm
    public final void Q(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        if (aa()) {
            Z(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.ainm
    public final void R(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object... objArr) {
        if (aa()) {
            int length = objArr.length;
            java.lang.Object[] objArr2 = new java.lang.Object[11];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            java.lang.System.arraycopy(objArr, 0, objArr2, 10, 1);
            Z(str, objArr2);
        }
    }

    @Override // defpackage.ainm
    public final void S(java.lang.String str, java.lang.Object[] objArr) {
        if (aa()) {
            Z(str, java.util.Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.ainm
    public final boolean T() {
        return U() || c().g(this.e);
    }

    @Override // defpackage.aiom
    public final boolean U() {
        return this.c != null && java.lang.Boolean.TRUE.equals(this.c.d(defpackage.ainc.g));
    }

    @Override // defpackage.aiom
    public final java.lang.Object[] V() {
        if (this.g == null) {
            throw new java.lang.IllegalStateException("cannot get arguments unless a template context exists");
        }
        java.lang.Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new java.lang.IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.ainm
    public final void W(float f, float f2) {
        if (aa()) {
            Z("Consumed gesture at %f %f", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
        }
    }

    @Override // defpackage.ainm
    public final void X(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        if (aa()) {
            Z("Download stopped: %s, %s%s%s%s%s%s, size: %s", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.ainm
    public final void Y(boolean z, int i) {
        if (aa()) {
            Z("Unexpected eligibility source from DB - eligibility: %s, source: %d", java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
        }
    }

    protected abstract defpackage.aira a();

    protected boolean b(defpackage.aini ainiVar) {
        throw null;
    }

    protected abstract defpackage.aimp c();

    protected abstract defpackage.ainm d();

    @Override // defpackage.aiom
    public final long e() {
        return this.b;
    }

    @Override // defpackage.aiom
    public final defpackage.ainh f() {
        defpackage.ainh ainhVar = this.f;
        if (ainhVar != null) {
            return ainhVar;
        }
        throw new java.lang.IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.ainm
    public final defpackage.ainm g(int i, java.util.concurrent.TimeUnit timeUnit) {
        if (U()) {
            return d();
        }
        defpackage.ainp ainpVar = defpackage.ainc.d;
        defpackage.ainj ainjVar = defpackage.aimu.a;
        s(ainpVar, new defpackage.aimt(i, timeUnit));
        return d();
    }

    @Override // defpackage.ainm
    public final defpackage.ainm h(int i) {
        defpackage.ainp ainpVar = defpackage.ainc.b;
        if (U()) {
            return d();
        }
        s(ainpVar, java.lang.Integer.valueOf(i));
        return d();
    }

    @Override // defpackage.ainm
    public final defpackage.ainm i(defpackage.ainp ainpVar) {
        return j(ainpVar, java.lang.Boolean.TRUE);
    }

    @Override // defpackage.ainm
    public final defpackage.ainm j(defpackage.ainp ainpVar, java.lang.Object obj) {
        defpackage.aiql.l(ainpVar, "metadata key");
        if (obj != null) {
            s(ainpVar, obj);
        }
        return d();
    }

    @Override // defpackage.ainm
    public final defpackage.ainm k(java.lang.Throwable th) {
        return j(defpackage.ainc.a, th);
    }

    @Override // defpackage.ainm
    public final defpackage.ainm l(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        defpackage.ainh ainhVar = defpackage.ainh.a;
        defpackage.aing aingVar = new defpackage.aing(str, str2, i, str3);
        if (this.f == null) {
            this.f = aingVar;
        }
        return d();
    }

    @Override // defpackage.ainm
    public final defpackage.ainm m(defpackage.aioa aioaVar) {
        if (aioaVar != defpackage.aioa.NONE) {
            s(defpackage.ainc.i, aioaVar);
        }
        return d();
    }

    @Override // defpackage.aiom
    public final defpackage.aior n() {
        defpackage.aind aindVar = this.c;
        return aindVar == null ? defpackage.aioq.a : aindVar;
    }

    @Override // defpackage.aiom
    public final defpackage.aipn o() {
        return this.g;
    }

    @Override // defpackage.aiom
    public final java.lang.Object p() {
        if (this.g != null) {
            throw new java.lang.IllegalStateException("cannot get literal argument if a template context exists");
        }
        java.lang.Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new java.lang.IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.aiom
    public final java.lang.String q() {
        return c().a.d();
    }

    @Override // defpackage.aiom
    public final java.util.logging.Level r() {
        return this.e;
    }

    protected final void s(defpackage.ainp ainpVar, java.lang.Object obj) {
        defpackage.aind aindVar = this.c;
        if (aindVar == null) {
            aindVar = new defpackage.aind();
            this.c = aindVar;
        }
        aindVar.f(ainpVar, obj);
    }

    @Override // defpackage.ainm
    public final void t() {
        if (aa()) {
            Z(a, "");
        }
    }

    @Override // defpackage.ainm
    public final void u(java.lang.Object obj) {
        if (aa()) {
            Z("%s", obj);
        }
    }

    @Override // defpackage.ainm
    public final void v(java.lang.String str) {
        if (aa()) {
            Z(a, str);
        }
    }

    @Override // defpackage.ainm
    public final void w(java.lang.String str, int i) {
        if (aa()) {
            Z(str, java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ainm
    public final void x(java.lang.String str, long j) {
        if (aa()) {
            Z(str, java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ainm
    public final void y(java.lang.String str, java.lang.Object obj) {
        if (aa()) {
            Z(str, obj);
        }
    }

    @Override // defpackage.ainm
    public final void z(java.lang.String str, int i, int i2) {
        if (aa()) {
            Z(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }
}
