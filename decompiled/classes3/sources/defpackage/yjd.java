package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yjd implements java.lang.Cloneable {
    public defpackage.yhw a;
    public boolean b;
    public boolean c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public defpackage.ygv f;
    public defpackage.ygv g;
    public boolean h;
    public boolean i;

    public yjd(defpackage.yjh yjhVar) {
        j$.util.Objects.requireNonNull(yjhVar);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(android.graphics.Paint.Style.FILL);
        this.d.setTypeface(android.graphics.Typeface.DEFAULT);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(android.graphics.Paint.Style.STROKE);
        this.e.setTypeface(android.graphics.Typeface.DEFAULT);
        this.a = defpackage.yhw.a();
    }

    protected final java.lang.Object clone() {
        try {
            defpackage.yjd yjdVar = (defpackage.yjd) super.clone();
            yjdVar.a = (defpackage.yhw) this.a.clone();
            yjdVar.d = new android.graphics.Paint(this.d);
            yjdVar.e = new android.graphics.Paint(this.e);
            return yjdVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.InternalError(e.toString());
        }
    }
}
