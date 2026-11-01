package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class zxa extends ylc implements android.os.IInterface {
    public zxa() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetAccountsResponse getAccountsResponse = (com.google.android.gms.auth.aang.GetAccountsResponse) yld.a(parcel, com.google.android.gms.auth.aang.GetAccountsResponse.CREATOR);
                yld.c(parcel);
                a(status, getAccountsResponse);
                return true;
            case 2:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse = (com.google.android.gms.auth.aang.GetTokenResponse) yld.a(parcel, com.google.android.gms.auth.aang.GetTokenResponse.CREATOR);
                yld.c(parcel);
                b(status2, getTokenResponse);
                return true;
            case 3:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readInt();
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse2 = (com.google.android.gms.auth.aang.GetTokenResponse) yld.a(parcel, com.google.android.gms.auth.aang.GetTokenResponse.CREATOR);
                yld.c(parcel);
                c(status3, getTokenResponse2);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetAccountsResponse getAccountsResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        throw new java.lang.UnsupportedOperationException();
    }
}
