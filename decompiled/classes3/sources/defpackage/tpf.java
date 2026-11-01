package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tpf {
    public final aoss a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;

    public tpf(aoss aossVar, zpz zpzVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.a = aossVar;
        this.b = zpzVar;
        this.c = new ahda((byte[]) null);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        aooh.e(optionalEmpty, "empty(...)");
        this.d = optionalEmpty;
    }

    public final java.lang.Object a(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.a, (ahda) this.b, new defpackage.tlv(this, (aoln) null, 3)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object b(aoln aolnVar) {
        java.lang.Object objC = c(new kqu(this, (aoln) null, 16), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    public final java.lang.Object c(aonj aonjVar, aoln aolnVar) {
        return ahvr.ag(this.a, (ahda) this.b, new nht(aonjVar, (aoln) null, 6, (byte[]) null)).a(aolnVar);
    }

    public final java.lang.Object d(aoln aolnVar) {
        return c(new jgn(this, (aoln) null, 10), aolnVar);
    }

    public final java.lang.Object e(defpackage.qtz qtzVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.a, (ahda) this.c, new ofa(this, qtzVar, (aoln) null, 3)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public tpf(aoss aossVar, java.util.Map map) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.c = map;
        this.b = new ahda((byte[]) null);
    }

    public tpf(aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.c = new ahda((byte[]) null);
        this.b = new java.util.ArrayList();
    }

    public tpf(zpz zpzVar, aoss aossVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.c = zpzVar;
        this.a = aossVar;
        this.b = new ahda((byte[]) null);
    }
}
