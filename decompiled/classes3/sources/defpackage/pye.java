package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pye extends defpackage.pys {
    private final char a;

    public pye(char c) {
        this.a = c;
    }

    @Override // defpackage.pys
    public final char a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.pys) && this.a == ((defpackage.pys) obj).a();
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ 16963;
    }

    public final java.lang.String toString() {
        return "DialpadKeyClickedEvent{dialpadKey=" + this.a + '}';
    }
}
