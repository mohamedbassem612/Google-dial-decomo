package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalp implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aalp(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object additionalConsentConfig;
        java.lang.Object clientIdentity;
        boolean zAb = false;
        int I = 0;
        java.lang.String strU = null;
        android.net.Uri uri = null;
        android.net.Uri uri2 = null;
        byte[] bArrAc = null;
        com.google.android.gms.maps.model.LatLng latLng = null;
        com.google.android.gms.maps.model.LatLng latLng2 = null;
        com.google.android.gms.location.LocationRequest locationRequest = null;
        com.google.android.gms.common.api.Status status = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        java.lang.String strU5 = null;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                java.lang.String strU8 = null;
                java.lang.String strU9 = null;
                java.lang.String strU10 = null;
                android.os.Bundle bundleM = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strU6 = aais.U(parcel, i);
                            break;
                        case 3:
                            strU7 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strU8 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU9 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            strU10 = aais.U(parcel, i);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            bundleM = aais.M(parcel, i);
                            break;
                        default:
                            aais.aa(parcel, i);
                            break;
                    }
                }
                aais.Y(parcel, iK);
                additionalConsentConfig = new com.google.android.gms.feedback.AdditionalConsentConfig(strU6, strU7, strU8, strU9, strU10, bundleM);
                return additionalConsentConfig;
            case 1:
                int iK2 = aais.K(parcel);
                int I2 = 0;
                int I3 = 0;
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = null;
                java.lang.String strU11 = null;
                java.lang.String strU12 = null;
                java.lang.String strU13 = null;
                java.lang.String strU14 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            googleHelp = (com.google.android.gms.googlehelp.GoogleHelp) aais.O(parcel, i2, com.google.android.gms.googlehelp.GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strU11 = aais.U(parcel, i2);
                            break;
                        case 3:
                            strU12 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I2 = aais.I(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strU13 = aais.U(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I3 = aais.I(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strU14 = aais.U(parcel, i2);
                            break;
                        default:
                            aais.aa(parcel, i2);
                            break;
                    }
                }
                aais.Y(parcel, iK2);
                additionalConsentConfig = new com.google.android.gms.googlehelp.InProductHelp(googleHelp, strU11, strU12, I2, strU13, I3, strU14);
                return additionalConsentConfig;
            case 2:
                int iK3 = aais.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 2) {
                        zAb = aais.ab(parcel, i3);
                    } else if (c != 3) {
                        aais.aa(parcel, i3);
                    } else {
                        strU = aais.U(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.googlehelp.ND4CSettings(zAb, strU);
            case 3:
                int iK4 = aais.K(parcel);
                java.lang.String strU15 = null;
                java.lang.String strU16 = null;
                java.lang.String strU17 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        strU5 = aais.U(parcel, i4);
                    } else if (c2 == 3) {
                        strU15 = aais.U(parcel, i4);
                    } else if (c2 == 4) {
                        strU17 = aais.U(parcel, i4);
                    } else if (c2 != 5) {
                        aais.aa(parcel, i4);
                    } else {
                        strU16 = aais.U(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.googlehelp.OfflineSuggestion(strU5, strU15, strU16, strU17);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                android.content.Intent intent = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 2) {
                        I = aais.I(parcel, i5);
                    } else if (c3 == 3) {
                        strU4 = aais.U(parcel, i5);
                    } else if (c3 != 4) {
                        aais.aa(parcel, i5);
                    } else {
                        intent = (android.content.Intent) aais.O(parcel, i5, android.content.Intent.CREATOR);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.googlehelp.internal.common.OverflowMenuItem(I, strU4, intent);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                java.lang.String strU18 = null;
                java.lang.String strU19 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 2) {
                        strU3 = aais.U(parcel, i6);
                    } else if (c4 == 3) {
                        strU18 = aais.U(parcel, i6);
                    } else if (c4 != 4) {
                        aais.aa(parcel, i6);
                    } else {
                        strU19 = aais.U(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.googlehelp.internal.common.TogglingData(strU3, strU18, strU19);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                java.lang.String strU20 = "";
                long jL = 0;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        strU2 = aais.U(parcel, i7);
                    } else if (c5 == 2) {
                        jL = aais.L(parcel, i7);
                    } else if (c5 != 3) {
                        aais.aa(parcel, i7);
                    } else {
                        strU20 = aais.U(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.googlehelp.trails.TrailsInteraction(strU2, jL, strU20);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU21 = null;
                java.lang.String strU22 = null;
                java.lang.String strU23 = null;
                java.util.ArrayList arrayListX = null;
                com.google.android.gms.libs.identity.ClientIdentity clientIdentity2 = null;
                int I4 = 0;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        I4 = aais.I(parcel, i8);
                    } else if (c6 == 3) {
                        strU21 = aais.U(parcel, i8);
                    } else if (c6 == 4) {
                        strU22 = aais.U(parcel, i8);
                    } else if (c6 == 6) {
                        strU23 = aais.U(parcel, i8);
                    } else if (c6 == 7) {
                        clientIdentity2 = (com.google.android.gms.libs.identity.ClientIdentity) aais.O(parcel, i8, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                    } else if (c6 != '\b') {
                        aais.aa(parcel, i8);
                    } else {
                        arrayListX = aais.X(parcel, i8, com.google.android.gms.common.Feature.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                aooh.f(strU21, "packageName");
                clientIdentity = new com.google.android.gms.libs.identity.ClientIdentity(I4, strU21, strU22, strU23, arrayListX, clientIdentity2);
                return clientIdentity;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                int I5 = -1;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        aais.aa(parcel, i9);
                    } else {
                        I5 = aais.I(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.libs.throttling.ThrottlingLimits(I5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        aais.aa(parcel, i10);
                    } else {
                        status = (com.google.android.gms.common.api.Status) aais.O(parcel, i10, com.google.android.gms.common.api.Status.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.location.internal.FusedLocationProviderResult(status);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                android.os.IBinder iBinderN = null;
                android.os.IBinder iBinderN2 = null;
                android.app.PendingIntent pendingIntent = null;
                java.lang.String strU24 = null;
                int I6 = 0;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        I6 = aais.I(parcel, i11);
                    } else if (c7 == 2) {
                        iBinderN = aais.N(parcel, i11);
                    } else if (c7 == 3) {
                        iBinderN2 = aais.N(parcel, i11);
                    } else if (c7 == 4) {
                        pendingIntent = (android.app.PendingIntent) aais.O(parcel, i11, android.app.PendingIntent.CREATOR);
                    } else if (c7 != 6) {
                        aais.aa(parcel, i11);
                    } else {
                        strU24 = aais.U(parcel, i11);
                    }
                }
                aais.Y(parcel, iK11);
                clientIdentity = new com.google.android.gms.location.internal.LocationReceiver(I6, iBinderN, iBinderN2, pendingIntent, strU24);
                return clientIdentity;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                long jL2 = Long.MAX_VALUE;
                boolean zAb2 = false;
                boolean zAb3 = false;
                boolean zAb4 = false;
                boolean zAb5 = false;
                java.util.ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        locationRequest = (com.google.android.gms.location.LocationRequest) aais.O(parcel, i12, com.google.android.gms.location.LocationRequest.CREATOR);
                    } else if (c8 == 5) {
                        arrayListX2 = aais.X(parcel, i12, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                    } else if (c8 == '\b') {
                        zAb2 = aais.ab(parcel, i12);
                    } else if (c8 != '\t') {
                        switch (c8) {
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                zAb4 = aais.ab(parcel, i12);
                                break;
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                zAb5 = aais.ab(parcel, i12);
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                aais.U(parcel, i12);
                                break;
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                jL2 = aais.L(parcel, i12);
                                break;
                            default:
                                aais.aa(parcel, i12);
                                break;
                        }
                    } else {
                        zAb3 = aais.ab(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                clientIdentity = new com.google.android.gms.location.internal.LocationRequestInternal(locationRequest, arrayListX2, zAb2, zAb3, zAb4, zAb5, jL2);
                return clientIdentity;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                int I7 = 1;
                com.google.android.gms.location.internal.LocationRequestInternal locationRequestInternal = null;
                android.os.IBinder iBinderN3 = null;
                android.os.IBinder iBinderN4 = null;
                android.app.PendingIntent pendingIntent2 = null;
                android.os.IBinder iBinderN5 = null;
                java.lang.String strU25 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            I7 = aais.I(parcel, i13);
                            break;
                        case 2:
                            locationRequestInternal = (com.google.android.gms.location.internal.LocationRequestInternal) aais.O(parcel, i13, com.google.android.gms.location.internal.LocationRequestInternal.CREATOR);
                            break;
                        case 3:
                            iBinderN3 = aais.N(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            pendingIntent2 = (android.app.PendingIntent) aais.O(parcel, i13, android.app.PendingIntent.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            iBinderN4 = aais.N(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            iBinderN5 = aais.N(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        default:
                            aais.aa(parcel, i13);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU25 = aais.U(parcel, i13);
                            break;
                    }
                }
                aais.Y(parcel, iK13);
                additionalConsentConfig = new com.google.android.gms.location.internal.LocationRequestUpdateData(I7, locationRequestInternal, iBinderN3, iBinderN4, pendingIntent2, iBinderN5, strU25);
                return additionalConsentConfig;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                float fH = 0.0f;
                float fH2 = 0.0f;
                float fH3 = 0.0f;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 2) {
                        latLng2 = (com.google.android.gms.maps.model.LatLng) aais.O(parcel, i14, com.google.android.gms.maps.model.LatLng.CREATOR);
                    } else if (c9 == 3) {
                        fH = aais.H(parcel, i14);
                    } else if (c9 == 4) {
                        fH2 = aais.H(parcel, i14);
                    } else if (c9 != 5) {
                        aais.aa(parcel, i14);
                    } else {
                        fH3 = aais.H(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.maps.model.CameraPosition(latLng2, fH, fH2, fH3);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                com.google.android.gms.maps.model.LatLng latLng3 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 2) {
                        latLng = (com.google.android.gms.maps.model.LatLng) aais.O(parcel, i15, com.google.android.gms.maps.model.LatLng.CREATOR);
                    } else if (c10 != 3) {
                        aais.aa(parcel, i15);
                    } else {
                        latLng3 = (com.google.android.gms.maps.model.LatLng) aais.O(parcel, i15, com.google.android.gms.maps.model.LatLng.CREATOR);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.maps.model.LatLngBounds(latLng, latLng3);
            case 15:
                int iK16 = aais.K(parcel);
                double dG = 0.0d;
                double dG2 = 0.0d;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        dG = aais.G(parcel, i16);
                    } else if (c11 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        dG2 = aais.G(parcel, i16);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.maps.model.LatLng(dG, dG2);
            case 16:
                int iK17 = aais.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    aais.aa(parcel, parcel.readInt());
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.mdisync.SyncOptions();
            case 17:
                int iK18 = aais.K(parcel);
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                byte[] bArrAc2 = null;
                com.google.android.gms.mdisync.SyncOptions syncOptions = null;
                int I8 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        I8 = aais.I(parcel, i17);
                    } else if (c12 == 2) {
                        bArrAc2 = aais.ac(parcel, i17);
                    } else if (c12 == 3) {
                        syncOptions = (com.google.android.gms.mdisync.SyncOptions) aais.O(parcel, i17, com.google.android.gms.mdisync.SyncOptions.CREATOR);
                    } else if (c12 != 4) {
                        aais.aa(parcel, i17);
                    } else {
                        epochMilli = aais.L(parcel, i17);
                    }
                }
                aais.Y(parcel, iK18);
                clientIdentity = new com.google.android.gms.mdisync.internal.SyncRequest(I8, bArrAc2, syncOptions, epochMilli);
                return clientIdentity;
            case 18:
                int iK19 = aais.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        aais.aa(parcel, i18);
                    } else {
                        bArrAc = aais.ac(parcel, i18);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.mdisync.internal.SyncResult(bArrAc);
            case 19:
                int iK20 = aais.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        aais.aa(parcel, i19);
                    } else {
                        uri2 = (android.net.Uri) aais.O(parcel, i19, android.net.Uri.CREATOR);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.mobstore.DeleteFileRequest(uri2);
            default:
                int iK21 = aais.K(parcel);
                android.net.Uri uri3 = null;
                while (parcel.dataPosition() < iK21) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        uri = (android.net.Uri) aais.O(parcel, i20, android.net.Uri.CREATOR);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        uri3 = (android.net.Uri) aais.O(parcel, i20, android.net.Uri.CREATOR);
                    }
                }
                aais.Y(parcel, iK21);
                return new com.google.android.gms.mobstore.RenameRequest(uri, uri3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.feedback.AdditionalConsentConfig[i];
            case 1:
                return new com.google.android.gms.googlehelp.InProductHelp[i];
            case 2:
                return new com.google.android.gms.googlehelp.ND4CSettings[i];
            case 3:
                return new com.google.android.gms.googlehelp.OfflineSuggestion[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.googlehelp.internal.common.OverflowMenuItem[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.googlehelp.internal.common.TogglingData[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.googlehelp.trails.TrailsInteraction[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.libs.identity.ClientIdentity[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.libs.throttling.ThrottlingLimits[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.location.internal.FusedLocationProviderResult[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.location.internal.LocationReceiver[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.location.internal.LocationRequestInternal[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.location.internal.LocationRequestUpdateData[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.maps.model.CameraPosition[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.maps.model.LatLngBounds[i];
            case 15:
                return new com.google.android.gms.maps.model.LatLng[i];
            case 16:
                return new com.google.android.gms.mdisync.SyncOptions[i];
            case 17:
                return new com.google.android.gms.mdisync.internal.SyncRequest[i];
            case 18:
                return new com.google.android.gms.mdisync.internal.SyncResult[i];
            case 19:
                return new com.google.android.gms.mobstore.DeleteFileRequest[i];
            default:
                return new com.google.android.gms.mobstore.RenameRequest[i];
        }
    }
}
