package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnd extends defpackage.ub {
    public final defpackage.tt f;
    public final defpackage.hqe g;
    public final ahpz h;
    public final rlv i;
    public final gpd j;
    private final android.content.Context k;
    private final defpackage.hmz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnd(android.content.Context context, defpackage.tt ttVar, defpackage.hmz hmzVar, defpackage.hqe hqeVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar) {
        super(ttVar);
        aooh.f(context, "appContext");
        aooh.f(ttVar, "carContext");
        aooh.f(hmzVar, "favorite");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.k = context;
        this.f = ttVar;
        this.l = hmzVar;
        this.g = hqeVar;
        this.h = ahpzVar;
        this.i = rlvVar;
        this.j = gpdVar;
        this.b.c(new defpackage.emr(this, 5, null));
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.xl xlVar = new defpackage.xl();
        defpackage.xc xcVar = new defpackage.xc();
        defpackage.hmz hmzVar = this.l;
        xcVar.e(hmzVar.a);
        xcVar.c(new defpackage.vw(androidx.car.app.model.Action.BACK).a());
        xlVar.b(xcVar.a());
        defpackage.xi xiVar = new defpackage.xi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : hmzVar.f) {
            upl uplVar = (upl) obj;
            aooh.f(uplVar, "channel");
            int i = uplVar.f;
            upk upkVarB = upk.b(i);
            if (upkVarB == null) {
                upkVarB = upk.f;
            }
            if (upkVarB != upk.b) {
                upk upkVarB2 = upk.b(i);
                if (upkVarB2 == null) {
                    upkVarB2 = upk.f;
                }
                if (upkVarB2 == upk.a) {
                }
            }
            arrayList.add(obj);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<upl> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (hashSet.add(((upl) obj2).c)) {
                arrayList2.add(obj2);
            }
        }
        for (upl uplVar2 : arrayList2) {
            defpackage.yh yhVar = new defpackage.yh();
            yhVar.f(uplVar2.c);
            yhVar.c(uplVar2.e);
            yhVar.e(new defpackage.hnc(this, uplVar2, 0));
            yhVar.d(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.k, 2131232042))), 4);
            xiVar.b(yhVar.a());
        }
        xlVar.d(xiVar.a());
        return xlVar.a();
    }
}
