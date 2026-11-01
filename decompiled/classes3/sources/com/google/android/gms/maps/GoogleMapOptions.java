package com.google.android.gms.maps;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GoogleMapOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaof();
    public int a;
    public com.google.android.gms.maps.model.CameraPosition b;
    public java.lang.Boolean c;
    public java.lang.Boolean d;
    public java.lang.Boolean e;
    public java.lang.Boolean f;
    public java.lang.Float g;
    public java.lang.Float h;
    public com.google.android.gms.maps.model.LatLngBounds i;
    public java.lang.Integer j;
    public java.lang.String k;
    public int l;
    private java.lang.Boolean m;
    private java.lang.Boolean n;
    private java.lang.Boolean o;
    private java.lang.Boolean p;
    private java.lang.Boolean q;
    private java.lang.Boolean r;
    private java.lang.Boolean s;
    private java.lang.Boolean t;

    public GoogleMapOptions(byte b, byte b2, int i, com.google.android.gms.maps.model.CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, java.lang.Float f, java.lang.Float f2, com.google.android.gms.maps.model.LatLngBounds latLngBounds, byte b12, java.lang.Integer num, java.lang.String str, int i2) {
        this.a = -1;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = aaoo.h(b);
        this.n = aaoo.h(b2);
        this.a = i;
        this.b = cameraPosition;
        this.o = aaoo.h(b3);
        this.p = aaoo.h(b4);
        this.c = aaoo.h(b5);
        this.q = aaoo.h(b6);
        this.r = aaoo.h(b7);
        this.d = aaoo.h(b8);
        this.e = aaoo.h(b9);
        this.f = aaoo.h(b10);
        this.s = aaoo.h(b11);
        this.g = f;
        this.h = f2;
        this.i = latLngBounds;
        this.t = aaoo.h(b12);
        this.j = num;
        this.k = str;
        this.l = i2;
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("MapType", java.lang.Integer.valueOf(this.a), arrayList);
        aehj.bX("LiteMode", this.e, arrayList);
        aehj.bX("Camera", this.b, arrayList);
        aehj.bX("CompassEnabled", this.p, arrayList);
        aehj.bX("ZoomControlsEnabled", this.o, arrayList);
        aehj.bX("ScrollGesturesEnabled", this.c, arrayList);
        aehj.bX("ZoomGesturesEnabled", this.q, arrayList);
        aehj.bX("TiltGesturesEnabled", this.r, arrayList);
        aehj.bX("RotateGesturesEnabled", this.d, arrayList);
        aehj.bX("ScrollGesturesEnabledDuringRotateOrZoom", this.t, arrayList);
        aehj.bX("MapToolbarEnabled", this.f, arrayList);
        aehj.bX("AmbientEnabled", this.s, arrayList);
        aehj.bX("MinZoomPreference", this.g, arrayList);
        aehj.bX("MaxZoomPreference", this.h, arrayList);
        aehj.bX("BackgroundColor", this.j, arrayList);
        aehj.bX("LatLngBoundsForCameraTarget", this.i, arrayList);
        aehj.bX("ZOrderOnTop", this.m, arrayList);
        aehj.bX("UseViewLifecycleInFragment", this.n, arrayList);
        aehj.bX("mapColorScheme", java.lang.Integer.valueOf(this.l), arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.i(parcel, 2, aaoo.g(this.m));
        aais.i(parcel, 3, aaoo.g(this.n));
        aais.l(parcel, 4, this.a);
        aais.z(parcel, 5, this.b, i);
        aais.i(parcel, 6, aaoo.g(this.o));
        aais.i(parcel, 7, aaoo.g(this.p));
        aais.i(parcel, 8, aaoo.g(this.c));
        aais.i(parcel, 9, aaoo.g(this.q));
        aais.i(parcel, 10, aaoo.g(this.r));
        aais.i(parcel, 11, aaoo.g(this.d));
        aais.i(parcel, 12, aaoo.g(this.e));
        aais.i(parcel, 14, aaoo.g(this.f));
        aais.i(parcel, 15, aaoo.g(this.s));
        aais.t(parcel, 16, this.g);
        aais.t(parcel, 17, this.h);
        aais.z(parcel, 18, this.i, i);
        aais.i(parcel, 19, aaoo.g(this.t));
        aais.w(parcel, 20, this.j);
        aais.A(parcel, 21, this.k);
        aais.l(parcel, 23, this.l);
        aais.g(parcel, iF);
    }

    public GoogleMapOptions() {
        this.a = -1;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = -1;
    }
}
