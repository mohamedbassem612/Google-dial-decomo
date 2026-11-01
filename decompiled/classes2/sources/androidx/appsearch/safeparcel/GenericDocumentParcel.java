package androidx.appsearch.safeparcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class GenericDocumentParcel extends defpackage.rm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(13);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final long e;
    public final int f;
    public final java.util.List g;
    public final java.util.List h;
    public final java.util.Map i;
    private java.lang.Integer j;

    public GenericDocumentParcel(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, int i, java.util.List list, java.util.List list2) {
        j$.util.Objects.requireNonNull(list);
        aca acaVar = new aca(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.appsearch.safeparcel.PropertyParcel propertyParcel = (androidx.appsearch.safeparcel.PropertyParcel) list.get(i2);
            acaVar.put(propertyParcel.a, propertyParcel);
        }
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = (java.lang.String) j$.util.Objects.requireNonNull(str2);
        this.c = (java.lang.String) j$.util.Objects.requireNonNull(str3);
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = (java.util.List) j$.util.Objects.requireNonNull(list);
        this.i = (java.util.Map) j$.util.Objects.requireNonNull(acaVar);
        this.h = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.appsearch.safeparcel.GenericDocumentParcel) {
            androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel = (androidx.appsearch.safeparcel.GenericDocumentParcel) obj;
            if (this.a.equals(genericDocumentParcel.a) && this.b.equals(genericDocumentParcel.b) && this.c.equals(genericDocumentParcel.c) && this.e == genericDocumentParcel.e && this.d == genericDocumentParcel.d && this.f == genericDocumentParcel.f && j$.util.Objects.equals(this.g, genericDocumentParcel.g) && j$.util.Objects.equals(this.i, genericDocumentParcel.i) && j$.util.Objects.equals(this.h, genericDocumentParcel.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.j;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, java.lang.Long.valueOf(this.e), java.lang.Integer.valueOf(this.f), java.lang.Long.valueOf(this.d), java.lang.Integer.valueOf(j$.util.Objects.hashCode(this.g)), java.lang.Integer.valueOf(j$.util.Objects.hashCode(this.i)), java.lang.Integer.valueOf(j$.util.Objects.hashCode(this.h))}));
            this.j = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("namespace", this.a);
        bundle.putString("id", this.b);
        bundle.putString("schemaType", this.c);
        bundle.putStringArrayList("parentTypes", (java.util.ArrayList) this.h);
        bundle.putInt("score", this.f);
        bundle.putLong("creationTimestampMillis", this.d);
        bundle.putLong("ttlMillis", this.e);
        android.os.Bundle bundle2 = new android.os.Bundle();
        int i2 = 0;
        while (true) {
            java.util.List list = this.g;
            if (i2 >= list.size()) {
                bundle.putBundle("properties", bundle2);
                parcel.writeBundle(bundle);
                return;
            } else {
                androidx.appsearch.safeparcel.PropertyParcel propertyParcel = (androidx.appsearch.safeparcel.PropertyParcel) list.get(i2);
                bundle2.putParcelable(propertyParcel.a, propertyParcel);
                i2++;
            }
        }
    }
}
