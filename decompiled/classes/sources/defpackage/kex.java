package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kex {
    public final int a;

    public kex(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kex) && this.a == ((defpackage.kex) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ActivityRetainedState(forceRefreshUiCounter=" + this.a + ')';
    }

    public kex() {
        this(0);
    }
}
