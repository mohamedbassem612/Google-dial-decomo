package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zu implements emj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public zu(agzx agzxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agzxVar);
        this.a = agzxVar;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [aoub, java.lang.Object] */
    public final void b(emx emxVar) {
        switch (this.$cid) {
            case 0:
                defpackage.abn.a();
                ((ems) this.a).d(this);
                break;
            case 1:
                ((ems) this.a).d(this);
                break;
            case 2:
                ((ems) this.a).d(this);
                break;
            case 3:
                defpackage.kvt kvtVar = (defpackage.kvt) this.a;
                ((java.util.concurrent.atomic.AtomicReference) kvtVar.b).set(j$.util.Optional.empty());
                ((java.util.concurrent.atomic.AtomicBoolean) kvtVar.a).set(false);
                break;
            case 4:
                defpackage.abxx abxxVar = (defpackage.abxx) this.a;
                abxxVar.setOnDismissListener(null);
                abxxVar.dismiss();
                break;
            case 5:
                ((agzx) this.a).a = null;
                break;
            case 6:
                ((amxw) this.a).a();
                break;
            case 7:
                this.a.s((java.util.concurrent.CancellationException) null);
                break;
            default:
                ((ahhg) this.a).a = null;
                break;
        }
    }

    public zu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public zu(ahfc ahfcVar, amxw amxwVar, int i) {
        this.$cid = i;
        this.a = amxwVar;
        j$.util.Objects.requireNonNull(ahfcVar);
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
