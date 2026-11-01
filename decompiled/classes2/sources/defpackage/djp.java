package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djp {
    private final dkv a;

    public djp(dkv dkvVar) {
        this.a = dkvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.djp) {
            dkv dkvVar = this.a;
            dkv dkvVar2 = ((defpackage.djp) obj).a;
            if (aooh.n(dkvVar.a, dkvVar2.a) && dkvVar.b.x(dkvVar2.b) && aooh.n(dkvVar.c, dkvVar2.c) && dkvVar.d == dkvVar2.d && dkvVar.e == dkvVar2.e && a.x(dkvVar.f, dkvVar2.f) && aooh.n(dkvVar.g, dkvVar2.g) && dkvVar.h == dkvVar2.h && dkvVar.k == dkvVar2.k && aooh.n(dkvVar.i, dkvVar2.i) && anty.ah(dkvVar.j, dkvVar2.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dkv dkvVar = this.a;
        int iHashCode = dkvVar.a.hashCode() * 31;
        dkz dkzVar = dkvVar.b;
        dks dksVar = dkzVar.b;
        long j = dksVar.b;
        dpt[] dptVarArr = dps.a;
        dnd dndVar = dksVar.c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + (dndVar != null ? dndVar.h : 0)) * 31;
        dmw dmwVar = dksVar.d;
        int i2 = (i + (dmwVar != null ? dmwVar.a : 0)) * 31;
        dmx dmxVar = dksVar.e;
        int i3 = (i2 + (dmxVar != null ? dmxVar.a : 0)) * 31;
        dmq dmqVar = dksVar.f;
        int iHashCode2 = (i3 + (dmqVar != null ? dmqVar.hashCode() : 0)) * 31;
        java.lang.String str = dksVar.g;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = dksVar.h;
        int i4 = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        dok dokVar = dksVar.i;
        int iFloatToIntBits = (i4 + (dokVar != null ? java.lang.Float.floatToIntBits(dokVar.a) : 0)) * 31;
        doz dozVar = dksVar.j;
        int iHashCode4 = (iFloatToIntBits + (dozVar != null ? dozVar.hashCode() : 0)) * 31;
        dnx dnxVar = dksVar.k;
        int iHashCode5 = (iHashCode4 + (dnxVar != null ? dnxVar.hashCode() : 0)) * 31;
        long j3 = dksVar.l;
        int iHashCode6 = (((iHashCode5 + ((int) (j3 ^ (j3 >>> 32)))) * 961) + dkzVar.c.hashCode()) * 31;
        dki dkiVar = dkzVar.d;
        return ((((((((((((((((((iHashCode + iHashCode6 + (dkiVar != null ? dkiVar.hashCode() : 0)) * 31) + dkvVar.c.hashCode()) * 31) + dkvVar.d) * 31) + anty.L(dkvVar.e)) * 31) + dkvVar.f) * 31) + dkvVar.g.hashCode()) * 31) + dkvVar.h.hashCode()) * 31) + dkvVar.k.hashCode()) * 31) + dkvVar.i.hashCode()) * 31) + anty.M(dkvVar.j);
    }
}
