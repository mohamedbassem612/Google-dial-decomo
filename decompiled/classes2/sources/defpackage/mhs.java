package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mhs implements defpackage.mhn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mhs(int i) {
        this.$cid = i;
    }

    @Override // defpackage.mhn
    public final void a(akzx akzxVar, albh albhVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.mhi mhiVar = (defpackage.mhi) albhVar;
            akzxVar.u();
            defpackage.mhj mhjVar = (defpackage.mhj) akzxVar.b;
            defpackage.mhj mhjVar2 = defpackage.mhj.a;
            j$.util.Objects.requireNonNull(mhiVar);
            mhjVar.d = mhiVar;
            mhjVar.b |= 2;
            return;
        }
        if (i != 1) {
            defpackage.mhh mhhVar = (defpackage.mhh) albhVar;
            akzxVar.u();
            defpackage.mhj mhjVar3 = (defpackage.mhj) akzxVar.b;
            defpackage.mhj mhjVar4 = defpackage.mhj.a;
            j$.util.Objects.requireNonNull(mhhVar);
            mhjVar3.e = mhhVar;
            mhjVar3.b |= 4;
            return;
        }
        defpackage.mhf mhfVar = (defpackage.mhf) albhVar;
        aooh.f(akzxVar, "dumpBuilder");
        aooh.f(mhfVar, "message");
        akzxVar.u();
        defpackage.mhj mhjVar5 = (defpackage.mhj) akzxVar.b;
        defpackage.mhj mhjVar6 = defpackage.mhj.a;
        j$.util.Objects.requireNonNull(mhfVar);
        mhjVar5.c = mhfVar;
        mhjVar5.b |= 1;
    }
}
