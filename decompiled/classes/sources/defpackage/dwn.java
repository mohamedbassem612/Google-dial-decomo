package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwn {
    public static final defpackage.dwn a = new defpackage.dwn(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dwn(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static defpackage.dwn b(defpackage.dwn dwnVar, defpackage.dwn dwnVar2) {
        return d(java.lang.Math.max(dwnVar.b, dwnVar2.b), java.lang.Math.max(dwnVar.c, dwnVar2.c), java.lang.Math.max(dwnVar.d, dwnVar2.d), java.lang.Math.max(dwnVar.e, dwnVar2.e));
    }

    public static defpackage.dwn c(defpackage.dwn dwnVar, defpackage.dwn dwnVar2) {
        int i = dwnVar.e;
        int i2 = dwnVar2.e;
        int i3 = dwnVar.d;
        int i4 = dwnVar2.d;
        return d(java.lang.Math.min(dwnVar.b, dwnVar2.b), java.lang.Math.min(dwnVar.c, dwnVar2.c), java.lang.Math.min(i3, i4), java.lang.Math.min(i, i2));
    }

    public static defpackage.dwn d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new defpackage.dwn(i, i2, i3, i4);
    }

    public static defpackage.dwn e(android.graphics.Insets insets) {
        return d(da$.ExternalSyntheticApiModelOutline0.m$1(insets), da$.ExternalSyntheticApiModelOutline0.m$2(insets), da$.ExternalSyntheticApiModelOutline0.m$3(insets), da$.ExternalSyntheticApiModelOutline0.m(insets));
    }

    public final android.graphics.Insets a() {
        return fn$.ExternalSyntheticApiModelOutline0.m(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.dwn dwnVar = (defpackage.dwn) obj;
            if (this.e == dwnVar.e && this.b == dwnVar.b && this.d == dwnVar.d && this.c == dwnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
