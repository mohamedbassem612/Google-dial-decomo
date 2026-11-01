package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agzm implements defpackage.ahgu {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agzm(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ahgu
    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.amdx amdxVar = (defpackage.amdx) obj;
                afec.c();
                ahvr.cj(amdxVar.a, "LocalSubscriptionStateReference was destroyed twice.");
                ahyn ahynVar = ((defpackage.agzr) amdxVar.a).b;
                if (ahynVar.f()) {
                    ahynVar.b().cancel(false);
                }
                amdxVar.a = null;
                return;
            }
            return;
        }
        aca acaVar = (aca) obj;
        for (defpackage.agzw agzwVar : acaVar.values()) {
            afec.c();
            ahvr.bY(!agzwVar.d);
            defpackage.agzv agzvVar = agzwVar.b;
            if (agzvVar != null) {
                agzwVar.f.v(agzvVar.a, agzvVar);
                agzwVar.b.close();
                agzwVar.b = null;
            }
            agzwVar.d = true;
        }
        acaVar.clear();
    }
}
