package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oze implements ahth {
    public final java.lang.String a;

    public oze(java.lang.String str) {
        aooh.f(str, "callId");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.oze) && aooh.n(this.a, ((defpackage.oze) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RejectEvent(callId=" + this.a + ')';
    }
}
