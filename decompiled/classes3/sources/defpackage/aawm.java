package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawm implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aawm(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object appParcelable;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        boolean zAb = false;
        int I7 = 0;
        int I8 = 0;
        int I9 = 0;
        int I10 = 0;
        int I11 = 0;
        int I12 = 0;
        boolean zAb2 = false;
        java.lang.Float fR = null;
        com.google.android.gms.wearable.internal.ParcelableBackupDevice[] parcelableBackupDeviceArr = null;
        com.google.android.gms.wearable.AppTheme appTheme = null;
        java.util.ArrayList arrayListX = null;
        byte[] bArrAc = null;
        android.net.Uri uri = null;
        java.lang.String strU = null;
        java.util.ArrayList arrayListX2 = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        java.util.ArrayList arrayListW = null;
        java.util.ArrayList arrayListX3 = null;
        java.lang.String strU5 = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                com.google.android.gms.wearable.internal.AppWearDetailsParcelable appWearDetailsParcelable = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strU6 = aais.U(parcel, i);
                            break;
                        case 2:
                            strU7 = aais.U(parcel, i);
                            break;
                        case 3:
                            webIconParcelable = (com.google.android.gms.wearable.internal.WebIconParcelable) aais.O(parcel, i, com.google.android.gms.wearable.internal.WebIconParcelable.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU8 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU9 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            fR = aais.R(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            appWearDetailsParcelable = (com.google.android.gms.wearable.internal.AppWearDetailsParcelable) aais.O(parcel, i, com.google.android.gms.wearable.internal.AppWearDetailsParcelable.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i);
                            break;
                    }
                }
                aais.Y(parcel, iK);
                appParcelable = new com.google.android.gms.wearable.internal.AppParcelable(strU6, strU7, webIconParcelable, strU8, strU9, fR, appWearDetailsParcelable);
                break;
            case 1:
                int iK2 = aais.K(parcel);
                int I13 = 0;
                byte bF = 0;
                byte bF2 = 0;
                byte bF3 = 0;
                byte bF4 = 0;
                java.lang.String strU10 = null;
                java.lang.String strU11 = null;
                java.lang.String strU12 = null;
                java.lang.String strU13 = null;
                java.lang.String strU14 = null;
                java.lang.String strU15 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            I13 = aais.I(parcel, i2);
                            break;
                        case 3:
                            strU10 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU11 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU12 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU13 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU5 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU14 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            bF = aais.F(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            bF2 = aais.F(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            bF3 = aais.F(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            bF4 = aais.F(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            strU15 = aais.U(parcel, i2);
                            break;
                        default:
                            aais.aa(parcel, i2);
                            break;
                    }
                }
                aais.Y(parcel, iK2);
                appParcelable = new com.google.android.gms.wearable.internal.AncsNotificationParcelable(I13, strU10, strU11, strU12, strU13, strU5, strU14, bF, bF2, bF3, bF4, strU15);
                break;
            case 2:
                int iK3 = aais.K(parcel);
                com.google.android.gms.wearable.internal.WebIconParcelable webIconParcelable2 = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        I = aais.I(parcel, i3);
                    } else if (c == 2) {
                        arrayListX3 = aais.X(parcel, i3, com.google.android.gms.wearable.internal.AppParcelable.CREATOR);
                    } else if (c != 3) {
                        aais.aa(parcel, i3);
                    } else {
                        webIconParcelable2 = (com.google.android.gms.wearable.internal.WebIconParcelable) aais.O(parcel, i3, com.google.android.gms.wearable.internal.WebIconParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.wearable.internal.AppRecommendationsResponse(I, arrayListX3, webIconParcelable2);
            case 3:
                int iK4 = aais.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        zAb2 = aais.ab(parcel, i4);
                    } else if (c2 != 2) {
                        aais.aa(parcel, i4);
                    } else {
                        arrayListW = aais.W(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.wearable.internal.AppWearDetailsParcelable(zAb2, arrayListW);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                boolean zAb3 = false;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        I12 = aais.I(parcel, i5);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        zAb3 = aais.ab(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.wearable.internal.BooleanResponse(I12, zAb3);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                java.util.ArrayList arrayListX4 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 2) {
                        strU4 = aais.U(parcel, i6);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i6);
                    } else {
                        arrayListX4 = aais.X(parcel, i6, com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.wearable.internal.CapabilityInfoParcelable(strU4, arrayListX4);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                int I14 = 0;
                com.google.android.gms.wearable.internal.ChannelImpl channelImpl = null;
                int I15 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 2) {
                        channelImpl = (com.google.android.gms.wearable.internal.ChannelImpl) aais.O(parcel, i7, com.google.android.gms.wearable.internal.ChannelImpl.CREATOR);
                    } else if (c5 == 3) {
                        I11 = aais.I(parcel, i7);
                    } else if (c5 == 4) {
                        I14 = aais.I(parcel, i7);
                    } else if (c5 != 5) {
                        aais.aa(parcel, i7);
                    } else {
                        I15 = aais.I(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.wearable.internal.ChannelEventParcelable(channelImpl, I11, I14, I15);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU16 = null;
                java.lang.String strU17 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        strU3 = aais.U(parcel, i8);
                    } else if (c6 == 3) {
                        strU16 = aais.U(parcel, i8);
                    } else if (c6 != 4) {
                        aais.aa(parcel, i8);
                    } else {
                        strU17 = aais.U(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.wearable.internal.ChannelImpl(strU3, strU16, strU17);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 2) {
                        aais.aa(parcel, i9);
                    } else {
                        I10 = aais.I(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.wearable.internal.ChannelReceiveFileResponse(I10);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        aais.aa(parcel, i10);
                    } else {
                        I9 = aais.I(parcel, i10);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.wearable.internal.ChannelSendFileResponse(I9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        aais.aa(parcel, i11);
                    } else {
                        I8 = aais.I(parcel, i11);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.wearable.internal.CloseChannelResponse(I8);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        I7 = aais.I(parcel, i12);
                    } else if (c7 != 2) {
                        aais.aa(parcel, i12);
                    } else {
                        strU2 = aais.U(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.wearable.internal.ConnectionStateEventParcelable(I7, strU2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                int I16 = 0;
                boolean zAb4 = false;
                boolean zAb5 = false;
                boolean zAb6 = false;
                java.lang.String strU18 = null;
                java.lang.Long lT = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            I16 = aais.I(parcel, i13);
                            break;
                        case 2:
                            zAb4 = aais.ab(parcel, i13);
                            break;
                        case 3:
                            zAb5 = aais.ab(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            zAb6 = aais.ab(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb = aais.ab(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            arrayListX2 = aais.X(parcel, i13, com.google.android.gms.wearable.internal.AccountConsentRecordParcelable.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU18 = aais.U(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            lT = aais.T(parcel, i13);
                            break;
                        default:
                            aais.aa(parcel, i13);
                            break;
                    }
                }
                aais.Y(parcel, iK13);
                appParcelable = new com.google.android.gms.wearable.internal.ConsentResponse(I16, zAb4, zAb5, zAb6, zAb, arrayListX2, strU18, lT);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                java.lang.String strU19 = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strU = aais.U(parcel, i14);
                    } else if (c8 != 3) {
                        aais.aa(parcel, i14);
                    } else {
                        strU19 = aais.U(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.wearable.internal.DataItemAssetParcelable(strU, strU19);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                android.os.Bundle bundleM = null;
                byte[] bArrAc2 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 2) {
                        uri = (android.net.Uri) aais.O(parcel, i15, android.net.Uri.CREATOR);
                    } else if (c9 == 4) {
                        bundleM = aais.M(parcel, i15);
                    } else if (c9 != 5) {
                        aais.aa(parcel, i15);
                    } else {
                        bArrAc2 = aais.ac(parcel, i15);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.wearable.internal.DataItemParcelable(uri, bundleM, bArrAc2);
            case 15:
                int iK16 = aais.K(parcel);
                int I17 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        I6 = aais.I(parcel, i16);
                    } else if (c10 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        I17 = aais.I(parcel, i16);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.wearable.internal.DeleteDataItemsResponse(I6, I17);
            case 16:
                int iK17 = aais.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aais.aa(parcel, i17);
                    } else {
                        bArrAc = aais.ac(parcel, i17);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable(bArrAc);
            case 17:
                int iK18 = aais.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        I5 = aais.I(parcel, i18);
                    } else if (c11 != 3) {
                        aais.aa(parcel, i18);
                    } else {
                        arrayListX = aais.X(parcel, i18, com.google.android.gms.wearable.internal.CapabilityInfoParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse(I5, arrayListX);
            case 18:
                int iK19 = aais.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 2) {
                        I4 = aais.I(parcel, i19);
                    } else if (c12 != 3) {
                        aais.aa(parcel, i19);
                    } else {
                        appTheme = (com.google.android.gms.wearable.AppTheme) aais.O(parcel, i19, com.google.android.gms.wearable.AppTheme.CREATOR);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.wearable.internal.GetAppThemeResponse(I4, appTheme);
            case 19:
                int iK20 = aais.K(parcel);
                boolean zAb7 = false;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        I3 = aais.I(parcel, i20);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        zAb7 = aais.ab(parcel, i20);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.wearable.internal.GetBackupSettingsSupportedResponse(I3, zAb7);
            default:
                int iK21 = aais.K(parcel);
                boolean zAb8 = false;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 2) {
                        I2 = aais.I(parcel, i21);
                    } else if (c14 == 3) {
                        zAb8 = aais.ab(parcel, i21);
                    } else if (c14 != 4) {
                        aais.aa(parcel, i21);
                    } else {
                        parcelableBackupDeviceArr = (com.google.android.gms.wearable.internal.ParcelableBackupDevice[]) aais.af(parcel, i21, com.google.android.gms.wearable.internal.ParcelableBackupDevice.CREATOR);
                    }
                }
                aais.Y(parcel, iK21);
                return new com.google.android.gms.wearable.internal.GetCachedBackupsResponse(I2, zAb8, parcelableBackupDeviceArr);
        }
        return appParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.wearable.internal.AppParcelable[i];
            case 1:
                return new com.google.android.gms.wearable.internal.AncsNotificationParcelable[i];
            case 2:
                return new com.google.android.gms.wearable.internal.AppRecommendationsResponse[i];
            case 3:
                return new com.google.android.gms.wearable.internal.AppWearDetailsParcelable[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.wearable.internal.BooleanResponse[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.wearable.internal.CapabilityInfoParcelable[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.wearable.internal.ChannelEventParcelable[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.wearable.internal.ChannelImpl[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.wearable.internal.ChannelReceiveFileResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.wearable.internal.ChannelSendFileResponse[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.wearable.internal.CloseChannelResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.wearable.internal.ConnectionStateEventParcelable[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.wearable.internal.ConsentResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.wearable.internal.DataItemAssetParcelable[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.wearable.internal.DataItemParcelable[i];
            case 15:
                return new com.google.android.gms.wearable.internal.DeleteDataItemsResponse[i];
            case 16:
                return new com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable[i];
            case 17:
                return new com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse[i];
            case 18:
                return new com.google.android.gms.wearable.internal.GetAppThemeResponse[i];
            case 19:
                return new com.google.android.gms.wearable.internal.GetBackupSettingsSupportedResponse[i];
            default:
                return new com.google.android.gms.wearable.internal.GetCachedBackupsResponse[i];
        }
    }
}
