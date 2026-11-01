package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afyj {
    protected defpackage.afyk j;
    protected final java.util.List k = new java.util.ArrayList();

    protected afyj(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new defpackage.afyg());
        }
    }

    protected static final float h(int i, int i2, int i3) {
        return dzk.A((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(gls glsVar);

    public abstract void d();

    public abstract void f();

    public abstract void g();
}
