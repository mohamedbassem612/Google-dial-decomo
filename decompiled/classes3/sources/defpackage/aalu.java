package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aalu {
    public android.graphics.Bitmap a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public com.google.android.gms.feedback.ThemeSettings e;
    public com.google.android.gms.feedback.LogOptions f;
    private final android.os.Bundle g;
    private final java.util.List h;
    private boolean i;
    private java.lang.String j;
    private aaoo k;

    public aalu(android.content.Context context) {
        java.lang.String strM;
        defpackage.aayx.b(context);
        this.g = new android.os.Bundle();
        this.h = new java.util.ArrayList();
        new android.app.ApplicationErrorReport();
        try {
            if (((java.lang.Boolean) defpackage.aamd.a.a()).booleanValue()) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jAbs = java.lang.Math.abs(new java.security.SecureRandom().nextLong());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append('_');
                sb.append(jAbs);
                strM = sb.toString();
            } else {
                strM = aaoo.m();
            }
            this.j = strM;
        } catch (java.lang.SecurityException unused) {
            this.j = aaoo.m();
        }
    }

    public final com.google.android.gms.feedback.FeedbackOptions a() {
        com.google.android.gms.feedback.FeedbackOptions feedbackOptions = new com.google.android.gms.feedback.FeedbackOptions(null, null, null, new android.app.ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null, null);
        feedbackOptions.m = this.a;
        feedbackOptions.f = null;
        feedbackOptions.a = this.b;
        feedbackOptions.c = this.c;
        feedbackOptions.b = this.g;
        feedbackOptions.e = this.d;
        feedbackOptions.h = this.h;
        feedbackOptions.i = false;
        feedbackOptions.j = this.e;
        feedbackOptions.k = this.f;
        feedbackOptions.l = this.i;
        feedbackOptions.u = this.k;
        feedbackOptions.n = this.j;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = null;
        feedbackOptions.s = null;
        feedbackOptions.t = null;
        return feedbackOptions;
    }

    public final void b(aaoo aaooVar, boolean z) {
        if ((!this.g.isEmpty() || !this.h.isEmpty()) && this.i != z) {
            throw new java.lang.IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.i = z;
        this.k = aaooVar;
    }
}
