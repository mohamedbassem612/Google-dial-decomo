package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DeviceVersionEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.DeviceVersion {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(4);
    public final java.lang.Integer a;

    public DeviceVersionEntity(java.lang.Integer num) {
        this.a = num;
    }

    @Override // com.google.android.gms.people.protomodel.DeviceVersion
    public final java.lang.Integer a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.DeviceVersion)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j$.util.Objects.equals(a(), ((com.google.android.gms.people.protomodel.DeviceVersion) obj).a());
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.Integer num = this.a;
        int iF = aais.f(parcel, 20293);
        aais.w(parcel, 2, num);
        aais.g(parcel, iF);
    }
}
