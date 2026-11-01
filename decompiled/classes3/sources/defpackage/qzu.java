package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzu {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/promo/service/VoicePromoController");
    public final aoss b;
    public final long c;
    public final defpackage.znp d;
    public final zzx e;
    public final defpackage.yzr f;
    public final her g;
    private final zzx h;

    public qzu(aoss aossVar, defpackage.yzr yzrVar, zzx zzxVar, zzx zzxVar2, her herVar, long j) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(yzrVar, "promoCallState");
        this.b = aossVar;
        this.f = yzrVar;
        this.e = zzxVar;
        this.h = zzxVar2;
        this.g = herVar;
        this.c = j;
        this.d = new ler(this, 9);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.quo quoVar, aoln aolnVar) throws aois {
        defpackage.qzt qztVar;
        long j;
        if (aolnVar instanceof defpackage.qzt) {
            qztVar = (defpackage.qzt) aolnVar;
            int i = qztVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qztVar.c = i - Integer.MIN_VALUE;
            } else {
                qztVar = new defpackage.qzt(this, aolnVar);
            }
        } else {
            qztVar = new defpackage.qzt(this, aolnVar);
        }
        java.lang.Object objH = qztVar.a;
        aolu aoluVar = aolu.a;
        int i2 = qztVar.c;
        if (i2 == 0) {
            aooc.af(objH);
            java.lang.String strB = b(quoVar);
            her herVar = this.g;
            qztVar.d = quoVar;
            qztVar.c = 1;
            objH = herVar.H(strB, qztVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            quoVar = qztVar.d;
            aooc.af(objH);
        }
        defpackage.raa raaVar = (defpackage.raa) objH;
        if (raaVar == null) {
            return java.lang.Boolean.TRUE;
        }
        aigf aigfVarK = this.h.k();
        aooh.e(aigfVarK, "get(...)");
        defpackage.qun qunVarB = ((defpackage.quq) ((aoin) ajsz.aN(aigfVarK, quoVar)).a()).b();
        defpackage.qzz qzzVar = raaVar.c;
        if (qzzVar == null) {
            qzzVar = defpackage.qzz.a;
        }
        int iAR = a.aR(qzzVar.c);
        if (iAR == 0) {
            iAR = 1;
        }
        int i3 = iAR - 2;
        if (i3 == 1) {
            j = (qunVarB.b == 3 ? (defpackage.qul) qunVarB.c : defpackage.qul.a).d;
        } else {
            if (i3 != 2) {
                defpackage.qzz qzzVar2 = raaVar.c;
                if (qzzVar2 == null) {
                    qzzVar2 = defpackage.qzz.a;
                }
                int iAR2 = a.aR(qzzVar2.c);
                throw new java.lang.IllegalStateException("cool off type " + ((java.lang.Object) java.lang.Integer.toString((iAR2 != 0 ? iAR2 : 1) - 2)) + " not supported");
            }
            j = (qunVarB.b == 3 ? (defpackage.qul) qunVarB.c : defpackage.qul.a).e;
        }
        defpackage.qzz qzzVar3 = raaVar.c;
        if (qzzVar3 == null) {
            qzzVar3 = defpackage.qzz.a;
        }
        return java.lang.Boolean.valueOf(j$.time.Instant.ofEpochMilli(this.c).isAfter(j$.time.Instant.ofEpochMilli(qzzVar3.b).plusSeconds(j)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.String b(defpackage.quo quoVar) throws aois {
        aigf aigfVarK = this.h.k();
        aooh.e(aigfVarK, "get(...)");
        defpackage.qun qunVarB = ((defpackage.quq) ((aoin) ajsz.aN(aigfVarK, quoVar)).a()).b();
        defpackage.qum qumVarA = defpackage.qum.a(qunVarB.b);
        if (qumVarA == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        int iOrdinal = qumVarA.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalStateException("expected a promo, not an alert for center fragment key: ".concat(java.lang.String.valueOf(quoVar.name())));
        }
        if (iOrdinal == 1) {
            throw new java.lang.IllegalStateException("expected a promo, not an active content for center fragment key: ".concat(java.lang.String.valueOf(quoVar.name())));
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                throw new java.lang.IllegalStateException("expected a promo, not a default type for center fragment key: ".concat(java.lang.String.valueOf(quoVar.name())));
            }
            if (iOrdinal != 4) {
                throw new aois();
            }
            throw new java.lang.IllegalStateException("config type not set for center fragment key: ".concat(java.lang.String.valueOf(quoVar.name())));
        }
        java.lang.String str = (qunVarB.b == 3 ? (defpackage.qul) qunVarB.c : defpackage.qul.a).c;
        aooh.e(str, "getPersistenceKey(...)");
        if (str.length() <= 0) {
            throw new java.lang.IllegalStateException("promo persistenceKey not set for center fragment key: ".concat(java.lang.String.valueOf(quoVar.name())));
        }
        java.lang.String str2 = (qunVarB.b == 3 ? (defpackage.qul) qunVarB.c : defpackage.qul.a).c;
        aooh.e(str2, "getPersistenceKey(...)");
        return str2;
    }
}
