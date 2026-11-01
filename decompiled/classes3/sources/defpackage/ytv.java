package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytv implements ytw {
    private final defpackage.ytt a;

    public ytv(defpackage.ytt yttVar) {
        this.a = yttVar;
    }

    public final defpackage.ytt a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ytv) && this.a == ((defpackage.ytv) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SimpleFailed(reason=" + this.a + ')';
    }
}
