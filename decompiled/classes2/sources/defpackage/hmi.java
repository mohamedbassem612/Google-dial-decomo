package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmi extends defpackage.ub {
    public final defpackage.tt f;
    public final defpackage.hqe g;
    public final ahpz h;
    public final rlv i;
    public final gpd j;
    private final android.content.Context k;
    private final defpackage.hmg l;
    private final ssq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmi(android.content.Context context, defpackage.tt ttVar, defpackage.hmg hmgVar, ssq ssqVar, defpackage.hqe hqeVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar) {
        super(ttVar);
        aooh.f(context, "appContext");
        aooh.f(ttVar, "carContext");
        aooh.f(hmgVar, "contact");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.k = context;
        this.f = ttVar;
        this.l = hmgVar;
        this.m = ssqVar;
        this.g = hqeVar;
        this.h = ahpzVar;
        this.i = rlvVar;
        this.j = gpdVar;
        this.b.c(new defpackage.emr(this, 4, null));
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.ys ysVar = new defpackage.ys();
        defpackage.xc xcVar = new defpackage.xc();
        defpackage.hmg hmgVar = this.l;
        xcVar.e(hmgVar.c);
        xcVar.c(new defpackage.vw(androidx.car.app.model.Action.BACK).a());
        ysVar.c = xcVar.a();
        defpackage.yi yiVar = new defpackage.yi();
        java.util.List<defpackage.hmu> list = hmgVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        for (defpackage.hmu hmuVar : list) {
            defpackage.yh yhVar = new defpackage.yh();
            yhVar.f(this.m.g(hmuVar.c, java.util.Locale.getDefault().getCountry()));
            android.content.Context context = this.k;
            j$.util.Optional optionalBU = mni.bU(context.getResources(), hmuVar.a, hmuVar.b);
            aooh.e(optionalBU, "getTypeLabel(...)");
            java.lang.CharSequence charSequence = (java.lang.CharSequence) aooh.q(optionalBU);
            if (charSequence != null) {
                yhVar.c(charSequence);
            }
            yhVar.d(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(context, 2131231340))), 4);
            yhVar.e(new defpackage.hnc(this, hmuVar, 1));
            arrayList.add(yhVar.a());
        }
        yiVar.d = arrayList;
        ysVar.a = ajsz.aY(yiVar.a());
        return ysVar.a();
    }
}
