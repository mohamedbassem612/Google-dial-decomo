package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqj extends defpackage.aeql {
    public static final defpackage.aeqj a = new defpackage.aeqj();

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStatsM = aa$.ExternalSyntheticApiModelOutline1.m(obj);
        defpackage.akzx akzxVarM = defpackage.apem.a.m();
        akzxVarM.bl(defpackage.aeqm.a.d(defpackage.agab.bk(healthStatsM, 40001)));
        akzxVarM.bm(defpackage.aeqi.a.d((healthStatsM == null || !aa$.ExternalSyntheticApiModelOutline1.m(healthStatsM, 40002)) ? java.util.Collections.EMPTY_MAP : aa$.ExternalSyntheticApiModelOutline1.m(healthStatsM, 40002)));
        if (str != null) {
            defpackage.akzx akzxVarM2 = defpackage.apel.a.m();
            akzxVarM2.u();
            defpackage.apel apelVar = (defpackage.apel) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            apelVar.b |= 2;
            apelVar.d = str;
            defpackage.apel apelVar2 = (defpackage.apel) akzxVarM2.r();
            akzxVarM.u();
            defpackage.apem apemVar = (defpackage.apem) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVar2);
            apemVar.e = apelVar2;
            apemVar.b |= 1;
        }
        defpackage.apem apemVar2 = (defpackage.apem) akzxVarM.r();
        if (defpackage.agab.bp(apemVar2)) {
            return null;
        }
        return apemVar2;
    }

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2) {
        defpackage.apem apemVar = (defpackage.apem) albhVar;
        defpackage.apem apemVar2 = (defpackage.apem) albhVar2;
        if (apemVar == null || apemVar2 == null) {
            return apemVar;
        }
        defpackage.akzx akzxVarM = defpackage.apem.a.m();
        akzxVarM.bl(defpackage.aeqm.a.e(apemVar.c, apemVar2.c));
        akzxVarM.bm(defpackage.aeqi.a.e(apemVar.d, apemVar2.d));
        defpackage.apel apelVar = apemVar.e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        akzxVarM.u();
        defpackage.apem apemVar3 = (defpackage.apem) akzxVarM.b;
        j$.util.Objects.requireNonNull(apelVar);
        apemVar3.e = apelVar;
        apemVar3.b |= 1;
        defpackage.apem apemVar4 = (defpackage.apem) akzxVarM.r();
        if (defpackage.agab.bp(apemVar4)) {
            return null;
        }
        return apemVar4;
    }

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ java.lang.String c(defpackage.albh albhVar) {
        defpackage.apel apelVar = ((defpackage.apem) albhVar).e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        return apelVar.d;
    }
}
