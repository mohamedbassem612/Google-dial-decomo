package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjd extends amzm {
    private final amzg b;
    private final amzg c;

    public pjd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        zjm zjmVar = (zjm) list.get(0);
        defpackage.sql sqlVar = (defpackage.sql) list.get(1);
        jvv jvvVar = (jvv) zjmVar.g().orElse((java.lang.Object) null);
        if (jvvVar == null) {
            optionalEmpty = j$.util.Optional.empty();
        } else {
            defpackage.zai zaiVar = sqlVar.u().c;
            if (zaiVar == null) {
                zaiVar = defpackage.zai.a;
            }
            optionalEmpty = !jvvVar.d(zaiVar) ? j$.util.Optional.empty() : j$.util.Optional.of(zaiVar);
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
