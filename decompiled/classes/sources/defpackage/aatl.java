package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aatl extends defpackage.ylc implements android.os.IInterface {
    public aatl() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.pseudonymous.PseudonymousIdToken pseudonymousIdToken = (com.google.android.gms.pseudonymous.PseudonymousIdToken) defpackage.yld.a(parcel, com.google.android.gms.pseudonymous.PseudonymousIdToken.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) defpackage.yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                defpackage.yld.c(parcel);
                a(status, pseudonymousIdToken, apiMetadata);
                return true;
            case 2:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                parcel.readLong();
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 4:
                parcel.createTypedArrayList(com.google.android.gms.pseudonymous.SessionZwiebackToken.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 5:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yld.a(parcel, com.google.android.gms.pseudonymous.DeviceWideZwiebackToken.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.pseudonymous.PseudonymousIdToken pseudonymousIdToken, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        throw null;
    }
}
