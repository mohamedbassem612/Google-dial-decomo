package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxf implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aaxf(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArrAc = null;
        java.lang.String strU = null;
        com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable = null;
        java.util.ArrayList arrayListW = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = null;
        java.util.ArrayList arrayListX = null;
        com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable fastPairAccountKeyParcelable = null;
        java.lang.String strU2 = null;
        com.google.android.gms.wearable.internal.DataItemParcelable dataItemParcelable = null;
        java.util.ArrayList arrayListX2 = null;
        com.google.android.gms.wearable.ConnectionConfiguration[] connectionConfigurationArr = null;
        com.google.android.gms.wearable.ConnectionConfiguration connectionConfiguration = null;
        java.lang.String strU3 = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor3 = null;
        com.google.android.gms.wearable.internal.CapabilityInfoParcelable capabilityInfoParcelable = null;
        int I = 0;
        switch (this.$cid) {
            case 0:
                int iK = aais.K(parcel);
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        I = aais.I(parcel, i);
                    } else if (c != 3) {
                        aais.aa(parcel, i);
                    } else {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i, android.os.ParcelFileDescriptor.CREATOR);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.gms.wearable.internal.GetChannelInputStreamResponse(I, parcelFileDescriptor);
            case 1:
                int iK2 = aais.K(parcel);
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        I = aais.I(parcel, i2);
                    } else if (c2 != 3) {
                        aais.aa(parcel, i2);
                    } else {
                        capabilityInfoParcelable = (com.google.android.gms.wearable.internal.CapabilityInfoParcelable) aais.O(parcel, i2, com.google.android.gms.wearable.internal.CapabilityInfoParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK2);
                return new com.google.android.gms.wearable.internal.GetCapabilityResponse(I, capabilityInfoParcelable);
            case 2:
                int iK3 = aais.K(parcel);
                boolean zAb = false;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        I = aais.I(parcel, i3);
                    } else if (c3 == 3) {
                        parcelFileDescriptor3 = (android.os.ParcelFileDescriptor) aais.O(parcel, i3, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c3 != 4) {
                        aais.aa(parcel, i3);
                    } else {
                        zAb = aais.ab(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse(I, parcelFileDescriptor3, zAb);
            case 3:
                int iK4 = aais.K(parcel);
                boolean zAb2 = false;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 2) {
                        I = aais.I(parcel, i4);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i4);
                    } else {
                        zAb2 = aais.ab(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse(I, zAb2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK5 = aais.K(parcel);
                boolean zAb3 = false;
                boolean zAb4 = false;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 2) {
                        I = aais.I(parcel, i5);
                    } else if (c5 == 3) {
                        zAb3 = aais.ab(parcel, i5);
                    } else if (c5 != 4) {
                        aais.aa(parcel, i5);
                    } else {
                        zAb4 = aais.ab(parcel, i5);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse(I, zAb3, zAb4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK6 = aais.K(parcel);
                boolean zAb5 = false;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 2) {
                        I = aais.I(parcel, i6);
                    } else if (c6 != 3) {
                        aais.aa(parcel, i6);
                    } else {
                        zAb5 = aais.ab(parcel, i6);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse(I, zAb5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK7 = aais.K(parcel);
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 2) {
                        I = aais.I(parcel, i7);
                    } else if (c7 != 3) {
                        aais.aa(parcel, i7);
                    } else {
                        strU3 = aais.U(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.gms.wearable.internal.GetCompanionPackageForNodeResponse(I, strU3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK8 = aais.K(parcel);
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c8 = (char) i8;
                    if (c8 == 2) {
                        I = aais.I(parcel, i8);
                    } else if (c8 != 3) {
                        aais.aa(parcel, i8);
                    } else {
                        connectionConfiguration = (com.google.android.gms.wearable.ConnectionConfiguration) aais.O(parcel, i8, com.google.android.gms.wearable.ConnectionConfiguration.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.gms.wearable.internal.GetConfigResponse(I, connectionConfiguration);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK9 = aais.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c9 = (char) i9;
                    if (c9 == 2) {
                        I = aais.I(parcel, i9);
                    } else if (c9 != 3) {
                        aais.aa(parcel, i9);
                    } else {
                        connectionConfigurationArr = (com.google.android.gms.wearable.ConnectionConfiguration[]) aais.af(parcel, i9, com.google.android.gms.wearable.ConnectionConfiguration.CREATOR);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.gms.wearable.internal.GetConfigsResponse(I, connectionConfigurationArr);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK10 = aais.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        I = aais.I(parcel, i10);
                    } else if (c10 != 3) {
                        aais.aa(parcel, i10);
                    } else {
                        arrayListX2 = aais.X(parcel, i10, com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.gms.wearable.internal.GetConnectedNodesResponse(I, arrayListX2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        I = aais.I(parcel, i11);
                    } else if (c11 != 3) {
                        aais.aa(parcel, i11);
                    } else {
                        dataItemParcelable = (com.google.android.gms.wearable.internal.DataItemParcelable) aais.O(parcel, i11, com.google.android.gms.wearable.internal.DataItemParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.gms.wearable.internal.GetDataItemResponse(I, dataItemParcelable);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK12 = aais.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 2) {
                        I = aais.I(parcel, i12);
                    } else if (c12 != 3) {
                        aais.aa(parcel, i12);
                    } else {
                        strU2 = aais.U(parcel, i12);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.gms.wearable.internal.GetEapIdResponse(I, strU2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK13 = aais.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        I = aais.I(parcel, i13);
                    } else if (c13 != 2) {
                        aais.aa(parcel, i13);
                    } else {
                        fastPairAccountKeyParcelable = (com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable) aais.O(parcel, i13, com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse(I, fastPairAccountKeyParcelable);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK14 = aais.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        I = aais.I(parcel, i14);
                    } else if (c14 != 2) {
                        aais.aa(parcel, i14);
                    } else {
                        arrayListX = aais.X(parcel, i14, com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.gms.wearable.internal.GetFastpairAccountKeysResponse(I, arrayListX);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK15 = aais.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c15 = (char) i15;
                    if (c15 == 2) {
                        I = aais.I(parcel, i15);
                    } else if (c15 != 3) {
                        aais.aa(parcel, i15);
                    } else {
                        parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) aais.O(parcel, i15, android.os.ParcelFileDescriptor.CREATOR);
                    }
                }
                aais.Y(parcel, iK15);
                return new com.google.android.gms.wearable.internal.GetFdForAssetResponse(I, parcelFileDescriptor2);
            case 15:
                int iK16 = aais.K(parcel);
                while (parcel.dataPosition() < iK16) {
                    aais.aa(parcel, parcel.readInt());
                }
                aais.Y(parcel, iK16);
                return new com.google.android.gms.wearable.internal.GetListenerServiceRequest();
            case 16:
                int iK17 = aais.K(parcel);
                java.util.ArrayList arrayListW2 = null;
                while (parcel.dataPosition() < iK17) {
                    int i16 = parcel.readInt();
                    char c16 = (char) i16;
                    if (c16 == 1) {
                        I = aais.I(parcel, i16);
                    } else if (c16 == 2) {
                        arrayListW = aais.W(parcel, i16);
                    } else if (c16 != 3) {
                        aais.aa(parcel, i16);
                    } else {
                        arrayListW2 = aais.W(parcel, i16);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.gms.wearable.internal.GetLocalCapabilitiesResponse(I, arrayListW, arrayListW2);
            case 17:
                int iK18 = aais.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i17 = parcel.readInt();
                    char c17 = (char) i17;
                    if (c17 == 2) {
                        I = aais.I(parcel, i17);
                    } else if (c17 != 3) {
                        aais.aa(parcel, i17);
                    } else {
                        nodeParcelable = (com.google.android.gms.wearable.internal.NodeParcelable) aais.O(parcel, i17, com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.gms.wearable.internal.GetLocalNodeResponse(I, nodeParcelable);
            case 18:
                int iK19 = aais.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i18 = parcel.readInt();
                    char c18 = (char) i18;
                    if (c18 == 2) {
                        I = aais.I(parcel, i18);
                    } else if (c18 != 3) {
                        aais.aa(parcel, i18);
                    } else {
                        strU = aais.U(parcel, i18);
                    }
                }
                aais.Y(parcel, iK19);
                return new com.google.android.gms.wearable.internal.GetNodeIdResponse(I, strU);
            case 19:
                int iK20 = aais.K(parcel);
                int I2 = 0;
                while (parcel.dataPosition() < iK20) {
                    int i19 = parcel.readInt();
                    char c19 = (char) i19;
                    if (c19 == 1) {
                        I = aais.I(parcel, i19);
                    } else if (c19 == 2) {
                        I2 = aais.I(parcel, i19);
                    } else if (c19 != 3) {
                        aais.aa(parcel, i19);
                    } else {
                        bArrAc = aais.ac(parcel, i19);
                    }
                }
                aais.Y(parcel, iK20);
                return new com.google.android.gms.wearable.internal.GetRestoreStateResponse(I, I2, bArrAc);
            default:
                int iK21 = aais.K(parcel);
                boolean zAb6 = false;
                while (parcel.dataPosition() < iK21) {
                    int i20 = parcel.readInt();
                    char c20 = (char) i20;
                    if (c20 == 1) {
                        I = aais.I(parcel, i20);
                    } else if (c20 != 2) {
                        aais.aa(parcel, i20);
                    } else {
                        zAb6 = aais.ab(parcel, i20);
                    }
                }
                aais.Y(parcel, iK21);
                return new com.google.android.gms.wearable.internal.GetRestoreSupportedResponse(I, zAb6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.wearable.internal.GetChannelInputStreamResponse[i];
            case 1:
                return new com.google.android.gms.wearable.internal.GetCapabilityResponse[i];
            case 2:
                return new com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse[i];
            case 3:
                return new com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.wearable.internal.GetCompanionPackageForNodeResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.wearable.internal.GetConfigResponse[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.wearable.internal.GetConfigsResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.wearable.internal.GetConnectedNodesResponse[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.wearable.internal.GetDataItemResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.wearable.internal.GetEapIdResponse[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.wearable.internal.GetFastpairAccountKeysResponse[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.wearable.internal.GetFdForAssetResponse[i];
            case 15:
                return new com.google.android.gms.wearable.internal.GetListenerServiceRequest[i];
            case 16:
                return new com.google.android.gms.wearable.internal.GetLocalCapabilitiesResponse[i];
            case 17:
                return new com.google.android.gms.wearable.internal.GetLocalNodeResponse[i];
            case 18:
                return new com.google.android.gms.wearable.internal.GetNodeIdResponse[i];
            case 19:
                return new com.google.android.gms.wearable.internal.GetRestoreStateResponse[i];
            default:
                return new com.google.android.gms.wearable.internal.GetRestoreSupportedResponse[i];
        }
    }
}
