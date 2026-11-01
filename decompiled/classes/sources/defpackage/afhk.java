package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhk {
    public final defpackage.albh a;
    private final defpackage.akzq b;

    public afhk(defpackage.albh albhVar, defpackage.akzq akzqVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("Null defaultValue");
        }
        this.a = albhVar;
        if (akzqVar == null) {
            throw new java.lang.NullPointerException("Null extensionRegistryLite");
        }
        this.b = akzqVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [albh, java.lang.Object] */
    public final defpackage.albh a(java.io.InputStream inputStream) {
        return this.a.N().i(inputStream, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afhk) {
            defpackage.afhk afhkVar = (defpackage.afhk) obj;
            if (this.a.equals(afhkVar.a) && this.b.equals(afhkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.akzq akzqVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + akzqVar.toString() + '}';
    }

    public afhk() {
        throw null;
    }
}
