package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkp extends mni {
    public final long a;
    public final defpackage.njt b;

    public nkp(long j, defpackage.njt njtVar) {
        super((char[]) null);
        this.a = j;
        this.b = njtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nkp) {
            defpackage.nkp nkpVar = (defpackage.nkp) obj;
            if (this.a == nkpVar.a && this.b == nkpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Connect(triggerItemId=" + this.a + ", displayLabel=" + this.b + ')';
    }
}
