package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppWearDetailsParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(3);
    public final boolean a;
    public final java.util.List b;

    public AppWearDetailsParcelable(boolean z, java.util.List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.AppWearDetailsParcelable appWearDetailsParcelable = (com.google.android.gms.wearable.internal.AppWearDetailsParcelable) obj;
            if (this.a == appWearDetailsParcelable.a && j$.util.Objects.equals(this.b, appWearDetailsParcelable.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + java.lang.String.valueOf(this.b) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, this.a);
        aais.C(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
