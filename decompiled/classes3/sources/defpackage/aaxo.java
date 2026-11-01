package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxo implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aaxo(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x0392, code lost:
    
        if (r11.equals("UNKNOWN_ERROR") != false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxo.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.android.gms.wearable.internal.WebIconParcelable[i];
            case 1:
                return new com.google.android.gms.wearable.internal.GetTermsResponse[i];
            case 2:
                return new com.google.android.gms.wearable.internal.MessageEventParcelable[i];
            case 3:
                return new com.google.android.gms.wearable.internal.NodeMigratedEventParcelable[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.gms.wearable.internal.NodeParcelable[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.gms.wearable.internal.OpenChannelResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.gms.wearable.internal.PackageStorageInfo[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.gms.wearable.internal.ParcelableBackupDevice[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.gms.wearable.internal.PerformEapAkaResponse[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.gms.wearable.internal.PutDataResponse[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.gms.wearable.internal.RpcResponse[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.gms.wearable.internal.SendMessageResponse[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.gms.wearable.internal.StorageInfoResponse[i];
            case 15:
                return new com.google.android.gms.wearable.internal.WearableListenerServiceInfo[i];
            case 16:
                return new com.google.android.ims.ipc.AudioData[i];
            case 17:
                return new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions[i];
            case 18:
                return new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult[i];
            case 19:
                return new com.google.android.libraries.abuse.hades.signals.gmsclient.SignalValue[i];
            default:
                return new com.google.android.libraries.dialer.videocall.ViLteStatus[0];
        }
    }
}
