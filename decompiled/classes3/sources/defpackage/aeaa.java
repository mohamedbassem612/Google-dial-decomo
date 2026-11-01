package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeaa {
    public final akrj a;
    public final defpackage.akrl b;
    public final java.util.Map c;

    public aeaa(akrj akrjVar, defpackage.akrl akrlVar, java.util.Map map) {
        aooh.f(akrjVar, "request");
        aooh.f(akrlVar, "response");
        aooh.f(map, "authResultPerUser");
        this.a = akrjVar;
        this.b = akrlVar;
        this.c = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeaa) {
            defpackage.aeaa aeaaVar = (defpackage.aeaa) obj;
            if (aooh.n(this.a, aeaaVar.a) && aooh.n(this.b, aeaaVar.b) && aooh.n(this.c, aeaaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiLoginUpdateRequestAndResponse(request=" + this.a + ", response=" + this.b + ", authResultPerUser=" + this.c + ')';
    }
}
