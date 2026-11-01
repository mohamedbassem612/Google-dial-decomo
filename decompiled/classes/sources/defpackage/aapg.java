package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aapg extends defpackage.ylc implements android.os.IInterface {
    public aapg() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.mobstore.OpenFileDescriptorResponse openFileDescriptorResponse = (com.google.android.gms.mobstore.OpenFileDescriptorResponse) defpackage.yld.a(parcel, com.google.android.gms.mobstore.OpenFileDescriptorResponse.CREATOR);
            com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) defpackage.yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            defpackage.yld.c(parcel);
            b(status, openFileDescriptorResponse, apiMetadata);
            return true;
        }
        if (i == 2) {
            com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.common.api.ApiMetadata apiMetadata2 = (com.google.android.gms.common.api.ApiMetadata) defpackage.yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            defpackage.yld.c(parcel);
            a(status2, apiMetadata2);
            return true;
        }
        if (i != 3) {
            return false;
        }
        com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.common.api.ApiMetadata apiMetadata3 = (com.google.android.gms.common.api.ApiMetadata) defpackage.yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
        defpackage.yld.c(parcel);
        c(status3, apiMetadata3);
        return true;
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status, com.google.android.gms.mobstore.OpenFileDescriptorResponse openFileDescriptorResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }
}
