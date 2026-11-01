package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acon implements aclu {
    private final java.util.Set a;

    public acon(java.util.Set set) {
        this.a = set;
    }

    public final ajcq a(aclw aclwVar) {
        acnl acnlVar = aclwVar.a;
        akzx akzxVarM = apew.a.m();
        int iB = acnlVar.c.b();
        akzxVarM.u();
        apew apewVar = akzxVarM.b;
        apewVar.c = iB - 1;
        apewVar.b |= 1;
        java.util.List list = acnlVar.b;
        int i = 0;
        while (i < list.size()) {
            aiwc aiwcVar = ((acmi) list.get(i)).d;
            if (aiwcVar == null) {
                aiwcVar = aiwc.a;
            }
            int i2 = aiwcVar.d;
            if (i == 0) {
                akzxVarM.u();
                apew apewVar2 = akzxVarM.b;
                apewVar2.b |= 2;
                apewVar2.d = i2;
                i = 0;
            } else {
                akzxVarM.u();
                apew apewVar3 = akzxVarM.b;
                alak alakVar = apewVar3.e;
                if (!alakVar.c()) {
                    apewVar3.e = alad.H(alakVar);
                }
                apewVar3.e.g(i2);
            }
            i++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        ailj ailjVarK = this.a.k();
        while (ailjVarK.hasNext()) {
            defpackage.acom acomVar = (defpackage.acom) ailjVarK.next();
            ajcq ajcqVar = aclwVar.b;
            long j = acnlVar.d;
            arrayList.add(acomVar.a((apew) akzxVarM.p()));
        }
        return ahvr.ah(arrayList).o(new kve(12), ajbm.a);
    }

    public final /* synthetic */ java.util.Set b() {
        return new aile(acnl.class);
    }
}
