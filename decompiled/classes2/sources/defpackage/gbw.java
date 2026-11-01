package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gbw extends dzn {
    public final int a;
    public final java.util.List b;
    public final int c;
    public final int d;

    public gbw(int i, java.util.List list, int i2, int i3) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gbw) {
            defpackage.gbw gbwVar = (defpackage.gbw) obj;
            if (this.a == gbwVar.a && aooh.n(this.b, gbwVar.b) && this.c == gbwVar.c && this.d == gbwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b.hashCode() + this.c + this.d;
    }

    public final java.lang.String toString() {
        java.util.List list = this.b;
        return aoov.n("PagingDataEvent.Append loaded " + list.size() + " items (\n                    |   startIndex: " + this.a + "\n                    |   first item: " + ajsz.bG(list) + "\n                    |   last item: " + ajsz.bJ(list) + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |");
    }
}
