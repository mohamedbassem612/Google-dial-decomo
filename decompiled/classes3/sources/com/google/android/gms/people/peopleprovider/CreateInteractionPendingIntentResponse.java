package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CreateInteractionPendingIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(13);
    public final android.app.PendingIntent a;

    public CreateInteractionPendingIntentResponse(android.app.PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.CreateInteractionPendingIntentResponse) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.people.peopleprovider.CreateInteractionPendingIntentResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("pendingIntent", this.a, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.app.PendingIntent pendingIntent = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, pendingIntent, i);
        aais.g(parcel, iF);
    }
}
