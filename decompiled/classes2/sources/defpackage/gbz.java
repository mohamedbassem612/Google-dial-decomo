package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gbz extends dzn {
    public final java.util.List a;
    public final int b;
    public final int c;

    public gbz(java.util.List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gbz) {
            defpackage.gbz gbzVar = (defpackage.gbz) obj;
            if (aooh.n(this.a, gbzVar.a) && this.b == gbzVar.b && this.c == gbzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b + this.c;
    }

    public final java.lang.String toString() {
        java.util.List list = this.a;
        return aoov.n("PagingDataEvent.Prepend loaded " + list.size() + " items (\n                    |   first item: " + ajsz.bG(list) + "\n                    |   last item: " + ajsz.bJ(list) + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |");
    }
}
