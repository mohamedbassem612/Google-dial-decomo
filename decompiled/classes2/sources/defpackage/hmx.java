package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmx implements defpackage.hqr {
    public final defpackage.hqe a;
    public final ahpz b;
    public final rlv c;
    public final java.util.Map d;
    private final android.content.Context e;
    private final java.util.Map f;
    private final gpd g;

    public hmx(android.content.Context context, defpackage.hqe hqeVar, gpd gpdVar, ahpz ahpzVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        this.e = context;
        this.a = hqeVar;
        this.g = gpdVar;
        this.b = ahpzVar;
        this.c = rlvVar;
        this.d = ajsz.aM(new aoiu(0, "+"));
        this.f = ajsz.aO(new aoiu[]{new aoiu(0, androidx.car.app.model.CarText.create("+")), new aoiu(1, androidx.car.app.model.CarText.create(" ")), new aoiu(2, androidx.car.app.model.CarText.create("ABC")), new aoiu(3, androidx.car.app.model.CarText.create("DEF")), new aoiu(4, androidx.car.app.model.CarText.create("GHI")), new aoiu(5, androidx.car.app.model.CarText.create("JKL")), new aoiu(6, androidx.car.app.model.CarText.create("MNO")), new aoiu(7, androidx.car.app.model.CarText.create("PQRS")), new aoiu(8, androidx.car.app.model.CarText.create("TUV")), new aoiu(9, androidx.car.app.model.CarText.create("WXYZ"))});
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.xl xlVar = new defpackage.xl();
        xlVar.c();
        return xlVar.a();
    }

    @Override // defpackage.hqr
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.tt ttVar, aoln aolnVar) {
        return d((defpackage.hmy) obj, ttVar);
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }

    public final defpackage.ze d(defpackage.hmy hmyVar, defpackage.tt ttVar) {
        aooh.f(hmyVar, "data");
        aooh.f(ttVar, "carContext");
        defpackage.vw vwVar = new defpackage.vw();
        vwVar.b(androidx.car.app.model.CarColor.GREEN);
        vwVar.c(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.e, 2131231340))));
        vwVar.d(new defpackage.hms(this, hmyVar, ttVar, 3, null));
        defpackage.hhr hhrVar = new defpackage.hhr(vwVar.a(), new defpackage.hmw(hmyVar, 0));
        hhrVar.b = hmyVar.a;
        for (java.util.Map.Entry entry : this.f.entrySet()) {
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            int iIntValue = num.intValue();
            androidx.car.app.model.CarText carText = (androidx.car.app.model.CarText) entry.getValue();
            if (iIntValue != 0 && iIntValue != 1 && iIntValue != 2 && iIntValue != 3 && iIntValue != 4 && iIntValue != 5 && iIntValue != 6 && iIntValue != 7 && iIntValue != 8 && iIntValue != 9 && iIntValue != 10 && iIntValue != 11) {
                throw new java.lang.IllegalArgumentException(a.bw((byte) 34, iIntValue, "Invalid key int \""));
            }
            defpackage.zl.e.a(carText);
            hhrVar.f.put(num, carText);
        }
        hhrVar.b(new defpackage.hpn(this, hmyVar, 1));
        com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate telephoneKeypadTemplateA = hhrVar.a();
        e(mce.gy);
        return telephoneKeypadTemplateA;
    }

    public final void e(mce mceVar) {
        this.g.i((java.lang.String) null).b(mceVar);
    }
}
