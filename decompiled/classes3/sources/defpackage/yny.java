package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yny extends defpackage.ynz {
    private final java.lang.String a;

    public yny(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 1 && this.a.equals(yoaVar.h());
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final java.lang.String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{stringValue=" + this.a + '}';
    }
}
