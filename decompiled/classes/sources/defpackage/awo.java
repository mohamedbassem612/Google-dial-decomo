package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awo {
    private static final defpackage.adw b = e(true);
    private static final defpackage.adw c = e(false);
    private static final defpackage.cye a = defpackage.awn.a;

    public static final defpackage.awm a(defpackage.cyd cydVar) {
        java.lang.Object objG = cydVar.g();
        if (objG instanceof defpackage.awm) {
            return (defpackage.awm) objG;
        }
        return null;
    }

    public static final defpackage.cye b(defpackage.cmj cmjVar, boolean z) {
        defpackage.cye cyeVar = (defpackage.cye) (z ? b : c).a(cmjVar);
        return cyeVar == null ? new defpackage.awr(cmjVar, z) : cyeVar;
    }

    public static final void c(defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-211209833);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cye cyeVar = a;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(cmwVar, i, 2);
        }
    }

    public static final void d(defpackage.czb czbVar, defpackage.czc czcVar, defpackage.cyd cydVar, defpackage.dpq dpqVar, int i, int i2, defpackage.cmj cmjVar) {
        defpackage.cmj cmjVar2;
        defpackage.awm awmVarA = a(cydVar);
        czbVar.t(czcVar, ((awmVarA == null || (cmjVar2 = awmVarA.a) == null) ? cmjVar : cmjVar2).a((((long) czcVar.a) << 32) | (((long) czcVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), dpqVar), 0.0f);
    }

    private static final defpackage.adw e(boolean z) {
        defpackage.adw adwVar = new defpackage.adw(9);
        defpackage.cmj cmjVar = defpackage.cmh.a;
        adwVar.n(cmjVar, new defpackage.awr(cmjVar, z));
        defpackage.cmj cmjVar2 = defpackage.cmh.b;
        adwVar.n(cmjVar2, new defpackage.awr(cmjVar2, z));
        defpackage.cmj cmjVar3 = defpackage.cmh.c;
        adwVar.n(cmjVar3, new defpackage.awr(cmjVar3, z));
        defpackage.cmj cmjVar4 = defpackage.cmh.d;
        adwVar.n(cmjVar4, new defpackage.awr(cmjVar4, z));
        defpackage.cmj cmjVar5 = defpackage.cmh.e;
        adwVar.n(cmjVar5, new defpackage.awr(cmjVar5, z));
        defpackage.cmj cmjVar6 = defpackage.cmh.f;
        adwVar.n(cmjVar6, new defpackage.awr(cmjVar6, z));
        defpackage.cmj cmjVar7 = defpackage.cmh.g;
        adwVar.n(cmjVar7, new defpackage.awr(cmjVar7, z));
        defpackage.cmj cmjVar8 = defpackage.cmh.h;
        adwVar.n(cmjVar8, new defpackage.awr(cmjVar8, z));
        defpackage.cmj cmjVar9 = defpackage.cmh.i;
        adwVar.n(cmjVar9, new defpackage.awr(cmjVar9, z));
        return adwVar;
    }
}
