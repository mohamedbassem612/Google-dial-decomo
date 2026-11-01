package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajly extends defpackage.ajsz {
    public final defpackage.aogc a;

    public ajly(defpackage.aogc aogcVar) {
        this.a = aogcVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return !this.a.a.equals(defpackage.ajfe.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajly)) {
            return false;
        }
        defpackage.aogc aogcVar = ((defpackage.ajly) obj).a;
        defpackage.aogc aogcVar2 = this.a;
        if (!aogcVar2.a.equals(aogcVar.a)) {
            return false;
        }
        if (((java.lang.String) aogcVar2.b).equals(aogcVar.b)) {
            return ((defpackage.akzc) aogcVar2.c).equals(aogcVar.c);
        }
        return false;
    }

    public final int hashCode() {
        defpackage.aogc aogcVar = this.a;
        return j$.util.Objects.hash(new java.lang.Object[]{aogcVar.b, aogcVar.c, aogcVar.a});
    }

    public final java.lang.String toString() {
        defpackage.aogc aogcVar = this.a;
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", aogcVar.b, aogcVar.a);
    }
}
