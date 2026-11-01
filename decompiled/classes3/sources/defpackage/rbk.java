package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbk extends amzm {
    private final amzg b;
    private final amyz c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public rbk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
        this.f = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        ajct ajctVar = (ajct) list.get(0);
        j$.util.Optional optionalEmpty = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            return aiql.z(j$.util.Optional.empty());
        }
        if (zBooleanValue) {
            return aiql.z(j$.util.Optional.empty());
        }
        defpackage.qup qupVar = defpackage.qup.c;
        j$.util.Objects.requireNonNull(qupVar);
        ida idaVar = new ida(qupVar, 7);
        if (true == optionalEmpty.isPresent()) {
            if (true != ((java.lang.Enum) idaVar.a).equals((defpackage.qup) optionalEmpty.get())) {
                optionalEmpty = j$.util.Optional.empty();
            }
        }
        return optionalEmpty.isPresent() ? aiql.z(j$.util.Optional.empty()) : ahrv.g(this.b.d()).i(new defpackage.qfc(ajctVar, 15), ajctVar).h(new defpackage.pqn(19), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        return aiql.w(new ajcq[]{this.d.d(), this.e.d(), amzgVar.d()});
    }
}
