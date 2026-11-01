package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzy extends defpackage.gaa {
    public static final defpackage.fzy a = new defpackage.fzy();

    private fzy() {
        super(false);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.fzy) && this.c == ((defpackage.fzy) obj).c;
    }

    public final int hashCode() {
        return defpackage.anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "Loading(endOfPaginationReached=" + this.c + ')';
    }
}
