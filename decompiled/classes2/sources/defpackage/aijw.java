package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aijw extends aijz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final aijz a;

    public aijw(aijz aijzVar) {
        this.a = aijzVar;
    }

    public final aijz a() {
        return this.a.a().b();
    }

    public final aijz b() {
        return this.a.b();
    }

    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aijw) {
            return this.a.equals(((defpackage.aijw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-921210296);
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".nullsLast()");
    }

    public final aijz c() {
        return this;
    }
}
