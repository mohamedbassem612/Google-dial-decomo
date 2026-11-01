package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuq extends defpackage.aeuo implements defpackage.aeqv {
    public final defpackage.aequ a;
    final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();
    public final defpackage.amwu c;
    public final defpackage.amwu d;
    public final defpackage.ahzi e;
    public final defpackage.aoin f;
    private final java.util.concurrent.Executor g;

    public aeuq(defpackage.gou gouVar, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.amwu amwuVar2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zzx zzxVar) {
        this.a = gouVar.D(defpackage.ajbm.INSTANCE, amwuVar, aoinVar);
        this.g = executor;
        this.c = amwuVar;
        this.d = amwuVar2;
        this.f = aoinVar2;
        this.e = defpackage.ahvr.bI(new defpackage.jvu(zzxVar, amwuVar, 9));
    }

    private final synchronized void g(defpackage.aeun aeunVar, java.lang.String str, int i) {
        if (defpackage.aeun.d(aeunVar)) {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        defpackage.aequ aequVar = this.a;
        defpackage.aevn aevnVarE = aequVar.e(str);
        int iD = aequVar.d();
        if (aevnVarE.g()) {
            defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
            return;
        }
        aeunVar.c();
        aeunVar.b = i;
        if (defpackage.aeun.d(aeunVar) || defpackage.ahvr.cp(str)) {
            new defpackage.ajdd(new java.lang.IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
        } else {
            f(str, aevnVarE, iD, aeunVar);
        }
    }

    private final synchronized void h(java.lang.String str, int i) {
        defpackage.aeun aeunVar = (defpackage.aeun) this.b.remove(str);
        if (defpackage.aeun.d(aeunVar)) {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        defpackage.aequ aequVar = this.a;
        defpackage.aevn aevnVarE = aequVar.e(str);
        int iD = aequVar.d();
        if (aevnVarE.g()) {
            defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
            return;
        }
        aeunVar.c();
        aeunVar.b = i;
        aeunVar.a();
        aeunVar.b();
        f(str, aevnVarE, iD, aeunVar);
    }

    @Override // defpackage.aeuo
    public final defpackage.aeun a() {
        return this.a.c() ? new defpackage.aeun() : defpackage.aeun.a;
    }

    @Override // defpackage.aeuo
    public final void b(defpackage.aenj aenjVar) {
        defpackage.aeun aeunVar = defpackage.aeun.a;
    }

    @Override // defpackage.aeuo
    public final void c(defpackage.aenj aenjVar) {
        if (!this.a.c()) {
            defpackage.aeun aeunVar = defpackage.aeun.a;
            return;
        }
        this.b.put(aenjVar.a, new defpackage.aeun());
    }

    @Override // defpackage.aeuo
    public final void d(defpackage.aeun aeunVar, defpackage.aenj aenjVar, int i) {
        g(aeunVar, aenjVar.a, i);
    }

    @Override // defpackage.aeuo
    public final void e(defpackage.aenj aenjVar, int i) {
        h(aenjVar.a, i);
    }

    public final void f(final java.lang.String str, final defpackage.aevn aevnVar, final int i, final defpackage.aeun aeunVar) {
        this.g.execute(new defpackage.ajdk(new defpackage.ajas() { // from class: aeup
            @Override // defpackage.ajas
            public final defpackage.ajcq a() {
                defpackage.aeuq aeuqVar = this.a;
                if (!((defpackage.aeve) aeuqVar.e.eZ()).a()) {
                    return defpackage.ajcm.a;
                }
                defpackage.aevn aevnVar2 = aevnVar;
                defpackage.aeun aeunVar2 = aeunVar;
                defpackage.ahyn ahynVar = ((defpackage.aeum) aeuqVar.c.a()).c;
                defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                int i2 = 1;
                aeqqVarA.c(true);
                aeqqVarA.d = aevnVar2;
                defpackage.ahyn ahynVar2 = (defpackage.ahyn) aeuqVar.d.a();
                defpackage.akzx akzxVarM = defpackage.apgu.a.m();
                boolean zBooleanValue = ((java.lang.Boolean) ahynVar2.a(new defpackage.aeqw(3)).d(java.lang.Boolean.FALSE)).booleanValue();
                defpackage.akzx akzxVarM2 = defpackage.apgv.a.m();
                long jB = zBooleanValue ? aeunVar2.b() : aeunVar2.a();
                akzxVarM2.u();
                defpackage.apgv apgvVar = (defpackage.apgv) akzxVarM2.b;
                apgvVar.b |= 1;
                apgvVar.c = jB;
                int i3 = aeunVar2.b;
                if (i3 != 0) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i2 = i4 != 2 ? 4 : 3;
                        } else {
                            i2 = 2;
                        }
                    }
                    akzxVarM2.u();
                    defpackage.apgv apgvVar2 = (defpackage.apgv) akzxVarM2.b;
                    apgvVar2.d = i2 - 1;
                    apgvVar2.b |= 2;
                }
                java.lang.String str2 = str;
                defpackage.apgv apgvVar3 = (defpackage.apgv) akzxVarM2.r();
                akzxVarM.u();
                defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
                j$.util.Objects.requireNonNull(apgvVar3);
                apguVar.g = apgvVar3;
                apguVar.b |= 16;
                aeqqVarA.f((defpackage.apgu) akzxVarM.r());
                aeqqVarA.a = str2;
                aeqqVarA.b = null;
                if (((java.lang.Boolean) aeuqVar.f.a()).booleanValue()) {
                    aeqqVarA.h = i;
                }
                return aeuqVar.a.a(aeqqVarA.a());
            }
        }));
    }

    @Override // defpackage.aeqv
    public final /* synthetic */ void n() {
    }
}
