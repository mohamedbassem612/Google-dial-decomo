package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxv extends defpackage.gfi {
    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }

    @Override // defpackage.gfi
    public final /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.gxl gxlVar = (defpackage.gxl) obj;
        java.lang.String str = gxlVar.b;
        ginVar.j(1, str);
        ginVar.h(2, defpackage.gus.l(gxlVar.c));
        ginVar.j(3, gxlVar.d);
        ginVar.j(4, gxlVar.e);
        defpackage.grp grpVar = defpackage.grp.a;
        ginVar.f(5, defpackage.gus.A(gxlVar.f));
        ginVar.f(6, defpackage.gus.A(gxlVar.g));
        ginVar.h(7, gxlVar.h);
        ginVar.h(8, gxlVar.i);
        ginVar.h(9, gxlVar.j);
        ginVar.h(10, gxlVar.l);
        ginVar.h(11, defpackage.gus.i(gxlVar.m));
        ginVar.h(12, gxlVar.n);
        ginVar.h(13, gxlVar.o);
        ginVar.h(14, gxlVar.p);
        ginVar.h(15, gxlVar.q);
        ginVar.h(16, gxlVar.r ? 1L : 0L);
        ginVar.h(17, defpackage.gus.k(gxlVar.s));
        ginVar.h(18, gxlVar.t);
        ginVar.h(19, gxlVar.u);
        ginVar.h(20, gxlVar.v);
        ginVar.h(21, gxlVar.w);
        ginVar.h(22, gxlVar.x);
        java.lang.String str2 = gxlVar.y;
        if (str2 == null) {
            ginVar.i(23);
        } else {
            ginVar.j(23, str2);
        }
        java.lang.Boolean bool = gxlVar.z;
        java.lang.Integer numValueOf = bool != null ? java.lang.Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
        if (numValueOf == null) {
            ginVar.i(24);
        } else {
            ginVar.h(24, numValueOf.intValue());
        }
        defpackage.grn grnVar = gxlVar.k;
        ginVar.h(25, defpackage.gus.j(grnVar.b));
        ginVar.f(26, defpackage.gus.s(grnVar.c));
        ginVar.h(27, grnVar.d ? 1L : 0L);
        ginVar.h(28, grnVar.e ? 1L : 0L);
        ginVar.h(29, grnVar.f ? 1L : 0L);
        ginVar.h(30, grnVar.g ? 1L : 0L);
        ginVar.h(31, grnVar.h);
        ginVar.h(32, grnVar.i);
        ginVar.f(33, defpackage.gus.t(grnVar.j));
        ginVar.j(34, str);
    }
}
