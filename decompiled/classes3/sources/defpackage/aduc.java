package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aduc {
    public final java.lang.Long a;
    public final long b;

    public aduc(java.lang.Long l, long j) {
        this.a = l;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static defpackage.aduc a(long j) {
        ahvr.bM((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31));
        defpackage.adtu adtuVar = new defpackage.adtu();
        adtuVar.a = java.lang.Long.valueOf(j);
        adtuVar.b(android.os.SystemClock.uptimeMillis());
        return adtuVar.a();
    }

    public static defpackage.aduc b() {
        defpackage.adtu adtuVar = new defpackage.adtu();
        adtuVar.a = null;
        adtuVar.b(android.os.SystemClock.uptimeMillis());
        return adtuVar.a();
    }

    public final boolean c() {
        return this.a == null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aduc) {
            defpackage.aduc aducVar = (defpackage.aduc) obj;
            java.lang.Long l = this.a;
            if (l != null ? l.equals(aducVar.a) : aducVar.a == null) {
                if (this.b == aducVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + '}';
    }

    public aduc() {
        throw null;
    }
}
