package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtk implements defpackage.abtm {
    private final zzd a;
    private final ahyn b;
    private final android.content.Context c;

    public abtk(zzd zzdVar, ahyn ahynVar, android.content.Context context) {
        this.a = zzdVar;
        this.b = ahynVar;
        this.c = context;
    }

    @Override // defpackage.abtm
    public final void a(defpackage.alev alevVar, ahyn ahynVar) {
        if (alevVar != null) {
            defpackage.aned.b();
            defpackage.aned.b();
            ahyn ahynVar2 = this.b;
            if (ahynVar2.f()) {
                akzx akzxVarM = defpackage.akdq.a.m();
                akzxVarM.u();
                defpackage.akdq akdqVar = (defpackage.akdq) akzxVarM.b;
                akdqVar.c = 1;
                akdqVar.b |= 1;
                akzx akzxVarM2 = defpackage.akdm.a.m();
                akzx akzxVarM3 = defpackage.akdo.a.m();
                java.lang.String packageName = this.c.getPackageName();
                akzxVarM3.u();
                defpackage.akdo akdoVar = (defpackage.akdo) akzxVarM3.b;
                j$.util.Objects.requireNonNull(packageName);
                akdoVar.b |= 1;
                akdoVar.c = packageName;
                defpackage.akdo akdoVar2 = (defpackage.akdo) akzxVarM3.p();
                akzxVarM2.u();
                defpackage.akdm akdmVar = (defpackage.akdm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akdoVar2);
                akdmVar.c = akdoVar2;
                akdmVar.b |= 1;
                akzx akzxVarM4 = defpackage.akds.a.m();
                akzxVarM4.u();
                defpackage.akds akdsVar = (defpackage.akds) akzxVarM4.b;
                akdsVar.c = 0;
                akdsVar.b |= 1;
                defpackage.akds akdsVar2 = (defpackage.akds) akzxVarM4.p();
                akzxVarM2.u();
                defpackage.akdm akdmVar2 = (defpackage.akdm) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akdsVar2);
                akdmVar2.d = akdsVar2;
                akdmVar2.b |= 2;
                defpackage.akdm akdmVar3 = (defpackage.akdm) akzxVarM2.p();
                akzxVarM.u();
                defpackage.akdq akdqVar2 = (defpackage.akdq) akzxVarM.b;
                j$.util.Objects.requireNonNull(akdmVar3);
                akdqVar2.f = akdmVar3;
                akdqVar2.b |= 32;
                akzz akzzVarM = apev.a.m();
                apdi apdiVar = defpackage.apec.d;
                akzx akzxVarM5 = defpackage.apec.a.m();
                akzx akzxVarM6 = defpackage.alew.a.m();
                long j = alevVar.e;
                akzxVarM6.u();
                defpackage.alew alewVar = (defpackage.alew) akzxVarM6.b;
                alewVar.b |= 1;
                alewVar.c = j;
                long j2 = alevVar.f;
                akzxVarM6.u();
                defpackage.alew alewVar2 = (defpackage.alew) akzxVarM6.b;
                alewVar2.b |= 2;
                alewVar2.d = j2;
                int iAi = a.ai(alevVar.h);
                if (iAi == 0) {
                    iAi = 2;
                }
                akzxVarM6.u();
                defpackage.alew alewVar3 = (defpackage.alew) akzxVarM6.b;
                alewVar3.e = defpackage.akmr.g(iAi);
                alewVar3.b |= 4;
                int iA = aldn.a(alevVar.i);
                if (iA == 0) {
                    iA = 1;
                }
                akzxVarM6.u();
                defpackage.alew alewVar4 = (defpackage.alew) akzxVarM6.b;
                alewVar4.f = iA - 1;
                alewVar4.b |= 8;
                aldm aldmVar = alevVar.j;
                if (aldmVar == null) {
                    aldmVar = aldm.a;
                }
                akzxVarM6.u();
                defpackage.alew alewVar5 = (defpackage.alew) akzxVarM6.b;
                j$.util.Objects.requireNonNull(aldmVar);
                alewVar5.g = aldmVar;
                alewVar5.b |= 16;
                alan alanVar = alevVar.k;
                akzxVarM6.u();
                defpackage.alew alewVar6 = (defpackage.alew) akzxVarM6.b;
                alan alanVar2 = alewVar6.h;
                if (!alanVar2.c()) {
                    alewVar6.h = alad.I(alanVar2);
                }
                akyl.i(alanVar, alewVar6.h);
                defpackage.alew alewVar7 = (defpackage.alew) akzxVarM6.p();
                akzxVarM5.u();
                defpackage.apec apecVar = (defpackage.apec) akzxVarM5.b;
                j$.util.Objects.requireNonNull(alewVar7);
                apecVar.c = alewVar7;
                apecVar.b |= 1;
                akzzVarM.bV(apdiVar, (defpackage.apec) akzxVarM5.p());
                apev apevVarP = akzzVarM.p();
                akzxVarM.u();
                defpackage.akdq akdqVar3 = (defpackage.akdq) akzxVarM.b;
                j$.util.Objects.requireNonNull(apevVarP);
                akdqVar3.e = apevVarP;
                akdqVar3.b |= 4;
                akzx akzxVarM7 = aiwf.a.m();
                java.lang.String name = java.lang.Thread.currentThread().getName();
                akzxVarM7.u();
                aiwf aiwfVar = akzxVarM7.b;
                j$.util.Objects.requireNonNull(name);
                aiwfVar.b |= 2;
                aiwfVar.d = name;
                java.lang.String name2 = getClass().getName();
                akzxVarM7.u();
                aiwf aiwfVar2 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(name2);
                aiwfVar2.b |= 8;
                aiwfVar2.f = name2;
                aiwk aiwkVarP = ajee.t((java.lang.Throwable) ((ahys) ahynVar).a).p();
                akzxVarM7.u();
                aiwf aiwfVar3 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(aiwkVarP);
                aiwfVar3.k = aiwkVarP;
                aiwfVar3.b |= 1024;
                akzx akzxVarM8 = aiwe.a.m();
                akzxVarM8.u();
                aiwe aiweVar = akzxVarM8.b;
                aiweVar.b |= 1;
                aiweVar.c = 0L;
                akzxVarM8.u();
                aiwe aiweVar2 = akzxVarM8.b;
                aiweVar2.b |= 2;
                aiweVar2.d = 0;
                akzxVarM8.u();
                aiwe aiweVar3 = akzxVarM8.b;
                aiweVar3.b |= 4;
                aiweVar3.e = 0;
                aiwe aiweVarP = akzxVarM8.p();
                akzxVarM7.u();
                aiwf aiwfVar4 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(aiweVarP);
                aiwfVar4.c = aiweVarP;
                aiwfVar4.b |= 1;
                int iIntValue = java.util.logging.Level.WARNING.intValue();
                akzxVarM7.u();
                aiwf aiwfVar5 = akzxVarM7.b;
                aiwfVar5.b |= 4;
                aiwfVar5.e = iIntValue;
                akzxVarM.u();
                defpackage.akdq akdqVar4 = (defpackage.akdq) akzxVarM.b;
                aiwf aiwfVarP = akzxVarM7.p();
                j$.util.Objects.requireNonNull(aiwfVarP);
                akdqVar4.g = aiwfVarP;
                akdqVar4.b |= 64;
                ((zzd) ahynVar2.b()).g((defpackage.akdq) akzxVarM.p()).d();
            }
            zzc zzcVarG = this.a.g(alevVar);
            zzcVarG.m(a.U(3));
            zzcVarG.d();
        }
    }
}
