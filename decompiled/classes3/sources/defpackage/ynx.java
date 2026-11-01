package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynx extends defpackage.ynz {
    private final aigf a;

    public ynx(aigf aigfVar) {
        this.a = aigfVar;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 7 && this.a.equals(yoaVar.g());
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final aigf g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{mapValue=" + java.lang.String.valueOf(this.a) + '}';
    }
}
