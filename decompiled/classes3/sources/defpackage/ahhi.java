package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhi extends defpackage.agwm {
    private final amwu a;

    public ahhi(amwu amwuVar) {
        this.a = amwuVar;
    }

    @Override // defpackage.agwm
    public final ahyn n(aiom aiomVar) {
        ahyn ahynVarN = super.n(aiomVar);
        if (ahynVarN.f()) {
            return ahynVarN;
        }
        amwu amwuVar = this.a;
        ahyn ahynVarG = ahyn.g((com.google.apps.tiktok.account.AccountId) defpackage.akcw.a(aiomVar, defpackage.ahhh.a));
        if (!ahynVarG.f()) {
            ahor ahorVarCq = ahvr.cq(agmq.a);
            if (ahorVarCq.b()) {
                ahynVarG = ahyn.h((com.google.apps.tiktok.account.AccountId) ahorVarCq.a());
            }
        }
        return ahynVarG.f() ? ahyn.h(aizu.f(((agpq) amwuVar.a()).b((com.google.apps.tiktok.account.AccountId) ahynVarG.b()), defpackage.agpf.class, ahqx.a(new aeqw(19)), ajbm.a)) : ahwt.a;
    }
}
