package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoof extends defpackage.aony implements defpackage.aooe, defpackage.aopw {
    private final int a;

    public aoof(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
    }

    @Override // defpackage.aooe
    public final int da() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aoof) {
            defpackage.aoof aoofVar = (defpackage.aoof) obj;
            if (this.f.equals(aoofVar.f) && this.g.equals(aoofVar.g) && defpackage.aooh.n(this.e, aoofVar.e) && defpackage.aooh.n(f(), aoofVar.f())) {
                return true;
            }
        } else if (obj instanceof defpackage.aopw) {
            return obj.equals(e());
        }
        return false;
    }

    @Override // defpackage.aony
    protected final void h() {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
    }

    public final int hashCode() {
        return (((f() == null ? 0 : f().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aopt aoptVarE = e();
        if (aoptVarE != this) {
            return aoptVarE.toString();
        }
        java.lang.String str = this.f;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : defpackage.a.bk(str, "function ", " (Kotlin reflection is not available)");
    }

    public aoof(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, d, cls, str, str2, i2);
    }
}
