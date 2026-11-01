package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class absf {
    public final int a;
    private final long b;
    private final java.lang.String c;
    private final java.lang.String d;

    public absf(int i, long j, java.lang.String str, java.lang.String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.absf) {
            defpackage.absf absfVar = (defpackage.absf) obj;
            if (this.a == absfVar.a && this.b == absfVar.b && this.c.equals(absfVar.c) && this.d.equals(absfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + '}';
    }

    public absf() {
        throw null;
    }
}
