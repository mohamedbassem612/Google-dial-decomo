package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class acfg implements ahyc {
    public abstract void a(defpackage.akts aktsVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akts aktsVar = (defpackage.akts) obj;
        akzx akzxVarM = defpackage.akkj.a.m();
        b(aktsVar, akzxVarM);
        if ((aktsVar.b & 4) != 0) {
            int i = aktsVar.e;
            akzxVarM.u();
            defpackage.akkj akkjVar = (defpackage.akkj) akzxVarM.b;
            akkjVar.b |= 2;
            akkjVar.d = i;
        }
        if ((aktsVar.b & 2) != 0) {
            boolean z = aktsVar.d;
            akzxVarM.u();
            defpackage.akkj akkjVar2 = (defpackage.akkj) akzxVarM.b;
            akkjVar2.b |= 4;
            akkjVar2.e = z;
        }
        a(aktsVar, akzxVarM);
        java.util.Iterator it = aktsVar.g.iterator();
        while (it.hasNext()) {
            java.lang.Object objApply = defpackage.acgi.a.apply((defpackage.aktr) it.next());
            akzxVarM.u();
            defpackage.akkj akkjVar3 = (defpackage.akkj) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            alat alatVar = akkjVar3.h;
            if (!alatVar.c()) {
                akkjVar3.h = alad.J(alatVar);
            }
            akkjVar3.h.add(objApply);
        }
        if ((aktsVar.b & 16) != 0) {
            ahxq ahxqVar = defpackage.acgi.c;
            akto aktoVarB = akto.b(aktsVar.h);
            if (aktoVarB == null) {
                aktoVarB = akto.a;
            }
            defpackage.akki akkiVar = (defpackage.akki) ahxqVar.d(aktoVarB);
            akzxVarM.u();
            defpackage.akkj akkjVar4 = (defpackage.akkj) akzxVarM.b;
            akkjVar4.i = akkiVar.c;
            akkjVar4.b |= 64;
        }
        return (defpackage.akkj) akzxVarM.p();
    }

    public abstract void b(defpackage.akts aktsVar, akzx akzxVar);
}
