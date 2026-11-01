package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apxs {
    public static final /* synthetic */ int e = 0;
    private static volatile int f = 100;
    int a;
    int b;
    final int c = f;
    public java.lang.Object d;

    public abstract boolean A();

    public abstract boolean B();

    public abstract boolean C(int i);

    public final void F() throws defpackage.apym {
        if (this.a + this.b >= this.c) {
            throw new defpackage.apym("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void G() {
        if (this.b == 0) {
            x(0);
        }
    }

    public final void H() throws defpackage.apym {
        boolean zC;
        do {
            int iM = m();
            if (iM == 0) {
                return;
            }
            F();
            this.b++;
            zC = C(iM);
            this.b--;
        } while (zC);
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract java.lang.String u();

    public abstract java.lang.String v();

    public abstract defpackage.apxo w();

    public abstract void x(int i);

    public abstract void y(int i);
}
