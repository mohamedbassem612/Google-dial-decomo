package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aars implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        java.lang.String strU = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        java.lang.String strU5 = null;
        java.lang.String strU6 = null;
        java.lang.String strU7 = null;
        java.lang.String strU8 = null;
        java.lang.String strU9 = null;
        java.lang.String strU10 = null;
        java.lang.String strU11 = null;
        java.lang.String strU12 = null;
        java.lang.String strU13 = null;
        java.lang.String strU14 = null;
        java.lang.String strU15 = null;
        java.lang.Long lT = null;
        java.lang.Boolean boolP = null;
        java.lang.Boolean boolP2 = null;
        boolean zAb = false;
        boolean zAb2 = false;
        java.lang.String strU16 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            java.lang.String str = strU16;
            switch ((char) i) {
                case 2:
                    strU16 = aais.U(parcel, i);
                    continue;
                case 3:
                    strU = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    strU2 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    strU3 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    strU4 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    strU5 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    strU6 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    strU7 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    strU8 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    strU9 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    strU10 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    strU11 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    strU12 = aais.U(parcel, i);
                    break;
                case 15:
                    strU13 = aais.U(parcel, i);
                    break;
                case 16:
                    strU14 = aais.U(parcel, i);
                    break;
                case 17:
                    strU15 = aais.U(parcel, i);
                    break;
                case 18:
                    zAb = aais.ab(parcel, i);
                    break;
                case 19:
                    zAb2 = aais.ab(parcel, i);
                    break;
                case 20:
                    lT = aais.T(parcel, i);
                    break;
                case 21:
                    boolP = aais.P(parcel, i);
                    break;
                case 22:
                    boolP2 = aais.P(parcel, i);
                    break;
                default:
                    aais.aa(parcel, i);
                    break;
            }
            strU16 = str;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.people.cpg.cpgex.CpgExDataContents(strU16, strU, strU2, strU3, strU4, strU5, strU6, strU7, strU8, strU9, strU10, strU11, strU12, strU13, strU14, strU15, zAb, zAb2, lT, boolP, boolP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.people.cpg.cpgex.CpgExDataContents[i];
    }
}
