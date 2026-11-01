package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aozw extends defpackage.aozv {
    public final defpackage.aoxh d;

    public aozw(defpackage.aoxh aoxhVar, defpackage.aolr aolrVar, int i, int i2) {
        super(aolrVar, i, i2);
        this.d = aoxhVar;
    }

    @Override // defpackage.aozv
    public final java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar) {
        java.lang.Object objG = g(new defpackage.apar(aowsVar), aolnVar);
        return objG != defpackage.aolu.a ? defpackage.aojh.a : objG;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aozv, defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objH;
        if (this.b == -3) {
            defpackage.aolr aolrVarU = aolnVar.u();
            defpackage.aolr aolrVarA = defpackage.aosn.a(aolrVarU, this.a);
            if (defpackage.aooh.n(aolrVarA, aolrVarU)) {
                java.lang.Object objG = g(aoxiVar, aolnVar);
                if (objG == defpackage.aolu.a) {
                    return objG;
                }
            } else {
                defpackage.cch cchVar = defpackage.aolo.k;
                if (defpackage.aooh.n(aolrVarA.get(cchVar), aolrVarU.get(cchVar))) {
                    defpackage.aolr aolrVarU2 = aolnVar.u();
                    j$.util.Objects.checkIndex(0, 3);
                    if (aoxiVar == null || (!(aoxiVar instanceof defpackage.apar) && !(aoxiVar instanceof defpackage.apal))) {
                        aoxiVar = new defpackage.apau(aoxiVar, aolrVarU2);
                    }
                    java.lang.Object objAo = defpackage.aoov.ao(aolrVarA, aoxiVar, defpackage.apcp.a(aolrVarA), new defpackage.efu(this, (defpackage.aoln) null, 8), aolnVar);
                    if (objAo == defpackage.aolu.a) {
                        return objAo;
                    }
                } else {
                    objH = defpackage.aozv.h(this, aoxiVar, aolnVar);
                    if (objH == defpackage.aolu.a) {
                        return objH;
                    }
                }
            }
        } else {
            objH = defpackage.aozv.h(this, aoxiVar, aolnVar);
            if (objH == defpackage.aolu.a) {
                return objH;
            }
        }
        return defpackage.aojh.a;
    }

    public abstract java.lang.Object g(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar);

    @Override // defpackage.aozv
    public final java.lang.String toString() {
        return this.d + " -> " + super.toString();
    }
}
