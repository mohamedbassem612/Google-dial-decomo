package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class aiuc extends aiue {
    final int a;
    final j$.time.Duration b;
    final double c;

    public aiuc(j$.time.Duration duration, double d, int i) {
        ahvr.bV(true, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
        int i2 = aizo.a;
        ahvr.bR((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be positive", duration);
        this.b = duration;
        ahvr.bW(d > 0.0d, "%s (%s) must be > 0", "multiplier", java.lang.Double.valueOf(d));
        this.c = d;
    }

    public final j$.time.Duration a(int i) {
        if (i == 0) {
            return j$.time.Duration.ZERO;
        }
        return !b(i) ? aiue.d : j$.time.Duration.ofNanos((long) (aizo.b(this.b) * java.lang.Math.pow(this.c, i - 1)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean b(int i) {
        ahvr.bV((boolean) ((i ^ (-1)) >>> 31), "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aiuc)) {
            return false;
        }
        defpackage.aiuc aiucVar = (defpackage.aiuc) obj;
        return this.b.equals(aiucVar.b) && this.c == aiucVar.c && this.a == aiucVar.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, java.lang.Double.valueOf(this.c)});
    }
}
