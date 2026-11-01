package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aatx implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aatx(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object appTheme;
        int I = 0;
        byte bF = 0;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        boolean zAb2 = false;
        boolean zAb3 = false;
        boolean zAb4 = false;
        int I9 = 0;
        com.google.android.gms.common.ConnectionResult connectionResult = null;
        java.lang.String strU = null;
        android.os.IBinder iBinderN = null;
        java.lang.String strU2 = null;
        android.net.Uri uri = null;
        android.net.Uri uri2 = null;
        java.util.ArrayList arrayListX = null;
        java.util.ArrayList arrayListX2 = null;
        byte[] bArrAc = null;
        com.google.android.gms.wearable.AppTheme.Icon icon = null;
        java.util.ArrayList arrayListX3 = null;
        com.google.android.gms.common.internal.ResolveAccountRequest resolveAccountRequest = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        I = aais.I(parcel, i);
                    } else if (c == 2) {
                        connectionResult = (com.google.android.gms.common.ConnectionResult) aais.O(parcel, i, com.google.android.gms.common.ConnectionResult.CREATOR);
                    } else if (c != 3) {
                        aais.aa(parcel, i);
                    } else {
                        resolveAccountResponse = (com.google.android.gms.common.internal.ResolveAccountResponse) aais.O(parcel, i, com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.signin.internal.SignInResponse(I, connectionResult, resolveAccountResponse);
            case 1:
                int iK2 = aais.K(parcel);
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        I9 = aais.I(parcel, i2);
                    } else if (c2 != 2) {
                        aais.aa(parcel, i2);
                    } else {
                        resolveAccountRequest = (com.google.android.gms.common.internal.ResolveAccountRequest) aais.O(parcel, i2, com.google.android.gms.common.internal.ResolveAccountRequest.CREATOR);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.signin.internal.SignInRequest(I9, resolveAccountRequest);
            case 2:
                int iK3 = aais.K(parcel);
                java.lang.String strU3 = null;
                byte[] bArrAc2 = null;
                java.util.ArrayList arrayList = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        strU3 = aais.U(parcel, i3);
                    } else if (c3 == 2) {
                        bArrAc2 = aais.ac(parcel, i3);
                    } else if (c3 != 3) {
                        aais.aa(parcel, i3);
                    } else {
                        int iJ = aais.J(parcel, i3);
                        int iDataPosition = parcel.dataPosition();
                        if (iJ == 0) {
                            arrayList = null;
                        } else {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int i4 = parcel.readInt();
                            for (int i5 = 0; i5 < i4; i5++) {
                                arrayList2.add(java.lang.Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iJ);
                            arrayList = arrayList2;
                        }
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation(strU3, bArrAc2, arrayList);
            case 3:
                int iK4 = aais.K(parcel);
                boolean zAb5 = false;
                while (parcel.dataPosition() < iK4) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        arrayListX3 = aais.X(parcel, i6, com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation.CREATOR);
                    } else if (c4 == 2) {
                        zAb4 = aais.ab(parcel, i6);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i6);
                    } else {
                        zAb5 = aais.ab(parcel, i6);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.usagereporting.ConsentInformation(arrayListX3, zAb4, zAb5);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                int I10 = 0;
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 2) {
                        zAb3 = aais.ab(parcel, i7);
                    } else if (c5 != 3) {
                        aais.aa(parcel, i7);
                    } else {
                        I10 = aais.I(parcel, i7);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.usagereporting.ElCapitanOptions(zAb3, I10);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                boolean zAb6 = false;
                int I11 = 0;
                while (parcel.dataPosition() < iK6) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 2) {
                        zAb2 = aais.ab(parcel, i8);
                    } else if (c6 == 3) {
                        zAb6 = aais.ab(parcel, i8);
                    } else if (c6 != 4) {
                        aais.aa(parcel, i8);
                    } else {
                        I11 = aais.I(parcel, i8);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.usagereporting.SafetyOptions(zAb2, zAb6, I11);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                int I12 = 0;
                int I13 = 0;
                int I14 = 0;
                int I15 = 0;
                com.google.android.gms.wearable.AppTheme.Headline headline = null;
                com.google.android.gms.wearable.AppTheme.Description description = null;
                com.google.android.gms.wearable.AppTheme.CallToAction callToAction = null;
                while (parcel.dataPosition() < iK7) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            I12 = aais.I(parcel, i9);
                            break;
                        case 2:
                            I13 = aais.I(parcel, i9);
                            break;
                        case 3:
                            I14 = aais.I(parcel, i9);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I15 = aais.I(parcel, i9);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I8 = aais.I(parcel, i9);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            icon = (com.google.android.gms.wearable.AppTheme.Icon) aais.O(parcel, i9, com.google.android.gms.wearable.AppTheme.Icon.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            headline = (com.google.android.gms.wearable.AppTheme.Headline) aais.O(parcel, i9, com.google.android.gms.wearable.AppTheme.Headline.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            description = (com.google.android.gms.wearable.AppTheme.Description) aais.O(parcel, i9, com.google.android.gms.wearable.AppTheme.Description.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            callToAction = (com.google.android.gms.wearable.AppTheme.CallToAction) aais.O(parcel, i9, com.google.android.gms.wearable.AppTheme.CallToAction.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i9);
                            break;
                    }
                }
                aais.Y(parcel, iK7);
                appTheme = new com.google.android.gms.wearable.AppTheme(I12, I13, I14, I15, I8, icon, headline, description, callToAction);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU4 = null;
                android.os.ParcelFileDescriptor parcelFileDescriptor = null;
                android.net.Uri uri3 = null;
                while (parcel.dataPosition() < iK8) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 2) {
                        bArrAc = aais.ac(parcel, i10);
                    } else if (c7 == 3) {
                        strU4 = aais.U(parcel, i10);
                    } else if (c7 == 4) {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i10, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c7 != 5) {
                        aais.aa(parcel, i10);
                    } else {
                        uri3 = (android.net.Uri) aais.O(parcel, i10, android.net.Uri.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.wearable.Asset(bArrAc, strU4, parcelFileDescriptor, uri3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                int I16 = 0;
                int I17 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        I7 = aais.I(parcel, i11);
                    } else if (c8 == 2) {
                        I16 = aais.I(parcel, i11);
                    } else if (c8 != 3) {
                        aais.aa(parcel, i11);
                    } else {
                        I17 = aais.I(parcel, i11);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.wearable.AppTheme.CallToAction(I7, I16, I17);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        aais.aa(parcel, i12);
                    } else {
                        arrayListX2 = aais.X(parcel, i12, com.google.android.gms.wearable.DataItemFilter.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.wearable.ConnectionDelayFilters(arrayListX2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                java.util.ArrayList arrayListW = null;
                java.util.ArrayList arrayListW2 = null;
                while (parcel.dataPosition() < iK11) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        arrayListX = aais.X(parcel, i13, com.google.android.gms.wearable.DataItemFilter.CREATOR);
                    } else if (c9 == 2) {
                        arrayListW = aais.W(parcel, i13);
                    } else if (c9 != 3) {
                        aais.aa(parcel, i13);
                    } else {
                        arrayListW2 = aais.W(parcel, i13);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.wearable.ConnectionRestrictions(arrayListX, arrayListW, arrayListW2);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        uri2 = (android.net.Uri) aais.O(parcel, i14, android.net.Uri.CREATOR);
                    } else if (c10 != 2) {
                        aais.aa(parcel, i14);
                    } else {
                        I6 = aais.I(parcel, i14);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.wearable.DataItemFilter(uri2, I6);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                int I18 = 0;
                while (parcel.dataPosition() < iK13) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        I5 = aais.I(parcel, i15);
                    } else if (c11 != 2) {
                        aais.aa(parcel, i15);
                    } else {
                        I18 = aais.I(parcel, i15);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.wearable.AppTheme.Description(I5, I18);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                int I19 = 0;
                int I20 = 0;
                while (parcel.dataPosition() < iK14) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        I4 = aais.I(parcel, i16);
                    } else if (c12 == 2) {
                        I19 = aais.I(parcel, i16);
                    } else if (c12 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        I20 = aais.I(parcel, i16);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.wearable.AppTheme.Headline(I4, I19, I20);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aais.aa(parcel, i17);
                    } else {
                        I3 = aais.I(parcel, i17);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.wearable.AppTheme.Icon(I3);
            case 15:
                int iK16 = aais.K(parcel);
                long jL = 0;
                android.os.Bundle bundleM = null;
                byte[] bArrAc3 = null;
                while (parcel.dataPosition() < iK16) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        uri = (android.net.Uri) aais.O(parcel, i18, android.net.Uri.CREATOR);
                    } else if (c13 == 4) {
                        bundleM = aais.M(parcel, i18);
                    } else if (c13 == 5) {
                        bArrAc3 = aais.ac(parcel, i18);
                    } else if (c13 != 6) {
                        aais.aa(parcel, i18);
                    } else {
                        jL = aais.L(parcel, i18);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.wearable.PutDataRequest(uri, bundleM, bArrAc3, jL);
            case 16:
                int iK17 = aais.K(parcel);
                int I21 = 0;
                boolean zAb7 = false;
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                int I22 = 0;
                java.lang.String strU7 = null;
                while (parcel.dataPosition() < iK17) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            I21 = aais.I(parcel, i19);
                            break;
                        case 2:
                            strU5 = aais.U(parcel, i19);
                            break;
                        case 3:
                            zAb7 = aais.ab(parcel, i19);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU6 = aais.U(parcel, i19);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU7 = aais.U(parcel, i19);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I22 = aais.I(parcel, i19);
                            break;
                        default:
                            aais.aa(parcel, i19);
                            break;
                    }
                }
                aais.Y(parcel, iK17);
                appTheme = new com.google.android.gms.wearable.Term(I21, strU5, zAb7, strU6, strU7, I22);
                break;
            case 17:
                int iK18 = aais.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 1) {
                        strU2 = aais.U(parcel, i20);
                    } else if (c14 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        zAb = aais.ab(parcel, i20);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.wearable.internal.AccountConsentRecordParcelable(strU2, zAb);
            case 18:
                int iK19 = aais.K(parcel);
                android.content.IntentFilter[] intentFilterArr = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                while (parcel.dataPosition() < iK19) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        iBinderN = aais.N(parcel, i21);
                    } else if (c15 == 3) {
                        intentFilterArr = (android.content.IntentFilter[]) aais.af(parcel, i21, android.content.IntentFilter.CREATOR);
                    } else if (c15 == 4) {
                        strU8 = aais.U(parcel, i21);
                    } else if (c15 != 5) {
                        aais.aa(parcel, i21);
                    } else {
                        strU9 = aais.U(parcel, i21);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.wearable.internal.AddListenerRequest(iBinderN, intentFilterArr, strU8, strU9);
            case 19:
                int iK20 = aais.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        aais.aa(parcel, i22);
                    } else {
                        I2 = aais.I(parcel, i22);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.wearable.internal.AddLocalCapabilityResponse(I2);
            default:
                int iK21 = aais.K(parcel);
                byte bF2 = 0;
                while (parcel.dataPosition() < iK21) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 2) {
                        bF = aais.F(parcel, i23);
                    } else if (c16 == 3) {
                        bF2 = aais.F(parcel, i23);
                    } else if (c16 != 4) {
                        aais.aa(parcel, i23);
                    } else {
                        strU = aais.U(parcel, i23);
                    }
                }
                aais.Y(parcel, iK21);
                return new com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable(bF, bF2, strU);
        }
        return appTheme;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.signin.internal.SignInResponse[i];
            case 1:
                return new com.google.android.gms.signin.internal.SignInRequest[i];
            case 2:
                return new com.google.android.gms.usagereporting.ConsentInformation.AccountConsentInformation[i];
            case 3:
                return new com.google.android.gms.usagereporting.ConsentInformation[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.usagereporting.ElCapitanOptions[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.usagereporting.SafetyOptions[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.wearable.AppTheme[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.wearable.Asset[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.wearable.AppTheme.CallToAction[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.wearable.ConnectionDelayFilters[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.wearable.ConnectionRestrictions[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.wearable.DataItemFilter[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.wearable.AppTheme.Description[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.wearable.AppTheme.Headline[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.wearable.AppTheme.Icon[i];
            case 15:
                return new com.google.android.gms.wearable.PutDataRequest[i];
            case 16:
                return new com.google.android.gms.wearable.Term[i];
            case 17:
                return new com.google.android.gms.wearable.internal.AccountConsentRecordParcelable[i];
            case 18:
                return new com.google.android.gms.wearable.internal.AddListenerRequest[i];
            case 19:
                return new com.google.android.gms.wearable.internal.AddLocalCapabilityResponse[i];
            default:
                return new com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable[i];
        }
    }
}
