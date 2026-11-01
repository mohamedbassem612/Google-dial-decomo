package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ErrorReport extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(16);
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public android.os.Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public java.lang.String I;
    public java.lang.String J;
    public int K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public java.lang.String P;

    @java.lang.Deprecated
    public java.lang.String Q;
    public java.lang.String R;
    public com.google.android.gms.common.data.BitmapTeleporter S;
    public java.lang.String T;
    public com.google.android.gms.feedback.FileTeleporter[] U;
    public java.lang.String[] V;
    public boolean W;
    public java.lang.String X;
    public com.google.android.gms.feedback.ThemeSettings Y;
    public com.google.android.gms.feedback.LogOptions Z;
    public android.app.ApplicationErrorReport a;

    @java.lang.Deprecated
    public java.lang.String aa;
    public boolean ab;
    public android.os.Bundle ac;
    public java.util.List ad;
    public boolean ae;
    public android.graphics.Bitmap af;
    public java.lang.String ag;
    public java.util.List ah;
    public int ai;
    public int aj;
    public java.lang.String[] ak;
    public java.lang.String[] al;
    public java.lang.String[] am;
    public boolean an;
    public boolean ao;
    public java.lang.String ap;
    public com.google.android.gms.feedback.AdditionalConsentConfig aq;
    public com.google.android.gms.feedback.ServiceDump[] ar;
    public java.lang.String as;
    public java.lang.String b;
    public int c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public int k;
    public java.lang.String l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String o;
    public java.lang.String p;
    public java.lang.String[] q;
    public java.lang.String[] r;
    public java.lang.String[] s;
    public java.lang.String t;
    public java.lang.String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport(android.app.ApplicationErrorReport applicationErrorReport, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String str14, java.lang.String str15, byte[] bArr, int i3, int i4, int i5, int i6, java.lang.String str16, java.lang.String str17, java.lang.String str18, android.os.Bundle bundle, boolean z, int i7, int i8, boolean z2, java.lang.String str19, java.lang.String str20, int i9, java.lang.String str21, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, java.lang.String str26, java.lang.String str27, com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter, java.lang.String str28, com.google.android.gms.feedback.FileTeleporter[] fileTeleporterArr, java.lang.String[] strArr4, boolean z3, java.lang.String str29, com.google.android.gms.feedback.ThemeSettings themeSettings, com.google.android.gms.feedback.LogOptions logOptions, java.lang.String str30, boolean z4, android.os.Bundle bundle2, java.util.List list, boolean z5, android.graphics.Bitmap bitmap, java.lang.String str31, java.util.List list2, int i10, int i11, java.lang.String[] strArr5, java.lang.String[] strArr6, java.lang.String[] strArr7, boolean z6, boolean z7, java.lang.String str32, com.google.android.gms.feedback.AdditionalConsentConfig additionalConsentConfig, com.google.android.gms.feedback.ServiceDump[] serviceDumpArr, java.lang.String str33) {
        new android.app.ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = fileTeleporterArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = themeSettings;
        this.Z = logOptions;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = additionalConsentConfig;
        this.ar = serviceDumpArr;
        this.as = str33;
    }

    /* JADX WARN: Type inference failed for: r2v46, types: [android.os.Parcelable[], com.google.android.gms.feedback.FileTeleporter[]] */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.os.Parcelable[], com.google.android.gms.feedback.ServiceDump[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.A(parcel, 3, this.b);
        aais.l(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.A(parcel, 6, this.e);
        aais.A(parcel, 7, this.f);
        aais.A(parcel, 8, this.g);
        aais.A(parcel, 9, this.h);
        aais.A(parcel, 10, this.i);
        aais.A(parcel, 11, this.j);
        aais.l(parcel, 12, this.k);
        aais.A(parcel, 13, this.l);
        aais.A(parcel, 14, this.m);
        aais.A(parcel, 15, this.n);
        aais.A(parcel, 16, this.o);
        aais.A(parcel, 17, this.p);
        aais.B(parcel, 18, this.q);
        aais.B(parcel, 19, this.r);
        aais.B(parcel, 20, this.s);
        aais.A(parcel, 21, this.t);
        aais.A(parcel, 22, this.u);
        aais.q(parcel, 23, this.v);
        aais.l(parcel, 24, this.w);
        aais.l(parcel, 25, this.x);
        aais.l(parcel, 26, this.y);
        aais.l(parcel, 27, this.z);
        aais.A(parcel, 28, this.A);
        aais.A(parcel, 29, this.B);
        aais.A(parcel, 30, this.C);
        aais.p(parcel, 31, this.D);
        aais.h(parcel, 32, this.E);
        aais.l(parcel, 33, this.F);
        aais.l(parcel, 34, this.G);
        aais.h(parcel, 35, this.H);
        aais.A(parcel, 36, this.I);
        aais.A(parcel, 37, this.J);
        aais.l(parcel, 38, this.K);
        aais.A(parcel, 39, this.L);
        aais.A(parcel, 40, this.M);
        aais.A(parcel, 41, this.N);
        aais.A(parcel, 42, this.O);
        aais.A(parcel, 43, this.P);
        aais.A(parcel, 44, this.Q);
        aais.A(parcel, 45, this.R);
        aais.z(parcel, 46, this.S, i);
        aais.A(parcel, 47, this.T);
        aais.D(parcel, 48, (android.os.Parcelable[]) this.U, i);
        aais.B(parcel, 49, this.V);
        aais.h(parcel, 50, this.W);
        aais.A(parcel, 51, this.X);
        aais.z(parcel, 52, this.Y, i);
        aais.z(parcel, 53, this.Z, i);
        aais.A(parcel, 54, this.aa);
        aais.h(parcel, 55, this.ab);
        aais.p(parcel, 56, this.ac);
        aais.E(parcel, 57, this.ad);
        aais.h(parcel, 58, this.ae);
        aais.z(parcel, 59, this.af, i);
        aais.A(parcel, 60, this.ag);
        aais.C(parcel, 61, this.ah);
        aais.l(parcel, 62, this.ai);
        aais.l(parcel, 63, this.aj);
        aais.B(parcel, 64, this.ak);
        aais.B(parcel, 65, this.al);
        aais.B(parcel, 66, this.am);
        aais.h(parcel, 67, this.an);
        aais.h(parcel, 68, this.ao);
        aais.A(parcel, 69, this.ap);
        aais.z(parcel, 70, this.aq, i);
        aais.D(parcel, 71, (android.os.Parcelable[]) this.ar, i);
        aais.A(parcel, 72, this.as);
        aais.g(parcel, iF);
    }

    public ErrorReport() {
        this.a = new android.app.ApplicationErrorReport();
    }

    public ErrorReport(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, java.io.File file) {
        this.a = new android.app.ApplicationErrorReport();
        if (feedbackOptions != null) {
            android.os.Bundle bundle = feedbackOptions.b;
            if (bundle != null && !bundle.isEmpty()) {
                this.D = feedbackOptions.b;
            }
            if (!android.text.TextUtils.isEmpty(feedbackOptions.a)) {
                this.B = feedbackOptions.a;
            }
            if (!android.text.TextUtils.isEmpty(feedbackOptions.c)) {
                this.b = feedbackOptions.c;
            }
            android.app.ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.d.crashInfo;
            if (crashInfo != null) {
                this.M = crashInfo.throwMethodName;
                this.K = crashInfo.throwLineNumber;
                this.L = crashInfo.throwClassName;
                this.N = crashInfo.stackTrace;
                this.I = crashInfo.exceptionClassName;
                this.O = crashInfo.exceptionMessage;
                this.J = crashInfo.throwFileName;
            }
            com.google.android.gms.feedback.ThemeSettings themeSettings = feedbackOptions.j;
            if (themeSettings != null) {
                this.Y = themeSettings;
            }
            if (!android.text.TextUtils.isEmpty(feedbackOptions.e)) {
                this.P = feedbackOptions.e;
            }
            java.lang.String str = feedbackOptions.g;
            if (!android.text.TextUtils.isEmpty(str)) {
                this.a.packageName = str;
            }
            if (!android.text.TextUtils.isEmpty(feedbackOptions.n)) {
                this.ag = feedbackOptions.n;
            }
            if (!android.text.TextUtils.isEmpty(feedbackOptions.t)) {
                this.as = feedbackOptions.t;
            }
            android.graphics.Bitmap bitmap = feedbackOptions.m;
            if (bitmap != null) {
                this.af = bitmap;
            }
            if (file != null) {
                this.S = feedbackOptions.f;
                java.util.List list = feedbackOptions.h;
                if (list != null && !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.feedback.FileTeleporter) it.next()).e = file;
                    }
                    this.U = (com.google.android.gms.feedback.FileTeleporter[]) list.toArray(new com.google.android.gms.feedback.FileTeleporter[0]);
                }
            }
            com.google.android.gms.feedback.LogOptions logOptions = feedbackOptions.k;
            if (logOptions != null) {
                this.Z = logOptions;
            }
            this.W = feedbackOptions.i;
            this.ae = feedbackOptions.l;
            this.E = feedbackOptions.o;
            this.an = feedbackOptions.q;
            this.ap = feedbackOptions.r;
            this.aq = feedbackOptions.s;
        }
    }
}
