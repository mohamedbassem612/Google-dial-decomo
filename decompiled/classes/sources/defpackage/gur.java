package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class gur extends defpackage.aoof implements defpackage.aonr {
    public static final defpackage.gur a = new defpackage.gur();

    public gur() {
        super(6, defpackage.gus.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.aonr
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        android.content.Context context = (android.content.Context) obj;
        defpackage.grk grkVar = (defpackage.grk) obj2;
        defpackage.gou gouVar = (defpackage.gou) obj3;
        androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) obj4;
        defpackage.kgl kglVar = (defpackage.kgl) obj5;
        defpackage.gtr gtrVar = (defpackage.gtr) obj6;
        if (context == null) {
            defpackage.aooh.i("p0");
        }
        if (grkVar == null) {
            defpackage.aooh.i("p1");
        }
        if (gouVar == null) {
            defpackage.aooh.i("p2");
        }
        if (workDatabase == null) {
            defpackage.aooh.i("p3");
        }
        if (kglVar == null) {
            defpackage.aooh.i("p4");
        }
        defpackage.aokv aokvVar = new defpackage.aokv(10);
        java.lang.String str = defpackage.gtv.a;
        android.app.job.JobScheduler jobSchedulerA = defpackage.gvj.a(context);
        defpackage.gus gusVar = grkVar.p;
        boolean z = grkVar.n;
        defpackage.gvl gvlVar = new defpackage.gvl(context, workDatabase, grkVar, jobSchedulerA, new defpackage.gvk(context), new defpackage.gyb(gouVar));
        java.lang.String str2 = defpackage.gyi.a;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        defpackage.aooh.e(packageManager, "getPackageManager(...)");
        defpackage.gyi.a(packageManager, new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class), true, defpackage.gyh.a);
        defpackage.gsh.a().c(defpackage.gtv.a, "Created SystemJobScheduler and enabled SystemJobService");
        aokvVar.add(gvlVar);
        boolean z2 = grkVar.o;
        aokvVar.add(new defpackage.gvi(context, grkVar, kglVar, gtrVar, new defpackage.rsr(gtrVar, gouVar), gouVar));
        return aokvVar.f();
    }
}
