package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalw implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aalw(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object contactsConsentsCoarseStatus;
        long jL = 0;
        com.google.android.gms.feedback.ServiceDumpRequest serviceDumpRequest = null;
        java.util.ArrayList arrayListW = null;
        java.lang.String strU = null;
        com.google.android.gms.people.cpg.GroupContactOrder groupContactOrder = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        android.accounts.Account account = null;
        android.accounts.Account account2 = null;
        java.lang.String strU4 = null;
        com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus contactsConsentsCoarseStatus2 = null;
        android.os.Bundle bundleM = null;
        java.lang.String strU5 = null;
        java.util.ArrayList arrayListX = null;
        java.lang.String strU6 = null;
        int I = 0;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                byte[] bArrAc = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        serviceDumpRequest = (com.google.android.gms.feedback.ServiceDumpRequest) aais.O(parcel, i, com.google.android.gms.feedback.ServiceDumpRequest.CREATOR);
                    } else if (c != 3) {
                        aais.aa(parcel, i);
                    } else {
                        bArrAc = aais.ac(parcel, i);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.feedback.ServiceDump(serviceDumpRequest, bArrAc);
            case 1:
                int iK2 = aais.K(parcel);
                java.lang.String strU7 = null;
                int I2 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strU6 = aais.U(parcel, i2);
                    } else if (c2 == 2) {
                        strU7 = aais.U(parcel, i2);
                    } else if (c2 == 3) {
                        I = aais.I(parcel, i2);
                    } else if (c2 != 4) {
                        aais.aa(parcel, i2);
                    } else {
                        I2 = aais.I(parcel, i2);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.people.account.categories.ClassifyAccountTypeResult(strU6, strU7, I, I2);
            case 2:
                int iK3 = aais.K(parcel);
                java.lang.String strU8 = "";
                java.util.ArrayList arrayListX2 = null;
                java.util.ArrayList arrayListX3 = null;
                boolean zAb = false;
                boolean zAb2 = false;
                boolean zAb3 = false;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            zAb = aais.ab(parcel, i3);
                            break;
                        case 2:
                            zAb2 = aais.ab(parcel, i3);
                            break;
                        case 3:
                            arrayListX2 = aais.X(parcel, i3, android.accounts.Account.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            arrayListX3 = aais.X(parcel, i3, android.accounts.Account.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU8 = aais.U(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb3 = aais.ab(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            arrayListX = aais.X(parcel, i3, android.accounts.Account.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i3);
                            break;
                    }
                }
                aais.Y(parcel, iK3);
                contactsConsentsCoarseStatus = new com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus(zAb, zAb2, arrayListX2, arrayListX3, strU8, zAb3, arrayListX);
                break;
            case 3:
                int iK4 = aais.K(parcel);
                android.accounts.Account account3 = null;
                boolean zAb4 = false;
                boolean zAb5 = false;
                boolean zAb6 = false;
                boolean zAb7 = false;
                boolean zAb8 = false;
                boolean zAb9 = false;
                java.util.ArrayList arrayListX4 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            zAb4 = aais.ab(parcel, i4);
                            break;
                        case 2:
                            zAb5 = aais.ab(parcel, i4);
                            break;
                        case 3:
                            zAb6 = aais.ab(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            account3 = (android.accounts.Account) aais.O(parcel, i4, android.accounts.Account.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            zAb7 = aais.ab(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb8 = aais.ab(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU5 = aais.U(parcel, i4);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            arrayListX4 = aais.X(parcel, i4, android.accounts.Account.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            zAb9 = aais.ab(parcel, i4);
                            break;
                        default:
                            aais.aa(parcel, i4);
                            break;
                    }
                }
                aais.Y(parcel, iK4);
                contactsConsentsCoarseStatus = new com.google.android.gms.people.consentprimitive.ContactsConsentsConfig(zAb4, zAb5, zAb6, account3, zAb7, zAb8, strU5, arrayListX4, zAb9);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        I = aais.I(parcel, i5);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        bundleM = aais.M(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus(I, bundleM);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
                com.google.android.gms.people.consentprimitive.ContactsConsentsConfig contactsConsentsConfig = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        contactsConsentsCoarseStatus2 = (com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus) aais.O(parcel, i6, com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus.CREATOR);
                    } else if (c4 == 2) {
                        contactsConsentsDetailedStatus = (com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus) aais.O(parcel, i6, com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus.CREATOR);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i6);
                    } else {
                        contactsConsentsConfig = (com.google.android.gms.people.consentprimitive.ContactsConsentsConfig) aais.O(parcel, i6, com.google.android.gms.people.consentprimitive.ContactsConsentsConfig.CREATOR);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsStatus(contactsConsentsCoarseStatus2, contactsConsentsDetailedStatus, contactsConsentsConfig);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                int[] iArrAd = null;
                java.lang.String[] strArrAg = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        strU4 = aais.U(parcel, i7);
                    } else if (c5 == 2) {
                        iArrAd = aais.ad(parcel, i7);
                    } else if (c5 == 4) {
                        I = aais.I(parcel, i7);
                    } else if (c5 != 5) {
                        aais.aa(parcel, i7);
                    } else {
                        strArrAg = aais.ag(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState(strU4, iArrAd, I, strArrAg);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                int I3 = 0;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        I = aais.I(parcel, i8);
                    } else if (c6 != 3) {
                        aais.aa(parcel, i8);
                    } else {
                        I3 = aais.I(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion(I, I3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                int I4 = 0;
                int I5 = 0;
                int I6 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        I = aais.I(parcel, i9);
                    } else if (c7 == 2) {
                        I4 = aais.I(parcel, i9);
                    } else if (c7 == 3) {
                        I5 = aais.I(parcel, i9);
                    } else if (c7 != 4) {
                        aais.aa(parcel, i9);
                    } else {
                        I6 = aais.I(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.people.contactssync.model.BackupSyncContactInfo(I, I4, I5, I6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                java.lang.String strU9 = null;
                int I7 = 0;
                int I8 = 0;
                boolean zAb10 = false;
                java.lang.String strU10 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        strU10 = aais.U(parcel, i10);
                    } else if (c8 == 2) {
                        strU9 = aais.U(parcel, i10);
                    } else if (c8 == 3) {
                        I7 = aais.I(parcel, i10);
                    } else if (c8 == 4) {
                        I8 = aais.I(parcel, i10);
                    } else if (c8 != 5) {
                        aais.aa(parcel, i10);
                    } else {
                        zAb10 = aais.ab(parcel, i10);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.people.contactssync.model.BackupSyncSettings(strU10, strU9, I7, I8, zAb10);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        I = aais.I(parcel, i11);
                    } else if (c9 != 2) {
                        aais.aa(parcel, i11);
                    } else {
                        account2 = (android.accounts.Account) aais.O(parcel, i11, android.accounts.Account.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.people.contactssync.model.DefaultContactsAccountAndState(I, account2);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        I = aais.I(parcel, i12);
                    } else if (c10 != 2) {
                        aais.aa(parcel, i12);
                    } else {
                        account = (android.accounts.Account) aais.O(parcel, i12, android.accounts.Account.CREATOR);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting(I, account);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                long jL2 = 0;
                java.lang.String strU11 = null;
                int I9 = 0;
                int I10 = 0;
                int I11 = 0;
                int I12 = 0;
                int I13 = 0;
                int I14 = 0;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            I9 = aais.I(parcel, i13);
                            break;
                        case 3:
                            strU11 = aais.U(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            jL2 = aais.L(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I10 = aais.I(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I11 = aais.I(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            I12 = aais.I(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            I = aais.I(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            I13 = aais.I(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            I14 = aais.I(parcel, i13);
                            break;
                        default:
                            aais.aa(parcel, i13);
                            break;
                    }
                }
                aais.Y(parcel, iK13);
                contactsConsentsCoarseStatus = new com.google.android.gms.people.contactssync.model.ExtendedSyncStatus(I9, strU11, jL2, I10, I11, I12, I, I13, I14);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                com.google.android.gms.people.contactssync.model.BackupSyncContactInfo backupSyncContactInfo = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        I = aais.I(parcel, i14);
                    } else if (c11 == 2) {
                        strU3 = aais.U(parcel, i14);
                    } else if (c11 != 3) {
                        aais.aa(parcel, i14);
                    } else {
                        backupSyncContactInfo = (com.google.android.gms.people.contactssync.model.BackupSyncContactInfo) aais.O(parcel, i14, com.google.android.gms.people.contactssync.model.BackupSyncContactInfo.CREATOR);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse(I, strU3, backupSyncContactInfo);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    aais.aa(parcel, parcel.readInt());
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse();
            case 15:
                int iK16 = aais.K(parcel);
                boolean zAb11 = false;
                while (parcel.dataPosition() < iK16) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 2) {
                        I = aais.I(parcel, i15);
                    } else if (c12 != 3) {
                        aais.aa(parcel, i15);
                    } else {
                        zAb11 = aais.ab(parcel, i15);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest(I, zAb11);
            case 16:
                int iK17 = aais.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        I = aais.I(parcel, i16);
                    } else if (c13 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        strU2 = aais.U(parcel, i16);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.people.contactssync.model.TetheredSyncStatus(I, strU2);
            case 17:
                int iK18 = aais.K(parcel);
                java.lang.String strU12 = null;
                java.lang.String strU13 = null;
                int I15 = 0;
                int I16 = 0;
                long jL3 = 0;
                java.lang.String strU14 = null;
                int I17 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            strU14 = aais.U(parcel, i17);
                            break;
                        case 2:
                            I17 = aais.I(parcel, i17);
                            break;
                        case 3:
                            I15 = aais.I(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU12 = aais.U(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU13 = aais.U(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I16 = aais.I(parcel, i17);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            jL3 = aais.L(parcel, i17);
                            break;
                        default:
                            aais.aa(parcel, i17);
                            break;
                    }
                }
                aais.Y(parcel, iK18);
                contactsConsentsCoarseStatus = new com.google.android.gms.people.cpg.ActionPreference(strU14, I17, I15, strU12, strU13, I16, jL3);
                break;
            case 18:
                int iK19 = aais.K(parcel);
                com.google.android.gms.people.cpg.ActionPreference actionPreference = null;
                while (parcel.dataPosition() < iK19) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        I = aais.I(parcel, i18);
                    } else if (c14 == 2) {
                        groupContactOrder = (com.google.android.gms.people.cpg.GroupContactOrder) aais.O(parcel, i18, com.google.android.gms.people.cpg.GroupContactOrder.CREATOR);
                    } else if (c14 != 3) {
                        aais.aa(parcel, i18);
                    } else {
                        actionPreference = (com.google.android.gms.people.cpg.ActionPreference) aais.O(parcel, i18, com.google.android.gms.people.cpg.ActionPreference.CREATOR);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.people.cpg.CpgDocument(I, groupContactOrder, actionPreference);
            case 19:
                int iK20 = aais.K(parcel);
                java.util.ArrayList arrayListV = null;
                while (parcel.dataPosition() < iK20) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        strU = aais.U(parcel, i19);
                    } else if (c15 == 2) {
                        arrayListV = aais.V(parcel, i19);
                    } else if (c15 != 3) {
                        aais.aa(parcel, i19);
                    } else {
                        jL = aais.L(parcel, i19);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.people.cpg.GroupContactOrder(strU, arrayListV, jL);
            default:
                int iK21 = aais.K(parcel);
                while (parcel.dataPosition() < iK21) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        aais.aa(parcel, i20);
                    } else {
                        arrayListW = aais.W(parcel, i20);
                    }
                }
                aais.Y(parcel, iK21);
                return new com.google.android.gms.people.cpg.actionpreferences.ContactActionSettings(arrayListW);
        }
        return contactsConsentsCoarseStatus;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.feedback.ServiceDump[i];
            case 1:
                return new com.google.android.gms.people.account.categories.ClassifyAccountTypeResult[i];
            case 2:
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus[i];
            case 3:
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsConfig[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.people.consentprimitive.ContactsConsentsStatus[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.people.contactssync.model.BackupSyncContactInfo[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.people.contactssync.model.BackupSyncSettings[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.people.contactssync.model.DefaultContactsAccountAndState[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.people.contactssync.model.ExtendedSyncStatus[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse[i];
            case 15:
                return new com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest[i];
            case 16:
                return new com.google.android.gms.people.contactssync.model.TetheredSyncStatus[i];
            case 17:
                return new com.google.android.gms.people.cpg.ActionPreference[i];
            case 18:
                return new com.google.android.gms.people.cpg.CpgDocument[i];
            case 19:
                return new com.google.android.gms.people.cpg.GroupContactOrder[i];
            default:
                return new com.google.android.gms.people.cpg.actionpreferences.ContactActionSettings[i];
        }
    }
}
