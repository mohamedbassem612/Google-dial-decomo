package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalv implements android.os.Parcelable.Creator {
    public static void a(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, feedbackOptions.a);
        aais.p(parcel, 3, feedbackOptions.b);
        aais.A(parcel, 5, feedbackOptions.c);
        aais.z(parcel, 6, feedbackOptions.d, i);
        aais.A(parcel, 7, feedbackOptions.e);
        aais.z(parcel, 8, feedbackOptions.f, i);
        aais.A(parcel, 9, feedbackOptions.g);
        aais.E(parcel, 10, feedbackOptions.h);
        aais.h(parcel, 11, feedbackOptions.i);
        aais.z(parcel, 12, feedbackOptions.j, i);
        aais.z(parcel, 13, feedbackOptions.k, i);
        aais.h(parcel, 14, feedbackOptions.l);
        aais.z(parcel, 15, feedbackOptions.m, i);
        aais.A(parcel, 16, feedbackOptions.n);
        aais.h(parcel, 17, feedbackOptions.o);
        aais.m(parcel, 18, feedbackOptions.p);
        aais.h(parcel, 19, feedbackOptions.q);
        aais.A(parcel, 20, feedbackOptions.r);
        aais.z(parcel, 21, feedbackOptions.s, i);
        aais.A(parcel, 22, feedbackOptions.t);
        aais.g(parcel, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        android.app.ApplicationErrorReport applicationErrorReport = null;
        java.lang.String strU = null;
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = null;
        java.lang.String strU2 = null;
        java.util.ArrayList arrayListX = null;
        com.google.android.gms.feedback.ThemeSettings themeSettings = null;
        com.google.android.gms.feedback.LogOptions logOptions = null;
        android.graphics.Bitmap bitmap = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        com.google.android.gms.feedback.AdditionalConsentConfig additionalConsentConfig = null;
        java.lang.String strU5 = null;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        boolean zAb4 = false;
        long jL = 0;
        java.lang.String strU6 = null;
        android.os.Bundle bundleM = null;
        java.lang.String strU7 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            java.lang.String str = strU6;
            switch ((char) i) {
                case 2:
                    strU6 = aais.U(parcel, i);
                    continue;
                case 3:
                    strU6 = str;
                    bundleM = aais.M(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                default:
                    aais.aa(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    strU6 = str;
                    strU7 = aais.U(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    strU6 = str;
                    applicationErrorReport = (android.app.ApplicationErrorReport) aais.O(parcel, i, android.app.ApplicationErrorReport.CREATOR);
                    continue;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    strU6 = str;
                    strU = aais.U(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    strU6 = str;
                    bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) aais.O(parcel, i, com.google.android.gms.common.data.BitmapTeleporter.CREATOR);
                    continue;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    strU6 = str;
                    strU2 = aais.U(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    strU6 = str;
                    arrayListX = aais.X(parcel, i, com.google.android.gms.feedback.FileTeleporter.CREATOR);
                    continue;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    strU6 = str;
                    zAb = aais.ab(parcel, i);
                    continue;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    strU6 = str;
                    themeSettings = (com.google.android.gms.feedback.ThemeSettings) aais.O(parcel, i, com.google.android.gms.feedback.ThemeSettings.CREATOR);
                    continue;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    strU6 = str;
                    logOptions = (com.google.android.gms.feedback.LogOptions) aais.O(parcel, i, com.google.android.gms.feedback.LogOptions.CREATOR);
                    continue;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    strU6 = str;
                    zAb2 = aais.ab(parcel, i);
                    continue;
                case 15:
                    strU6 = str;
                    bitmap = (android.graphics.Bitmap) aais.O(parcel, i, android.graphics.Bitmap.CREATOR);
                    continue;
                case 16:
                    strU6 = str;
                    strU3 = aais.U(parcel, i);
                    continue;
                case 17:
                    strU6 = str;
                    zAb3 = aais.ab(parcel, i);
                    continue;
                case 18:
                    jL = aais.L(parcel, i);
                    break;
                case 19:
                    strU6 = str;
                    zAb4 = aais.ab(parcel, i);
                    continue;
                case 20:
                    strU6 = str;
                    strU4 = aais.U(parcel, i);
                    continue;
                case 21:
                    strU6 = str;
                    additionalConsentConfig = (com.google.android.gms.feedback.AdditionalConsentConfig) aais.O(parcel, i, com.google.android.gms.feedback.AdditionalConsentConfig.CREATOR);
                    continue;
                case 22:
                    strU6 = str;
                    strU5 = aais.U(parcel, i);
                    continue;
            }
            strU6 = str;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.feedback.FeedbackOptions(strU6, bundleM, strU7, applicationErrorReport, strU, bitmapTeleporter, strU2, arrayListX, zAb, themeSettings, logOptions, zAb2, bitmap, strU3, zAb3, jL, zAb4, strU4, additionalConsentConfig, strU5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.feedback.FeedbackOptions[i];
    }
}
