package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynu extends defpackage.ynz {
    private final int a;

    public ynu(int i) {
        this.a = i;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 3;
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final int d() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 3 && this.a == yoaVar.d();
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{intValue=" + this.a + '}';
    }
}
