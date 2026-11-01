package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xed extends amzm {
    private final amzg b;
    private final amzg c;

    public xed(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.xed.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        wyc wycVar = (wyc) obj;
        j$.util.Objects.requireNonNull(wycVar);
        defpackage.tok tokVar = new defpackage.tok(wycVar, 15);
        amzg amzgVar = this.c;
        j$.util.Objects.requireNonNull(amzgVar);
        return aiql.z(new defpackage.uyg((defpackage.zka) tokVar, (ajas) new xbw(amzgVar, 14)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
