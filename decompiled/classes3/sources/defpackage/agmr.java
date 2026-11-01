package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmr implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public agmr(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.Bundle bundleM = null;
        switch (this.$cid) {
            case 0:
                return new com.google.apps.tiktok.account.api.AccountOperationContext(parcel);
            case 1:
                return new com.google.android.wizardmanager.WizardStack(parcel);
            case 2:
                return new com.google.apps.tiktok.account.api.controller.AccountActionResult(parcel);
            case 3:
                return new com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult(parcel.readInt() == 1, parcel.readInt() == 1, (android.content.Intent) parcel.readParcelable(getClass().getClassLoader()));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i = parcel.readInt();
                com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[] parcelableEntryArr = new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[i];
                for (int i2 = 0; i2 < i; i2++) {
                    parcelableEntryArr[i2] = (com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry) parcel.readParcelable(com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry.class.getClassLoader());
                }
                return new com.google.apps.tiktok.cache.ParcelableKeyValueStore(parcelableEntryArr);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry(parcel.readParcelable(com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto.class.getClassLoader()), parcel.readParcelable(com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto.class.getClassLoader()), j$.time.Instant.ofEpochMilli(parcel.readLong()));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture(parcel);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int i3 = parcel.readInt();
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.content.Intent.CREATOR);
                java.lang.String string = parcel.readString();
                int i4 = parcel.readInt();
                return new com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination(i3, arrayListCreateTypedArrayList, string, i4 != 0, parcel.readInt() == 1 ? java.lang.Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 1 ? (android.app.PendingIntent) parcel.readParcelable(android.app.PendingIntent.class.getClassLoader()) : null);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.apps.tiktok.tracing.contrib.grpc.MetadataTracePropagation.TraceReferencingDummyParcelable();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK = aais.K(parcel);
                while (parcel.dataPosition() < iK) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        aais.aa(parcel, i5);
                    } else {
                        bundleM = aais.M(parcel, i5);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.firebase.messaging.RemoteMessage(bundleM);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.oslo.service.serviceinterface.output.StatusReportData(parcel);
            default:
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse(bArr, (albh) null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.google.apps.tiktok.account.api.AccountOperationContext[i];
            case 1:
                return new com.google.android.wizardmanager.WizardStack[i];
            case 2:
                return new com.google.apps.tiktok.account.api.controller.AccountActionResult[i];
            case 3:
                return new com.google.apps.tiktok.account.api.controller.ValidationResult[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.apps.tiktok.cache.ParcelableKeyValueStore[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.apps.tiktok.tracing.contrib.grpc.MetadataTracePropagation.TraceReferencingDummyParcelable[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.firebase.messaging.RemoteMessage[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.oslo.service.serviceinterface.output.StatusReportData[i];
            default:
                return new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse[i];
        }
    }
}
