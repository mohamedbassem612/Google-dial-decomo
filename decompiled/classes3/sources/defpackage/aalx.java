package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalx implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aalx(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object rawContactActionPreference;
        long jL = 0;
        float fH = 0.0f;
        int I = 0;
        java.lang.String[] strArrAg = null;
        com.google.android.gms.people.cpg.callingcard.v2.FontData fontData = null;
        java.lang.Long lT = null;
        java.lang.Float fR = null;
        java.lang.Float fR2 = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        java.lang.String strU = null;
        com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus = null;
        com.google.android.gms.people.cpg.callingcard.CallingCardFileData callingCardFileData = null;
        com.google.android.gms.people.cpg.callingcard.CallingCardFontData callingCardFontData = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                int I2 = 0;
                boolean zAb = false;
                java.lang.String strU2 = null;
                java.lang.String strU3 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strU2 = aais.U(parcel, i);
                    } else if (c == 3) {
                        strArrAg = aais.ag(parcel, i);
                    } else if (c == 4) {
                        I2 = aais.I(parcel, i);
                    } else if (c == 5) {
                        zAb = aais.ab(parcel, i);
                    } else if (c != 6) {
                        aais.aa(parcel, i);
                    } else {
                        strU3 = aais.U(parcel, i);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.feedback.ServiceDumpRequest(strU2, strU3, strArrAg, I2, zAb);
            case 1:
                int iK2 = aais.K(parcel);
                int I3 = 0;
                java.lang.String strU4 = null;
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                long jL2 = 0;
                java.lang.String strU7 = null;
                long jL3 = 0;
                int I4 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            jL3 = aais.L(parcel, i2);
                            break;
                        case 2:
                            I4 = aais.I(parcel, i2);
                            break;
                        case 3:
                            strU4 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I3 = aais.I(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU5 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU6 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU7 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            jL2 = aais.L(parcel, i2);
                            break;
                        default:
                            aais.aa(parcel, i2);
                            break;
                    }
                }
                aais.Y(parcel, iK2);
                rawContactActionPreference = new com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference(jL3, I4, strU4, I3, strU5, strU6, strU7, jL2);
                break;
            case 2:
                int iK3 = aais.K(parcel);
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) aais.O(parcel, i3, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c2 == 2) {
                        strU8 = aais.U(parcel, i3);
                    } else if (c2 != 3) {
                        aais.aa(parcel, i3);
                    } else {
                        strU9 = aais.U(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.people.cpg.callingcard.CallingCardFileData(parcelFileDescriptor2, strU8, strU9);
            case 3:
                int iK4 = aais.K(parcel);
                float fH2 = 0.0f;
                float fH3 = 0.0f;
                float fH4 = 0.0f;
                float fH5 = 0.0f;
                float fH6 = 0.0f;
                float fH7 = 0.0f;
                float fH8 = 0.0f;
                int I5 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            fH2 = aais.H(parcel, i4);
                            break;
                        case 2:
                            fH3 = aais.H(parcel, i4);
                            break;
                        case 3:
                            fH4 = aais.H(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            fH5 = aais.H(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            fH6 = aais.H(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            fH7 = aais.H(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            I5 = aais.I(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            I = aais.I(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            fH8 = aais.H(parcel, i4);
                            break;
                        default:
                            aais.aa(parcel, i4);
                            break;
                    }
                }
                aais.Y(parcel, iK4);
                rawContactActionPreference = new com.google.android.gms.people.cpg.callingcard.CallingCardFontData(fH2, fH3, fH4, fH5, fH6, fH7, I5, I, fH8);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                float fH9 = 0.0f;
                float fH10 = 0.0f;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        fH = aais.H(parcel, i5);
                    } else if (c3 == 2) {
                        fH9 = aais.H(parcel, i5);
                    } else if (c3 != 3) {
                        aais.aa(parcel, i5);
                    } else {
                        fH10 = aais.H(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData(fH, fH9, fH10);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aais.aa(parcel, i6);
                    } else {
                        jL = aais.L(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier(jL);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData callingCardFullScreenImageData = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        callingCardFontData = (com.google.android.gms.people.cpg.callingcard.CallingCardFontData) aais.O(parcel, i7, com.google.android.gms.people.cpg.callingcard.CallingCardFontData.CREATOR);
                    } else if (c4 != 2) {
                        aais.aa(parcel, i7);
                    } else {
                        callingCardFullScreenImageData = (com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData) aais.O(parcel, i7, com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData.CREATOR);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.people.cpg.callingcard.CallingCardMetadata(callingCardFontData, callingCardFullScreenImageData);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        aais.aa(parcel, i8);
                    } else {
                        I = aais.I(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus(I);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        I = aais.I(parcel, i9);
                    } else if (c5 == 2) {
                        callingCardFileData = (com.google.android.gms.people.cpg.callingcard.CallingCardFileData) aais.O(parcel, i9, com.google.android.gms.people.cpg.callingcard.CallingCardFileData.CREATOR);
                    } else if (c5 != 3) {
                        aais.aa(parcel, i9);
                    } else {
                        callingCardMetadata = (com.google.android.gms.people.cpg.callingcard.CallingCardMetadata) aais.O(parcel, i9, com.google.android.gms.people.cpg.callingcard.CallingCardMetadata.CREATOR);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest(I, callingCardFileData, callingCardMetadata);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier callingCardIdentifier = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        callingCardRequestStatus = (com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) aais.O(parcel, i10, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                    } else if (c6 != 2) {
                        aais.aa(parcel, i10);
                    } else {
                        callingCardIdentifier = (com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier) aais.O(parcel, i10, com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse(callingCardRequestStatus, callingCardIdentifier);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                int I6 = 0;
                com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus2 = null;
                android.net.Uri uri = null;
                java.lang.String strU10 = null;
                com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata2 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        callingCardRequestStatus2 = (com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) aais.O(parcel, i11, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                    } else if (c7 == 2) {
                        I6 = aais.I(parcel, i11);
                    } else if (c7 == 3) {
                        uri = (android.net.Uri) aais.O(parcel, i11, android.net.Uri.CREATOR);
                    } else if (c7 == 4) {
                        strU10 = aais.U(parcel, i11);
                    } else if (c7 != 5) {
                        aais.aa(parcel, i11);
                    } else {
                        callingCardMetadata2 = (com.google.android.gms.people.cpg.callingcard.CallingCardMetadata) aais.O(parcel, i11, com.google.android.gms.people.cpg.callingcard.CallingCardMetadata.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse(callingCardRequestStatus2, I6, uri, strU10, callingCardMetadata2);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                java.lang.String strU11 = null;
                java.lang.String strU12 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        strU = aais.U(parcel, i12);
                    } else if (c8 == 2) {
                        strU11 = aais.U(parcel, i12);
                    } else if (c8 != 3) {
                        aais.aa(parcel, i12);
                    } else {
                        strU12 = aais.U(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.people.cpg.callingcard.v2.AccountInfo(strU, strU11, strU12);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                java.lang.String strU13 = null;
                java.lang.String strU14 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i13, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 2) {
                        strU13 = aais.U(parcel, i13);
                    } else if (c9 != 3) {
                        aais.aa(parcel, i13);
                    } else {
                        strU14 = aais.U(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.people.cpg.callingcard.v2.FileData(parcelFileDescriptor, strU13, strU14);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                float fH11 = 0.0f;
                float fH12 = 0.0f;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        fH = aais.H(parcel, i14);
                    } else if (c10 == 2) {
                        fH11 = aais.H(parcel, i14);
                    } else if (c10 == 3) {
                        fH12 = aais.H(parcel, i14);
                    } else if (c10 != 4) {
                        aais.aa(parcel, i14);
                    } else {
                        fR2 = aais.R(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.people.cpg.callingcard.v2.FontColor(fH, fH11, fH12, fR2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.v2.FontColor fontColor = null;
                java.lang.Float fR3 = null;
                java.lang.Float fR4 = null;
                java.lang.Integer numS = null;
                java.lang.Integer numS2 = null;
                java.lang.Float fR5 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            fontColor = (com.google.android.gms.people.cpg.callingcard.v2.FontColor) aais.O(parcel, i15, com.google.android.gms.people.cpg.callingcard.v2.FontColor.CREATOR);
                            break;
                        case 2:
                            fR3 = aais.R(parcel, i15);
                            break;
                        case 3:
                            fR4 = aais.R(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            numS = aais.S(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            numS2 = aais.S(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            fR5 = aais.R(parcel, i15);
                            break;
                        default:
                            aais.aa(parcel, i15);
                            break;
                    }
                }
                aais.Y(parcel, iK15);
                rawContactActionPreference = new com.google.android.gms.people.cpg.callingcard.v2.FontData(fontColor, fR3, fR4, numS, numS2, fR5);
                break;
            case 15:
                int iK16 = aais.K(parcel);
                java.lang.Float fR6 = null;
                java.lang.Float fR7 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        fR = aais.R(parcel, i16);
                    } else if (c11 == 2) {
                        fR6 = aais.R(parcel, i16);
                    } else if (c11 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        fR7 = aais.R(parcel, i16);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData(fR, fR6, fR7);
            case 16:
                int iK17 = aais.K(parcel);
                int I7 = 0;
                com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus3 = null;
                android.net.Uri uri2 = null;
                com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata = null;
                java.lang.String strU15 = null;
                java.lang.String strU16 = null;
                java.lang.Long lT2 = null;
                com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier = null;
                java.lang.String strU17 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            callingCardRequestStatus3 = (com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) aais.O(parcel, i17, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                            break;
                        case 2:
                            I7 = aais.I(parcel, i17);
                            break;
                        case 3:
                            uri2 = (android.net.Uri) aais.O(parcel, i17, android.net.Uri.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            metadata = (com.google.android.gms.people.cpg.callingcard.v2.Metadata) aais.O(parcel, i17, com.google.android.gms.people.cpg.callingcard.v2.Metadata.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU15 = aais.U(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU16 = aais.U(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            lT2 = aais.T(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            identifier = (com.google.android.gms.people.cpg.callingcard.v2.Identifier) aais.O(parcel, i17, com.google.android.gms.people.cpg.callingcard.v2.Identifier.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            strU17 = aais.U(parcel, i17);
                            break;
                        default:
                            aais.aa(parcel, i17);
                            break;
                    }
                }
                aais.Y(parcel, iK17);
                rawContactActionPreference = new com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse(callingCardRequestStatus3, I7, uri2, metadata, strU15, strU16, lT2, identifier, strU17);
                break;
            case 17:
                int iK18 = aais.K(parcel);
                java.lang.String strU18 = null;
                com.google.android.gms.people.cpg.callingcard.v2.AccountInfo accountInfo = null;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        I = aais.I(parcel, i18);
                    } else if (c12 == 2) {
                        lT = aais.T(parcel, i18);
                    } else if (c12 == 3) {
                        strU18 = aais.U(parcel, i18);
                    } else if (c12 != 4) {
                        aais.aa(parcel, i18);
                    } else {
                        accountInfo = (com.google.android.gms.people.cpg.callingcard.v2.AccountInfo) aais.O(parcel, i18, com.google.android.gms.people.cpg.callingcard.v2.AccountInfo.CREATOR);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.people.cpg.callingcard.v2.Identifier(I, lT, strU18, accountInfo);
            case 18:
                int iK19 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData fullScreenImageData = null;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 1) {
                        fontData = (com.google.android.gms.people.cpg.callingcard.v2.FontData) aais.O(parcel, i19, com.google.android.gms.people.cpg.callingcard.v2.FontData.CREATOR);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i19);
                    } else {
                        fullScreenImageData = (com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData) aais.O(parcel, i19, com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData.CREATOR);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.people.cpg.callingcard.v2.Metadata(fontData, fullScreenImageData);
            case 19:
                int iK20 = aais.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        aais.aa(parcel, i20);
                    } else {
                        I = aais.I(parcel, i20);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.people.cpg.callingcard.v2.PurgeCallingCardsRequest(I);
            default:
                int iK21 = aais.K(parcel);
                int I8 = 0;
                com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier2 = null;
                com.google.android.gms.people.cpg.callingcard.v2.FileData fileData = null;
                com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata2 = null;
                java.lang.String strU19 = null;
                java.lang.String strU20 = null;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            I8 = aais.I(parcel, i21);
                            break;
                        case 2:
                            identifier2 = (com.google.android.gms.people.cpg.callingcard.v2.Identifier) aais.O(parcel, i21, com.google.android.gms.people.cpg.callingcard.v2.Identifier.CREATOR);
                            break;
                        case 3:
                            fileData = (com.google.android.gms.people.cpg.callingcard.v2.FileData) aais.O(parcel, i21, com.google.android.gms.people.cpg.callingcard.v2.FileData.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            metadata2 = (com.google.android.gms.people.cpg.callingcard.v2.Metadata) aais.O(parcel, i21, com.google.android.gms.people.cpg.callingcard.v2.Metadata.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU19 = aais.U(parcel, i21);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU20 = aais.U(parcel, i21);
                            break;
                        default:
                            aais.aa(parcel, i21);
                            break;
                    }
                }
                aais.Y(parcel, iK21);
                rawContactActionPreference = new com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest(I8, identifier2, fileData, metadata2, strU19, strU20);
                break;
        }
        return rawContactActionPreference;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.feedback.ServiceDumpRequest[i];
            case 1:
                return new com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference[i];
            case 2:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardFileData[i];
            case 3:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardFontData[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardMetadata[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.people.cpg.callingcard.v2.AccountInfo[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.people.cpg.callingcard.v2.FileData[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.people.cpg.callingcard.v2.FontColor[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.people.cpg.callingcard.v2.FontData[i];
            case 15:
                return new com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData[i];
            case 16:
                return new com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse[i];
            case 17:
                return new com.google.android.gms.people.cpg.callingcard.v2.Identifier[i];
            case 18:
                return new com.google.android.gms.people.cpg.callingcard.v2.Metadata[i];
            case 19:
                return new com.google.android.gms.people.cpg.callingcard.v2.PurgeCallingCardsRequest[i];
            default:
                return new com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest[i];
        }
    }
}
