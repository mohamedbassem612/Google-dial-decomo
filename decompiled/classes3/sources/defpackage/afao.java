package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afao {
    public final java.lang.String a;
    private final java.util.List b;

    public afao(java.lang.String str, java.util.List list) {
        this.a = str;
        this.b = list;
    }

    public final java.lang.String[] a() {
        return (java.lang.String[]) this.b.toArray(new java.lang.String[0]);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afao) {
            defpackage.afao afaoVar = (defpackage.afao) obj;
            if (this.a.equals(afaoVar.a) && this.b.equals(afaoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SafeSql{query=" + this.a + ", queryArgs=" + this.b.toString() + '}';
    }

    public afao() {
        throw null;
    }
}
