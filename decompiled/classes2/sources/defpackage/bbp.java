package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bbp implements bcw {
    public defpackage.bcb a;
    public rai b;

    public final int a() {
        java.util.List list = q().l;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return u((defpackage.bcc) list.get(0));
    }

    public final int b() {
        defpackage.bcb bcbVarQ = q();
        if (true != (bcbVarQ instanceof defpackage.bcb)) {
            bcbVarQ = null;
        }
        if (bcbVarQ == null || e() == 0) {
            return -1;
        }
        return ((java.lang.Number) bcbVarQ.i.a(java.lang.Integer.valueOf(e() - 1))).intValue();
    }

    public final int c() {
        java.util.List list = q().l;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return u((defpackage.bcc) list.get(list.size() - 1));
    }

    public final int d() {
        return mni.bw(q());
    }

    public final int e() {
        return q().n;
    }

    public final int f(int i) {
        return a() + i;
    }

    public final int g(int i) {
        int iA = i + a();
        java.util.List list = q().l;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            if (u((defpackage.bcc) obj) == iA) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            iMax = java.lang.Math.max(ru.e((defpackage.bcc) arrayList.get(i3), q().o), iMax);
        }
        return iMax;
    }

    public final int h() {
        return (c() - a()) + 1;
    }

    public final int i(int i) {
        defpackage.bcb bcbVarQ = q();
        if (true != (bcbVarQ instanceof defpackage.bcb)) {
            bcbVarQ = null;
        }
        if (bcbVarQ == null) {
            return -1;
        }
        java.util.List list = (java.util.List) bcbVarQ.h.a(java.lang.Integer.valueOf(i));
        if (list.isEmpty()) {
            return -1;
        }
        return (-1) + ((java.lang.Number) ((aoiu) ajsz.bE(list)).a).intValue() + list.size();
    }

    public final dpf j() {
        defpackage.bcb bcbVarQ = q();
        if (true != (bcbVarQ instanceof defpackage.bcb)) {
            bcbVarQ = null;
        }
        if (bcbVarQ != null) {
            return bcbVarQ.g;
        }
        return null;
    }

    public final java.lang.Object k(int i) {
        int iA = i + a();
        java.util.List list = q().l;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            if (u((defpackage.bcc) obj) == iA) {
                arrayList.add(obj);
            }
        }
        defpackage.bcc bccVar = (defpackage.bcc) (arrayList.isEmpty() ? null : arrayList.get(0));
        return bccVar != null ? bccVar.b : bcx.c;
    }

    public final void l(int[] iArr) {
        iArr[0] = a();
    }

    public final void m(int[] iArr) {
        iArr[0] = c();
    }

    public final void n(int[] iArr) {
        java.util.List list = q().l;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.bcc bccVar = (defpackage.bcc) list.get(list.size() - 1);
        iArr[0] = java.lang.Math.abs(((ru.d(bccVar, q().o) + ru.e(bccVar, q().o)) + q().q) - q().m);
    }

    public final void o(int[] iArr) {
        java.util.List list = q().l;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int iD = ru.d((defpackage.bcc) list.get(0), q().o) + q().a();
        if (iD > 0) {
            iD = 0;
        }
        iArr[0] = java.lang.Math.abs(iD);
    }

    public final boolean p() {
        return !q().l.isEmpty();
    }

    public final defpackage.bcb q() {
        defpackage.bcb bcbVar = this.a;
        if (bcbVar != null) {
            return bcbVar;
        }
        aooh.j("layoutInfo");
        return null;
    }

    public final /* synthetic */ int r(int i) {
        return i + 1;
    }

    public final /* synthetic */ int s(int i) {
        return i - 1;
    }

    public final java.util.List t(int i, aonj aonjVar) {
        defpackage.ben benVarA;
        rai raiVar = this.b;
        if (raiVar == null) {
            aooh.j("prefetchScope");
            raiVar = null;
        }
        defpackage.auj aujVar = new defpackage.auj(aonjVar, 12);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.Object obj = raiVar.a;
        ajxw ajxwVar = ckw.i;
        cko ckoVar = (cko) ajxwVar.i();
        aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        cko ckoVarH = cfd.h(ckoVar);
        try {
            defpackage.bcb bcbVar = ((defpackage.bcl) obj).b ? ((defpackage.bcl) obj).c : (defpackage.bcb) ((defpackage.bcl) obj).d.a();
            if (bcbVar != null) {
                aoor aoorVar = new aoor();
                aoorVar.a = 1;
                java.util.List list = (java.util.List) bcbVar.h.a(java.lang.Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    aoiu aoiuVar = (aoiu) list.get(i2);
                    cko ckoVar2 = (cko) ajxwVar.i();
                    aonj aonjVarI2 = ckoVar2 != null ? ckoVar2.i() : null;
                    java.util.ArrayList arrayList3 = arrayList2;
                    cko ckoVarH2 = cfd.h(ckoVar2);
                    java.lang.Object obj2 = obj;
                    try {
                        beo beoVar = ((defpackage.bcb) ((defpackage.bcl) obj2).d.a()).k;
                        cfd.i(ckoVar2, ckoVarH2, aonjVarI2);
                        beo beoVar2 = beoVar == null ? null : beoVar;
                        if (beoVar2 != null) {
                            arrayList2 = arrayList3;
                            benVarA = beoVar2.a(((java.lang.Number) aoiuVar.a).intValue(), ((dpd) aoiuVar.b).a, false, new defpackage.dqw(arrayList2, aoorVar, list, aujVar, bcbVar, 1));
                        } else {
                            arrayList2 = arrayList3;
                            benVarA = null;
                        }
                        if (benVarA != null) {
                            arrayList.add(benVarA);
                        }
                        i2++;
                        obj = obj2;
                    } catch (java.lang.Throwable th) {
                        cfd.i(ckoVar2, ckoVarH2, aonjVarI2);
                        throw th;
                    }
                }
            }
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            return arrayList;
        } catch (java.lang.Throwable th2) {
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th2;
        }
    }

    public final int u(defpackage.bcc bccVar) {
        return vn.d(bccVar, q().o);
    }
}
