package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpg {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final defpackage.abpe d;
    public final defpackage.abpf e;
    public final defpackage.abpf f;
    private final boolean g;

    public abpg(java.lang.String str, defpackage.abpe abpeVar, defpackage.abpf abpfVar, defpackage.abpf abpfVar2, boolean z, boolean z2) {
        aooh.f(str, "key");
        this.a = str;
        this.d = abpeVar;
        this.e = abpfVar;
        this.f = abpfVar2;
        this.b = z;
        this.c = z2;
        this.g = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpg) {
            defpackage.abpg abpgVar = (defpackage.abpg) obj;
            if (aooh.n(this.a, abpgVar.a) && aooh.n(this.d, abpgVar.d) && aooh.n(this.e, abpgVar.e) && aooh.n(this.f, abpgVar.f) && this.b == abpgVar.b && this.c == abpgVar.c) {
                boolean z = abpgVar.g;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(false);
    }

    public final java.lang.String toString() {
        return "ButtonEntryModel(key=" + this.a + ", icon=" + this.d + ", label=" + this.e + ", contentDescription=" + this.f + ", isSelected=" + this.b + ", isEnabled=" + this.c + ", compact=false)";
    }
}
