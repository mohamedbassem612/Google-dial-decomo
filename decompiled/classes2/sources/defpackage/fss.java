package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fss {
    public final java.lang.String a;
    public final int b;
    public final java.lang.Integer c;
    public final java.lang.Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public fss(java.lang.String str, int i, java.lang.Integer num, java.lang.Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    defpackage.etr.f("SsaStyle", "Ignoring unknown alignment: ".concat(java.lang.String.valueOf(str)));
                    return -1;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    public static java.lang.Integer b(java.lang.String str) {
        try {
            long j = str.startsWith("&H") ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str);
            ahvr.bM(j <= 4294967295L);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(aiql.P(((j >> 24) & 255) ^ 255), aiql.P(j & 255), aiql.P((j >> 8) & 255), aiql.P((j >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.etr.g("SsaStyle", a.bp((byte) 39, str, "Failed to parse color expression: '"), e);
            return null;
        }
    }

    public static boolean c(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (java.lang.NumberFormatException e) {
            defpackage.etr.g("SsaStyle", a.bp((byte) 39, str, "Failed to parse boolean value: '"), e);
            return false;
        }
    }
}
