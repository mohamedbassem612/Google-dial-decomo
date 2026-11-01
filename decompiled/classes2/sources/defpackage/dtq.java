package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtq {
    static int a;
    public final int c;
    public int d;
    final java.util.ArrayList b = new java.util.ArrayList();
    java.util.ArrayList e = null;
    private int f = -1;

    public dtq(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(dsq dsqVar, int i) {
        int iO;
        int iO2;
        java.util.ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        dsz dszVar = ((dsy) arrayList.get(0)).U;
        dsqVar.k();
        dszVar.b(dsqVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((dsy) arrayList.get(i2)).b(dsqVar, false);
        }
        if (i == 0) {
            dsz dszVar2 = dszVar;
            if (dszVar2.as > 0) {
                defpackage.yt.f(dszVar2, dsqVar, arrayList, 0);
            }
        }
        if (i == 1) {
            dsz dszVar3 = dszVar;
            if (dszVar3.at > 0) {
                defpackage.yt.f(dszVar3, dsqVar, arrayList, 1);
            }
        }
        try {
            dsqVar.j();
        } catch (java.lang.Exception e) {
            java.lang.System.err.println(e.toString() + '\n' + java.util.Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new java.util.ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new defpackage.dum((dsy) arrayList.get(i3)));
        }
        if (i == 0) {
            dsz dszVar4 = dszVar;
            iO = dsq.o(dszVar4.J);
            iO2 = dsq.o(dszVar4.L);
            dsqVar.k();
        } else {
            dsz dszVar5 = dszVar;
            iO = dsq.o(dszVar5.K);
            iO2 = dsq.o(dszVar5.M);
            dsqVar.k();
        }
        return iO2 - iO;
    }

    public final void b(java.util.ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                defpackage.dtq dtqVar = (defpackage.dtq) arrayList.get(i);
                if (this.f == dtqVar.c) {
                    c(this.d, dtqVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, defpackage.dtq dtqVar) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dsy dsyVar = (dsy) arrayList.get(i2);
            dtqVar.d(dsyVar);
            if (i == 0) {
                dsyVar.ao = dtqVar.c;
            } else {
                dsyVar.ap = dtqVar.c;
            }
        }
        this.f = dtqVar.c;
    }

    public final boolean d(dsy dsyVar) {
        java.util.ArrayList arrayList = this.b;
        if (arrayList.contains(dsyVar)) {
            return false;
        }
        arrayList.add(dsyVar);
        return true;
    }

    public final java.lang.String toString() {
        int i = this.d;
        java.lang.String str = (i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both") + " [" + this.c + "] <";
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ' ' + ((dsy) arrayList.get(i2)).ai;
        }
        return str.concat(" >");
    }
}
