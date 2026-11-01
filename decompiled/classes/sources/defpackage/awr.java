package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class awr implements defpackage.cye {
    public final defpackage.cmj a;
    private final boolean b;

    public awr(defpackage.cmj cmjVar, boolean z) {
        this.a = cmjVar;
        this.b = z;
    }

    @Override // defpackage.cye
    public final /* synthetic */ int a(defpackage.cxf cxfVar, java.util.List list, int i) {
        return defpackage.vn.f(this, cxfVar, list, i);
    }

    @Override // defpackage.cye
    public final /* synthetic */ int b(defpackage.cxf cxfVar, java.util.List list, int i) {
        return defpackage.vn.g(this, cxfVar, list, i);
    }

    @Override // defpackage.cye
    public final /* synthetic */ int c(defpackage.cxf cxfVar, java.util.List list, int i) {
        return defpackage.vn.h(this, cxfVar, list, i);
    }

    @Override // defpackage.cye
    public final /* synthetic */ int d(defpackage.cxf cxfVar, java.util.List list, int i) {
        return defpackage.vn.i(this, cxfVar, list, i);
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(final defpackage.cyi cyiVar, final java.util.List list, long j) {
        if (list.isEmpty()) {
            return cyiVar.du(defpackage.dpd.d(j), defpackage.dpd.c(j), defpackage.aokd.a, new defpackage.aln(10));
        }
        long j2 = this.b ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final defpackage.cyd cydVar = (defpackage.cyd) list.get(0);
            defpackage.awo.a(cydVar);
            final defpackage.czc czcVarV = cydVar.v(j2);
            final int iMax = java.lang.Math.max(defpackage.dpd.d(j), czcVarV.a);
            final int iMax2 = java.lang.Math.max(defpackage.dpd.c(j), czcVarV.b);
            return cyiVar.du(iMax, iMax2, defpackage.aokd.a, new defpackage.aonj() { // from class: awp
                @Override // defpackage.aonj
                public final java.lang.Object a(java.lang.Object obj) {
                    defpackage.awo.d((defpackage.czb) obj, czcVarV, cydVar, cyiVar.p(), iMax, iMax2, this.a);
                    return defpackage.aojh.a;
                }
            });
        }
        final defpackage.czc[] czcVarArr = new defpackage.czc[list.size()];
        final defpackage.aoor aoorVar = new defpackage.aoor();
        aoorVar.a = defpackage.dpd.d(j);
        final defpackage.aoor aoorVar2 = new defpackage.aoor();
        aoorVar2.a = defpackage.dpd.c(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.cyd cydVar2 = (defpackage.cyd) list.get(i);
            defpackage.awo.a(cydVar2);
            defpackage.czc czcVarV2 = cydVar2.v(j2);
            czcVarArr[i] = czcVarV2;
            aoorVar.a = java.lang.Math.max(aoorVar.a, czcVarV2.a);
            aoorVar2.a = java.lang.Math.max(aoorVar2.a, czcVarV2.b);
        }
        return cyiVar.du(aoorVar.a, aoorVar2.a, defpackage.aokd.a, new defpackage.aonj() { // from class: awq
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.czb czbVar = (defpackage.czb) obj;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    defpackage.czc[] czcVarArr2 = czcVarArr;
                    if (i2 >= czcVarArr2.length) {
                        return defpackage.aojh.a;
                    }
                    defpackage.czc czcVar = czcVarArr2[i2];
                    int i4 = i3 + 1;
                    if (czcVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    }
                    defpackage.awr awrVar = this;
                    defpackage.aoor aoorVar3 = aoorVar2;
                    defpackage.awo.d(czbVar, czcVar, (defpackage.cyd) list.get(i3), cyiVar.p(), aoorVar.a, aoorVar3.a, awrVar.a);
                    i2++;
                    i3 = i4;
                }
            }
        });
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.awr) {
            defpackage.awr awrVar = (defpackage.awr) obj;
            if (defpackage.aooh.n(this.a, awrVar.a) && this.b == awrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
