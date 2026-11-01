package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anmn {
    public final anmm a;
    public final anqw b;

    public anmn(anmm anmmVar, anqw anqwVar) {
        this.a = anmmVar;
        ahvr.cj(anqwVar, "status is null");
        this.b = anqwVar;
    }

    public static defpackage.anmn a(anmm anmmVar) {
        ahvr.bN(anmmVar != anmm.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new defpackage.anmn(anmmVar, anqw.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anmn)) {
            return false;
        }
        defpackage.anmn anmnVar = (defpackage.anmn) obj;
        return this.a.equals(anmnVar.a) && this.b.equals(anmnVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        anqw anqwVar = this.b;
        boolean zH = anqwVar.h();
        anmm anmmVar = this.a;
        if (zH) {
            return anmmVar.toString();
        }
        return anmmVar.toString() + '(' + anqwVar.toString() + ')';
    }
}
