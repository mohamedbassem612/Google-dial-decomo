package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConnectionStateEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(11);
    public final int a;
    public final java.lang.String b;

    public ConnectionStateEventParcelable(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.wearable.internal.ConnectionStateEventParcelable) {
            com.google.android.gms.wearable.internal.ConnectionStateEventParcelable connectionStateEventParcelable = (com.google.android.gms.wearable.internal.ConnectionStateEventParcelable) obj;
            if (this.a == connectionStateEventParcelable.a && j$.util.Objects.equals(this.b, connectionStateEventParcelable.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        java.lang.String strBj;
        int i = this.a;
        switch (i) {
            case -9:
                strBj = "Migration was cancelled";
                break;
            case -8:
                strBj = "Another migration is already in progress";
                break;
            case -7:
                strBj = "Connect message malformed";
                break;
            case -6:
                strBj = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strBj = "Phone switching feature disabled";
                break;
            case -4:
                strBj = "Did not receive connect msg";
                break;
            case -3:
                strBj = "No bluetooth connection";
                break;
            case -2:
                strBj = "Accounts mismatch";
                break;
            case org.chromium.net.UrlRequest$Status.INVALID /* -1 */:
                strBj = "Unknown failure";
                break;
            case 0:
                strBj = "Connected";
                break;
            case 1:
                strBj = "Connection handshake in progress";
                break;
            case 2:
                strBj = "Connection handshake complete";
                break;
            case 3:
                strBj = "Sync with old node suspended";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                strBj = "Control plane transport connected";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                strBj = "Accounts Matched";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                strBj = "Association to watch terminated";
                break;
            default:
                strBj = a.bj(i, "Unrecognized state value: ");
                break;
        }
        return java.lang.String.format("ConnectionStateEvent: address: %s, state: %s", this.b, strBj);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
