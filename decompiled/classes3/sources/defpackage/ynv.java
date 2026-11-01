package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynv extends defpackage.ynz {
    private final aify a;

    public ynv(aify aifyVar) {
        this.a = aifyVar;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 5;
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final aify e() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 5 && ahvr.aP(this.a, yoaVar.e());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{listValue=" + java.lang.String.valueOf(this.a) + '}';
    }
}
