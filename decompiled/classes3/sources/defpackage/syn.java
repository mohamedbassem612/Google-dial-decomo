package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syn extends amzm {
    private final amzg b;

    public syn(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.syn.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qin qinVar = (defpackage.qin) obj;
        aify aifyVar = aike.a;
        if (aifyVar != null) {
            return aiql.z(new defpackage.qie(aifyVar, 3, qinVar.d, false));
        }
        throw new java.lang.NullPointerException("Null actionButtons");
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
