package com.google.android.libraries.notifications.platform.registration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class DelegatedGaia implements com.google.android.libraries.notifications.platform.registration.AccountRepresentation {
    public static final android.os.Parcelable.Creator CREATOR = new acay(3);
    public final java.lang.String a;

    public DelegatedGaia(java.lang.String str) {
        defpackage.aooh.f(str, "obfuscatedGaiaId");
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
            return (obj instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) && defpackage.aooh.n(this.a, ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DelegatedGaia(obfuscatedGaiaId=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aooh.f(parcel, "dest");
        parcel.writeString(this.a);
    }
}
