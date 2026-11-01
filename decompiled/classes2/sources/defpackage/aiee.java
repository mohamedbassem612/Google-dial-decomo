package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiee extends aijz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator a;

    public aiee(java.util.Comparator comparator) {
        ahvr.ci(comparator);
        this.a = comparator;
    }

    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aiee) {
            return this.a.equals(((defpackage.aiee) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
