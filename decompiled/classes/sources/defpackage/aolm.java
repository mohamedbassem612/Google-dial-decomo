package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolm implements java.io.Serializable, defpackage.aolr {
    private final defpackage.aolr a;
    private final defpackage.aolp b;

    public aolm(defpackage.aolr aolrVar, defpackage.aolp aolpVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("left");
        }
        if (aolpVar == null) {
            defpackage.aooh.i("element");
        }
        this.a = aolrVar;
        this.b = aolpVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            defpackage.aolr aolrVar = this.a;
            this = aolrVar instanceof defpackage.aolm ? (defpackage.aolm) aolrVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(defpackage.aolp aolpVar) {
        return defpackage.aooh.n(get(aolpVar.getKey()), aolpVar);
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        int iA = a();
        defpackage.aolr[] aolrVarArr = new defpackage.aolr[iA];
        defpackage.aoor aoorVar = new defpackage.aoor();
        fold(defpackage.aojh.a, new zjn(aolrVarArr, aoorVar, 20));
        if (aoorVar.a == iA) {
            return new aoll(aolrVarArr);
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aolm) {
            defpackage.aolm aolmVar = (defpackage.aolm) obj;
            if (aolmVar.a() == a()) {
                while (aolmVar.b(this.b)) {
                    defpackage.aolr aolrVar = this.a;
                    if (!(aolrVar instanceof defpackage.aolm)) {
                        if (aolrVar == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        }
                        if (!aolmVar.b((defpackage.aolp) aolrVar)) {
                            break;
                        }
                        return true;
                    }
                    this = (defpackage.aolm) aolrVar;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(this.a.fold(obj, aonnVar), this.b);
    }

    @Override // defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        defpackage.aooh.f(aolqVar, "key");
        while (true) {
            defpackage.aolp aolpVar = this.b.get(aolqVar);
            if (aolpVar != null) {
                return aolpVar;
            }
            defpackage.aolr aolrVar = this.a;
            if (!(aolrVar instanceof defpackage.aolm)) {
                return aolrVar.get(aolqVar);
            }
            this = (defpackage.aolm) aolrVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        if (aolqVar == null) {
            defpackage.aooh.i("key");
        }
        defpackage.aolp aolpVar = this.b;
        defpackage.aolp aolpVar2 = aolpVar.get(aolqVar);
        defpackage.aolr aolrVar = this.a;
        if (aolpVar2 != null) {
            return aolrVar;
        }
        defpackage.aolr aolrVarMinusKey = aolrVar.minusKey(aolqVar);
        if (aolrVarMinusKey != aolrVar) {
            return aolrVarMinusKey == defpackage.aols.a ? aolpVar : new defpackage.aolm(aolrVarMinusKey, aolpVar);
        }
        return this;
    }

    @Override // defpackage.aolr
    public final /* bridge */ defpackage.aolr plus(defpackage.aolr aolrVar) {
        return defpackage.ajsz.at(this, aolrVar);
    }

    public final java.lang.String toString() {
        return "[" + fold("", new agjd(5)) + ']';
    }
}
