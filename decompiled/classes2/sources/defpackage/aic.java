package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aic extends cmv implements dat {
    public agf a;
    public agg b;
    public ahc c;
    public defpackage.ett d;

    public aic(defpackage.ett ettVar, agf agfVar, agg aggVar, ahc ahcVar) {
        this.d = ettVar;
        this.a = agfVar;
        this.b = aggVar;
        this.c = ahcVar;
    }

    public final void o(dbm dbmVar) {
        dbmVar.D();
        defpackage.ett ettVar = this.d;
        agb agbVar = new agb(this, 6);
        ahc ahcVar = this.c;
        cer cerVarC = ettVar.c(agbVar, ahcVar.j() ? new cqg(ahcVar.d) : null, null, new defpackage.aib(this, 0));
        ahc ahcVar2 = this.c;
        long jD = ((cqg) cerVarC.a()).a;
        ahcVar2.n = jD;
        if (ahcVar2.k()) {
            ahy ahyVar = ahcVar2.a;
            if (ahyVar.i()) {
                agp agpVarC = ahcVar2.c();
                agp agpVar = agp.c;
                if (agpVarC == agpVar && ahcVar2.g().k()) {
                    jD = ((cqg) ahcVar2.g().d()).a;
                } else if (ahcVar2.c() == agpVar || ahcVar2.c() == agp.d) {
                    jD = ahyVar.d();
                }
            }
        }
        long j = jD;
        if (ahcVar2.k()) {
            ahcVar2.d = j;
        }
        if (cqg.a(j) != 0.0f) {
            afs afsVar = this.a.b;
            afs afsVar2 = this.b.b;
            den.J(dbmVar, j, 0L, 0.0f, (cqh) null, 126);
        }
    }

    public final /* synthetic */ void m() {
    }
}
