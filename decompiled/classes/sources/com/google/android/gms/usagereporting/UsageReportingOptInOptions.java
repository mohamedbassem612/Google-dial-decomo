package com.google.android.gms.usagereporting;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class UsageReportingOptInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(4);
    public final int a;
    public final boolean b;
    public final java.util.List c;
    public final int d;
    public final java.lang.String e;
    public final boolean f;

    public UsageReportingOptInOptions(int i, boolean z, java.util.List list, int i2, java.lang.String str, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 2, this.a);
        defpackage.aais.h(parcel, 3, this.b);
        defpackage.aais.C(parcel, 4, this.c);
        defpackage.aais.l(parcel, 5, this.d);
        defpackage.aais.A(parcel, 6, this.e);
        defpackage.aais.h(parcel, 7, this.f);
        defpackage.aais.g(parcel, iF);
    }
}
