package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcv implements ahth {
    public final defpackage.qug a;
    private final defpackage.qug b;

    public rcv(defpackage.qug qugVar) {
        aooh.f(qugVar, "key");
        this.b = qugVar;
        this.a = qugVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rcv) && this.b == ((defpackage.rcv) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VoiceButtonClickedEvent(key=" + this.b + ')';
    }
}
