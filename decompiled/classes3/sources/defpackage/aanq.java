package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aanq implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        android.os.WorkSource workSource = new android.os.WorkSource();
        com.google.android.gms.libs.identity.ClientIdentity clientIdentity = null;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 102;
        long jL = -1;
        long jL2 = 3600000;
        boolean zAb2 = false;
        float fH = 0.0f;
        long jL3 = 600000;
        int I4 = Integer.MAX_VALUE;
        long jL4 = Long.MAX_VALUE;
        long jL5 = Long.MAX_VALUE;
        long jL6 = 0;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            int i2 = I3;
            switch ((char) i) {
                case 1:
                    I3 = aais.I(parcel, i);
                    continue;
                case 2:
                    jL2 = aais.L(parcel, i);
                    break;
                case 3:
                    jL3 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                default:
                    aais.aa(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    jL4 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    I3 = i2;
                    I4 = aais.I(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    I3 = i2;
                    fH = aais.H(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    jL6 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    I3 = i2;
                    zAb2 = aais.ab(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    jL5 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    jL = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    I3 = i2;
                    I = aais.I(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    I3 = i2;
                    I2 = aais.I(parcel, i);
                    continue;
                case 15:
                    I3 = i2;
                    zAb = aais.ab(parcel, i);
                    continue;
                case 16:
                    I3 = i2;
                    workSource = (android.os.WorkSource) aais.O(parcel, i, android.os.WorkSource.CREATOR);
                    continue;
                case 17:
                    I3 = i2;
                    clientIdentity = (com.google.android.gms.libs.identity.ClientIdentity) aais.O(parcel, i, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                    continue;
            }
            I3 = i2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.location.LocationRequest(I3, jL2, jL3, jL6, jL4, jL5, I4, fH, zAb2, jL, I, I2, zAb, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.location.LocationRequest[i];
    }
}
