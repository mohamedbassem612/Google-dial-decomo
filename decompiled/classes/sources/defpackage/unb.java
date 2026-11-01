package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class unb {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/bar/impl/controller/FavoritesBarStateHolder");
    public final defpackage.uno b;
    public final defpackage.rlv c;
    public final defpackage.aoss d;
    public final defpackage.aoyq e;
    public java.util.List f;
    public final defpackage.aoxh g;
    public final defpackage.aozj h;
    public final defpackage.aozj i;
    public final defpackage.zth j;
    public final defpackage.gpd k;
    public final defpackage.zjm l;
    private final defpackage.zrw m;

    public unb(defpackage.gpd gpdVar, defpackage.zjm zjmVar, defpackage.uno unoVar, defpackage.zrw zrwVar, defpackage.zth zthVar, defpackage.rlv rlvVar, defpackage.aoss aossVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("dataLoader");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.k = gpdVar;
        this.l = zjmVar;
        this.b = unoVar;
        this.m = zrwVar;
        this.j = zthVar;
        this.c = rlvVar;
        this.d = aossVar;
        defpackage.aoyq aoyqVarC = defpackage.aoyx.c(1, 0, 0, 6);
        aoyqVarC.d(defpackage.aojh.a);
        this.e = aoyqVarC;
        this.h = defpackage.aozk.a(null);
        this.i = defpackage.aozk.a(null);
        this.f = defpackage.aokc.a;
        defpackage.jzv jzvVar = new defpackage.jzv((defpackage.aoln) null, this, 2);
        int i = defpackage.aoyc.a;
        this.g = new defpackage.gdc((defpackage.aonn) new defpackage.jzm((defpackage.aoln) null, 3, (short[]) null), (defpackage.aoxh) new defpackage.apaa(jzvVar, aoyqVarC), 7);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        defpackage.umz umzVar;
        if (aolnVar instanceof defpackage.umz) {
            umzVar = (defpackage.umz) aolnVar;
            int i = umzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                umzVar.c = i - Integer.MIN_VALUE;
            } else {
                umzVar = new defpackage.umz(this, aolnVar);
            }
        } else {
            umzVar = new defpackage.umz(this, aolnVar);
        }
        java.lang.Object objL = umzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = umzVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objL);
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.aooc.af(objL);
        defpackage.zrw zrwVar = this.m;
        umzVar.c = 1;
        objL = zrwVar.l(umzVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objL).booleanValue()) {
            defpackage.zrw zrwVar2 = this.m;
            umzVar.c = 2;
            objL = zrwVar2.m(umzVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
