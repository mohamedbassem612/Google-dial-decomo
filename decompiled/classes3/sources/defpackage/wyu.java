package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wyu extends defpackage.wyr {
    private final ajcq a;
    private final dsd b;

    public wyu(ajcq ajcqVar, dsd dsdVar) {
        this.a = ajcqVar;
        this.b = dsdVar;
    }

    @Override // defpackage.wyr
    public final dsd a() {
        return this.b;
    }

    @Override // defpackage.wyr
    public final ajcq b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wyr) {
            defpackage.wyr wyrVar = (defpackage.wyr) obj;
            if (this.a.equals(wyrVar.b()) && this.b.equals(wyrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        dsd dsdVar = this.b;
        return "SessionTrackingFutureAndCompleter{future=" + this.a.toString() + ", completer=" + dsdVar.toString() + '}';
    }
}
