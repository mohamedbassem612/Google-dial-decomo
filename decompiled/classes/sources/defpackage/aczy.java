package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczy implements defpackage.amyv {
    private final defpackage.amyz a;
    private final defpackage.amyz b;
    private final defpackage.amyz c;
    private final defpackage.amyz d;
    private final defpackage.amyz e;

    public aczy(defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, defpackage.amyz amyzVar4, defpackage.amyz amyzVar5) {
        this.a = amyzVar;
        this.b = amyzVar2;
        this.c = amyzVar3;
        this.d = amyzVar4;
        this.e = amyzVar5;
    }

    @Override // defpackage.aoin, defpackage.aoim
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.aczx a() {
        android.content.Context contextA = ((defpackage.adaf) this.a).a();
        return new defpackage.aczx(contextA, (defpackage.acxa) this.c.a(), (defpackage.ahyn) this.d.a(), (java.util.concurrent.Executor) this.e.a());
    }
}
