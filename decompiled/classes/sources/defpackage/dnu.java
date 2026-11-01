package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnu {
    public final defpackage.dji a;
    public final long b;
    public final defpackage.dky c;

    public dnu(defpackage.dji djiVar, long j) {
        this.a = djiVar;
        int length = djiVar.c.length();
        long j2 = defpackage.dky.a;
        int i = (int) (j >> 32);
        int i2 = i < 0 ? 0 : i;
        i2 = i2 > length ? length : i2;
        int i3 = (int) (4294967295L & j);
        int i4 = i3 >= 0 ? i3 : 0;
        length = i4 <= length ? i4 : length;
        this.b = (i2 == i && length == i3) ? j : defpackage.dfd.e(i2, length);
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dnu) {
            long j = this.b;
            defpackage.dnu dnuVar = (defpackage.dnu) obj;
            long j2 = dnuVar.b;
            long j3 = defpackage.dky.a;
            if (j == j2) {
                defpackage.dky dkyVar = dnuVar.c;
                if (defpackage.aooh.n(this.a, dnuVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = defpackage.dky.a;
        long j2 = this.b;
        return (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    public final java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.a) + "', selection=" + defpackage.dky.e(this.b) + ", composition=null)";
    }
}
