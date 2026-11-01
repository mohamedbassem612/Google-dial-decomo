package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkc extends amzm {
    private final amzg b;
    private final amzg c;

    public pkc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Optional optionalD = sqlVar.d();
        defpackage.pnh pnhVar = new defpackage.pnh(mguVar, 1);
        if (true == optionalD.isPresent()) {
            java.lang.Object obj2 = optionalD.get();
            optionalD = j$.util.Optional.ofNullable((java.lang.Boolean) new mgf((mgu) pnhVar.a, ((java.lang.Boolean) obj2).booleanValue()).a(mfy.bo).f());
        }
        return aiql.z(optionalD);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
