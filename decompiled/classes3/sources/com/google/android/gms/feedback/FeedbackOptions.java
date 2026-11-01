package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FeedbackOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalv();
    public java.lang.String a;
    public android.os.Bundle b;
    public java.lang.String c;
    public final android.app.ApplicationErrorReport d;
    public java.lang.String e;
    public com.google.android.gms.common.data.BitmapTeleporter f;
    public final java.lang.String g;
    public java.util.List h;
    public boolean i;
    public com.google.android.gms.feedback.ThemeSettings j;
    public com.google.android.gms.feedback.LogOptions k;
    public boolean l;
    public android.graphics.Bitmap m;
    public java.lang.String n;
    public boolean o;
    public long p;
    public boolean q;
    public java.lang.String r;
    public com.google.android.gms.feedback.AdditionalConsentConfig s;
    public java.lang.String t;
    public aaoo u;

    public FeedbackOptions(java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.app.ApplicationErrorReport applicationErrorReport, java.lang.String str3, com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter, java.lang.String str4, java.util.List list, boolean z, com.google.android.gms.feedback.ThemeSettings themeSettings, com.google.android.gms.feedback.LogOptions logOptions, boolean z2, android.graphics.Bitmap bitmap, java.lang.String str5, boolean z3, long j, boolean z4, java.lang.String str6, com.google.android.gms.feedback.AdditionalConsentConfig additionalConsentConfig, java.lang.String str7) {
        this.a = str;
        this.b = bundle == null ? new android.os.Bundle() : bundle;
        this.c = str2;
        this.d = applicationErrorReport == null ? new android.app.ApplicationErrorReport() : applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list == null ? new java.util.ArrayList() : list;
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
        this.r = str6;
        this.s = additionalConsentConfig;
        this.t = str7;
    }

    public static com.google.android.gms.feedback.FeedbackOptions a(java.util.List list) {
        com.google.android.gms.feedback.FeedbackOptions feedbackOptions = new com.google.android.gms.feedback.FeedbackOptions(null, null, null, new android.app.ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
        if (list != null) {
            feedbackOptions.h = list;
        }
        return feedbackOptions;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aalv.a(this, parcel, i);
    }
}
