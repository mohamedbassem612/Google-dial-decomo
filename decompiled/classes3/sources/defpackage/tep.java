package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tep {
    public final defpackage.teo a;
    public final aopu b;
    public final aopu c;

    public tep(defpackage.teo teoVar, aopu aopuVar, aopu aopuVar2) {
        aooh.f(teoVar, "id");
        this.a = teoVar;
        this.b = aopuVar;
        this.c = aopuVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tep) {
            defpackage.tep tepVar = (defpackage.tep) obj;
            if (this.a == tepVar.a && aooh.n(this.b, tepVar.b) && aooh.n(this.c, tepVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "Key(id=" + this.a + ", businessModelType=" + this.b + ", uiModelType=" + this.c + ')';
    }
}
