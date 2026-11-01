package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agqv implements agxi {
    public final ahyn a;
    public final java.util.concurrent.Executor b;
    private final apjb c;

    public agqv(apjb apjbVar, ahyn ahynVar, java.util.concurrent.Executor executor) {
        this.c = apjbVar;
        this.a = ahynVar;
        this.b = executor;
    }

    public final ajbg a() {
        apjb apjbVar = this.c;
        agpb agpbVar = (agpb) apjbVar.a;
        ajcq ajcqVarC = agpbVar.c();
        defpackage.agpe agpeVar = new defpackage.agpe(apjbVar, 0);
        ajbm ajbmVar = ajbm.a;
        ajcq ajcqVarI = ahvr.I(ajcqVarC, agpeVar, ajbmVar);
        ajcq ajcqVarH = ahvr.H(agpbVar.c(), new aeqw(16), ajbmVar);
        return new ajbg(aiql.ab(new ajcq[]{ajcqVarI, ajcqVarH}).c(ahqx.b(new vto(this, ajcqVarI, ajcqVarH, 13)), this.b));
    }

    public final ajcq b() {
        return ((agpb) this.c.a).a();
    }

    public final java.lang.Object e() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
