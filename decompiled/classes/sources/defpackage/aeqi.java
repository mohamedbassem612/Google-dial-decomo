package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeqi extends defpackage.aeql {
    public static final defpackage.aeqi a = new defpackage.aeqi();

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ defpackage.albh a(java.lang.String str, java.lang.Object obj) {
        int iIntValue = ((java.lang.Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        defpackage.akzx akzxVarM = defpackage.apek.a.m();
        akzxVarM.u();
        defpackage.apek apekVar = (defpackage.apek) akzxVarM.b;
        apekVar.b |= 1;
        apekVar.c = iIntValue;
        if (str != null) {
            defpackage.apel apelVarBl = defpackage.agab.bl(str);
            akzxVarM.u();
            defpackage.apek apekVar2 = (defpackage.apek) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVarBl);
            apekVar2.d = apelVarBl;
            apekVar2.b |= 2;
        }
        return (defpackage.apek) akzxVarM.r();
    }

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2) {
        int i;
        defpackage.apek apekVar = (defpackage.apek) albhVar;
        defpackage.apek apekVar2 = (defpackage.apek) albhVar2;
        if (apekVar == null || apekVar2 == null) {
            return apekVar;
        }
        if ((apekVar.b & 1) == 0 || (i = apekVar.c - apekVar2.c) == 0) {
            return null;
        }
        defpackage.akzx akzxVarM = defpackage.apek.a.m();
        if ((apekVar.b & 2) != 0) {
            defpackage.apel apelVar = apekVar.d;
            if (apelVar == null) {
                apelVar = defpackage.apel.a;
            }
            akzxVarM.u();
            defpackage.apek apekVar3 = (defpackage.apek) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVar);
            apekVar3.d = apelVar;
            apekVar3.b |= 2;
        }
        akzxVarM.u();
        defpackage.apek apekVar4 = (defpackage.apek) akzxVarM.b;
        apekVar4.b |= 1;
        apekVar4.c = i;
        return (defpackage.apek) akzxVarM.r();
    }

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ java.lang.String c(defpackage.albh albhVar) {
        defpackage.apel apelVar = ((defpackage.apek) albhVar).d;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        return apelVar.d;
    }
}
