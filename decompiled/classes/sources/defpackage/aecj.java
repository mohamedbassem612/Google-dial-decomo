package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecj {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final defpackage.ahyn b;

    public aecj(defpackage.ahyn ahynVar) {
        this.b = ahynVar;
    }

    public final java.lang.Object a(defpackage.adzy adzyVar, defpackage.aoln aolnVar) {
        defpackage.adzy adzyVar2 = defpackage.adzy.UNKNOWN;
        int iOrdinal = adzyVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? new defpackage.adub(null) : b(aolnVar);
        }
        return c(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        aech aechVar;
        if (aolnVar instanceof aech) {
            aechVar = (aech) aolnVar;
            int i = aechVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aechVar.c = i - Integer.MIN_VALUE;
            } else {
                aechVar = new aech(this, aolnVar);
            }
        } else {
            aechVar = new aech(this, aolnVar);
        }
        java.lang.Object obj = aechVar.a;
        int i2 = aechVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ((defpackage.aiob) a.c()).v("YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie");
            return new adtw(new java.lang.IllegalStateException("YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"), defpackage.adty.l);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            defpackage.aooc.af(obj);
            return new defpackage.adub(obj);
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).v("Failed getting YouTube visitor data cookie");
            return new adtw(e, defpackage.adty.m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Exception {
        defpackage.aeci aeciVar;
        if (aolnVar instanceof defpackage.aeci) {
            aeciVar = (defpackage.aeci) aolnVar;
            int i = aeciVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeciVar.c = i - Integer.MIN_VALUE;
            } else {
                aeciVar = new defpackage.aeci(this, aolnVar);
            }
        } else {
            aeciVar = new defpackage.aeci(this, aolnVar);
        }
        java.lang.Object objK = aeciVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeciVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.ahyn ahynVar = this.b;
            aeciVar.c = 1;
            objK = ((defpackage.tvn) ((defpackage.ahys) ahynVar).a).K(aeciVar);
            if (objK == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
        }
        java.lang.String str = ((com.google.android.gms.pseudonymous.PseudonymousIdToken) objK).a;
        if (str != null) {
            return new defpackage.adub(str);
        }
        ((defpackage.aiob) a.c()).v("Failed to get Zwieback ID");
        return new adtx(new java.lang.IllegalStateException("Failed to get Zwieback ID"), defpackage.adty.j);
    }
}
