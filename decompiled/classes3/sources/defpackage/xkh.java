package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkh implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public xkh(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object logAuditRecordsRequest;
        java.lang.Object appRestrictionInfo;
        boolean zAb = false;
        int I = 0;
        boolean zAb2 = false;
        boolean zAb3 = false;
        java.lang.String strU = null;
        java.lang.String strU2 = null;
        android.os.Bundle bundleM = null;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        java.lang.String strU3 = null;
        java.lang.Long lT = null;
        java.lang.String strU4 = null;
        java.lang.String strU5 = null;
        java.util.ArrayList arrayListX = null;
        java.lang.String strU6 = null;
        java.lang.String strU7 = null;
        com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState = null;
        com.google.android.gms.auth.aang.GoogleAccount googleAccount = null;
        switch (this.$cid) {
            case 0:
                return defpackage.xkg.a(parcel);
            case 1:
                return new com.google.android.flexbox.FlexboxLayoutManager.SavedState(parcel);
            case 2:
                int iK = aais.K(parcel);
                int I2 = 0;
                int I3 = 0;
                java.lang.String strU8 = null;
                byte[][] bArrAh = null;
                byte[] bArrAc = null;
                byte[] bArrAc2 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            I2 = aais.I(parcel, i);
                            break;
                        case 2:
                            I3 = aais.I(parcel, i);
                            break;
                        case 3:
                            strU8 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            bArrAh = aais.ah(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            bArrAc = aais.ac(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            bArrAc2 = aais.ac(parcel, i);
                            break;
                        default:
                            aais.aa(parcel, i);
                            break;
                    }
                }
                aais.Y(parcel, iK);
                logAuditRecordsRequest = new com.google.android.gms.audit.LogAuditRecordsRequest(I2, I3, strU8, bArrAh, bArrAc, bArrAc2);
                return logAuditRecordsRequest;
            case 3:
                int iK2 = aais.K(parcel);
                int I4 = 0;
                boolean zAb4 = false;
                boolean zAb5 = false;
                java.lang.String strU9 = null;
                java.lang.Long lT2 = null;
                java.util.ArrayList arrayListW = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            I4 = aais.I(parcel, i2);
                            break;
                        case 2:
                            strU9 = aais.U(parcel, i2);
                            break;
                        case 3:
                            lT2 = aais.T(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            zAb4 = aais.ab(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb5 = aais.ab(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            arrayListW = aais.W(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU = aais.U(parcel, i2);
                            break;
                        default:
                            aais.aa(parcel, i2);
                            break;
                    }
                }
                aais.Y(parcel, iK2);
                logAuditRecordsRequest = new com.google.android.gms.auth.TokenData(I4, strU9, lT2, zAb4, zAb5, arrayListW, strU);
                return logAuditRecordsRequest;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK3 = aais.K(parcel);
                boolean zAb6 = false;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        zAb = aais.ab(parcel, i3);
                    } else if (c != 2) {
                        aais.aa(parcel, i3);
                    } else {
                        zAb6 = aais.ab(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.auth.aang.AppRestrictionState(zAb, zAb6);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK4 = aais.K(parcel);
                com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState2 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) aais.O(parcel, i4, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                    } else if (c2 != 2) {
                        aais.aa(parcel, i4);
                    } else {
                        appRestrictionState2 = (com.google.android.gms.auth.aang.AppRestrictionState) aais.O(parcel, i4, com.google.android.gms.auth.aang.AppRestrictionState.CREATOR);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.auth.aang.AccountWithAppRestrictionState(googleAccount, appRestrictionState2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK5 = aais.K(parcel);
                com.google.android.gms.auth.aang.AppRestrictionInfo appRestrictionInfo2 = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        appRestrictionState = (com.google.android.gms.auth.aang.AppRestrictionState) aais.O(parcel, i5, com.google.android.gms.auth.aang.AppRestrictionState.CREATOR);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        appRestrictionInfo2 = (com.google.android.gms.auth.aang.AppRestrictionInfo) aais.O(parcel, i5, com.google.android.gms.auth.aang.AppRestrictionInfo.CREATOR);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.auth.aang.AppRestriction(appRestrictionState, appRestrictionInfo2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK6 = aais.K(parcel);
                java.lang.String strU10 = null;
                java.lang.String strU11 = null;
                java.lang.String strU12 = null;
                byte[] bArrAc3 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strU7 = aais.U(parcel, i6);
                    } else if (c4 == 3) {
                        strU10 = aais.U(parcel, i6);
                    } else if (c4 == 4) {
                        strU11 = aais.U(parcel, i6);
                    } else if (c4 == 5) {
                        strU12 = aais.U(parcel, i6);
                    } else if (c4 != 6) {
                        aais.aa(parcel, i6);
                    } else {
                        bArrAc3 = aais.ac(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                appRestrictionInfo = new com.google.android.gms.auth.aang.AppRestrictionInfo(strU7, strU10, strU11, strU12, bArrAc3);
                return appRestrictionInfo;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK7 = aais.K(parcel);
                boolean zAb7 = false;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        zAb3 = aais.ab(parcel, i7);
                    } else if (c5 != 2) {
                        aais.aa(parcel, i7);
                    } else {
                        zAb7 = aais.ab(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.auth.aang.ErrorDetails(zAb3, zAb7);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK8 = aais.K(parcel);
                boolean zAb8 = false;
                boolean zAb9 = false;
                java.util.ArrayList arrayListW2 = null;
                java.util.ArrayList arrayListW3 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        strU6 = aais.U(parcel, i8);
                    } else if (c6 == 2) {
                        arrayListW2 = aais.W(parcel, i8);
                    } else if (c6 == 3) {
                        arrayListW3 = aais.W(parcel, i8);
                    } else if (c6 == 4) {
                        zAb8 = aais.ab(parcel, i8);
                    } else if (c6 != 5) {
                        aais.aa(parcel, i8);
                    } else {
                        zAb9 = aais.ab(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                appRestrictionInfo = new com.google.android.gms.auth.aang.GetAccountsRequest(strU6, arrayListW2, arrayListW3, zAb8, zAb9);
                return appRestrictionInfo;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK9 = aais.K(parcel);
                java.util.ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        arrayListX = aais.X(parcel, i9, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                    } else if (c7 != 2) {
                        aais.aa(parcel, i9);
                    } else {
                        arrayListX2 = aais.X(parcel, i9, com.google.android.gms.auth.aang.AccountWithAppRestrictionState.CREATOR);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.auth.aang.GetAccountsResponse(arrayListX, arrayListX2);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK10 = aais.K(parcel);
                boolean zAb10 = false;
                boolean zAb11 = false;
                boolean zAb12 = false;
                int I5 = 0;
                com.google.android.gms.auth.aang.GoogleAccount googleAccount2 = null;
                java.lang.String strU13 = null;
                java.util.ArrayList arrayListW4 = null;
                java.util.ArrayList arrayListW5 = null;
                java.util.ArrayList arrayListW6 = null;
                java.lang.String strU14 = null;
                byte[] bArrAc4 = null;
                java.lang.String strU15 = null;
                android.net.Network network = null;
                int I6 = 0;
                java.util.ArrayList arrayListW7 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    java.lang.String str = strU13;
                    switch ((char) i10) {
                        case 1:
                            googleAccount2 = (com.google.android.gms.auth.aang.GoogleAccount) aais.O(parcel, i10, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                            break;
                        case 2:
                            strU13 = aais.U(parcel, i10);
                            continue;
                        case 3:
                            arrayListW4 = aais.W(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            arrayListW5 = aais.W(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            arrayListW6 = aais.W(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            arrayListW7 = aais.W(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            I6 = aais.I(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU14 = aais.U(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            zAb10 = aais.ab(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            bArrAc4 = aais.ac(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            strU15 = aais.U(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            zAb11 = aais.ab(parcel, i10);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            network = (android.net.Network) aais.O(parcel, i10, android.net.Network.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                            zAb12 = aais.ab(parcel, i10);
                            break;
                        case 15:
                            I5 = aais.I(parcel, i10);
                            break;
                        default:
                            aais.aa(parcel, i10);
                            break;
                    }
                    strU13 = str;
                }
                aais.Y(parcel, iK10);
                logAuditRecordsRequest = new com.google.android.gms.auth.aang.GetTokenRequest(googleAccount2, strU13, arrayListW4, arrayListW5, arrayListW6, arrayListW7, I6, strU14, zAb10, bArrAc4, strU15, zAb11, network, zAb12, I5);
                return logAuditRecordsRequest;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK11 = aais.K(parcel);
                com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        strU5 = aais.U(parcel, i11);
                    } else if (c8 != 2) {
                        aais.aa(parcel, i11);
                    } else {
                        oauth2TokenMetadata = (com.google.android.gms.auth.aang.Oauth2TokenMetadata) aais.O(parcel, i11, com.google.android.gms.auth.aang.Oauth2TokenMetadata.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.auth.aang.GetTokenResponse(strU5, oauth2TokenMetadata);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK12 = aais.K(parcel);
                java.lang.String strU16 = null;
                java.lang.String strU17 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        strU4 = aais.U(parcel, i12);
                    } else if (c9 == 2) {
                        strU16 = aais.U(parcel, i12);
                    } else if (c9 != 3) {
                        aais.aa(parcel, i12);
                    } else {
                        strU17 = aais.U(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.auth.aang.GoogleAccount(strU4, strU16, strU17);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK13 = aais.K(parcel);
                java.util.ArrayList arrayListW8 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        lT = aais.T(parcel, i13);
                    } else if (c10 != 2) {
                        aais.aa(parcel, i13);
                    } else {
                        arrayListW8 = aais.W(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.auth.aang.Oauth2TokenMetadata(lT, arrayListW8);
            case 15:
                int iK14 = aais.K(parcel);
                int I7 = 0;
                int I8 = 0;
                android.app.PendingIntent pendingIntent = null;
                android.os.Bundle bundleM2 = null;
                byte[] bArrAc5 = null;
                int I9 = 0;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        I7 = aais.I(parcel, i14);
                    } else if (c11 == 2) {
                        pendingIntent = (android.app.PendingIntent) aais.O(parcel, i14, android.app.PendingIntent.CREATOR);
                    } else if (c11 == 3) {
                        I8 = aais.I(parcel, i14);
                    } else if (c11 == 4) {
                        bundleM2 = aais.M(parcel, i14);
                    } else if (c11 == 5) {
                        bArrAc5 = aais.ac(parcel, i14);
                    } else if (c11 != 1000) {
                        aais.aa(parcel, i14);
                    } else {
                        I9 = aais.I(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                appRestrictionInfo = new com.google.android.gms.auth.api.proxy.ProxyResponse(I9, I7, pendingIntent, I8, bundleM2, bArrAc5);
                return appRestrictionInfo;
            case 16:
                int iK15 = aais.K(parcel);
                java.lang.String strU18 = null;
                java.lang.String strU19 = null;
                android.net.Uri uri = null;
                java.lang.String strU20 = null;
                java.lang.String strU21 = null;
                java.util.ArrayList arrayListX3 = null;
                java.lang.String strU22 = null;
                java.lang.String strU23 = null;
                long jL = 0;
                java.lang.String strU24 = null;
                java.lang.String strU25 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strU24 = aais.U(parcel, i15);
                            break;
                        case 3:
                            strU25 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU18 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU19 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            uri = (android.net.Uri) aais.O(parcel, i15, android.net.Uri.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU20 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            jL = aais.L(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            strU21 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            arrayListX3 = aais.X(parcel, i15, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            strU22 = aais.U(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            strU23 = aais.U(parcel, i15);
                            break;
                        default:
                            aais.aa(parcel, i15);
                            break;
                    }
                }
                aais.Y(parcel, iK15);
                logAuditRecordsRequest = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(strU24, strU25, strU18, strU19, uri, strU20, jL, strU21, arrayListX3, strU22, strU23);
                return logAuditRecordsRequest;
            case 17:
                int iK16 = aais.K(parcel);
                int I10 = 0;
                boolean zAb13 = false;
                boolean zAb14 = false;
                java.util.ArrayList arrayListX4 = null;
                android.accounts.Account account = null;
                java.lang.String strU26 = null;
                java.util.ArrayList arrayListX5 = null;
                java.lang.String strU27 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            I10 = aais.I(parcel, i16);
                            break;
                        case 2:
                            arrayListX4 = aais.X(parcel, i16, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case 3:
                            account = (android.accounts.Account) aais.O(parcel, i16, android.accounts.Account.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            zAb13 = aais.ab(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb14 = aais.ab(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb2 = aais.ab(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU3 = aais.U(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU26 = aais.U(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            arrayListX5 = aais.X(parcel, i16, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            strU27 = aais.U(parcel, i16);
                            break;
                        default:
                            aais.aa(parcel, i16);
                            break;
                    }
                }
                aais.Y(parcel, iK16);
                logAuditRecordsRequest = new com.google.android.gms.auth.api.signin.GoogleSignInOptions(I10, arrayListX4, account, zAb13, zAb14, zAb2, strU3, strU26, com.google.android.gms.auth.api.signin.GoogleSignInOptions.b(arrayListX5), strU27);
                return logAuditRecordsRequest;
            case 18:
                int iK17 = aais.K(parcel);
                java.lang.String strU28 = "";
                java.lang.String strU29 = "";
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 4) {
                        strU28 = aais.U(parcel, i17);
                    } else if (c12 == 7) {
                        googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) aais.O(parcel, i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    } else if (c12 != '\b') {
                        aais.aa(parcel, i17);
                    } else {
                        strU29 = aais.U(parcel, i17);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.auth.api.signin.SignInAccount(strU28, googleSignInAccount, strU29);
            case 19:
                int iK18 = aais.K(parcel);
                int I11 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        I = aais.I(parcel, i18);
                    } else if (c13 == 2) {
                        I11 = aais.I(parcel, i18);
                    } else if (c13 != 3) {
                        aais.aa(parcel, i18);
                    } else {
                        bundleM = aais.M(parcel, i18);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable(I, I11, bundleM);
            default:
                int iK19 = aais.K(parcel);
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        strU2 = aais.U(parcel, i19);
                    } else if (c14 != 5) {
                        aais.aa(parcel, i19);
                    } else {
                        googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) aais.O(parcel, i19, com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(strU2, googleSignInOptions);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.android.onboarding.pending.PendingActivityContract[i];
            case 1:
                return new com.google.android.flexbox.FlexboxLayoutManager.SavedState[i];
            case 2:
                return new com.google.android.gms.audit.LogAuditRecordsRequest[i];
            case 3:
                return new com.google.android.gms.auth.TokenData[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.auth.aang.AppRestrictionState[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.auth.aang.AccountWithAppRestrictionState[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.auth.aang.AppRestriction[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.auth.aang.AppRestrictionInfo[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.auth.aang.ErrorDetails[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.auth.aang.GetAccountsRequest[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.auth.aang.GetAccountsResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.auth.aang.GetTokenRequest[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.auth.aang.GetTokenResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.auth.aang.GoogleAccount[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.auth.aang.Oauth2TokenMetadata[i];
            case 15:
                return new com.google.android.gms.auth.api.proxy.ProxyResponse[i];
            case 16:
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i];
            case 17:
                return new com.google.android.gms.auth.api.signin.GoogleSignInOptions[i];
            case 18:
                return new com.google.android.gms.auth.api.signin.SignInAccount[i];
            case 19:
                return new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable[i];
            default:
                return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration[i];
        }
    }
}
