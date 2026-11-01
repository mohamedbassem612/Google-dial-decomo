package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class obo implements defpackage.hru {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ obo(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [aomy, java.lang.Object] */
    @Override // defpackage.hru
    public final void a(boolean z) {
        own ownVar;
        int i = this.$cid;
        int i2 = 8;
        if (i == 0) {
            defpackage.heq heqVar = (defpackage.heq) this.a;
            heqVar.af().setVisibility(8);
            heqVar.ag().setVisibility(8);
            heqVar.Z().setVisibility(0);
            this.b.a();
            return;
        }
        if (i == 1) {
            if (z) {
                return;
            }
            ?? r4 = this.b;
            defpackage.heq heqVar2 = (defpackage.heq) this.a;
            heqVar2.af().setVisibility(4);
            heqVar2.ag().setVisibility(4);
            heqVar2.ae().setVisibility(4);
            r4.a();
            return;
        }
        if (i != 2) {
            if (z) {
                return;
            }
            j$.lang.Iterable.-EL.forEach(((pyj) this.b).a((pyi) this.a), new defpackage.lct(i2));
        } else {
            if (z || (ownVar = ((oyp) this.a).h) == null) {
                return;
            }
            this.b.a(ownVar);
        }
    }

    public /* synthetic */ obo(pyj pyjVar, pyi pyiVar, int i) {
        this.$cid = i;
        this.b = pyjVar;
        this.a = pyiVar;
    }
}
