package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfw {
    public static final defpackage.nfw a = new defpackage.nfw();
    public static final aimz b = aimz.i("com/android/dialer/dobby/impl/service/DobbyProducerModule");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.neu neuVar, aoln aolnVar) {
        defpackage.nfr nfrVar;
        if (aolnVar instanceof defpackage.nfr) {
            nfrVar = (defpackage.nfr) aolnVar;
            int i = nfrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfrVar.c = i - Integer.MIN_VALUE;
            } else {
                nfrVar = new defpackage.nfr(this, aolnVar);
            }
        } else {
            nfrVar = new defpackage.nfr(this, aolnVar);
        }
        java.lang.Object objC = nfrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nfrVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            nfrVar.c = 1;
            objC = neuVar.c(nfrVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return ((defpackage.nev) objC).ordinal() != 2 ? defpackage.nvp.EVENT_USER_ANSWER_SCREEN_SCREEN_CALL_BUTTON_PRODUCED : defpackage.nvp.EVENT_USER_ANSWER_SCREEN_ASK_IF_URGENT_BUTTON_PRODUCED;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.content.Context context, pgi pgiVar, defpackage.mqt mqtVar, ouj oujVar, aoln aolnVar) {
        defpackage.nfq nfqVar;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        ouj oujVar2;
        alsj alsjVar;
        int iW;
        int i2;
        int i3;
        if (aolnVar instanceof defpackage.nfq) {
            nfqVar = (defpackage.nfq) aolnVar;
            int i4 = nfqVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nfqVar.f = i4 - Integer.MIN_VALUE;
            } else {
                nfqVar = new defpackage.nfq(this, aolnVar);
            }
        } else {
            nfqVar = new defpackage.nfq(this, aolnVar);
        }
        java.lang.Object objQ = nfqVar.d;
        aolu aoluVar = aolu.a;
        int i5 = nfqVar.f;
        if (i5 != 0) {
            if (i5 == 1) {
                oujVar = (ouj) nfqVar.c;
                mqtVar = (defpackage.mqt) nfqVar.b;
                pgiVar = nfqVar.g;
                java.lang.Object obj3 = nfqVar.a;
                aooc.af(objQ);
                obj = obj3;
            } else {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                alsjVar = (alsj) nfqVar.c;
                oujVar2 = (ouj) nfqVar.b;
                java.lang.Object obj4 = nfqVar.a;
                aooc.af(objQ);
                obj2 = obj4;
            }
            oug ougVarA = oui.a();
            ougVarA.h(false);
            ougVarA.f(oujVar2);
            ougVarA.e(alsjVar.d);
            iW = ahus.w(alsjVar.e);
            if (iW == 0) {
                iW = 1;
            }
            i2 = iW - 1;
            if (i2 != 1 || i2 == 3) {
                i3 = 2131231052;
            } else {
                i3 = 2131231988;
            }
            ougVarA.d(i3);
            int i6 = alsjVar.e;
            ougVarA.g(j$.util.Optional.of(new java.lang.Integer(((android.content.Context) obj2).getColor(2131099848))));
            return ougVarA.a();
        }
        aooc.af(objQ);
        int iOrdinal = oujVar.ordinal();
        if (iOrdinal == 4) {
            i = 0;
        } else {
            if (iOrdinal != 5) {
                java.util.Objects.toString(oujVar);
                throw new java.lang.IllegalArgumentException("chip priority: ".concat(java.lang.String.valueOf(oujVar)));
            }
            i = 1;
        }
        nfqVar.a = context;
        nfqVar.g = pgiVar;
        nfqVar.b = mqtVar;
        nfqVar.c = oujVar;
        nfqVar.f = 1;
        objQ = pgiVar.q(i, nfqVar);
        obj = context;
        if (objQ == aoluVar) {
            return aoluVar;
        }
        alsj alsjVar2 = (alsj) objQ;
        if (alsjVar2 == null) {
            return null;
        }
        b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyProducerModule", "generatePostScreeningQuickReplyChip", 696, "DobbyProducerModule.kt").y("generatePostScreeningQuickReplyChip ready :%s", oujVar);
        nfqVar.a = obj;
        nfqVar.g = pgiVar;
        nfqVar.b = oujVar;
        nfqVar.c = alsjVar2;
        nfqVar.f = 2;
        if (mqtVar.j(alsjVar2, nfqVar) == aoluVar) {
            return aoluVar;
        }
        obj2 = obj;
        oujVar2 = oujVar;
        alsjVar = alsjVar2;
        oug ougVarA2 = oui.a();
        ougVarA2.h(false);
        ougVarA2.f(oujVar2);
        ougVarA2.e(alsjVar.d);
        iW = ahus.w(alsjVar.e);
        if (iW == 0) {
            iW = 1;
        }
        i2 = iW - 1;
        if (i2 != 1) {
            i3 = 2131231052;
        } else {
            i3 = 2131231052;
        }
        ougVarA2.d(i3);
        int i7 = alsjVar.e;
        ougVarA2.g(j$.util.Optional.of(new java.lang.Integer(((android.content.Context) obj2).getColor(2131099848))));
        return ougVarA2.a();
    }
}
