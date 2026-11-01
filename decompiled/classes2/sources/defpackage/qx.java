package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qx {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.util.Set e;

    public qx(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Set set) {
        dzk.x(str);
        this.a = str;
        dzk.x(str2);
        this.b = str2;
        dzk.x(str3);
        this.c = str3;
        dzk.x(str4);
        this.d = str4;
        dzk.x(set);
        this.e = j$.util.DesugarCollections.unmodifiableSet(set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qx) {
            defpackage.qx qxVar = (defpackage.qx) obj;
            if (this.a.equals(qxVar.a) && this.b.equals(qxVar.b) && this.c.equals(qxVar.c) && this.d.equals(qxVar.d) && this.e.equals(qxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final java.lang.String toString() {
        return "DocumentChangeInfo{packageName='" + this.a + "', database='" + this.b + "', namespace='" + this.c + "', schemaName='" + this.d + "', changedDocumentIds='" + this.e + "'}";
    }
}
