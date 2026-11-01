package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public ngn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new amzw(defpackage.ngn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Object obj2;
        int i;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        int i2 = 1;
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(6)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(8)).booleanValue();
        aooh.f(context, "appContext");
        aooh.f(optional, "callScopeTranscriptSummary");
        if (zBooleanValue5) {
            java.lang.Object nmxVar = (defpackage.nmy) aooh.q(optional);
            if (nmxVar == null) {
                if (zBooleanValue) {
                    i = 2132018485;
                } else if (zBooleanValue2) {
                    i = 2132018484;
                } else if (zBooleanValue7) {
                    i = 2132018487;
                } else if (zBooleanValue3 || zBooleanValue4) {
                    i = zBooleanValue6 ? 2132017495 : 2132018486;
                } else {
                    defpackage.nfw.b.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyProducerModule", "produceDobbySummaryText$<anonymous>", 424, "DobbyProducerModule.kt").v("Haven't received summary from Duplex");
                    i = 2132018488;
                }
                if (zBooleanValue) {
                    i2 = 2;
                } else if (zBooleanValue3) {
                    i2 = 3;
                }
                java.lang.String string = context.getString(i);
                aooh.e(string, "getString(...)");
                nmxVar = new defpackage.nmx(string, i2);
            }
            obj2 = nmxVar;
        } else {
            defpackage.nfw.b.b().l("com/android/dialer/dobby/impl/service/DobbyProducerModule", "produceDobbySummaryText", 400, "DobbyProducerModule.kt").v("Session not running successfully, return empty summary");
            obj2 = defpackage.nmw.a;
        }
        return aiql.z(obj2);
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
