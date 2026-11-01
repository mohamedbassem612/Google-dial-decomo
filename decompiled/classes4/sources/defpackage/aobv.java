package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobv {
    final int a;
    final long b;
    final long c;
    final double d;
    final java.lang.Long e;
    final java.util.Set f;

    public aobv(int i, long j, long j2, double d, java.lang.Long l, java.util.Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = aihd.o(set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aobv)) {
            return false;
        }
        defpackage.aobv aobvVar = (defpackage.aobv) obj;
        return this.a == aobvVar.a && this.b == aobvVar.b && this.c == aobvVar.c && java.lang.Double.compare(this.d, aobvVar.d) == 0 && j$.util.Objects.equals(this.e, aobvVar.e) && j$.util.Objects.equals(this.f, aobvVar.f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c), java.lang.Double.valueOf(this.d), this.e, this.f});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.e("maxAttempts", this.a);
        ahymVarL.f("initialBackoffNanos", this.b);
        ahymVarL.f("maxBackoffNanos", this.c);
        ahymVarL.d("backoffMultiplier", this.d);
        ahymVarL.b("perAttemptRecvTimeoutNanos", this.e);
        ahymVarL.b("retryableStatusCodes", this.f);
        return ahymVarL.toString();
    }
}
