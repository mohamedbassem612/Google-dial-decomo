package com.google.android.libraries.notifications.platform.registration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Zwieback implements com.google.android.libraries.notifications.platform.registration.AccountRepresentation {
    public static final com.google.android.libraries.notifications.platform.registration.Zwieback a = new com.google.android.libraries.notifications.platform.registration.Zwieback();
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(12);

    private Zwieback() {
    }

    @Override // com.google.android.libraries.notifications.platform.registration.AccountRepresentation
    public final java.lang.String a() {
        return "signed_out";
    }

    @Override // com.google.android.libraries.notifications.platform.registration.AccountRepresentation
    public final /* synthetic */ boolean b() {
        return defpackage.agab.by(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.notifications.platform.registration.Zwieback)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1004849924;
    }

    public final java.lang.String toString() {
        return "Zwieback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aooh.f(parcel, "dest");
        parcel.writeInt(1);
    }
}
