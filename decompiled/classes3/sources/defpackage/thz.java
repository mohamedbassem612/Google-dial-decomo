package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thz {
    public final long a;
    public final j$.util.Optional b;

    public thz(long j, j$.util.Optional optional) {
        this.a = j;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.thz) {
            defpackage.thz thzVar = (defpackage.thz) obj;
            if (this.a == thzVar.a && this.b.equals(thzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactWithSnippet{contactId=" + this.a + ", snippet=" + java.lang.String.valueOf(this.b) + '}';
    }

    public thz() {
        throw null;
    }
}
