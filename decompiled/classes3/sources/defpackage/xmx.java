package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmx implements defpackage.xni, defpackage.xhg, defpackage.xib {
    public final long a;
    public final j$.time.Duration b;
    private final long d;
    private final defpackage.xib f;
    private final defpackage.xhg g;
    private final int h;
    private final java.lang.String i;

    public xmx(long j, defpackage.xib xibVar, defpackage.xhg xhgVar, long j2, int i, java.lang.String str, j$.time.Duration duration) {
        aooh.f(xibVar, "nodeRef");
        aooh.f(xhgVar, "resultHandler");
        aooh.f(str, "targetPackageName");
        this.d = j;
        this.f = xibVar;
        this.g = xhgVar;
        this.a = j2;
        this.h = i;
        this.i = str;
        this.b = duration;
    }

    @Override // defpackage.xni
    public final int a() {
        return this.h;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this.f.asNodeRef();
    }

    @Override // defpackage.xni
    public final long b() {
        return this.d;
    }

    @Override // defpackage.xni
    public final j$.time.Duration c() {
        throw null;
    }

    @Override // defpackage.xni, defpackage.xhx
    public final long d() {
        return this.a;
    }

    @Override // defpackage.xni
    public final java.lang.String e() {
        return this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xmx) {
            defpackage.xmx xmxVar = (defpackage.xmx) obj;
            if (xmxVar.d == this.d && defpackage.xhp.j((defpackage.xjz) obj, this) && xmxVar.h == this.h && aooh.n(xmxVar.i, this.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.f.getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.f.getNodeName();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.f.getNodePackage();
    }

    @Override // defpackage.xhi
    public final defpackage.xhf getResultDecoder() {
        return this.g.getResultDecoder();
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        throw null;
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.d), java.lang.Integer.valueOf(defpackage.xhp.i(this)), java.lang.Integer.valueOf(this.h), this.i});
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putLong("com.android.onboarding.ONBOARDING_NODE_ID", this.a);
        persistableBundle.putString("com.android.onboarding.task.COMPONENT", getNodeComponent());
        persistableBundle.putString("com.android.onboarding.task.NODE", getNodeName());
        persistableBundle.putLong("com.android.onboarding.task.TASK_MANAGER_ID", this.d);
        persistableBundle.putInt("com.android.onboarding.task.TARGET_USER", this.h);
        persistableBundle.putString("com.android.onboarding.task.TARGET_PACKAGE_NAME", this.i);
        j$.time.Duration duration = this.b;
        if (duration != null) {
            persistableBundle.putLong("com.android.onboarding.task.TIMEOUT_IN_SECONDS", duration.getSeconds());
        }
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "OnboardingTaskToken(" + defpackage.xfh.a(this) + ')';
    }
}
