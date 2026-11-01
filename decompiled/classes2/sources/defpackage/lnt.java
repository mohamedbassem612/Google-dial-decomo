package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnt {
    public final int a;
    public final java.util.List b;
    public final int c;

    public lnt(int i, java.util.List list, int i2) {
        aooh.f(list, "contactsEntries");
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lnt) {
            defpackage.lnt lntVar = (defpackage.lnt) obj;
            if (this.a == lntVar.a && aooh.n(this.b, lntVar.b) && this.c == lntVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "ContactsLoadResult(nextRowIndex=" + this.a + ", contactsEntries=" + this.b + ", totalEntrySize=" + this.c + ')';
    }
}
