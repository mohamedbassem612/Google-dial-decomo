package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FunctionTools extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.apps.aicore.aidl.Bundleable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(12);
    public final aify a;

    public FunctionTools(java.util.List list) {
        this.a = list == null ? aike.a : aify.n(list);
    }

    public final java.lang.String toString() {
        return new ahyj(",").b(this.a);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, aifyVar);
        aais.g(parcel, iF);
    }
}
