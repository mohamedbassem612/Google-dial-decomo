package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokg {
    public final int a;
    public final java.lang.Object b;

    public aokg(int i, java.lang.Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aokg) {
            defpackage.aokg aokgVar = (defpackage.aokg) obj;
            if (this.a == aokgVar.a && defpackage.aooh.n(this.b, aokgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
