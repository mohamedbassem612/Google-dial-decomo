package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phm {
    public final ajcq a;
    public final ajcq b;
    public final ajcq c;

    public phm(ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3) {
        this.a = ajcqVar;
        this.b = ajcqVar2;
        this.c = ajcqVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.phm) {
            defpackage.phm phmVar = (defpackage.phm) obj;
            if (aooh.n(this.a, phmVar.a) && aooh.n(this.b, phmVar.b) && aooh.n(this.c, phmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneLookupStages(fullInfo=" + this.a + ", cp2Info=" + this.b + ", timeoutInfo=" + this.c + ')';
    }
}
