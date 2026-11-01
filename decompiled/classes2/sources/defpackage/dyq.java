package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dyq {
    private final defpackage.dyp a;

    private dyq(java.lang.String str, int i, int i2) {
        this.a = new defpackage.dyp(str, i, i2);
    }

    public static defpackage.dyq a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        java.lang.String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            string = "M0," + i8 + " A" + i7 + ',' + i8 + " 0 1,1 " + i + ',' + i8 + " A" + i7 + ',' + i8 + " 0 1,1 0," + i8 + " Z";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("M ");
            int iMin = java.lang.Math.min(i / 2, i2 / 2);
            int iMin2 = java.lang.Math.min(iMin, i3);
            int iMin3 = java.lang.Math.min(iMin, i4);
            int iMin4 = java.lang.Math.min(iMin, i5);
            int iMin5 = java.lang.Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(',');
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i);
                sb.append(',');
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(',');
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(',');
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(',');
                sb.append(i2);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(',');
            sb.append(i2);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(',');
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(',');
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new defpackage.dyq(string, i, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dyq) {
            return j$.util.Objects.equals(this.a, ((defpackage.dyq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
