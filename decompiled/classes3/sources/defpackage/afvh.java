package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afvh {
    public float b;
    public java.lang.ref.WeakReference d;
    public defpackage.afza e;
    private float g;
    public final android.text.TextPaint a = new android.text.TextPaint(1);
    private final defpackage.afzb f = new defpackage.afvf(this);
    public boolean c = true;

    public afvh(afvg afvgVar) {
        this.d = new java.lang.ref.WeakReference(null);
        this.d = new java.lang.ref.WeakReference(afvgVar);
    }

    public final float a(java.lang.String str) {
        if (this.c) {
            b(str);
        }
        return this.g;
    }

    public final void b(java.lang.String str) {
        this.g = str == null ? 0.0f : this.a.measureText((java.lang.CharSequence) str, 0, str.length());
        this.b = str != null ? java.lang.Math.abs(this.a.getFontMetrics().ascent) : 0.0f;
        this.c = false;
    }

    public final void c(defpackage.afza afzaVar, android.content.Context context) {
        if (this.e != afzaVar) {
            this.e = afzaVar;
            if (afzaVar != null) {
                android.text.TextPaint textPaint = this.a;
                defpackage.afzb afzbVar = this.f;
                afzaVar.d(context, textPaint, afzbVar);
                afvg afvgVar = (afvg) this.d.get();
                if (afvgVar != null) {
                    textPaint.drawableState = afvgVar.getState();
                }
                afzaVar.c(context, textPaint, afzbVar);
                this.c = true;
            }
            afvg afvgVar2 = (afvg) this.d.get();
            if (afvgVar2 != null) {
                afvgVar2.h();
                afvgVar2.onStateChange(afvgVar2.getState());
            }
        }
    }

    public final void d(android.content.Context context) {
        this.e.c(context, this.a, this.f);
    }

    public final void f() {
        this.c = true;
    }

    public final void g() {
        this.c = true;
    }
}
