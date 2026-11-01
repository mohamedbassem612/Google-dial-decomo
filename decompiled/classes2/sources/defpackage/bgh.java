package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgh {
    public static final aoiu a;

    static {
        aokc aokcVar = aokc.a;
        a = new aoiu(aokcVar, aokcVar);
    }

    public static final void a(dji djiVar, java.util.List list, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1794596951);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(djiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                djg djgVar = (djg) list.get(i4);
                aono aonoVar = (aono) djgVar.a;
                int i5 = djgVar.b;
                int i6 = djgVar.c;
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = defpackage.bgg.a;
                    cbtVar.ab(objR);
                }
                cye cyeVar = (cye) objR;
                cmt cmtVar = cmw.c;
                int i7 = i4;
                long j = cbtVar.x;
                long j2 = j ^ (j >>> c);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmtVar);
                aomy aomyVar = dam.a;
                cbtVarB.v();
                int i8 = size;
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVar, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf((int) j2), dam.f);
                cbtVarB.i(aojh.a, new bae(dam.g, 7));
                cev.c(cbtVarB, cmwVarM, dam.c);
                aonoVar.a(djiVar.c(i5, i6).c, cbtVarB, 0);
                cbtVar.W(true);
                i4 = i7 + 1;
                size = i8;
                c = ' ';
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(djiVar, list, i, 3);
        }
    }
}
