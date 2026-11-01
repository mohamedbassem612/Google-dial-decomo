package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoi {
    public final anmb a;
    public final anph b;
    public final defpackage.anpk c;
    private final anog d;

    public anoi(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anog anogVar) {
        ahvr.cj(anpkVar, "method");
        this.c = anpkVar;
        ahvr.cj(anphVar, "headers");
        this.b = anphVar;
        ahvr.cj(anmbVar, "callOptions");
        this.a = anmbVar;
        ahvr.cj(anogVar, "pickDetailsConsumer");
        this.d = anogVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.anoi anoiVar = (defpackage.anoi) obj;
            if (j$.util.Objects.equals(this.a, anoiVar.a) && j$.util.Objects.equals(this.b, anoiVar.b) && j$.util.Objects.equals(this.c, anoiVar.c) && j$.util.Objects.equals(this.d, anoiVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d});
    }

    public final java.lang.String toString() {
        anmb anmbVar = this.a;
        anph anphVar = this.b;
        return "[method=" + java.lang.String.valueOf(this.c) + " headers=" + java.lang.String.valueOf(anphVar) + " callOptions=" + java.lang.String.valueOf(anmbVar) + ']';
    }

    public anoi() {
        throw null;
    }
}
