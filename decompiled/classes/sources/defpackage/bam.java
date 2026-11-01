package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bam implements defpackage.bcw {
    public defpackage.bay a;
    public defpackage.apnt b;

    @Override // defpackage.bcw
    public final int a() {
        java.util.List list = q().k;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return ((defpackage.baz) list.get(0)).a;
    }

    @Override // defpackage.bcw
    public final int b() {
        if (e() != 0) {
            return (-1) + e();
        }
        return -1;
    }

    @Override // defpackage.bcw
    public final int c() {
        java.util.List list = q().k;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return ((defpackage.baz) list.get(list.size() - 1)).a;
    }

    @Override // defpackage.bcw
    public final int d() {
        return defpackage.den.be(q());
    }

    @Override // defpackage.bcw
    public final int e() {
        return q().n;
    }

    @Override // defpackage.bcw
    public final int f(int i) {
        return ((defpackage.baz) q().k.get(i)).a;
    }

    @Override // defpackage.bcw
    public final int g(int i) {
        return ((defpackage.baz) q().k.get(i)).h;
    }

    @Override // defpackage.bcw
    public final int h() {
        return q().k.size();
    }

    @Override // defpackage.bcw
    public final defpackage.dpf j() {
        defpackage.bay bayVarQ = q();
        if (true != (bayVarQ instanceof defpackage.bay)) {
            bayVarQ = null;
        }
        if (bayVarQ != null) {
            return bayVarQ.g;
        }
        return null;
    }

    @Override // defpackage.bcw
    public final java.lang.Object k(int i) {
        return ((defpackage.baz) q().k.get(i)).e;
    }

    @Override // defpackage.bcw
    public final void l(int[] iArr) {
        iArr[0] = a();
    }

    @Override // defpackage.bcw
    public final void m(int[] iArr) {
        iArr[0] = c();
    }

    @Override // defpackage.bcw
    public final void n(int[] iArr) {
        java.util.List list = q().k;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.baz bazVar = (defpackage.baz) list.get(list.size() - 1);
        iArr[0] = java.lang.Math.abs(((bazVar.g + bazVar.h) + q().q) - q().m);
    }

    @Override // defpackage.bcw
    public final void o(int[] iArr) {
        java.util.List list = q().k;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int iA = ((defpackage.baz) list.get(0)).g + q().a();
        if (iA > 0) {
            iA = 0;
        }
        iArr[0] = java.lang.Math.abs(iA);
    }

    @Override // defpackage.bcw
    public final boolean p() {
        return !q().k.isEmpty();
    }

    public final defpackage.bay q() {
        defpackage.bay bayVar = this.a;
        if (bayVar != null) {
            return bayVar;
        }
        defpackage.aooh.j("layoutInfo");
        return null;
    }

    @Override // defpackage.bcw
    public final /* synthetic */ int r(int i) {
        return i + 1;
    }

    @Override // defpackage.bcw
    public final /* synthetic */ int s(int i) {
        return i - 1;
    }

    @Override // defpackage.bcw
    public final java.util.List t(int i, defpackage.aonj aonjVar) {
        defpackage.apnt apntVar = this.b;
        if (apntVar == null) {
            defpackage.aooh.j("prefetchScope");
            apntVar = null;
        }
        auj aujVar = new auj(aonjVar, 11);
        java.lang.Object obj = apntVar.a;
        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
        defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
        try {
            defpackage.bay bayVar = (defpackage.bay) ((defpackage.bbh) obj).f.a();
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            java.lang.Object obj2 = apntVar.a;
            defpackage.cko ckoVar2 = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI2 = ckoVar2 != null ? ckoVar2.i() : null;
            defpackage.cko ckoVarH2 = defpackage.cfd.h(ckoVar2);
            try {
                defpackage.beo beoVar = ((defpackage.bay) ((defpackage.bbh) obj2).f.a()).j;
                defpackage.cfd.i(ckoVar2, ckoVarH2, aonjVarI2);
                if (beoVar == null) {
                    beoVar = null;
                }
                ben benVarA = beoVar != null ? beoVar.a(i, bayVar.h, ((defpackage.bbh) apntVar.a).d, new aum(aujVar, bayVar, 7, (byte[]) null)) : null;
                if (benVarA == null) {
                    benVarA = bdb.a;
                }
                java.util.List listSingletonList = java.util.Collections.singletonList(benVarA);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                return listSingletonList;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar2, ckoVarH2, aonjVarI2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th2;
        }
    }

    @Override // defpackage.bcw
    public final int i(int i) {
        return i;
    }
}
