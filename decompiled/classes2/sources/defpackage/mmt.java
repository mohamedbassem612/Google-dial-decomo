package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmt implements rvd {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public mmt(android.content.Context context, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(context, "appContext");
        this.a = context;
    }

    public final android.content.Intent a() {
        switch (this.$cid) {
            case 0:
                return afsq.bP();
            case 1:
                throw new java.lang.IllegalStateException("Should be TypeFragment so createIntent unexpected.");
            case 2:
                throw new java.lang.IllegalStateException("This method is not expected to be called");
            case 3:
                throw new java.lang.IllegalStateException("This method is not expected to be called");
            case 4:
                throw new java.lang.IllegalStateException("This method is not expected to be called");
            case 5:
                return afsq.bP();
            case 6:
                return new android.content.Intent("android.settings.SOUND_SETTINGS").setFlags(536870912);
            default:
                throw new java.lang.IllegalStateException("This method is not expected to be called");
        }
    }

    public final aw b() {
        switch (this.$cid) {
            case 0:
                return defpackage.mmn.aW();
            case 1:
                return defpackage.lhf.aW();
            case 2:
                defpackage.npg npgVar = new defpackage.npg();
                amxr.g(npgVar);
                return npgVar;
            case 3:
                defpackage.oix oixVar = new defpackage.oix();
                amxr.g(oixVar);
                return oixVar;
            case 4:
                tsn tsnVar = new tsn();
                amxr.g(tsnVar);
                return tsnVar;
            case 5:
                return ube.bd();
            case 6:
                throw new java.lang.IllegalStateException("This method is not expected to be called.");
            default:
                return wqb.bd();
        }
    }

    public final /* synthetic */ aw c(rvq rvqVar) {
        switch (this.$cid) {
            case 0:
                return defpackage.mmn.aW();
            case 1:
                return defpackage.lhf.aW();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return ube.bd();
            case 6:
                return b();
            default:
                return wqb.bd();
        }
    }

    public final ajcq d() {
        switch (this.$cid) {
            case 0:
                return afsq.bQ();
            case 1:
                return afsq.bQ();
            case 2:
                return afsq.cj();
            case 3:
                return afsq.cj();
            case 4:
                return anar.u();
            case 5:
                return afsq.bQ();
            case 6:
                return afsq.cb();
            default:
                return afsq.bQ();
        }
    }

    public final ajcq e() {
        switch (this.$cid) {
            case 0:
                rus rusVar = new rus();
                rusVar.d(ruz.b);
                rusVar.c(rvc.q);
                rusVar.e(new rva(2132018356));
                rusVar.b(((android.content.Context) this.a).getDrawable(2131231956));
                return aiql.z(j$.util.Optional.of(rusVar.a()));
            case 1:
                if (((zjm) this.a).g().isPresent()) {
                    return aiql.z(j$.util.Optional.empty());
                }
                rus rusVar2 = new rus();
                rusVar2.d(ruz.a);
                rusVar2.c(rvc.b);
                rusVar2.e(new rva(2132017848));
                return aiql.z(j$.util.Optional.of(rusVar2.a()));
            case 2:
                return aiql.z(j$.util.Optional.of(new rvb(((android.content.Context) this.a).getDrawable(2131231551), ruz.a, rvc.B, new rva(2132018481))));
            case 3:
                return aiql.z(j$.util.Optional.of(new rvb(((android.content.Context) this.a).getDrawable(2131231358), ruz.b, rvc.E, new rva(2132018642))));
            case 4:
                return aiql.z(j$.util.Optional.of(new rvb(((android.content.Context) this.a).getDrawable(2131231602), ruz.a, rvc.d, new rva(2132020126))));
            case 5:
                rus rusVar3 = new rus();
                rusVar3.d(ruz.b);
                rusVar3.c(rvc.C);
                rusVar3.e(new rva(2132020203));
                rusVar3.b(((android.content.Context) this.a).getDrawable(2131231514));
                return aiql.z(j$.util.Optional.of(rusVar3.a()));
            case 6:
                rus rusVar4 = new rus();
                rusVar4.d(ruz.b);
                rusVar4.c(rvc.v);
                rusVar4.e(new rva(2132020205));
                rusVar4.b(((android.content.Context) this.a).getDrawable(2131232007));
                return aiql.z(j$.util.Optional.of(rusVar4.a()));
            default:
                rus rusVar5 = new rus();
                rusVar5.d(ruz.a);
                rusVar5.c(rvc.g);
                rusVar5.e(new rva(2132021096));
                rusVar5.b(((android.content.Context) this.a).getDrawable(2131231629));
                return aiql.z(j$.util.Optional.of(rusVar5.a()));
        }
    }

    public mmt(android.content.Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    public mmt(android.content.Context context, int i, char[] cArr) {
        this.$cid = i;
        aooh.f(context, "appContext");
        this.a = context;
    }

    public mmt(android.content.Context context, int i, short[] sArr) {
        this.$cid = i;
        aooh.f(context, "appContext");
        this.a = context;
    }

    public mmt(zjm zjmVar, int i) {
        this.$cid = i;
        this.a = zjmVar;
    }
}
