package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xps implements defpackage.xpb, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public xps(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return this.$cid != 0 ? defpackage.xfh.d(this, persistableBundle) : defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return this.$cid != 0 ? b((android.os.PersistableBundle) obj) : b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        if (this.$cid != 0) {
            aooh.f(persistableBundle, "p0");
            return defpackage.xpo.f(persistableBundle);
        }
        aooh.f(persistableBundle, "p0");
        aooh.f(persistableBundle, "persistableBundle");
        return persistableBundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof defpackage.xpb) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof defpackage.xpb) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new aoof(1, obj, defpackage.xpo.class, "rawFromPersistableBundle", "rawFromPersistableBundle(Landroid/os/PersistableBundle;)Ljava/lang/String;", 0) : new aoof(1, obj, defpackage.xpl.class, "rawFromPersistableBundle", "rawFromPersistableBundle(Landroid/os/PersistableBundle;)Landroid/os/PersistableBundle;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
