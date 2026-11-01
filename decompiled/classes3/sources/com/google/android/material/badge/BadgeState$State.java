package com.google.android.material.badge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class BadgeState$State implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new afwr(1);
    public java.lang.Integer A;
    public java.lang.Integer B;
    public java.lang.Integer C;
    public java.lang.Boolean D;
    private java.lang.Integer E;
    public int a;
    public java.lang.Integer b;
    public java.lang.Integer c;
    public java.lang.Integer d;
    public java.lang.Integer e;
    public java.lang.Integer f;
    public java.lang.Integer g;
    public java.lang.Integer h;
    public int i;
    public java.lang.String j;
    public int k;
    public int l;
    public int m;
    public java.util.Locale n;
    public java.lang.CharSequence o;
    public java.lang.CharSequence p;
    public int q;
    public int r;
    public java.lang.Integer s;
    public java.lang.Boolean t;
    public java.lang.Integer u;
    public java.lang.Integer v;
    public java.lang.Integer w;
    public java.lang.Integer x;
    public java.lang.Integer y;
    public java.lang.Integer z;

    public BadgeState$State(android.os.Parcel parcel) {
        this.i = 255;
        this.k = -2;
        this.l = -2;
        this.m = -2;
        this.t = java.lang.Boolean.TRUE;
        this.a = parcel.readInt();
        this.b = (java.lang.Integer) parcel.readSerializable();
        this.c = (java.lang.Integer) parcel.readSerializable();
        this.d = (java.lang.Integer) parcel.readSerializable();
        this.e = (java.lang.Integer) parcel.readSerializable();
        this.f = (java.lang.Integer) parcel.readSerializable();
        this.g = (java.lang.Integer) parcel.readSerializable();
        this.h = (java.lang.Integer) parcel.readSerializable();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.s = (java.lang.Integer) parcel.readSerializable();
        this.u = (java.lang.Integer) parcel.readSerializable();
        this.v = (java.lang.Integer) parcel.readSerializable();
        this.w = (java.lang.Integer) parcel.readSerializable();
        this.x = (java.lang.Integer) parcel.readSerializable();
        this.y = (java.lang.Integer) parcel.readSerializable();
        this.z = (java.lang.Integer) parcel.readSerializable();
        this.C = (java.lang.Integer) parcel.readSerializable();
        this.A = (java.lang.Integer) parcel.readSerializable();
        this.B = (java.lang.Integer) parcel.readSerializable();
        this.t = (java.lang.Boolean) parcel.readSerializable();
        this.n = (java.util.Locale) parcel.readSerializable();
        this.D = (java.lang.Boolean) parcel.readSerializable();
        this.E = (java.lang.Integer) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        java.lang.CharSequence charSequence = this.o;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        java.lang.CharSequence charSequence2 = this.p;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.q);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.u);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.z);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.n);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
    }

    public BadgeState$State() {
        this.i = 255;
        this.k = -2;
        this.l = -2;
        this.m = -2;
        this.t = java.lang.Boolean.TRUE;
    }
}
