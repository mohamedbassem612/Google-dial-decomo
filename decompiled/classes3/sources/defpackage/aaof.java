package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaof implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        byte bF = -1;
        byte bF2 = -1;
        byte bF3 = -1;
        byte bF4 = -1;
        byte bF5 = -1;
        byte bF6 = -1;
        byte bF7 = -1;
        byte bF8 = -1;
        byte bF9 = -1;
        byte bF10 = -1;
        int I = -1;
        com.google.android.gms.maps.model.CameraPosition cameraPosition = null;
        java.lang.Float fR = null;
        java.lang.Float fR2 = null;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = null;
        java.lang.Integer numS = null;
        java.lang.String strU = null;
        int I2 = 0;
        byte bF11 = -1;
        byte bF12 = -1;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            byte b = bF11;
            switch ((char) i) {
                case 2:
                    bF11 = aais.F(parcel, i);
                    continue;
                case 3:
                    bF12 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    I2 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    cameraPosition = (com.google.android.gms.maps.model.CameraPosition) aais.O(parcel, i, com.google.android.gms.maps.model.CameraPosition.CREATOR);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    bF = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    bF2 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    bF3 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    bF4 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    bF5 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    bF6 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    bF7 = aais.F(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                case 22:
                default:
                    aais.aa(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    bF8 = aais.F(parcel, i);
                    break;
                case 15:
                    bF9 = aais.F(parcel, i);
                    break;
                case 16:
                    fR = aais.R(parcel, i);
                    break;
                case 17:
                    fR2 = aais.R(parcel, i);
                    break;
                case 18:
                    latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) aais.O(parcel, i, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
                    break;
                case 19:
                    bF10 = aais.F(parcel, i);
                    break;
                case 20:
                    numS = aais.S(parcel, i);
                    break;
                case 21:
                    strU = aais.U(parcel, i);
                    break;
                case 23:
                    I = aais.I(parcel, i);
                    break;
            }
            bF11 = b;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.maps.GoogleMapOptions(bF11, bF12, I2, cameraPosition, bF, bF2, bF3, bF4, bF5, bF6, bF7, bF8, bF9, fR, fR2, latLngBounds, bF10, numS, strU, I);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.GoogleMapOptions[i];
    }
}
