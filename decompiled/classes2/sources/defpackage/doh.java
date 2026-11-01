package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class doh implements android.text.style.LeadingMarginSpan {
    public final crd a;
    public final dpf b;
    private final float c;
    private final float d;
    private final int e;
    private final int f;
    private final den g;

    public doh(crd crdVar, float f, float f2, float f3, den denVar, dpf dpfVar, float f4) {
        this.a = crdVar;
        this.c = f;
        this.d = f2;
        this.g = denVar;
        this.b = dpfVar;
        int i = aopc.i(f + f3);
        this.e = i;
        this.f = aopc.i(f4) - i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final android.graphics.Canvas canvas, final android.graphics.Paint paint, int i, final int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) throws aois {
        if (canvas != null) {
            int i8 = i3 + i5;
            int i9 = i - this.e;
            aooh.d(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            if (((android.text.Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
                return;
            }
            den denVar = this.g;
            android.graphics.Paint.Style style = paint.getStyle();
            if (!aooh.n(denVar, csl.a)) {
                throw new aois();
            }
            float f = i8;
            final int iT = aooc.t(i9, 0);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            float f2 = this.c;
            final long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(this.d)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f2) << 32);
            final float f3 = f / 2.0f;
            new aomy() { // from class: dog
                public final java.lang.Object a() {
                    int i10 = i2;
                    dpq dpqVar = i10 > 0 ? dpq.a : dpq.b;
                    defpackage.doh dohVar = this.a;
                    float f4 = f3;
                    int i11 = iT;
                    android.graphics.Paint paint2 = paint;
                    android.graphics.Canvas canvas2 = canvas;
                    cpo cpoVar = dohVar.a.a(jFloatToRawIntBits, dpqVar, dohVar.b).a;
                    float f5 = i11;
                    if (cdh.u(cpoVar)) {
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpoVar.e >> 32));
                        canvas2.drawRoundRect(f5, f4 - (cpoVar.a() / 2.0f), f5 + (i10 * cpoVar.b()), f4 + (cpoVar.a() / 2.0f), fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        cpx cpxVar = new cpx((byte[]) null);
                        cpxVar.q(cpoVar, 1);
                        canvas2.save();
                        canvas2.translate(f5, f4 - (cpoVar.a() / 2.0f));
                        canvas2.drawPath(cpxVar.a, paint2);
                        canvas2.restore();
                    }
                    return aojh.a;
                }
            }.a();
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.f;
        if (i >= 0) {
            return 0;
        }
        return java.lang.Math.abs(i);
    }
}
