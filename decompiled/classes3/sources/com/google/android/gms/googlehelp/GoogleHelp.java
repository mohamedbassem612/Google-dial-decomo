package com.google.android.gms.googlehelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleHelp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aamf();
    boolean A;
    public boolean B;
    int C;
    java.lang.String D;
    boolean E;
    java.lang.String F;
    boolean G;
    com.google.android.gms.googlehelp.ND4CSettings H;
    boolean I;
    java.util.List J;

    @java.lang.Deprecated
    java.lang.String K;
    public int L;
    public int M;
    public java.util.List N;
    java.lang.String O;
    android.content.Intent P;
    java.util.List Q;
    public aaoo R;
    final int a;
    java.lang.String b;
    public android.accounts.Account c;
    android.os.Bundle d;
    java.lang.String e;
    java.lang.String f;
    android.graphics.Bitmap g;
    boolean h;
    boolean i;
    java.util.List j;

    @java.lang.Deprecated
    android.os.Bundle k;

    @java.lang.Deprecated
    android.graphics.Bitmap l;

    @java.lang.Deprecated
    byte[] m;

    @java.lang.Deprecated
    int n;

    @java.lang.Deprecated
    int o;
    java.lang.String p;
    public android.net.Uri q;
    public java.util.List r;
    public com.google.android.gms.feedback.ThemeSettings s;
    java.util.List t;
    boolean u;
    public com.google.android.gms.feedback.ErrorReport v;
    public com.google.android.gms.googlehelp.internal.common.TogglingData w;
    int x;
    public android.app.PendingIntent y;
    public int z;

    public GoogleHelp(int i, java.lang.String str, android.accounts.Account account, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z, boolean z2, java.util.List list, android.os.Bundle bundle2, android.graphics.Bitmap bitmap2, byte[] bArr, int i2, int i3, java.lang.String str4, android.net.Uri uri, java.util.List list2, int i4, com.google.android.gms.feedback.ThemeSettings themeSettings, java.util.List list3, boolean z3, com.google.android.gms.feedback.ErrorReport errorReport, com.google.android.gms.googlehelp.internal.common.TogglingData togglingData, int i5, android.app.PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, java.lang.String str5, boolean z6, java.lang.String str6, boolean z7, com.google.android.gms.googlehelp.ND4CSettings nD4CSettings, boolean z8, java.util.List list4, java.lang.String str7, int i8, int i9, java.util.List list5, java.lang.String str8, android.content.Intent intent, java.util.List list6) {
        this.v = new com.google.android.gms.feedback.ErrorReport();
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            com.google.android.gms.feedback.ThemeSettings themeSettings2 = new com.google.android.gms.feedback.ThemeSettings(3, 0);
            themeSettings2.a = i4;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new com.google.android.gms.feedback.ThemeSettings(3, 0) : themeSettings;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.content.Intent a() {
        return new android.content.Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", (android.os.Parcelable) this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.p(parcel, 4, this.d);
        aais.h(parcel, 5, this.h);
        aais.h(parcel, 6, this.i);
        aais.C(parcel, 7, this.j);
        aais.p(parcel, 10, this.k);
        aais.z(parcel, 11, this.l, i);
        aais.A(parcel, 14, this.p);
        aais.z(parcel, 15, this.q, i);
        aais.E(parcel, 16, this.r);
        aais.l(parcel, 17, 0);
        aais.E(parcel, 18, this.t);
        aais.q(parcel, 19, this.m);
        aais.l(parcel, 20, this.n);
        aais.l(parcel, 21, this.o);
        aais.h(parcel, 22, this.u);
        aais.z(parcel, 23, this.v, i);
        aais.z(parcel, 25, this.s, i);
        aais.A(parcel, 28, this.e);
        aais.z(parcel, 31, this.w, i);
        aais.l(parcel, 32, this.x);
        aais.z(parcel, 33, this.y, i);
        aais.A(parcel, 34, this.f);
        aais.z(parcel, 35, this.g, i);
        aais.l(parcel, 36, this.z);
        aais.h(parcel, 37, this.A);
        aais.h(parcel, 38, this.B);
        aais.l(parcel, 39, this.C);
        aais.A(parcel, 40, this.D);
        aais.h(parcel, 41, this.E);
        aais.A(parcel, 42, this.F);
        aais.h(parcel, 43, this.G);
        aais.z(parcel, 44, this.H, i);
        aais.h(parcel, 45, this.I);
        aais.E(parcel, 46, this.J);
        aais.A(parcel, 47, this.K);
        aais.l(parcel, 48, this.L);
        aais.l(parcel, 49, this.M);
        aais.E(parcel, 50, this.N);
        aais.A(parcel, 51, this.O);
        aais.z(parcel, 52, this.P, i);
        aais.C(parcel, 53, this.Q);
        aais.g(parcel, iF);
    }

    @java.lang.Deprecated
    public GoogleHelp(java.lang.String str) {
        this(23, str, null, null, null, null, null, true, true, new java.util.ArrayList(), null, null, null, 0, 0, null, null, new java.util.ArrayList(), 3, null, new java.util.ArrayList(), false, new com.google.android.gms.feedback.ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new java.util.ArrayList(), null, 0, 0, new java.util.ArrayList(), null, null, new java.util.ArrayList());
    }
}
