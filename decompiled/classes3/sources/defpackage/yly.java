package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yly implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        java.util.ArrayList arrayListW = null;
        android.os.IBinder iBinderN = null;
        android.os.IBinder iBinderN2 = null;
        java.lang.String strU = null;
        android.os.Bundle bundleM = null;
        com.google.android.apps.aicore.aidl.UserProperties userProperties = null;
        com.google.android.apps.aicore.aidl.LLMPrefixParam lLMPrefixParam = null;
        com.google.android.apps.aicore.aidl.ResponseSchema responseSchema = null;
        com.google.android.apps.aicore.aidl.FunctionTools functionTools = null;
        com.google.android.apps.aicore.aidl.ThinkingConfig thinkingConfig = null;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        boolean zAb2 = false;
        float fH = 1.0f;
        float fH2 = 0.0f;
        java.util.ArrayList arrayListX = null;
        int I9 = 0;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            java.util.ArrayList arrayList = arrayListX;
            switch ((char) i) {
                case 1:
                    arrayListX = aais.X(parcel, i, com.google.android.apps.aicore.aidl.LLMMessage.CREATOR);
                    continue;
                case 2:
                    fH2 = aais.H(parcel, i);
                    break;
                case 3:
                    I9 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    arrayListW = aais.W(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    I = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    I2 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    iBinderN = aais.N(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    zAb = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    I3 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    iBinderN2 = aais.N(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    I4 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    I5 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    strU = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    bundleM = aais.M(parcel, i);
                    break;
                case 15:
                    I6 = aais.I(parcel, i);
                    break;
                case 16:
                    userProperties = (com.google.android.apps.aicore.aidl.UserProperties) aais.O(parcel, i, com.google.android.apps.aicore.aidl.UserProperties.CREATOR);
                    break;
                case 17:
                    I7 = aais.I(parcel, i);
                    break;
                case 18:
                    lLMPrefixParam = (com.google.android.apps.aicore.aidl.LLMPrefixParam) aais.O(parcel, i, com.google.android.apps.aicore.aidl.LLMPrefixParam.CREATOR);
                    break;
                case 19:
                    I8 = aais.I(parcel, i);
                    break;
                case 20:
                    fH = aais.H(parcel, i);
                    break;
                case 21:
                    responseSchema = (com.google.android.apps.aicore.aidl.ResponseSchema) aais.O(parcel, i, com.google.android.apps.aicore.aidl.ResponseSchema.CREATOR);
                    break;
                case 22:
                    zAb2 = aais.ab(parcel, i);
                    break;
                case 23:
                    functionTools = (com.google.android.apps.aicore.aidl.FunctionTools) aais.O(parcel, i, com.google.android.apps.aicore.aidl.FunctionTools.CREATOR);
                    break;
                case 24:
                    thinkingConfig = (com.google.android.apps.aicore.aidl.ThinkingConfig) aais.O(parcel, i, com.google.android.apps.aicore.aidl.ThinkingConfig.CREATOR);
                    break;
                default:
                    aais.aa(parcel, i);
                    break;
            }
            arrayListX = arrayList;
        }
        aais.Y(parcel, iK);
        return new com.google.android.apps.aicore.aidl.LLMRequest(arrayListX, fH2, I9, arrayListW, I, I2, iBinderN, zAb, I3, iBinderN2, I4, I5, strU, bundleM, I6, userProperties, I7, lLMPrefixParam, I8, fH, responseSchema, zAb2, functionTools, thinkingConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.apps.aicore.aidl.LLMRequest[i];
    }
}
