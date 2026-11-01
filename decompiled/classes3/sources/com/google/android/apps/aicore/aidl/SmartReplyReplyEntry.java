package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SmartReplyReplyEntry extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(4);
    public final java.lang.String a;
    public final int b;
    public final float c;

    public SmartReplyReplyEntry(java.lang.String str, int i, float f) {
        this.a = str;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.apps.aicore.aidl.SmartReplyReplyEntry) {
            com.google.android.apps.aicore.aidl.SmartReplyReplyEntry smartReplyReplyEntry = (com.google.android.apps.aicore.aidl.SmartReplyReplyEntry) obj;
            if (this.b == smartReplyReplyEntry.b && java.lang.Float.compare(smartReplyReplyEntry.c, this.c) == 0 && j$.util.Objects.equals(this.a, smartReplyReplyEntry.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), java.lang.Float.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return "SmartReplyReplyEntry{text='" + this.a + "', safetyClassificationResult=" + this.b + ", score=" + this.c + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.l(parcel, 2, this.b);
        aais.k(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
