package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pos extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pos(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pos.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        java.util.Map map = (java.util.Map) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        defpackage.pnh pnhVar = new defpackage.pnh(map, 6);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable((defpackage.sbe) pnhVar.a.get((defpackage.pmq) optionalOfNullable.get()));
            optionalOfNullable.getClass();
        }
        if (true == optionalOfNullable.isPresent()) {
            defpackage.sbe sbeVar = (defpackage.sbe) optionalOfNullable.get();
            optionalOfNullable = j$.util.Optional.ofNullable(aosv.F(sbeVar.a, 0, new defpackage.roy(sbeVar, (aoln) null, 10), 3));
        }
        return ahrv.g((ajcq) optionalOfNullable.orElse(aiql.z((java.lang.Object) null))).h(new defpackage.pqn(1), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
