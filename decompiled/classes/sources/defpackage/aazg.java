package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazg {
    public static final defpackage.aazi a;

    static {
        defpackage.akzx akzxVarM = defpackage.aazi.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        defpackage.akzx akzxVarM2 = defpackage.aazh.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        akzxVarM2.u();
        defpackage.aazh aazhVar = (defpackage.aazh) akzxVarM2.b;
        aazhVar.b |= 2;
        aazhVar.d = false;
        akzxVarM2.u();
        defpackage.aazh aazhVar2 = (defpackage.aazh) akzxVarM2.b;
        aazhVar2.b |= 4;
        aazhVar2.e = false;
        akzxVarM2.u();
        defpackage.aazh aazhVar3 = (defpackage.aazh) akzxVarM2.b;
        aazhVar3.c = 2;
        aazhVar3.b |= 1;
        defpackage.alad aladVarR = akzxVarM2.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        defpackage.aazh aazhVar4 = (defpackage.aazh) aladVarR;
        defpackage.aooh.f(aazhVar4, "value");
        akzxVarM.u();
        defpackage.aazi aaziVar = (defpackage.aazi) akzxVarM.b;
        j$.util.Objects.requireNonNull(aazhVar4);
        aaziVar.c = aazhVar4;
        aaziVar.b |= 1;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.aazi) akzxVarM.b).d);
        defpackage.aooh.e(listUnmodifiableList, "getScheduleDownloadConstraintsList(...)");
        new defpackage.alct(listUnmodifiableList);
        defpackage.akzx akzxVarM3 = defpackage.aazj.a.m();
        defpackage.aooh.f(akzxVarM3, "builder");
        defpackage.aazh aazhVar5 = ((defpackage.aazi) akzxVarM.b).c;
        if (aazhVar5 == null) {
            aazhVar5 = defpackage.aazh.a;
        }
        defpackage.aooh.e(aazhVar5, "getStartupDownloadConstraints(...)");
        defpackage.aooh.f(aazhVar5, "value");
        akzxVarM3.u();
        defpackage.aazj aazjVar = (defpackage.aazj) akzxVarM3.b;
        j$.util.Objects.requireNonNull(aazhVar5);
        aazjVar.d = aazhVar5;
        aazjVar.b |= 2;
        defpackage.akzm akzmVarH = defpackage.aldf.h();
        defpackage.aooh.e(akzmVarH, "fromDays(...)");
        defpackage.aooh.f(akzmVarH, "value");
        akzxVarM3.u();
        defpackage.aazj aazjVar2 = (defpackage.aazj) akzxVarM3.b;
        j$.util.Objects.requireNonNull(akzmVarH);
        aazjVar2.c = akzmVarH;
        aazjVar2.b |= 1;
        defpackage.alad aladVarR2 = akzxVarM3.r();
        defpackage.aooh.e(aladVarR2, "build(...)");
        defpackage.aazj aazjVar3 = (defpackage.aazj) aladVarR2;
        defpackage.aooh.f(aazjVar3, "value");
        akzxVarM.u();
        defpackage.aazi aaziVar2 = (defpackage.aazi) akzxVarM.b;
        j$.util.Objects.requireNonNull(aazjVar3);
        defpackage.alat alatVar = aaziVar2.d;
        if (!alatVar.c()) {
            aaziVar2.d = defpackage.alad.J(alatVar);
        }
        aaziVar2.d.add(aazjVar3);
        defpackage.alad aladVarR3 = akzxVarM.r();
        defpackage.aooh.e(aladVarR3, "build(...)");
        a = (defpackage.aazi) aladVarR3;
    }
}
