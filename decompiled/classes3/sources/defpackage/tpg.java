package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tpg implements ihn {
    private final defpackage.tpf a;
    private final defpackage.aprf b;

    public tpg(defpackage.aprf aprfVar, defpackage.tpf tpfVar) {
        aooh.f(tpfVar, "sharpieCallEventClearcutLogger");
        this.b = aprfVar;
        this.a = tpfVar;
    }

    public final java.lang.Object a(igd igdVar, defpackage.tvx tvxVar, aoln aolnVar) {
        defpackage.tpf tpfVar = this.a;
        java.lang.Object objA = ahvr.ag(tpfVar.a, (ahda) tpfVar.c, new roz(tvxVar, tpfVar, (aoln) null, 13)).a(aolnVar);
        aolu aoluVar = aolu.a;
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        return objA != aoluVar ? aojh.a : objA;
    }

    public final java.lang.Object b(igd igdVar, defpackage.twj twjVar, aoln aolnVar) {
        return aojh.a;
    }

    public final java.lang.Object c(igd igdVar, defpackage.twj twjVar, aoln aolnVar) {
        defpackage.amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = defpackage.amld.a;
        }
        alat alatVar = (amldVar.b == 1 ? (defpackage.amkw) amldVar.c : defpackage.amkw.a).c;
        aooh.e(alatVar, "getHypothesisList(...)");
        java.lang.String str = (java.lang.String) ajsz.bG(alatVar);
        if (str != null && str.length() > 0) {
            java.lang.Object obj = this.b.a;
            qbc qbcVar = qbc.lF;
            defpackage.toj tojVar = (defpackage.toj) obj;
            defpackage.qbe qbeVar = tojVar.u;
            qbeVar.a(qbcVar);
            defpackage.tth tthVarB = defpackage.tth.b(tojVar.D.m().c);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            if (tthVarB != defpackage.tth.SCAM_DETECTION_RUNNING) {
                qbeVar.a(qbc.lR);
            } else {
                aoov.an(tojVar.c, (aolr) null, 0, new defpackage.tkz(tojVar, str, (aoln) null, 5), 3);
            }
        }
        return aojh.a;
    }

    public final java.lang.Object d(defpackage.twg twgVar, aoln aolnVar) {
        defpackage.toj.a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "onTranscriptError", 610, "SharpieLifecycleController.kt").y("SODA error: %s", twgVar.name());
        java.lang.Object objJ = ((defpackage.toj) this.b.a).j(ajsz.bb(new defpackage.twg[]{defpackage.twg.j, defpackage.twg.n}).contains(twgVar), aolnVar);
        aolu aoluVar = aolu.a;
        if (objJ != aoluVar) {
            objJ = aojh.a;
        }
        if (objJ != aoluVar) {
            objJ = aojh.a;
        }
        return objJ != aoluVar ? aojh.a : objJ;
    }

    public final /* synthetic */ java.lang.Object e() {
        return aojh.a;
    }

    public final java.lang.Object y(amle amleVar, aoln aolnVar) {
        return aojh.a;
    }
}
