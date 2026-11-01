package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xda extends amzm {
    private final amzg b;
    private final amzg c;

    public xda(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.xda.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.xdh xdhVar = (defpackage.xdh) list.get(0);
        defpackage.qix qixVar = (defpackage.qix) list.get(1);
        int iJ = wsc.j(xdhVar.c.c);
        if (iJ == 0) {
            throw null;
        }
        int i = iJ - 1;
        j$.util.Optional optionalOf = ((i == 2 || i == 3 || i == 4 || i == 5 || i == 6) && qixVar == defpackage.qix.b) ? j$.util.Optional.of(new oai(3)) : j$.util.Optional.empty();
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
