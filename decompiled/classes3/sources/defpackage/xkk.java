package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkk implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public xkk(int i) {
        this.$cid = i;
    }

    public static final com.android.onboarding.pending.PendingTaskContract a(android.os.Parcel parcel) {
        aooh.f(parcel, "parcel");
        java.lang.Object objCreateFromParcel = android.os.PersistableBundle.CREATOR.createFromParcel(parcel);
        aooh.e(objCreateFromParcel, "createFromParcel(...)");
        return new com.android.onboarding.pending.PendingTaskContract((android.os.PersistableBundle) objCreateFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object samplerConfigParcelable;
        long jL = 0;
        java.util.ArrayList arrayListX = null;
        java.util.ArrayList arrayListX2 = null;
        java.lang.String strU = null;
        java.lang.String strU2 = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        java.lang.String strU3 = null;
        android.content.Intent intent = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        int I6 = 0;
        boolean zAb4 = false;
        switch (this.$cid) {
            case 0:
                return a(parcel);
            case 1:
                int iK = aais.K(parcel);
                com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        arrayListX = aais.X(parcel, i, com.google.android.gms.clearcut.LogEventParcelable.CREATOR);
                    } else if (c != 2) {
                        aais.aa(parcel, i);
                    } else {
                        batchedLogErrorParcelable = (com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) aais.O(parcel, i, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.clearcut.BatchedLogEventParcelable(arrayListX, batchedLogErrorParcelable);
            case 2:
                int iK2 = aais.K(parcel);
                int I7 = 0;
                int I8 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        I = aais.I(parcel, i2);
                    } else if (c2 == 2) {
                        I7 = aais.I(parcel, i2);
                    } else if (c2 != 3) {
                        aais.aa(parcel, i2);
                    } else {
                        I8 = aais.I(parcel, i2);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable(I, I7, I8);
            case 3:
                int iK3 = aais.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        aais.aa(parcel, i3);
                    } else {
                        zAb4 = aais.ab(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.clearcut.internal.LogVerifierResultParcelable(zAb4);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK4 = aais.K(parcel);
                double dG = 0.0d;
                java.lang.String strU4 = null;
                int I9 = 0;
                int I10 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        I6 = aais.I(parcel, i4);
                    } else if (c3 == 2) {
                        dG = aais.G(parcel, i4);
                    } else if (c3 == 3) {
                        I9 = aais.I(parcel, i4);
                    } else if (c3 == 4) {
                        I10 = aais.I(parcel, i4);
                    } else if (c3 != 5) {
                        aais.aa(parcel, i4);
                    } else {
                        strU4 = aais.U(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                samplerConfigParcelable = new com.google.android.gms.clearcut.sampler.SamplerConfigParcelable(I6, dG, I9, I10, strU4);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK5 = aais.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        zAb3 = aais.ab(parcel, i5);
                    } else if (c4 != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        jL = aais.L(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable(zAb3, jL);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK6 = aais.K(parcel);
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aais.aa(parcel, i6);
                    } else {
                        intent = (android.content.Intent) aais.O(parcel, i6, android.content.Intent.CREATOR);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.cloudmessaging.CloudMessage(intent);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat(parcel.readStrongBinder());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK7 = aais.K(parcel);
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                java.lang.String strU10 = null;
                int I11 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            strU5 = aais.U(parcel, i7);
                            break;
                        case 2:
                            strU6 = aais.U(parcel, i7);
                            break;
                        case 3:
                            strU7 = aais.U(parcel, i7);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU8 = aais.U(parcel, i7);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU9 = aais.U(parcel, i7);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I11 = aais.I(parcel, i7);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU10 = aais.U(parcel, i7);
                            break;
                        default:
                            aais.aa(parcel, i7);
                            break;
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.cloudmessaging.RegisterRequest(strU5, strU6, strU7, strU8, strU9, I11, strU10);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU11 = null;
                android.os.IBinder iBinderN = null;
                boolean zAb5 = false;
                boolean zAb6 = false;
                boolean zAb7 = false;
                boolean zAb8 = false;
                boolean zAb9 = false;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strU11 = aais.U(parcel, i8);
                            break;
                        case 2:
                            zAb5 = aais.ab(parcel, i8);
                            break;
                        case 3:
                            zAb6 = aais.ab(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            iBinderN = aais.N(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb7 = aais.ab(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb8 = aais.ab(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        default:
                            aais.aa(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            zAb9 = aais.ab(parcel, i8);
                            break;
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.common.GoogleCertificatesLookupQuery(strU11, zAb5, zAb6, iBinderN, zAb7, zAb8, zAb9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK9 = aais.K(parcel);
                long jL2 = -1;
                java.lang.String strU12 = null;
                int I12 = 0;
                int I13 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        zAb2 = aais.ab(parcel, i9);
                    } else if (c5 == 2) {
                        strU12 = aais.U(parcel, i9);
                    } else if (c5 == 3) {
                        I12 = aais.I(parcel, i9);
                    } else if (c5 == 4) {
                        I13 = aais.I(parcel, i9);
                    } else if (c5 != 5) {
                        aais.aa(parcel, i9);
                    } else {
                        jL2 = aais.L(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                samplerConfigParcelable = new com.google.android.gms.common.GoogleCertificatesLookupResponse(zAb2, strU12, I12, I13, jL2);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK10 = aais.K(parcel);
                android.os.IBinder iBinderN2 = null;
                boolean zAb10 = false;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        strU3 = aais.U(parcel, i10);
                    } else if (c6 == 2) {
                        iBinderN2 = aais.N(parcel, i10);
                    } else if (c6 == 3) {
                        zAb = aais.ab(parcel, i10);
                    } else if (c6 != 4) {
                        aais.aa(parcel, i10);
                    } else {
                        zAb10 = aais.ab(parcel, i10);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.common.GoogleCertificatesQuery(strU3, iBinderN2, zAb, zAb10);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        aais.aa(parcel, i11);
                    } else {
                        jL = aais.L(parcel, i11);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.common.api.SourceUserContext(jL);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK12 = aais.K(parcel);
                int I14 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        I5 = aais.I(parcel, i12);
                    } else if (c7 == 2) {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i12, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c7 != 3) {
                        aais.aa(parcel, i12);
                    } else {
                        I14 = aais.I(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.common.data.BitmapTeleporter(I5, parcelFileDescriptor, I14);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK13 = aais.K(parcel);
                java.lang.String[] strArrAg = null;
                android.database.CursorWindow[] cursorWindowArr = null;
                android.os.Bundle bundleM = null;
                int I15 = 0;
                int I16 = 0;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        strArrAg = aais.ag(parcel, i13);
                    } else if (c8 == 2) {
                        cursorWindowArr = (android.database.CursorWindow[]) aais.af(parcel, i13, android.database.CursorWindow.CREATOR);
                    } else if (c8 == 3) {
                        I16 = aais.I(parcel, i13);
                    } else if (c8 == 4) {
                        bundleM = aais.M(parcel, i13);
                    } else if (c8 != 1000) {
                        aais.aa(parcel, i13);
                    } else {
                        I15 = aais.I(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                com.google.android.gms.common.data.DataHolder dataHolder = new com.google.android.gms.common.data.DataHolder(I15, strArrAg, cursorWindowArr, I16, bundleM);
                dataHolder.c = new android.os.Bundle();
                int i14 = 0;
                while (true) {
                    java.lang.String[] strArr = dataHolder.b;
                    if (i14 >= strArr.length) {
                        android.database.CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i15 = 0; i15 < cursorWindowArr2.length; i15++) {
                            dataHolder.g[i15] = numRows;
                            numRows += cursorWindowArr2[i15].getNumRows() - (numRows - cursorWindowArr2[i15].getStartPosition());
                        }
                        dataHolder.h = numRows;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i14], i14);
                    i14++;
                }
                break;
            case 15:
                int iK14 = aais.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        I4 = aais.I(parcel, i16);
                    } else if (c9 != 2) {
                        aais.aa(parcel, i16);
                    } else {
                        strU2 = aais.U(parcel, i16);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.common.internal.ClientIdentity(I4, strU2);
            case 16:
                int iK15 = aais.K(parcel);
                long jL3 = 0;
                java.lang.String strU13 = null;
                int I17 = 0;
                boolean zAb11 = false;
                while (parcel.dataPosition() < iK15) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        I3 = aais.I(parcel, i17);
                    } else if (c10 == 2) {
                        strU13 = aais.U(parcel, i17);
                    } else if (c10 == 3) {
                        jL3 = aais.L(parcel, i17);
                    } else if (c10 == 4) {
                        I17 = aais.I(parcel, i17);
                    } else if (c10 != 5) {
                        aais.aa(parcel, i17);
                    } else {
                        zAb11 = aais.ab(parcel, i17);
                    }
                }
                aais.Y(parcel, iK15);
                samplerConfigParcelable = new com.google.android.gms.common.internal.ClientNotificationEvent(I3, strU13, jL3, I17, zAb11);
                break;
            case 17:
                int iK16 = aais.K(parcel);
                int I18 = 1;
                int I19 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        I2 = aais.I(parcel, i18);
                    } else if (c11 == 2) {
                        strU = aais.U(parcel, i18);
                    } else if (c11 == 3) {
                        I19 = aais.I(parcel, i18);
                    } else if (c11 != 4) {
                        aais.aa(parcel, i18);
                    } else {
                        I18 = aais.I(parcel, i18);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.common.internal.ClientThrottlingTelemetryData.ClientThrottlingEventData(I2, strU, I19, I18);
            case 18:
                int iK17 = aais.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        aais.aa(parcel, i19);
                    } else {
                        arrayListX2 = aais.X(parcel, i19, com.google.android.gms.common.internal.ClientThrottlingTelemetryData.ClientThrottlingEventData.CREATOR);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.common.internal.ClientThrottlingTelemetryData(arrayListX2);
            case 19:
                int iK18 = aais.K(parcel);
                com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrAd = null;
                int[] iArrAd2 = null;
                boolean zAb12 = false;
                boolean zAb13 = false;
                int I20 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            rootTelemetryConfiguration = (com.google.android.gms.common.internal.RootTelemetryConfiguration) aais.O(parcel, i20, com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zAb12 = aais.ab(parcel, i20);
                            break;
                        case 3:
                            zAb13 = aais.ab(parcel, i20);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            iArrAd = aais.ad(parcel, i20);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I20 = aais.I(parcel, i20);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            iArrAd2 = aais.ad(parcel, i20);
                            break;
                        default:
                            aais.aa(parcel, i20);
                            break;
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zAb12, zAb13, iArrAd, I20, iArrAd2);
            default:
                int iK19 = aais.K(parcel);
                while (true) {
                    android.util.SparseArray sparseArray = null;
                    while (true) {
                        if (parcel.dataPosition() >= iK19) {
                            aais.Y(parcel, iK19);
                            return new com.google.android.gms.common.internal.ConnectionThrottlingConfig(sparseArray);
                        }
                        int i21 = parcel.readInt();
                        if (((char) i21) != 1) {
                            aais.aa(parcel, i21);
                        } else {
                            android.os.Parcelable.Creator creator = com.google.android.gms.libs.throttling.ThrottlingLimits.CREATOR;
                            int iJ = aais.J(parcel, i21);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ != 0) {
                                int i22 = parcel.readInt();
                                android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                                for (int i23 = 0; i23 < i22; i23++) {
                                    sparseArray2.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                                }
                                parcel.setDataPosition(iDataPosition + iJ);
                                sparseArray = sparseArray2;
                            }
                        }
                    }
                }
                break;
        }
        return samplerConfigParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.android.onboarding.pending.PendingTaskContract[i];
            case 1:
                return new com.google.android.gms.clearcut.BatchedLogEventParcelable[i];
            case 2:
                return new com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable[i];
            case 3:
                return new com.google.android.gms.clearcut.internal.LogVerifierResultParcelable[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.clearcut.sampler.SamplerConfigParcelable[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.cloudmessaging.CloudMessage[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.cloudmessaging.RegisterRequest[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.common.GoogleCertificatesLookupQuery[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.common.GoogleCertificatesLookupResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.common.GoogleCertificatesQuery[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.common.api.SourceUserContext[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.common.data.BitmapTeleporter[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.common.data.DataHolder[i];
            case 15:
                return new com.google.android.gms.common.internal.ClientIdentity[i];
            case 16:
                return new com.google.android.gms.common.internal.ClientNotificationEvent[i];
            case 17:
                return new com.google.android.gms.common.internal.ClientThrottlingTelemetryData.ClientThrottlingEventData[i];
            case 18:
                return new com.google.android.gms.common.internal.ClientThrottlingTelemetryData[i];
            case 19:
                return new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[i];
            default:
                return new com.google.android.gms.common.internal.ConnectionThrottlingConfig[i];
        }
    }
}
