package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ghz {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List d;
    public final java.util.List e;

    public ghz(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2) {
        aooh.f(str, "referenceTable");
        aooh.f(str2, "onDelete");
        aooh.f(str3, "onUpdate");
        aooh.f(list, "columnNames");
        aooh.f(list2, "referenceColumnNames");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ghz) {
            defpackage.ghz ghzVar = (defpackage.ghz) obj;
            if (aooh.n(this.a, ghzVar.a) && aooh.n(this.b, ghzVar.b) && aooh.n(this.c, ghzVar.c) && aooh.n(this.d, ghzVar.d)) {
                return aooh.n(this.e, ghzVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return aoov.m(aoov.n("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + defpackage.hgu.P(ajsz.bW(this.d)) + "\n            |   referenceColumnNames = {" + defpackage.hgu.O(ajsz.bW(this.e)) + "\n            |}\n        "));
    }
}
