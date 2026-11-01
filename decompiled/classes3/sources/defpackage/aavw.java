package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aavw implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        java.lang.String strU = null;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        int I3 = 0;
        boolean zAb4 = false;
        int I4 = 0;
        int I5 = 0;
        boolean zAb5 = false;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        java.util.ArrayList arrayListW = null;
        com.google.android.gms.wearable.ConnectionRestrictions connectionRestrictions = null;
        com.google.android.gms.wearable.ConnectionDelayFilters connectionDelayFilters = null;
        boolean zAb6 = true;
        boolean zAb7 = true;
        java.lang.String strU5 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            java.lang.String str = strU;
            switch ((char) i) {
                case 2:
                    strU = aais.U(parcel, i);
                    continue;
                case 3:
                    strU5 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    I = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    I2 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    zAb = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    zAb2 = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    strU2 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    zAb3 = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    strU3 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    strU4 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    I3 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    arrayListW = aais.W(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    zAb4 = aais.ab(parcel, i);
                    break;
                case 15:
                    zAb6 = aais.ab(parcel, i);
                    break;
                case 16:
                    connectionRestrictions = (com.google.android.gms.wearable.ConnectionRestrictions) aais.O(parcel, i, com.google.android.gms.wearable.ConnectionRestrictions.CREATOR);
                    break;
                case 17:
                    zAb7 = aais.ab(parcel, i);
                    break;
                case 18:
                    connectionDelayFilters = (com.google.android.gms.wearable.ConnectionDelayFilters) aais.O(parcel, i, com.google.android.gms.wearable.ConnectionDelayFilters.CREATOR);
                    break;
                case 19:
                    I4 = aais.I(parcel, i);
                    break;
                case 20:
                    I5 = aais.I(parcel, i);
                    break;
                case 21:
                    zAb5 = aais.ab(parcel, i);
                    break;
                default:
                    aais.aa(parcel, i);
                    break;
            }
            strU = str;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.wearable.ConnectionConfiguration(strU, strU5, I, I2, zAb, zAb2, strU2, zAb3, strU3, strU4, I3, arrayListW, zAb4, zAb6, connectionRestrictions, zAb7, connectionDelayFilters, I4, I5, zAb5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.wearable.ConnectionConfiguration[i];
    }
}
