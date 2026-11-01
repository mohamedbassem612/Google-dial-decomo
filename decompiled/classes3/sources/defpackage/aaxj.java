package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aaxj extends ylc implements android.os.IInterface {
    public aaxj() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 2:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                com.google.android.gms.wearable.internal.PutDataResponse putDataResponse = (com.google.android.gms.wearable.internal.PutDataResponse) yld.a(parcel, com.google.android.gms.wearable.internal.PutDataResponse.CREATOR);
                yld.c(parcel);
                f(putDataResponse);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.google.android.gms.wearable.internal.SendMessageResponse sendMessageResponse = (com.google.android.gms.wearable.internal.SendMessageResponse) yld.a(parcel, com.google.android.gms.wearable.internal.SendMessageResponse.CREATOR);
                yld.c(parcel);
                g(sendMessageResponse);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                a(status);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 15:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 16:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 17:
                com.google.android.gms.wearable.internal.GetChannelInputStreamResponse getChannelInputStreamResponse = (com.google.android.gms.wearable.internal.GetChannelInputStreamResponse) yld.a(parcel, com.google.android.gms.wearable.internal.GetChannelInputStreamResponse.CREATOR);
                yld.c(parcel);
                c(getChannelInputStreamResponse);
                break;
            case 18:
                com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse getChannelOutputStreamResponse = (com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse) yld.a(parcel, com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse.CREATOR);
                yld.c(parcel);
                d(getChannelOutputStreamResponse);
                break;
            case 19:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 20:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case 22:
                com.google.android.gms.wearable.internal.GetCapabilityResponse getCapabilityResponse = (com.google.android.gms.wearable.internal.GetCapabilityResponse) yld.a(parcel, com.google.android.gms.wearable.internal.GetCapabilityResponse.CREATOR);
                yld.c(parcel);
                b(getCapabilityResponse);
                break;
            case 23:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 26:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 27:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 28:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 29:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 30:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 34:
                com.google.android.gms.wearable.internal.RpcResponse rpcResponse = (com.google.android.gms.wearable.internal.RpcResponse) yld.a(parcel, com.google.android.gms.wearable.internal.RpcResponse.CREATOR);
                yld.c(parcel);
                h(rpcResponse);
                break;
            case 35:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 36:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 37:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 38:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 39:
                com.google.android.gms.wearable.internal.GetNodeIdResponse getNodeIdResponse = (com.google.android.gms.wearable.internal.GetNodeIdResponse) yld.a(parcel, com.google.android.gms.wearable.internal.GetNodeIdResponse.CREATOR);
                yld.c(parcel);
                e(getNodeIdResponse);
                break;
            case 40:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 41:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 42:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 43:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 46:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 47:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 48:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 49:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 50:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 51:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 52:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.wearable.internal.GetCapabilityResponse getCapabilityResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.wearable.internal.GetChannelInputStreamResponse getChannelInputStreamResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void d(com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void e(com.google.android.gms.wearable.internal.GetNodeIdResponse getNodeIdResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void f(com.google.android.gms.wearable.internal.PutDataResponse putDataResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void g(com.google.android.gms.wearable.internal.SendMessageResponse sendMessageResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void h(com.google.android.gms.wearable.internal.RpcResponse rpcResponse) {
        throw new java.lang.UnsupportedOperationException();
    }
}
