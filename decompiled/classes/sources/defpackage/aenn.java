package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aenn implements defpackage.aenm {
    private final defpackage.aent a;
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aogc i;

    public aenn(defpackage.aent aentVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aogc aogcVar) {
        this.a = aentVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
        this.g = aoinVar6;
        this.h = aoinVar7;
        this.i = aogcVar;
        java.lang.Boolean.FALSE.booleanValue();
        if (android.util.Log.isLoggable("PrimesApiImpl", 3)) {
            android.util.Log.d("PrimesApiImpl", "Primes instant initialization");
        }
        try {
            defpackage.ahns.t(false);
            java.util.Iterator it = ((java.util.Set) aoinVar.a()).iterator();
            while (it.hasNext()) {
                ((defpackage.aeqv) it.next()).n();
            }
        } catch (java.lang.RuntimeException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", (char) 136, "PrimesApiImpl.java")).v("Primes failed to initialize");
            defpackage.aent aentVar2 = this.a;
            if (aentVar2.a) {
                return;
            }
            aentVar2.a = true;
        }
    }

    @Override // defpackage.aenm
    public final defpackage.aeun a() {
        return ((defpackage.aeuo) this.g.a()).a();
    }

    @Override // defpackage.aenm
    public final void b(defpackage.aenj aenjVar) {
        ((defpackage.aeuo) this.g.a()).b(aenjVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoin, java.lang.Object] */
    @Override // defpackage.aenm
    public final void c() {
        defpackage.aogc aogcVar = this.i;
        if (((java.util.concurrent.atomic.AtomicBoolean) aogcVar.c).getAndSet(true)) {
            return;
        }
        ((defpackage.aerl) ((defpackage.ahys) aogcVar.b).a.a()).k();
        ((defpackage.aetd) ((defpackage.ahys) aogcVar.a).a.a()).a();
    }

    @Override // defpackage.aenm
    public final void d(defpackage.aenj aenjVar) {
        ((defpackage.aeqd) this.d.a()).k(aenjVar);
    }

    @Override // defpackage.aenm
    public final void e(aeto aetoVar) {
        ((defpackage.aetq) this.f.a()).a(aetoVar);
    }

    @Override // defpackage.aenm
    public final void f(defpackage.aenj aenjVar) {
        ((defpackage.aeqd) this.d.a()).l(aenjVar);
    }

    @Override // defpackage.aenm
    public final void g(defpackage.aenj aenjVar) {
        ((defpackage.aeuo) this.g.a()).c(aenjVar);
    }

    @Override // defpackage.aenm
    public final void h() {
        ((defpackage.aetd) this.e.a()).a();
    }

    @Override // defpackage.aenm
    public final boolean i() {
        return ((defpackage.aetn) this.c.a()).b();
    }

    @Override // defpackage.aenm
    public final void j(defpackage.aenj aenjVar, long j, long j2) {
        defpackage.aeuq aeuqVar = (defpackage.aeuq) this.h.a();
        defpackage.aeun aeunVar = new defpackage.aeun(j, j2);
        defpackage.aequ aequVar = aeuqVar.a;
        java.lang.String str = aenjVar.a;
        defpackage.aevn aevnVarE = aequVar.e(str);
        int iD = aequVar.d();
        if (aevnVarE.g()) {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
        } else {
            aeuqVar.f(str, aevnVarE, iD, aeunVar);
        }
    }

    @Override // defpackage.aenm
    public final void k(defpackage.aenj aenjVar) {
        ((defpackage.aetd) this.e.a()).b(aenjVar);
    }

    @Override // defpackage.aenm
    public final void l(defpackage.aenj aenjVar) {
        ((defpackage.aeqd) this.d.a()).m(aenjVar);
    }

    @Override // defpackage.aenm
    public final void m(defpackage.aenj aenjVar, int i) {
        ((defpackage.aeuo) this.g.a()).e(aenjVar, i);
    }

    @Override // defpackage.aenm
    public final void n(defpackage.aeun aeunVar, defpackage.aenj aenjVar, int i) {
        ((defpackage.aeuo) this.g.a()).d(aeunVar, aenjVar, i);
    }
}
