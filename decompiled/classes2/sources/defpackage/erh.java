package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class erh {
    public final java.lang.Object a;
    public final int b;
    public final defpackage.eqt c;
    public final java.lang.Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        java.lang.String str = eum.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public erh(java.lang.Object obj, int i, defpackage.eqt eqtVar, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
        ahvr.bM((boolean) ((i ^ (-1)) >>> 31));
        ahvr.bM((boolean) ((i2 ^ (-1)) >>> 31));
        this.a = obj;
        this.b = i;
        this.c = eqtVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.erh erhVar = (defpackage.erh) obj;
            if (this.b == erhVar.b && this.e == erhVar.e && this.f == erhVar.f && this.g == erhVar.g && this.h == erhVar.h && this.i == erhVar.i && j$.util.Objects.equals(this.c, erhVar.c) && j$.util.Objects.equals(this.a, erhVar.a) && j$.util.Objects.equals(this.d, erhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), this.c, this.d, java.lang.Integer.valueOf(this.e), java.lang.Long.valueOf(this.f), java.lang.Long.valueOf(this.g), java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.i)});
    }

    public final java.lang.String toString() {
        java.lang.String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.g + ", adGroup=" + i + ", ad=" + this.i;
    }
}
