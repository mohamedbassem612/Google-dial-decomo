package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ServiceDump extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final defpackage.aalw CREATOR = new defpackage.aalw(0);
    public final com.google.android.gms.feedback.ServiceDumpRequest a;
    public final byte[] b;

    public ServiceDump(com.google.android.gms.feedback.ServiceDumpRequest serviceDumpRequest, byte[] bArr) {
        this.a = (com.google.android.gms.feedback.ServiceDumpRequest) j$.util.Objects.requireNonNull(serviceDumpRequest);
        this.b = (byte[]) j$.util.Objects.requireNonNull(bArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.feedback.ServiceDump serviceDump = (com.google.android.gms.feedback.ServiceDump) obj;
            if (this.a.equals(serviceDump.a) && java.util.Arrays.equals(this.b, serviceDump.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (j$.util.Objects.hash(new java.lang.Object[]{this.a}) * 31) + java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        byte[] bArr = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String string = java.util.Arrays.toString(bArr);
        if (string.length() > 20) {
            string = java.lang.String.valueOf(string.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + strValueOf + ", dumpOutput=\"" + java.lang.String.format(string, new java.lang.Object[0]) + "\"}";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.q(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
