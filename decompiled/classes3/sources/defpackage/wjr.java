package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjr implements igz {
    public final ihi a;
    public final aoss b;
    public final java.util.EnumMap c;
    public final ahda d;

    public wjr(ihi ihiVar, aoss aossVar) {
        aooh.f(ihiVar, "audioPrismDuplexRelay");
        aooh.f(aossVar, "lightweightScope");
        this.a = ihiVar;
        this.b = aossVar;
        this.d = new ahda((byte[]) null);
        this.c = new java.util.EnumMap(ihb.class);
    }

    public final java.lang.Object a(ihc ihcVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.b, this.d, new defpackage.vjf(this, ihcVar, (aoln) null, 16)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }
}
