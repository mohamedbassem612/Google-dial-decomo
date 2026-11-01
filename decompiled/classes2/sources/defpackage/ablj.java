package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ablj implements aonp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ablj(java.util.List list, ablk ablkVar, int i) {
        this.$cid = i;
        this.a = list;
        this.b = ablkVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois {
        int i;
        int i2;
        if (this.$cid == 0) {
            nf nfVar = (nf) obj;
            int iIntValue = ((java.lang.Number) obj2).intValue();
            cav cavVar = (cav) obj3;
            int iIntValue2 = ((java.lang.Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (true == cavVar.B(nfVar) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= true == cavVar.z(iIntValue) ? 32 : 16;
            }
            if (cavVar.H((i & 147) != 146, i & 1)) {
                abmh abmhVar = (abmh) this.a.get(iIntValue);
                cavVar.u(-1241951600);
                abts.an((ablk) this.b, abmhVar, cavVar, 0);
                cavVar.o();
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        nf nfVar2 = (nf) obj;
        int iIntValue3 = ((java.lang.Number) obj2).intValue();
        cav cavVar2 = (cav) obj3;
        int iIntValue4 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue4 & 6) == 0) {
            i2 = (true == cavVar2.B(nfVar2) ? 4 : 2) | iIntValue4;
        } else {
            i2 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            i2 |= true == cavVar2.z(iIntValue3) ? 32 : 16;
        }
        if (cavVar2.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.jyh jyhVar = (defpackage.jyh) this.b.get(iIntValue3);
            cavVar2.u(-559704343);
            java.lang.String str = jyhVar.a.b;
            if (str != null) {
                cavVar2.u(-559629851);
                aaoo.az(str, (cmw) null, false, cfo.j(-750001167, new defpackage.jyl(jyhVar, this.a), cavVar2), cavVar2, 3072, 6);
                cavVar2.o();
            } else {
                cavVar2.u(-559472743);
                ?? r0 = this.a;
                boolean zB = cavVar2.B((java.lang.Object) r0) | cavVar2.B(jyhVar);
                java.lang.Object objG = cavVar2.g();
                if (zB || objG == cau.a) {
                    objG = new defpackage.jll((aonj) r0, jyhVar, 3);
                    cavVar2.w(objG);
                }
                defpackage.jlr.E(jyhVar, (aomy) objG, null, cavVar2, 0);
                cavVar2.o();
            }
            cavVar2.o();
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public ablj(java.util.List list, aonj aonjVar, int i) {
        this.$cid = i;
        this.b = list;
        this.a = aonjVar;
    }
}
