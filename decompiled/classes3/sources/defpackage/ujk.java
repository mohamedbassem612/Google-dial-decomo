package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujk {
    public static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/service/SpamCallHistoryStatusFetcher");
    public final zrw b;
    public final aolr c;
    private final ojo d;
    private final ajct e;
    private final zjs f;

    public ujk(zrw zrwVar, ojo ojoVar, ajct ajctVar, aolr aolrVar, zjs zjsVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(zjsVar, "dialerTelecom");
        this.b = zrwVar;
        this.d = ojoVar;
        this.e = ajctVar;
        this.c = aolrVar;
        this.f = zjsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, aoln aolnVar) {
        defpackage.ujj ujjVar;
        if (aolnVar instanceof defpackage.ujj) {
            ujjVar = (defpackage.ujj) aolnVar;
            int i = ujjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujjVar.c = i - Integer.MIN_VALUE;
            } else {
                ujjVar = new defpackage.ujj(this, aolnVar);
            }
        } else {
            ujjVar = new defpackage.ujj(this, aolnVar);
        }
        java.lang.Object objD = ujjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujjVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajbg ajbgVarD = this.d.d(this.f.a(), new java.lang.String[]{"_id"}, java.lang.String.valueOf(str2).concat(" = ?"), new java.lang.String[]{str}, "_id DESC LIMIT 1");
            ajbc ajbcVarE = ahqx.e(new kwb(11));
            ajct ajctVar = this.e;
            ajck ajckVarU = ajbgVarD.c(ajbcVarE, ajctVar).h().u(android.database.sqlite.SQLiteException.class, new defpackage.uev(new defpackage.skk(19), 6), ajctVar);
            ujjVar.c = 1;
            objD = aosv.D(ajckVarU, ujjVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return objD;
    }
}
