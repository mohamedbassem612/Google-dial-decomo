package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oza implements ahth {
    public final java.lang.String a;

    public oza(java.lang.String str) {
        aooh.f(str, "callId");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.oza) && aooh.n(this.a, ((defpackage.oza) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AcceptEvent(callId=" + this.a + ')';
    }
}
