package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agts extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agts(aoln aolnVar, aogc aogcVar, java.lang.String str, java.util.ArrayList arrayList, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aogcVar;
        this.a = str;
        this.b = arrayList;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((ixh) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [aoub, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        boolean zN;
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            return ((apni) ((aogc) this.c).a).q((java.lang.String) this.a, (java.util.ArrayList) this.b);
        }
        if (i != 1) {
            aooc.af(obj);
            aify aifyVar = (aify) this.a.a(this.c);
            this.b.s((java.util.concurrent.CancellationException) null);
            return aifyVar;
        }
        aooc.af(obj);
        ixh ixhVar = (ixh) this.d;
        defpackage.her herVarM = defpackage.hhb.m(ixhVar.p());
        aoot aootVar = new aoot();
        aootVar.a = defpackage.ixg.UNSPECIFIED;
        alat<defpackage.ixd> alatVar = ixhVar.e;
        aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        boolean z = alatVar instanceof java.util.Collection;
        java.lang.Object obj2 = this.a;
        if (!z || !alatVar.isEmpty()) {
            for (defpackage.ixd ixdVar : alatVar) {
                java.lang.Object obj3 = this.b;
                int iOrdinal = defpackage.ixc.a(ixdVar.b).ordinal();
                if (iOrdinal == 0) {
                    java.lang.Object obj4 = this.c;
                    aootVar.a = defpackage.ixg.BOT;
                    java.lang.String string = ((ixt) obj4).e.getString(2132017507);
                    aooh.e(string, "getString(...)");
                    ((aoot) obj3).a = string;
                    zN = aooh.n((ixdVar.b == 1 ? (defpackage.ixe) ixdVar.c : defpackage.ixe.a).b, obj2);
                } else if (iOrdinal == 1) {
                    aootVar.a = defpackage.ixg.CUSTOM;
                    java.lang.String str = (ixdVar.b == 2 ? (defpackage.ixf) ixdVar.c : defpackage.ixf.a).e;
                    aooh.e(str, "getName(...)");
                    ((aoot) obj3).a = str;
                    zN = aooh.n((ixdVar.b == 2 ? (defpackage.ixf) ixdVar.c : defpackage.ixf.a).b, obj2);
                } else {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    zN = false;
                }
                if (zN) {
                    herVarM.i((java.lang.String) obj2);
                    herVarM.j((defpackage.ixg) aootVar.a);
                    return herVarM.h();
                }
            }
        }
        throw new java.lang.IllegalArgumentException(a.bk((java.lang.String) obj2, "Greeting with id ", " not found."));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.agts agtsVar;
        int i = this.$cid;
        if (i != 0) {
            ?? r3 = this.a;
            if (i != 1) {
                defpackage.agts agtsVar2 = new defpackage.agts(aolnVar, (aonj) r3, (android.os.CancellationSignal) this.c, (aoud) this.b, 2);
                agtsVar2.d = obj;
                return agtsVar2;
            }
            java.lang.String str = (java.lang.String) r3;
            agtsVar = new defpackage.agts(str, (aoot) this.b, (ixt) this.c, aolnVar, 1);
            agtsVar.d = obj;
        } else {
            java.lang.Object obj2 = this.c;
            aogc aogcVar = (aogc) obj2;
            agtsVar = new defpackage.agts(aolnVar, aogcVar, (java.lang.String) this.a, (java.util.ArrayList) this.b, 0);
            agtsVar.d = obj;
        }
        return agtsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agts(aoln aolnVar, aonj aonjVar, android.os.CancellationSignal cancellationSignal, aoud aoudVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonjVar;
        this.c = cancellationSignal;
        this.b = aoudVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agts(java.lang.String str, aoot aootVar, ixt ixtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
        this.b = aootVar;
        this.c = ixtVar;
    }
}
