package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njz implements defpackage.nke {
    public final boolean a;
    private final defpackage.njt b;

    public njz(boolean z, defpackage.njt njtVar) {
        this.a = z;
        this.b = njtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.njz) {
            defpackage.njz njzVar = (defpackage.njz) obj;
            if (this.a == njzVar.a && this.b == njzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "EndCallEvent(markAsSpam=" + this.a + ", displayLabel=" + this.b + ')';
    }
}
