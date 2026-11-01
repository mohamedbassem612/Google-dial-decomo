package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cud {
    public final int a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cud) && this.a == ((defpackage.cud) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.a == 1 ? "Touch" : "Keyboard";
    }
}
