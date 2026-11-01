package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfd implements defpackage.tfh {
    public final boolean a;

    public tfd(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tfd) && this.a == ((defpackage.tfd) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "OpenHistory(isEnabled=" + this.a + ')';
    }

    public tfd() {
        this(true);
    }
}
