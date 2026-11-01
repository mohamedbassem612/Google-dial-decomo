package com.google.android.gms.droidguard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class DroidGuardResultsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR;
    public final android.os.Bundle a;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        CREATOR = new defpackage.xkl(5);
    }

    public DroidGuardResultsRequest() {
        java.lang.String property;
        android.os.Bundle bundle = new android.os.Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", aabx.b);
        try {
            property = java.lang.System.getProperty("os.arch");
        } catch (java.lang.Exception unused) {
            property = "?";
        }
        this.a.putString("appArchitecture", property);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.p(parcel, 2, this.a);
        aais.g(parcel, iF);
    }

    public DroidGuardResultsRequest(android.os.Bundle bundle) {
        new android.os.Bundle();
        this.a = bundle;
    }
}
