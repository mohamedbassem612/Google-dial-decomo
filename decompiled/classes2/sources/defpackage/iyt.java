package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyt implements ahth {
    public final java.lang.String a;

    public iyt(java.lang.String str) {
        aooh.f(str, "greetingId");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iyt) && aooh.n(this.a, ((defpackage.iyt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "GreetingDeleteConfirmedEvent(greetingId=" + this.a + ')';
    }
}
