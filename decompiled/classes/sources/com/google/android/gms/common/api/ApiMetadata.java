package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = defpackage.ccu.a;
    public static final com.google.android.gms.common.api.ApiMetadata a = defpackage.aais.aB(null, false, null, false);
    public final com.google.android.gms.common.api.ComplianceOptions b;
    public final boolean c;
    public final com.google.android.gms.common.api.SourceUserContext d;
    public boolean e;

    static {
        defpackage.aais.aB(null, false, null, true);
    }

    public ApiMetadata(com.google.android.gms.common.api.ComplianceOptions complianceOptions, boolean z, com.google.android.gms.common.api.SourceUserContext sourceUserContext) {
        this.b = complianceOptions;
        this.c = z;
        this.d = sourceUserContext;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.ApiMetadata)) {
            return false;
        }
        com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) obj;
        return j$.util.Objects.equals(this.b, apiMetadata.b) && this.e == apiMetadata.e && this.c == apiMetadata.c && j$.util.Objects.equals(this.d, apiMetadata.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.c), this.d});
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.api.SourceUserContext sourceUserContext = this.d;
        return "ApiMetadata(complianceOptions=" + java.lang.String.valueOf(this.b) + ", callbackSupportEnabled=" + this.c + ", sourceUserContext=" + java.lang.String.valueOf(sourceUserContext) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.e) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.z(parcel, 1, this.b, i);
        defpackage.aais.h(parcel, 2, this.c);
        defpackage.aais.z(parcel, 3, this.d, i);
        defpackage.aais.g(parcel, iF);
    }
}
