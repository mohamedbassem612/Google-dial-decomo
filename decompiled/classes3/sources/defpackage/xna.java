package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class xna implements defpackage.xhf, aood {
    private final /* synthetic */ int $cid;
    public static final defpackage.xna b = new defpackage.xna(1);
    public static final defpackage.xna a = new defpackage.xna(0);

    public xna(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.xlm xlmVar = (defpackage.xlm) obj;
            aooh.f(xlmVar, "p0");
            return xlmVar.toPersistableBundle();
        }
        defpackage.xpa xpaVar = (defpackage.xpa) obj;
        aooh.f(xpaVar, "p0");
        return xpaVar.toPersistableBundle();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
                return aooh.n(new aoof(1, defpackage.xlm.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
            return aooh.n(new aoof(1, defpackage.xpa.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return this.$cid != 0 ? new aoof(1, defpackage.xlm.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0) : new aoof(1, defpackage.xpa.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0);
    }

    public final int hashCode() {
        return this.$cid != 0 ? new aoof(1, defpackage.xlm.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0).hashCode() : new aoof(1, defpackage.xpa.class, "toPersistableBundle", "toPersistableBundle()Landroid/os/PersistableBundle;", 0).hashCode();
    }
}
