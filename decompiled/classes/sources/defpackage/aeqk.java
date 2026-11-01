package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqk extends defpackage.aeql {
    public static final defpackage.aeqk a = new defpackage.aeqk();

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh a(java.lang.String str, java.lang.Object obj) {
        android.os.health.HealthStats healthStatsM = aa$.ExternalSyntheticApiModelOutline1.m(obj);
        defpackage.akzx akzxVarM = defpackage.apeo.a.m();
        long jBi = defpackage.agab.bi(healthStatsM, 30001);
        if (jBi != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar = (defpackage.apeo) akzxVarM.b;
            apeoVar.b |= 1;
            apeoVar.c = jBi;
        }
        long jBi2 = defpackage.agab.bi(healthStatsM, 30002);
        if (jBi2 != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar2 = (defpackage.apeo) akzxVarM.b;
            apeoVar2.b |= 2;
            apeoVar2.d = jBi2;
        }
        long jBi3 = defpackage.agab.bi(healthStatsM, 30003);
        if (jBi3 != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar3 = (defpackage.apeo) akzxVarM.b;
            apeoVar3.b |= 4;
            apeoVar3.e = jBi3;
        }
        long jBi4 = defpackage.agab.bi(healthStatsM, 30004);
        if (jBi4 != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar4 = (defpackage.apeo) akzxVarM.b;
            apeoVar4.b |= 8;
            apeoVar4.f = jBi4;
        }
        long jBi5 = defpackage.agab.bi(healthStatsM, 30005);
        if (jBi5 != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar5 = (defpackage.apeo) akzxVarM.b;
            apeoVar5.b |= 16;
            apeoVar5.g = jBi5;
        }
        long jBi6 = defpackage.agab.bi(healthStatsM, 30006);
        if (jBi6 != 0) {
            akzxVarM.u();
            defpackage.apeo apeoVar6 = (defpackage.apeo) akzxVarM.b;
            apeoVar6.b |= 32;
            apeoVar6.h = jBi6;
        }
        if (str != null) {
            defpackage.apel apelVarBl = defpackage.agab.bl(str);
            akzxVarM.u();
            defpackage.apeo apeoVar7 = (defpackage.apeo) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVarBl);
            apeoVar7.i = apelVarBl;
            apeoVar7.b |= 64;
        }
        defpackage.apeo apeoVar8 = (defpackage.apeo) akzxVarM.r();
        if (defpackage.agab.bq(apeoVar8)) {
            return null;
        }
        return apeoVar8;
    }

    @Override // defpackage.aeql
    public final /* synthetic */ defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2) {
        defpackage.apeo apeoVar = (defpackage.apeo) albhVar;
        defpackage.apeo apeoVar2 = (defpackage.apeo) albhVar2;
        if (apeoVar == null || apeoVar2 == null) {
            return apeoVar;
        }
        defpackage.akzx akzxVarM = defpackage.apeo.a.m();
        if ((apeoVar.b & 1) != 0) {
            long j = apeoVar.c - apeoVar2.c;
            if (j != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar3 = (defpackage.apeo) akzxVarM.b;
                apeoVar3.b |= 1;
                apeoVar3.c = j;
            }
        }
        if ((apeoVar.b & 2) != 0) {
            long j2 = apeoVar.d - apeoVar2.d;
            if (j2 != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar4 = (defpackage.apeo) akzxVarM.b;
                apeoVar4.b |= 2;
                apeoVar4.d = j2;
            }
        }
        if ((apeoVar.b & 4) != 0) {
            long j3 = apeoVar.e - apeoVar2.e;
            if (j3 != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar5 = (defpackage.apeo) akzxVarM.b;
                apeoVar5.b |= 4;
                apeoVar5.e = j3;
            }
        }
        if ((apeoVar.b & 8) != 0) {
            long j4 = apeoVar.f - apeoVar2.f;
            if (j4 != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar6 = (defpackage.apeo) akzxVarM.b;
                apeoVar6.b |= 8;
                apeoVar6.f = j4;
            }
        }
        if ((apeoVar.b & 16) != 0) {
            long j5 = apeoVar.g - apeoVar2.g;
            if (j5 != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar7 = (defpackage.apeo) akzxVarM.b;
                apeoVar7.b |= 16;
                apeoVar7.g = j5;
            }
        }
        if ((apeoVar.b & 32) != 0) {
            long j6 = apeoVar.h - apeoVar2.h;
            if (j6 != 0) {
                akzxVarM.u();
                defpackage.apeo apeoVar8 = (defpackage.apeo) akzxVarM.b;
                apeoVar8.b |= 32;
                apeoVar8.h = j6;
            }
        }
        defpackage.apel apelVar = apeoVar.i;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        akzxVarM.u();
        defpackage.apeo apeoVar9 = (defpackage.apeo) akzxVarM.b;
        j$.util.Objects.requireNonNull(apelVar);
        apeoVar9.i = apelVar;
        apeoVar9.b |= 64;
        defpackage.apeo apeoVar10 = (defpackage.apeo) akzxVarM.r();
        if (defpackage.agab.bq(apeoVar10)) {
            return null;
        }
        return apeoVar10;
    }

    @Override // defpackage.aeql
    public final /* bridge */ /* synthetic */ java.lang.String c(defpackage.albh albhVar) {
        defpackage.apel apelVar = ((defpackage.apeo) albhVar).i;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        return apelVar.d;
    }
}
