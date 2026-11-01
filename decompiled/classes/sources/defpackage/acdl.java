package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdl {
    public final defpackage.acba a;
    public final long b;
    private final java.lang.String c;
    private final abzu d;

    public acdl(defpackage.acba acbaVar, long j) {
        if (acbaVar == null) {
            defpackage.aooh.i("event");
        }
        this.a = acbaVar;
        this.c = null;
        this.b = j;
        this.d = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acdl) {
            defpackage.acdl acdlVar = (defpackage.acdl) obj;
            if (defpackage.aooh.n(this.a, acdlVar.a)) {
                java.lang.String str = acdlVar.c;
                if (defpackage.aooh.n(null, null) && this.b == acdlVar.b) {
                    abzu abzuVar = acdlVar.d;
                    if (defpackage.aooh.n(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + defpackage.anty.M(this.b)) * 31;
    }

    public final java.lang.String toString() {
        return "ProcessingContext(event=" + this.a + ", accountName=null, eventTimeMs=" + this.b + ", triggeringOptions=null)";
    }
}
