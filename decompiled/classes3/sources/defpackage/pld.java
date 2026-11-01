package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pld extends amzm {
    private final amzg b;
    private final amzg c;

    public pld(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pld.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        defpackage.spn spnVar = sqlVar.a;
        if ((spnVar.b & 512) != 0) {
            defpackage.zhj zhjVar = spnVar.l;
            if (zhjVar == null) {
                zhjVar = defpackage.zhj.a;
            }
            if ((zhjVar.b & 128) != 0) {
                defpackage.zhj zhjVar2 = spnVar.l;
                if (zhjVar2 == null) {
                    zhjVar2 = defpackage.zhj.a;
                }
                defpackage.aknj aknjVar = zhjVar2.j;
                if (aknjVar == null) {
                    aknjVar = defpackage.aknj.a;
                }
                optionalEmpty = j$.util.Optional.of(java.lang.Boolean.valueOf(aknjVar.b));
            } else {
                optionalEmpty = j$.util.Optional.of(java.lang.Boolean.TRUE);
            }
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
