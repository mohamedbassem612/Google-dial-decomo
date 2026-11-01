package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pbv implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ pbv(aonn aonnVar, brb brbVar, boolean z, azj azjVar, aonn aonnVar2, int i) {
        this.$cid = i;
        this.d = aonnVar;
        this.c = brbVar;
        this.a = z;
        this.b = azjVar;
        this.e = aonnVar2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aono, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i = iIntValue & 3;
            int i2 = iIntValue & 1;
            int i3 = brj.a;
            if (cavVar.H(i != 2, i2)) {
                boolean z = this.a;
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.d;
                if (obj4 != null) {
                    cavVar.u(-864613344);
                    den.ab(boy.a.b(new cqg(((brb) obj3).a(z))), cfo.j(1241781204, new brg(obj4, 1), cavVar), cavVar, 56);
                    cavVar.o();
                } else {
                    cavVar.u(-864297175);
                    cavVar.o();
                }
                den.ab(boy.a.b(new cqg(((brb) obj3).b(z))), cfo.j(-893579015, new ata(this.b, obj4, this.e, 6), cavVar), cavVar, 56);
                cavVar.u(-863079991);
                cavVar.o();
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        int i4 = iIntValue2 & 3;
        if (cavVar2.H(i4 != 2, iIntValue2 & 1)) {
            cmw cmwVarX = den.x(cmw.c, "growth_kit_wrapper");
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cavVar2.a());
            cje cjeVarM = cavVar2.M();
            cmw cmwVarM = cfo.m(cavVar2, cmwVarX);
            aomy aomyVar = dam.a;
            cavVar2.L();
            cavVar2.v();
            if (cavVar2.F()) {
                cavVar2.j(aomyVar);
            } else {
                cavVar2.x();
            }
            ?? r8 = this.e;
            boolean z2 = this.a;
            ?? r6 = this.d;
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.b;
            cev.c(cavVar2, cyeVarB, dam.e);
            cev.c(cavVar2, cjeVarM, dam.d);
            cev.c(cavVar2, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar2, dam.g);
            cev.c(cavVar2, cmwVarM, dam.c);
            pez.o((defpackage.ouj) obj6, (java.lang.String) obj5, (aonj) r6, z2, (aono) r8, cavVar2, 0);
            cavVar2.n();
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ pbv(defpackage.ouj oujVar, java.lang.String str, aonj aonjVar, boolean z, aono aonoVar, int i) {
        this.$cid = i;
        this.b = oujVar;
        this.c = str;
        this.d = aonjVar;
        this.a = z;
        this.e = aonoVar;
    }
}
