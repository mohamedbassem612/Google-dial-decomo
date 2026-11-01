package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hod implements defpackage.hqr {
    public static final aimz a = aimz.i("com/android/dialer/androidauto/impl/incall/CarInCallTemplateConverter");
    public final defpackage.hph b;
    public final defpackage.hpf c;
    public final defpackage.hqu d;
    public final ahpz e;
    public final aoin f;
    public final java.lang.String g;
    public final java.util.List h;
    public final java.util.Set i;
    public final java.util.Set j;
    public final java.util.Set k;
    public final apdp l;
    public int m;
    public final gpd n;
    public final rai o;
    private final android.util.LruCache p;
    private boolean q;
    private final ops r;
    private final zpm s;
    private final apdp t;

    public hod(ops opsVar, rai raiVar, defpackage.hph hphVar, defpackage.hpf hpfVar, zpm zpmVar, gpd gpdVar, defpackage.hqu hquVar, aazc aazcVar, ahpz ahpzVar, aoin aoinVar) {
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(raiVar, "inCallDialpadScreenFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(hquVar, "audioRouteSelectorScreenFactory");
        aooh.f(aazcVar, "clock");
        aooh.f(ahpzVar, "traceCreation");
        this.r = opsVar;
        this.o = raiVar;
        this.b = hphVar;
        this.c = hpfVar;
        this.s = zpmVar;
        this.n = gpdVar;
        this.d = hquVar;
        this.e = ahpzVar;
        this.f = aoinVar;
        this.l = new apdp();
        this.t = new apdp();
        this.p = new android.util.LruCache(5);
        this.g = " · ";
        this.h = ajsz.aY(pnf.c);
        this.m = 5;
        j$.util.concurrent.ConcurrentHashMap.KeySetView keySetViewNewKeySet = j$.util.concurrent.ConcurrentHashMap.newKeySet();
        aooh.e(keySetViewNewKeySet, "newKeySet(...)");
        this.i = keySetViewNewKeySet;
        j$.util.concurrent.ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = j$.util.concurrent.ConcurrentHashMap.newKeySet();
        aooh.e(keySetViewNewKeySet2, "newKeySet(...)");
        this.j = keySetViewNewKeySet2;
        j$.util.concurrent.ConcurrentHashMap.KeySetView keySetViewNewKeySet3 = j$.util.concurrent.ConcurrentHashMap.newKeySet();
        aooh.e(keySetViewNewKeySet3, "newKeySet(...)");
        this.k = keySetViewNewKeySet3;
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.hha hhaVar = new defpackage.hha();
        hhaVar.f = true;
        return hhaVar.a();
    }

    @Override // defpackage.hqr
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.tt ttVar, aoln aolnVar) {
        defpackage.hoe hoeVar = (defpackage.hoe) obj;
        defpackage.hol holVar = hoeVar.a;
        aimz aimzVar = a;
        if (holVar == null) {
            aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallTemplateConverter", "convert", 103, "CarInCallTemplateConverter.kt").v("Data is null, returning loading template.");
            return a();
        }
        aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallTemplateConverter", "convert", 106, "CarInCallTemplateConverter.kt").v("Data is not null, returning in call template.");
        return f(holVar, hoeVar.b, ttVar, aolnVar);
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(abwd abwdVar, defpackage.tt ttVar, aoln aolnVar) {
        defpackage.hnz hnzVar;
        abwd abwdVar2;
        java.lang.Boolean bool;
        androidx.car.app.model.CarIcon carIcon;
        if (aolnVar instanceof defpackage.hnz) {
            hnzVar = (defpackage.hnz) aolnVar;
            int i = hnzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnzVar.c = i - Integer.MIN_VALUE;
            } else {
                hnzVar = new defpackage.hnz(this, aolnVar);
            }
        } else {
            hnzVar = new defpackage.hnz(this, aolnVar);
        }
        java.lang.Object obj = hnzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hnzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.Boolean bool2 = (java.lang.Boolean) this.f.a();
            if (bool2.booleanValue() && (carIcon = (androidx.car.app.model.CarIcon) this.p.get(abwdVar)) != null) {
                return carIcon;
            }
            ajcq ajcqVarE = this.r.e(abwdVar, defpackage.oph.a(), ttVar.getResources().getDimensionPixelSize(2131166180), ttVar.getResources().getDimensionPixelSize(2131166180));
            hnzVar.d = abwdVar;
            hnzVar.e = bool2;
            hnzVar.c = 1;
            java.lang.Object objD = aosv.D(ajcqVarE, hnzVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            abwdVar2 = abwdVar;
            bool = bool2;
            obj = objD;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = hnzVar.e;
            abwdVar2 = hnzVar.d;
            aooc.af(obj);
        }
        aooh.e(obj, "await(...)");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) aooh.q((j$.util.Optional) obj);
        androidx.car.app.model.CarIcon carIcon2 = bitmap != null ? new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.f(bitmap))) : null;
        if (!bool.booleanValue() || carIcon2 == null) {
            return carIcon2;
        }
        this.p.put(abwdVar2, carIcon2);
        return carIcon2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.hol holVar, defpackage.tt ttVar, aoln aolnVar) {
        defpackage.hoa hoaVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.hoa) {
            hoaVar = (defpackage.hoa) aolnVar;
            int i = hoaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoaVar.c = i - Integer.MIN_VALUE;
            } else {
                hoaVar = new defpackage.hoa(this, aolnVar);
            }
        } else {
            hoaVar = new defpackage.hoa(this, aolnVar);
        }
        java.lang.Object obj = hoaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hoaVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.t;
            hoaVar.d = holVar;
            hoaVar.e = ttVar;
            hoaVar.f = apdpVar;
            hoaVar.c = 1;
            if (apdpVar.b(hoaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = hoaVar.f;
            ttVar = hoaVar.e;
            defpackage.hol holVar2 = hoaVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            holVar = holVar2;
        }
        try {
            java.util.Set set = this.k;
            java.lang.String str = holVar.a;
            boolean zRemove = set.remove(str);
            boolean z = this.q;
            boolean z2 = holVar.c;
            if (z != z2 || zRemove) {
                this.n.i(str).b(mce.gj);
                this.q = z2;
            }
            apdpVar.d();
            this.n.i(holVar.a).b(mce.gH);
            defpackage.vw vwVar = new defpackage.vw();
            boolean z3 = holVar.c;
            vwVar.c(defpackage.hhe.b(ttVar, 2131231498, z3));
            vwVar.b(defpackage.hhe.a(ttVar, z3));
            vwVar.d(new defpackage.hnc(this, holVar, 4));
            return vwVar.a();
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.hol holVar, defpackage.hnh hnhVar, defpackage.tt ttVar, aoln aolnVar) {
        defpackage.hob hobVar;
        if (aolnVar instanceof defpackage.hob) {
            hobVar = (defpackage.hob) aolnVar;
            int i = hobVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hobVar.c = i - Integer.MIN_VALUE;
            } else {
                hobVar = new defpackage.hob(this, aolnVar);
            }
        } else {
            hobVar = new defpackage.hob(this, aolnVar);
        }
        java.lang.Object objM = hobVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hobVar.c;
        if (i2 == 0) {
            aooc.af(objM);
            defpackage.hoc hocVar = new defpackage.hoc(this, hnhVar, holVar, ttVar, null);
            hobVar.c = 1;
            objM = aosv.m(hocVar, hobVar);
            if (objM == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objM);
        }
        aooh.e(objM, "coroutineScope(...)");
        return objM;
    }

    public final qbe g(java.lang.String str) {
        defpackage.hny hnyVar;
        j$.util.Optional optionalE = this.s.e(str);
        aooh.e(optionalE, "get(...)");
        apqr apqrVar = (apqr) aooh.q(optionalE);
        if (apqrVar == null || (hnyVar = (defpackage.hny) apqrVar.a(defpackage.hny.class)) == null) {
            return null;
        }
        return hnyVar.cp();
    }
}
