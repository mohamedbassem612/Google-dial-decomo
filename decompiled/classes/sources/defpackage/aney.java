package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aney implements defpackage.anew {
    private static final defpackage.aexb a;
    private static final defpackage.aexb b;
    private static final defpackage.aexb c;
    private static final defpackage.aexb d;
    private static final defpackage.aexb e;
    private static final defpackage.aexb f;
    private static final defpackage.aexb g;
    private static final defpackage.aexb h;

    static {
        defpackage.aewz aewzVarA = new defpackage.aewz(defpackage.aewo.a("com.google.android.gms.icing.mdd"), "", "", false, false).b().a();
        aewzVarA.c("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        aewzVarA.d("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = aewzVarA.c("cellular_charging_gcm_task_period", 21600L);
        b = aewzVarA.e("cellular_task_constraint_overrides", new defpackage.anex(), "CAEQARgA");
        aewzVarA.c("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        aewzVarA.d("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        c = aewzVarA.c("charging_gcm_task_period", 21600L);
        aewzVarA.c("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        aewzVarA.d("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        d = aewzVarA.c("maintenance_gcm_task_period", 86400L);
        e = aewzVarA.e("maintenance_task_constraint_overrides", new defpackage.anex(), "CAEQARgA");
        f = aewzVarA.e("routine_task_constraint_overrides", new defpackage.anex(), "CAEQARgA");
        aewzVarA.c("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        aewzVarA.d("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        g = aewzVarA.c("wifi_charging_gcm_task_period", 21600L);
        h = aewzVarA.e("wifi_task_constraint_overrides", new defpackage.anex(), "CAEQARgA");
    }

    @Override // defpackage.anew
    public final long a() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.anew
    public final long b() {
        return ((java.lang.Long) c.b()).longValue();
    }

    @Override // defpackage.anew
    public final long c() {
        return ((java.lang.Long) d.b()).longValue();
    }

    @Override // defpackage.anew
    public final long d() {
        return ((java.lang.Long) g.b()).longValue();
    }

    @Override // defpackage.anew
    public final defpackage.acuu e() {
        return (defpackage.acuu) b.b();
    }

    @Override // defpackage.anew
    public final defpackage.acuu f() {
        return (defpackage.acuu) e.b();
    }

    @Override // defpackage.anew
    public final defpackage.acuu g() {
        return (defpackage.acuu) f.b();
    }

    @Override // defpackage.anew
    public final defpackage.acuu h() {
        return (defpackage.acuu) h.b();
    }
}
