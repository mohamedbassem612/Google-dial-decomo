package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aart extends ylc implements android.os.IInterface {
    public aart() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 12) {
            parcel.readInt();
            yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            return true;
        }
        if (i == 15) {
            parcel.readInt();
            parcel.readString();
            yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            return true;
        }
        if (i == 16) {
            parcel.readInt();
            yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            return true;
        }
        if (i == 18) {
            parcel.readInt();
            yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            return true;
        }
        if (i == 19) {
            yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
            yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            return true;
        }
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                android.os.Bundle bundle = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                a(i2, bundle);
                return true;
            case 2:
                int i3 = parcel.readInt();
                android.os.Bundle bundle2 = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) yld.a(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                b(i3, bundle2, dataHolder);
                return true;
            case 3:
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                throw new java.lang.RuntimeException("Shouldn't be called");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int i4 = parcel.readInt();
                android.os.Bundle bundle3 = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) yld.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                android.os.Bundle bundle4 = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                c(i4, bundle3, parcelFileDescriptor, bundle4);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            default:
                return false;
        }
    }

    public void a(int i, android.os.Bundle bundle) {
    }

    public void b(int i, android.os.Bundle bundle, com.google.android.gms.common.data.DataHolder dataHolder) {
    }

    public void c(int i, android.os.Bundle bundle, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.Bundle bundle2) {
    }
}
