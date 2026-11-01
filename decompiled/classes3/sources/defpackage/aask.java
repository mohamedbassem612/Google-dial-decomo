package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aask implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aask(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object backedUpContactsPerDeviceEntity;
        boolean zAb = false;
        int I = 0;
        int I2 = 0;
        boolean zAb2 = false;
        com.google.android.gms.common.data.DataHolder dataHolder = null;
        java.util.ArrayList arrayListW = null;
        android.content.Intent intent = null;
        byte[] bArrAc = null;
        int[] iArrAd = null;
        java.util.ArrayList arrayListX = null;
        java.lang.String strU = null;
        byte[] bArrAc2 = null;
        java.lang.String strU2 = null;
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity = null;
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity2 = null;
        java.lang.Boolean boolP = null;
        java.lang.String strU3 = null;
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity3 = null;
        java.lang.Integer numS = null;
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity4 = null;
        java.lang.Long lT = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        aais.aa(parcel, i);
                    } else {
                        zAb = aais.ab(parcel, i);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.people.peopleprovider.RequestDirectoryRefreshResponse(zAb);
            case 1:
                int iK2 = aais.K(parcel);
                java.util.ArrayList arrayListW2 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        dataHolder = (com.google.android.gms.common.data.DataHolder) aais.O(parcel, i2, com.google.android.gms.common.data.DataHolder.CREATOR);
                    } else if (c != 2) {
                        aais.aa(parcel, i2);
                    } else {
                        arrayListW2 = aais.W(parcel, i2);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.people.peopleprovider.QueryPersonsBufferResponse(dataHolder, arrayListW2);
            case 2:
                int iK3 = aais.K(parcel);
                java.lang.String strU4 = null;
                java.lang.Long lT2 = null;
                java.util.ArrayList arrayListX2 = null;
                java.lang.String strU5 = null;
                java.lang.Long lT3 = null;
                com.google.android.gms.people.protomodel.DeviceVersionEntity deviceVersionEntity = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strU4 = aais.U(parcel, i3);
                            break;
                        case 3:
                            arrayListX2 = aais.X(parcel, i3, com.google.android.gms.people.protomodel.SourceStatsEntity.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU5 = aais.U(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            lT3 = aais.T(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            lT = aais.T(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            lT2 = aais.T(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            deviceVersionEntity = (com.google.android.gms.people.protomodel.DeviceVersionEntity) aais.O(parcel, i3, com.google.android.gms.people.protomodel.DeviceVersionEntity.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i3);
                            break;
                    }
                }
                aais.Y(parcel, iK3);
                backedUpContactsPerDeviceEntity = new com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity(strU4, lT2, arrayListX2, strU5, lT3, lT, deviceVersionEntity);
                break;
            case 3:
                int iK4 = aais.K(parcel);
                java.lang.Long lT4 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        personFieldMetadataEntity4 = (com.google.android.gms.people.protomodel.PersonFieldMetadataEntity) aais.O(parcel, i4, com.google.android.gms.people.protomodel.PersonFieldMetadataEntity.CREATOR);
                    } else if (c2 != 3) {
                        aais.aa(parcel, i4);
                    } else {
                        lT4 = aais.T(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.people.protomodel.BirthdayEntity(personFieldMetadataEntity4, lT4);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        numS = aais.S(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.people.protomodel.DeviceVersionEntity(numS);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                java.lang.String strU6 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 2) {
                        personFieldMetadataEntity3 = (com.google.android.gms.people.protomodel.PersonFieldMetadataEntity) aais.O(parcel, i6, com.google.android.gms.people.protomodel.PersonFieldMetadataEntity.CREATOR);
                    } else if (c3 != 3) {
                        aais.aa(parcel, i6);
                    } else {
                        strU6 = aais.U(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.people.protomodel.EmailEntity(personFieldMetadataEntity3, strU6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity5 = null;
                java.lang.String strU7 = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                java.lang.String strU10 = null;
                java.lang.String strU11 = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 != 17) {
                        switch (c4) {
                            case 2:
                                personFieldMetadataEntity5 = (com.google.android.gms.people.protomodel.PersonFieldMetadataEntity) aais.O(parcel, i7, com.google.android.gms.people.protomodel.PersonFieldMetadataEntity.CREATOR);
                                break;
                            case 3:
                                strU7 = aais.U(parcel, i7);
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                strU11 = aais.U(parcel, i7);
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                strU9 = aais.U(parcel, i7);
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                strU10 = aais.U(parcel, i7);
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                strU3 = aais.U(parcel, i7);
                                break;
                            default:
                                aais.aa(parcel, i7);
                                break;
                        }
                    } else {
                        strU8 = aais.U(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                backedUpContactsPerDeviceEntity = new com.google.android.gms.people.protomodel.NameEntity(personFieldMetadataEntity5, strU7, strU8, strU9, strU10, strU3, strU11);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU12 = null;
                java.util.ArrayList arrayListX3 = null;
                java.util.ArrayList arrayListX4 = null;
                java.util.ArrayList arrayListX5 = null;
                java.util.ArrayList arrayListX6 = null;
                java.util.ArrayList arrayListX7 = null;
                java.util.ArrayList arrayListX8 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        strU12 = aais.U(parcel, i8);
                    } else if (c5 == '\t') {
                        arrayListX7 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.BirthdayEntity.CREATOR);
                    } else if (c5 == 11) {
                        arrayListX5 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.EmailEntity.CREATOR);
                    } else if (c5 == '\r') {
                        arrayListX6 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.PhoneEntity.CREATOR);
                    } else if (c5 == 148) {
                        arrayListX8 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.PhotoEntity.CREATOR);
                    } else if (c5 == 4) {
                        arrayListX3 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.NameEntity.CREATOR);
                    } else if (c5 != 5) {
                        aais.aa(parcel, i8);
                    } else {
                        arrayListX4 = aais.X(parcel, i8, com.google.android.gms.people.protomodel.PhotoEntity.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.people.protomodel.PersonEntity(strU12, arrayListX3, arrayListX4, arrayListX5, arrayListX6, arrayListX7, arrayListX8);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                int iS = 3;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 3) {
                        iS = aais.S(parcel, i9);
                    } else if (c6 != 4) {
                        aais.aa(parcel, i9);
                    } else {
                        boolP = aais.P(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.people.protomodel.PersonFieldMetadataEntity(iS, boolP);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                java.lang.String strU13 = null;
                java.lang.String strU14 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 2) {
                        personFieldMetadataEntity2 = (com.google.android.gms.people.protomodel.PersonFieldMetadataEntity) aais.O(parcel, i10, com.google.android.gms.people.protomodel.PersonFieldMetadataEntity.CREATOR);
                    } else if (c7 == 3) {
                        strU13 = aais.U(parcel, i10);
                    } else if (c7 != 4) {
                        aais.aa(parcel, i10);
                    } else {
                        strU14 = aais.U(parcel, i10);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.people.protomodel.PhoneEntity(personFieldMetadataEntity2, strU13, strU14);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                java.lang.String strU15 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 2) {
                        personFieldMetadataEntity = (com.google.android.gms.people.protomodel.PersonFieldMetadataEntity) aais.O(parcel, i11, com.google.android.gms.people.protomodel.PersonFieldMetadataEntity.CREATOR);
                    } else if (c8 != 3) {
                        aais.aa(parcel, i11);
                    } else {
                        strU15 = aais.U(parcel, i11);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.people.protomodel.PhotoEntity(personFieldMetadataEntity, strU15);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                java.lang.Integer numS2 = null;
                java.lang.Integer numS3 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        strU2 = aais.U(parcel, i12);
                    } else if (c9 == 3) {
                        numS2 = aais.S(parcel, i12);
                    } else if (c9 != 4) {
                        aais.aa(parcel, i12);
                    } else {
                        numS3 = aais.S(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.people.protomodel.SourceStatsEntity(strU2, numS2, numS3);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        aais.aa(parcel, i13);
                    } else {
                        bArrAc2 = aais.ac(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.phenotype.DogfoodsToken(bArrAc2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                java.lang.String strU16 = null;
                com.google.android.gms.phenotype.Flag flag = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        strU = aais.U(parcel, i14);
                    } else if (c10 == 3) {
                        strU16 = aais.U(parcel, i14);
                    } else if (c10 == 4) {
                        flag = (com.google.android.gms.phenotype.Flag) aais.O(parcel, i14, com.google.android.gms.phenotype.Flag.CREATOR);
                    } else if (c10 != 5) {
                        aais.aa(parcel, i14);
                    } else {
                        zAb2 = aais.ab(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.phenotype.FlagOverride(strU, strU16, flag, zAb2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        aais.aa(parcel, i15);
                    } else {
                        arrayListX = aais.X(parcel, i15, com.google.android.gms.phenotype.FlagOverride.CREATOR);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.phenotype.FlagOverrides(arrayListX);
            case 15:
                int iK16 = aais.K(parcel);
                int I3 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        I2 = aais.I(parcel, i16);
                    } else if (c11 != 2) {
                        aais.aa(parcel, i16);
                    } else {
                        I3 = aais.I(parcel, i16);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.phenotype.GenericDimension(I2, I3);
            case 16:
                int iK17 = aais.K(parcel);
                int I4 = 0;
                boolean zAb3 = false;
                int I5 = 0;
                int I6 = 0;
                java.lang.String strU17 = null;
                java.lang.String[] strArrAg = null;
                byte[] bArrAc3 = null;
                java.lang.String strU18 = null;
                byte[] bArrAc4 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            strU17 = aais.U(parcel, i17);
                            break;
                        case 2:
                            I4 = aais.I(parcel, i17);
                            break;
                        case 3:
                            strArrAg = aais.ag(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            bArrAc3 = aais.ac(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb3 = aais.ab(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            iArrAd = aais.ad(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU18 = aais.U(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            bArrAc4 = aais.ac(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            I5 = aais.I(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            I6 = aais.I(parcel, i17);
                            break;
                        default:
                            aais.aa(parcel, i17);
                            break;
                    }
                }
                aais.Y(parcel, iK17);
                backedUpContactsPerDeviceEntity = new com.google.android.gms.phenotype.RegistrationInfo(strU17, I4, strArrAg, bArrAc3, zAb3, iArrAd, strU18, bArrAc4, I5, I6);
                break;
            case 17:
                int iK18 = aais.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        aais.aa(parcel, i18);
                    } else {
                        bArrAc = aais.ac(parcel, i18);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.pseudonymous.DeviceWideZwiebackToken(bArrAc);
            case 18:
                return new com.google.android.gms.pseudonymous.SessionZwiebackToken(parcel);
            case 19:
                int iK19 = aais.K(parcel);
                int I7 = 0;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        I = aais.I(parcel, i19);
                    } else if (c12 == 2) {
                        I7 = aais.I(parcel, i19);
                    } else if (c12 != 3) {
                        aais.aa(parcel, i19);
                    } else {
                        intent = (android.content.Intent) aais.O(parcel, i19, android.content.Intent.CREATOR);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.signin.internal.AuthAccountResult(I, I7, intent);
            default:
                int iK20 = aais.K(parcel);
                java.lang.String strU19 = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        arrayListW = aais.W(parcel, i20);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        strU19 = aais.U(parcel, i20);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse(arrayListW, strU19);
        }
        return backedUpContactsPerDeviceEntity;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.people.peopleprovider.RequestDirectoryRefreshResponse[i];
            case 1:
                return new com.google.android.gms.people.peopleprovider.QueryPersonsBufferResponse[i];
            case 2:
                return new com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity[i];
            case 3:
                return new com.google.android.gms.people.protomodel.BirthdayEntity[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.people.protomodel.DeviceVersionEntity[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.people.protomodel.EmailEntity[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.people.protomodel.NameEntity[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.people.protomodel.PersonEntity[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.people.protomodel.PersonFieldMetadataEntity[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.people.protomodel.PhoneEntity[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.people.protomodel.PhotoEntity[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.people.protomodel.SourceStatsEntity[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.phenotype.DogfoodsToken[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.phenotype.FlagOverride[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.phenotype.FlagOverrides[i];
            case 15:
                return new com.google.android.gms.phenotype.GenericDimension[i];
            case 16:
                return new com.google.android.gms.phenotype.RegistrationInfo[i];
            case 17:
                return new com.google.android.gms.pseudonymous.DeviceWideZwiebackToken[i];
            case 18:
                return new com.google.android.gms.pseudonymous.SessionZwiebackToken[i];
            case 19:
                return new com.google.android.gms.signin.internal.AuthAccountResult[i];
            default:
                return new com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse[i];
        }
    }
}
