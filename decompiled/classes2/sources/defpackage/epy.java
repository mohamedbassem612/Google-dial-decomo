package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epy {
    public static final defpackage.epy a = new defpackage.epy(1, 2, 3, null, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public final int f;
    public final int g;
    private int h;

    static {
        java.lang.String str = eum.a;
    }

    public epy(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
        this.f = i4;
        this.g = i5;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 12) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 10;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            if (i != 6 && i != 7) {
                return -1;
            }
        }
        return 3;
    }

    public static java.lang.String c(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? a.bj(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static java.lang.String d(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 10) {
            return "Display P3";
        }
        if (i != 1) {
            return i != 2 ? a.bj(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static java.lang.String e(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? a.bj(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean h(defpackage.epy epyVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (epyVar == null) {
            return true;
        }
        int i5 = epyVar.b;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = epyVar.c) == -1 || i == 2) && (((i2 = epyVar.d) == -1 || i2 == 3) && epyVar.e == null && (((i3 = epyVar.g) == -1 || i3 == 8) && ((i4 = epyVar.f) == -1 || i4 == 8)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.epy epyVar = (defpackage.epy) obj;
            if (this.b == epyVar.b && this.c == epyVar.c && this.d == epyVar.d && java.util.Arrays.equals(this.e, epyVar.e) && this.f == epyVar.f && this.g == epyVar.g) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f == -1 || this.g == -1) ? false : true;
    }

    public final boolean g() {
        return (this.b == -1 || this.c == -1 || this.d == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31) + java.util.Arrays.hashCode(this.e)) * 31) + this.f) * 31) + this.g;
        this.h = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        int i2 = this.d;
        int i3 = this.c;
        java.lang.String strD = d(this.b);
        java.lang.String strC = c(i3);
        java.lang.String strE = e(i2);
        java.lang.String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i4 = this.g;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + strD + ", " + strC + ", " + strE + ", " + (this.e != null) + ", " + str + ", " + str2 + ')';
    }
}
