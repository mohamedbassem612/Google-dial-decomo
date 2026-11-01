package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djo {
    public final defpackage.djn a;
    public final int b;
    public final int c;

    static {
        long j = defpackage.djn.a;
    }

    public djo(defpackage.djn djnVar, int i, int i2) {
        this.a = djnVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.djo) {
            defpackage.djo djoVar = (defpackage.djo) obj;
            if (aooh.n(this.a, djoVar.a) && this.b == djoVar.b && this.c == djoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "BulletSpanWithLevel(bullet=" + this.a + ", indentationLevel=" + this.b + ", start=" + this.c + ')';
    }
}
