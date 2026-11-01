package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConsentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(12);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final java.util.List f;
    public final java.lang.String g;
    public final java.lang.Long h;

    public ConsentResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, java.util.List list, java.lang.String str, java.lang.Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.internal.ConsentResponse) {
            com.google.android.gms.wearable.internal.ConsentResponse consentResponse = (com.google.android.gms.wearable.internal.ConsentResponse) obj;
            if (this.a == consentResponse.a && this.b == consentResponse.b && this.c == consentResponse.c && this.d == consentResponse.d && this.e == consentResponse.e) {
                java.util.List list = consentResponse.f;
                java.util.List list2 = this.f;
                if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                    if (j$.util.Objects.equals(this.g, consentResponse.g) && j$.util.Objects.equals(this.h, consentResponse.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final java.lang.String toString() {
        return "ConsentResponse {statusCode =" + this.a + ", hasTosConsent =" + this.b + ", hasLoggingConsent =" + this.c + ", hasCloudSyncConsent =" + this.d + ", hasLocationConsent =" + this.e + ", accountConsentRecords =" + java.lang.String.valueOf(this.f) + ", nodeId =" + this.g + ", lastUpdateRequestedTime =" + this.h + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.h(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.h(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.E(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.y(parcel, 8, this.h);
        aais.g(parcel, iF);
    }
}
