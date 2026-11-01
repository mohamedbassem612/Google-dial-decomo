package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class heu {
    private static final defpackage.kvt a = defpackage.kvt.p("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final defpackage.kvt b = defpackage.kvt.p("k");

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    public static defpackage.hdk a(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        defpackage.hdg hdgVar;
        defpackage.hdb hdbVarC;
        java.util.List list;
        defpackage.hdb hdbVar;
        int iP = hfzVar.p();
        int i = 3;
        if (iP == 3) {
            hfzVar.h();
        }
        defpackage.hdb hdbVar2 = null;
        defpackage.hde hdeVarA = null;
        defpackage.hdl hdlVarB = null;
        defpackage.hdg hdgVar2 = null;
        defpackage.hdb hdbVarC2 = null;
        defpackage.hdb hdbVarC3 = null;
        defpackage.hdd hddVar = null;
        defpackage.hdb hdbVarC4 = null;
        defpackage.hdb hdbVarC5 = null;
        while (hfzVar.n()) {
            switch (hfzVar.q(a)) {
                case 0:
                    hfzVar.h();
                    while (hfzVar.n()) {
                        if (hfzVar.q(b) != 0) {
                            hfzVar.l();
                            hfzVar.m();
                        } else {
                            hdeVarA = defpackage.hes.a(hfzVar, gzhVar);
                        }
                    }
                    hfzVar.j();
                    i = 3;
                    break;
                case 1:
                    hdlVarB = defpackage.hes.b(hfzVar, gzhVar);
                    i = 3;
                    break;
                case 2:
                    hdgVar2 = new defpackage.hdg(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.f, false));
                    i = 3;
                    break;
                case 3:
                    gzhVar.e("Lottie doesn't support 3D layers.");
                    hdbVarC = defpackage.hgt.c(hfzVar, gzhVar, false);
                    list = hdbVarC.a;
                    if (list.isEmpty()) {
                        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
                        hdbVar = hdbVarC;
                        list.add(new defpackage.hgn(gzhVar, fValueOf, fValueOf, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(gzhVar.k)));
                    } else {
                        hdbVar = hdbVarC;
                        if (((defpackage.hgn) list.get(0)).b == null) {
                            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
                            list.set(0, new defpackage.hgn(gzhVar, fValueOf2, fValueOf2, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(gzhVar.k)));
                        }
                    }
                    hdbVar2 = hdbVar;
                    i = 3;
                    break;
                case 4:
                    hdbVarC = defpackage.hgt.c(hfzVar, gzhVar, false);
                    list = hdbVarC.a;
                    if (list.isEmpty()) {
                        java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.0f);
                        hdbVar = hdbVarC;
                        list.add(new defpackage.hgn(gzhVar, fValueOf3, fValueOf3, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(gzhVar.k)));
                    } else {
                        hdbVar = hdbVarC;
                        if (((defpackage.hgn) list.get(0)).b == null) {
                            java.lang.Float fValueOf4 = java.lang.Float.valueOf(0.0f);
                            list.set(0, new defpackage.hgn(gzhVar, fValueOf4, fValueOf4, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(gzhVar.k)));
                        }
                    }
                    hdbVar2 = hdbVar;
                    i = 3;
                    break;
                case 5:
                    hddVar = new defpackage.hdd(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.c, false));
                    break;
                case 6:
                    hdbVarC4 = defpackage.hgt.c(hfzVar, gzhVar, false);
                    break;
                case 7:
                    hdbVarC5 = defpackage.hgt.c(hfzVar, gzhVar, false);
                    break;
                case 8:
                    hdbVarC2 = defpackage.hgt.c(hfzVar, gzhVar, false);
                    break;
                case 9:
                    hdbVarC3 = defpackage.hgt.c(hfzVar, gzhVar, false);
                    break;
                default:
                    hfzVar.l();
                    hfzVar.m();
                    i = 3;
                    break;
            }
        }
        if (iP == i) {
            hfzVar.j();
        }
        if (hdeVarA == null || (hdeVarA.c() && ((android.graphics.PointF) ((defpackage.hgn) hdeVarA.a.get(0)).b).equals(0.0f, 0.0f))) {
            hdeVarA = null;
        }
        if (hdlVarB == null || (!(hdlVarB instanceof defpackage.hdi) && hdlVarB.c() && ((android.graphics.PointF) ((defpackage.hgn) hdlVarB.b().get(0)).b).equals(0.0f, 0.0f))) {
            hdlVarB = null;
        }
        defpackage.hdb hdbVar3 = true == b(hdbVar2) ? null : hdbVar2;
        if (hdgVar2 == null) {
            hdgVar = null;
        } else {
            if (hdgVar2.c()) {
                defpackage.hgq hgqVar = (defpackage.hgq) ((defpackage.hgn) hdgVar2.a.get(0)).b;
                if (hgqVar.a == 1.0f && hgqVar.b == 1.0f) {
                    hdgVar = null;
                }
            }
            hdgVar = hdgVar2;
        }
        return new defpackage.hdk(hdeVarA, hdlVarB, hdgVar, hdbVar3, hddVar, hdbVarC4, hdbVarC5, true == b(hdbVarC2) ? null : hdbVarC2, true == b(hdbVarC3) ? null : hdbVarC3);
    }

    private static /* synthetic */ boolean b(defpackage.hdb hdbVar) {
        if (hdbVar != null) {
            return hdbVar.c() && ((java.lang.Float) ((defpackage.hgn) hdbVar.a.get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }
}
