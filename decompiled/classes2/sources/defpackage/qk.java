package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qk extends defpackage.rm {
    final java.util.List a;
    final java.util.List b;
    final androidx.appsearch.safeparcel.PackageIdentifierParcel c;
    private java.lang.Integer d;

    public qk(java.util.List list, java.util.List list2, androidx.appsearch.safeparcel.PackageIdentifierParcel packageIdentifierParcel) {
        this.a = (java.util.List) j$.util.Objects.requireNonNull(list);
        this.b = (java.util.List) j$.util.Objects.requireNonNull(list2);
        this.c = packageIdentifierParcel;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.qk)) {
            defpackage.qk qkVar = (defpackage.qk) obj;
            if (j$.util.Objects.equals(this.a, qkVar.a) && j$.util.Objects.equals(this.b, qkVar.b) && j$.util.Objects.equals(this.c, qkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c}));
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }
}
