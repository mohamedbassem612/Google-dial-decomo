package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alka {
    public final defpackage.almz a;
    public final defpackage.almy b;
    public final java.util.function.BiConsumer c;

    public alka(defpackage.almz almzVar, defpackage.almy almyVar, java.util.function.BiConsumer biConsumer) {
        if (almzVar == null) {
            throw new java.lang.NullPointerException("Null eventData");
        }
        this.a = almzVar;
        if (almyVar == null) {
            throw new java.lang.NullPointerException("Null triggeringEvent");
        }
        this.b = almyVar;
        this.c = biConsumer;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alka) {
            defpackage.alka alkaVar = (defpackage.alka) obj;
            if (this.a.equals(alkaVar.a) && this.b.equals(alkaVar.b) && this.c.equals(alkaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.util.function.BiConsumer biConsumer = this.c;
        defpackage.almy almyVar = this.b;
        return "EventDataWithTriggeringEvent{eventData=" + this.a.toString() + ", triggeringEvent=" + almyVar.toString() + ", callback=" + biConsumer.toString() + '}';
    }

    public alka() {
        throw null;
    }
}
