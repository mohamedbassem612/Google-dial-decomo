package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class se extends defpackage.rm {
    public final boolean a;
    public final java.util.List b;

    public se(boolean z, java.util.List list) {
        this.a = z;
        this.b = (java.util.List) j$.util.Objects.requireNonNull(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.se) {
            defpackage.se seVar = (defpackage.se) obj;
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(seVar.a)) && j$.util.Objects.equals(this.b, seVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return "{indexNestedProperties: " + this.a + ", indexableNestedPropertiesList: " + this.b + '}';
    }
}
