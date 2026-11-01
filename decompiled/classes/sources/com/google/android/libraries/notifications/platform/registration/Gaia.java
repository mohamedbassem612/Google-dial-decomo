package com.google.android.libraries.notifications.platform.registration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Gaia implements com.google.android.libraries.notifications.platform.registration.AccountRepresentation {
    public static final android.os.Parcelable.Creator CREATOR = new acay(5);
    public final java.lang.String a;

    public Gaia(java.lang.String str) {
        defpackage.aooh.f(str, "accountName");
        this.a = str;
    }

    @Override // com.google.android.libraries.notifications.platform.registration.AccountRepresentation
    public final java.lang.String a() {
        return this.a;
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
        if (this != obj) {
            return (obj instanceof com.google.android.libraries.notifications.platform.registration.Gaia) && defpackage.aooh.n(this.a, ((com.google.android.libraries.notifications.platform.registration.Gaia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Gaia(accountName=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aooh.f(parcel, "dest");
        parcel.writeString(this.a);
    }
}
