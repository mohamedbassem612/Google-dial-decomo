package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaso implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aaso(int i) {
        this.$cid = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(java.lang.Object obj) {
        return obj == null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws aahs {
        java.lang.Object experimentTokens;
        byte[][] bArrAh = null;
        java.lang.String strU = null;
        switch (this.$cid) {
            case 0:
                int iK = defpackage.aais.K(parcel);
                java.lang.String strU2 = null;
                byte[] bArrAc = null;
                byte[][] bArrAh2 = null;
                byte[][] bArrAh3 = null;
                byte[][] bArrAh4 = null;
                int[] iArrAd = null;
                byte[][] bArrAh5 = null;
                int[] iArrAd2 = null;
                byte[][] bArrAh6 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strU2 = defpackage.aais.U(parcel, i);
                            break;
                        case 3:
                            bArrAc = defpackage.aais.ac(parcel, i);
                            break;
                        case 4:
                            bArrAh2 = defpackage.aais.ah(parcel, i);
                            break;
                        case 5:
                            bArrAh = defpackage.aais.ah(parcel, i);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrAh3 = defpackage.aais.ah(parcel, i);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrAh4 = defpackage.aais.ah(parcel, i);
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            iArrAd = defpackage.aais.ad(parcel, i);
                            break;
                        case '\t':
                            bArrAh5 = defpackage.aais.ah(parcel, i);
                            break;
                        case '\n':
                            iArrAd2 = defpackage.aais.ad(parcel, i);
                            break;
                        case 11:
                            bArrAh6 = defpackage.aais.ah(parcel, i);
                            break;
                        default:
                            defpackage.aais.aa(parcel, i);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK);
                experimentTokens = new com.google.android.gms.phenotype.ExperimentTokens(strU2, bArrAc, bArrAh2, bArrAh, bArrAh3, bArrAh4, iArrAd, bArrAh5, iArrAd2, bArrAh6);
                break;
            case 1:
                int iK2 = defpackage.aais.K(parcel);
                long j = 0;
                java.lang.String strU3 = null;
                java.lang.String strU4 = null;
                com.google.android.gms.phenotype.Configuration[] configurationArr = null;
                byte[] bArrAc2 = null;
                boolean zAb = false;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strU3 = defpackage.aais.U(parcel, i2);
                            break;
                        case 3:
                            strU4 = defpackage.aais.U(parcel, i2);
                            break;
                        case 4:
                            configurationArr = (com.google.android.gms.phenotype.Configuration[]) defpackage.aais.af(parcel, i2, com.google.android.gms.phenotype.Configuration.CREATOR);
                            break;
                        case 5:
                            zAb = defpackage.aais.ab(parcel, i2);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrAc2 = defpackage.aais.ac(parcel, i2);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            defpackage.aais.Z(parcel, i2, 8);
                            j = parcel.readLong();
                            break;
                        default:
                            defpackage.aais.aa(parcel, i2);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK2);
                experimentTokens = new com.google.android.gms.phenotype.Configurations(strU3, strU4, configurationArr, zAb, bArrAc2, j);
                break;
            case 2:
                int iK3 = defpackage.aais.K(parcel);
                double dG = 0.0d;
                long jL = 0;
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                byte[] bArrAc3 = null;
                boolean zAb2 = false;
                int I = 0;
                int I2 = 0;
                int I3 = 0;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strU5 = defpackage.aais.U(parcel, i3);
                            break;
                        case 3:
                            jL = defpackage.aais.L(parcel, i3);
                            break;
                        case 4:
                            zAb2 = defpackage.aais.ab(parcel, i3);
                            break;
                        case 5:
                            dG = defpackage.aais.G(parcel, i3);
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            strU6 = defpackage.aais.U(parcel, i3);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrAc3 = defpackage.aais.ac(parcel, i3);
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            I = defpackage.aais.I(parcel, i3);
                            break;
                        case '\t':
                            I2 = defpackage.aais.I(parcel, i3);
                            break;
                        case '\n':
                            I3 = defpackage.aais.I(parcel, i3);
                            break;
                        default:
                            defpackage.aais.aa(parcel, i3);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK3);
                experimentTokens = new com.google.android.gms.phenotype.Flag(strU5, jL, zAb2, dG, strU6, bArrAc3, I, I2, I3);
                break;
            case 3:
                int iK4 = defpackage.aais.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        defpackage.aais.aa(parcel, i4);
                    } else {
                        strU = defpackage.aais.U(parcel, i4);
                    }
                }
                defpackage.aais.Y(parcel, iK4);
                return new com.google.android.gms.pseudonymous.PseudonymousIdToken(strU);
            case 4:
                int iK5 = defpackage.aais.K(parcel);
                java.util.ArrayList arrayListW = null;
                java.lang.String strU7 = null;
                int i5 = 0;
                boolean zAb3 = false;
                int i6 = 0;
                boolean zAb4 = false;
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            defpackage.aais.Z(parcel, i7, 4);
                            i5 = parcel.readInt();
                            break;
                        case 3:
                            zAb3 = defpackage.aais.ab(parcel, i7);
                            break;
                        case 4:
                            arrayListW = defpackage.aais.W(parcel, i7);
                            break;
                        case 5:
                            defpackage.aais.Z(parcel, i7, 4);
                            i6 = parcel.readInt();
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            strU7 = defpackage.aais.U(parcel, i7);
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            zAb4 = defpackage.aais.ab(parcel, i7);
                            break;
                        default:
                            defpackage.aais.aa(parcel, i7);
                            break;
                    }
                }
                defpackage.aais.Y(parcel, iK5);
                experimentTokens = new com.google.android.gms.usagereporting.UsageReportingOptInOptions(i5, zAb3, arrayListW, i6, strU7, zAb4);
                break;
            case 5:
                android.os.Parcelable.Creator creator = com.google.android.libraries.micore.superpacks.SlicingResult.CREATOR;
                android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(com.google.android.libraries.micore.superpacks.common.Slice.class.getClassLoader());
                int i8 = parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                defpackage.adgk adgkVarE = com.google.android.libraries.micore.superpacks.SlicingResult.e();
                if (parcelableArray != null) {
                    for (android.os.Parcelable parcelable : parcelableArray) {
                        adgkVarE.b((com.google.android.libraries.micore.superpacks.common.Slice) parcelable);
                    }
                }
                adgkVarE.c(i8 == 1);
                adgkVarE.a = bArrCreateByteArray;
                return adgkVarE.a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String strCo = defpackage.ahvr.co(parcel.readString());
                int i9 = parcel.readInt();
                android.os.Parcelable[] parcelableArray2 = parcel.readParcelableArray(com.google.android.libraries.micore.superpacks.common.PackManifest.class.getClassLoader());
                defpackage.adgm adgmVarE = com.google.android.libraries.micore.superpacks.SuperpackManifest.e();
                adgmVarE.d(strCo);
                adgmVarE.e(i9);
                if (parcelableArray2 != null) {
                    for (android.os.Parcelable parcelable2 : parcelableArray2) {
                        adgmVarE.b((com.google.android.libraries.micore.superpacks.common.PackManifest) parcelable2);
                    }
                }
                return adgmVarE.a();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.libraries.micore.superpacks.base.BasePriority basePriority = com.google.android.libraries.micore.superpacks.base.BasePriority.a;
                return new com.google.android.libraries.micore.superpacks.base.AutoValue_BasePriority(parcel.readInt(), parcel.readInt());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                defpackage.adhz adhzVarJ = com.google.android.libraries.micore.superpacks.base.RegistrationConfig.j();
                adhzVarJ.a = string;
                adhzVarJ.b = string2;
                adhzVarJ.e(i10);
                adhzVarJ.d(i11);
                adhzVarJ.g(i12);
                adhzVarJ.c(i13);
                adhzVarJ.h(i14);
                if (arrayListCreateStringArrayList != null) {
                    int size = arrayListCreateStringArrayList.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        adhzVarJ.b(arrayListCreateStringArrayList.get(i15));
                    }
                }
                return adhzVarJ.a();
            case 9:
                return com.google.android.libraries.micore.superpacks.base.VersionedName.c(defpackage.ahvr.co(parcel.readString()), parcel.readInt());
            case 10:
                defpackage.aify aifyVar = com.google.android.libraries.micore.superpacks.common.PackManifest.j;
                com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = (com.google.android.libraries.micore.superpacks.base.VersionedName) parcel.readParcelable(com.google.android.libraries.micore.superpacks.base.VersionedName.class.getClassLoader());
                java.lang.String strCo2 = defpackage.ahvr.co(parcel.readString());
                java.lang.String strCo3 = defpackage.ahvr.co(parcel.readString());
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                java.lang.String string3 = parcel.readString();
                long j4 = parcel.readLong();
                java.lang.String string4 = parcel.readString();
                defpackage.adis adisVarQ = com.google.android.libraries.micore.superpacks.common.PackManifest.q();
                adisVarQ.a = versionedName;
                adisVarQ.l(strCo2);
                adisVarQ.k(strCo3);
                adisVarQ.m(j2);
                adisVarQ.g(j3);
                adisVarQ.j(i16);
                adisVarQ.h(i17);
                if (arrayListCreateStringArrayList2 != null) {
                    int size2 = arrayListCreateStringArrayList2.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        adisVarQ.d(arrayListCreateStringArrayList2.get(i18));
                    }
                }
                if (arrayListCreateStringArrayList3 != null) {
                    adisVarQ.f(arrayListCreateStringArrayList3);
                }
                adisVarQ.c = string3;
                adisVarQ.i(new java.util.Date(j4));
                if (string4 != null) {
                    adisVarQ.e("label", string4);
                }
                return adisVarQ.a();
            case 11:
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) parcel.readParcelable(com.google.android.libraries.micore.superpacks.common.PackManifest.class.getClassLoader());
                int i19 = parcel.readInt();
                int i20 = parcel.readInt();
                int i21 = parcel.readInt();
                int i22 = parcel.readInt();
                int i23 = parcel.readInt();
                defpackage.adiv adivVarG = com.google.android.libraries.micore.superpacks.common.Slice.g();
                adivVarG.f(packManifest);
                adivVarG.d(i19);
                adivVarG.c(i20);
                adivVarG.e(i21);
                adivVarG.b(i22);
                adivVarG.g(i23);
                return adivVarG.a();
            case 12:
                defpackage.aooh.f(parcel, "parcel");
                parcel.readInt();
                return com.google.android.libraries.notifications.platform.registration.Zwieback.a;
            default:
                return com.google.apps.tiktok.account.AccountId.b(parcel.readInt());
        }
        return experimentTokens;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.phenotype.ExperimentTokens[i];
            case 1:
                return new com.google.android.gms.phenotype.Configurations[i];
            case 2:
                return new com.google.android.gms.phenotype.Flag[i];
            case 3:
                return new com.google.android.gms.pseudonymous.PseudonymousIdToken[i];
            case 4:
                return new com.google.android.gms.usagereporting.UsageReportingOptInOptions[i];
            case 5:
                return new com.google.android.libraries.micore.superpacks.SlicingResult[i];
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.libraries.micore.superpacks.SuperpackManifest[i];
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.libraries.micore.superpacks.base.BasePriority[i];
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.libraries.micore.superpacks.base.RegistrationConfig[i];
            case 9:
                return new com.google.android.libraries.micore.superpacks.base.VersionedName[i];
            case 10:
                return new com.google.android.libraries.micore.superpacks.common.PackManifest[i];
            case 11:
                return new com.google.android.libraries.micore.superpacks.common.Slice[i];
            case 12:
                return new com.google.android.libraries.notifications.platform.registration.Zwieback[i];
            default:
                return new com.google.apps.tiktok.account.AccountId[i];
        }
    }
}
