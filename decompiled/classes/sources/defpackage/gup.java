package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gup extends defpackage.gga {
    final /* synthetic */ androidx.work.impl.WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gup(androidx.work.impl.WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.gga
    public final void a(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        defpackage.dzk.M(gjhVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        defpackage.dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.gga
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `Dependency`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `WorkSpec`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `WorkTag`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `WorkName`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `WorkProgress`");
        defpackage.dzk.M(gjhVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.gga
    public final void c(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.gin ginVarA = gjhVar.a("PRAGMA foreign_keys = ON");
        try {
            ginVarA.m();
            ginVarA.close();
            this.d.u(gjhVar);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.gga
    public final void d(defpackage.gjh gjhVar) {
        hgu.V(gjhVar);
    }

    @Override // defpackage.gga
    public final akwb g(defpackage.gjh gjhVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("work_spec_id", new ghy("work_spec_id", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap.put("prerequisite_id", new ghy("prerequisite_id", "TEXT", true, 2, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("id")));
        linkedHashSet.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("prerequisite_id"), defpackage.ajsz.aY("id")));
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        linkedHashSet2.add(new gia("index_Dependency_work_spec_id", false, defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("ASC")));
        linkedHashSet2.add(new gia("index_Dependency_prerequisite_id", false, defpackage.ajsz.aY("prerequisite_id"), defpackage.ajsz.aY("ASC")));
        gib gibVar = new gib("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        gib gibVarT = hgu.T(gjhVar, "Dependency");
        if (!hgu.S(gibVar, gibVarT)) {
            return new akwb(false, defpackage.a.bi(gibVarT, gibVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("id", new ghy("id", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap2.put("state", new ghy("state", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("worker_class_name", new ghy("worker_class_name", "TEXT", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("input_merger_class_name", new ghy("input_merger_class_name", "TEXT", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("input", new ghy("input", "BLOB", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("output", new ghy("output", "BLOB", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("initial_delay", new ghy("initial_delay", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("interval_duration", new ghy("interval_duration", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("flex_duration", new ghy("flex_duration", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("run_attempt_count", new ghy("run_attempt_count", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("backoff_policy", new ghy("backoff_policy", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("backoff_delay_duration", new ghy("backoff_delay_duration", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("last_enqueue_time", new ghy("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new ghy("minimum_retention_duration", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("schedule_requested_at", new ghy("schedule_requested_at", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("run_in_foreground", new ghy("run_in_foreground", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("out_of_quota_policy", new ghy("out_of_quota_policy", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("period_count", new ghy("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new ghy("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new ghy("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new ghy("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new ghy("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new ghy("trace_tag", "TEXT", false, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new ghy("backoff_on_system_interruptions", "INTEGER", false, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("required_network_type", new ghy("required_network_type", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("required_network_request", new ghy("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new ghy("requires_charging", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("requires_device_idle", new ghy("requires_device_idle", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("requires_battery_not_low", new ghy("requires_battery_not_low", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("requires_storage_not_low", new ghy("requires_storage_not_low", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new ghy("trigger_content_update_delay", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new ghy("trigger_max_content_delay", "INTEGER", true, 0, (java.lang.String) null, 1));
        linkedHashMap2.put("content_uri_triggers", new ghy("content_uri_triggers", "BLOB", true, 0, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet3 = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet4 = new java.util.LinkedHashSet();
        linkedHashSet4.add(new gia("index_WorkSpec_schedule_requested_at", false, defpackage.ajsz.aY("schedule_requested_at"), defpackage.ajsz.aY("ASC")));
        linkedHashSet4.add(new gia("index_WorkSpec_last_enqueue_time", false, defpackage.ajsz.aY("last_enqueue_time"), defpackage.ajsz.aY("ASC")));
        gib gibVar2 = new gib("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        gib gibVarT2 = hgu.T(gjhVar, "WorkSpec");
        if (!hgu.S(gibVar2, gibVarT2)) {
            return new akwb(false, defpackage.a.bi(gibVarT2, gibVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        linkedHashMap3.put("tag", new ghy("tag", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap3.put("work_spec_id", new ghy("work_spec_id", "TEXT", true, 2, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet5 = new java.util.LinkedHashSet();
        linkedHashSet5.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("id")));
        java.util.LinkedHashSet linkedHashSet6 = new java.util.LinkedHashSet();
        linkedHashSet6.add(new gia("index_WorkTag_work_spec_id", false, defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("ASC")));
        gib gibVar3 = new gib("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        gib gibVarT3 = hgu.T(gjhVar, "WorkTag");
        if (!hgu.S(gibVar3, gibVarT3)) {
            return new akwb(false, defpackage.a.bi(gibVarT3, gibVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new ghy("work_spec_id", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap4.put("generation", new ghy("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new ghy("system_id", "INTEGER", true, 0, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet7 = new java.util.LinkedHashSet();
        linkedHashSet7.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("id")));
        gib gibVar4 = new gib("SystemIdInfo", linkedHashMap4, linkedHashSet7, new java.util.LinkedHashSet());
        gib gibVarT4 = hgu.T(gjhVar, "SystemIdInfo");
        if (!hgu.S(gibVar4, gibVarT4)) {
            return new akwb(false, defpackage.a.bi(gibVarT4, gibVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        linkedHashMap5.put("name", new ghy("name", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap5.put("work_spec_id", new ghy("work_spec_id", "TEXT", true, 2, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet8 = new java.util.LinkedHashSet();
        linkedHashSet8.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("id")));
        java.util.LinkedHashSet linkedHashSet9 = new java.util.LinkedHashSet();
        linkedHashSet9.add(new gia("index_WorkName_work_spec_id", false, defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("ASC")));
        gib gibVar5 = new gib("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        gib gibVarT5 = hgu.T(gjhVar, "WorkName");
        if (!hgu.S(gibVar5, gibVarT5)) {
            return new akwb(false, defpackage.a.bi(gibVarT5, gibVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new ghy("work_spec_id", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap6.put("progress", new ghy("progress", "BLOB", true, 0, (java.lang.String) null, 1));
        java.util.LinkedHashSet linkedHashSet10 = new java.util.LinkedHashSet();
        linkedHashSet10.add(new ghz("WorkSpec", "CASCADE", "CASCADE", defpackage.ajsz.aY("work_spec_id"), defpackage.ajsz.aY("id")));
        gib gibVar6 = new gib("WorkProgress", linkedHashMap6, linkedHashSet10, new java.util.LinkedHashSet());
        gib gibVarT6 = hgu.T(gjhVar, "WorkProgress");
        if (!hgu.S(gibVar6, gibVarT6)) {
            return new akwb(false, defpackage.a.bi(gibVarT6, gibVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap();
        linkedHashMap7.put("key", new ghy("key", "TEXT", true, 1, (java.lang.String) null, 1));
        linkedHashMap7.put("long_value", new ghy("long_value", "INTEGER", false, 0, (java.lang.String) null, 1));
        gib gibVar7 = new gib("Preference", linkedHashMap7, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        gib gibVarT7 = hgu.T(gjhVar, "Preference");
        return !hgu.S(gibVar7, gibVarT7) ? new akwb(false, defpackage.a.bi(gibVarT7, gibVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new akwb(true, (java.lang.String) null);
    }

    @Override // defpackage.gga
    public final void e() {
    }

    @Override // defpackage.gga
    public final void f() {
    }
}
