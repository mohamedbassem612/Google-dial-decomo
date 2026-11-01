package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class akxe {
    protected final defpackage.akxy a;

    protected akxe(defpackage.akxy akxyVar) {
        this.a = akxyVar;
    }

    public abstract ajcq a(defpackage.alfr alfrVar, defpackage.akxw akxwVar, defpackage.akxt akxtVar);

    protected final defpackage.akxx d(int i, int i2) {
        return e(i, j$.util.Optional.of(java.lang.Integer.valueOf(i2)));
    }

    public final defpackage.akxx e(int i, j$.util.Optional optional) {
        akzx akzxVarM = defpackage.akxz.a.m();
        akzxVarM.u();
        defpackage.akxz akxzVar = (defpackage.akxz) akzxVarM.b;
        akxzVar.c = i - 1;
        akxzVar.b |= 1;
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.akxd akxdVar = new defpackage.akxd(akzxVarM, 0);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = akxdVar.a;
            int iIntValue = ((java.lang.Integer) obj).intValue();
            akzx akzxVar = (akzx) obj2;
            akzxVar.u();
            defpackage.akxz akxzVar2 = (defpackage.akxz) akzxVar.b;
            akxzVar2.b |= 2;
            akxzVar2.d = iIntValue;
        }
        akzx akzxVarM2 = defpackage.akxx.a.m();
        int iA = this.a.a();
        akzxVarM2.u();
        defpackage.akxx akxxVar = (defpackage.akxx) akzxVarM2.b;
        akxxVar.b |= 1;
        akxxVar.c = iA;
        akzxVarM2.u();
        defpackage.akxx akxxVar2 = (defpackage.akxx) akzxVarM2.b;
        defpackage.akxz akxzVar3 = (defpackage.akxz) akzxVarM.p();
        j$.util.Objects.requireNonNull(akxzVar3);
        akxxVar2.d = akxzVar3;
        akxxVar2.b |= 2;
        return (defpackage.akxx) akzxVarM2.p();
    }
}
