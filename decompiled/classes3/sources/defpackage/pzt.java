package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzt implements defpackage.qbb {
    public final java.util.Map a;
    public final ajct b;
    public final defpackage.qax c;
    public j$.util.Optional d = j$.util.Optional.empty();
    public final defpackage.qbe e;
    public final gat f;

    public pzt(java.util.Map map, ajct ajctVar, gat gatVar, defpackage.qax qaxVar, defpackage.qbe qbeVar) {
        this.a = map;
        this.b = ajctVar;
        this.f = gatVar;
        this.c = qaxVar;
        this.e = qbeVar;
    }

    @Override // defpackage.qbb
    public final ajcq a() {
        return ahvr.F(new omj(this, 16), this.b);
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(akzxVar);
        defpackage.puo puoVar = new defpackage.puo(akzxVar, 10);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            akzx akzxVar2 = (akzx) puoVar.a;
            akzxVar2.u();
            amow amowVar = akzxVar2.b;
            amow amowVar2 = amow.a;
            amowVar.ag = ((defpackage.pzp) obj2).t;
            amowVar.c |= 1073741824;
        }
    }
}
