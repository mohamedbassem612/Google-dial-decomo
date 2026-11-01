package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgs implements defpackage.xgr, defpackage.xib {
    public static final defpackage.xer a = new defpackage.xer(3);
    private final android.os.PersistableBundle b;
    private final defpackage.xjz d;
    private final com.android.onboarding.utils.persistable.PersistableIntent e;
    private final int f;
    private final java.lang.String g;
    private final com.android.onboarding.pending.PendingContract$ErasedActivity h;

    public xgs(android.os.PersistableBundle persistableBundle, com.android.onboarding.pending.PendingContract$Activity pendingContract$Activity, defpackage.xjz xjzVar, com.android.onboarding.utils.persistable.PersistableIntent persistableIntent, int i, java.lang.String str) {
        aooh.f(str, "callbackKey");
        this.b = persistableBundle;
        this.d = xjzVar;
        this.e = persistableIntent;
        this.f = i;
        this.g = str;
        this.h = pendingContract$Activity.a();
    }

    @Override // defpackage.xgt
    public final /* synthetic */ com.android.onboarding.pending.PendingContract$Erased a() {
        return this.h;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this.d.asNodeRef();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xgs) {
            defpackage.xgs xgsVar = (defpackage.xgs) obj;
            if (defpackage.xff.l(this.b, xgsVar.b) && aooh.n(this.h, xgsVar.h) && defpackage.xhp.j(this.d, xgsVar.d) && aooh.n(this.e, xgsVar.e) && this.f == xgsVar.f && aooh.n(this.g, xgsVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.d.getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.d.getNodeName();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.d.getNodePackage();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(defpackage.xff.m(this.b)), this.h, java.lang.Integer.valueOf(defpackage.xhp.i(this.d)), this.e, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(this.f), this.g});
    }

    @Override // defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return this.d.identity();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundleA = defpackage.xff.a(this);
        persistableBundleA.putString("cc.SUBTYPE", "ActivityToActivity");
        persistableBundleA.putPersistableBundle("cc.SESSION", this.b);
        defpackage.xfh.j(persistableBundleA, "cc.KEY_CALLBACK_REF", this.d, defpackage.xhy.b);
        defpackage.xfh.i(persistableBundleA, "cc.KEY_CALLBACK_SERVICE_INTENT", this.e);
        persistableBundleA.putInt("cc.KEY_CALLBACK_USER_ID", this.f);
        persistableBundleA.putString("cc.KEY_CALLBACK_KEY", this.g);
        return persistableBundleA;
    }

    public final java.lang.String toString() {
        return "ChainedContract.ActivityToActivity(target=" + defpackage.xfc.b(this.h) + ",callback=" + this.d.identity() + ",callbackKey=" + this.g + ",handlesFailure=true)";
    }
}
