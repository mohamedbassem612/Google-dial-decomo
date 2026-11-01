package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nzw extends amzm {
    private final amzg b;

    public nzw(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.nzw.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.nzt nztVar = (defpackage.nzt) obj;
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(nztVar.h.get());
        aooh.e(optionalOfNullable, "ofNullable(...)");
        defpackage.nzu nzuVar = new defpackage.nzu(nztVar, 0);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.nzt) nzuVar.a).i.get());
            aooh.e(optionalOfNullable2, "ofNullable(...)");
            optionalOfNullable = j$.util.Optional.ofNullable(new defpackage.oad((android.location.Location) obj2, optionalOfNullable2));
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
