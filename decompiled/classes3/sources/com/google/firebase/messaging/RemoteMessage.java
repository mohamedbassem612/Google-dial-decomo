package com.google.firebase.messaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RemoteMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(9);
    public final android.os.Bundle a;
    private java.util.Map b;

    public RemoteMessage(android.os.Bundle bundle) {
        this.a = bundle;
    }

    public static final int b(java.lang.String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final java.util.Map a() {
        if (this.b == null) {
            android.os.Bundle bundle = this.a;
            aca acaVar = new aca();
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        acaVar.put(str, str2);
                    }
                }
            }
            this.b = acaVar;
        }
        return new java.util.HashMap(this.b);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.p(parcel, 2, this.a);
        aais.g(parcel, iF);
    }
}
