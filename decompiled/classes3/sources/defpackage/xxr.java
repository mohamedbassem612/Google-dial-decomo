package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxr implements defpackage.xxw {
    int a;
    public java.lang.Class b;
    private final defpackage.xxs c;

    public xxr(defpackage.xxs xxsVar) {
        this.c = xxsVar;
    }

    @Override // defpackage.xxw
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xxr)) {
            return false;
        }
        defpackage.xxr xxrVar = (defpackage.xxr) obj;
        return this.a == xxrVar.a && this.b == xxrVar.b;
    }

    public final int hashCode() {
        int i = this.a * 31;
        java.lang.Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Key{size=" + this.a + "array=" + java.lang.String.valueOf(this.b) + '}';
    }
}
