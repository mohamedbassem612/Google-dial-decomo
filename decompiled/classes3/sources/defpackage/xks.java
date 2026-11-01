package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class xks implements defpackage.xhf, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public xks(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            java.util.Map map = (java.util.Map) obj;
            aooh.f(map, "p0");
            return ((defpackage.xpk) this.a).ew(map);
        }
        if (i == 1) {
            android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) obj;
            aooh.f(persistableBundle, "p0");
            return ((defpackage.xpi) this.a).c(persistableBundle);
        }
        if (i != 2) {
            defpackage.xnj xnjVar = (defpackage.xnj) obj;
            aooh.f(xnjVar, "taskResult");
            return xnjVar.a;
        }
        android.os.PersistableBundle persistableBundle2 = (android.os.PersistableBundle) obj;
        aooh.f(persistableBundle2, "p0");
        aooh.f(persistableBundle2, "bundle");
        aooh.f(persistableBundle2, "persistableBundle");
        return new defpackage.xnj(persistableBundle2);
    }

    public final boolean equals(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if (i == 1) {
            if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if (i != 2) {
            if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof defpackage.xhf) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        aoof aoofVar;
        int i = this.$cid;
        if (i == 0) {
            aoofVar = new aoof(1, this.a, defpackage.xpj.class, "toPersistableBundle", "toPersistableBundle(Ljava/util/Map;)Landroid/os/PersistableBundle;", 0);
        } else {
            if (i != 1) {
                java.lang.Object obj = this.a;
                return i != 2 ? new aoof(1, obj, defpackage.xmd.class, "performEncodeResult", "performEncodeResult(Ljava/lang/Object;)Landroid/os/PersistableBundle;", 0) : new aoof(1, obj, defpackage.xmd.class, "performExtractResult", "performExtractResult(Landroid/os/PersistableBundle;)Ljava/lang/Object;", 0);
            }
            aoofVar = new aoof(1, this.a, defpackage.xpi.class, "fromPersistableBundle", "fromPersistableBundle(Landroid/os/PersistableBundle;)Ljava/util/Map;", 0);
        }
        return aoofVar;
    }

    public final int hashCode() {
        int i = this.$cid;
        if (i == 0) {
            return ex().hashCode();
        }
        if (i == 1) {
            return ex().hashCode();
        }
        aoio aoioVarEx = ex();
        return i != 2 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
