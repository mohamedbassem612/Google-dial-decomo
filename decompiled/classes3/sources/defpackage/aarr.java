package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarr implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aarr(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object account;
        long jL = 0;
        int I = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        int I2 = 0;
        int I3 = 0;
        com.google.android.gms.common.api.Status statusU = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                java.lang.String strU = null;
                java.lang.String strU2 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        statusU = aais.U(parcel, i);
                    } else if (c == 2) {
                        strU = aais.U(parcel, i);
                    } else if (c != 3) {
                        aais.aa(parcel, i);
                    } else {
                        strU2 = aais.U(parcel, i);
                    }
                }
                aais.Y(parcel, iK);
                account = new com.google.android.gms.people.cpg.cpgex.Account(statusU, strU, strU2);
                break;
            case 1:
                int iK2 = aais.K(parcel);
                com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        statusU = (com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) aais.O(parcel, i2, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                    } else if (c2 != 2) {
                        aais.aa(parcel, i2);
                    } else {
                        identifier = (com.google.android.gms.people.cpg.callingcard.v2.Identifier) aais.O(parcel, i2, com.google.android.gms.people.cpg.callingcard.v2.Identifier.CREATOR);
                    }
                }
                aais.Y(parcel, iK2);
                account = new com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse(statusU, identifier);
                break;
            case 2:
                int iK3 = aais.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        jL = aais.L(parcel, i3);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i3);
                    } else {
                        statusU = aais.U(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.people.cpg.cpgex.Cp2Identifier(jL, statusU);
            case 3:
                int iK4 = aais.K(parcel);
                java.lang.Long lT = null;
                java.lang.Long lT2 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        statusU = (com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus) aais.O(parcel, i4, com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus.CREATOR);
                    } else if (c4 == 2) {
                        lT = aais.T(parcel, i4);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i4);
                    } else {
                        lT2 = aais.T(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                account = new com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult(statusU, lT, lT2);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                com.google.android.gms.people.cpg.cpgex.Identifier identifier2 = null;
                com.google.android.gms.people.cpg.cpgex.CpgExDataContents cpgExDataContents = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        statusU = (com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus) aais.O(parcel, i5, com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus.CREATOR);
                    } else if (c5 == 2) {
                        identifier2 = (com.google.android.gms.people.cpg.cpgex.Identifier) aais.O(parcel, i5, com.google.android.gms.people.cpg.cpgex.Identifier.CREATOR);
                    } else if (c5 != 3) {
                        aais.aa(parcel, i5);
                    } else {
                        cpgExDataContents = (com.google.android.gms.people.cpg.cpgex.CpgExDataContents) aais.O(parcel, i5, com.google.android.gms.people.cpg.cpgex.CpgExDataContents.CREATOR);
                    }
                }
                aais.Y(parcel, iK5);
                account = new com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult(statusU, identifier2, cpgExDataContents);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                boolean zAb3 = false;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        I = aais.I(parcel, i6);
                    } else if (c6 != 2) {
                        aais.aa(parcel, i6);
                    } else {
                        zAb3 = aais.ab(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                account = new com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult(I, zAb3);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aais.aa(parcel, i7);
                    } else {
                        I3 = aais.I(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus(I3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                java.util.ArrayList arrayListX = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        statusU = (com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus) aais.O(parcel, i8, com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus.CREATOR);
                    } else if (c7 != 2) {
                        aais.aa(parcel, i8);
                    } else {
                        arrayListX = aais.X(parcel, i8, com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                account = new com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse(statusU, arrayListX);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                java.lang.Long lT3 = null;
                java.lang.Long lT4 = null;
                com.google.android.gms.people.cpg.cpgex.Cp2Identifier cp2Identifier = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        statusU = (com.google.android.gms.people.cpg.cpgex.Account) aais.O(parcel, i9, com.google.android.gms.people.cpg.cpgex.Account.CREATOR);
                    } else if (c8 == 2) {
                        lT3 = aais.T(parcel, i9);
                    } else if (c8 == 3) {
                        lT4 = aais.T(parcel, i9);
                    } else if (c8 != 4) {
                        aais.aa(parcel, i9);
                    } else {
                        cp2Identifier = (com.google.android.gms.people.cpg.cpgex.Cp2Identifier) aais.O(parcel, i9, com.google.android.gms.people.cpg.cpgex.Cp2Identifier.CREATOR);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.people.cpg.cpgex.Identifier(statusU, lT3, lT4, cp2Identifier);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                java.util.ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        statusU = (com.google.android.gms.common.api.Status) aais.O(parcel, i10, com.google.android.gms.common.api.Status.CREATOR);
                    } else if (c9 != 2) {
                        aais.aa(parcel, i10);
                    } else {
                        arrayListX2 = aais.X(parcel, i10, com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                account = new com.google.android.gms.people.cpg.cpgex.IsCpgExFeatureSupportedResponse(statusU, arrayListX2);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                java.util.ArrayList arrayListX3 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        statusU = (com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus) aais.O(parcel, i11, com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus.CREATOR);
                    } else if (c10 != 2) {
                        aais.aa(parcel, i11);
                    } else {
                        arrayListX3 = aais.X(parcel, i11, com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                account = new com.google.android.gms.people.cpg.cpgex.MutateCpgExDataResponse(statusU, arrayListX3);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i12 = parcel.readInt();
                java.lang.String[] strArr = new java.lang.String[i12];
                parcel.readStringArray(strArr);
                int i13 = parcel.readInt();
                com.google.android.gms.common.api.Status matrixCursor = new android.database.MatrixCursor(strArr);
                if (i12 != 0 || i13 != 0) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        matrixCursor.addRow(parcel.readArray(java.lang.Object.class.getClassLoader()));
                    }
                    statusU = matrixCursor;
                }
                return new com.google.android.gms.people.internal.MatrixCursorParcelable(statusU);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK12 = aais.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        I2 = aais.I(parcel, i15);
                    } else if (c11 == 3) {
                        statusU = aais.U(parcel, i15);
                    } else if (c11 != 4) {
                        aais.aa(parcel, i15);
                    } else {
                        jL = aais.L(parcel, i15);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.people.internal.SyncStatus(I2, statusU, jL);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK13 = aais.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        aais.aa(parcel, i16);
                    } else {
                        statusU = (android.app.PendingIntent) aais.O(parcel, i16, android.app.PendingIntent.CREATOR);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.people.peopleprovider.CreateInteractionPendingIntentResponse(statusU);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK14 = aais.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aais.aa(parcel, i17);
                    } else {
                        statusU = aais.X(parcel, i17, com.google.android.gms.people.peopleprovider.PeopleProviderDirectory.CREATOR);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.people.peopleprovider.GetDirectoriesResponse(statusU);
            case 15:
                int iK15 = aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        aais.aa(parcel, i18);
                    } else {
                        zAb2 = aais.ab(parcel, i18);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.people.peopleprovider.IsPeopleProviderSupportedResponse(zAb2);
            case 16:
                int iK16 = aais.K(parcel);
                while (parcel.dataPosition() < iK16) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        aais.aa(parcel, i19);
                    } else {
                        zAb = aais.ab(parcel, i19);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.people.peopleprovider.NotifyDirectoryChangeResponse(zAb);
            case 17:
                int iK17 = aais.K(parcel);
                java.lang.String strU3 = null;
                while (parcel.dataPosition() < iK17) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        statusU = aais.U(parcel, i20);
                    } else if (c12 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        strU3 = aais.U(parcel, i20);
                    }
                }
                aais.Y(parcel, iK17);
                account = new com.google.android.gms.people.peopleprovider.PeopleProviderDirectory(statusU, strU3);
                break;
            case 18:
                int iK18 = aais.K(parcel);
                java.lang.String strU4 = null;
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                while (parcel.dataPosition() < iK18) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strU4 = aais.U(parcel, i21);
                            break;
                        case 2:
                            strU5 = aais.U(parcel, i21);
                            break;
                        case 3:
                            strU6 = aais.U(parcel, i21);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU7 = aais.U(parcel, i21);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU8 = aais.U(parcel, i21);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU9 = aais.U(parcel, i21);
                            break;
                        default:
                            aais.aa(parcel, i21);
                            break;
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.people.peopleprovider.PeopleProviderGroup(strU4, strU5, strU6, strU7, strU8, strU9);
            case 19:
                int iK19 = aais.K(parcel);
                int I4 = 0;
                boolean zAb4 = false;
                java.lang.String strU10 = null;
                java.lang.String strU11 = null;
                android.net.Uri uri = null;
                java.lang.String strU12 = null;
                java.lang.String strU13 = null;
                java.lang.String strU14 = null;
                while (parcel.dataPosition() < iK19) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            strU10 = aais.U(parcel, i22);
                            break;
                        case 2:
                            strU11 = aais.U(parcel, i22);
                            break;
                        case 3:
                            uri = (android.net.Uri) aais.O(parcel, i22, android.net.Uri.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU12 = aais.U(parcel, i22);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I4 = aais.I(parcel, i22);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU13 = aais.U(parcel, i22);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            statusU = aais.U(parcel, i22);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU14 = aais.U(parcel, i22);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            zAb4 = aais.ab(parcel, i22);
                            break;
                        default:
                            aais.aa(parcel, i22);
                            break;
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.people.peopleprovider.PeopleProviderPerson(strU10, strU11, uri, strU12, I4, strU13, statusU, strU14, zAb4);
            default:
                int iK20 = aais.K(parcel);
                java.util.ArrayList arrayListW = null;
                while (parcel.dataPosition() < iK20) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        statusU = (com.google.android.gms.common.data.DataHolder) aais.O(parcel, i23, com.google.android.gms.common.data.DataHolder.CREATOR);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i23);
                    } else {
                        arrayListW = aais.W(parcel, i23);
                    }
                }
                aais.Y(parcel, iK20);
                account = new com.google.android.gms.people.peopleprovider.QueryGroupsBufferResponse(statusU, arrayListW);
                break;
        }
        return account;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.people.cpg.cpgex.Account[i];
            case 1:
                return new com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse[i];
            case 2:
                return new com.google.android.gms.people.cpg.cpgex.Cp2Identifier[i];
            case 3:
                return new com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.people.cpg.cpgex.CpgExFeatureSupportResult[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.people.cpg.cpgex.Identifier[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.people.cpg.cpgex.IsCpgExFeatureSupportedResponse[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.people.cpg.cpgex.MutateCpgExDataResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.people.internal.MatrixCursorParcelable[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.people.internal.SyncStatus[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.people.peopleprovider.CreateInteractionPendingIntentResponse[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.people.peopleprovider.GetDirectoriesResponse[i];
            case 15:
                return new com.google.android.gms.people.peopleprovider.IsPeopleProviderSupportedResponse[i];
            case 16:
                return new com.google.android.gms.people.peopleprovider.NotifyDirectoryChangeResponse[i];
            case 17:
                return new com.google.android.gms.people.peopleprovider.PeopleProviderDirectory[i];
            case 18:
                return new com.google.android.gms.people.peopleprovider.PeopleProviderGroup[i];
            case 19:
                return new com.google.android.gms.people.peopleprovider.PeopleProviderPerson[i];
            default:
                return new com.google.android.gms.people.peopleprovider.QueryGroupsBufferResponse[i];
        }
    }
}
