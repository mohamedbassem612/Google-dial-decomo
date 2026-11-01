package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmu {
    public static final cbd a = new cet(new defpackage.abna(14));
    public static final cbd b = new cet(new defpackage.abna(15));

    public static final void a(int i, aono aonoVar, cav cavVar, int i2) {
        int i3;
        int i4;
        aooh.f(aonoVar, "content");
        int i5 = i2 & 6;
        cav cavVarB = cavVar.b(1236634007);
        if (i5 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        int i6 = 18;
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            i4 = i;
            ((defpackage.vaa) cavVarB.e(a)).L(i4, null, null, null, cfo.j(417555649, new defpackage.zjn(aonoVar, (defpackage.acmg) cavVarB.e(b), i6), cavVarB), cavVarB, (i3 & 14) | 12582912, 126);
        } else {
            i4 = i;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.pbt(i4, aonoVar, i2, 7);
        }
    }
}
