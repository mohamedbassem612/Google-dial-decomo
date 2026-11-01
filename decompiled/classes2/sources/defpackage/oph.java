package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oph {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public oph(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static defpackage.oph a() {
        akcu akcuVar = new akcu();
        akcuVar.f();
        akcuVar.g(true);
        akcuVar.h(true);
        return akcuVar.e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oph) {
            defpackage.oph ophVar = (defpackage.oph) obj;
            if (this.a == ophVar.a && this.b == ophVar.b && this.c == ophVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "DisplayOptions{circleCropPhoto=" + this.a + ", showDefaultPlaceholderPhoto=" + this.b + ", showDefaultFallbackPhoto=" + this.c + '}';
    }

    public oph() {
        throw null;
    }
}
