package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoud extends defpackage.aoul implements defpackage.aoub {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoud(defpackage.aoub aoubVar) {
        defpackage.aoul aoulVarE;
        super(true);
        boolean z = true;
        K(aoubVar);
        defpackage.aosg aosgVarH = H();
        defpackage.aosh aoshVar = aosgVarH instanceof defpackage.aosh ? (defpackage.aosh) aosgVarH : null;
        if (aoshVar == null || (aoulVarE = aoshVar.e()) == null) {
            z = false;
            break;
        }
        while (!aoulVarE.fD()) {
            defpackage.aosg aosgVarH2 = aoulVarE.H();
            defpackage.aosh aoshVar2 = aosgVarH2 instanceof defpackage.aosh ? (defpackage.aosh) aosgVarH2 : null;
            if (aoshVar2 == null || (aoulVarE = aoshVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.aoul
    public final boolean fB() {
        return true;
    }

    @Override // defpackage.aoul
    public final boolean fD() {
        return this.a;
    }
}
