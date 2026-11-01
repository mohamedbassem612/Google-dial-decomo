package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamf implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        int I = 0;
        java.lang.String strU = null;
        android.accounts.Account account = null;
        android.os.Bundle bundleM = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        android.graphics.Bitmap bitmap = null;
        java.util.ArrayList arrayListW = null;
        android.os.Bundle bundleM2 = null;
        android.graphics.Bitmap bitmap2 = null;
        byte[] bArrAc = null;
        java.lang.String strU4 = null;
        android.net.Uri uri = null;
        java.util.ArrayList arrayListX = null;
        com.google.android.gms.feedback.ThemeSettings themeSettings = null;
        java.util.ArrayList arrayListX2 = null;
        com.google.android.gms.feedback.ErrorReport errorReport = null;
        com.google.android.gms.googlehelp.internal.common.TogglingData togglingData = null;
        android.app.PendingIntent pendingIntent = null;
        java.lang.String strU5 = null;
        java.lang.String strU6 = null;
        com.google.android.gms.googlehelp.ND4CSettings nD4CSettings = null;
        java.util.ArrayList arrayListX3 = null;
        java.lang.String strU7 = null;
        java.util.ArrayList arrayListX4 = null;
        java.lang.String strU8 = null;
        android.content.Intent intent = null;
        java.util.ArrayList arrayListW2 = null;
        boolean zAb = false;
        boolean zAb2 = false;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        boolean zAb3 = false;
        int I5 = 0;
        int I6 = 0;
        boolean zAb4 = false;
        boolean zAb5 = false;
        int I7 = 0;
        boolean zAb6 = false;
        boolean zAb7 = false;
        boolean zAb8 = false;
        int I8 = 0;
        int I9 = 0;
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
                    account = (android.accounts.Account) aais.O(parcel, i, android.accounts.Account.CREATOR);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    bundleM = aais.M(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    zAb = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    zAb2 = aais.ab(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    arrayListW = aais.W(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    aais.aa(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    bundleM2 = aais.M(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    bitmap2 = (android.graphics.Bitmap) aais.O(parcel, i, android.graphics.Bitmap.CREATOR);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    strU4 = aais.U(parcel, i);
                    break;
                case 15:
                    uri = (android.net.Uri) aais.O(parcel, i, android.net.Uri.CREATOR);
                    break;
                case 16:
                    arrayListX = aais.X(parcel, i, com.google.android.gms.googlehelp.internal.common.OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    I4 = aais.I(parcel, i);
                    break;
                case 18:
                    arrayListX2 = aais.X(parcel, i, com.google.android.gms.googlehelp.OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArrAc = aais.ac(parcel, i);
                    break;
                case 20:
                    I2 = aais.I(parcel, i);
                    break;
                case 21:
                    I3 = aais.I(parcel, i);
                    break;
                case 22:
                    zAb3 = aais.ab(parcel, i);
                    break;
                case 23:
                    errorReport = (com.google.android.gms.feedback.ErrorReport) aais.O(parcel, i, com.google.android.gms.feedback.ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (com.google.android.gms.feedback.ThemeSettings) aais.O(parcel, i, com.google.android.gms.feedback.ThemeSettings.CREATOR);
                    break;
                case 28:
                    strU2 = aais.U(parcel, i);
                    break;
                case 31:
                    togglingData = (com.google.android.gms.googlehelp.internal.common.TogglingData) aais.O(parcel, i, com.google.android.gms.googlehelp.internal.common.TogglingData.CREATOR);
                    break;
                case ' ':
                    I5 = aais.I(parcel, i);
                    break;
                case '!':
                    pendingIntent = (android.app.PendingIntent) aais.O(parcel, i, android.app.PendingIntent.CREATOR);
                    break;
                case '\"':
                    strU3 = aais.U(parcel, i);
                    break;
                case '#':
                    bitmap = (android.graphics.Bitmap) aais.O(parcel, i, android.graphics.Bitmap.CREATOR);
                    break;
                case '$':
                    I6 = aais.I(parcel, i);
                    break;
                case '%':
                    zAb4 = aais.ab(parcel, i);
                    break;
                case '&':
                    zAb5 = aais.ab(parcel, i);
                    break;
                case '\'':
                    I7 = aais.I(parcel, i);
                    break;
                case '(':
                    strU5 = aais.U(parcel, i);
                    break;
                case ')':
                    zAb6 = aais.ab(parcel, i);
                    break;
                case '*':
                    strU6 = aais.U(parcel, i);
                    break;
                case '+':
                    zAb7 = aais.ab(parcel, i);
                    break;
                case ',':
                    nD4CSettings = (com.google.android.gms.googlehelp.ND4CSettings) aais.O(parcel, i, com.google.android.gms.googlehelp.ND4CSettings.CREATOR);
                    break;
                case '-':
                    zAb8 = aais.ab(parcel, i);
                    break;
                case '.':
                    arrayListX3 = aais.X(parcel, i, com.google.android.gms.googlehelp.FRDProductSpecificDataEntry.CREATOR);
                    break;
                case '/':
                    strU7 = aais.U(parcel, i);
                    break;
                case '0':
                    I8 = aais.I(parcel, i);
                    break;
                case '1':
                    I9 = aais.I(parcel, i);
                    break;
                case '2':
                    arrayListX4 = aais.X(parcel, i, com.google.android.gms.googlehelp.trails.TrailsInteraction.CREATOR);
                    break;
                case '3':
                    strU8 = aais.U(parcel, i);
                    break;
                case '4':
                    intent = (android.content.Intent) aais.O(parcel, i, android.content.Intent.CREATOR);
                    break;
                case '5':
                    arrayListW2 = aais.W(parcel, i);
                    break;
            }
            I = i2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.googlehelp.GoogleHelp(I, strU, account, bundleM, strU2, strU3, bitmap, zAb, zAb2, arrayListW, bundleM2, bitmap2, bArrAc, I2, I3, strU4, uri, arrayListX, I4, themeSettings, arrayListX2, zAb3, errorReport, togglingData, I5, pendingIntent, I6, zAb4, zAb5, I7, strU5, zAb6, strU6, zAb7, nD4CSettings, zAb8, arrayListX3, strU7, I8, I9, arrayListX4, strU8, intent, arrayListW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.googlehelp.GoogleHelp[i];
    }
}
