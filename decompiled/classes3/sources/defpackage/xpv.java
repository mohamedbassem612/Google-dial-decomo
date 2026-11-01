package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xpv implements defpackage.xpu {
    private final /* synthetic */ defpackage.xpu a;

    public xpv(defpackage.xpu xpuVar) {
        this.a = xpuVar;
    }

    @Override // defpackage.xoz
    public final defpackage.xoz e() {
        return this.a.e();
    }

    @Override // defpackage.xpn, defpackage.xoz
    public final /* synthetic */ android.os.PersistableBundle ew(java.lang.Object obj) {
        return this.a.ew((java.lang.annotation.Annotation) obj);
    }

    @Override // defpackage.xhf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.xpr b(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "input");
        return (defpackage.xpr) this.a.b(persistableBundle);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xpr] */
    @Override // defpackage.xpb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.xpr c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return this.a.c(persistableBundle);
    }
}
