package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aceo extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akik akikVar = (defpackage.akik) obj;
        akzx akzxVarM = defpackage.akva.a.m();
        if ((akikVar.b & 1) != 0) {
            java.lang.String str = akikVar.c;
            akzxVarM.u();
            defpackage.akva akvaVar = (defpackage.akva) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akvaVar.b |= 1;
            akvaVar.c = str;
        }
        if ((akikVar.b & 2) != 0) {
            java.lang.String str2 = akikVar.d;
            akzxVarM.u();
            defpackage.akva akvaVar2 = (defpackage.akva) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akvaVar2.b |= 2;
            akvaVar2.d = str2;
        }
        if ((akikVar.b & 4) != 0) {
            java.lang.String str3 = akikVar.e;
            akzxVarM.u();
            defpackage.akva akvaVar3 = (defpackage.akva) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            akvaVar3.b |= 4;
            akvaVar3.e = str3;
        }
        if ((akikVar.b & 8) != 0) {
            java.lang.String str4 = akikVar.f;
            akzxVarM.u();
            defpackage.akva akvaVar4 = (defpackage.akva) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            akvaVar4.b |= 8;
            akvaVar4.f = str4;
        }
        if ((akikVar.b & 16) != 0) {
            ahxq ahxqVarE = defpackage.acft.a.e();
            defpackage.akij akijVarB = defpackage.akij.b(akikVar.g);
            if (akijVarB == null) {
                akijVarB = defpackage.akij.UNKNOWN;
            }
            defpackage.akuz akuzVar = (defpackage.akuz) ahxqVarE.d(akijVarB);
            akzxVarM.u();
            defpackage.akva akvaVar5 = (defpackage.akva) akzxVarM.b;
            akvaVar5.g = akuzVar.f;
            akvaVar5.b |= 16;
        }
        java.util.Iterator it = akikVar.h.iterator();
        while (it.hasNext()) {
            defpackage.akvj akvjVar = (defpackage.akvj) defpackage.acft.b.e().d((defpackage.akjr) it.next());
            akzxVarM.u();
            defpackage.akva akvaVar6 = (defpackage.akva) akzxVarM.b;
            j$.util.Objects.requireNonNull(akvjVar);
            alat alatVar = akvaVar6.h;
            if (!alatVar.c()) {
                akvaVar6.h = alad.J(alatVar);
            }
            akvaVar6.h.add(akvjVar);
        }
        if ((akikVar.b & 32) != 0) {
            int i = akikVar.i;
            akzxVarM.u();
            defpackage.akva akvaVar7 = (defpackage.akva) akzxVarM.b;
            akvaVar7.b |= 32;
            akvaVar7.i = i;
        }
        return (defpackage.akva) akzxVarM.p();
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akva akvaVar = (defpackage.akva) obj;
        akzx akzxVarM = defpackage.akik.a.m();
        if ((akvaVar.b & 1) != 0) {
            java.lang.String str = akvaVar.c;
            akzxVarM.u();
            defpackage.akik akikVar = (defpackage.akik) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akikVar.b |= 1;
            akikVar.c = str;
        }
        if ((akvaVar.b & 2) != 0) {
            java.lang.String str2 = akvaVar.d;
            akzxVarM.u();
            defpackage.akik akikVar2 = (defpackage.akik) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akikVar2.b |= 2;
            akikVar2.d = str2;
        }
        if ((akvaVar.b & 4) != 0) {
            java.lang.String str3 = akvaVar.e;
            akzxVarM.u();
            defpackage.akik akikVar3 = (defpackage.akik) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            akikVar3.b |= 4;
            akikVar3.e = str3;
        }
        if ((akvaVar.b & 8) != 0) {
            java.lang.String str4 = akvaVar.f;
            akzxVarM.u();
            defpackage.akik akikVar4 = (defpackage.akik) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            akikVar4.b |= 8;
            akikVar4.f = str4;
        }
        if ((akvaVar.b & 16) != 0) {
            ahxq ahxqVar = defpackage.acft.a;
            defpackage.akuz akuzVarB = defpackage.akuz.b(akvaVar.g);
            if (akuzVarB == null) {
                akuzVarB = defpackage.akuz.UNKNOWN;
            }
            defpackage.akij akijVar = (defpackage.akij) ahxqVar.d(akuzVarB);
            akzxVarM.u();
            defpackage.akik akikVar5 = (defpackage.akik) akzxVarM.b;
            akikVar5.g = akijVar.f;
            akikVar5.b |= 16;
        }
        java.util.Iterator it = akvaVar.h.iterator();
        while (it.hasNext()) {
            defpackage.akjr akjrVar = (defpackage.akjr) defpackage.acft.b.d((defpackage.akvj) it.next());
            akzxVarM.u();
            defpackage.akik akikVar6 = (defpackage.akik) akzxVarM.b;
            j$.util.Objects.requireNonNull(akjrVar);
            alat alatVar = akikVar6.h;
            if (!alatVar.c()) {
                akikVar6.h = alad.J(alatVar);
            }
            akikVar6.h.add(akjrVar);
        }
        if ((akvaVar.b & 32) != 0) {
            int i = akvaVar.i;
            akzxVarM.u();
            defpackage.akik akikVar7 = (defpackage.akik) akzxVarM.b;
            akikVar7.b |= 32;
            akikVar7.i = i;
        }
        return (defpackage.akik) akzxVarM.p();
    }
}
