package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hes {
    private static final defpackage.kvt a = defpackage.kvt.p("k", "x", "y");

    public static defpackage.hde a(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (hfzVar.p() == 1) {
            hfzVar.g();
            while (hfzVar.n()) {
                int iP = hfzVar.p();
                java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                defpackage.hfz hfzVar2 = hfzVar;
                defpackage.gzh gzhVar2 = gzhVar;
                arrayList.add(new defpackage.hbl(gzhVar2, defpackage.hfh.a(hfzVar2, gzhVar2, android.content.res.Resources.getSystem().getDisplayMetrics().density, defpackage.hfa.d, iP == 3, false)));
                hfzVar = hfzVar2;
                gzhVar = gzhVar2;
            }
            hfzVar.i();
            defpackage.hfi.b(arrayList);
        } else {
            java.lang.ThreadLocal threadLocal2 = defpackage.hgm.a;
            arrayList.add(new defpackage.hgn(defpackage.hfg.c(hfzVar, android.content.res.Resources.getSystem().getDisplayMetrics().density)));
        }
        return new defpackage.hde(arrayList);
    }

    static defpackage.hdl b(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        hfzVar.h();
        boolean z = false;
        defpackage.hde hdeVarA = null;
        defpackage.hdb hdbVarC = null;
        defpackage.hdb hdbVarC2 = null;
        while (hfzVar.p() != 4) {
            int iQ = hfzVar.q(a);
            if (iQ == 0) {
                hdeVarA = a(hfzVar, gzhVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    hfzVar.l();
                    hfzVar.m();
                } else if (hfzVar.p() == 6) {
                    hfzVar.m();
                    z = true;
                } else {
                    hdbVarC2 = defpackage.hgt.c(hfzVar, gzhVar, true);
                }
            } else if (hfzVar.p() == 6) {
                hfzVar.m();
                z = true;
            } else {
                hdbVarC = defpackage.hgt.c(hfzVar, gzhVar, true);
            }
        }
        hfzVar.j();
        if (z) {
            gzhVar.e("Lottie doesn't support expressions.");
        }
        return hdeVarA == null ? new defpackage.hdi(hdbVarC, hdbVarC2) : hdeVarA;
    }
}
