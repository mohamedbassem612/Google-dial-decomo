package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gbx extends dzn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gbx(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gbx) {
            defpackage.gbx gbxVar = (defpackage.gbx) obj;
            if (this.a == gbxVar.a && this.b == gbxVar.b && this.c == gbxVar.c && this.d == gbxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.b;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.a);
        sb.append("\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.d);
        sb.append("\n                    |)\n                    |");
        return aoov.n(sb.toString());
    }
}
