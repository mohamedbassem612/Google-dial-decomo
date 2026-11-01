package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akvp {
    private final java.lang.String a;

    public akvp(double d, double d2) {
        double dMin = java.lang.Math.min(java.lang.Math.max(d, -90.0d), 90.0d);
        d2 = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 % 360.0d) + 360.0d) + 180.0d) % 360.0d) - 180.0d : d2;
        dMin = dMin == 90.0d ? dMin - (java.lang.Math.pow(20.0d, -3.0d) * 0.9d) : dMin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        double dRound = java.lang.Math.round((dMin + 90.0d) * 2.5E7d * 1000000.0d);
        long jRound = (long) (((long) (java.lang.Math.round(((d2 + 180.0d) * 8192000.0d) * 1000000.0d) / 1000000.0d)) / 1024.0d);
        long j = (long) (((long) (dRound / 1000000.0d)) / 3125.0d);
        int i = 0;
        while (i < 5) {
            sb.append("23456789CFGHJMPQRVWX".charAt((int) (jRound % 20)));
            sb.append("23456789CFGHJMPQRVWX".charAt((int) (j % 20)));
            j /= 20;
            jRound /= 20;
            if (i == 0) {
                sb.append('+');
                i = 0;
            }
            i++;
        }
        this.a = sb.reverse().subSequence(0, 11).toString();
    }

    public static java.lang.String a(double d, double d2) {
        return new defpackage.akvp(d, d2).a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j$.util.Objects.equals(this.a, ((defpackage.akvp) obj).a);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
