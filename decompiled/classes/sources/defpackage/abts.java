package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abts {
    public static volatile defpackage.ahbz a;

    private abts() {
    }

    public static final void A(abod abodVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(696971751);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(abodVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f), 8.0f, 0.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(4.0f), defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAZ);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.W(defpackage.aehj.aL(abodVar.a, cavVarB), null, defpackage.azm.g(cmtVar, 12.0f), defpackage.den.ak(cavVarB).s, cavVarB, 384, 0);
            cmwVar = cmtVar;
            defpackage.afsq.bm(new abfr(abodVar.b, abodVar.c), null, defpackage.den.ak(cavVarB).s, 0L, null, 2, false, 1, defpackage.den.an(cavVarB).l, cavVarB, 102236160, 186);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(abodVar, cmwVar2, i, 8, (byte[]) null);
        }
    }

    public static final void B(aboe aboeVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(230876711);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(aboeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (!cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cavVarB.s();
            defpackage.cdk cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abkl(aboeVar, i, 14);
                return;
            }
            return;
        }
        defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.cmw.c, 1.0f);
        defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g(8.0f, defpackage.cmh.k), defpackage.cmh.n, cavVarB, 54);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        int iM = defpackage.anty.M(cbtVar.x);
        defpackage.cje cjeVarAi = cbtVar.ai();
        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
        defpackage.aomy aomyVar = defpackage.dam.a;
        cavVarB.v();
        if (cbtVar.w) {
            cavVarB.j(aomyVar);
        } else {
            cavVarB.x();
        }
        defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
        defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
        defpackage.cev.b(cavVarB, defpackage.dam.g);
        defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
        throw null;
    }

    public static final void C(abom abomVar, abof abofVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.cmi cmiVar;
        long j;
        long j2;
        float f;
        defpackage.cmj cmjVar;
        float f2;
        defpackage.aooh.f(abomVar, "<this>");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1855555903);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abofVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            int i5 = abofVar.g;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            if (i5 - 1 != 0) {
                cavVarB.u(-1657524917);
                cmiVar = defpackage.cmh.l;
                defpackage.cmj cmjVar2 = defpackage.cmh.c;
                j = defpackage.den.ak(cavVarB).K;
                j2 = defpackage.den.ak(cavVarB).M;
                ((defpackage.cbt) cavVarB).W(false);
                cmjVar = cmjVar2;
                f = 60.0f;
                f2 = 0.0f;
            } else {
                cavVarB.u(-1657802584);
                cmiVar = defpackage.cmh.j;
                defpackage.cmj cmjVar3 = defpackage.cmh.a;
                j = defpackage.den.ak(cavVarB).F;
                j2 = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
                f = 0.0f;
                cmjVar = cmjVar3;
                f2 = 60.0f;
            }
            defpackage.cmw cmwVarBa = defpackage.den.ba(defpackage.azm.d(cmtVar, 1.0f), f, 0.0f, f2, 0.0f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVarB, 0);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBa);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cmwVar2 = cmtVar;
            defpackage.bvo.b(null, defpackage.den.am(cavVarB).f, j, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(147351182, new bok(abofVar, j2, 3), cavVarB), cavVarB, 121);
            cavVarB = cavVarB;
            boolean z2 = abomVar.c == null ? abomVar.a : abomVar.b;
            aboj abojVar = abofVar.e;
            if ((abojVar instanceof aboh) && !z2) {
                abojVar = aboj.a;
            }
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new abiy(9);
                cbtVar.ab(objR);
            }
            defpackage.uu.a(abojVar, null, (defpackage.aonj) objR, cmjVar, null, null, defpackage.cfo.j(-883874267, new abon(abofVar, abomVar, z), cavVarB), cavVarB, 1573248, 50);
            cbtVar.W(true);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(abomVar, abofVar, cmwVar2, z, i, 12);
        }
    }

    public static final void D(aboq aboqVar, defpackage.cmw cmwVar, defpackage.bbh bbhVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.ayy ayyVar2;
        defpackage.bbh bbhVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1091580861);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(aboqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(ayyVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & (-897);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                bbhVar = defpackage.bbj.a(cavVarB);
            } else {
                cavVarB.s();
            }
            defpackage.bbh bbhVar3 = bbhVar;
            cavVarB.l();
            java.util.List list = aboqVar.a;
            boolean z = aboqVar.c;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new abiy(10);
                cbtVar.ab(objR);
            }
            E(list, (defpackage.aonj) objR, cmwVar, z, bbhVar3, ayyVar, abob.a, cavVarB, ((i4 << 3) & 896) | 12582960 | ((i4 << 9) & 3670016));
            cmwVar2 = cmwVar;
            ayyVar2 = ayyVar;
            bbhVar2 = bbhVar3;
        } else {
            cmwVar2 = cmwVar;
            ayyVar2 = ayyVar;
            cavVarB.s();
            bbhVar2 = bbhVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abns(aboqVar, cmwVar2, bbhVar2, ayyVar2, i, 2);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r30v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r30v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r30v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void E(java.util.List r22, defpackage.aonj r23, defpackage.cmw r24, boolean r25, defpackage.bbh r26, defpackage.ayy r27, defpackage.aonp r28, defpackage.cav r29, int r30) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abts.E(java.util.List, aonj, cmw, boolean, bbh, ayy, aonp, cav, int):void");
    }

    public static final defpackage.abmy F(defpackage.cav cavVar) {
        return (defpackage.abmy) cavVar.e(defpackage.abmz.a);
    }

    public static final defpackage.abnc G(defpackage.cav cavVar) {
        return (defpackage.abnc) cavVar.e(defpackage.abnd.a);
    }

    public static final defpackage.abnk H(defpackage.cav cavVar) {
        return (defpackage.abnk) cavVar.e(defpackage.abno.a);
    }

    public static final defpackage.abnz I(defpackage.cav cavVar) {
        return (defpackage.abnz) cavVar.e(defpackage.aboa.a);
    }

    public static final defpackage.acqy J(defpackage.cav cavVar) {
        return F(cavVar).a;
    }

    public static final boolean K(defpackage.cav cavVar) {
        return F(cavVar).g;
    }

    public static final defpackage.dmq L(abmv abmvVar) {
        dna dnaVar;
        dna dnaVar2;
        dmz dmzVar;
        dmz dmzVar2;
        dmz dmzVar3;
        java.lang.Integer num = abmvVar.a;
        defpackage.dmp[] dmpVarArr = new defpackage.dmp[1];
        defpackage.dmy[] dmyVarArr = new defpackage.dmy[6];
        if (num != null) {
            int i = defpackage.dnc.a;
            int iIntValue = num.intValue();
            if (iIntValue <= 0 || iIntValue >= 1001) {
                dnv.b(defpackage.a.bj(iIntValue, "'wght' value must be in [1, 1000]. Actual: "));
            }
            dnaVar = new dna("wght", iIntValue);
        } else {
            dnaVar = null;
        }
        dmyVarArr[0] = dnaVar;
        java.lang.Integer num2 = abmvVar.b;
        if (num2 != null) {
            int i2 = defpackage.dnc.a;
            int iIntValue2 = num2.intValue();
            if (iIntValue2 < -1000 || iIntValue2 >= 1001) {
                dnv.b("'GRAD' must be in -1000..1000");
            }
            dnaVar2 = new dna("GRAD", iIntValue2);
        } else {
            dnaVar2 = null;
        }
        dmyVarArr[1] = dnaVar2;
        java.lang.Float f = abmvVar.c;
        if (f != null) {
            int i3 = defpackage.dnc.a;
            float fFloatValue = f.floatValue();
            if (fFloatValue < -90.0f || fFloatValue > 90.0f) {
                dnv.b("'slnt' must be in -90f..90f. Actual: " + fFloatValue);
            }
            dmzVar = new dmz("slnt", fFloatValue);
        } else {
            dmzVar = null;
        }
        dmyVarArr[2] = dmzVar;
        java.lang.Float f2 = abmvVar.d;
        if (f2 != null) {
            int i4 = defpackage.dnc.a;
            float fFloatValue2 = f2.floatValue();
            if (fFloatValue2 <= 0.0f) {
                dnv.b("'wdth' must be strictly > 0.0f. Actual: " + fFloatValue2);
            }
            dmzVar2 = new dmz("wdth", fFloatValue2);
        } else {
            dmzVar2 = null;
        }
        dmyVarArr[3] = dmzVar2;
        java.lang.Float f3 = abmvVar.e;
        if (f3 != null) {
            int i5 = defpackage.dnc.a;
            float fFloatValue3 = f3.floatValue();
            if (fFloatValue3 < 0.0f || fFloatValue3 > 100.0f) {
                throw new java.lang.IllegalArgumentException("'ROND' must be in 0..100");
            }
            dmzVar3 = new dmz("ROND", fFloatValue3);
        } else {
            dmzVar3 = null;
        }
        dmyVarArr[4] = dmzVar3;
        dmyVarArr[5] = null;
        defpackage.dmy[] dmyVarArr2 = (defpackage.dmy[]) defpackage.ajsz.bc(dmyVarArr).toArray(new defpackage.dmy[0]);
        dmpVarArr[0] = new defpackage.dnh(2131296309, defpackage.dnd.e, new defpackage.dnb((defpackage.dmy[]) java.util.Arrays.copyOf(dmyVarArr2, dmyVarArr2.length)));
        return defpackage.dez.e(dmpVarArr);
    }

    public static final void M(java.lang.String str, abms abmsVar, defpackage.cmw cmwVar, defpackage.dot dotVar, long j, int i, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.dot dotVar2;
        defpackage.aooh.f(str, "text");
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1274160571);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(abmsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            dotVar2 = dotVar;
            i3 |= true != cavVarB.B(dotVar2) ? 1024 : 2048;
        } else {
            dotVar2 = dotVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.A(j) ? 8192 : 16384;
        }
        int i6 = i3 | 196608;
        if (cavVarB.H((74899 & i6) != 74898, i6 & 1)) {
            defpackage.rz.f(cmwVar, null, defpackage.cfo.j(986192815, new abmt(str, abmsVar, j, dotVar2), cavVarB), cavVarB, ((i6 >> 6) & 14) | 3072);
        } else {
            cavVarB.s();
            i5 = i;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmu(str, abmsVar, cmwVar, dotVar, j, i5, i2);
        }
    }

    public static final defpackage.dkz N(defpackage.dkz dkzVar, long j) {
        defpackage.aooh.f(dkzVar, "$this$withFontSize");
        long jI = dkzVar.i();
        float fA = defpackage.dps.a(j);
        defpackage.dpy.i(jI);
        long jH = defpackage.dpy.h(jI & 1095216660480L, defpackage.dps.a(jI) * fA);
        float fA2 = defpackage.dps.a(dkzVar.g());
        defpackage.dpy.i(jH);
        return defpackage.dkz.z(dkzVar, 0L, j, null, null, null, null, 0L, 0L, null, 0, defpackage.dpy.h(1095216660480L & jH, defpackage.dps.a(jH) / fA2), null, null, 0, 0, 16646141);
    }

    public static final ely O(float f, float f2, float f3) {
        return (f == 1.0f && f2 == 1.0f) ? avo.r(12) : avo.s(12, f2, f, new elk(f3, 0.0f), (elk) null, 240);
    }

    public static final long P(defpackage.ccp ccpVar) {
        return ((defpackage.dpk) ccpVar.a()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r35v0, types: [cav] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.cmw Q(defpackage.cmw cmwVar, int i, boolean z, boolean z2, defpackage.aomy aomyVar, defpackage.cav cavVar, int i2, int i3) {
        defpackage.aomy aomyVar2;
        java.lang.Object akxmVar;
        boolean z3;
        java.lang.Object obj;
        defpackage.cbt cbtVar;
        int i4;
        boolean z4;
        defpackage.cmw cmwVarBn = cmwVar;
        defpackage.aooh.f(cmwVarBn, "<this>");
        abmk abmkVar = (i3 & 4) != 0 ? abmk.a : null;
        boolean zU = (i3 & 16) != 0 ? U((android.content.Context) cavVar.e(defpackage.dep.b)) : z2;
        if ((i3 & 32) != 0) {
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVar;
            java.lang.Object objR = cbtVar2.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.uoq(17);
                cbtVar2.ab(objR);
            }
            aomyVar2 = (defpackage.aomy) objR;
        } else {
            aomyVar2 = aomyVar;
        }
        defpackage.cbt cbtVar3 = (defpackage.cbt) cavVar;
        java.lang.Object objR2 = cbtVar3.R();
        java.lang.Object obj2 = defpackage.cau.a;
        if (objR2 == obj2) {
            objR2 = new abiy(8);
            cbtVar3.ab(objR2);
        }
        defpackage.aonj aonjVar = (defpackage.aonj) objR2;
        boolean z5 = (((i2 & 57344) ^ 24576) > 16384 && cavVar.B(null)) || (i2 & 24576) == 16384;
        java.lang.Object objR3 = cbtVar3.R();
        if (z5 || objR3 == obj2) {
            objR3 = new defpackage.bfz(32.0f);
            cbtVar3.ab(objR3);
        }
        defpackage.bfy bfyVar = (defpackage.bfy) objR3;
        if (zU) {
            cavVar.u(1878115897);
            int i5 = i2 >> 3;
            java.lang.Object objR4 = cbtVar3.R();
            defpackage.aomy aomyVar3 = aomyVar2;
            if (objR4 == obj2) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dpk(0L), defpackage.cdu.c);
                cbtVar3.ab(parcelableSnapshotMutableState);
                objR4 = parcelableSnapshotMutableState;
            }
            int i6 = (i2 & 8190) | (i5 & 458752) | (3670016 & i5);
            defpackage.ccp ccpVar = (defpackage.ccp) objR4;
            boolean z6 = (((i6 & 896) ^ 384) > 256 && cavVar.C(z)) || (i6 & 384) == 256;
            java.lang.Object objR5 = cbtVar3.R();
            if (z6 || objR5 == obj2) {
                objR5 = new androidx.compose.runtime.ParcelableSnapshotMutableState(z ? agiz.c : agiz.e, defpackage.cdu.c);
                cbtVar3.ab(objR5);
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) objR5;
            defpackage.dpf dpfVar = (defpackage.dpf) cavVar.e(defpackage.dfo.e);
            abml abmlVar = new abml(defpackage.den.ak(cavVar), F(cavVar), K(cavVar));
            defpackage.bor borVar = abmlVar.a;
            defpackage.abmy abmyVar = abmlVar.b;
            boolean z7 = abmlVar.c;
            abmk abmkVar2 = abmkVar;
            boolean zB = cavVar.B(borVar) | cavVar.B(abmyVar) | cavVar.C(z7) | ((((i6 & 112) ^ 48) > 32 && cavVar.z(i + (-1))) || (i6 & 48) == 32);
            java.lang.Object objR6 = cbtVar3.R();
            if (zB || objR6 == obj2) {
                if (i - 1 != 2) {
                    long jS = S(i, borVar, abmyVar);
                    amnm amnmVarR = R(jS);
                    long j = borVar.a;
                    long j2 = borVar.f;
                    long j3 = borVar.j;
                    long j4 = borVar.p;
                    amnm amnmVarR2 = R(j);
                    R(j2);
                    java.util.List listC = amnj.c(amnmVarR, amnmVarR2, R(j3), R(j4), false, 0, amnk.a);
                    objR6 = new abmm(defpackage.cfd.L(jS), ((amnm) listC.get(0)).d, ((amnm) listC.get(1)).d);
                } else {
                    objR6 = new abmm(defpackage.cfd.L(abmyVar.u), defpackage.cfd.L(abmyVar.s), defpackage.cfd.L(true != z7 ? -10073527965188096L : -7765429720186880L));
                }
                cbtVar3.ab(objR6);
            } else {
                ccpVar2 = ccpVar2;
            }
            abmm abmmVar = (abmm) objR6;
            boolean zY = cavVar.y(dpfVar.a()) | cavVar.B(abmmVar) | cavVar.B(bfyVar) | ((((i6 & 7168) ^ 3072) > 2048 && cavVar.z(abmkVar2.ordinal())) || (i6 & 3072) == 2048);
            java.lang.Object objR7 = cbtVar3.R();
            if (zY || objR7 == obj2) {
                dpfVar.a();
                z3 = false;
                obj = obj2;
                cbtVar = cbtVar3;
                i4 = 1;
                akxmVar = new akxm(abmmVar, new abmn(ccpVar, 0), new abmn(ccpVar, 2), bfyVar, abmkVar2);
                cbtVar.ab(akxmVar);
            } else {
                akxmVar = objR7;
                cbtVar = cbtVar3;
                obj = obj2;
                z3 = false;
                i4 = 1;
            }
            akxm akxmVar2 = (akxm) akxmVar;
            boolean zB2 = cavVar.B(akxmVar2);
            java.lang.Object objR8 = cbtVar.R();
            if (zB2 || objR8 == obj) {
                defpackage.aooh.f(akxmVar2, "<this>");
                abmi abmiVar = new abmi((abmm) akxmVar2.a, (abmk) akxmVar2.d);
                defpackage.aooh.f(akxmVar2, "<this>");
                agja agjaVarH = abmiVar.h();
                z4 = z3;
                aglw[] aglwVarArr = new aglw[3];
                int i7 = i4;
                agle agleVar = agln.a;
                aglwVarArr[z4 ? 1 : 0] = new aglw(agln.e, new abgd(akxmVar2, 19));
                aglwVarArr[i7] = new aglw(agln.f, new abgd(akxmVar2, 20));
                aglwVarArr[2] = new aglw(agln.g, new abmn(akxmVar2, i7));
                defpackage.ucm ucmVar = new defpackage.ucm(new alln(aglwVarArr), abmiVar.h());
                ?? r6 = ucmVar.a;
                r6.put(agiz.b, agmc.I(new abph(abmiVar, 16)));
                r6.put(agiz.c, agmc.I(new abph(abmiVar, 17)));
                r6.put(agiz.d, agmc.I(new abph(abmiVar, 18)));
                r6.put(agiz.e, agmc.I(new abph(abmiVar, 19)));
                java.lang.Object obj3 = ucmVar.b;
                java.util.List listBX = defpackage.ajsz.bX(r6.entrySet(), new aeov(2));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = listBX.iterator();
                while (it.hasNext()) {
                    java.util.List listA = ((agjw) ((java.util.Map.Entry) it.next()).getValue()).a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listA, 10));
                    java.util.Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((agka) it2.next()).d);
                    }
                    defpackage.ajsz.bv(arrayList, arrayList2);
                }
                java.util.List listBT = defpackage.ajsz.bT(defpackage.ajsz.aY(ucmVar.c), defpackage.ajsz.bZ(arrayList));
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(listBT, 10));
                java.util.Iterator it3 = listBT.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((agja) it3.next()).a());
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it4 = listBT.iterator();
                ?? r7 = r6;
                while (it4.hasNext()) {
                    java.util.Map mapA = ((agja) it4.next()).a();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    ?? r8 = r7;
                    for (java.util.Map.Entry entry : mapA.entrySet()) {
                        java.util.Iterator it5 = it4;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        ?? r9 = r8;
                        for (java.lang.Object obj4 : arrayList3) {
                            ?? r21 = r9;
                            java.lang.Object obj5 = obj3;
                            java.util.ArrayList arrayList6 = arrayList3;
                            if (!defpackage.aooh.n(((java.util.Map) obj4).get(entry.getKey()), entry.getValue())) {
                                arrayList5.add(obj4);
                            }
                            arrayList3 = arrayList6;
                            r9 = r21;
                            obj3 = obj5;
                        }
                        ?? r22 = r9;
                        java.lang.Object obj6 = obj3;
                        java.util.ArrayList arrayList7 = arrayList3;
                        if (!arrayList5.isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                        it4 = it5;
                        arrayList3 = arrayList7;
                        r8 = r22;
                        obj3 = obj6;
                    }
                    defpackage.ajsz.bv(arrayList4, linkedHashMap.keySet());
                    it4 = it4;
                    r7 = r8;
                }
                ?? r23 = r7;
                java.lang.Object obj7 = obj3;
                java.util.Set setCf = defpackage.ajsz.cf(arrayList4);
                java.util.ArrayList arrayList8 = new java.util.ArrayList(r23.size());
                for (java.util.Map.Entry entry2 : r23.entrySet()) {
                    java.lang.Object key = entry2.getKey();
                    agjw agjwVar = (agjw) entry2.getValue();
                    java.lang.Object obj8 = ((agjv) agjwVar).b;
                    if (obj8 == null) {
                        obj8 = obj7;
                    }
                    ((agjv) agjwVar).b = (alln) obj8;
                    defpackage.aooh.f(agjwVar, "<this>");
                    abdu abduVar = new abdu(agjwVar, setCf, 20, (byte[]) null);
                    agjw agjwVar2 = new agjw((byte[]) null);
                    abduVar.a(agjwVar2);
                    arrayList8.add(new defpackage.aoiu(key, new agju(agjwVar2.c, ((agjv) agjwVar2).a, ((agjv) agjwVar2).b)));
                }
                objR8 = new afpl(agjaVarH, defpackage.ajsz.aR(arrayList8));
                cbtVar.ab(objR8);
            } else {
                z4 = z3;
            }
            afpl afplVar = (afpl) objR8;
            cavVar.u(656918744);
            boolean zB3 = cavVar.B(dpfVar);
            java.lang.Object objR9 = cbtVar.R();
            if (zB3 || objR9 == obj) {
                objR9 = new abdu(dpfVar, ccpVar, 8);
                cbtVar.ab(objR9);
            }
            cmwVarBn = defpackage.wi.g(cmwVar, (defpackage.aonj) objR9);
            if (!defpackage.anty.ah(P(ccpVar), 0L) && av(ccpVar2) != agiz.b) {
                java.lang.Object obj9 = afplVar.a;
                defpackage.cmt cmtVar = defpackage.cmw.c;
                agiz agizVarAv = av(ccpVar2);
                ?? r10 = afplVar.b;
                defpackage.ccp ccpVar3 = ccpVar2;
                boolean zB4 = cavVar.B(aonjVar) | cavVar.B(ccpVar3);
                java.lang.Object objR10 = cbtVar.R();
                if (zB4 || objR10 == obj) {
                    objR10 = new zjn(aonjVar, ccpVar3, 12);
                    cbtVar.ab(objR10);
                }
                defpackage.aonn aonnVar = (defpackage.aonn) objR10;
                java.util.concurrent.Executor executorM = ft$.ExternalSyntheticApiModelOutline0.m((android.content.Context) cavVar.e(defpackage.dep.b));
                defpackage.aooh.f(cmtVar, "<this>");
                defpackage.aooh.f(agizVarAv, "state");
                defpackage.aooh.f(r10, "stateMap");
                defpackage.aooh.f(aonnVar, "onStateAnimationFinished");
                defpackage.aooh.f(aomyVar3, "timeSupplierMs");
                agja agjaVar = (agja) obj9;
                agkt agktVar = new agkt(agjaVar, agizVarAv, (java.util.Map) r10, aonnVar, executorM, aomyVar3);
                float[] fArr = agjaVar.a.d;
                defpackage.cmw cmwVarBa = defpackage.den.ba(agktVar, aglz.c(fArr) + 0.0f, aglz.e(fArr) + 0.0f, aglz.d(fArr) + 0.0f, aglz.a(fArr) + 0.0f);
                defpackage.bgc bgcVar = defpackage.bge.a;
                cmwVarBn = cmwVarBn.a(defpackage.cfd.K(cmwVarBa, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, new defpackage.bgc(bfyVar, bfyVar, bfyVar, bfyVar), true, 0, 1042431));
            }
            boolean z8 = z4;
            cbtVar.W(z8);
            cbtVar.W(z8);
        } else {
            boolean z9 = false;
            cavVar.u(1878387116);
            defpackage.ccp ccpVar4 = agiz.a;
            int iOrdinal = abmkVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                cavVar.u(1451030410);
                long jS2 = S(i, defpackage.den.ak(cavVar), F(cavVar));
                defpackage.bgc bgcVar2 = defpackage.bge.a;
                cmwVarBn = defpackage.den.bn(cmwVarBn, jS2, new defpackage.bgc(bfyVar, bfyVar, bfyVar, bfyVar));
                z9 = false;
                cbtVar3.W(false);
            } else {
                if (iOrdinal != 2) {
                    cavVar.u(-507385860);
                    cbtVar3.W(false);
                    throw new defpackage.aois();
                }
                cavVar.u(-507384430);
                cbtVar3.W(false);
            }
            cbtVar3.W(z9);
        }
        return cmwVarBn;
    }

    public static final amnm R(long j) {
        return new amnm(defpackage.cfd.L(j));
    }

    public static final long S(int i, defpackage.bor borVar, defpackage.abmy abmyVar) {
        defpackage.aooh.f(abmyVar, "abcColorScheme");
        int i2 = i - 1;
        if (i2 != 2) {
            return i2 != 3 ? borVar.F : borVar.p;
        }
        return abmyVar.u;
    }

    public static final abmr T(hwv hwvVar, java.lang.String str, abms abmsVar, long j) {
        java.lang.Object next;
        defpackage.dkz dkzVar;
        defpackage.aooh.f(hwvVar, "$this$measureTextFlow");
        defpackage.aooh.f(str, "text");
        int i = abmsVar.e;
        defpackage.dkz dkzVar2 = abmsVar.a;
        int i2 = i - 1;
        defpackage.dkz dkzVarN = N(dkzVar2, abmsVar.b);
        if (i2 == 0) {
            int i3 = abmsVar.c;
            defpackage.dkw dkwVarD = hwv.d(hwvVar, str, dkzVar2, i3, j);
            if (!dkwVarD.l()) {
                return new abmr(dkzVar2, dkwVarD.c(), false);
            }
            if (hwv.d(hwvVar, str, dkzVarN, i3, j).l()) {
                return au(abmsVar, dkzVarN);
            }
            abmr abmrVarAw = aw(abmsVar, hwvVar, str, j, i3);
            return abmrVarAw == null ? au(abmsVar, dkzVarN) : abmrVarAw;
        }
        defpackage.dkw dkwVarD2 = hwv.d(hwvVar, str, dkzVar2, 1, j);
        if (!dkwVarD2.l()) {
            return new abmr(dkzVar2, dkwVarD2.c(), false);
        }
        aopp it = new defpackage.aopq(1, abmsVar.c).iterator();
        do {
            if (!it.a) {
                next = null;
                break;
            }
            next = it.next();
            dkzVar = dkzVarN;
            dkzVarN = dkzVar;
        } while (hwv.d(hwvVar, str, dkzVar, ((java.lang.Number) next).intValue(), j).l());
        java.lang.Integer num = (java.lang.Integer) next;
        if (num == null) {
            return au(abmsVar, dkzVarN);
        }
        abmr abmrVarAw2 = aw(abmsVar, hwvVar, str, j, num.intValue());
        return abmrVarAw2 == null ? au(abmsVar, dkzVarN) : abmrVarAw2;
    }

    public static final boolean U(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(context, "context");
        return context.getPackageManager().hasSystemFeature("com.google.android.feature.GEMINI_INTELLIGENCE_EXPERIENCE");
    }

    public static final defpackage.cmw V(defpackage.cmw cmwVar, boolean z, defpackage.aomy aomyVar, defpackage.aomy aomyVar2) {
        defpackage.aooh.f(cmwVar, "<this>");
        if (aomyVar != null) {
            cmwVar = cmwVar.a(defpackage.den.bj(defpackage.cmw.c, z, null, null, aomyVar));
        }
        if (aomyVar2 == null) {
            return cmwVar;
        }
        defpackage.cmw cmwVarCa = defpackage.cmw.c;
        if (!z) {
            cmwVarCa = defpackage.den.ca(cmwVarCa, null, null, true, null, aomyVar2);
        }
        return cmwVar.a(cmwVarCa);
    }

    public static final void W(ablg ablgVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1922714312);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.den.ba(defpackage.cmw.c, 32.0f, 16.0f, 32.0f, 8.0f);
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(ablgVar, i, 13);
        }
    }

    public static final void X(ablk ablkVar, abls ablsVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1430069035);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablsVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(ablkVar, ablsVar, i, 4);
        }
    }

    public static final void Y(ablk ablkVar, abma abmaVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(107367253);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abmaVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2;
            java.lang.String str = abmaVar.a;
            java.util.List list = abmaVar.b;
            cavVarB.u(-1172096393);
            ((defpackage.cbt) cavVarB).W(false);
            ap(ablkVar, str, true, null, list, null, null, null, null, null, cavVarB, i4 & 14, 0, 512);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(ablkVar, abmaVar, i, 3);
        }
    }

    public static final void Z(ablk ablkVar, abja abjaVar, java.lang.String str, java.util.List list, int i, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.aooh.f(str, "text");
        defpackage.aooh.f(list, "annotations");
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-239924596);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(abjaVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.B(str) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.z(0) ? 8192 : 16384;
        }
        if (cavVarB.H((i3 & 9363) != 9362, i3 & 1)) {
            cavVarB.u(-767805620);
            defpackage.cmw cmwVarBa = defpackage.den.ba(defpackage.cmw.c, 12.0f, 0.0f, 0.0f, 0.0f);
            defpackage.aonn aonnVarAq = aq(abjaVar, true);
            int i5 = acpz.a;
            defpackage.aaoo.U(able.a, cmwVarBa, defpackage.cfo.j(-1505572059, new zjn(str, list, 11, (byte[]) null), cavVarB), aonnVarAq, null, acpz.a(defpackage.den.ak(cavVarB).F, cavVarB, 510), cavVarB, 3078, 420);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abje(ablkVar, abjaVar, str, list, 1, i2, 5);
        }
    }

    public static java.util.concurrent.Executor a(defpackage.absq absqVar) {
        if (n(absqVar.a)) {
            defpackage.aazc aazcVar = defpackage.aang.a;
            return defpackage.aazc.w(10);
        }
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler = abtv.a;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue(10);
        defpackage.annk annkVar = new defpackage.annk(null, null, null);
        annkVar.o("ConsentVerifierLibraryThread-%d");
        return new java.util.concurrent.ThreadPoolExecutor(0, 10, 10L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue, defpackage.annk.p(annkVar), abtv.a);
    }

    public static final void aa(java.lang.String str, java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1004132711);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.afsq.bm(new abfr(str, list), cmwVar2, defpackage.den.ak(cavVarB).s, 0L, new defpackage.dot(3), 0, false, 0, defpackage.den.an(cavVarB).k, cavVar2, (i2 >> 3) & 112, 472);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(str, list, cmwVar, i, 8);
        }
    }

    public static final void ab(ably ablyVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(666469952);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            long jM = defpackage.cfd.M(0);
            int i4 = acpz.a;
            acpz.a(jM, cavVarB, 510);
            defpackage.azm.d(defpackage.cmw.c, 1.0f);
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(ablyVar, i, 12);
        }
    }

    public static final void ac(ablk ablkVar, abln ablnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(964592325);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablnVar) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
            defpackage.cdk cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abmg(ablkVar, ablnVar, i, 1);
                return;
            }
            return;
        }
        int i4 = i2 & 112;
        defpackage.cmt cmtVar = defpackage.cmw.c;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        java.lang.Object objR = cbtVar.R();
        if (i4 == 32 || objR == defpackage.cau.a) {
            objR = new abiy(5);
            cbtVar.ab(objR);
        }
        defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR);
        throw null;
    }

    public static final void ad(ablr ablrVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(555518444);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(ablrVar, i, 11);
        }
    }

    public static final void ae(ablw ablwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(240481119);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            int i4 = i2 & 14;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 4 || objR == defpackage.cau.a) {
                objR = new abgj(ablwVar, 16);
                cbtVar.ab(objR);
            }
            ah(ablwVar.a, ablwVar.c, ablwVar.d, ablwVar.e, defpackage.cfo.j(1849923028, new abkv(ablwVar, 4), cavVarB), defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR), cavVarB, 1572864);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(ablwVar, i, 10);
        }
    }

    public static final void af(ablk ablkVar, ablx ablxVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(92548243);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablxVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(ablkVar, ablxVar, i, 2);
        }
    }

    public static final void ag(ablk ablkVar, ablz ablzVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2130858779);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablzVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 112;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 32 || objR == defpackage.cau.a) {
                objR = new abgj(ablzVar, 15);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR);
            int i5 = i2;
            java.lang.String str = ablzVar.a;
            boolean z = ablzVar.b;
            java.lang.String str2 = ablzVar.c;
            java.util.List list = ablzVar.d;
            defpackage.aomy aomyVar = ablzVar.g;
            abfr abfrVar = ablzVar.h;
            java.lang.Object objR2 = cbtVar.R();
            if (i4 == 32 || objR2 == defpackage.cau.a) {
                objR2 = new abgd(ablzVar, 18);
                cbtVar.ab(objR2);
            }
            ap(ablkVar, str, z, str2, list, (defpackage.aomy) objR2, aomyVar, abfrVar, defpackage.cfo.j(-27913764, new abkv(ablzVar, 3), cavVarB), cmwVarB, cavVarB, (i5 & 14) | 805306368, 0, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(ablkVar, ablzVar, i, 0);
        }
    }

    public static final void ah(java.lang.String str, java.lang.String str2, java.util.List list, defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVarB = cavVar.b(1790996318);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(true) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 8192 : 16384;
        }
        defpackage.cja cjaVarJ = null;
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            defpackage.cmw cmwVarV = V(cmwVar, true, aomyVar, null);
            if (str2 != null) {
                cavVarB.u(-806777105);
                cjaVarJ = defpackage.cfo.j(853077534, new zjn(str2, list, 10, (byte[]) null), cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-806565778);
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.aaoo.U(defpackage.cfo.j(-105469248, new abkv(str, 5), cavVarB), cmwVarV, cjaVarJ, aonnVar, null, null, cavVarB, ((i2 >> 6) & 57344) | 196614, 452);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axp(str, str2, list, aomyVar, aonnVar, cmwVar, i, 8);
        }
    }

    public static final void ai(abja abjaVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1767380015);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.u(14021277);
            al(abjaVar, z, cavVarB, i2 & 126);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(abjaVar, z, i, 14);
        }
    }

    public static final void aj(ablk ablkVar, ablo abloVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1043466511);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abloVar) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
            defpackage.cdk cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abii(ablkVar, abloVar, i, 16);
                return;
            }
            return;
        }
        defpackage.cmt cmtVar = defpackage.cmw.c;
        defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        int iM = defpackage.anty.M(cbtVar.x);
        defpackage.cje cjeVarAi = cbtVar.ai();
        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
        defpackage.aomy aomyVar = defpackage.dam.a;
        cavVarB.v();
        if (cbtVar.w) {
            cavVarB.j(aomyVar);
        } else {
            cavVarB.x();
        }
        defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
        defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
        defpackage.cev.b(cavVarB, defpackage.dam.g);
        defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
        cavVarB.u(1195600645);
        throw null;
    }

    public static final void ak(ablk ablkVar, ablp ablpVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1062281291);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablpVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            as(ablkVar, ablpVar, cavVarB, i2 & 126);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablkVar, ablpVar, i, 20);
        }
    }

    public static final void al(abja abjaVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-309733144);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.aaoo.W(defpackage.aehj.aL(abjaVar, cavVarB), null, defpackage.ru.o(defpackage.azm.g(defpackage.cmw.c, 24.0f), z ? 1.0f : 0.38f), 0L, cavVarB, 48, 8);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(abjaVar, z, i, 15);
        }
    }

    public static final void am(ablk ablkVar, ablh ablhVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1777242549);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(ablkVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablhVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.den.aZ(defpackage.cmw.c, 12.0f, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.aehj.ay(ablhVar.b), true, 0, 1042431);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarK);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            ao(ablkVar, ablhVar.a, cavVarB, i2 & 14);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablkVar, ablhVar, i, 18, (byte[]) null);
        }
    }

    public static final void an(ablk ablkVar, abmh abmhVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(abmhVar, "data");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(377109197);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abmhVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            j$.util.Objects.checkIndex(0, 17);
            if (abmhVar != null) {
                if (abmhVar instanceof ablg) {
                    cavVarB.u(1624689064);
                    W((ablg) abmhVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof abma) {
                    cavVarB.u(1624691178);
                    Y(ablkVar, (abma) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof abls) {
                    cavVarB.u(1624693354);
                    X(ablkVar, (abls) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof abln) {
                    cavVarB.u(1624695534);
                    ac(ablkVar, (abln) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablz) {
                    cavVarB.u(1624697772);
                    ag(ablkVar, (ablz) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablx) {
                    cavVarB.u(1624700113);
                    af(ablkVar, (ablx) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablq) {
                    cavVarB.u(-1173822114);
                    ablq ablqVar = (ablq) abmhVar;
                    Z(ablkVar, ablqVar.c, ablqVar.a, ablqVar.b, 1, cavVarB, i2 & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablf) {
                    cavVarB.u(1624708331);
                    defpackage.den.aR(defpackage.azm.e(defpackage.cmw.c, 12.0f), cavVarB);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablw) {
                    cavVarB.u(1624711860);
                    ae((ablw) abmhVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof abll) {
                    cavVarB.u(1624714861);
                    defpackage.aehj.bt(((abll) abmhVar).a, defpackage.den.ba(defpackage.den.aZ(defpackage.azm.d(defpackage.cmw.c, 1.0f), 12.0f, 0.0f), 0.0f, 0.0f, 0.0f, 12.0f), defpackage.aehj.bi(defpackage.den.ak(cavVarB).G, null, cavVarB, 14), cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablo) {
                    cavVarB.u(1624729199);
                    aj(ablkVar, (ablo) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablh) {
                    cavVarB.u(1624730922);
                    am(ablkVar, (ablh) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablm) {
                    cavVarB.u(1624733164);
                    defpackage.aehj.R(ablkVar, (ablm) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablp) {
                    cavVarB.u(1624735600);
                    ak(ablkVar, (ablp) abmhVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ablt) {
                    cavVarB.u(1624738102);
                    ar((ablt) abmhVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmhVar instanceof ably) {
                    cavVarB.u(1624741079);
                    ab((ably) abmhVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                }
            }
            cavVarB.u(1624689747);
            ((defpackage.cbt) cavVarB).W(false);
            throw new defpackage.aois();
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablkVar, abmhVar, i, 17);
        }
    }

    public static final void ao(ablk ablkVar, abmf abmfVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(abmfVar, "data");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-659337365);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abmfVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            j$.util.Objects.checkIndex(0, 13);
            if (abmfVar != null) {
                if (abmfVar instanceof abln) {
                    cavVarB.u(2031956332);
                    ac(ablkVar, (abln) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablo) {
                    cavVarB.u(2031958797);
                    aj(ablkVar, (ablo) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablw) {
                    cavVarB.u(2031961458);
                    ae((ablw) abmfVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablz) {
                    cavVarB.u(2031963882);
                    ag(ablkVar, (ablz) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablx) {
                    cavVarB.u(2031966223);
                    af(ablkVar, (ablx) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof abma) {
                    cavVarB.u(2031968616);
                    Y(ablkVar, (abma) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof abls) {
                    cavVarB.u(2031970792);
                    X(ablkVar, (abls) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablm) {
                    cavVarB.u(2031973034);
                    defpackage.aehj.R(ablkVar, (ablm) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablt) {
                    cavVarB.u(2031975412);
                    ar((ablt) abmfVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablp) {
                    cavVarB.u(2031978158);
                    ak(ablkVar, (ablp) abmfVar, cavVarB, i2 & 126);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablu) {
                    cavVarB.u(2031980520);
                    at((ablu) abmfVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else if (abmfVar instanceof ablr) {
                    cavVarB.u(2031983022);
                    ad((ablr) abmfVar, cavVarB, (i2 >> 3) & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                }
            }
            cavVarB.u(2031955560);
            ((defpackage.cbt) cavVarB).W(false);
            throw new defpackage.aois();
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablkVar, abmfVar, i, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v22 */
    public static final void ap(ablk ablkVar, java.lang.String str, boolean z, java.lang.String str2, java.util.List list, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, abfr abfrVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        defpackage.cmw cmwVar2;
        int i5;
        boolean z2;
        defpackage.cja cjaVarJ;
        defpackage.cja cjaVarJ2;
        ?? r1;
        defpackage.cbt cbtVar;
        defpackage.aooh.f(str, "title");
        defpackage.aooh.f(list, "descriptionAnnotations");
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1804134227);
        if (i6 == 0) {
            i4 = (true != cavVarB.B(ablkVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.z(-1) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.B(str2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != ((262144 & i) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != cavVarB.D(aomyVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != cavVarB.B(abfrVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 268435456 : 536870912;
        }
        int i7 = i4;
        int i8 = i3 & 512;
        if (i8 != 0) {
            i5 = i2 | 6;
            cmwVar2 = cmwVar;
        } else {
            cmwVar2 = cmwVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (true != cavVarB.B(cmwVar2) ? 2 : 4);
            } else {
                i5 = i2;
            }
        }
        if (cavVarB.H(((i7 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i7 & 1)) {
            defpackage.cmw cmwVar3 = i8 != 0 ? defpackage.cmw.c : cmwVar2;
            float f = z ? 1.0f : 0.38f;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar3 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar3);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            int i9 = acpz.a;
            bqe bqeVarA = acpz.a(0L, cavVarB, 511);
            defpackage.cmw cmwVarV = V(defpackage.sl.c(defpackage.azm.d(cmwVar3, 1.0f), 1), z, aomyVar, aomyVar2);
            defpackage.aonn aonnVarAq = aq(null, z);
            if (str2 != null) {
                cavVarB.u(-898509402);
                z2 = false;
                cjaVarJ = defpackage.cfo.j(-383120886, new abmc(f, str2, list, 0), cavVarB);
                cbtVar2.W(false);
            } else {
                z2 = false;
                cavVarB.u(-898269121);
                cbtVar2.W(false);
                cjaVarJ = null;
            }
            if (aonnVar != null) {
                cavVarB.u(-898179438);
                cjaVarJ2 = defpackage.cfo.j(-1586005502, new abkv(aonnVar, 2), cavVarB);
                r1 = 0;
                cbtVar2.W(false);
            } else {
                cavVarB.u(-897858433);
                cbtVar2.W(z2);
                cjaVarJ2 = null;
                r1 = z2;
            }
            defpackage.aaoo.U(defpackage.cfo.j(-1179049817, new abmd(f, str, (int) r1), cavVarB), cmwVarV, cjaVarJ, aonnVarAq, cjaVarJ2, bqeVarA, cavVarB, 6, 388);
            cavVarB = cavVarB;
            if (abfrVar != null) {
                cavVarB.u(-897760070);
                defpackage.cbt cbtVar3 = cbtVar2;
                defpackage.afsq.bm(abfrVar, defpackage.den.ba(defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f).a(new defpackage.amq(bqeVarA.a, null, defpackage.cqz.a, 2)), 16.0f, 0.0f), 0.0f, 8.0f, 0.0f, 16.0f), defpackage.den.ak(cavVarB).s, 0L, null, 0, false, 0, defpackage.den.an(cavVarB).k, cavVarB, (i7 >> 24) & 14, 504);
                cavVarB = cavVarB;
                cbtVar3.W(false);
                cbtVar = cbtVar3;
            } else {
                defpackage.cbt cbtVar4 = cbtVar2;
                cavVarB.u(-897416807);
                cbtVar4.W(false);
                cbtVar = cbtVar4;
            }
            cbtVar.W(true);
            cmwVar2 = cmwVar3;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abme(ablkVar, str, z, str2, list, aomyVar, aomyVar2, abfrVar, aonnVar, cmwVar2, i, i2, i3, 0);
        }
    }

    public static final defpackage.aonn aq(abja abjaVar, boolean z) {
        if (abjaVar != null) {
            return new defpackage.cja(-307594004, true, new lpn(abjaVar, z, 9));
        }
        return null;
    }

    public static final void ar(ablt abltVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1368159139);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abltVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.bvo.b(null, null, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(1348238184, new xpf(9), cavVarB), cavVarB, 123);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abltVar, i, 9);
        }
    }

    public static final void as(ablk ablkVar, ablp ablpVar, defpackage.cav cavVar, int i) {
        int i2;
        long jM;
        long jM2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(28971150);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablpVar) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
            defpackage.cdk cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abii(ablkVar, ablpVar, i, 15);
                return;
            }
            return;
        }
        defpackage.bfx bfxVar = defpackage.den.am(cavVarB).e;
        java.lang.Object[] objArr = new java.lang.Object[0];
        int i4 = i2 & 112;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
        java.lang.Object objR = cbtVar.R();
        if (i4 == 32 || objR == defpackage.cau.a) {
            objR = new defpackage.uoq(16);
            cbtVar.ab(objR);
        }
        defpackage.ccp ccpVar = (defpackage.ccp) defpackage.cfd.m(objArr, (defpackage.aomy) objR, cavVarB, 0);
        defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.d(defpackage.cmw.c, 1.0f), 8.0f, 4.0f);
        if (defpackage.a.C(ccpVar)) {
            cavVarB.u(2071485945);
            cbtVar.W(false);
            jM = defpackage.cfd.M(0);
        } else {
            cavVarB.u(2071487324);
            jM = defpackage.den.ak(cavVarB).B;
            cbtVar.W(false);
        }
        defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.den.bm(cmwVarAZ, 1.0f, ((defpackage.cqg) ahp.a(jM, defpackage.den.al(cavVarB).b(), cavVarB, 0, 12).a()).a, bfxVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bfxVar, true, 0, 1042431);
        if (defpackage.a.C(ccpVar)) {
            cavVarB.u(2071496439);
            jM2 = defpackage.den.ak(cavVarB).b;
            cbtVar.W(false);
        } else {
            cavVarB.u(2071497113);
            cbtVar.W(false);
            jM2 = defpackage.cfd.M(0);
        }
        defpackage.cmw cmwVarA = cmwVarK.a(new defpackage.amq(jM2, null, defpackage.cqz.a, 2));
        defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
        int iM = defpackage.anty.M(cbtVar.x);
        defpackage.cje cjeVarAi = cbtVar.ai();
        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
        defpackage.aomy aomyVar = defpackage.dam.a;
        cavVarB.v();
        if (cbtVar.w) {
            cavVarB.j(aomyVar);
        } else {
            cavVarB.x();
        }
        defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
        defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
        defpackage.cev.b(cavVarB, defpackage.dam.g);
        defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
        defpackage.ajl ajlVarB = defpackage.den.al(cavVarB).b();
        long jM3 = defpackage.cfd.M(0);
        int i5 = acpz.a;
        acpz.a(jM3, cavVarB, 510);
        defpackage.aim.b(true != defpackage.a.C(ccpVar) ? 0.0f : 180.0f, ajlVarB, null, cavVarB, 0, 28);
        throw null;
    }

    public static final void at(ablu abluVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-664531426);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abluVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abluVar, i, 8);
        }
    }

    private static final abmr au(abms abmsVar, defpackage.dkz dkzVar) {
        return new abmr(dkzVar, abmsVar.c, true);
    }

    private static final agiz av(defpackage.ccp ccpVar) {
        return (agiz) ccpVar.a();
    }

    private static final abmr aw(abms abmsVar, hwv hwvVar, java.lang.String str, long j, int i) {
        java.lang.Object next;
        aoqu aoquVar = new aoqu(new aoqt(new aoqt(defpackage.aooc.h(new defpackage.dps(abmsVar.a.g()), new abgj(abmsVar, 17)), new abgj(abmsVar, 18), 0), new abmq(abmsVar, i, hwvVar, str, j), 2));
        while (aoquVar.hasNext()) {
            next = aoquVar.next();
            if (!((abmr) next).c) {
                return (abmr) next;
            }
        }
        next = null;
        return (abmr) next;
    }

    public static final abxt b(amjp amjpVar, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        amjs amjsVarY;
        defpackage.aooh.f(amjpVar, "<this>");
        vqf vqfVarH = abxl.H(abxt.a.m());
        vqf vqfVarK = abxl.K(abxp.a.m());
        vqf vqfVarI = abxl.I(abxs.a.m());
        amjn amjnVarW = ajee.w(amjpVar);
        if (amjnVarW != null && (amjsVarY = ajee.y(amjnVarW)) != null) {
            amjs amjsVar = 1 != (amjsVarY.b & 1) ? null : amjsVarY;
            if (amjsVar != null) {
                vqfVarI.R(amjsVar.c);
            }
            amjs amjsVar2 = (amjsVarY.b & 2) == 0 ? null : amjsVarY;
            if (amjsVar2 != null) {
                vqfVarI.S(amjsVar2.d);
            }
            if ((amjsVarY.b & 4) == 0) {
                amjsVarY = null;
            }
            if (amjsVarY != null) {
                vqfVarI.T(amjsVarY.e);
            }
        }
        java.lang.String string = uri.toString();
        defpackage.aooh.e(string, "toString(...)");
        vqfVarI.P(string);
        if (str != null) {
            vqfVarI.Q(str);
        }
        vqfVarK.ac(vqfVarI.O());
        vqfVarH.M(vqfVarK.ab());
        amjr amjrVarX = ajee.x(amjpVar);
        if (amjrVarX != null) {
            vqf vqfVarJ = abxl.J(abxr.a.m());
            amjr amjrVar = true != e(amjrVarX) ? null : amjrVarX;
            if (amjrVar != null) {
                amml ammlVar = amjrVar.c;
                if (ammlVar == null) {
                    ammlVar = amml.a;
                }
                defpackage.aooh.e(ammlVar, "getColor(...)");
                vqfVarJ.V(ammlVar);
            }
            if (f(amjrVarX)) {
                amjr amjrVar2 = (amjrVarX.b & 2) == 0 ? null : amjrVarX;
                if (amjrVar2 != null) {
                    vqfVarJ.Y(amjrVar2.d);
                }
                amjr amjrVar3 = (amjrVarX.b & 4) == 0 ? null : amjrVarX;
                if (amjrVar3 != null) {
                    vqfVarJ.aa(amjrVar3.e);
                }
                amjr amjrVar4 = (amjrVarX.b & 8) == 0 ? null : amjrVarX;
                if (amjrVar4 != null) {
                    vqfVarJ.Z(amjrVar4.f);
                }
                amjr amjrVar5 = (amjrVarX.b & 16) == 0 ? null : amjrVarX;
                if (amjrVar5 != null) {
                    vqfVarJ.W(amjrVar5.g);
                }
                amjr amjrVar6 = (amjrVarX.b & 32) != 0 ? amjrVarX : null;
                if (amjrVar6 != null) {
                    vqfVarJ.X(amjrVar6.h);
                }
            }
            vqfVarH.N(vqfVarJ.U());
        }
        if (str2 != null) {
            defpackage.akzx akzxVar = (defpackage.akzx) vqfVarH.a;
            akzxVar.u();
            abxt abxtVar = akzxVar.b;
            j$.util.Objects.requireNonNull(str2);
            abxtVar.b |= 4;
            abxtVar.e = str2;
        }
        return vqfVarH.L();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    public static final amjp c(abxt abxtVar) {
        abxr abxrVar;
        abxs abxsVarG;
        defpackage.aooh.f(abxtVar, "<this>");
        zoe zoeVarD = ajee.D(amjp.a.m());
        abxp abxpVarE = abxl.e(abxtVar);
        if (abxpVarE != null && (abxsVarG = abxl.g(abxpVarE)) != null) {
            ajyi ajyiVarO = amjk.o(amjn.a.m());
            ajyi ajyiVarE = ajee.E(amjs.a.m());
            abxs abxsVar = 1 != (abxsVarG.b & 1) ? null : abxsVarG;
            if (abxsVar != null) {
                ajyiVarE.aB(abxsVar.c);
            }
            abxs abxsVar2 = (abxsVarG.b & 2) == 0 ? null : abxsVarG;
            if (abxsVar2 != null) {
                ajyiVarE.aC(abxsVar2.d);
            }
            if ((abxsVarG.b & 4) == 0) {
                abxsVarG = null;
            }
            if (abxsVarG != null) {
                ajyiVarE.aD(abxsVarG.e);
            }
            ajyiVarO.aM(ajyiVarE.aA());
            zoeVarD.W(ajyiVarO.aL());
        }
        abxr abxrVarF = abxl.f(abxtVar);
        if (abxrVarF != null) {
            ajyi ajyiVarF = ajee.F(amjr.a.m());
            if ((abxrVarF.b & 1) == 0) {
                abxrVar = null;
            } else {
                amml ammlVar = abxrVarF.c;
                if (ammlVar == null) {
                    ammlVar = amml.a;
                }
                if ((ammlVar.b & 1) != 0) {
                    amml ammlVar2 = abxrVarF.c;
                    if (ammlVar2 == null) {
                        ammlVar2 = amml.a;
                    }
                    akzv akzvVar = ammlVar2.f;
                    if (akzvVar == null) {
                        akzvVar = akzv.a;
                    }
                    if (akzvVar.b == 0.0f) {
                        abxrVar = null;
                    }
                }
                abxrVar = abxrVarF;
            }
            if (abxrVar != null) {
                amml ammlVar3 = abxrVar.c;
                if (ammlVar3 == null) {
                    ammlVar3 = amml.a;
                }
                defpackage.aooh.e(ammlVar3, "getColor(...)");
                ajyiVarF.aF(ammlVar3);
            }
            int i = abxrVarF.b;
            if ((i & 4) == 0 || abxrVarF.e != 0.0f) {
                abxr abxrVar2 = (i & 2) == 0 ? null : abxrVarF;
                if (abxrVar2 != null) {
                    ajyiVarF.aI(abxrVar2.d);
                }
                abxr abxrVar3 = (abxrVarF.b & 4) == 0 ? null : abxrVarF;
                if (abxrVar3 != null) {
                    ajyiVarF.aK(abxrVar3.e);
                }
                abxr abxrVar4 = (abxrVarF.b & 8) == 0 ? null : abxrVarF;
                if (abxrVar4 != null) {
                    ajyiVarF.aJ(abxrVar4.f);
                }
                abxr abxrVar5 = (abxrVarF.b & 16) == 0 ? null : abxrVarF;
                if (abxrVar5 != null) {
                    ajyiVarF.aG(abxrVar5.g);
                }
                abxr abxrVar6 = (abxrVarF.b & 32) != 0 ? abxrVarF : null;
                if (abxrVar6 != null) {
                    ajyiVarF.aH(abxrVar6.h);
                }
            }
            zoeVarD.X(ajyiVarF.aE());
        }
        return zoeVarD.V();
    }

    public static final amjp d(com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata) {
        zoe zoeVarD = ajee.D(amjp.a.m());
        com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData fullScreenImageData = metadata.b;
        java.lang.Float f = null;
        if (fullScreenImageData != null) {
            java.lang.Float f2 = fullScreenImageData.a;
            if (f2 == null || f2.floatValue() == -2.1474836E9f) {
                f2 = null;
            }
            java.lang.Float f3 = fullScreenImageData.b;
            if (f3 == null || f3.floatValue() == -2.1474836E9f) {
                f3 = null;
            }
            java.lang.Float f4 = fullScreenImageData.c;
            if (f4 == null || f4.floatValue() == -2.1474836E9f) {
                f4 = null;
            }
            if (f2 != null || f3 != null || f4 != null) {
                ajyi ajyiVarO = amjk.o(amjn.a.m());
                ajyi ajyiVarE = ajee.E(amjs.a.m());
                if (f2 != null) {
                    ajyiVarE.aB(f2.floatValue());
                }
                if (f3 != null) {
                    ajyiVarE.aC(f3.floatValue());
                }
                if (f4 != null) {
                    ajyiVarE.aD(f4.floatValue());
                }
                ajyiVarO.aM(ajyiVarE.aA());
                zoeVarD.W(ajyiVarO.aL());
            }
        }
        com.google.android.gms.people.cpg.callingcard.v2.FontData fontData = metadata.a;
        if (fontData != null) {
            com.google.android.gms.people.cpg.callingcard.v2.FontColor fontColor = fontData.a;
            if (fontColor == null || defpackage.aooh.l(fontColor.d, 0.0f)) {
                fontColor = null;
            }
            java.lang.Float f5 = fontData.b;
            if (f5 == null || f5.floatValue() == -2.1474836E9f) {
                f5 = null;
            }
            java.lang.Float f6 = fontData.c;
            java.lang.Float f7 = (f6 == null || f6.floatValue() == -2.1474836E9f) ? null : f6;
            java.lang.Integer num = fontData.d;
            if (num == null || num.intValue() == Integer.MIN_VALUE) {
                num = null;
            }
            java.lang.Integer num2 = fontData.e;
            if (num2 == null || num2.intValue() == Integer.MIN_VALUE) {
                num2 = null;
            }
            java.lang.Float f8 = fontData.f;
            if (f8 != null && f8.floatValue() != -2.1474836E9f) {
                f = f8;
            }
            boolean z = false;
            boolean z2 = true;
            if (!defpackage.aooh.l(f6, 0.0f) && (f5 != null || f7 != null || num != null || num2 != null || f != null)) {
                z = true;
            }
            if (fontColor != null) {
                z2 = z;
            } else if (z) {
            }
            ajyi ajyiVarF = ajee.F(amjr.a.m());
            if (fontColor != null) {
                vaa vaaVarC = ajee.C(amml.a.m());
                vaaVarC.at(fontColor.a);
                vaaVarC.ar(fontColor.c);
                vaaVarC.as(fontColor.b);
                java.lang.Float f9 = fontColor.d;
                if (f9 != null) {
                    float fFloatValue = f9.floatValue();
                    defpackage.xtq xtqVarK = aknx.K(akzv.a.m());
                    xtqVarK.ao(fFloatValue);
                    vaaVarC.aq(xtqVarK.an());
                }
                ajyiVarF.aF(vaaVarC.ap());
            }
            if (z2) {
                if (f5 != null) {
                    ajyiVarF.aI(f5.floatValue());
                }
                if (f7 != null) {
                    ajyiVarF.aK(f7.floatValue());
                }
                if (num != null) {
                    ajyiVarF.aJ(num.intValue());
                }
                if (num2 != null) {
                    ajyiVarF.aG(num2.intValue());
                }
                if (f != null) {
                    ajyiVarF.aH(f.floatValue());
                }
            }
            zoeVarD.X(ajyiVarF.aE());
        }
        return zoeVarD.V();
    }

    public static final boolean e(amjr amjrVar) {
        if ((amjrVar.b & 1) != 0) {
            amml ammlVar = amjrVar.c;
            if (ammlVar == null) {
                ammlVar = amml.a;
            }
            if ((ammlVar.b & 1) == 0) {
                return true;
            }
            amml ammlVar2 = amjrVar.c;
            if (ammlVar2 == null) {
                ammlVar2 = amml.a;
            }
            akzv akzvVar = ammlVar2.f;
            if (akzvVar == null) {
                akzvVar = akzv.a;
            }
            if (akzvVar.b != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(amjr amjrVar) {
        return (amjrVar.b & 4) == 0 || amjrVar.e != 0.0f;
    }

    public static /* synthetic */ int g(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj instanceof abuu) {
            return 0;
        }
        if (obj instanceof abuv) {
            return 1;
        }
        return obj instanceof abut ? 2 : -2;
    }

    public static final boolean h(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        return context.getPackageManager().resolveActivity(abxl.h((abxn) null), 65536) != null;
    }

    public static final abuw i(com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier, java.lang.String str) {
        com.google.android.gms.people.cpg.callingcard.v2.AccountInfo accountInfo;
        if (identifier == null) {
            return null;
        }
        int i = identifier.a;
        if (i == 1) {
            java.lang.Long l = identifier.b;
            if (l != null) {
                return new abuu(l.longValue());
            }
            i = 1;
        }
        if (i == 2) {
            java.lang.String str2 = identifier.c;
            if (str2 == null) {
                return null;
            }
            if (str != null) {
                return new abuv(str2, str);
            }
            throw new java.lang.IllegalStateException("Lookup key not found");
        }
        if (i != 3 || (accountInfo = identifier.d) == null) {
            return null;
        }
        java.lang.String str3 = accountInfo.a;
        if (str3 == null && accountInfo.b == null) {
            return abus.a;
        }
        if (str3 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.String str4 = accountInfo.b;
        if (str4 != null) {
            return new abur(str3, str4, accountInfo.c);
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public static final abup j(int i) {
        java.lang.Object next;
        defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) abup.e);
        do {
            if (!aojlVar.hasNext()) {
                next = null;
                break;
            }
            next = aojlVar.next();
        } while (((abup) next).f != i);
        abup abupVar = (abup) next;
        return abupVar == null ? abup.a : abupVar;
    }

    public static final abuf k(int i) {
        switch (i) {
            case 1:
                return abuf.l;
            case 2:
                return abuf.f;
            case 3:
                return abuf.g;
            case 4:
                return abuf.c;
            case 5:
                return abuf.k;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return abuf.j;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return abuf.e;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return abuf.i;
            case 9:
                return abuf.h;
            case 10:
                return abuf.d;
            case 11:
                return abuf.a;
            case 12:
                return abuf.b;
            default:
                return abuf.v;
        }
    }

    public static long l() {
        aned.b();
        return anea.a.b().b();
    }

    public static boolean m() {
        aned.b();
        return anea.a.b().h();
    }

    public static boolean n(android.content.Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static final int o(android.text.TextPaint textPaint, java.util.Collection collection) {
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf((java.lang.String) it.next()).concat("."));
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = (java.lang.String) it2.next();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        int iWidth = rect.width();
        while (it2.hasNext()) {
            java.lang.String str2 = (java.lang.String) it2.next();
            textPaint.getTextBounds(str2, 0, str2.length(), rect);
            int iWidth2 = rect.width();
            if (iWidth < iWidth2) {
                iWidth = iWidth2;
            }
        }
        return iWidth;
    }

    public static final java.lang.CharSequence p(java.lang.CharSequence... charSequenceArr) {
        java.lang.CharSequence[] charSequenceArr2 = (java.lang.CharSequence[]) defpackage.ajsz.cR(charSequenceArr).toArray(new java.lang.CharSequence[0]);
        java.lang.CharSequence charSequenceConcat = android.text.TextUtils.concat((java.lang.CharSequence[]) java.util.Arrays.copyOf(charSequenceArr2, charSequenceArr2.length));
        defpackage.aooh.e(charSequenceConcat, "concat(...)");
        return charSequenceConcat;
    }

    public static final android.text.Layout q(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        android.text.StaticLayout staticLayoutBuild = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textView.getPaint(), textView.getWidth()).setIncludePad(true).build();
        defpackage.aooh.e(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    public static final boolean r(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        return android.text.TextUtils.isEmpty(textView.getText()) || q(textView, p(textView.getText(), charSequence)).getLineCount() == 1;
    }

    public static final java.lang.Object s(abpe abpeVar) {
        return new defpackage.aoiu(java.lang.Integer.valueOf(abpeVar.a), java.lang.Boolean.valueOf(abpeVar.b));
    }

    public static final abpf t(java.lang.String str) {
        defpackage.aooh.f(str, "text");
        return new abpf(str);
    }

    public static final int u(int i) {
        switch (i) {
            case -16746133:
                return -16749196;
            case -15108398:
                return -15181124;
            case -13615201:
                return -15502541;
            case -8708190:
                return -9033797;
            case -4056997:
                return -4716942;
            case -2937041:
                return -6728704;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[LOOP:2: B:26:0x0071->B:29:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0071 -> B:17:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object v(defpackage.cwc r13, defpackage.aoln r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abts.v(cwc, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void w(int i, long j, defpackage.cmw cmwVar, int i2, boolean z, defpackage.cav cavVar, int i3, int i4) {
        int i5;
        long j2;
        defpackage.cmw cmwVar2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        defpackage.cav cavVar2;
        int i9;
        defpackage.cdk cdkVarI;
        int i10;
        hch hchVar;
        int i11;
        int i12 = i3 & 6;
        defpackage.cav cavVarB = cavVar.b(-470286613);
        if (i12 == 0) {
            i5 = (true != cavVarB.z(i) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            j2 = j;
            i5 |= true != cavVarB.A(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        int i13 = i4 & 4;
        if (i13 == 0) {
            if ((i3 & 384) == 0) {
                cmwVar2 = cmwVar;
                i5 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    i7 = i2;
                    if (true != cavVarB.z(i7)) {
                        i8 = 1024;
                    } else {
                        i8 = 2048;
                    }
                    i5 |= i8;
                }
                if ((i3 & 24576) == 0) {
                    if (true != cavVarB.C(z)) {
                        i11 = 8192;
                    } else {
                        i11 = 16384;
                    }
                    i5 |= i11;
                }
                if ((i5 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cavVarB.H(z2, i5 & 1)) {
                    if (i13 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i6 != 0) {
                        i10 = 1;
                    } else {
                        i10 = i7;
                    }
                    hci hciVarD = defpackage.hcq.d(new hcj(i), cavVarB);
                    hsj hsjVarI = hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new had(defpackage.cfd.L(j2)), new java.lang.String[]{"**"}, cavVarB)}, cavVarB);
                    gzh gzhVarB = hciVarD.b();
                    if (z) {
                        hchVar = null;
                    } else {
                        hchVar = new hch((byte[]) null);
                    }
                    cavVar2 = cavVarB;
                    hgt.q(gzhVarB, cmwVar2, false, false, hchVar, 0.0f, i10, 0, hsjVarI, (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, ((i5 >> 3) & 112) | ((i5 << 9) & 3670016), 0, 0, 2088876);
                    i9 = i10;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    i9 = i7;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aboo(i, j, cmwVar2, i9, z, i3, i4);
                }
            }
            i5 |= 3072;
            i7 = i2;
            if ((i3 & 24576) == 0) {
                if (true != cavVarB.C(z)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i5 |= i11;
            }
            if ((i5 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (cavVarB.H(z2, i5 & 1)) {
                if (i13 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i6 != 0) {
                    i10 = 1;
                } else {
                    i10 = i7;
                }
                hci hciVarD2 = defpackage.hcq.d(new hcj(i), cavVarB);
                hsj hsjVarI2 = hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new had(defpackage.cfd.L(j2)), new java.lang.String[]{"**"}, cavVarB)}, cavVarB);
                gzh gzhVarB2 = hciVarD2.b();
                if (z) {
                    hchVar = null;
                } else {
                    hchVar = new hch((byte[]) null);
                }
                cavVar2 = cavVarB;
                hgt.q(gzhVarB2, cmwVar2, false, false, hchVar, 0.0f, i10, 0, hsjVarI2, (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, ((i5 >> 3) & 112) | ((i5 << 9) & 3670016), 0, 0, 2088876);
                i9 = i10;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                i9 = i7;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aboo(i, j, cmwVar2, i9, z, i3, i4);
            }
        }
        i5 |= 384;
        cmwVar2 = cmwVar;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                i7 = i2;
                if (true != cavVarB.z(i7)) {
                    i8 = 1024;
                } else {
                    i8 = 2048;
                }
                i5 |= i8;
            }
            if ((i3 & 24576) == 0) {
                if (true != cavVarB.C(z)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i5 |= i11;
            }
            if ((i5 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (cavVarB.H(z2, i5 & 1)) {
                if (i13 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i6 != 0) {
                    i10 = 1;
                } else {
                    i10 = i7;
                }
                hci hciVarD3 = defpackage.hcq.d(new hcj(i), cavVarB);
                hsj hsjVarI3 = hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new had(defpackage.cfd.L(j2)), new java.lang.String[]{"**"}, cavVarB)}, cavVarB);
                gzh gzhVarB3 = hciVarD3.b();
                if (z) {
                    hchVar = null;
                } else {
                    hchVar = new hch((byte[]) null);
                }
                cavVar2 = cavVarB;
                hgt.q(gzhVarB3, cmwVar2, false, false, hchVar, 0.0f, i10, 0, hsjVarI3, (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, ((i5 >> 3) & 112) | ((i5 << 9) & 3670016), 0, 0, 2088876);
                i9 = i10;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                i9 = i7;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aboo(i, j, cmwVar2, i9, z, i3, i4);
            }
        }
        i5 |= 3072;
        i7 = i2;
        if ((i3 & 24576) == 0) {
            if (true != cavVarB.C(z)) {
                i11 = 8192;
            } else {
                i11 = 16384;
            }
            i5 |= i11;
        }
        if ((i5 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cavVarB.H(z2, i5 & 1)) {
            if (i13 != 0) {
                cmwVar2 = defpackage.cmw.c;
            }
            if (i6 != 0) {
                i10 = 1;
            } else {
                i10 = i7;
            }
            hci hciVarD4 = defpackage.hcq.d(new hcj(i), cavVarB);
            hsj hsjVarI4 = hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new had(defpackage.cfd.L(j2)), new java.lang.String[]{"**"}, cavVarB)}, cavVarB);
            gzh gzhVarB4 = hciVarD4.b();
            if (z) {
                hchVar = null;
            } else {
                hchVar = new hch((byte[]) null);
            }
            cavVar2 = cavVarB;
            hgt.q(gzhVarB4, cmwVar2, false, false, hchVar, 0.0f, i10, 0, hsjVarI4, (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, ((i5 >> 3) & 112) | ((i5 << 9) & 3670016), 0, 0, 2088876);
            i9 = i10;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            i9 = i7;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aboo(i, j, cmwVar2, i9, z, i3, i4);
        }
    }

    public static final void x(java.lang.String str, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1928812997);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmn cmnVar = defpackage.cmh.n;
            defpackage.awb awbVarF = defpackage.awi.f(8.0f);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.azh.a(awbVarF, cmnVar, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf((i2 >> 3) & 14));
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, null, defpackage.den.ak(cavVarB).a, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).l, cavVar2, i2 & 14, 24960, 110586);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(str, aonnVar, i, 5);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v15 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void y(abom r16, abol r17, defpackage.cav r18, int r19) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abts.y(abom, abol, cav, int):void");
    }

    public static final void z(abom abomVar, java.lang.String str, abok abokVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        abok abokVar2 = abokVar;
        defpackage.aooh.f(abomVar, "<this>");
        defpackage.aooh.f(str, "key");
        defpackage.aooh.f(abokVar2, "metadata");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(799847626);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(abokVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            if (defpackage.aooh.n(abokVar2, aboj.a)) {
                cavVarB.u(-1557719588);
                cbtVar.W(false);
            } else if (abokVar2 instanceof abog) {
                cavVarB.u(1058131909);
                x(((abog) abokVar2).a, defpackage.cfo.j(1488858152, new defpackage.upf(z, 2), cavVarB), cavVarB, 48);
                cbtVar.W(false);
            } else {
                if (!(abokVar2 instanceof aboh)) {
                    if (abokVar2 instanceof aboi) {
                        cavVarB.u(1058155724);
                        throw null;
                    }
                    cavVarB.u(1058129380);
                    cbtVar.W(false);
                    throw new defpackage.aois();
                }
                cavVarB.u(1058143430);
                x(((aboh) abokVar2).a, defpackage.cfo.j(-1708791255, new smc(z, abomVar, str, 2), cavVarB), cavVarB, 48);
                cbtVar.W(false);
            }
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 14) == 4;
            boolean z4 = (i2 & 112) == 32;
            java.lang.Object objR = cbtVar.R();
            if ((z2 | z3 | z4) || objR == defpackage.cau.a) {
                objR = new zjq(abokVar2, abomVar, str, (defpackage.aoln) null, 3);
                abokVar2 = abokVar2;
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(abokVar2, (defpackage.aonn) objR, cavVarB);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(abomVar, str, abokVar2, z, cmwVar, i, 6);
        }
    }
}
