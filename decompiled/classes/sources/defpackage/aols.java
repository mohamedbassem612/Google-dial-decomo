package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aols implements java.io.Serializable, defpackage.aolr {
    public static final defpackage.aols a = new defpackage.aols();
    private static final long serialVersionUID = 0;

    private aols() {
    }

    private final java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        if (aolqVar != null) {
            return null;
        }
        defpackage.aooh.i("key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        defpackage.aooh.f(aolqVar, "key");
        return this;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return aolrVar;
    }

    public final java.lang.String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return obj;
    }
}
