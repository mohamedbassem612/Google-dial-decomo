package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afve {
    public boolean e;
    public defpackage.aprf g;
    private java.lang.CharSequence h;
    private final android.text.TextPaint i;
    private final int j;
    private int k;
    public android.text.Layout.Alignment a = android.text.Layout.Alignment.ALIGN_NORMAL;
    public int b = Integer.MAX_VALUE;
    private float l = 0.0f;
    private float m = 1.0f;
    public int c = 1;
    public boolean d = true;
    public android.text.TextUtils.TruncateAt f = null;

    public afve(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.h = charSequence;
        this.i = textPaint;
        this.j = i;
        this.k = charSequence.length();
    }

    public final android.text.StaticLayout a() {
        if (this.h == null) {
            this.h = "";
        }
        int iMax = java.lang.Math.max(0, this.j);
        java.lang.CharSequence charSequenceEllipsize = this.h;
        if (this.b == 1) {
            charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, this.i, iMax, this.f);
        }
        this.k = java.lang.Math.min(charSequenceEllipsize.length(), this.k);
        if (this.e && this.b == 1) {
            this.a = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequenceEllipsize, 0, this.k, this.i, iMax);
        builderObtain.setAlignment(this.a);
        builderObtain.setIncludePad(this.d);
        builderObtain.setTextDirection(this.e ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR);
        android.text.TextUtils.TruncateAt truncateAt = this.f;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.b);
        float f = this.l;
        if (f != 0.0f || this.m != 1.0f) {
            builderObtain.setLineSpacing(f, this.m);
        }
        if (this.b > 1) {
            builderObtain.setHyphenationFrequency(this.c);
        }
        defpackage.aprf aprfVar = this.g;
        if (aprfVar != null) {
            builderObtain.setBreakStrategy(((com.google.android.material.textfield.TextInputLayout) aprfVar.a).k.getBreakStrategy());
        }
        return builderObtain.build();
    }

    public final void b(float f, float f2) {
        this.l = f;
        this.m = f2;
    }
}
