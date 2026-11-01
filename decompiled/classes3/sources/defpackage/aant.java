package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aant extends ylc implements defpackage.aanu {
    public aant() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.location.internal.FusedLocationProviderResult fusedLocationProviderResult = (com.google.android.gms.location.internal.FusedLocationProviderResult) yld.a(parcel, com.google.android.gms.location.internal.FusedLocationProviderResult.CREATOR);
            com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
            yld.c(parcel);
            a(fusedLocationProviderResult, apiMetadata);
            return true;
        }
        if (i != 2) {
            return false;
        }
        yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
        yld.c(parcel);
        b();
        return true;
    }
}
