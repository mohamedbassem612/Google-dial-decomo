package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class sth implements defpackage.ajaz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ sth(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ajaz
    public final defpackage.ajbg a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            defpackage.rpj rpjVar = (defpackage.rpj) obj;
            return new defpackage.ajbg(defpackage.aosv.F(rpjVar.b, 0, new defpackage.rpi(rpjVar, null), 3));
        }
        defpackage.sti stiVar = (defpackage.sti) obj;
        defpackage.stm stmVar = stiVar.b;
        defpackage.ajcq ajcqVarBk = stmVar.e.bk();
        defpackage.jyx jyxVar = new defpackage.jyx(stmVar, 10);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), new defpackage.ahqv(defpackage.ahns.c(false), jyxVar));
        int i2 = defpackage.ajan.c;
        defpackage.ajct ajctVar = stmVar.b;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarBk, ahqvVar);
        ajcqVarBk.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        defpackage.ajal ajalVar = new defpackage.ajal(ajamVar, new defpackage.ajax(defpackage.ahns.c(false), new defpackage.jwf(obj, 14), 1));
        ajamVar.c(ajalVar, defpackage.aiql.t(stiVar.c, ajalVar));
        return new defpackage.ajbg(ajalVar);
    }
}
