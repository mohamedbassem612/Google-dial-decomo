package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aonv implements java.io.Serializable, defpackage.aooe {
    private final java.lang.Class a;
    protected final java.lang.Object b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final boolean e;
    private final int f;
    private final int g;

    public aonv(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this.b = obj;
        this.a = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.aooe
    public final int da() {
        return this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aonv) {
            defpackage.aonv aonvVar = (defpackage.aonv) obj;
            if (this.e == aonvVar.e && this.f == aonvVar.f && this.g == aonvVar.g && defpackage.aooh.n(this.b, aonvVar.b) && defpackage.aooh.n(this.a, aonvVar.a) && this.c.equals(aonvVar.c) && this.d.equals(aonvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return ((((((((((((obj != null ? obj.hashCode() : 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f) * 31) + this.g;
    }

    public final java.lang.String toString() {
        return defpackage.aoou.a(this);
    }
}
