package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gxq implements aonj {
    public final /* synthetic */ java.lang.String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
    public final /* synthetic */ long b;

    public final java.lang.Object a(java.lang.Object obj) {
        gjh gjhVar = (gjh) obj;
        aooh.f(gjhVar, "_connection");
        gin ginVarA = gjhVar.a(this.a);
        try {
            ginVarA.h(1, this.b);
            int iS = dzk.S(ginVarA, "id");
            int iS2 = dzk.S(ginVarA, "state");
            int iS3 = dzk.S(ginVarA, "worker_class_name");
            int iS4 = dzk.S(ginVarA, "input_merger_class_name");
            int iS5 = dzk.S(ginVarA, "input");
            int iS6 = dzk.S(ginVarA, "output");
            int iS7 = dzk.S(ginVarA, "initial_delay");
            int iS8 = dzk.S(ginVarA, "interval_duration");
            int iS9 = dzk.S(ginVarA, "flex_duration");
            int iS10 = dzk.S(ginVarA, "run_attempt_count");
            int iS11 = dzk.S(ginVarA, "backoff_policy");
            int iS12 = dzk.S(ginVarA, "backoff_delay_duration");
            int iS13 = dzk.S(ginVarA, "last_enqueue_time");
            int iS14 = dzk.S(ginVarA, "minimum_retention_duration");
            int iS15 = dzk.S(ginVarA, "schedule_requested_at");
            int iS16 = dzk.S(ginVarA, "run_in_foreground");
            int iS17 = dzk.S(ginVarA, "out_of_quota_policy");
            int iS18 = dzk.S(ginVarA, "period_count");
            int iS19 = dzk.S(ginVarA, "generation");
            int iS20 = dzk.S(ginVarA, "next_schedule_time_override");
            int iS21 = dzk.S(ginVarA, "next_schedule_time_override_generation");
            int iS22 = dzk.S(ginVarA, "stop_reason");
            int iS23 = dzk.S(ginVarA, "trace_tag");
            int iS24 = dzk.S(ginVarA, "backoff_on_system_interruptions");
            int iS25 = dzk.S(ginVarA, "required_network_type");
            int iS26 = dzk.S(ginVarA, "required_network_request");
            int iS27 = dzk.S(ginVarA, "requires_charging");
            int iS28 = dzk.S(ginVarA, "requires_device_idle");
            int iS29 = dzk.S(ginVarA, "requires_battery_not_low");
            int iS30 = dzk.S(ginVarA, "requires_storage_not_low");
            int iS31 = dzk.S(ginVarA, "trigger_content_update_delay");
            int iS32 = dzk.S(ginVarA, "trigger_max_content_delay");
            int iS33 = dzk.S(ginVarA, "content_uri_triggers");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (ginVarA.m()) {
                java.lang.String strE = ginVarA.e(iS);
                int i = iS13;
                int i2 = iS14;
                gsw gswVarP = gus.p((int) ginVarA.c(iS2));
                java.lang.String strE2 = ginVarA.e(iS3);
                java.lang.String strE3 = ginVarA.e(iS4);
                byte[] bArrN = ginVarA.n(iS5);
                grp grpVar = grp.a;
                grp grpVarZ = gus.z(bArrN);
                grp grpVarZ2 = gus.z(ginVarA.n(iS6));
                long jC = ginVarA.c(iS7);
                long jC2 = ginVarA.c(iS8);
                long jC3 = ginVarA.c(iS9);
                int iC = (int) ginVarA.c(iS10);
                int i3 = iS;
                int i4 = iS2;
                grj grjVarM = gus.m((int) ginVarA.c(iS11));
                long jC4 = ginVarA.c(iS12);
                long jC5 = ginVarA.c(i);
                long jC6 = ginVarA.c(i2);
                int i5 = iS15;
                long jC7 = ginVarA.c(i5);
                iS15 = i5;
                int i6 = iS16;
                int i7 = iS3;
                boolean z = ((int) ginVarA.c(i6)) != 0;
                int i8 = iS17;
                int i9 = iS4;
                gss gssVarO = gus.o((int) ginVarA.c(i8));
                int i10 = iS18;
                int iC2 = (int) ginVarA.c(i10);
                int i11 = iS19;
                int iC3 = (int) ginVarA.c(i11);
                int i12 = iS20;
                long jC8 = ginVarA.c(i12);
                int i13 = iS21;
                int iC4 = (int) ginVarA.c(i13);
                iS21 = i13;
                iS22 = iS22;
                int iC5 = (int) ginVarA.c(iS22);
                int i14 = iS23;
                java.lang.Boolean boolValueOf = null;
                java.lang.String strE4 = ginVarA.l(i14) ? null : ginVarA.e(i14);
                int i15 = iS24;
                java.lang.Integer numValueOf = ginVarA.l(i15) ? null : java.lang.Integer.valueOf((int) ginVarA.c(i15));
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
                java.lang.Boolean bool = boolValueOf;
                int i16 = iS25;
                gsi gsiVarN = gus.n((int) ginVarA.c(i16));
                int i17 = iS26;
                gyf gyfVarQ = gus.q(ginVarA.n(i17));
                int i18 = iS27;
                boolean z2 = ((int) ginVarA.c(i18)) != 0;
                int i19 = iS28;
                boolean z3 = ((int) ginVarA.c(i19)) != 0;
                int i20 = iS29;
                boolean z4 = ((int) ginVarA.c(i20)) != 0;
                iS29 = i20;
                int i21 = iS30;
                int i22 = iS31;
                int i23 = iS32;
                iS31 = i22;
                int i24 = iS33;
                arrayList.add(new gxl(strE, gswVarP, strE2, strE3, grpVarZ, grpVarZ2, jC, jC2, jC3, new grn(gyfVarQ, gsiVarN, z2, z3, z4, ((int) ginVarA.c(i21)) != 0, ginVarA.c(i22), ginVarA.c(i23), gus.r(ginVarA.n(i24))), iC, grjVarM, jC4, jC5, jC6, jC7, z, gssVarO, iC2, iC3, jC8, iC4, iC5, strE4, bool));
                iS28 = i19;
                iS4 = i9;
                iS17 = i8;
                iS18 = i10;
                iS19 = i11;
                iS20 = i12;
                iS23 = i14;
                iS24 = i15;
                iS25 = i16;
                iS26 = i17;
                iS27 = i18;
                iS33 = i24;
                iS32 = i23;
                iS30 = i21;
                iS = i3;
                iS3 = i7;
                iS13 = i;
                iS14 = i2;
                iS2 = i4;
                iS16 = i6;
            }
            return arrayList;
        } finally {
            ginVarA.close();
        }
    }
}
