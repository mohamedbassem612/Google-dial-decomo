package com.google.android.gms.audit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LogAuditRecordsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(2);
    public final int a;
    public final int b;
    public final java.lang.String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public LogAuditRecordsRequest(int i, int i2, java.lang.String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z;
        if (i == 1) {
            z = true;
        } else if (i == 2) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        aais.aj(z, "Invalid WriteMode.");
        aais.aj(bArr != null && bArr.length > 0, "Must specify at least one audit record.");
        aais.aj(i2 != 0, "Invalid componentId.");
        aais.aj(bArr2 == null || bArr3 == null, "Do not set both TraceToken and AuditToken.");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.r(parcel, 4, this.d);
        aais.q(parcel, 5, this.e);
        aais.q(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
