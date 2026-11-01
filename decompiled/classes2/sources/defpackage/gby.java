package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gby extends dzn {
    public final int a;
    public final int b;
    public final int c;

    public gby(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gby) {
            defpackage.gby gbyVar = (defpackage.gby) obj;
            if (this.a == gbyVar.a && this.b == gbyVar.b && this.c == gbyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b + this.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.a;
        sb.append(i);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |)\n                    |");
        return aoov.n(sb.toString());
    }
}
