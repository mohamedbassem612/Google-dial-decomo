package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acmn implements defpackage.aclr {
    private final defpackage.acln a;

    public acmn(defpackage.acln aclnVar) {
        this.a = aclnVar;
    }

    @Override // defpackage.aclr
    public final defpackage.ajcq a(defpackage.aclv aclvVar) {
        if (aclvVar instanceof defpackage.acni) {
            defpackage.acni acniVar = (defpackage.acni) aclvVar;
            defpackage.acmi acmiVarA = acniVar.a();
            defpackage.apdi apdiVar = defpackage.acmp.a;
            acmiVarA.c(apdiVar);
            defpackage.akzs akzsVar = acmiVarA.n;
            defpackage.alac alacVar = (defpackage.alac) apdiVar.a;
            if (akzsVar.l(alacVar)) {
                defpackage.acmi acmiVarA2 = acniVar.a();
                acmiVarA2.c(apdiVar);
                java.lang.Object objJ = acmiVarA2.n.j(alacVar);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                defpackage.acmo acmoVar = (defpackage.acmo) objJ;
                int iAS = defpackage.a.aS(acmoVar.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i = iAS - 1;
                if (i == 1) {
                    if ((acmoVar.b & 1) != 0) {
                        return new defpackage.ajcm(defpackage.acln.a(acmoVar.c));
                    }
                    throw new java.lang.IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return new defpackage.ajcm(new defpackage.acln(3, null));
                }
                if (i == 3) {
                    return new defpackage.ajcm(new defpackage.acln(2, null));
                }
                if (i == 4) {
                    return new defpackage.ajcm(this.a);
                }
                throw new java.lang.IllegalArgumentException("Unknown type");
            }
        }
        return defpackage.ajcm.a;
    }
}
