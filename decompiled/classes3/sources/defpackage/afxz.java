package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afxz extends defpackage.afxn {
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;

    public afxz(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968880, 2132086096);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167164);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167159);
        android.content.res.TypedArray typedArrayA = afvl.a(context, attributeSet, defpackage.afyu.b, 2130968880, 2132086096, new int[0]);
        this.q = typedArrayA.getInt(0, 0);
        this.r = java.lang.Math.max(agab.l(context, typedArrayA, 4, dimensionPixelSize), this.a << 1);
        this.s = agab.l(context, typedArrayA, 3, dimensionPixelSize2);
        this.t = typedArrayA.getInt(2, 0);
        this.u = typedArrayA.getBoolean(1, true);
        typedArrayA.recycle();
        b();
    }
}
