package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nzh implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker");
    public final defpackage.ajct b;
    public final nzg c;
    public final nzm d;

    public nzh(defpackage.ajct ajctVar, nzg nzgVar, nzm nzmVar) {
        this.b = ajctVar;
        this.c = nzgVar;
        this.d = nzmVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "startWork", 49, "EligibilityExpansionDatabaseWorker.java")).v("starting work");
        nzm nzmVar = this.d;
        defpackage.aoin aoinVar = nzmVar.e;
        acvm acvmVarA = acvn.a();
        acvmVarA.b((java.lang.String) aoinVar.a());
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(nzmVar.f.G(acvmVarA.a()), new ibe(14), nzmVar.c);
        defpackage.ajcq ajcqVarA = this.c.a();
        defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarI, ajcqVarA);
        jsr jsrVar = new jsr(this, ajcqVarI, ajcqVarA, 11);
        defpackage.ajct ajctVar = this.b;
        return defpackage.ahrv.g(ahdaVarAk.p(jsrVar, ajctVar)).h(new defpackage.lix(18), ajctVar).e(java.lang.Exception.class, new defpackage.lix(19), ajctVar);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
