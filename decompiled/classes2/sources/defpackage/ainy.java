package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ainy implements aini {
    private final aini a;
    private final java.lang.Object b;

    public ainy(aini ainiVar, java.lang.Object obj) {
        aiql.l(ainiVar, "log site key");
        this.a = ainiVar;
        aiql.l(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ainy)) {
            return false;
        }
        defpackage.ainy ainyVar = (defpackage.ainy) obj;
        return this.a.equals(ainyVar.a) && this.b.equals(ainyVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
