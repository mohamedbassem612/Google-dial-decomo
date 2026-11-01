package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkq extends mni {
    public final long a;
    public final boolean b;
    public final defpackage.njt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkq(long j, boolean z, int i) {
        super((char[]) null);
        defpackage.njt njtVar = defpackage.njt.NONE;
        this.a = j;
        this.b = ((i & 2) == 0) & z;
        this.c = njtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nkq) {
            defpackage.nkq nkqVar = (defpackage.nkq) obj;
            if (this.a == nkqVar.a && this.b == nkqVar.b && this.c == nkqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.M(this.a) * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "EndCall(triggerItemId=" + this.a + ", markAsSpam=" + this.b + ", displayLabel=" + this.c + ')';
    }
}
