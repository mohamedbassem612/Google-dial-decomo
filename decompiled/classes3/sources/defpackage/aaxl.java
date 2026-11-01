package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aaxl extends ylc implements defpackage.aaxm {
    public aaxl() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        defpackage.aaxh aaxhVar = null;
        defpackage.aaxi aaxiVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) yld.a(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                yld.c(parcel);
                e(dataHolder);
                return true;
            case 2:
                com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable = (com.google.android.gms.wearable.internal.MessageEventParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.MessageEventParcelable.CREATOR);
                yld.c(parcel);
                g(messageEventParcelable);
                return true;
            case 3:
                com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable = (com.google.android.gms.wearable.internal.NodeParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                yld.c(parcel);
                j(nodeParcelable);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable2 = (com.google.android.gms.wearable.internal.NodeParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                yld.c(parcel);
                k(nodeParcelable2);
                return true;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.wearable.internal.NodeParcelable.CREATOR);
                yld.c(parcel);
                d(arrayListCreateTypedArrayList);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.google.android.gms.wearable.internal.AncsNotificationParcelable ancsNotificationParcelable = (com.google.android.gms.wearable.internal.AncsNotificationParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.AncsNotificationParcelable.CREATOR);
                yld.c(parcel);
                i(ancsNotificationParcelable);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.google.android.gms.wearable.internal.ChannelEventParcelable channelEventParcelable = (com.google.android.gms.wearable.internal.ChannelEventParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.ChannelEventParcelable.CREATOR);
                yld.c(parcel);
                b(channelEventParcelable);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                com.google.android.gms.wearable.internal.CapabilityInfoParcelable capabilityInfoParcelable = (com.google.android.gms.wearable.internal.CapabilityInfoParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.CapabilityInfoParcelable.CREATOR);
                yld.c(parcel);
                c(capabilityInfoParcelable);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable amsEntityUpdateParcelable = (com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable.CREATOR);
                yld.c(parcel);
                f(amsEntityUpdateParcelable);
                return true;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
            default:
                return false;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable2 = (com.google.android.gms.wearable.internal.MessageEventParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.MessageEventParcelable.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    aaxhVar = iInterfaceQueryLocalInterface instanceof defpackage.aaxh ? (defpackage.aaxh) iInterfaceQueryLocalInterface : new defpackage.aaxh(strongBinder);
                }
                yld.c(parcel);
                o(messageEventParcelable2, aaxhVar);
                return true;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                yld.c(parcel);
                m();
                return true;
            case 15:
                yld.c(parcel);
                l();
                return true;
            case 16:
                com.google.android.gms.wearable.internal.NodeMigratedEventParcelable nodeMigratedEventParcelable = (com.google.android.gms.wearable.internal.NodeMigratedEventParcelable) yld.a(parcel, com.google.android.gms.wearable.internal.NodeMigratedEventParcelable.CREATOR);
                yld.c(parcel);
                h(nodeMigratedEventParcelable);
                return true;
            case 17:
                yld.c(parcel);
                n();
                return true;
            case 18:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IServiceResponseCallback");
                    aaxiVar = iInterfaceQueryLocalInterface2 instanceof defpackage.aaxi ? (defpackage.aaxi) iInterfaceQueryLocalInterface2 : new defpackage.aaxi(strongBinder2);
                }
                yld.c(parcel);
                boolean zP = p(aaxiVar);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
        }
    }
}
