package com.google.android.gms.maps.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MarkerOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaor();
    public com.google.android.gms.maps.model.LatLng a;
    public java.lang.String b;
    public java.lang.String c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public int o;
    public java.lang.String p;
    private android.view.View q;
    private defpackage.uzx r;

    public MarkerOptions(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, android.os.IBinder iBinder2, int i2, java.lang.String str3) {
        defpackage.aalb aakzVar;
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.r = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            this.r = new defpackage.uzx(iInterfaceQueryLocalInterface instanceof defpackage.aalb ? (defpackage.aalb) iInterfaceQueryLocalInterface : new defpackage.aakz(iBinder));
        }
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.o = i2;
        this.n = i;
        if (iBinder2 == null) {
            aakzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            aakzVar = iInterfaceQueryLocalInterface2 instanceof defpackage.aalb ? (defpackage.aalb) iInterfaceQueryLocalInterface2 : new defpackage.aakz(iBinder2);
        }
        this.q = aakzVar != null ? (android.view.View) aala.a(aakzVar) : null;
        this.p = str3;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [aalb, java.lang.Object] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        defpackage.uzx uzxVar = this.r;
        aais.u(parcel, 5, uzxVar == null ? null : uzxVar.a.asBinder());
        aais.k(parcel, 6, this.d);
        aais.k(parcel, 7, this.e);
        aais.h(parcel, 8, this.f);
        aais.h(parcel, 9, this.g);
        aais.h(parcel, 10, this.h);
        aais.k(parcel, 11, this.i);
        aais.k(parcel, 12, this.j);
        aais.k(parcel, 13, this.k);
        aais.k(parcel, 14, this.l);
        aais.k(parcel, 15, this.m);
        aais.l(parcel, 17, this.n);
        aais.u(parcel, 18, new aala(this.q));
        aais.l(parcel, 19, this.o);
        aais.A(parcel, 20, this.p);
        aais.g(parcel, iF);
    }

    public MarkerOptions() {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
    }
}
