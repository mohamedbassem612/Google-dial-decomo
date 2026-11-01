package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yma implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        int I = 0;
        java.lang.String strU = null;
        java.lang.String strU2 = null;
        java.lang.Boolean boolP = null;
        java.util.ArrayList arrayListW = null;
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchema = null;
        java.lang.Long lT = null;
        java.lang.Long lT2 = null;
        java.util.ArrayList arrayListW2 = null;
        java.lang.Long lT3 = null;
        java.lang.Long lT4 = null;
        java.lang.Double dQ = null;
        java.lang.Double dQ2 = null;
        java.lang.Long lT5 = null;
        java.lang.Long lT6 = null;
        java.lang.String strU3 = null;
        java.util.ArrayList arrayListX = null;
        java.util.ArrayList arrayListW3 = null;
        java.lang.String strU4 = null;
        android.os.Bundle bundleM = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            int i2 = I;
            switch ((char) i) {
                case 1:
                    I = aais.I(parcel, i);
                    continue;
                case 2:
                    strU = aais.U(parcel, i);
                    break;
                case 3:
                    strU2 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    boolP = aais.P(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    arrayListW = aais.W(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    responseSchema = (com.google.android.apps.aicore.aidl.ResponseSchema) aais.O(parcel, i, com.google.android.apps.aicore.aidl.ResponseSchema.CREATOR);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    lT = aais.T(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    lT2 = aais.T(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    arrayListW2 = aais.W(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    lT3 = aais.T(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    lT4 = aais.T(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    dQ = aais.Q(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    dQ2 = aais.Q(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    lT5 = aais.T(parcel, i);
                    break;
                case 15:
                    lT6 = aais.T(parcel, i);
                    break;
                case 16:
                    strU3 = aais.U(parcel, i);
                    break;
                case 17:
                    arrayListX = aais.X(parcel, i, com.google.android.apps.aicore.aidl.ResponseSchema.CREATOR);
                    break;
                case 18:
                    arrayListW3 = aais.W(parcel, i);
                    break;
                case 19:
                    strU4 = aais.U(parcel, i);
                    break;
                case 20:
                    bundleM = aais.M(parcel, i);
                    break;
                default:
                    aais.aa(parcel, i);
                    break;
            }
            I = i2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.apps.aicore.aidl.ResponseSchema(I, strU, strU2, boolP, arrayListW, responseSchema, lT, lT2, arrayListW2, lT3, lT4, dQ, dQ2, lT5, lT6, strU3, arrayListX, arrayListW3, strU4, bundleM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.apps.aicore.aidl.ResponseSchema[i];
    }
}
