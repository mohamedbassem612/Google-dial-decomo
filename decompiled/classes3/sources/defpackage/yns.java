package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yns extends defpackage.ynz {
    private final boolean a;

    public yns(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 2 && this.a == yoaVar.a();
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{boolValue=" + this.a + '}';
    }
}
