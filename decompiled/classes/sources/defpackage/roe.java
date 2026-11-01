package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class roe implements defpackage.emj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public roe(defpackage.amxr amxrVar, defpackage.amxw amxwVar, int i) {
        this.$cid = i;
        this.a = amxwVar;
        j$.util.Objects.requireNonNull(amxrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ifa, java.lang.Object] */
    @Override // defpackage.emj
    public final void b(defpackage.emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aogc aogcVar = (defpackage.aogc) this.a;
            ((java.util.concurrent.atomic.AtomicReference) aogcVar.a).set(j$.util.Optional.empty());
            ((java.util.concurrent.atomic.AtomicBoolean) aogcVar.c).set(false);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            ((defpackage.amxw) obj).a();
            return;
        }
        defpackage.cop copVar = (defpackage.cop) obj;
        ((defpackage.iez) copVar.e).n(copVar.d);
        copVar.a = false;
        emxVar.P().d(this);
    }

    public roe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void fn(defpackage.emx emxVar) {
    }
}
