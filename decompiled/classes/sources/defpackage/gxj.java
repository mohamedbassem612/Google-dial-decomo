package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxj {
    public final java.lang.String a;
    public final defpackage.gsw b;

    public gxj(java.lang.String str, defpackage.gsw gswVar) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        this.a = str;
        this.b = gswVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gxj) {
            defpackage.gxj gxjVar = (defpackage.gxj) obj;
            if (defpackage.aooh.n(this.a, gxjVar.a) && this.b == gxjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
