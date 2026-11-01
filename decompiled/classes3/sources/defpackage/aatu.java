package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aatu extends ylc implements android.os.IInterface {
    public aatu() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 3:
                yld.a(parcel, com.google.android.gms.common.ConnectionResult.CREATOR);
                yld.c(parcel);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            default:
                return false;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                com.google.android.gms.signin.internal.SignInResponse signInResponse = (com.google.android.gms.signin.internal.SignInResponse) yld.a(parcel, com.google.android.gms.signin.internal.SignInResponse.CREATOR);
                yld.c(parcel);
                c(signInResponse);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                yld.c(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void c(com.google.android.gms.signin.internal.SignInResponse signInResponse) {
    }
}
