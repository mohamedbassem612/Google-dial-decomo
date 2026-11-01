package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adan implements defpackage.amyv {
    private final /* synthetic */ int $cid;
    private final defpackage.amyz a;
    private final defpackage.amyz b;
    private final defpackage.amyz c;
    private final defpackage.amyz d;
    private final defpackage.amyz e;

    public adan(defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, defpackage.amyz amyzVar4, defpackage.amyz amyzVar5, int i) {
        this.$cid = i;
        this.a = amyzVar;
        this.b = amyzVar2;
        this.c = amyzVar3;
        this.d = amyzVar4;
        this.e = amyzVar5;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        if (i != 0) {
            defpackage.amyz amyzVar = this.b;
            return i != 1 ? new defpackage.aczp(((defpackage.adaf) this.a).a(), (defpackage.acxa) amyzVar.a(), (defpackage.afhf) this.d.a(), (java.util.concurrent.Executor) this.c.a(), (defpackage.acvl) this.e.a()) : new defpackage.aczp(((defpackage.adaf) this.a).a(), (defpackage.acxa) amyzVar.a(), (defpackage.afhf) this.d.a(), (java.util.concurrent.Executor) this.c.a(), (defpackage.acvl) this.e.a());
        }
        ((defpackage.adaf) this.a).a();
        return new defpackage.aczl((defpackage.acxa) this.c.a(), (defpackage.afhf) this.d.a(), (java.util.concurrent.Executor) this.e.a());
    }

    public adan(defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, defpackage.amyz amyzVar4, defpackage.amyz amyzVar5, int i, byte[] bArr) {
        this.$cid = i;
        this.a = amyzVar;
        this.b = amyzVar2;
        this.d = amyzVar3;
        this.c = amyzVar4;
        this.e = amyzVar5;
    }
}
