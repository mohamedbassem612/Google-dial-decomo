package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhu implements zjf {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider");
    public final aoin b;
    public final iqm c;
    public final rlv d;
    public final izg e;
    public final kgl f;
    public final aogc g;
    private final aolr h;

    public jhu(aogc aogcVar, kgl kglVar, aolr aolrVar, izg izgVar, aoin aoinVar, iqm iqmVar, rlv rlvVar) {
        aooh.f(kglVar, "beeslySot");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aoinVar, "enableBeeslyCrashFix");
        aooh.f(rlvVar, "loggingBindings");
        this.g = aogcVar;
        this.f = kglVar;
        this.h = aolrVar;
        this.e = izgVar;
        this.b = aoinVar;
        this.c = iqmVar;
        this.d = rlvVar;
    }

    public final java.lang.Object a(zjd zjdVar, aoln aolnVar) {
        return aoov.aj(this.h, new defpackage.jht(zjdVar, this, null), aolnVar);
    }
}
