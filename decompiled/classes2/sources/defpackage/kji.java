package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kji {
    private static final aimz a = aimz.i("com/android/dialer/calllog/multibindingintegration/detailedcallhistory/DetailedCallHistoryComposablesKt");

    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    public static final void a(defpackage.kjl kjlVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        aoiu aoiuVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(62053179);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(kjlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmw cmwVar2 = cmw.c;
            cmw cmwVarBa = den.ba(cmwVar2, 16.0f, 0.0f, 0.0f, 0.0f);
            cye cyeVarA = aww.a(awi.f(12.0f), cmh.j, cavVarB, 6);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            int i5 = kjlVar.b;
            if (i5 == 1) {
                cavVarB.u(2014952878);
                aoiuVar = new aoiu(2131231344, new cqg(den.ak(cavVarB).s));
                cbtVar.W(false);
            } else if (i5 == 2) {
                cavVarB.u(2014956810);
                aoiuVar = new aoiu(2131231341, new cqg(den.ak(cavVarB).s));
                cbtVar.W(false);
            } else if (i5 == 3 || i5 == 5) {
                cavVarB.u(-1960600173);
                aoiuVar = new aoiu(2131231343, new cqg(den.ak(cavVarB).w));
                cbtVar.W(false);
            } else if (i5 == 6) {
                cavVarB.u(2014960582);
                aoiuVar = new aoiu(2131231319, new cqg(den.ak(cavVarB).s));
                cbtVar.W(false);
            } else if (i5 != 7) {
                cavVarB.u(-1960484233);
                if (i5 == 4) {
                    a.d().l("com/android/dialer/calllog/multibindingintegration/detailedcallhistory/DetailedCallHistoryComposablesKt", "getCallTypeIcon", 76, "DetailedCallHistoryComposables.kt").v("Voicemails are not expected in call log");
                }
                aoiuVar = new aoiu(2131231343, new cqg(den.ak(cavVarB).w));
                cbtVar.W(false);
            } else {
                cavVarB.u(2014952878);
                aoiuVar = new aoiu(2131231344, new cqg(den.ak(cavVarB).s));
                cbtVar.W(false);
            }
            int iIntValue = ((java.lang.Number) aoiuVar.a).intValue();
            long j = ((cqg) aoiuVar.b).a;
            cavVarB.u(-707004500);
            java.util.Iterator it = kjlVar.a.iterator();
            while (it.hasNext()) {
                b((defpackage.kjk) it.next(), iIntValue, j, null, cavVarB, 0);
            }
            cbtVar.W(false);
            cavVar2 = cavVarB;
            cmwVar = cmwVar2;
            abrz.k(dfa.f(2132018284, cavVarB), den.ba(cmwVar2, 0.0f, 0.0f, 0.0f, 4.0f), den.ak(cavVarB).s, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).l, cavVar2, 48, 0, 131064);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cmw cmwVar3 = cmwVar;
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(kjlVar, cmwVar3, i, 5);
        }
    }

    public static final void b(defpackage.kjk kjkVar, int i, long j, cmw cmwVar, cav cavVar, int i2) {
        int i3;
        cav cavVar2;
        cmw cmwVar2;
        aooh.f(kjkVar, "detailedCallHistoryEntryUiModel");
        int i4 = i2 & 6;
        cav cavVarB = cavVar.b(1469816049);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(kjkVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 131) != 130, i3 & 1)) {
            cmw cmwVar3 = cmw.c;
            cye cyeVarA = azh.a(awi.a, cmh.m, cavVarB, 0);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar3);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            cavVar2 = cavVarB;
            abrz.k(kjkVar.a, (cmw) null, j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).k, cavVar2, i3 & 896, 0, 131066);
            cbtVar.W(true);
            cmwVar2 = cmwVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new qyg(kjkVar, i, j, cmwVar2, i2, 1);
        }
    }
}
