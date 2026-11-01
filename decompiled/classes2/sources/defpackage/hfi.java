package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hfi {
    static final defpackage.kvt a = defpackage.kvt.p("k");

    public static java.util.List a(defpackage.hfz hfzVar, defpackage.gzh gzhVar, float f, defpackage.hfw hfwVar, boolean z) {
        defpackage.hfz hfzVar2;
        float f2;
        defpackage.hfw hfwVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (hfzVar.p() == 6) {
            gzhVar.e("Lottie doesn't support expressions.");
        } else {
            hfzVar.h();
            while (hfzVar.n()) {
                if (hfzVar.q(a) != 0) {
                    hfzVar.m();
                } else if (hfzVar.p() == 1) {
                    hfzVar.g();
                    if (hfzVar.p() != 7) {
                        while (hfzVar.n()) {
                            defpackage.hfz hfzVar3 = hfzVar;
                            arrayList.add(defpackage.hfh.a(hfzVar3, gzhVar, f, hfwVar, true, z));
                            hfzVar = hfzVar3;
                        }
                        hfzVar2 = hfzVar;
                        f2 = f;
                        hfwVar2 = hfwVar;
                    } else {
                        hfzVar2 = hfzVar;
                        f2 = f;
                        hfwVar2 = hfwVar;
                        int i = defpackage.hfh.c;
                        arrayList.add(new defpackage.hgn(hfwVar2.a(hfzVar2, f2)));
                    }
                    hfzVar2.i();
                    hfzVar = hfzVar2;
                    gzhVar = gzhVar;
                    f = f2;
                    hfwVar = hfwVar2;
                    z = z;
                } else {
                    defpackage.hfz hfzVar4 = hfzVar;
                    int i2 = defpackage.hfh.c;
                    arrayList.add(new defpackage.hgn(hfwVar.a(hfzVar4, f)));
                    hfzVar = hfzVar4;
                    gzhVar = gzhVar;
                }
            }
            hfzVar.j();
            b(arrayList);
        }
        return arrayList;
    }

    public static void b(java.util.List list) {
        int i;
        java.lang.Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            defpackage.hgn hgnVar = (defpackage.hgn) list.get(i2);
            i2++;
            defpackage.hgn hgnVar2 = (defpackage.hgn) list.get(i2);
            hgnVar.h = java.lang.Float.valueOf(hgnVar2.g);
            if (hgnVar.c == null && (obj = hgnVar2.b) != null) {
                hgnVar.c = obj;
                if (hgnVar instanceof defpackage.hbl) {
                    ((defpackage.hbl) hgnVar).a();
                }
            }
        }
        defpackage.hgn hgnVar3 = (defpackage.hgn) list.get(i);
        if ((hgnVar3.b == null || hgnVar3.c == null) && list.size() > 1) {
            list.remove(hgnVar3);
        }
    }
}
