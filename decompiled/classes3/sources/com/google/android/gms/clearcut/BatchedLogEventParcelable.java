package com.google.android.gms.clearcut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BatchedLogEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(1);
    public final java.util.List a;
    public final com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable b;

    public BatchedLogEventParcelable(java.util.List list, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) {
        this.a = j$.util.DesugarCollections.unmodifiableList(list);
        this.b = batchedLogErrorParcelable;
    }

    public final java.lang.String toString() {
        com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = this.b;
        return "BatchedLogEventParcelable[LogEvents: " + java.lang.String.valueOf(this.a) + "]\nBatchedLogErrors: " + java.lang.String.valueOf(batchedLogErrorParcelable) + "]\n";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, list);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
