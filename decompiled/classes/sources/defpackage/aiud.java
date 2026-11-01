package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aiud extends defpackage.aiue {
    final int a;

    public aiud(int i) {
        defpackage.ahvr.bV(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
    }

    @Override // defpackage.aiue
    public final j$.time.Duration a(int i) {
        return b(i) ? j$.time.Duration.ZERO : defpackage.aiue.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // defpackage.aiue
    public final boolean b(int i) {
        defpackage.ahvr.bV((i ^ (-1)) >>> 31, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aiud) && this.a == ((defpackage.aiud) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
