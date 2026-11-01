package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qbj implements java.util.function.Function {
    public final /* synthetic */ defpackage.qbl a;
    public final /* synthetic */ amnr b;
    public final /* synthetic */ rmw c;
    public final /* synthetic */ j$.util.Optional d;

    public /* synthetic */ qbj(defpackage.qbl qblVar, amnr amnrVar, rmw rmwVar, j$.util.Optional optional) {
        this.a = qblVar;
        this.b = amnrVar;
        this.c = rmwVar;
        this.d = optional;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        amow amowVar = (amow) obj;
        akzx akzxVarM = ampv.a.m();
        defpackage.qbl qblVar = this.a;
        ampw ampwVarBd = qblVar.j.bd();
        akzxVarM.u();
        ampv ampvVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ampwVarBd);
        ampvVar.s = ampwVarBd;
        ampvVar.c |= 1;
        akzxVarM.u();
        ampv ampvVar2 = akzxVarM.b;
        amnr amnrVar = this.b;
        j$.util.Objects.requireNonNull(amnrVar);
        ampvVar2.A = amnrVar;
        ampvVar2.c |= 2048;
        akzxVarM.u();
        ampv ampvVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(amowVar);
        ampvVar3.d = amowVar;
        ampvVar3.b |= 1;
        defpackage.rdp rdpVar = qblVar.g;
        java.lang.String str = qblVar.f;
        akzx akzxVarV = ttj.V(str, rdpVar.a(str).longValue(), qblVar.e.a());
        akzxVarV.u();
        amqo amqoVar = akzxVarV.b;
        amqo amqoVar2 = amqo.a;
        amqoVar.c = this.c.lo;
        amqoVar.b |= 1;
        akzxVarM.u();
        ampv ampvVar4 = akzxVarM.b;
        amqo amqoVarP = akzxVarV.p();
        j$.util.Objects.requireNonNull(amqoVarP);
        ampvVar4.f = amqoVarP;
        ampvVar4.b |= 8;
        this.d.ifPresentOrElse(new defpackage.oxs(akzxVarM, 9), new fvl(4));
        return akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
