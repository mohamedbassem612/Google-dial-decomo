package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaor implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        android.os.IBinder iBinderN = null;
        java.lang.String strU = null;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        int I = 0;
        int I2 = 0;
        float fH = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        float fH5 = 0.0f;
        float fH6 = 1.0f;
        float fH7 = 0.5f;
        com.google.android.gms.maps.model.LatLng latLng = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        android.os.IBinder iBinderN2 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            com.google.android.gms.maps.model.LatLng latLng2 = latLng;
            switch ((char) i) {
                case 2:
                    latLng = (com.google.android.gms.maps.model.LatLng) aais.O(parcel, i, com.google.android.gms.maps.model.LatLng.CREATOR);
                    continue;
                case 3:
                    strU2 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    strU3 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    iBinderN2 = aais.N(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    fH = aais.H(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    fH2 = aais.H(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    zAb = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    zAb2 = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    zAb3 = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    fH3 = aais.H(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    fH7 = aais.H(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    fH4 = aais.H(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    fH6 = aais.H(parcel, i);
                    break;
                case 15:
                    fH5 = aais.H(parcel, i);
                    break;
                case 16:
                default:
                    aais.aa(parcel, i);
                    break;
                case 17:
                    I = aais.I(parcel, i);
                    break;
                case 18:
                    iBinderN = aais.N(parcel, i);
                    break;
                case 19:
                    I2 = aais.I(parcel, i);
                    break;
                case 20:
                    strU = aais.U(parcel, i);
                    break;
            }
            latLng = latLng2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.maps.model.MarkerOptions(latLng, strU2, strU3, iBinderN2, fH, fH2, zAb, zAb2, zAb3, fH3, fH7, fH4, fH6, fH5, I, iBinderN, I2, strU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.model.MarkerOptions[i];
    }
}
