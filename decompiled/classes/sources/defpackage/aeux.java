package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeux extends defpackage.aeuv implements defpackage.aeqv {
    public final defpackage.aequ a;
    public final defpackage.amwu b;
    private final defpackage.ahzi c;
    private final defpackage.aoin d;
    private final defpackage.ajcu e;

    public aeux(defpackage.gou gouVar, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.e = ajcuVar;
        this.b = amwuVar;
        this.d = aoinVar3;
        this.a = gouVar.D(ajcuVar, amwuVar, aoinVar);
        this.c = defpackage.ahvr.bI(new defpackage.aeuw(gouVar, ajcuVar, amwuVar, aoinVar2, 0));
    }

    @Override // defpackage.aeuv
    public final void a(defpackage.aphg aphgVar, java.lang.String str, defpackage.apev apevVar, defpackage.aevn aevnVar) {
        if (aphgVar.d.size() == 0) {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", 79, "TraceMetricServiceImpl.java")).v("Invalid traces were logged.");
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
        defpackage.akzx akzxVarM = defpackage.apgu.a.m();
        akzxVarM.u();
        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
        j$.util.Objects.requireNonNull(aphgVar);
        apguVar.n = aphgVar;
        apguVar.b |= 2048;
        aeqqVarA.f((defpackage.apgu) akzxVarM.r());
        if (apevVar != null) {
            aeqqVarA.b = apevVar;
        }
        defpackage.aequ aequVar = null;
        if (((java.lang.Boolean) this.d.a()).booleanValue() && aphgVar.m.size() > 0) {
            aequVar = (defpackage.aequ) this.c.eZ();
        }
        defpackage.aequ aequVar2 = aequVar;
        defpackage.aihd aihdVar = (defpackage.aihd) j$.util.Collection.-EL.stream(aphgVar.d).filter(new zun(6)).map(new adci(11)).collect(defpackage.aido.b);
        long j = aphgVar.c;
        defpackage.aiql.E(new vuh(this, aequVar2, aeqqVarA, aevnVar, str, aihdVar, 5), this.e);
    }

    @Override // defpackage.aeqv
    public final /* synthetic */ void n() {
    }
}
