package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akcw {
    public static final defpackage.akcv a;
    private static final aiwe b;
    private final defpackage.akdm c;

    static {
        akzx akzxVarM = aiwe.a.m();
        akzxVarM.u();
        aiwe aiweVar = akzxVarM.b;
        aiweVar.b |= 1;
        aiweVar.c = 0L;
        akzxVarM.u();
        aiwe aiweVar2 = akzxVarM.b;
        aiweVar2.b |= 2;
        aiweVar2.d = 0;
        akzxVarM.u();
        aiwe aiweVar3 = akzxVarM.b;
        aiweVar3.b |= 4;
        aiweVar3.e = 0;
        b = akzxVarM.p();
        a = defpackage.akcv.a().a();
    }

    public akcw(java.lang.String str, java.lang.String str2, int i) {
        akzx akzxVarM = defpackage.akdo.a.m();
        akzxVarM.u();
        defpackage.akdo akdoVar = (defpackage.akdo) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        akdoVar.b |= 1;
        akdoVar.c = str;
        if (str2 != null) {
            akzxVarM.u();
            defpackage.akdo akdoVar2 = (defpackage.akdo) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akdoVar2.b |= 2;
            akdoVar2.d = str2;
        }
        akzx akzxVarM2 = defpackage.akdm.a.m();
        akzxVarM2.u();
        defpackage.akdm akdmVar = (defpackage.akdm) akzxVarM2.b;
        defpackage.akdo akdoVar3 = (defpackage.akdo) akzxVarM.p();
        j$.util.Objects.requireNonNull(akdoVar3);
        akdmVar.c = akdoVar3;
        akdmVar.b |= 1;
        akzx akzxVarM3 = defpackage.akds.a.m();
        akzxVarM3.u();
        defpackage.akds akdsVar = (defpackage.akds) akzxVarM3.b;
        akdsVar.c = i - 1;
        akdsVar.b |= 1;
        akzxVarM2.u();
        defpackage.akdm akdmVar2 = (defpackage.akdm) akzxVarM2.b;
        defpackage.akds akdsVar2 = (defpackage.akds) akzxVarM3.p();
        j$.util.Objects.requireNonNull(akdsVar2);
        akdmVar2.d = akdsVar2;
        akdmVar2.b |= 2;
        this.c = (defpackage.akdm) akzxVarM2.p();
    }

    public static java.lang.Object a(aiom aiomVar, ainp ainpVar) {
        return aiomVar.n().d(ainpVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    private final akzx c(aiwf aiwfVar, int i, defpackage.akcv akcvVar, java.lang.Object... objArr) {
        defpackage.akdq akdqVar;
        alat alatVar;
        akzx akzxVarM = defpackage.akdq.a.m();
        akzxVarM.u();
        defpackage.akdq akdqVar2 = (defpackage.akdq) akzxVarM.b;
        akdqVar2.c = i - 1;
        akdqVar2.b |= 1;
        akzxVarM.u();
        defpackage.akdq akdqVar3 = (defpackage.akdq) akzxVarM.b;
        defpackage.akdm akdmVar = this.c;
        j$.util.Objects.requireNonNull(akdmVar);
        akdqVar3.f = akdmVar;
        akdqVar3.b |= 32;
        akzxVarM.u();
        defpackage.akdq akdqVar4 = (defpackage.akdq) akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwfVar);
        akdqVar4.g = aiwfVar;
        akdqVar4.b |= 64;
        if (i == 2) {
            if (akcvVar.b) {
                akzx akzxVarM2 = defpackage.akdp.a.m();
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    java.lang.Object obj = objArr[i2];
                    ahyn ahynVarH = obj == null ? ahyn.h("null") : obj instanceof aepe ? ahyn.h(((aepe) obj).b()) : ahwt.a;
                    if (ahynVarH.f()) {
                        akzxVarM2.u();
                        defpackage.akdp akdpVar = (defpackage.akdp) akzxVarM2.b;
                        alak alakVar = akdpVar.b;
                        if (!alakVar.c()) {
                            akdpVar.b = alad.H(alakVar);
                        }
                        akdpVar.b.g(i2);
                        java.lang.Object objB = ahynVarH.b();
                        akzxVarM2.u();
                        defpackage.akdp akdpVar2 = (defpackage.akdp) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(objB);
                        alat alatVar2 = akdpVar2.c;
                        if (!alatVar2.c()) {
                            akdpVar2.c = alad.J(alatVar2);
                        }
                        akdpVar2.c.add(objB);
                    }
                }
                if (((defpackage.akdp) akzxVarM2.b).b.size() > 0) {
                    defpackage.akdp akdpVar3 = (defpackage.akdp) akzxVarM2.p();
                    akzxVarM.u();
                    defpackage.akdq akdqVar5 = (defpackage.akdq) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akdpVar3);
                    akdqVar5.j = akdpVar3;
                    akdqVar5.b |= 512;
                }
            }
            for (int i3 = 0; i3 < objArr.length; i3++) {
                java.lang.Object obj2 = objArr[i3];
                if (obj2 != null) {
                    if (!(obj2 instanceof akct)) {
                        defpackage.akcx akcxVar = (defpackage.akcx) obj2.getClass().getAnnotation(defpackage.akcx.class);
                        if (akcxVar != null && akcxVar.a() != akcs.e) {
                            akzx akzxVarM3 = defpackage.akdt.a.m();
                            akzxVarM3.u();
                            defpackage.akdt akdtVar = (defpackage.akdt) akzxVarM3.b;
                            akdtVar.b |= 1;
                            akdtVar.c = i3;
                            java.lang.String string = obj2.toString();
                            akzxVarM3.u();
                            defpackage.akdt akdtVar2 = (defpackage.akdt) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(string);
                            akdtVar2.b |= 2;
                            akdtVar2.d = string;
                            defpackage.akdt akdtVar3 = (defpackage.akdt) akzxVarM3.p();
                            akzxVarM.u();
                            akdqVar = (defpackage.akdq) akzxVarM.b;
                            j$.util.Objects.requireNonNull(akdtVar3);
                            alatVar = akdqVar.i;
                            if (!alatVar.c()) {
                                akdqVar.i = alad.J(alatVar);
                            }
                            akdqVar.i.add(akdtVar3);
                        }
                    } else if (((akct) obj2).a != akcs.e) {
                        akzx akzxVarM4 = defpackage.akdt.a.m();
                        akzxVarM4.u();
                        defpackage.akdt akdtVar4 = (defpackage.akdt) akzxVarM4.b;
                        akdtVar4.b |= 1;
                        akdtVar4.c = i3;
                        java.lang.String string2 = obj2.toString();
                        akzxVarM4.u();
                        defpackage.akdt akdtVar5 = (defpackage.akdt) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(string2);
                        akdtVar5.b |= 2;
                        akdtVar5.d = string2;
                        defpackage.akdt akdtVar6 = (defpackage.akdt) akzxVarM4.p();
                        akzxVarM.u();
                        akdqVar = (defpackage.akdq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(akdtVar6);
                        alatVar = akdqVar.i;
                        if (!alatVar.c()) {
                            akdqVar.i = alad.J(alatVar);
                        }
                        akdqVar.i.add(akdtVar6);
                    }
                }
            }
        }
        return akzxVarM;
    }

    public final akzx b(aiom aiomVar, int i, defpackage.akcv akcvVar) {
        java.lang.String name;
        aiwf aiwfVar;
        apev apevVar;
        if (aiomVar.n().d(aeoq.a) != null) {
            akzx akzxVarM = aiwf.a.m();
            aiwe aiweVar = b;
            akzxVarM.u();
            aiwf aiwfVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(aiweVar);
            aiwfVar2.c = aiweVar;
            aiwfVar2.b |= 1;
            int iIntValue = aiomVar.r().intValue();
            akzxVarM.u();
            aiwf aiwfVar3 = akzxVarM.b;
            aiwfVar3.b |= 4;
            aiwfVar3.e = iIntValue;
            java.lang.String strB = aiomVar.f().b();
            akzxVarM.u();
            aiwf aiwfVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(strB);
            aiwfVar4.b |= 8;
            aiwfVar4.f = strB;
            java.lang.String strD = aiomVar.f().d();
            akzxVarM.u();
            aiwf aiwfVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(strD);
            aiwfVar5.b |= 16;
            aiwfVar5.g = strD;
            int iA = aiomVar.f().a();
            akzxVarM.u();
            aiwf aiwfVar6 = akzxVarM.b;
            aiwfVar6.b |= 32;
            aiwfVar6.h = iA;
            java.lang.String strE = aiomVar.f().e();
            if (strE != null) {
                akzxVarM.u();
                aiwf aiwfVar7 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strE);
                aiwfVar7.b |= 64;
                aiwfVar7.i = strE;
            }
            java.lang.String str = (java.lang.String) aiomVar.n().d(aeoq.b);
            if (str != null) {
                akzxVarM.u();
                aiwf aiwfVar8 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                aiwfVar8.b |= 2;
                aiwfVar8.d = str;
            } else {
                akzxVarM.u();
                aiwf aiwfVar9 = akzxVarM.b;
                j$.util.Objects.requireNonNull("Unknown native thread");
                aiwfVar9.b |= 2;
                aiwfVar9.d = "Unknown native thread";
            }
            aipn aipnVarO = aiomVar.o();
            if (aipnVarO != null) {
                akzxVarM.u();
                aiwf aiwfVar10 = akzxVarM.b;
                java.lang.String str2 = aipnVarO.b;
                j$.util.Objects.requireNonNull(str2);
                aiwfVar10.b |= 256;
                aiwfVar10.j = str2;
            } else {
                java.lang.String string = aiomVar.p().toString();
                akzxVarM.u();
                aiwf aiwfVar11 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                aiwfVar11.b |= 256;
                aiwfVar11.j = string;
            }
            aiwfVar = (aiwf) akzxVarM.p();
        } else {
            aipn aipnVarO2 = aiomVar.o();
            if (aipnVarO2 != null) {
                name = aipnVarO2.b;
            } else {
                java.lang.Object objP = aiomVar.p();
                if (objP instanceof java.lang.String) {
                    name = (java.lang.String) objP;
                } else {
                    name = objP != null ? objP.getClass().getName() : "null";
                }
            }
            java.lang.Throwable th = i == 2 ? (java.lang.Throwable) a(aiomVar, ainc.a) : null;
            ainh ainhVarF = aiomVar.f();
            java.util.logging.Level levelR = aiomVar.r();
            java.lang.String strB2 = ainhVarF.b();
            java.lang.String strD2 = ainhVarF.d();
            int iA2 = ainhVarF.a();
            akzx akzxVarM2 = aiwf.a.m();
            aiwe aiweVar2 = b;
            akzxVarM2.u();
            aiwf aiwfVar12 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(aiweVar2);
            aiwfVar12.c = aiweVar2;
            aiwfVar12.b |= 1;
            java.lang.String name2 = java.lang.Thread.currentThread().getName();
            akzxVarM2.u();
            aiwf aiwfVar13 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(name2);
            aiwfVar13.b |= 2;
            aiwfVar13.d = name2;
            int iIntValue2 = levelR.intValue();
            akzxVarM2.u();
            aiwf aiwfVar14 = akzxVarM2.b;
            aiwfVar14.b |= 4;
            aiwfVar14.e = iIntValue2;
            akzxVarM2.u();
            aiwf aiwfVar15 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(strB2);
            aiwfVar15.b |= 8;
            aiwfVar15.f = strB2;
            akzxVarM2.u();
            aiwf aiwfVar16 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(strD2);
            aiwfVar16.b |= 16;
            aiwfVar16.g = strD2;
            akzxVarM2.u();
            aiwf aiwfVar17 = akzxVarM2.b;
            aiwfVar17.b |= 32;
            aiwfVar17.h = iA2;
            if (name != null) {
                akzxVarM2.u();
                aiwf aiwfVar18 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(name);
                aiwfVar18.b |= 256;
                aiwfVar18.j = name;
            }
            if (th != null) {
                akzx akzxVarR = akcvVar.c ? ajee.r(th, false) : ajee.t(th);
                akzxVarM2.u();
                aiwf aiwfVar19 = akzxVarM2.b;
                aiwk aiwkVarP = akzxVarR.p();
                j$.util.Objects.requireNonNull(aiwkVarP);
                aiwfVar19.k = aiwkVarP;
                aiwfVar19.b |= 1024;
            }
            aiwfVar = (aiwf) akzxVarM2.p();
        }
        akzx akzxVarC = aiomVar.o() != null ? c(aiwfVar, i, akcvVar, aiomVar.V()) : c(aiwfVar, i, akcvVar, new java.lang.Object[0]);
        if (i == 2 && akcvVar.a && (apevVar = (apev) a(aiomVar, defpackage.akcy.b)) != null) {
            akzxVarC.u();
            defpackage.akdq akdqVar = (defpackage.akdq) akzxVarC.b;
            defpackage.akdq akdqVar2 = defpackage.akdq.a;
            j$.util.Objects.requireNonNull(apevVar);
            akdqVar.e = apevVar;
            akdqVar.b |= 4;
        }
        return akzxVarC;
    }
}
