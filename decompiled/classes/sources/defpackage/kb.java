package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class kb {
    protected final defpackage.kp a;
    public int b = Integer.MIN_VALUE;
    final android.graphics.Rect c = new android.graphics.Rect();

    public kb(defpackage.kp kpVar) {
        this.a = kpVar;
    }

    public static defpackage.kb p(defpackage.kp kpVar, int i) {
        return i != 0 ? new defpackage.ka(kpVar) : new jz(kpVar);
    }

    public abstract int a(android.view.View view);

    public abstract int b(android.view.View view);

    public abstract int c(android.view.View view);

    public abstract int d(android.view.View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(android.view.View view);

    public abstract int m(android.view.View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
