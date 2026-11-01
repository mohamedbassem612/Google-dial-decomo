package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcm extends amzm {
    private final amzg b;

    public pcm(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pcm.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        zms zmsVar = (zms) obj;
        aooh.f(zmsVar, "audioModeProvider");
        j$.util.Optional optionalD = zmsVar.d();
        nzu nzuVar = new nzu(new opy(zmsVar, 10), 16);
        boolean zIsPresent = optionalD.isPresent();
        java.lang.Object obj2 = optionalD;
        if (true == zIsPresent) {
            java.lang.Object objA = nzuVar.a.a(optionalD.get());
            objA.getClass();
            obj2 = objA;
        }
        aooh.e(obj2, "flatMap(...)");
        return aiql.z(obj2);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
