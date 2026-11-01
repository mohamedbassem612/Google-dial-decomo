package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dli {
    public final java.lang.CharSequence a;
    public final int b;
    public final android.text.TextPaint c;
    public final int d;
    public final android.text.TextDirectionHeuristic e;
    public final android.text.Layout.Alignment f;
    public final int g;
    public final android.text.TextUtils.TruncateAt h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public dli(java.lang.CharSequence charSequence, int i, android.text.TextPaint textPaint, int i2, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i3, android.text.TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this.a = charSequence;
        this.b = i;
        this.c = textPaint;
        this.d = i2;
        this.e = textDirectionHeuristic;
        this.f = alignment;
        this.g = i3;
        this.h = truncateAt;
        this.i = i4;
        this.j = i5;
        this.k = z;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        if (i < 0) {
            dnv.b("invalid start value");
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            dnv.b("invalid end value");
        }
        if (i3 < 0) {
            dnv.b("invalid maxLines value");
        }
        if (i2 < 0) {
            dnv.b("invalid width value");
        }
        if (i4 < 0) {
            dnv.b("invalid ellipsizedWidth value");
        }
    }
}
