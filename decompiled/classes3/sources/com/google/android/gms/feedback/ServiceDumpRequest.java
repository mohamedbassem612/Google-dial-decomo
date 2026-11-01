package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ServiceDumpRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final defpackage.aalx CREATOR = new defpackage.aalx(0);
    final java.lang.String a;
    final java.lang.String b;
    final java.lang.String[] c;
    final int d;
    final boolean e;

    public ServiceDumpRequest(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, int i, boolean z) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.feedback.ServiceDumpRequest serviceDumpRequest = (com.google.android.gms.feedback.ServiceDumpRequest) obj;
            if (this.e == serviceDumpRequest.e && this.d == serviceDumpRequest.d && this.a.equals(serviceDumpRequest.a) && this.b.equals(serviceDumpRequest.b) && java.util.Arrays.equals(this.c, serviceDumpRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Boolean.valueOf(this.e), java.lang.Integer.valueOf(this.d)}) * 31) + java.util.Arrays.hashCode(this.c);
    }

    public final java.lang.String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + java.util.Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.B(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.A(parcel, 6, this.b);
        aais.g(parcel, iF);
    }
}
