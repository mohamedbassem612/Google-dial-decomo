package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xmb implements defpackage.xjz, emx {
    public aoss d;
    public defpackage.xly f;
    public long b = -1;
    private final aoir a = aooc.ag(new defpackage.wsn(this, 11));
    public final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.List h = new java.util.ArrayList();
    public final defpackage.xhn i = new defpackage.xhn();

    public xmb() {
        new defpackage.xlz();
    }

    public static /* synthetic */ java.lang.Object m(defpackage.xmb xmbVar, android.os.PersistableBundle persistableBundle, aoln aolnVar) {
        j$.time.Duration durationB = xmbVar.a().b();
        if (!xmbVar.l()) {
            return o(xmbVar, new defpackage.xhm("Task execution started before it was created."), null, 4);
        }
        java.lang.Object objB = xmbVar.a().a().b(persistableBundle);
        xmbVar.a();
        defpackage.xhn xhnVar = xmbVar.i;
        xhnVar.a();
        defpackage.xly xlyVar = xmbVar.f;
        if (xlyVar != null) {
            if (xmbVar == null) {
                aooh.i("token");
            }
            aooh.f(xhnVar, "metadata");
            xlyVar.b.e.put(xmbVar.f(), xhnVar);
        }
        return xmbVar.g(durationB, new nhv(xmbVar, objB, (aoln) null, 9), aolnVar);
    }

    public static /* synthetic */ defpackage.xmq o(defpackage.xmb xmbVar, defpackage.xhl xhlVar, defpackage.xmn xmnVar, int i) {
        if ((i & 4) != 0) {
            xmnVar = defpackage.xmn.UNSPECIFIED;
        }
        return xmbVar.n(xhlVar, xmnVar);
    }

    public final ems P() {
        return e();
    }

    public abstract defpackage.xkq a();

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xhx
    public final long d() {
        return this.b;
    }

    public final defpackage.xmh e() {
        return (defpackage.xmh) this.a.a();
    }

    public abstract java.lang.Object eq(java.lang.Object obj, aoln aolnVar);

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r0 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (aoov.aj(r2, r3, r8) == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (aoov.aj(r2, r3, r8) == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        if (aoov.aj(r2, r3, r8) != r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013c, code lost:
    
        if (aoov.aj(r0, r3, r8) == r9) goto L47;
     */
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object g(j$.time.Duration r18, aonj r19, aoln r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmb.g(j$.time.Duration, aonj, aoln):java.lang.Object");
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return a().getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return a().getNodeName();
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    public final aoss h() {
        aoss aossVar = this.d;
        if (aossVar != null) {
            return aossVar;
        }
        throw new java.lang.IllegalStateException("LifecycleScope is not initialized!");
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final void i() {
        k(false);
        e().e(emp.ON_STOP);
        e().e(emp.ON_DESTROY);
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    public final void j(aoub aoubVar) {
        this.h.add(aoubVar);
    }

    public final void k(boolean z) {
        if (z) {
            e().e(emp.ON_START);
        } else {
            e().e(emp.ON_STOP);
        }
    }

    public final boolean l() {
        return this.f != null;
    }

    protected final defpackage.xmq n(defpackage.xhl xhlVar, defpackage.xmn xmnVar) {
        aooh.f(xmnVar, "failureReason");
        defpackage.xhf resultDecoder = a().getResultDecoder();
        defpackage.xhn xhnVar = this.i;
        defpackage.xkq xkqVarA = a();
        long j = this.b;
        if (true == xhnVar.b()) {
            xhnVar = null;
        }
        return new defpackage.xmm(resultDecoder, xkqVarA, j, null, xhnVar, xhlVar, xmnVar);
    }

    public java.lang.Object p(defpackage.xfz xfzVar) {
        defpackage.xpz xpzVar;
        defpackage.xly xlyVar = this.f;
        if (xlyVar == null || (xpzVar = xlyVar.f) == null || !xpzVar.e(390390338L)) {
            defpackage.xox.c("OnboardingTask(" + defpackage.xfh.a(this) + ')', a.bm((byte) 41, this, xfzVar, "Unhandled interrupt with reason ", " ("));
            return aojh.a;
        }
        if (!a().c(xfzVar)) {
            defpackage.xox.c("OnboardingTask(" + defpackage.xfh.a(this) + ')', a.bm((byte) 41, this, xfzVar, "Unexpected interrupt with reason ", " ("));
            return aojh.a;
        }
        if (xfzVar == defpackage.xfz.RESULT_NO_LONGER_NEEDED || xfzVar == defpackage.xfz.USER_CANCELLED) {
            java.util.Objects.toString(xfzVar);
            this.g.set(new java.lang.IllegalStateException("Interrupted with reason ".concat(xfzVar.toString())));
            return aojh.a;
        }
        defpackage.xox.c("OnboardingTask(" + defpackage.xfh.a(this) + ')', a.bm((byte) 41, this, xfzVar, "Unhandled interrupt with reason ", " ("));
        return aojh.a;
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final java.lang.Object q(android.os.PersistableBundle persistableBundle) {
        java.lang.Object objP;
        java.util.Map map = defpackage.xnf.a;
        aooh.f(persistableBundle, "interrupt");
        defpackage.xfz xfzVar = defpackage.xfz.USER_CANCELLED;
        defpackage.xgk xgkVarD = defpackage.xer.d(persistableBundle);
        defpackage.xpb xpbVar = (defpackage.xpb) defpackage.xnf.a.get(xgkVarD);
        if (xpbVar != null) {
            if (aooh.n(persistableBundle.keySet(), xgkVarD.toPersistableBundle().keySet())) {
                defpackage.xox.e("TaskInterruptDecoder", a.bg(xgkVarD, "Interrupt ", " has no data"));
            } else {
                try {
                    defpackage.xgk xgkVar = (defpackage.xgk) xpbVar.c(persistableBundle);
                    if (xgkVar.a() != xgkVarD) {
                        defpackage.xox.e("TaskInterruptDecoder", a.bi(xgkVarD, xgkVar, "Decoded interrupt ", " does not have reason "));
                    } else {
                        xgkVarD = xgkVar;
                    }
                } catch (java.lang.RuntimeException e) {
                    java.util.Objects.toString(xgkVarD);
                    defpackage.xox.f("TaskInterruptDecoder", "Failed to decode interrupt ".concat(xgkVarD.toString()), e);
                }
            }
            xgkVarD = null;
        }
        if (xgkVarD != null) {
            if (xgkVarD instanceof defpackage.xfz) {
                objP = p((defpackage.xfz) xgkVarD);
                if (objP != aolu.a) {
                    objP = aojh.a;
                }
            } else {
                defpackage.xox.c("OnboardingTask(" + defpackage.xfh.a(this) + ')', a.bm((byte) 41, this, xgkVarD, "Unhandled interrupt ", " ("));
                objP = aojh.a;
            }
            return objP != aolu.a ? aojh.a : objP;
        }
        defpackage.xfz xfzVarD = defpackage.xer.d(persistableBundle);
        defpackage.xox.c("OnboardingTask(" + defpackage.xfh.a(this) + ')', "Dropping interrupt with reason " + xfzVarD + " that could not be decoded (" + this + ')');
        return aojh.a;
    }

    public final java.lang.String toString() {
        return "OnboardingTask(" + defpackage.xfh.a(this) + ')';
    }
}
