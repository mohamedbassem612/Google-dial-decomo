package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeqm extends defpackage.aeql {
    public static final defpackage.aeqm a = new defpackage.aeqm();

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStatsM = aa$.ExternalSyntheticApiModelOutline1.m(obj);
        defpackage.akzx akzxVarM = defpackage.apep.a.m();
        int iBi = (int) defpackage.agab.bi(healthStatsM, 50001);
        if (iBi != 0) {
            akzxVarM.u();
            defpackage.apep apepVar = (defpackage.apep) akzxVarM.b;
            apepVar.b |= 1;
            apepVar.c = iBi;
        }
        int iBi2 = (int) defpackage.agab.bi(healthStatsM, 50002);
        if (iBi2 != 0) {
            akzxVarM.u();
            defpackage.apep apepVar2 = (defpackage.apep) akzxVarM.b;
            apepVar2.b |= 2;
            apepVar2.d = iBi2;
        }
        if (str != null) {
            defpackage.akzx akzxVarM2 = defpackage.apel.a.m();
            akzxVarM2.u();
            defpackage.apel apelVar = (defpackage.apel) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            apelVar.b |= 2;
            apelVar.d = str;
            defpackage.apel apelVar2 = (defpackage.apel) akzxVarM2.r();
            akzxVarM.u();
            defpackage.apep apepVar3 = (defpackage.apep) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVar2);
            apepVar3.e = apelVar2;
            apepVar3.b |= 4;
        }
        defpackage.apep apepVar4 = (defpackage.apep) akzxVarM.r();
        if (defpackage.agab.br(apepVar4)) {
            return null;
        }
        return apepVar4;
    }

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2) {
        int i;
        int i2;
        defpackage.apep apepVar = (defpackage.apep) albhVar;
        defpackage.apep apepVar2 = (defpackage.apep) albhVar2;
        if (apepVar == null || apepVar2 == null) {
            return apepVar;
        }
        defpackage.akzx akzxVarM = defpackage.apep.a.m();
        if ((apepVar.b & 1) != 0 && (i2 = apepVar.c - apepVar2.c) != 0) {
            akzxVarM.u();
            defpackage.apep apepVar3 = (defpackage.apep) akzxVarM.b;
            apepVar3.b |= 1;
            apepVar3.c = i2;
        }
        if ((apepVar.b & 2) != 0 && (i = apepVar.d - apepVar2.d) != 0) {
            akzxVarM.u();
            defpackage.apep apepVar4 = (defpackage.apep) akzxVarM.b;
            apepVar4.b |= 2;
            apepVar4.d = i;
        }
        defpackage.apel apelVar = apepVar.e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        akzxVarM.u();
        defpackage.apep apepVar5 = (defpackage.apep) akzxVarM.b;
        j$.util.Objects.requireNonNull(apelVar);
        apepVar5.e = apelVar;
        apepVar5.b |= 4;
        defpackage.apep apepVar6 = (defpackage.apep) akzxVarM.r();
        if (defpackage.agab.br(apepVar6)) {
            return null;
        }
        return apepVar6;
    }

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ java.lang.String c(defpackage.albh albhVar) {
        defpackage.apel apelVar = ((defpackage.apep) albhVar).e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        return apelVar.d;
    }
}
