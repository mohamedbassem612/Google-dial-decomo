package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abjt implements abki {
    public final char a;
    public final abjv b;
    private final defpackage.abjz c;

    public /* synthetic */ abjt(char c, abjv abjvVar) {
        defpackage.abjz abjzVar = defpackage.abjz.a;
        this.a = c;
        this.b = abjvVar;
        this.c = abjzVar;
    }

    public final defpackage.abjz a() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjt) {
            defpackage.abjt abjtVar = (defpackage.abjt) obj;
            if (this.a == abjtVar.a && aooh.n(this.b, abjtVar.b) && this.c == abjtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CharacterItem(character=" + this.a + ", color=" + this.b + ", shape=" + this.c + ')';
    }
}
