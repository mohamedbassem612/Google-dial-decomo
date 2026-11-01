package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqm {
    public final java.lang.String a;
    public final defpackage.jqj b;
    public final defpackage.jqi c;

    public jqm() {
        this("", new defpackage.jqj((byte[]) null), new defpackage.jqi((byte[]) null));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jqm) {
            defpackage.jqm jqmVar = (defpackage.jqm) obj;
            if (aooh.n(this.a, jqmVar.a) && aooh.n(this.b, jqmVar.b) && aooh.n(this.c, jqmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SipMessage(method=" + this.a + ", pAssertedIdentity=" + this.b + ", fromHeader=" + this.c + ')';
    }

    public jqm(java.lang.String str, defpackage.jqj jqjVar, defpackage.jqi jqiVar) {
        this.a = str;
        this.b = jqjVar;
        this.c = jqiVar;
    }
}
