package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FileData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(12);
    public final android.os.ParcelFileDescriptor a;
    public final java.lang.String b;
    public final java.lang.String c;

    public FileData(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.FileData) {
            com.google.android.gms.people.cpg.callingcard.v2.FileData fileData = (com.google.android.gms.people.cpg.callingcard.v2.FileData) obj;
            if (j$.util.Objects.equals(this.b, fileData.b) && j$.util.Objects.equals(this.c, fileData.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, parcelFileDescriptor, i | 1);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
