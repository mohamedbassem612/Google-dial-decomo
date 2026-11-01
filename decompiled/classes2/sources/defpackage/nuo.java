package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuo extends amzm {
    private final amzg b;

    public nuo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.nuo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aooh.f(optional, "bamStartTimestamp");
        akzx akzxVarM = defpackage.num.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.nwj nwjVar = new defpackage.nwj(akzxVarM);
        defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.npi(nwjVar, 3), 7);
        if (true == optional.isPresent()) {
            lwxVar.a.a(optional.get());
        }
        alad aladVarP = ((akzx) nwjVar.a).p();
        aooh.e(aladVarP, "build(...)");
        j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.num) aladVarP);
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
