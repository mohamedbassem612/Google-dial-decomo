package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynw extends defpackage.ynz {
    private final long a;

    public ynw(long j) {
        this.a = j;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 6 && this.a == yoaVar.f();
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final long f() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) ((j >>> 32) ^ j);
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{longValue=" + this.a + '}';
    }
}
