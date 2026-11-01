package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vuo implements java.lang.Comparable {
    public final defpackage.vtt a;
    private final j$.util.Optional b;
    private final int c;

    public vuo(defpackage.vtt vttVar, j$.util.Optional optional, int i) {
        if (vttVar == null) {
            throw new java.lang.NullPointerException("Null voicemailAccount");
        }
        this.a = vttVar;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null slotId");
        }
        this.b = optional;
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.vuo vuoVar = (defpackage.vuo) obj;
        return aieh.b.c((java.lang.Comparable) this.b.orElse(Integer.MAX_VALUE), (java.lang.Comparable) vuoVar.b.orElse(Integer.MAX_VALUE)).b(this.c, vuoVar.c).a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vuo) {
            defpackage.vuo vuoVar = (defpackage.vuo) obj;
            if (this.a.equals(vuoVar.a) && this.b.equals(vuoVar.b) && this.c == vuoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "AccountData{voicemailAccount=" + this.a.toString() + ", slotId=" + optional.toString() + ", subId=" + this.c + '}';
    }

    public vuo() {
        throw null;
    }
}
