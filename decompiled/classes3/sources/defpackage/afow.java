package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afow extends eoa {
    public ajml a;
    public final aazc b;
    public final defpackage.wyw c;
    private final android.accounts.Account d;

    public afow(aazc aazcVar, defpackage.afpl afplVar, enr enrVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(enrVar, "savedStateHandle");
        this.b = aazcVar;
        java.lang.Object objA = enrVar.a("profiles_account");
        if (objA == null) {
            throw new java.lang.IllegalArgumentException("account must be specified");
        }
        android.accounts.Account account = (android.accounts.Account) objA;
        this.d = account;
        this.c = afplVar.i(account.name);
    }

    public final void a(defpackage.afop afopVar) {
        java.lang.Object next;
        akov akovVar;
        aooh.f(afopVar, "result");
        ajml ajmlVar = this.a;
        if (ajmlVar != null) {
            long jB = aazc.b() - ajmlVar.a;
            akzx akzxVar = (akzx) ajmlVar.b;
            akzxVar.u();
            akow akowVar = akzxVar.b;
            akow akowVar2 = akow.a;
            akowVar.b |= 1;
            akowVar.e = jB / 1000;
            akow akowVarP = akzxVar.p();
            aooh.e(akowVarP, "build(...)");
            akow akowVar3 = akowVarP;
            java.util.List list = afopVar.a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ajsz.bv(arrayList, ((defpackage.afou) it.next()).c);
            }
            java.util.List listBU = ajsz.bU(arrayList, akowVar3);
            java.util.Iterator it2 = listBU.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while ((((akow) next).b & 2) == 0);
            akow akowVar4 = (akow) next;
            if (akowVar4 != null) {
                akovVar = akowVar4.f;
                if (akovVar == null) {
                    akovVar = akov.a;
                }
            } else {
                akovVar = null;
            }
            defpackage.wyw wywVar = this.c;
            akzx akzxVarM = defpackage.akoz.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.akpb akpbVar = defpackage.akpb.a;
            akzx akzxVarM2 = akpbVar.m();
            aooh.f(akzxVarM2, "builder");
            akzxVarM2.u();
            defpackage.akpb akpbVar2 = (defpackage.akpb) akzxVarM2.b;
            akpbVar2.c = 10;
            akpbVar2.b |= 1;
            long j = akowVar3.e;
            akzxVarM2.u();
            defpackage.akpb akpbVar3 = (defpackage.akpb) akzxVarM2.b;
            akpbVar3.b |= 2;
            akpbVar3.d = j;
            if (akovVar != null) {
                akzxVarM2.u();
                defpackage.akpb akpbVar4 = (defpackage.akpb) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akovVar);
                akpbVar4.e = akovVar;
                akpbVar4.b |= 4;
            }
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.akpb akpbVar5 = (defpackage.akpb) aladVarP;
            aooh.f(akpbVar5, "value");
            akzxVarM.u();
            defpackage.akoz akozVar = (defpackage.akoz) akzxVarM.b;
            j$.util.Objects.requireNonNull(akpbVar5);
            akozVar.d = akpbVar5;
            akozVar.b |= 1;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akoz) akzxVarM.b).c);
            aooh.e(listUnmodifiableList, "getEventList(...)");
            new alct(listUnmodifiableList);
            akzxVarM.u();
            defpackage.akoz akozVar2 = (defpackage.akoz) akzxVarM.b;
            alat alatVar = akozVar2.c;
            if (!alatVar.c()) {
                akozVar2.c = alad.J(alatVar);
            }
            akyl.i(listBU, akozVar2.c);
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.akoz akozVar3 = (defpackage.akoz) aladVarP2;
            defpackage.akpb akpbVar6 = akozVar3.d;
            if (akpbVar6 != null) {
                akpbVar = akpbVar6;
            }
            if ((akpbVar.b & 1) == 0) {
                throw new java.lang.IllegalArgumentException("OperationEntries require an OperationSummary with a set EntryType.");
            }
            akzx akzxVarG = wywVar.g();
            akzx akzxVarM3 = defpackage.akok.a.m();
            akzx akzxVarM4 = defpackage.akor.a.m();
            akzxVarM4.u();
            defpackage.akor akorVar = (defpackage.akor) akzxVarM4.b;
            akorVar.c = 1;
            akorVar.b |= 1;
            akzxVarM4.u();
            defpackage.akor akorVar2 = (defpackage.akor) akzxVarM4.b;
            j$.util.Objects.requireNonNull(akozVar3);
            akorVar2.e = akozVar3;
            akorVar2.b |= 4;
            akzxVarM3.u();
            defpackage.akok akokVar = (defpackage.akok) akzxVarM3.b;
            defpackage.akor akorVar3 = (defpackage.akor) akzxVarM4.p();
            j$.util.Objects.requireNonNull(akorVar3);
            akokVar.c = akorVar3;
            akokVar.b |= 1;
            akzxVarG.u();
            defpackage.akoi akoiVar = (defpackage.akoi) akzxVarG.b;
            defpackage.akok akokVar2 = (defpackage.akok) akzxVarM3.p();
            defpackage.akoi akoiVar2 = defpackage.akoi.a;
            j$.util.Objects.requireNonNull(akokVar2);
            akoiVar.d = akokVar2;
            akoiVar.b |= 2;
            wywVar.f((defpackage.akoi) akzxVarG.p());
        }
        this.a = null;
    }
}
