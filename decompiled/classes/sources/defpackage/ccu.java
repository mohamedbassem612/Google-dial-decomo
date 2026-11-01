package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ccu implements android.os.Parcelable.Creator {
    public static final defpackage.ccu a = new defpackage.ccu(9);
    private final /* synthetic */ int $cid;

    public ccu(int i) {
        this.$cid = i;
    }

    public static void a(com.google.android.gms.common.internal.GetServiceRequest getServiceRequest, android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(getServiceRequest.c);
        parcel.writeInt(262146);
        parcel.writeInt(getServiceRequest.d);
        parcel.writeInt(262147);
        parcel.writeInt(getServiceRequest.e);
        java.lang.String str = getServiceRequest.f;
        if (str != null) {
            int iF2 = defpackage.aais.f(parcel, 4);
            parcel.writeString(str);
            defpackage.aais.g(parcel, iF2);
        }
        android.os.IBinder iBinder = getServiceRequest.g;
        if (iBinder != null) {
            int iF3 = defpackage.aais.f(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            defpackage.aais.g(parcel, iF3);
        }
        defpackage.aais.D(parcel, 6, getServiceRequest.h, i);
        android.os.Bundle bundle = getServiceRequest.i;
        if (bundle != null) {
            int iF4 = defpackage.aais.f(parcel, 7);
            parcel.writeBundle(bundle);
            defpackage.aais.g(parcel, iF4);
        }
        defpackage.aais.z(parcel, 8, getServiceRequest.j, i);
        defpackage.aais.D(parcel, 10, getServiceRequest.k, i);
        defpackage.aais.D(parcel, 11, getServiceRequest.l, i);
        boolean z = getServiceRequest.m;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i2 = getServiceRequest.n;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        boolean z2 = getServiceRequest.o;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        java.lang.String str2 = getServiceRequest.p;
        if (str2 != null) {
            int iF5 = defpackage.aais.f(parcel, 15);
            parcel.writeString(str2);
            defpackage.aais.g(parcel, iF5);
        }
        defpackage.aais.g(parcel, iF);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws aahs {
        java.lang.Object playLoggerContext;
        java.lang.Object feature;
        java.util.ArrayList arrayListX = null;
        com.google.android.gms.phenotype.Flag[] flagArr = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        android.net.Uri uri = null;
        java.lang.String strU = null;
        android.os.IBinder iBinderN = null;
        com.google.android.gms.common.Feature[] featureArr = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = null;
        java.lang.Integer numS = null;
        java.lang.String strU4 = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        boolean zAb = false;
        int I4 = 0;
        int i = 0;
        int I5 = 0;
        int I6 = 0;
        boolean zAb2 = false;
        switch (this.$cid) {
            case 0:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 1:
                return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(parcel.readInt());
            case 2:
                return new androidx.compose.runtime.ParcelableSnapshotMutableIntState(parcel.readInt());
            case 3:
                return new androidx.compose.runtime.ParcelableSnapshotMutableLongState(parcel.readLong());
            case 4:
                int iK = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        defpackage.aais.aa(parcel, i2);
                    } else {
                        arrayListX = defpackage.aais.X(parcel, i2, com.google.android.gms.clearcut.internal.LogErrorParcelable.CREATOR);
                    }
                }
                defpackage.aais.Y(parcel, iK);
                return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable(arrayListX);
            case 5:
                int iK2 = defpackage.aais.K(parcel);
                int I7 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        strU4 = defpackage.aais.U(parcel, i3);
                    } else if (c == 2) {
                        I = defpackage.aais.I(parcel, i3);
                    } else if (c != 3) {
                        defpackage.aais.aa(parcel, i3);
                    } else {
                        I7 = defpackage.aais.I(parcel, i3);
                    }
                }
                defpackage.aais.Y(parcel, iK2);
                return new com.google.android.gms.clearcut.internal.LogErrorParcelable(strU4, I, I7);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                int iK3 = defpackage.aais.K(parcel);
                java.lang.String strU5 = null;
                java.lang.Integer numS2 = null;
                int I8 = 0;
                int I9 = 0;
                boolean zAb3 = false;
                int I10 = 0;
                boolean zAb4 = false;
                int I11 = 0;
                boolean zAb5 = true;
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                while (parcel.dataPosition() < iK3) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strU5 = defpackage.aais.U(parcel, i4);
                            break;
                        case 3:
                            I8 = defpackage.aais.I(parcel, i4);
                            break;
                        case 4:
                            I9 = defpackage.aais.I(parcel, i4);
                            break;
                        case 5:
                            strU6 = defpackage.aais.U(parcel, i4);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        default:
                            defpackage.aais.aa(parcel, i4);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            zAb5 = defpackage.aais.ab(parcel, i4);
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            strU7 = defpackage.aais.U(parcel, i4);
                            break;
                        case '\t':
                            zAb3 = defpackage.aais.ab(parcel, i4);
                            break;
                        case '\n':
                            I10 = defpackage.aais.I(parcel, i4);
                            break;
                        case 11:
                            numS2 = defpackage.aais.S(parcel, i4);
                            break;
                        case '\f':
                            zAb4 = defpackage.aais.ab(parcel, i4);
                            break;
                        case '\r':
                            I11 = defpackage.aais.I(parcel, i4);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK3);
                playLoggerContext = new com.google.android.gms.clearcut.internal.PlayLoggerContext(strU5, I8, I9, strU6, zAb5, strU7, zAb3, I10, numS2, zAb4, I11);
                return playLoggerContext;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                int iK4 = defpackage.aais.K(parcel);
                android.app.PendingIntent pendingIntent = null;
                java.lang.String strU8 = null;
                int I12 = 0;
                int I13 = 0;
                android.os.Bundle bundleM = null;
                while (parcel.dataPosition() < iK4) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            I12 = defpackage.aais.I(parcel, i5);
                            break;
                        case 2:
                            I13 = defpackage.aais.I(parcel, i5);
                            break;
                        case 3:
                            pendingIntent = (android.app.PendingIntent) defpackage.aais.O(parcel, i5, android.app.PendingIntent.CREATOR);
                            break;
                        case 4:
                            strU8 = defpackage.aais.U(parcel, i5);
                            break;
                        case 5:
                            numS = defpackage.aais.S(parcel, i5);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            bundleM = defpackage.aais.M(parcel, i5);
                            break;
                        default:
                            defpackage.aais.aa(parcel, i5);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK4);
                playLoggerContext = new com.google.android.gms.common.ConnectionResult(I12, I13, pendingIntent, strU8, numS, bundleM);
                return playLoggerContext;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                int iK5 = defpackage.aais.K(parcel);
                boolean zAb6 = false;
                long j = -1;
                java.lang.String strU9 = null;
                int i6 = 0;
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        strU9 = defpackage.aais.U(parcel, i7);
                    } else if (c2 == 2) {
                        defpackage.aais.Z(parcel, i7, 4);
                        i6 = parcel.readInt();
                    } else if (c2 == 3) {
                        defpackage.aais.Z(parcel, i7, 8);
                        j = parcel.readLong();
                    } else if (c2 != 4) {
                        defpackage.aais.aa(parcel, i7);
                    } else {
                        zAb6 = defpackage.aais.ab(parcel, i7);
                    }
                }
                defpackage.aais.Y(parcel, iK5);
                feature = new com.google.android.gms.common.Feature(strU9, i6, j, zAb6);
                return feature;
            case 9:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return com.google.android.gms.common.api.ApiMetadata.a;
                }
                int iK6 = defpackage.aais.K(parcel);
                com.google.android.gms.common.api.SourceUserContext sourceUserContext = null;
                while (parcel.dataPosition() < iK6) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        complianceOptions = (com.google.android.gms.common.api.ComplianceOptions) defpackage.aais.O(parcel, i8, com.google.android.gms.common.api.ComplianceOptions.CREATOR);
                    } else if (c3 == 2) {
                        zAb2 = defpackage.aais.ab(parcel, i8);
                    } else if (c3 != 3) {
                        defpackage.aais.aa(parcel, i8);
                    } else {
                        sourceUserContext = (com.google.android.gms.common.api.SourceUserContext) defpackage.aais.O(parcel, i8, com.google.android.gms.common.api.SourceUserContext.CREATOR);
                    }
                }
                defpackage.aais.Y(parcel, iK6);
                return new com.google.android.gms.common.api.ApiMetadata(complianceOptions, zAb2, sourceUserContext);
            case 10:
                int iK7 = defpackage.aais.K(parcel);
                boolean zAb7 = true;
                int I14 = 0;
                int I15 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        I6 = defpackage.aais.I(parcel, i9);
                    } else if (c4 == 2) {
                        I14 = defpackage.aais.I(parcel, i9);
                    } else if (c4 == 3) {
                        I15 = defpackage.aais.I(parcel, i9);
                    } else if (c4 != 4) {
                        defpackage.aais.aa(parcel, i9);
                    } else {
                        zAb7 = defpackage.aais.ab(parcel, i9);
                    }
                }
                defpackage.aais.Y(parcel, iK7);
                return new com.google.android.gms.common.api.ComplianceOptions(I6, I14, I15, zAb7);
            case 11:
                int iK8 = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK8) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        I5 = defpackage.aais.I(parcel, i10);
                    } else if (c5 != 2) {
                        defpackage.aais.aa(parcel, i10);
                    } else {
                        strU3 = defpackage.aais.U(parcel, i10);
                    }
                }
                defpackage.aais.Y(parcel, iK8);
                return new com.google.android.gms.common.api.Scope(I5, strU3);
            case 12:
                int iK9 = defpackage.aais.K(parcel);
                com.google.android.gms.common.ConnectionResult connectionResult = null;
                int i11 = 0;
                android.app.PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iK9) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        defpackage.aais.Z(parcel, i12, 4);
                        i11 = parcel.readInt();
                    } else if (c6 == 2) {
                        strU2 = defpackage.aais.U(parcel, i12);
                    } else if (c6 == 3) {
                        pendingIntent2 = (android.app.PendingIntent) defpackage.aais.O(parcel, i12, android.app.PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        defpackage.aais.aa(parcel, i12);
                    } else {
                        connectionResult = (com.google.android.gms.common.ConnectionResult) defpackage.aais.O(parcel, i12, com.google.android.gms.common.ConnectionResult.CREATOR);
                    }
                }
                defpackage.aais.Y(parcel, iK9);
                return new com.google.android.gms.common.api.Status(i11, strU2, pendingIntent2, connectionResult);
            case 13:
                int iK10 = defpackage.aais.K(parcel);
                android.os.Bundle bundleM2 = null;
                com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig = null;
                java.lang.String strU10 = null;
                while (parcel.dataPosition() < iK10) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            bundleM2 = defpackage.aais.M(parcel, i13);
                            break;
                        case 2:
                            featureArr = (com.google.android.gms.common.Feature[]) defpackage.aais.af(parcel, i13, com.google.android.gms.common.Feature.CREATOR);
                            break;
                        case 3:
                            defpackage.aais.Z(parcel, i13, 4);
                            i = parcel.readInt();
                            break;
                        case 4:
                            connectionTelemetryConfiguration = (com.google.android.gms.common.internal.ConnectionTelemetryConfiguration) defpackage.aais.O(parcel, i13, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR);
                            break;
                        case 5:
                            connectionThrottlingConfig = (com.google.android.gms.common.internal.ConnectionThrottlingConfig) defpackage.aais.O(parcel, i13, com.google.android.gms.common.internal.ConnectionThrottlingConfig.CREATOR);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            strU10 = defpackage.aais.U(parcel, i13);
                            break;
                        default:
                            defpackage.aais.aa(parcel, i13);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK10);
                return new com.google.android.gms.common.internal.ConnectionInfo(bundleM2, featureArr, i, connectionTelemetryConfiguration, connectionThrottlingConfig, strU10);
            case 14:
                int iK11 = defpackage.aais.K(parcel);
                com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.a;
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.common.Feature[] featureArr2 = com.google.android.gms.common.internal.GetServiceRequest.b;
                com.google.android.gms.common.Feature[] featureArr3 = featureArr2;
                java.lang.String strU11 = null;
                android.accounts.Account account = null;
                java.lang.String strU12 = null;
                int I16 = 0;
                int I17 = 0;
                int I18 = 0;
                boolean zAb8 = false;
                int I19 = 0;
                boolean zAb9 = false;
                com.google.android.gms.common.api.Scope[] scopeArr2 = scopeArr;
                while (parcel.dataPosition() < iK11) {
                    int i14 = parcel.readInt();
                    int i15 = I17;
                    switch ((char) i14) {
                        case 1:
                            I16 = defpackage.aais.I(parcel, i14);
                            break;
                        case 2:
                            I17 = defpackage.aais.I(parcel, i14);
                            continue;
                        case 3:
                            I18 = defpackage.aais.I(parcel, i14);
                            break;
                        case 4:
                            strU11 = defpackage.aais.U(parcel, i14);
                            break;
                        case 5:
                            iBinderN = defpackage.aais.N(parcel, i14);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr2 = (com.google.android.gms.common.api.Scope[]) defpackage.aais.af(parcel, i14, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = defpackage.aais.M(parcel, i14);
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            account = (android.accounts.Account) defpackage.aais.O(parcel, i14, android.accounts.Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            defpackage.aais.aa(parcel, i14);
                            break;
                        case '\n':
                            featureArr2 = (com.google.android.gms.common.Feature[]) defpackage.aais.af(parcel, i14, com.google.android.gms.common.Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (com.google.android.gms.common.Feature[]) defpackage.aais.af(parcel, i14, com.google.android.gms.common.Feature.CREATOR);
                            break;
                        case '\f':
                            zAb8 = defpackage.aais.ab(parcel, i14);
                            break;
                        case '\r':
                            I19 = defpackage.aais.I(parcel, i14);
                            break;
                        case 14:
                            zAb9 = defpackage.aais.ab(parcel, i14);
                            break;
                        case 15:
                            strU12 = defpackage.aais.U(parcel, i14);
                            break;
                    }
                    I17 = i15;
                }
                defpackage.aais.Y(parcel, iK11);
                playLoggerContext = new com.google.android.gms.common.internal.GetServiceRequest(I16, I17, I18, strU11, iBinderN, scopeArr2, bundle, account, featureArr2, featureArr3, zAb8, I19, zAb9, strU12);
                return playLoggerContext;
            case 15:
                int iK12 = defpackage.aais.K(parcel);
                boolean zAb10 = false;
                boolean zAb11 = false;
                int I20 = 0;
                int I21 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        I4 = defpackage.aais.I(parcel, i16);
                    } else if (c7 == 2) {
                        zAb10 = defpackage.aais.ab(parcel, i16);
                    } else if (c7 == 3) {
                        zAb11 = defpackage.aais.ab(parcel, i16);
                    } else if (c7 == 4) {
                        I20 = defpackage.aais.I(parcel, i16);
                    } else if (c7 != 5) {
                        defpackage.aais.aa(parcel, i16);
                    } else {
                        I21 = defpackage.aais.I(parcel, i16);
                    }
                }
                defpackage.aais.Y(parcel, iK12);
                feature = new com.google.android.gms.common.internal.RootTelemetryConfiguration(I4, zAb10, zAb11, I20, I21);
                return feature;
            case 16:
                int iK13 = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        defpackage.aais.aa(parcel, i17);
                    } else {
                        zAb = defpackage.aais.ab(parcel, i17);
                    }
                }
                defpackage.aais.Y(parcel, iK13);
                return new com.google.android.gms.duokit.GetApiAvailabilityRequest(zAb);
            case 17:
                int iK14 = defpackage.aais.K(parcel);
                long jL = 0;
                while (parcel.dataPosition() < iK14) {
                    int i18 = parcel.readInt();
                    char c8 = (char) i18;
                    if (c8 == 1) {
                        strU = defpackage.aais.U(parcel, i18);
                    } else if (c8 != 2) {
                        defpackage.aais.aa(parcel, i18);
                    } else {
                        jL = defpackage.aais.L(parcel, i18);
                    }
                }
                defpackage.aais.Y(parcel, iK14);
                return new com.google.android.gms.mdisync.CallerInfo(strU, jL);
            case 18:
                int iK15 = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i19 = parcel.readInt();
                    char c9 = (char) i19;
                    if (c9 == 1) {
                        uri = (android.net.Uri) defpackage.aais.O(parcel, i19, android.net.Uri.CREATOR);
                    } else if (c9 != 2) {
                        defpackage.aais.aa(parcel, i19);
                    } else {
                        I3 = defpackage.aais.I(parcel, i19);
                    }
                }
                defpackage.aais.Y(parcel, iK15);
                return new com.google.android.gms.mobstore.OpenFileDescriptorRequest(uri, I3);
            case 19:
                int iK16 = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK16) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        defpackage.aais.aa(parcel, i20);
                    } else {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.aais.O(parcel, i20, android.os.ParcelFileDescriptor.CREATOR);
                    }
                }
                defpackage.aais.Y(parcel, iK16);
                return new com.google.android.gms.mobstore.OpenFileDescriptorResponse(parcelFileDescriptor);
            default:
                int iK17 = defpackage.aais.K(parcel);
                java.lang.String[] strArrAg = null;
                while (parcel.dataPosition() < iK17) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 2) {
                        I2 = defpackage.aais.I(parcel, i21);
                    } else if (c10 == 3) {
                        flagArr = (com.google.android.gms.phenotype.Flag[]) defpackage.aais.af(parcel, i21, com.google.android.gms.phenotype.Flag.CREATOR);
                    } else if (c10 != 4) {
                        defpackage.aais.aa(parcel, i21);
                    } else {
                        strArrAg = defpackage.aais.ag(parcel, i21);
                    }
                }
                defpackage.aais.Y(parcel, iK17);
                return new com.google.android.gms.phenotype.Configuration(I2, flagArr, strArrAg);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState[i];
            case 1:
                return new androidx.compose.foundation.lazy.layout.DefaultLazyKey[i];
            case 2:
                return new androidx.compose.runtime.ParcelableSnapshotMutableIntState[i];
            case 3:
                return new androidx.compose.runtime.ParcelableSnapshotMutableLongState[i];
            case 4:
                return new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable[i];
            case 5:
                return new com.google.android.gms.clearcut.internal.LogErrorParcelable[i];
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.gms.clearcut.internal.PlayLoggerContext[i];
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.gms.common.ConnectionResult[i];
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.gms.common.Feature[i];
            case 9:
                return new com.google.android.gms.common.api.ApiMetadata[i];
            case 10:
                return new com.google.android.gms.common.api.ComplianceOptions[i];
            case 11:
                return new com.google.android.gms.common.api.Scope[i];
            case 12:
                return new com.google.android.gms.common.api.Status[i];
            case 13:
                return new com.google.android.gms.common.internal.ConnectionInfo[i];
            case 14:
                return new com.google.android.gms.common.internal.GetServiceRequest[i];
            case 15:
                return new com.google.android.gms.common.internal.RootTelemetryConfiguration[i];
            case 16:
                return new com.google.android.gms.duokit.GetApiAvailabilityRequest[i];
            case 17:
                return new com.google.android.gms.mdisync.CallerInfo[i];
            case 18:
                return new com.google.android.gms.mobstore.OpenFileDescriptorRequest[i];
            case 19:
                return new com.google.android.gms.mobstore.OpenFileDescriptorResponse[i];
            default:
                return new com.google.android.gms.phenotype.Configuration[i];
        }
    }
}
