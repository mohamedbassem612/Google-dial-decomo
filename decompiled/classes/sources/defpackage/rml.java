package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rml implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ rml(defpackage.adnr adnrVar, defpackage.adnq adnqVar, defpackage.adop adopVar, int i) {
        this.$cid = i;
        this.b = adnrVar;
        this.a = adnqVar;
        this.c = adopVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v29, types: [adop, java.lang.Object] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.amnr amnrVar = (defpackage.amnr) obj;
            defpackage.akzx akzxVar = (defpackage.akzx) this.c;
            akzxVar.u();
            defpackage.ampv ampvVar = (defpackage.ampv) akzxVar.b;
            defpackage.ampv ampvVar2 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amnrVar);
            ampvVar.A = amnrVar;
            ampvVar.c |= 2048;
            defpackage.alad aladVarR = akzxVar.r();
            defpackage.rmo rmoVar = (defpackage.rmo) this.a;
            defpackage.zzc zzcVarH = rmoVar.a.h(aladVarR, rmoVar.F());
            defpackage.rmx rmxVar = (defpackage.rmx) this.b;
            zzcVarH.m(rmxVar.Bo);
            rmoVar.c.d(zzcVarH);
            rmoVar.b.o(rmxVar);
            return null;
        }
        if (i == 1) {
            java.lang.Throwable th = (java.lang.Throwable) obj;
            jrs jrsVar = new jrs(this.a, 18);
            j$.util.Optional optional = (j$.util.Optional) this.b;
            if (true == optional.isPresent()) {
                java.lang.Object obj2 = optional.get();
                ((defpackage.jyy) jrsVar.a).d.q((defpackage.aeun) obj2, defpackage.ruc.D, defpackage.rub.c);
            }
            ?? r11 = this.c;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "loadForAllCallsInConversationHistory", (char) 198, "CoalescedRowsDao.java")).v("Unable to load coalesced rows for conversation history.");
            r11.run();
            return j$.util.Optional.empty();
        }
        if (i == 2) {
            defpackage.amnr amnrVar2 = (defpackage.amnr) obj;
            defpackage.akzx akzxVar2 = (defpackage.akzx) this.c;
            akzxVar2.u();
            defpackage.ampv ampvVar3 = (defpackage.ampv) akzxVar2.b;
            defpackage.ampv ampvVar4 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amnrVar2);
            ampvVar3.A = amnrVar2;
            ampvVar3.c |= 2048;
            defpackage.alad aladVarR2 = akzxVar2.r();
            defpackage.rmo rmoVar2 = (defpackage.rmo) this.a;
            defpackage.zzc zzcVarH2 = rmoVar2.a.h(aladVarR2, rmoVar2.F());
            defpackage.rmx rmxVar2 = (defpackage.rmx) this.b;
            zzcVarH2.m(rmxVar2.Bo);
            rmoVar2.c.d(zzcVarH2);
            rmoVar2.b.o(rmxVar2);
            return null;
        }
        if (i == 3) {
            defpackage.amnr amnrVar3 = (defpackage.amnr) obj;
            defpackage.akzx akzxVar3 = (defpackage.akzx) this.c;
            akzxVar3.u();
            defpackage.ampv ampvVar5 = (defpackage.ampv) akzxVar3.b;
            defpackage.ampv ampvVar6 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amnrVar3);
            ampvVar5.A = amnrVar3;
            ampvVar5.c |= 2048;
            defpackage.alad aladVarR3 = akzxVar3.r();
            defpackage.rmo rmoVar3 = (defpackage.rmo) this.a;
            defpackage.zzc zzcVarH3 = rmoVar3.a.h(aladVarR3, rmoVar3.F());
            defpackage.rmw rmwVar = (defpackage.rmw) this.b;
            zzcVarH3.m(rmwVar.lo);
            rmoVar3.c.d(zzcVarH3);
            rmoVar3.b.n(rmwVar);
            return null;
        }
        if (i == 4) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            if (bool == null) {
                throw new java.lang.IllegalArgumentException();
            }
            java.lang.Object obj3 = this.c;
            if (bool.booleanValue()) {
                return obj3;
            }
            return (defpackage.aigf) j$.util.Collection.-EL.stream(((defpackage.aigf) obj3).keySet()).collect(defpackage.aido.b(new rat(15), new pei(this.b, 16)));
        }
        ?? r12 = this.c;
        java.lang.Object obj4 = this.a;
        java.lang.Object obj5 = this.b;
        synchronized (obj4) {
            if (!((defpackage.adnq) obj4).e) {
                ((defpackage.adqn) ((defpackage.adnr) obj5).b.a()).i(r12);
                ((defpackage.adnq) obj4).e = true;
            }
        }
        return java.lang.Boolean.TRUE;
    }

    public /* synthetic */ rml(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rml(defpackage.jyy jyyVar, j$.util.Optional optional, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = jyyVar;
        this.b = optional;
        this.c = runnable;
    }
}
