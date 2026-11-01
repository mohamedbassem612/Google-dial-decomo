package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o implements java.io.Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public o(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static j$.time.temporal.o f(long j, long j2) {
        if (j <= j2) {
            return new j$.time.temporal.o(j, j, j2, j2);
        }
        j$.time.g.b("Minimum value must be less than maximum value");
        return null;
    }

    public static j$.time.temporal.o g(long j, long j2, long j3) {
        if (j > 1) {
            j$.time.g.b("Smallest minimum value must be less than largest minimum value");
        } else if (j2 > j3) {
            j$.time.g.b("Smallest maximum value must be less than largest maximum value");
        } else {
            if (1 <= j3) {
                return new j$.time.temporal.o(j, 1L, j2, j3);
            }
            j$.time.g.b("Minimum value must be less than maximum value");
        }
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new java.io.InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new java.io.InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new java.io.InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j, j$.time.temporal.l lVar) {
        if (d() && e(j)) {
            return (int) j;
        }
        j$.time.g.h(c(j, lVar));
        return 0;
    }

    public final void b(long j, j$.time.temporal.l lVar) {
        if (e(j)) {
            return;
        }
        j$.time.g.h(c(j, lVar));
    }

    public final java.lang.String c(long j, j$.time.temporal.l lVar) {
        if (lVar == null) {
            return "Invalid value (valid values " + java.lang.String.valueOf(this) + "): " + j;
        }
        return "Invalid value for " + java.lang.String.valueOf(lVar) + " (valid values " + java.lang.String.valueOf(this) + "): " + j;
    }

    public final boolean d() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.a && j <= this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.temporal.o) {
            j$.time.temporal.o oVar = (j$.time.temporal.o) obj;
            if (this.a == oVar.a && this.b == oVar.b && this.c == oVar.c && this.d == oVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
