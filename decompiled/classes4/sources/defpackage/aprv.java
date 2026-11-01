package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprv {
    public final java.util.Date a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public aprv(java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = java.lang.Integer.parseInt(str);
        int length = str.length();
        if (length == 1 || length == 2) {
            if (i7 < 0 || i7 >= 50) {
                i7 += 1900;
            } else {
                i7 += 2000;
            }
        } else if (length == 3) {
            i7 += 1900;
        }
        int i8 = i7;
        this.b = i8;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(j$.util.DesugarTimeZone.getTimeZone("GMT+0"));
        gregorianCalendar.set(i8, i - 1, i2, i3, i4, i5);
        gregorianCalendar.set(14, 0);
        if (i6 != Integer.MIN_VALUE) {
            gregorianCalendar.add(12, -(((i6 / 100) * 60) + (i6 % 100)));
        }
        this.a = gregorianCalendar.getTime();
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.aprv aprvVar = (defpackage.aprv) obj;
            java.util.Date date = this.a;
            if (date != null ? date.equals(aprvVar.a) : aprvVar.a == null) {
                if (this.d == aprvVar.d && this.e == aprvVar.e && this.f == aprvVar.f && this.c == aprvVar.c && this.g == aprvVar.g && this.h == aprvVar.h && this.b == aprvVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.util.Date date = this.a;
        return (((((((((((((((date == null ? 0 : date.hashCode()) + 31) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.c) * 31) + this.g) * 31) + this.h) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return this.b + ' ' + this.c + ' ' + this.d + "; " + this.e + ' ' + this.f + ' ' + this.g + ' ' + this.h;
    }
}
