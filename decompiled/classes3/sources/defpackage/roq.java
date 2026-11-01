package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class roq extends ttj {
    public final java.lang.String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roq(java.lang.String str) {
        super((byte[]) null, (byte[]) null);
        aooh.f(str, "input");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.roq) && aooh.n(this.a, ((defpackage.roq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SearchBarSearch(input=" + this.a + ')';
    }
}
