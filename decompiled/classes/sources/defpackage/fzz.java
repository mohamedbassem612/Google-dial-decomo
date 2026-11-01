package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzz extends defpackage.gaa {
    public static final defpackage.fzz a = new defpackage.fzz(true);
    public static final defpackage.fzz b = new defpackage.fzz(false);

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.fzz) && this.c == ((defpackage.fzz) obj).c;
    }

    public final int hashCode() {
        return defpackage.anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "NotLoading(endOfPaginationReached=" + this.c + ')';
    }
}
