package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxq implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ fxq(aonj aonjVar, aonj aonjVar2, boolean z, aonj aonjVar3, cer cerVar, int i) {
        this.$cid = i;
        this.e = aonjVar;
        this.b = aonjVar2;
        this.a = z;
        this.c = aonjVar3;
        this.d = cerVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v18, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        int i = this.$cid;
        if (i == 0) {
            defpackage.fvs fvsVar = (defpackage.fvs) obj;
            aooh.f(fvsVar, "entry");
            ((aoop) this.b).a = true;
            ((aoop) this.c).a = true;
            ((defpackage.fxr) this.d).k(fvsVar, this.a, (aojw) this.e);
            return aojh.a;
        }
        float fG = 1.0f;
        if (i == 1) {
            cra craVar = (cra) obj;
            ?? r0 = this.e;
            int i2 = defpackage.brj.a;
            java.lang.Object obj2 = this.d;
            boolean z = this.a;
            float fG2 = 0.8f;
            craVar.w(z ? ((java.lang.Boolean) ((akc) obj2).b()).booleanValue() ? 1.0f : 0.8f : a.G((cer) r0));
            if (!z) {
                fG2 = a.G((cer) r0);
            } else if (((java.lang.Boolean) ((akc) obj2).b()).booleanValue()) {
                fG2 = 1.0f;
            }
            craVar.x(fG2);
            if (!z) {
                fG = a.G((cer) this.b);
            } else if (!((java.lang.Boolean) ((akc) obj2).b()).booleanValue()) {
                fG = 0.0f;
            }
            ?? r14 = this.c;
            craVar.o(fG);
            craVar.B(((crg) r14.a()).a);
            return aojh.a;
        }
        defpackage.bbt bbtVar = (defpackage.bbt) obj;
        ?? r1 = this.d;
        aimz aimzVar = afny.a;
        aooh.f(bbtVar, "$this$LazyPhotoGrid");
        for (afou afouVar : afny.d((cer) r1).a) {
            boolean z2 = this.a;
            afos afosVar = afouVar.a;
            if (z2) {
                bbtVar.a(new acsb(20), new cja(1242390879, true, new abkx(afosVar, 7)));
            }
            ?? r12 = this.c;
            cmw cmwVarC = azm.c(defpackage.rx.l(cmw.c, 1.0f, false), 1.0f);
            j$.util.Objects.checkIndex(0, 4);
            if (afosVar instanceof afos) {
                java.util.List list = afosVar.a;
                bbtVar.b(list.size(), new abli(list, 10), new cja(-1942245546, true, new afnt(list, cmwVarC, afosVar, (aonj) r12, 0)));
            } else if (afosVar instanceof afor) {
                ?? r13 = this.b;
                java.util.List list2 = ((afor) afosVar).a;
                bbtVar.b(list2.size(), new abli(list2, 11), new cja(-1942245546, true, new afnt(list2, cmwVarC, afosVar, (aonj) r13, 2)));
            } else {
                if (!(afosVar instanceof afoq)) {
                    throw new aois();
                }
                java.util.List list3 = ((afoq) afosVar).a;
                bbtVar.b(list3.size(), new abli(list3, 9), new cja(-1942245546, true, new afnt(list3, cmwVarC, afosVar, (aonj) r12, 1)));
            }
            if (afouVar.b) {
                bbtVar.a(null, new cja(1092086742, true, new afd(afosVar, (aonj) this.e, afouVar, cmwVarC, 7)));
            }
            bbtVar.a(new afno(1), afnb.c);
        }
        return aojh.a;
    }

    public /* synthetic */ fxq(aoop aoopVar, aoop aoopVar2, defpackage.fxr fxrVar, boolean z, aojw aojwVar, int i) {
        this.$cid = i;
        this.b = aoopVar;
        this.c = aoopVar2;
        this.d = fxrVar;
        this.a = z;
        this.e = aojwVar;
    }

    public /* synthetic */ fxq(boolean z, akc akcVar, aomy aomyVar, cer cerVar, cer cerVar2, int i) {
        this.$cid = i;
        this.a = z;
        this.d = akcVar;
        this.c = aomyVar;
        this.e = cerVar;
        this.b = cerVar2;
    }
}
