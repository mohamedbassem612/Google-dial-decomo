package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uft {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/spam/inapp/storage/InAppSpamStorageImpl");
    public final defpackage.aoss a;
    public final defpackage.ufo b;
    private final defpackage.tvn d;

    public uft(defpackage.aoss aossVar, defpackage.ufo ufoVar, defpackage.tvn tvnVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (ufoVar == null) {
            defpackage.aooh.i("inAppSpamDatabase");
        }
        this.a = aossVar;
        this.b = ufoVar;
        this.d = tvnVar;
    }

    public final defpackage.ajcq a(java.lang.String str) {
        defpackage.aooh.f(str, "phoneNumber");
        return defpackage.aosv.F(this.a, 0, new txm(this, str, (defpackage.aoln) null, 10), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufp ufpVar;
        if (aolnVar instanceof ufp) {
            ufpVar = (ufp) aolnVar;
            int i = ufpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufpVar.c = i - Integer.MIN_VALUE;
            } else {
                ufpVar = new ufp(this, aolnVar);
            }
        } else {
            ufpVar = new ufp(this, aolnVar);
        }
        java.lang.Object objA = ufpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.ufo ufoVar = this.b;
            ufpVar.d = str;
            ufpVar.c = 1;
            objA = ufoVar.a(str, ufpVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ufpVar.d;
            defpackage.aooc.af(objA);
        }
        ufu ufuVar = (ufu) objA;
        if (ufuVar != null) {
            return this.d.i(ufuVar, str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufq ufqVar;
        if (aolnVar instanceof ufq) {
            ufqVar = (ufq) aolnVar;
            int i = ufqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufqVar.c = i - Integer.MIN_VALUE;
            } else {
                ufqVar = new ufq(this, aolnVar);
            }
        } else {
            ufqVar = new ufq(this, aolnVar);
        }
        java.lang.Object objB = ufqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufqVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.ufo ufoVar = this.b;
            ufqVar.c = 1;
            objB = ufoVar.b(list, ufqVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.Map) objB).entrySet()) {
            linkedHashMap.put(entry.getKey(), this.d.i((ufu) entry.getValue(), (java.lang.String) entry.getKey()));
        }
        return defpackage.ajsz.aS(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ufs ufsVar;
        if (aolnVar instanceof ufs) {
            ufsVar = (ufs) aolnVar;
            int i = ufsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufsVar.c = i - Integer.MIN_VALUE;
            } else {
                ufsVar = new ufs(this, aolnVar);
            }
        } else {
            ufsVar = new ufs(this, aolnVar);
        }
        java.lang.Object objD = ufsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ufsVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ufo ufoVar = this.b;
            vaa vaaVarBJ = defpackage.wsc.bJ(ufu.a.m());
            vaaVarBJ.p(2);
            ufu ufuVarO = vaaVarBJ.o();
            ufsVar.c = 1;
            objD = ufoVar.d(str, ufuVarO, ufsVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
        defpackage.aimz aimzVar = c;
        if (zBooleanValue) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/inapp/storage/InAppSpamStorageImpl", "storeSharpieVerdict", 135, "InAppSpamStorageImpl.kt")).v("InAppSpamStorage update Sharpie verdict successfully.");
        } else {
            ((defpackage.aimw) aimzVar.d().l("com/android/dialer/spam/inapp/storage/InAppSpamStorageImpl", "storeSharpieVerdict", 137, "InAppSpamStorageImpl.kt")).v("InAppSpamStorage failed to update Sharpie verdict.");
        }
        return defpackage.aojh.a;
    }
}
