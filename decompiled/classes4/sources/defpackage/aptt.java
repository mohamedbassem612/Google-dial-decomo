package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptt {
    public final int a;
    public int b;
    private final int c;

    public aptt(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new java.lang.IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.c = i;
        this.a = i2;
        this.b = i;
    }

    public final void a(int i) {
        int i2 = this.c;
        if (i < i2) {
            throw new java.lang.IndexOutOfBoundsException(a.bf(i2, i, "pos: ", " < lowerBound: "));
        }
        int i3 = this.a;
        if (i > i3) {
            throw new java.lang.IndexOutOfBoundsException(a.bf(i3, i, "pos: ", " > upperBound: "));
        }
        this.b = i;
    }

    public final boolean b() {
        return this.b >= this.a;
    }

    public final java.lang.String toString() {
        return "[" + java.lang.Integer.toString(this.c) + '>' + java.lang.Integer.toString(this.b) + '>' + java.lang.Integer.toString(this.a) + ']';
    }
}
