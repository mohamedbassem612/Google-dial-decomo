package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxn implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ fxn(defpackage.adm admVar, defpackage.fwz fwzVar, boolean z, aonj aonjVar, aonj aonjVar2, aonj aonjVar3, cer cerVar, int i) {
        this.$cid = i;
        this.g = admVar;
        this.b = fwzVar;
        this.a = z;
        this.c = aonjVar;
        this.d = aonjVar2;
        this.e = aonjVar3;
        this.f = cerVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        float f;
        if (this.$cid != 0) {
            diq diqVar = (diq) obj;
            if (this.a) {
                java.lang.Object obj2 = this.e;
                java.lang.Object obj3 = this.d;
                java.lang.Object obj4 = this.f;
                java.lang.Object obj5 = this.g;
                dfb.e(diqVar, (java.lang.String) obj4, new defpackage.bll(obj3, 12));
                defpackage.btt bttVar = (defpackage.btt) obj5;
                if (bttVar.c() == defpackage.btu.c) {
                    diqVar.a(did.s, new dhr((java.lang.String) this.b, new defpackage.af(obj5, obj2, obj5, 6, (byte[]) null)));
                } else if (bttVar.k()) {
                    diqVar.a(did.t, new dhr((java.lang.String) this.c, new defpackage.ny(obj5, obj2, 16)));
                }
            }
            return aojh.a;
        }
        defpackage.aes aesVar = (defpackage.aes) obj;
        boolean zContains = defpackage.hgu.ac(this.f).contains(aesVar.b());
        ?? r1 = this.e;
        if (!zContains) {
            return new afo(agf.a, agg.a, (ahu) r1.a(aesVar), 4);
        }
        java.lang.Object obj6 = this.g;
        java.lang.String str = ((defpackage.fvs) aesVar.b()).c;
        defpackage.adm admVar = (defpackage.adm) obj6;
        int iA = admVar.a(str);
        if (iA >= 0) {
            f = admVar.c[iA];
        } else {
            admVar.b(str, 0.0f);
            f = 0.0f;
        }
        if (!aooh.n(((defpackage.fvs) aesVar.c()).c, ((defpackage.fvs) aesVar.b()).c)) {
            f += (((java.lang.Boolean) ((defpackage.fwz) this.b).c.a()).booleanValue() || this.a) ? -1.0f : 1.0f;
        }
        ?? r3 = this.d;
        ?? r6 = this.c;
        admVar.b(((defpackage.fvs) aesVar.c()).c, f);
        return new afo((agf) r6.a(aesVar), (agg) r3.a(aesVar), f, (ahu) r1.a(aesVar));
    }

    public /* synthetic */ fxn(boolean z, defpackage.btt bttVar, java.lang.String str, java.lang.String str2, java.lang.String str3, aomy aomyVar, aoss aossVar, int i) {
        this.$cid = i;
        this.a = z;
        this.g = bttVar;
        this.f = str;
        this.b = str2;
        this.c = str3;
        this.d = aomyVar;
        this.e = aossVar;
    }
}
