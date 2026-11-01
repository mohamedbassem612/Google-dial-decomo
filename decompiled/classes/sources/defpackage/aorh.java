package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorh implements java.lang.Comparable {
    public static final long a = defpackage.aooh.z(4611686018427387903L);
    public static final long b = defpackage.aooh.z(-4611686018427387903L);
    public static final long c = 9223372036854759646L;

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return defpackage.aooh.b(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return o(j) ? -i : i;
    }

    public static final int b(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (h(j) % 60);
    }

    public static final int c(long j) {
        if (n(j)) {
            return 0;
        }
        long j2 = j >> 1;
        return (int) ((((int) j) & 1) == 1 ? (j2 % 1000) * 1000000 : j2 % 1000000000);
    }

    public static final int d(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (i(j) % 60);
    }

    public static final long e(long j) {
        return o(j) ? l(j) : j;
    }

    public static final long f(long j) {
        return k(j, defpackage.aorj.HOURS);
    }

    public static final long g(long j) {
        return ((((int) j) & 1) != 1 || n(j)) ? k(j, defpackage.aorj.MILLISECONDS) : j >> 1;
    }

    public static final long h(long j) {
        return k(j, defpackage.aorj.MINUTES);
    }

    public static final long i(long j) {
        return k(j, defpackage.aorj.SECONDS);
    }

    public static final long j(long j, long j2) {
        long j3;
        int i = ((int) j) & 1;
        long j4 = j2 >> 1;
        long j5 = j >> 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? q(j5, j4) : q(j4, j5);
        }
        if (i != 0) {
            long jY = defpackage.aooh.y(j5, j4);
            if (jY == 9223372036854759646L) {
                throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            if (jY != 4611686018427387903L) {
                if (jY == -4611686018427387903L) {
                    jY = -4611686018427387903L;
                } else {
                    if (jY < -4611686018426L || jY >= 4611686018427L) {
                        long jY2 = defpackage.aooc.y(jY, -4611686018427387903L, 4611686018427387903L) << 1;
                        int i2 = defpackage.aori.a;
                        return jY2 + 1;
                    }
                    int i3 = defpackage.aori.a;
                    j3 = jY * 1000000;
                }
            }
            long j6 = (jY << 1) + 1;
            int i4 = defpackage.aori.a;
            return j6;
        }
        j3 = j5 + j4;
        if (j3 < -4611686018426999999L || j3 >= 4611686018427000000L) {
            long j7 = ((j3 / 1000000) << 1) + 1;
            int i5 = defpackage.aori.a;
            return j7;
        }
        int i6 = defpackage.aori.a;
        return j3 << 1;
    }

    public static final long k(long j, defpackage.aorj aorjVar) {
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return aorjVar.h.convert(j >> 1, ((((int) j) & 1) == 0 ? defpackage.aorj.NANOSECONDS : defpackage.aorj.MILLISECONDS).h);
    }

    public static final long l(long j) {
        int i = defpackage.aori.a;
        return ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
    }

    public static java.lang.String m(long j) {
        boolean z;
        int i;
        int i2;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean zO = o(j);
        if (zO) {
            sb.append('-');
        }
        long jE = e(j);
        long jK = k(jE, defpackage.aorj.DAYS);
        int iF = n(jE) ? 0 : (int) (f(jE) % 24);
        int iB = b(jE);
        int iD = d(jE);
        int iC = c(jE);
        boolean z2 = jK != 0;
        boolean z3 = iF != 0;
        boolean z4 = iB != 0;
        if (iD != 0) {
            z = true;
        } else if (iC != 0) {
            z = true;
            iD = 0;
        } else {
            iC = 0;
            iD = 0;
            z = false;
        }
        if (z2) {
            sb.append(jK);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iB);
            sb.append('m');
            i = i4;
        }
        if (z) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iD == 0) {
                if (z2 || z3 || z4) {
                    i2 = 0;
                } else if (iC >= 1000000) {
                    p(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
                } else if (iC >= 1000) {
                    p(sb, iC / 1000, iC % 1000, 3, "us", false);
                } else {
                    sb.append(iC);
                    sb.append("ns");
                }
                i = i5;
            } else {
                i2 = iD;
            }
            p(sb, i2, iC, 9, "s", false);
            i = i5;
        }
        if (zO && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final boolean n(long j) {
        return j == a || j == b;
    }

    public static final boolean o(long j) {
        return j < 0;
    }

    public static final void p(java.lang.StringBuilder sb, int i, int i2, int i3, java.lang.String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            java.lang.String strO = defpackage.aoov.O(java.lang.String.valueOf(i2), i3);
            int i4 = -1;
            int length = strO.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strO.charAt(length) == '0') {
                        if (i5 < 0) {
                            break;
                        } else {
                            length = i5;
                        }
                    } else {
                        i4 = length;
                        break;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((java.lang.CharSequence) strO, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((java.lang.CharSequence) strO, 0, i6);
            }
        }
        sb.append(str);
    }

    private static final long q(long j, long j2) {
        long j3 = j2 / 1000000;
        long jY = defpackage.aooh.y(j, j3);
        if (jY < -4611686018426L || jY >= 4611686018427L) {
            return defpackage.aooh.z(jY);
        }
        long j4 = jY * 1000000;
        int i = defpackage.aori.a;
        return (j4 + (j2 - (j3 * 1000000))) << 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
