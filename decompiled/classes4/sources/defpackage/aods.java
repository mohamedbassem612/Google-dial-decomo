package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aods implements aodt {
    private final java.net.URI a;

    public aods(java.net.URI uri) {
        ahvr.ci(uri);
        this.a = uri;
    }

    public final anpv a(anps anpsVar, anpq anpqVar) {
        return anpsVar.b(this.a, anpqVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aods) {
            return this.a.equals(((defpackage.aods) obj).a);
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
