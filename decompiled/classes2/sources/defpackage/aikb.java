package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aikb implements java.io.Serializable, ahyp {
    public static final defpackage.aikb a = new defpackage.aikb(defpackage.aiel.a, defpackage.aiej.a);
    private static final long serialVersionUID = 0;
    public final defpackage.aiem b;
    public final defpackage.aiem c;

    public aikb(defpackage.aiem aiemVar, defpackage.aiem aiemVar2) {
        this.b = aiemVar;
        this.c = aiemVar2;
        if (aiemVar == defpackage.aiej.a || aiemVar2 == defpackage.aiel.a) {
            throw new java.lang.IllegalArgumentException("Invalid range: (-∞..+∞)");
        }
    }

    @java.lang.Deprecated
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        ahvr.ci((java.lang.Comparable) obj);
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aikb)) {
            return false;
        }
        defpackage.aikb aikbVar = (defpackage.aikb) obj;
        return this.b.equals(aikbVar.b) && this.c.equals(aikbVar.c);
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.b) * 31) + java.lang.System.identityHashCode(this.c);
    }

    java.lang.Object readResolve() {
        defpackage.aikb aikbVar = a;
        return equals(aikbVar) ? aikbVar : this;
    }

    public final java.lang.String toString() {
        return "(-∞..+∞)";
    }
}
