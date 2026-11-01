package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ra {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.util.Set c;

    public ra(java.lang.String str, java.lang.String str2, java.util.Set set) {
        dzk.x(str);
        this.a = str;
        dzk.x(str2);
        this.b = str2;
        dzk.x(set);
        this.c = j$.util.DesugarCollections.unmodifiableSet(set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ra) {
            defpackage.ra raVar = (defpackage.ra) obj;
            if (this.a.equals(raVar.a) && this.b.equals(raVar.b) && this.c.equals(raVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        return "SchemaChangeInfo{packageName='" + this.a + "', databaseName='" + this.b + "', changedSchemaNames='" + this.c + "'}";
    }
}
