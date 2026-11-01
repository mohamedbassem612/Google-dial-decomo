package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jid implements defpackage.krk {
    private final rlv a;

    public jid(rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.a = rlvVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.krk
    public final void a(defpackage.krj krjVar) throws aois {
        rmx rmxVarCC;
        int iU = a.u(krjVar);
        if (iU == 0) {
            rmxVarCC = afsq.cC(((defpackage.krf) krjVar).a);
        } else if (iU == 1) {
            rmxVarCC = afsq.cB(((defpackage.kre) krjVar).a);
        } else if (iU == 2) {
            rmxVarCC = afsq.cD(((defpackage.krg) krjVar).a);
        } else if (iU == 3) {
            rmxVarCC = afsq.cF(1);
        } else {
            if (iU != 4) {
                throw new aois();
            }
            rmxVarCC = afsq.cE(((defpackage.krh) krjVar).a);
        }
        if (rmxVarCC != null) {
            this.a.o(rmxVarCC);
        }
    }
}
