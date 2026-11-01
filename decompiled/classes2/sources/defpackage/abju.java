package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abju implements abki {
    public final defpackage.abja a;
    public final abjv b;
    private final defpackage.abjz c;

    public /* synthetic */ abju(defpackage.abja abjaVar, abjv abjvVar) {
        defpackage.abjz abjzVar = defpackage.abjz.a;
        this.a = abjaVar;
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
        if (obj instanceof defpackage.abju) {
            defpackage.abju abjuVar = (defpackage.abju) obj;
            if (this.a == abjuVar.a && aooh.n(this.b, abjuVar.b) && this.c == abjuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "IconItem(icon=" + this.a + ", color=" + this.b + ", shape=" + this.c + ')';
    }
}
