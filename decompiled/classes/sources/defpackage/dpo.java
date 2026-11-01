package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpo {
    public static final defpackage.dpo a = new defpackage.dpo(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dpo(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        int iB = b() / 2;
        int iA = a() / 2;
        return (((long) (this.b + iB)) << 32) | (((long) (this.c + iA)) & 4294967295L);
    }

    public final long d() {
        return (((long) this.b) << 32) | (((long) this.c) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dpo) {
            defpackage.dpo dpoVar = (defpackage.dpo) obj;
            if (this.b == dpoVar.b && this.c == dpoVar.c && this.d == dpoVar.d && this.e == dpoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}
