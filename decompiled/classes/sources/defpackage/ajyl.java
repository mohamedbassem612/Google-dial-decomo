package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajyl {
    public final java.lang.String a;
    public final java.lang.String b;

    public ajyl(java.lang.String str, java.lang.String str2) {
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajyl) {
            defpackage.ajyl ajylVar = (defpackage.ajyl) obj;
            if (this.a.equals(ajylVar.a) && this.b.equals(ajylVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + '}';
    }

    public ajyl() {
        throw null;
    }
}
