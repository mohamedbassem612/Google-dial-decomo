package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeos {
    private static final int[] h = new int[0];
    private static final java.lang.String[] i = new java.lang.String[0];
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int[] e;
    public final java.lang.String[] f;
    public final defpackage.aeor g;

    public aeos(java.lang.String str, java.lang.String str2, int i2, long j, int[] iArr, java.lang.String[] strArr, defpackage.aeor aeorVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = aeorVar;
    }

    public static boolean a(java.lang.Object obj) {
        return obj == null || (obj instanceof defpackage.aepe);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeos) {
            defpackage.aeos aeosVar = (defpackage.aeos) obj;
            if (j$.util.Objects.equals(this.b, aeosVar.b) && j$.util.Objects.equals(this.c, aeosVar.c) && this.d == aeosVar.d && this.a == aeosVar.a && java.util.Arrays.equals(this.e, aeosVar.e) && java.util.Arrays.equals(this.f, aeosVar.f) && j$.util.Objects.equals(this.g, aeosVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, java.lang.Integer.valueOf(this.d), java.lang.Long.valueOf(this.a), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.e)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.f)), this.g});
    }

    public aeos(java.lang.String str, java.lang.String str2, int i2, long j, defpackage.aeor aeorVar) {
        this(str, str2, i2, j, h, i, aeorVar);
    }
}
