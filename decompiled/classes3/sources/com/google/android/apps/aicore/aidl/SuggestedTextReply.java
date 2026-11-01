package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SuggestedTextReply extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(8);
    public final java.lang.String a;
    public final int b;

    public SuggestedTextReply(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.SuggestedTextReply) {
            com.google.android.apps.aicore.aidl.SuggestedTextReply suggestedTextReply = (com.google.android.apps.aicore.aidl.SuggestedTextReply) obj;
            if (this.b == suggestedTextReply.b && j$.util.Objects.equals(this.a, suggestedTextReply.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.l(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
