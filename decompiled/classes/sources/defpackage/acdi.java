package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdi implements defpackage.accw {
    private final /* synthetic */ int $cid;

    public acdi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.accw
    public final boolean a(akkk akkkVar, accv accvVar) {
        defpackage.acba acbaVar;
        int i;
        defpackage.acba acbaVar2;
        int i2;
        if (this.$cid != 0) {
            defpackage.aooh.f(akkkVar, "triggeringEvent");
            if (akkkVar.c != 1 || (i2 = (acbaVar2 = accvVar.a).b) != 1) {
                return false;
            }
            defpackage.akiq akiqVar = i2 == 1 ? (defpackage.akiq) acbaVar2.c : defpackage.akiq.a;
            defpackage.aooh.e(akiqVar, "getClearcutEvent(...)");
            defpackage.akiq akiqVar2 = akkkVar.c == 1 ? (defpackage.akiq) akkkVar.d : defpackage.akiq.a;
            defpackage.aooh.e(akiqVar2, "getClearcutEvent(...)");
            defpackage.aooh.f(akiqVar, "firstEvent");
            defpackage.aooh.f(akiqVar2, "secondEvent");
            defpackage.akiq akiqVarT = abxl.t(akiqVar);
            defpackage.akiq akiqVarT2 = abxl.t(akiqVar2);
            if (akiqVarT.c != akiqVarT2.c || akiqVarT.d != akiqVarT2.d || !defpackage.aooh.n(akiqVarT.e, akiqVarT2.e)) {
                return false;
            }
        } else {
            defpackage.aooh.f(akkkVar, "triggeringEvent");
            if (akkkVar.c != 4 || (i = (acbaVar = accvVar.a).b) != 2) {
                return false;
            }
            defpackage.acbc acbcVar = i == 2 ? (defpackage.acbc) acbaVar.c : defpackage.acbc.a;
            defpackage.aooh.e(acbcVar, "getVisualElementEvent(...)");
            akkn akknVar = akkkVar.c == 4 ? (akkn) akkkVar.d : akkn.a;
            defpackage.aooh.e(akknVar, "getVeEvent(...)");
            defpackage.aooh.f(acbcVar, "reportedElement");
            defpackage.aooh.f(akknVar, "targetElement");
            akkm akkmVarB = akkm.b(acbcVar.b);
            if (akkmVarB == null) {
                akkmVarB = akkm.a;
            }
            akkm akkmVarB2 = akkm.b(akknVar.d);
            if (akkmVarB2 == null) {
                akkmVarB2 = akkm.a;
            }
            if (akkmVarB != akkmVarB2) {
                return false;
            }
            if (!akknVar.c.isEmpty()) {
                java.util.Iterator it = acbcVar.c.iterator();
                while (it.hasNext()) {
                    defpackage.alak alakVar = ((acbb) it.next()).b;
                    defpackage.aooh.e(alakVar, "getNodeIdPathList(...)");
                    if (abxl.s(alakVar, akknVar)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
