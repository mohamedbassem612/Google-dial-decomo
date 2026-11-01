package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class plv {
    public static final aimz a = aimz.i("com/android/dialer/incall/calltransfer/impl/service/CallTransferController");
    public final aoss b;
    public final zjs c;
    public final defpackage.qtx d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final zpm f;
    public final defpackage.qbe g;
    public final zpz h;
    public final defpackage.pqm i;
    public final defpackage.vaa j;

    public plv(aoss aossVar, zpm zpmVar, defpackage.qbe qbeVar, zpz zpzVar, zjs zjsVar, defpackage.pqm pqmVar, defpackage.vaa vaaVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpmVar, "callScopes");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(pqmVar, "callController");
        this.b = aossVar;
        this.f = zpmVar;
        this.g = qbeVar;
        this.h = zpzVar;
        this.c = zjsVar;
        this.i = pqmVar;
        this.j = vaaVar;
        this.d = new nyy(this, 3);
        this.e = new java.util.concurrent.atomic.AtomicBoolean();
    }
}
