package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gia {
    public final java.lang.String a;
    public final boolean b;
    public final java.util.List c;
    public java.util.List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public gia(java.lang.String str, boolean z, java.util.List list, java.util.List list2) {
        aooh.f(str, "name");
        aooh.f(list, "columns");
        aooh.f((java.lang.Object) list2, "orders");
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gia) {
            defpackage.gia giaVar = (defpackage.gia) obj;
            if (this.b == giaVar.b && aooh.n(this.c, giaVar.c) && aooh.n(this.d, giaVar.d)) {
                java.lang.String str = this.a;
                return aoov.ad(str, "index_") ? aoov.ad(giaVar.a, "index_") : aooh.n(str, giaVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((((((aoov.ad(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return aoov.m(aoov.n("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + defpackage.hgu.P(this.c) + "\n            |   orders = {" + defpackage.hgu.O(this.d) + "\n            |}\n        "));
    }
}
