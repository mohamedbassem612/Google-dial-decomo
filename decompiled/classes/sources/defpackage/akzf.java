package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akzf {
    private static volatile int a = 100;
    public static final /* synthetic */ int i = 0;
    int d;
    int e;
    int f = a;
    public int g = Integer.MAX_VALUE;
    java.lang.Object h;

    public static defpackage.akzf J(java.io.InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? O(defpackage.alau.a, 0, 0) : new defpackage.akze(inputStream, i2);
        }
        throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
    }

    public static void L(byte[] bArr, int i2, int i3) {
        if ((bArr.length - i2) - i3 < 0 || (i2 | i3) < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    public static defpackage.akzf O(byte[] bArr, int i2, int i3) {
        defpackage.akzd akzdVar = new defpackage.akzd(bArr, i2, i3);
        try {
            akzdVar.f(i3);
            return akzdVar;
        } catch (defpackage.alaz e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public abstract void A(int i2);

    public abstract void B(int i2);

    public abstract void C(int i2);

    public abstract boolean D();

    public abstract boolean E();

    public abstract boolean F(int i2);

    public abstract byte[] G(int i2);

    public final void K() throws defpackage.alaz {
        if (this.d + this.e >= this.f) {
            throw new defpackage.alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void M() {
        if (this.e == 0) {
            A(0);
        }
    }

    public final void N() throws defpackage.alaz {
        boolean zF;
        do {
            int iN = n();
            if (iN == 0) {
                return;
            }
            K();
            this.e++;
            zF = F(iN);
            this.e--;
        } while (zF);
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e();

    public abstract int f(int i2);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p(byte[] bArr, int i2, int i3);

    public abstract long q();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract defpackage.akzc x();

    public abstract java.lang.String y();

    public abstract java.lang.String z();
}
