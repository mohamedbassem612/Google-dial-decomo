package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class eoq {
    public final java.util.Map b = new java.util.LinkedHashMap();

    public abstract java.lang.Object a(defpackage.eop eopVar);

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.eoq) && defpackage.aooh.n(this.b, ((defpackage.eoq) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
