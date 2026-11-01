package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkl implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public xkl(int i) {
        this.$cid = i;
    }

    public static final com.google.android.gms.feedback.ErrorReport a(android.os.Parcel parcel) {
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
        java.lang.String[] strArrAg = null;
        java.lang.String[] strArrAg2 = null;
        java.lang.String[] strArrAg3 = null;
        java.lang.String strU14 = null;
        java.lang.String strU15 = null;
        byte[] bArrAc = null;
        java.lang.String strU16 = null;
        java.lang.String strU17 = null;
        java.lang.String strU18 = null;
        android.os.Bundle bundleM = null;
        java.lang.String strU19 = null;
        java.lang.String strU20 = null;
        java.lang.String strU21 = null;
        java.lang.String strU22 = null;
        java.lang.String strU23 = null;
        java.lang.String strU24 = null;
        java.lang.String strU25 = null;
        java.lang.String strU26 = null;
        java.lang.String strU27 = null;
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = null;
        java.lang.String strU28 = null;
        com.google.android.gms.feedback.FileTeleporter[] fileTeleporterArr = null;
        java.lang.String[] strArrAg4 = null;
        java.lang.String strU29 = null;
        com.google.android.gms.feedback.ThemeSettings themeSettings = null;
        com.google.android.gms.feedback.LogOptions logOptions = null;
        java.lang.String strU30 = null;
        android.os.Bundle bundleM2 = null;
        java.util.ArrayList arrayListX = null;
        android.graphics.Bitmap bitmap = null;
        java.lang.String strU31 = null;
        java.util.ArrayList arrayListW = null;
        java.lang.String[] strArrAg5 = null;
        java.lang.String[] strArrAg6 = null;
        java.lang.String[] strArrAg7 = null;
        java.lang.String strU32 = null;
        com.google.android.gms.feedback.AdditionalConsentConfig additionalConsentConfig = null;
        com.google.android.gms.feedback.ServiceDump[] serviceDumpArr = null;
        java.lang.String strU33 = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        boolean zAb = false;
        int I7 = 0;
        int I8 = 0;
        boolean zAb2 = false;
        int I9 = 0;
        boolean zAb3 = false;
        boolean zAb4 = false;
        boolean zAb5 = false;
        int I10 = 0;
        int I11 = 0;
        boolean zAb6 = false;
        boolean zAb7 = false;
        android.app.ApplicationErrorReport applicationErrorReport = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            android.app.ApplicationErrorReport applicationErrorReport2 = applicationErrorReport;
            switch ((char) i) {
                case 2:
                    applicationErrorReport = (android.app.ApplicationErrorReport) aais.O(parcel, i, android.app.ApplicationErrorReport.CREATOR);
                    continue;
                case 3:
                    strU = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    I = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    strU2 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    strU3 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    strU4 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    strU5 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    strU6 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    strU7 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    strU8 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    I2 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    strU9 = aais.U(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    strU10 = aais.U(parcel, i);
                    break;
                case 15:
                    strU11 = aais.U(parcel, i);
                    break;
                case 16:
                    strU12 = aais.U(parcel, i);
                    break;
                case 17:
                    strU13 = aais.U(parcel, i);
                    break;
                case 18:
                    strArrAg = aais.ag(parcel, i);
                    break;
                case 19:
                    strArrAg2 = aais.ag(parcel, i);
                    break;
                case 20:
                    strArrAg3 = aais.ag(parcel, i);
                    break;
                case 21:
                    strU14 = aais.U(parcel, i);
                    break;
                case 22:
                    strU15 = aais.U(parcel, i);
                    break;
                case 23:
                    bArrAc = aais.ac(parcel, i);
                    break;
                case 24:
                    I3 = aais.I(parcel, i);
                    break;
                case 25:
                    I4 = aais.I(parcel, i);
                    break;
                case 26:
                    I5 = aais.I(parcel, i);
                    break;
                case 27:
                    I6 = aais.I(parcel, i);
                    break;
                case 28:
                    strU16 = aais.U(parcel, i);
                    break;
                case 29:
                    strU17 = aais.U(parcel, i);
                    break;
                case 30:
                    strU18 = aais.U(parcel, i);
                    break;
                case 31:
                    bundleM = aais.M(parcel, i);
                    break;
                case ' ':
                    zAb = aais.ab(parcel, i);
                    break;
                case '!':
                    I7 = aais.I(parcel, i);
                    break;
                case '\"':
                    I8 = aais.I(parcel, i);
                    break;
                case '#':
                    zAb2 = aais.ab(parcel, i);
                    break;
                case '$':
                    strU19 = aais.U(parcel, i);
                    break;
                case '%':
                    strU20 = aais.U(parcel, i);
                    break;
                case '&':
                    I9 = aais.I(parcel, i);
                    break;
                case '\'':
                    strU21 = aais.U(parcel, i);
                    break;
                case '(':
                    strU22 = aais.U(parcel, i);
                    break;
                case ')':
                    strU23 = aais.U(parcel, i);
                    break;
                case '*':
                    strU24 = aais.U(parcel, i);
                    break;
                case '+':
                    strU25 = aais.U(parcel, i);
                    break;
                case ',':
                    strU26 = aais.U(parcel, i);
                    break;
                case '-':
                    strU27 = aais.U(parcel, i);
                    break;
                case '.':
                    bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) aais.O(parcel, i, com.google.android.gms.common.data.BitmapTeleporter.CREATOR);
                    break;
                case '/':
                    strU28 = aais.U(parcel, i);
                    break;
                case '0':
                    fileTeleporterArr = (com.google.android.gms.feedback.FileTeleporter[]) aais.af(parcel, i, com.google.android.gms.feedback.FileTeleporter.CREATOR);
                    break;
                case '1':
                    strArrAg4 = aais.ag(parcel, i);
                    break;
                case '2':
                    zAb3 = aais.ab(parcel, i);
                    break;
                case '3':
                    strU29 = aais.U(parcel, i);
                    break;
                case '4':
                    themeSettings = (com.google.android.gms.feedback.ThemeSettings) aais.O(parcel, i, com.google.android.gms.feedback.ThemeSettings.CREATOR);
                    break;
                case '5':
                    logOptions = (com.google.android.gms.feedback.LogOptions) aais.O(parcel, i, com.google.android.gms.feedback.LogOptions.CREATOR);
                    break;
                case '6':
                    strU30 = aais.U(parcel, i);
                    break;
                case '7':
                    zAb4 = aais.ab(parcel, i);
                    break;
                case '8':
                    bundleM2 = aais.M(parcel, i);
                    break;
                case '9':
                    arrayListX = aais.X(parcel, i, android.graphics.RectF.CREATOR);
                    break;
                case ':':
                    zAb5 = aais.ab(parcel, i);
                    break;
                case ';':
                    bitmap = (android.graphics.Bitmap) aais.O(parcel, i, android.graphics.Bitmap.CREATOR);
                    break;
                case '<':
                    strU31 = aais.U(parcel, i);
                    break;
                case '=':
                    arrayListW = aais.W(parcel, i);
                    break;
                case '>':
                    I10 = aais.I(parcel, i);
                    break;
                case '?':
                    I11 = aais.I(parcel, i);
                    break;
                case '@':
                    strArrAg5 = aais.ag(parcel, i);
                    break;
                case 'A':
                    strArrAg6 = aais.ag(parcel, i);
                    break;
                case 'B':
                    strArrAg7 = aais.ag(parcel, i);
                    break;
                case 'C':
                    zAb6 = aais.ab(parcel, i);
                    break;
                case 'D':
                    zAb7 = aais.ab(parcel, i);
                    break;
                case 'E':
                    strU32 = aais.U(parcel, i);
                    break;
                case 'F':
                    additionalConsentConfig = (com.google.android.gms.feedback.AdditionalConsentConfig) aais.O(parcel, i, com.google.android.gms.feedback.AdditionalConsentConfig.CREATOR);
                    break;
                case 'G':
                    serviceDumpArr = (com.google.android.gms.feedback.ServiceDump[]) aais.af(parcel, i, com.google.android.gms.feedback.ServiceDump.CREATOR);
                    break;
                case 'H':
                    strU33 = aais.U(parcel, i);
                    break;
                default:
                    aais.aa(parcel, i);
                    break;
            }
            applicationErrorReport = applicationErrorReport2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.gms.feedback.ErrorReport(applicationErrorReport, strU, I, strU2, strU3, strU4, strU5, strU6, strU7, strU8, I2, strU9, strU10, strU11, strU12, strU13, strArrAg, strArrAg2, strArrAg3, strU14, strU15, bArrAc, I3, I4, I5, I6, strU16, strU17, strU18, bundleM, zAb, I7, I8, zAb2, strU19, strU20, I9, strU21, strU22, strU23, strU24, strU25, strU26, strU27, bitmapTeleporter, strU28, fileTeleporterArr, strArrAg4, zAb3, strU29, themeSettings, logOptions, strU30, zAb4, bundleM2, arrayListX, zAb5, bitmap, strU31, arrayListW, I10, I11, strArrAg5, strArrAg6, strArrAg7, zAb6, zAb7, strU32, additionalConsentConfig, serviceDumpArr, strU33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object methodInvocation;
        android.accounts.Account account = null;
        java.util.ArrayList arrayListW = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        com.google.android.gms.duokit.DuoId duoId = null;
        com.google.android.gms.duokit.DuoId duoId2 = null;
        com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = null;
        com.google.android.gms.duokit.DuoId duoId3 = null;
        com.google.android.gms.duokit.RemoteUserReachability[] remoteUserReachabilityArr = null;
        com.google.android.gms.duokit.DuoId[] duoIdArr = null;
        java.lang.String strU = null;
        android.os.Bundle bundleM = null;
        java.util.ArrayList arrayListX = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        switch (this.$cid) {
            case 0:
                return defpackage.xkk.a(parcel);
            case 1:
                int iK = aais.K(parcel);
                int I9 = -1;
                java.lang.String strU2 = null;
                java.lang.String strU3 = null;
                int I10 = 0;
                int I11 = 0;
                int I12 = 0;
                long jL = 0;
                long jL2 = 0;
                int I13 = 0;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            I13 = aais.I(parcel, i);
                            break;
                        case 2:
                            I10 = aais.I(parcel, i);
                            break;
                        case 3:
                            I11 = aais.I(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            jL = aais.L(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            jL2 = aais.L(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU2 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU3 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            I12 = aais.I(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            I9 = aais.I(parcel, i);
                            break;
                        default:
                            aais.aa(parcel, i);
                            break;
                    }
                }
                aais.Y(parcel, iK);
                methodInvocation = new com.google.android.gms.common.internal.MethodInvocation(I13, I10, I11, jL, jL2, strU2, strU3, I12, I9);
                break;
            case 2:
                int iK2 = aais.K(parcel);
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
                int I14 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        I = aais.I(parcel, i2);
                    } else if (c == 2) {
                        account = (android.accounts.Account) aais.O(parcel, i2, android.accounts.Account.CREATOR);
                    } else if (c == 3) {
                        I14 = aais.I(parcel, i2);
                    } else if (c != 4) {
                        aais.aa(parcel, i2);
                    } else {
                        googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) aais.O(parcel, i2, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.common.internal.ResolveAccountRequest(I, account, I14, googleSignInAccount);
            case 3:
                int iK3 = aais.K(parcel);
                android.os.IBinder iBinderN = null;
                com.google.android.gms.common.ConnectionResult connectionResult = null;
                boolean zAb3 = false;
                boolean zAb4 = false;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        I8 = aais.I(parcel, i3);
                    } else if (c2 == 2) {
                        iBinderN = aais.N(parcel, i3);
                    } else if (c2 == 3) {
                        connectionResult = (com.google.android.gms.common.ConnectionResult) aais.O(parcel, i3, com.google.android.gms.common.ConnectionResult.CREATOR);
                    } else if (c2 == 4) {
                        zAb3 = aais.ab(parcel, i3);
                    } else if (c2 != 5) {
                        aais.aa(parcel, i3);
                    } else {
                        zAb4 = aais.ab(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.common.internal.ResolveAccountResponse(I8, iBinderN, connectionResult, zAb3, zAb4);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK4 = aais.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        I7 = aais.I(parcel, i4);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i4);
                    } else {
                        arrayListX = aais.X(parcel, i4, com.google.android.gms.common.internal.MethodInvocation.CREATOR);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.common.internal.TelemetryData(I7, arrayListX);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK5 = aais.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        bundleM = aais.M(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.droidguard.DroidGuardResultsRequest(bundleM);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) parcel.readParcelable(android.os.ParcelFileDescriptor.class.getClassLoader());
                android.os.Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
                ahvr.bM((parcelFileDescriptor2 == null) == (parcelable == null));
                return new com.google.android.gms.droidguard.internal.DroidGuardInitReply(parcelFileDescriptor2, parcelable);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK6 = aais.K(parcel);
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        I6 = aais.I(parcel, i6);
                    } else if (c4 != 2) {
                        aais.aa(parcel, i6);
                    } else {
                        strU = aais.U(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.duokit.DuoId(I6, strU);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK7 = aais.K(parcel);
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aais.aa(parcel, i7);
                    } else {
                        I5 = aais.I(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.duokit.GetApiAvailabilityResponse(I5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU4 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        duoIdArr = (com.google.android.gms.duokit.DuoId[]) aais.af(parcel, i8, com.google.android.gms.duokit.DuoId.CREATOR);
                    } else if (c5 == 2) {
                        strU4 = aais.U(parcel, i8);
                    } else if (c5 != 3) {
                        aais.aa(parcel, i8);
                    } else {
                        zAb2 = aais.ab(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.duokit.LookupRemoteReachabilityRequest(duoIdArr, strU4, zAb2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK9 = aais.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        aais.aa(parcel, i9);
                    } else {
                        remoteUserReachabilityArr = (com.google.android.gms.duokit.RemoteUserReachability[]) aais.af(parcel, i9, com.google.android.gms.duokit.RemoteUserReachability.CREATOR);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.duokit.LookupRemoteReachabilityResponse(remoteUserReachabilityArr);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK10 = aais.K(parcel);
                java.lang.String strU5 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        duoId3 = (com.google.android.gms.duokit.DuoId) aais.O(parcel, i10, com.google.android.gms.duokit.DuoId.CREATOR);
                    } else if (c6 == 2) {
                        strU5 = aais.U(parcel, i10);
                    } else if (c6 != 3) {
                        aais.aa(parcel, i10);
                    } else {
                        zAb = aais.ab(parcel, i10);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest(duoId3, strU5, zAb);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        aais.aa(parcel, i11);
                    } else {
                        remoteUserReachability = (com.google.android.gms.duokit.RemoteUserReachability) aais.O(parcel, i11, com.google.android.gms.duokit.RemoteUserReachability.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse(remoteUserReachability);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK12 = aais.K(parcel);
                int I15 = 0;
                int I16 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        duoId2 = (com.google.android.gms.duokit.DuoId) aais.O(parcel, i12, com.google.android.gms.duokit.DuoId.CREATOR);
                    } else if (c7 == 2) {
                        I4 = aais.I(parcel, i12);
                    } else if (c7 == 3) {
                        I15 = aais.I(parcel, i12);
                    } else if (c7 != 4) {
                        aais.aa(parcel, i12);
                    } else {
                        I16 = aais.I(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.duokit.RemoteUserReachability(duoId2, I4, I15, I16);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK13 = aais.K(parcel);
                java.lang.String strU6 = null;
                boolean zAb5 = false;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        duoId = (com.google.android.gms.duokit.DuoId) aais.O(parcel, i13, com.google.android.gms.duokit.DuoId.CREATOR);
                    } else if (c8 == 2) {
                        I3 = aais.I(parcel, i13);
                    } else if (c8 == 3) {
                        zAb5 = aais.ab(parcel, i13);
                    } else if (c8 != 4) {
                        aais.aa(parcel, i13);
                    } else {
                        strU6 = aais.U(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.duokit.StartCallRequest(duoId, I3, zAb5, strU6);
            case 15:
                int iK14 = aais.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    aais.aa(parcel, parcel.readInt());
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.duokit.StartCallResponse();
            case 16:
                return a(parcel);
            case 17:
                int iK15 = aais.K(parcel);
                java.lang.String strU7 = null;
                java.lang.String strU8 = null;
                while (parcel.dataPosition() < iK15) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 2) {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i14, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 3) {
                        strU7 = aais.U(parcel, i14);
                    } else if (c9 != 4) {
                        aais.aa(parcel, i14);
                    } else {
                        strU8 = aais.U(parcel, i14);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.feedback.FileTeleporter(parcelFileDescriptor, strU7, strU8);
            case 18:
                int iK16 = aais.K(parcel);
                java.lang.String strU9 = null;
                boolean zAb6 = false;
                boolean zAb7 = false;
                boolean zAb8 = false;
                boolean zAb9 = false;
                com.google.android.gms.feedback.ServiceDumpRequest[] serviceDumpRequestArr = null;
                boolean zAb10 = false;
                while (parcel.dataPosition() < iK16) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strU9 = aais.U(parcel, i15);
                            break;
                        case 3:
                            zAb6 = aais.ab(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            zAb7 = aais.ab(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb8 = aais.ab(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb10 = aais.ab(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            serviceDumpRequestArr = (com.google.android.gms.feedback.ServiceDumpRequest[]) aais.af(parcel, i15, com.google.android.gms.feedback.ServiceDumpRequest.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            zAb9 = aais.ab(parcel, i15);
                            break;
                        default:
                            aais.aa(parcel, i15);
                            break;
                    }
                }
                aais.Y(parcel, iK16);
                methodInvocation = new com.google.android.gms.feedback.LogOptions(strU9, zAb6, zAb7, zAb8, zAb10, serviceDumpRequestArr, zAb9);
                break;
            case 19:
                int iK17 = aais.K(parcel);
                int I17 = 0;
                while (parcel.dataPosition() < iK17) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        I2 = aais.I(parcel, i16);
                    } else if (c10 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        I17 = aais.I(parcel, i16);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.feedback.ThemeSettings(I2, I17);
            default:
                int iK18 = aais.K(parcel);
                java.lang.Boolean boolP = null;
                java.util.ArrayList arrayListW2 = null;
                java.util.ArrayList arrayListV = null;
                byte[][] bArrAh = null;
                int I18 = 0;
                int I19 = 0;
                java.util.ArrayList arrayListV2 = null;
                while (parcel.dataPosition() < iK18) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            I18 = aais.I(parcel, i17);
                            break;
                        case 3:
                            I19 = aais.I(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            arrayListW2 = aais.W(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            arrayListV = aais.V(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            arrayListW = aais.W(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            arrayListV2 = aais.V(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            bArrAh = aais.ah(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            boolP = aais.P(parcel, i17);
                            break;
                        default:
                            aais.aa(parcel, i17);
                            break;
                    }
                }
                aais.Y(parcel, iK18);
                methodInvocation = new com.google.android.gms.googlehelp.FRDProductSpecificDataEntry(I18, I19, arrayListW2, arrayListV, arrayListW, arrayListV2, bArrAh, boolP.booleanValue());
                break;
        }
        return methodInvocation;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.android.onboarding.pending.PendingTaskContract[i];
            case 1:
                return new com.google.android.gms.common.internal.MethodInvocation[i];
            case 2:
                return new com.google.android.gms.common.internal.ResolveAccountRequest[i];
            case 3:
                return new com.google.android.gms.common.internal.ResolveAccountResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.common.internal.TelemetryData[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.droidguard.DroidGuardResultsRequest[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.droidguard.internal.DroidGuardInitReply[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.duokit.DuoId[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.duokit.GetApiAvailabilityResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.duokit.LookupRemoteReachabilityRequest[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.duokit.LookupRemoteReachabilityResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.duokit.RemoteUserReachability[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.duokit.StartCallRequest[i];
            case 15:
                return new com.google.android.gms.duokit.StartCallResponse[i];
            case 16:
                return new com.google.android.gms.feedback.ErrorReport[i];
            case 17:
                return new com.google.android.gms.feedback.FileTeleporter[i];
            case 18:
                return new com.google.android.gms.feedback.LogOptions[i];
            case 19:
                return new com.google.android.gms.feedback.ThemeSettings[i];
            default:
                return new com.google.android.gms.googlehelp.FRDProductSpecificDataEntry[i];
        }
    }
}
