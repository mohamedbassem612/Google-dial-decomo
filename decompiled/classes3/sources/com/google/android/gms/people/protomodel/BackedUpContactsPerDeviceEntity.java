package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BackedUpContactsPerDeviceEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.BackedUpContactsPerDevice {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(2);
    public final java.lang.String a;
    public final java.lang.Long b;
    public final java.lang.String c;
    public final java.lang.Long d;
    public final java.lang.Long e;
    public final com.google.android.gms.people.protomodel.DeviceVersionEntity f;
    private final java.util.List g;
    private java.util.List h;

    public BackedUpContactsPerDeviceEntity(java.lang.String str, java.lang.Long l, java.util.List list, java.lang.String str2, java.lang.Long l2, java.lang.Long l3, com.google.android.gms.people.protomodel.DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final com.google.android.gms.people.protomodel.DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.lang.Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.lang.Long c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.lang.Long d() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.lang.String e() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.BackedUpContactsPerDevice)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.BackedUpContactsPerDevice backedUpContactsPerDevice = (com.google.android.gms.people.protomodel.BackedUpContactsPerDevice) obj;
            if (!j$.util.Objects.equals(f(), backedUpContactsPerDevice.f()) || !j$.util.Objects.equals(b(), backedUpContactsPerDevice.b()) || !j$.util.Objects.equals(g(), backedUpContactsPerDevice.g()) || !j$.util.Objects.equals(e(), backedUpContactsPerDevice.e()) || !j$.util.Objects.equals(d(), backedUpContactsPerDevice.d()) || !j$.util.Objects.equals(c(), backedUpContactsPerDevice.c()) || !j$.util.Objects.equals(a(), backedUpContactsPerDevice.a())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.lang.String f() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final java.util.List g() {
        java.util.List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((com.google.android.gms.people.protomodel.SourceStats) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{f(), b(), g(), e(), d(), c(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.E(parcel, 3, g());
        aais.A(parcel, 4, this.c);
        aais.y(parcel, 5, this.d);
        aais.y(parcel, 6, this.e);
        aais.y(parcel, 7, this.b);
        aais.z(parcel, 8, this.f, i);
        aais.g(parcel, iF);
    }
}
