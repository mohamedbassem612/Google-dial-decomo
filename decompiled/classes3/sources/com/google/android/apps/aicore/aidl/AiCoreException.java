package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AiCoreException extends java.lang.Exception implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(4);
    public final int a;
    public final int b;
    public final com.google.android.apps.aicore.aidl.RetryDetails c;
    public final com.google.android.apps.aicore.aidl.InferenceErrorDetails d;

    public AiCoreException(int i, int i2, java.lang.String str, com.google.android.apps.aicore.aidl.RetryDetails retryDetails, com.google.android.apps.aicore.aidl.InferenceErrorDetails inferenceErrorDetails) {
        super(str);
        this.a = i;
        this.b = i2;
        this.c = retryDetails;
        this.d = inferenceErrorDetails;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.A(parcel, 3, getMessage());
        aais.z(parcel, 4, this.c, i);
        aais.z(parcel, 5, this.d, i);
        aais.g(parcel, iF);
    }
}
