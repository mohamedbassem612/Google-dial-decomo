package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alir {
    public final aify a;
    public final j$.util.Optional b;
    public final aify c;

    public alir(aify aifyVar, j$.util.Optional optional, aify aifyVar2) {
        this.a = aifyVar;
        this.b = optional;
        this.c = aifyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alir) {
            defpackage.alir alirVar = (defpackage.alir) obj;
            if (ahvr.aP(this.a, alirVar.a) && this.b.equals(alirVar.b) && ahvr.aP(this.c, alirVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.c;
        j$.util.Optional optional = this.b;
        return "DuplexConversationResult{outboundEvents=" + java.lang.String.valueOf(this.a) + ", exception=" + java.lang.String.valueOf(optional) + ", recognitionEventLogs=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public alir() {
        throw null;
    }
}
