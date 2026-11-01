package com.google.android.libraries.notifications.platform.registration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Fitbit implements com.google.android.libraries.notifications.platform.registration.AccountRepresentation {
    public static final android.os.Parcelable.Creator CREATOR = new acay(4);
    public final java.lang.String a;
    public final long b;

    public Fitbit(java.lang.String str, long j) {
        defpackage.aooh.f(str, "fitbitEncodedId");
        this.a = str;
        this.b = j;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
            com.google.android.libraries.notifications.platform.registration.Fitbit fitbit = (com.google.android.libraries.notifications.platform.registration.Fitbit) obj;
            if (defpackage.aooh.n(this.a, fitbit.a) && this.b == fitbit.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + defpackage.anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "Fitbit(fitbitEncodedId=" + this.a + ", fitbitDecodedId=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aooh.f(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
