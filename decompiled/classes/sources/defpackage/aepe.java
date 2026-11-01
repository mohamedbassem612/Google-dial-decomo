package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aepe implements defpackage.aepd {
    public abstract java.lang.Object a();

    public abstract java.lang.String b();

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aepe) {
            return j$.util.Objects.equals(a(), ((defpackage.aepe) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return b();
    }
}
