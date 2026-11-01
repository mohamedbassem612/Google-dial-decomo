package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SmartReplyRequest extends com.google.android.apps.aicore.aidl.AbstractRequest {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(5);
    public final aify a;
    public final int b;
    public final com.google.android.apps.aicore.aidl.UserProperties c;

    public SmartReplyRequest(java.util.List list, int i, com.google.android.apps.aicore.aidl.UserProperties userProperties) {
        this.a = aify.n(list);
        this.b = i;
        this.c = userProperties == null ? com.google.android.apps.aicore.aidl.UserProperties.a : userProperties;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aify aifyVar = this.a;
        int iF = aais.f(parcel, 20293);
        aais.C(parcel, 1, aifyVar);
        aais.l(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
