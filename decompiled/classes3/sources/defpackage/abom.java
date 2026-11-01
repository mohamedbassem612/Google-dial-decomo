package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abom {
    public final boolean a;
    public final boolean b;
    public final defpackage.afpl c;

    public abom(boolean z, boolean z2, defpackage.afpl afplVar) {
        this.a = z;
        this.b = z2;
        this.c = afplVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abom) {
            defpackage.abom abomVar = (defpackage.abom) obj;
            if (this.a == abomVar.a && this.b == abomVar.b && aooh.n(this.c, abomVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.afpl afplVar = this.c;
        return (((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + (afplVar == null ? 0 : afplVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TranscriptionMessageListItemScope(isLast=" + this.a + ", isLastMessage=" + this.b + ", animationState=" + this.c + ')';
    }
}
