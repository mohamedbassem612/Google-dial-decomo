package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgh implements ahth {
    public final java.lang.String a;
    private final java.lang.String b;

    public pgh(java.lang.String str) {
        aooh.f(str, "key");
        this.b = str;
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.pgh) && aooh.n(this.b, ((defpackage.pgh) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ButtonClickedEvent(key=" + this.b + ')';
    }
}
