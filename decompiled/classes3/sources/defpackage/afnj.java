package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afnj implements aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ afnj(int i, aomy aomyVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = aomyVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i;
        if (this.$cid != 0) {
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            aooh.f((azj) obj, "$this$Button");
            if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                int i2 = this.a;
                csx csxVarAL = aehj.aL((abja) this.b, cavVar);
                cmt cmtVar = cmw.c;
                aaoo.W(csxVarAL, (java.lang.String) null, azm.g(cmtVar, 18.0f), 0L, cavVar, 432, 8);
                den.aR(azm.k(cmtVar, 8.0f), cavVar);
                bvt.b(dfa.f(i2, cavVar), (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar, 0, 0, 262142);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj2;
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        aimz aimzVar = defpackage.afny.a;
        aooh.f((awy) obj, "$this$InfoScreen");
        if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
            int i3 = this.a;
            if (i3 == 0 || !((i = i3 - 1) == 1 || i == 2)) {
                cavVar2.u(-953763062);
                cavVar2.o();
            } else {
                cavVar2.u(-954206672);
                if (defpackage.anhk.a.eZ().b()) {
                    java.lang.Object obj4 = this.b;
                    cavVar2.u(-954140673);
                    defpackage.afmu.a(97066, cfo.j(-2136859463, new defpackage.abkx(obj4, 8), cavVar2), cavVar2, 54);
                    cavVar2.o();
                } else {
                    cavVar2.u(-953789908);
                    cavVar2.o();
                }
                cavVar2.o();
            }
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ afnj(abja abjaVar, int i, int i2) {
        this.$cid = i2;
        this.b = abjaVar;
        this.a = i;
    }
}
