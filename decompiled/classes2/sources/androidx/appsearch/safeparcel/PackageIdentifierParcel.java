package androidx.appsearch.safeparcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PackageIdentifierParcel extends defpackage.rm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(14);
    public final java.lang.String a;
    public final byte[] b;
    public final byte[][] c;

    public PackageIdentifierParcel(java.lang.String str, byte[] bArr, byte[][] bArr2) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        if (bArr2 == null || bArr2.length <= 0) {
            if (bArr == null) {
                throw new java.lang.IllegalArgumentException("Either sha256Certificate or multiSignerSha256Certificates must be non-null");
            }
            this.b = bArr;
            this.c = null;
            return;
        }
        for (int i = 0; i < bArr2.length; i++) {
            j$.util.Objects.requireNonNull(bArr2[i], a.bs(i, "Certificate at index ", " cannot be null"));
        }
        this.c = bArr2;
        this.b = bArr2[0];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.appsearch.safeparcel.PackageIdentifierParcel) {
            androidx.appsearch.safeparcel.PackageIdentifierParcel packageIdentifierParcel = (androidx.appsearch.safeparcel.PackageIdentifierParcel) obj;
            if (this.a.equals(packageIdentifierParcel.a) && java.util.Arrays.equals(this.b, packageIdentifierParcel.b) && java.util.Arrays.deepEquals(this.c, packageIdentifierParcel.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Integer.valueOf(java.util.Arrays.deepHashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        j$.util.Objects.requireNonNull(this);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("packageName", this.a);
        bundle.putByteArray("sha256Certificate", this.b);
        byte[][] bArr = this.c;
        if (bArr != null) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(bArr.length);
            for (byte[] bArr2 : bArr) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putByteArray("sha256Certificate", bArr2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("sha256Certificates", arrayList);
        }
        parcel.writeBundle(bundle);
    }
}
