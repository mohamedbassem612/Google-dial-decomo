package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yev implements defpackage.yfa {
    private final int a;
    private final int b;
    private defpackage.yek c;

    public yev(int i, int i2) {
        if (!defpackage.ygc.l(i, i2)) {
            throw new java.lang.IllegalArgumentException(a.bf(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.yfa
    public final defpackage.yek f() {
        return this.c;
    }

    @Override // defpackage.yfa
    public final void g(defpackage.yez yezVar) {
        yezVar.g(this.a, this.b);
    }

    @Override // defpackage.yfa
    public final void m(defpackage.yek yekVar) {
        this.c = yekVar;
    }

    @Override // defpackage.ydm
    public final void i() {
    }

    @Override // defpackage.ydm
    public final void j() {
    }

    @Override // defpackage.ydm
    public final void k() {
    }

    @Override // defpackage.yfa
    public void a(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.yfa
    public final void h(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.yfa
    public final void l(defpackage.yez yezVar) {
    }
}
