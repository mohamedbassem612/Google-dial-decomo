package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aamu extends ylc implements android.os.IInterface {
    public aamu() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = (com.google.android.gms.googlehelp.GoogleHelp) yld.a(parcel, com.google.android.gms.googlehelp.GoogleHelp.CREATOR);
                yld.c(parcel);
                c(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                a();
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                b();
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                parcel.readInt();
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                parcel.createByteArray();
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                throw new java.lang.UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 16:
                throw new java.lang.UnsupportedOperationException();
            case 17:
                com.google.android.gms.googlehelp.InProductHelp inProductHelp = (com.google.android.gms.googlehelp.InProductHelp) yld.a(parcel, com.google.android.gms.googlehelp.InProductHelp.CREATOR);
                yld.c(parcel);
                d(inProductHelp);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.createByteArray();
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 19:
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void a() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void d(com.google.android.gms.googlehelp.InProductHelp inProductHelp) {
        throw new java.lang.UnsupportedOperationException();
    }
}
