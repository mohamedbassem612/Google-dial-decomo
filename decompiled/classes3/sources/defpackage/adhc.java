package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adhc extends adhx {
    private final adhw b;
    private final int c;
    private volatile transient java.lang.String d;

    public adhc(adhw adhwVar, int i) {
        if (adhwVar == null) {
            throw new java.lang.NullPointerException("Null qualifiedName");
        }
        this.b = adhwVar;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final adhw b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adhx) {
            adhx adhxVar = (adhx) obj;
            if (this.b.equals(adhxVar.b()) && this.c == adhxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ahym ahymVar = new ahym("");
                    ahymVar.b("name", this.b);
                    ahymVar.e("version", this.c);
                    this.d = ahymVar.toString();
                    if (this.d == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }
}
