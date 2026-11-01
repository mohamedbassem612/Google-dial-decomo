package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeii {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public aeii(defpackage.aeij aeijVar) {
        this.a = aeijVar.a;
        this.b = aeijVar.b;
        this.c = aeijVar.c;
        this.d = aeijVar.d;
        this.e = aeijVar.e;
        this.f = aeijVar.f;
        this.g = aeijVar.g;
        this.h = aeijVar.h;
    }

    private final int f(int i, int i2, int i3) {
        if (i >= i3) {
            return this.f;
        }
        return i >= i2 ? this.g : this.h;
    }

    private final int g(int i, int i2, int i3) {
        if (i >= i3) {
            return this.d;
        }
        return i >= i2 ? this.c : this.e;
    }

    public final int a(int i) {
        return ((i - (e(i) << 1)) - (f(i, b(this.a), b(this.b)) << 1)) - 2;
    }

    public final int b(int i) {
        int iD = d(i) << 1;
        return i + iD + (c(i) << 1) + 2;
    }

    public final int c(int i) {
        return f(i, this.a, this.b);
    }

    public final int d(int i) {
        return g(i, this.a, this.b);
    }

    public final int e(int i) {
        return g(i, b(this.a), b(this.b));
    }
}
