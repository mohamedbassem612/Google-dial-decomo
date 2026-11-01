package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FunctionResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(11);
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.os.Bundle c;
    private transient aigf d = null;

    public FunctionResponse(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final java.lang.String toString() {
        android.os.Bundle bundle;
        aigf aigfVarU = this.d;
        if (aigfVarU == null && (bundle = this.c) != null) {
            aigfVarU = defpackage.xhp.u(bundle);
            this.d = aigfVarU;
        }
        if (aigfVarU == null || aigfVarU.isEmpty()) {
            return java.lang.String.valueOf(this.b).concat("()");
        }
        return this.b + '(' + new apjb(new ahyj(", ")).x(aigfVarU) + ')';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.p(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
