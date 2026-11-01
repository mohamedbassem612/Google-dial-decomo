package com.google.android.gms.clearcut.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class BatchedLogErrorParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(4);
    public final java.util.List a;

    public BatchedLogErrorParcelable(java.util.List list) {
        this.a = j$.util.DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) {
            return this.a.equals(((com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final java.lang.String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.E(parcel, 1, list);
        defpackage.aais.g(parcel, iF);
    }
}
