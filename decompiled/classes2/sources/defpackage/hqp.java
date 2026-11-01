package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqp implements defpackage.hqw {
    public static final aimz a = aimz.i("com/android/dialer/androidauto/impl/tab/TabTemplateConverter");
    public final ahpz b;
    public final rlv c;
    public final aoss d;
    public final java.util.Map e;
    public defpackage.hqh f;
    public final gpd g;
    public final ahda h;
    public final apni i;
    private final android.content.Context j;
    private final defpackage.hnb k;
    private final defpackage.hng l;
    private final defpackage.hmk m;
    private final defpackage.hmt n;
    private final defpackage.hlk o;
    private final defpackage.hlo p;
    private final defpackage.hmv q;
    private final defpackage.hmx r;
    private final aoss s;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public hqp(android.content.Context context, defpackage.hnb hnbVar, defpackage.hng hngVar, defpackage.hmk hmkVar, defpackage.hmt hmtVar, defpackage.hlk hlkVar, defpackage.hlo hloVar, defpackage.hmv hmvVar, defpackage.hmx hmxVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar, apni apniVar, aoss aossVar, aoss aossVar2) throws aois {
        aooh.f(context, "appContext");
        aooh.f(hmvVar, "dialpadModel");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        this.j = context;
        this.k = hnbVar;
        this.l = hngVar;
        this.m = hmkVar;
        this.n = hmtVar;
        this.o = hlkVar;
        this.p = hloVar;
        this.q = hmvVar;
        this.r = hmxVar;
        this.b = ahpzVar;
        this.c = rlvVar;
        this.g = gpdVar;
        this.i = apniVar;
        this.d = aossVar;
        this.s = aossVar2;
        defpackage.hqh[] hqhVarArrValues = defpackage.hqh.values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(hqhVarArrValues.length), 16));
        for (defpackage.hqh hqhVar : hqhVarArrValues) {
            int iOrdinal = hqhVar.ordinal();
            java.lang.String strE = "";
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    strE = dvx.e(this.j, 2132018674);
                } else if (iOrdinal == 2) {
                    strE = dvx.e(this.j, 2132019823);
                } else if (iOrdinal == 3) {
                    strE = dvx.e(this.j, 2132018154);
                } else if (iOrdinal == 4) {
                    strE = dvx.e(this.j, 2132018326);
                } else if (iOrdinal != 5) {
                    throw new aois();
                }
            }
            linkedHashMap.put(hqhVar, strE);
        }
        this.e = linkedHashMap;
        this.h = new ahda((byte[]) null);
        this.f = defpackage.hqh.TAB_ID_UNKNOWN;
    }

    private static final androidx.car.app.model.CarIcon d(android.content.Context context, int i) {
        return new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(context, i)));
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.hgx hgxVar = new defpackage.hgx(new defpackage.hqn());
        hgxVar.b = true;
        return hgxVar.a();
    }

    public final defpackage.ze b(defpackage.hqg hqgVar, defpackage.ze zeVar) {
        ahoq ahoqVarW = ahvr.W(77, "TabTemplateConverter_createTabTemplate");
        try {
            aimw aimwVarL = a.b().l("com/android/dialer/androidauto/impl/tab/TabTemplateConverter", "createTabTemplate$<anonymous>", 159, "TabTemplateConverter.kt");
            java.util.Map map = this.e;
            defpackage.hqh hqhVar = hqgVar.a;
            aimwVarL.y("Creating template for tab: %s", map.get(hqhVar));
            defpackage.hgx hgxVar = new defpackage.hgx(new defpackage.hqm(this, hqgVar));
            hgxVar.b = false;
            hgxVar.c = androidx.car.app.model.Action.APP_ICON;
            defpackage.hqh hqhVar2 = defpackage.hqh.TAB_ID_FAVORITES;
            int i = hqhVar == hqhVar2 ? 2131231999 : 2131231998;
            defpackage.hqh hqhVar3 = defpackage.hqh.TAB_ID_RECENTS;
            int i2 = hqhVar == hqhVar3 ? 2131232067 : 2131231919;
            defpackage.hqh hqhVar4 = defpackage.hqh.TAB_ID_CONTACTS;
            int i3 = hqhVar == hqhVar4 ? 2131231979 : 2131231980;
            defpackage.hgv hgvVar = new defpackage.hgv();
            hgvVar.c((java.lang.CharSequence) map.get(hqhVar2));
            hgvVar.b("TAB_ID_FAVORITES");
            android.content.Context context = this.j;
            hgvVar.b = d(context, i);
            defpackage.hgv hgvVar2 = new defpackage.hgv();
            hgvVar2.c((java.lang.CharSequence) map.get(hqhVar3));
            hgvVar2.b("TAB_ID_RECENTS");
            hgvVar2.b = d(context, i2);
            defpackage.hgv hgvVar3 = new defpackage.hgv();
            hgvVar3.c((java.lang.CharSequence) map.get(hqhVar4));
            hgvVar3.b("TAB_ID_CONTACTS");
            hgvVar3.b = d(context, i3);
            defpackage.hgv hgvVar4 = new defpackage.hgv();
            hgvVar4.c((java.lang.CharSequence) map.get(defpackage.hqh.TAB_ID_DIALPAD));
            hgvVar4.b("TAB_ID_DIALPAD");
            hgvVar4.b = d(context, 2131231950);
            for (com.android.car.libraries.apphost.external.model.GoogleTab googleTab : ajsz.bb(new com.android.car.libraries.apphost.external.model.GoogleTab[]{hgvVar.a(), hgvVar2.a(), hgvVar3.a(), hgvVar4.a()})) {
                j$.util.Objects.requireNonNull(googleTab);
                hgxVar.d.add(googleTab);
            }
            java.lang.String strName = hqhVar.name();
            if (((java.lang.String) j$.util.Objects.requireNonNull(strName)).isEmpty()) {
                throw new java.lang.IllegalArgumentException("The content ID cannot be null or empty");
            }
            hgxVar.f = strName;
            hgxVar.e = (com.android.car.libraries.apphost.external.model.GoogleTabContents) j$.util.Objects.requireNonNull(new com.android.car.libraries.apphost.external.model.GoogleTabContents(new defpackage.hgw(zeVar)));
            this.i.i(ahvr.ag(this.d, this.h, new defpackage.fyn(this, hqhVar, (aoln) null, 4)));
            com.android.car.libraries.apphost.external.model.GoogleTabTemplate googleTabTemplateA = hgxVar.a();
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return googleTabTemplateA;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.hqw
    public final aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        aooh.f(aoxhVar, "dataFlow");
        aooh.f(ttVar, "carContext");
        defpackage.hng hngVar = this.l;
        aoxh aoxhVarA = defpackage.hhv.a(hngVar, this.k.b, ttVar);
        aoss aossVar = this.s;
        aozc aozcVar = aozb.a;
        aozh aozhVarAs = aoov.as(aoxhVarA, aossVar, aozcVar, hngVar.a());
        defpackage.hmt hmtVar = this.n;
        aozh aozhVarAs2 = aoov.as(defpackage.hhv.a(hmtVar, this.m.b, ttVar), aossVar, aozcVar, hmtVar.a());
        aozh aozhVarAs3 = aoov.as(defpackage.hhv.a(this.p, this.o.c, ttVar), aossVar, aozcVar, defpackage.hlo.e());
        defpackage.hmx hmxVar = this.r;
        defpackage.hmv hmvVar = this.q;
        defpackage.hqo hqoVar = new defpackage.hqo(null, aozhVarAs, aozhVarAs3, aozhVarAs2, aoov.as(defpackage.hhv.a(hmxVar, hmvVar.a, ttVar), aossVar, aozcVar, hmxVar.d(hmvVar.b(null), ttVar)), this);
        int i = aoyc.a;
        return new apaa(hqoVar, aoxhVar);
    }
}
