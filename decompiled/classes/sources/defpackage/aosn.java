package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosn {
    public static final defpackage.aolr a(defpackage.aolr aolrVar, defpackage.aolr aolrVar2) {
        return !d(aolrVar2) ? aolrVar.plus(aolrVar2) : (defpackage.aolr) aolrVar2.fold(aolrVar, new defpackage.dkm(15));
    }

    public static final defpackage.aolr b(defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        defpackage.aolr aolrVarPlus;
        defpackage.aolr aolrVarC = aossVar.c();
        if (aolrVar == defpackage.aols.a || !d(aolrVar)) {
            aolrVarPlus = ((defpackage.aolr) aolrVarC.fold(aolrVarC, new defpackage.dkm(17))).plus(aolrVar);
        } else {
            defpackage.aoot aootVar = new defpackage.aoot();
            aootVar.a = aolrVar;
            aolrVarPlus = (defpackage.aolr) ((defpackage.aolr) aootVar.a).fold((defpackage.aolr) aolrVarC.fold(aolrVarC, new defpackage.apaq(aootVar, 1)), new defpackage.dkm(18));
        }
        defpackage.aolr aolrVarPlus2 = defpackage.aosu.a ? aolrVarPlus.plus(new defpackage.aosq(defpackage.aosu.c.incrementAndGet())) : aolrVarPlus;
        defpackage.aosp aospVar = defpackage.aoth.a;
        return (aolrVarPlus == aospVar || aolrVarPlus.get(defpackage.aolo.k) != null) ? aolrVarPlus2 : aolrVarPlus2.plus(aospVar);
    }

    public static final defpackage.aovo c(defpackage.aoln aolnVar, defpackage.aolr aolrVar, java.lang.Object obj) {
        defpackage.aovo aovoVar = null;
        if ((aolnVar instanceof defpackage.aome) && aolrVar.get(defpackage.aovp.a) != null) {
            defpackage.aome aomeVarCK = (defpackage.aome) aolnVar;
            while (!(aomeVarCK instanceof defpackage.aote) && (aomeVarCK = aomeVarCK.cK()) != null) {
                if (aomeVarCK instanceof defpackage.aovo) {
                    aovoVar = (defpackage.aovo) aomeVarCK;
                    break;
                }
            }
            if (aovoVar != null) {
                aovoVar.W(aolrVar, obj);
            }
        }
        return aovoVar;
    }

    private static final boolean d(defpackage.aolr aolrVar) {
        j$.util.Objects.checkIndex(0, 3);
        if (aolrVar != null) {
            if (aolrVar instanceof defpackage.ahrd) {
                return true;
            }
            if (aolrVar instanceof defpackage.aolp) {
                return false;
            }
        }
        return ((java.lang.Boolean) aolrVar.fold(java.lang.Boolean.FALSE, new defpackage.dkm(16))).booleanValue();
    }
}
