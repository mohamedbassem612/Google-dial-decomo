package com.google.android.gms.location.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class LocationRequestUpdateData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(12);
    public final int a;
    public final com.google.android.gms.location.internal.LocationRequestInternal b;
    public final android.app.PendingIntent c;
    public final java.lang.String d;
    private final defpackage.aann e;
    private final defpackage.aanu f;
    private final defpackage.aank g;

    public LocationRequestUpdateData(int i, com.google.android.gms.location.internal.LocationRequestInternal locationRequestInternal, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder3, java.lang.String str) {
        defpackage.aann aanlVar;
        defpackage.aank aankVar;
        this.a = i;
        this.b = locationRequestInternal;
        defpackage.aanu aansVar = null;
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            aanlVar = iInterfaceQueryLocalInterface instanceof defpackage.aann ? (defpackage.aann) iInterfaceQueryLocalInterface : new defpackage.aanl(iBinder);
        } else {
            aanlVar = null;
        }
        this.e = aanlVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            aankVar = iInterfaceQueryLocalInterface2 instanceof defpackage.aank ? (defpackage.aank) iInterfaceQueryLocalInterface2 : new defpackage.aank(iBinder2);
        } else {
            aankVar = null;
        }
        this.g = aankVar;
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            aansVar = iInterfaceQueryLocalInterface3 instanceof defpackage.aanu ? (defpackage.aanu) iInterfaceQueryLocalInterface3 : new defpackage.aans(iBinder3);
        }
        this.f = aansVar;
        this.d = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i);
        defpackage.aann aannVar = this.e;
        aais.u(parcel, 3, aannVar == null ? null : aannVar.asBinder());
        aais.z(parcel, 4, this.c, i);
        defpackage.aank aankVar = this.g;
        aais.u(parcel, 5, aankVar == null ? null : ((ylb) aankVar).a);
        defpackage.aanu aanuVar = this.f;
        aais.u(parcel, 6, aanuVar != null ? aanuVar.asBinder() : null);
        aais.A(parcel, 8, this.d);
        aais.g(parcel, iF);
    }
}
