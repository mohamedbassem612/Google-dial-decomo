package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpb {
    public final zmw a;
    public final boolean b;
    public final aomy c;

    public hpb(zmw zmwVar, boolean z, aomy aomyVar) {
        aooh.f(zmwVar, "audioRoute");
        this.a = zmwVar;
        this.b = z;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hpb) {
            defpackage.hpb hpbVar = (defpackage.hpb) obj;
            if (this.a == hpbVar.a && this.b == hpbVar.b && aooh.n(this.c, hpbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioRouteEntry(audioRoute=" + this.a + ", isSelected=" + this.b + ", onSelected=" + this.c + ')';
    }
}
