package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class umx {
    public static final defpackage.agxj a = defpackage.upn.a;
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/speeddial/bar/impl/controller/FavoritesBarDataService");
    public final defpackage.aoss c;
    public final defpackage.aolr d;
    public final defpackage.uqc e;
    public final defpackage.gpd f;
    public final defpackage.zjm g;
    public final defpackage.aogc h;
    private final defpackage.zrw i;

    public umx(defpackage.gpd gpdVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.uqc uqcVar, defpackage.zrw zrwVar, defpackage.aogc aogcVar, defpackage.zjm zjmVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("favoritesBarDataLoader");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (uqcVar == null) {
            defpackage.aooh.i("speedDialUiItemMutator");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        this.f = gpdVar;
        this.c = aossVar;
        this.d = aolrVar;
        this.e = uqcVar;
        this.i = zrwVar;
        this.h = aogcVar;
        this.g = zjmVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        umu umuVar;
        if (aolnVar instanceof umu) {
            umuVar = (umu) aolnVar;
            int i = umuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                umuVar.c = i - Integer.MIN_VALUE;
            } else {
                umuVar = new umu(this, aolnVar);
            }
        } else {
            umuVar = new umu(this, aolnVar);
        }
        java.lang.Object objL = umuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = umuVar.c;
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
        defpackage.zrw zrwVar = this.i;
        umuVar.c = 1;
        objL = zrwVar.l(umuVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objL).booleanValue()) {
            defpackage.zrw zrwVar2 = this.i;
            umuVar.c = 2;
            objL = zrwVar2.m(umuVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objL).booleanValue()) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.net.Uri uri, defpackage.aoln aolnVar) throws java.lang.Throwable {
        umv umvVar;
        java.lang.Object obj;
        java.lang.Integer num;
        if (aolnVar instanceof umv) {
            umvVar = (umv) aolnVar;
            int i = umvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                umvVar.d = i - Integer.MIN_VALUE;
            } else {
                umvVar = new umv(this, aolnVar);
            }
        } else {
            umvVar = new umv(this, aolnVar);
        }
        java.lang.Object objD = umvVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = umvVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = umvVar.a;
                defpackage.aooc.af(objD);
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarB = this.e.b();
        defpackage.aooh.e(ajcqVarB, "loadSpeedDialUiItems(...)");
        umvVar.a = uri;
        umvVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarB, umvVar);
        if (objD == aoluVar) {
            obj = uri;
            return aoluVar;
        }
        obj = uri;
        defpackage.aify aifyVar = (defpackage.aify) objD;
        defpackage.aooh.c(aifyVar);
        java.util.Iterator<E> it = aifyVar.iterator();
        if (it.hasNext()) {
            num = new java.lang.Integer(((upt) it.next()).d);
            while (it.hasNext()) {
                java.lang.Integer num2 = new java.lang.Integer(((upt) it.next()).d);
                if (num.compareTo(num2) < 0) {
                    num = num2;
                }
            }
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        defpackage.uqc uqcVar = this.e;
        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "starContact", 291, "SpeedDialUiItemMutator.java")).v("enter");
        defpackage.ajcq ajcqVarD = uqcVar.k.d(defpackage.ahqx.i(new upy(uqcVar, obj, iIntValue + 1, 0)), uqcVar.c);
        defpackage.aooh.e(ajcqVarD, "starContact(...)");
        umvVar.a = null;
        umvVar.d = 2;
        if (defpackage.aosv.D(ajcqVarD, umvVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        umw umwVar;
        java.lang.Object next;
        if (aolnVar instanceof umw) {
            umwVar = (umw) aolnVar;
            int i = umwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                umwVar.d = i - Integer.MIN_VALUE;
            } else {
                umwVar = new umw(this, aolnVar);
            }
        } else {
            umwVar = new umw(this, aolnVar);
        }
        java.lang.Object objD = umwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = umwVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = umwVar.a;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarB = this.e.b();
        defpackage.aooh.e(ajcqVarB, "loadSpeedDialUiItems(...)");
        umwVar.a = j;
        umwVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarB, umwVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        defpackage.aify aifyVar = (defpackage.aify) objD;
        defpackage.aooh.c(aifyVar);
        java.util.Iterator<E> it = aifyVar.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((upt) next).c != j);
        upt uptVar = (upt) next;
        if (uptVar == null) {
            ((defpackage.aimw) b.b().l("com/android/dialer/speeddial/bar/impl/controller/FavoritesBarDataService", "unstarContact", 91, "FavoritesBarDataService.kt")).v("No speedDialUiItem to remove");
            return defpackage.aojh.a;
        }
        defpackage.ajcq ajcqVarC = this.e.c(uptVar);
        defpackage.aooh.e(ajcqVarC, "removeSpeedDialUiItem(...)");
        umwVar.d = 2;
        objD = defpackage.aosv.D(ajcqVarC, umwVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    public final void d() {
        this.h.s(defpackage.ajcm.a, a);
    }
}
