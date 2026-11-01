package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizh implements java.io.Serializable {
    public static final defpackage.aizh a = new defpackage.aizh(new int[0]);
    private static final long serialVersionUID = -7031592199741285664L;
    public final int[] b;
    public final int c;

    public aizh(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static defpackage.aizg b(int i) {
        ahvr.bP((boolean) ((i ^ (-1)) >>> 31), "Invalid initialCapacity: %s", i);
        return new defpackage.aizg(i);
    }

    public static defpackage.aizh c(java.util.Collection collection) {
        return collection.isEmpty() ? a : new defpackage.aizh(aiql.W(collection));
    }

    public static defpackage.aizh f(int... iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[0] = 0;
        java.lang.System.arraycopy(iArr, 0, iArr2, 1, length);
        return new defpackage.aizh(iArr2);
    }

    public final int a(int i) {
        ahvr.ch(i, this.c);
        return this.b[i];
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final int[] e() {
        return java.util.Arrays.copyOfRange(this.b, 0, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aizh) {
            defpackage.aizh aizhVar = (defpackage.aizh) obj;
            int i = this.c;
            if (i == aizhVar.c) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (a(i2) == aizhVar.a(i2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    java.lang.Object readResolve() {
        return d() ? a : this;
    }

    public final java.lang.String toString() {
        if (d()) {
            return "[]";
        }
        int i = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.b;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    java.lang.Object writeReplace() {
        return this.c < this.b.length ? new defpackage.aizh(e()) : this;
    }

    public aizh(int[] iArr) {
        this(iArr, iArr.length);
    }
}
