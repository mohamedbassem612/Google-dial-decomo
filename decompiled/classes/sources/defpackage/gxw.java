package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxw implements defpackage.gxm {
    public final defpackage.gfj a = new defpackage.gxu();
    public final defpackage.gfi b = new defpackage.gxv();
    private final defpackage.gfy c;

    public gxw(defpackage.gfy gfyVar) {
        this.c = gfyVar;
    }

    @Override // defpackage.gxm
    public final void A(defpackage.gsw gswVar, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.cju(gswVar, str, 4))).intValue();
    }

    @Override // defpackage.gxm
    public final java.util.List B() {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.aonj() { // from class: gxs
            public final /* synthetic */ java.lang.String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a(this.a);
                try {
                    ginVarA.h(1, 20L);
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "state");
                    int iS3 = defpackage.dzk.S(ginVarA, "worker_class_name");
                    int iS4 = defpackage.dzk.S(ginVarA, "input_merger_class_name");
                    int iS5 = defpackage.dzk.S(ginVarA, "input");
                    int iS6 = defpackage.dzk.S(ginVarA, "output");
                    int iS7 = defpackage.dzk.S(ginVarA, "initial_delay");
                    int iS8 = defpackage.dzk.S(ginVarA, "interval_duration");
                    int iS9 = defpackage.dzk.S(ginVarA, "flex_duration");
                    int iS10 = defpackage.dzk.S(ginVarA, "run_attempt_count");
                    int iS11 = defpackage.dzk.S(ginVarA, "backoff_policy");
                    int iS12 = defpackage.dzk.S(ginVarA, "backoff_delay_duration");
                    int iS13 = defpackage.dzk.S(ginVarA, "last_enqueue_time");
                    int iS14 = defpackage.dzk.S(ginVarA, "minimum_retention_duration");
                    int iS15 = defpackage.dzk.S(ginVarA, "schedule_requested_at");
                    int iS16 = defpackage.dzk.S(ginVarA, "run_in_foreground");
                    int iS17 = defpackage.dzk.S(ginVarA, "out_of_quota_policy");
                    int iS18 = defpackage.dzk.S(ginVarA, "period_count");
                    int iS19 = defpackage.dzk.S(ginVarA, "generation");
                    int iS20 = defpackage.dzk.S(ginVarA, "next_schedule_time_override");
                    int iS21 = defpackage.dzk.S(ginVarA, "next_schedule_time_override_generation");
                    int iS22 = defpackage.dzk.S(ginVarA, "stop_reason");
                    int iS23 = defpackage.dzk.S(ginVarA, "trace_tag");
                    int iS24 = defpackage.dzk.S(ginVarA, "backoff_on_system_interruptions");
                    int iS25 = defpackage.dzk.S(ginVarA, "required_network_type");
                    int iS26 = defpackage.dzk.S(ginVarA, "required_network_request");
                    int iS27 = defpackage.dzk.S(ginVarA, "requires_charging");
                    int iS28 = defpackage.dzk.S(ginVarA, "requires_device_idle");
                    int iS29 = defpackage.dzk.S(ginVarA, "requires_battery_not_low");
                    int iS30 = defpackage.dzk.S(ginVarA, "requires_storage_not_low");
                    int iS31 = defpackage.dzk.S(ginVarA, "trigger_content_update_delay");
                    int iS32 = defpackage.dzk.S(ginVarA, "trigger_max_content_delay");
                    int iS33 = defpackage.dzk.S(ginVarA, "content_uri_triggers");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        java.lang.String strE = ginVarA.e(iS);
                        int i = iS13;
                        int i2 = iS14;
                        defpackage.gsw gswVarP = defpackage.gus.p((int) ginVarA.c(iS2));
                        java.lang.String strE2 = ginVarA.e(iS3);
                        java.lang.String strE3 = ginVarA.e(iS4);
                        byte[] bArrN = ginVarA.n(iS5);
                        defpackage.grp grpVar = defpackage.grp.a;
                        defpackage.grp grpVarZ = defpackage.gus.z(bArrN);
                        defpackage.grp grpVarZ2 = defpackage.gus.z(ginVarA.n(iS6));
                        long jC = ginVarA.c(iS7);
                        long jC2 = ginVarA.c(iS8);
                        long jC3 = ginVarA.c(iS9);
                        int iC = (int) ginVarA.c(iS10);
                        int i3 = iS;
                        int i4 = iS2;
                        defpackage.grj grjVarM = defpackage.gus.m((int) ginVarA.c(iS11));
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
                        defpackage.gss gssVarO = defpackage.gus.o((int) ginVarA.c(i8));
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
                        defpackage.gsi gsiVarN = defpackage.gus.n((int) ginVarA.c(i16));
                        int i17 = iS26;
                        defpackage.gyf gyfVarQ = defpackage.gus.q(ginVarA.n(i17));
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
                        arrayList.add(new defpackage.gxl(strE, gswVarP, strE2, strE3, grpVarZ, grpVarZ2, jC, jC2, jC3, new defpackage.grn(gyfVarQ, gsiVarN, z2, z3, z4, ((int) ginVarA.c(i21)) != 0, ginVarA.c(i22), ginVarA.c(i23), defpackage.gus.r(ginVarA.n(i24))), iC, grjVarM, jC4, jC5, jC6, jC7, z, gssVarO, iC2, iC3, jC8, iC4, iC5, strE4, bool));
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
        });
    }

    @Override // defpackage.gxm
    public final int a() {
        return ((java.lang.Number) defpackage.dez.m(this.c, true, false, new fxs(13, (byte[]) null))).intValue();
    }

    @Override // defpackage.gxm
    public final defpackage.gsw b(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return (defpackage.gsw) defpackage.dez.m(this.c, true, false, new defpackage.gxp(str, 7, (float[]) null));
    }

    @Override // defpackage.gxm
    public final defpackage.gxl c(final java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return (defpackage.gxl) defpackage.dez.m(this.c, true, false, new defpackage.aonj() { // from class: gxr
            public final /* synthetic */ java.lang.String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                java.lang.String str2 = str;
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a(this.a);
                try {
                    ginVarA.j(1, str2);
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "state");
                    int iS3 = defpackage.dzk.S(ginVarA, "worker_class_name");
                    int iS4 = defpackage.dzk.S(ginVarA, "input_merger_class_name");
                    int iS5 = defpackage.dzk.S(ginVarA, "input");
                    int iS6 = defpackage.dzk.S(ginVarA, "output");
                    int iS7 = defpackage.dzk.S(ginVarA, "initial_delay");
                    int iS8 = defpackage.dzk.S(ginVarA, "interval_duration");
                    int iS9 = defpackage.dzk.S(ginVarA, "flex_duration");
                    int iS10 = defpackage.dzk.S(ginVarA, "run_attempt_count");
                    int iS11 = defpackage.dzk.S(ginVarA, "backoff_policy");
                    int iS12 = defpackage.dzk.S(ginVarA, "backoff_delay_duration");
                    int iS13 = defpackage.dzk.S(ginVarA, "last_enqueue_time");
                    int iS14 = defpackage.dzk.S(ginVarA, "minimum_retention_duration");
                    int iS15 = defpackage.dzk.S(ginVarA, "schedule_requested_at");
                    int iS16 = defpackage.dzk.S(ginVarA, "run_in_foreground");
                    int iS17 = defpackage.dzk.S(ginVarA, "out_of_quota_policy");
                    int iS18 = defpackage.dzk.S(ginVarA, "period_count");
                    int iS19 = defpackage.dzk.S(ginVarA, "generation");
                    int iS20 = defpackage.dzk.S(ginVarA, "next_schedule_time_override");
                    int iS21 = defpackage.dzk.S(ginVarA, "next_schedule_time_override_generation");
                    int iS22 = defpackage.dzk.S(ginVarA, "stop_reason");
                    int iS23 = defpackage.dzk.S(ginVarA, "trace_tag");
                    int iS24 = defpackage.dzk.S(ginVarA, "backoff_on_system_interruptions");
                    int iS25 = defpackage.dzk.S(ginVarA, "required_network_type");
                    int iS26 = defpackage.dzk.S(ginVarA, "required_network_request");
                    int iS27 = defpackage.dzk.S(ginVarA, "requires_charging");
                    int iS28 = defpackage.dzk.S(ginVarA, "requires_device_idle");
                    int iS29 = defpackage.dzk.S(ginVarA, "requires_battery_not_low");
                    int iS30 = defpackage.dzk.S(ginVarA, "requires_storage_not_low");
                    int iS31 = defpackage.dzk.S(ginVarA, "trigger_content_update_delay");
                    int iS32 = defpackage.dzk.S(ginVarA, "trigger_max_content_delay");
                    int iS33 = defpackage.dzk.S(ginVarA, "content_uri_triggers");
                    java.lang.Object gxlVar = null;
                    if (ginVarA.m()) {
                        java.lang.String strE = ginVarA.e(iS);
                        defpackage.gsw gswVarP = defpackage.gus.p((int) ginVarA.c(iS2));
                        java.lang.String strE2 = ginVarA.e(iS3);
                        java.lang.String strE3 = ginVarA.e(iS4);
                        byte[] bArrN = ginVarA.n(iS5);
                        defpackage.grp grpVar = defpackage.grp.a;
                        defpackage.grp grpVarZ = defpackage.gus.z(bArrN);
                        defpackage.grp grpVarZ2 = defpackage.gus.z(ginVarA.n(iS6));
                        long jC = ginVarA.c(iS7);
                        long jC2 = ginVarA.c(iS8);
                        long jC3 = ginVarA.c(iS9);
                        int iC = (int) ginVarA.c(iS10);
                        defpackage.grj grjVarM = defpackage.gus.m((int) ginVarA.c(iS11));
                        long jC4 = ginVarA.c(iS12);
                        long jC5 = ginVarA.c(iS13);
                        long jC6 = ginVarA.c(iS14);
                        long jC7 = ginVarA.c(iS15);
                        boolean z = ((int) ginVarA.c(iS16)) != 0;
                        defpackage.gss gssVarO = defpackage.gus.o((int) ginVarA.c(iS17));
                        int iC2 = (int) ginVarA.c(iS18);
                        int iC3 = (int) ginVarA.c(iS19);
                        long jC8 = ginVarA.c(iS20);
                        int iC4 = (int) ginVarA.c(iS21);
                        int iC5 = (int) ginVarA.c(iS22);
                        java.lang.String strE4 = ginVarA.l(iS23) ? null : ginVarA.e(iS23);
                        java.lang.Integer numValueOf = ginVarA.l(iS24) ? null : java.lang.Integer.valueOf((int) ginVarA.c(iS24));
                        if (numValueOf != null) {
                            gxlVar = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        gxlVar = new defpackage.gxl(strE, gswVarP, strE2, strE3, grpVarZ, grpVarZ2, jC, jC2, jC3, new defpackage.grn(defpackage.gus.q(ginVarA.n(iS26)), defpackage.gus.n((int) ginVarA.c(iS25)), ((int) ginVarA.c(iS27)) != 0, ((int) ginVarA.c(iS28)) != 0, ((int) ginVarA.c(iS29)) != 0, ((int) ginVarA.c(iS30)) != 0, ginVarA.c(iS31), ginVarA.c(iS32), defpackage.gus.r(ginVarA.n(iS33))), iC, grjVarM, jC4, jC5, jC6, jC7, z, gssVarO, iC2, iC3, jC8, iC4, iC5, strE4, (java.lang.Boolean) gxlVar);
                    }
                    return gxlVar;
                } finally {
                    ginVarA.close();
                }
            }
        });
    }

    @Override // defpackage.gxm
    public final java.util.List d() {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.gxo(3, (short[]) null));
    }

    @Override // defpackage.gxm
    public final java.util.List e(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.gxp(str, 3, (char[]) null));
    }

    @Override // defpackage.gxm
    public final java.util.List f(long j) {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new gxq(j));
    }

    @Override // defpackage.gxm
    public final java.util.List g() {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.gxo(2, (char[]) null));
    }

    @Override // defpackage.gxm
    public final java.util.List h() {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new fxs(12));
    }

    @Override // defpackage.gxm
    public final java.util.List i(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.bet(str, 20, (float[]) null));
    }

    @Override // defpackage.gxm
    public final java.util.List j(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.bet(str, 19, (boolean[]) null));
    }

    @Override // defpackage.gxm
    public final defpackage.aoxh k() {
        defpackage.gxo gxoVar = new defpackage.gxo(1, (byte[]) null);
        defpackage.gfy gfyVar = this.c;
        defpackage.gfn gfnVarB = gfyVar.b();
        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"workspec"}, 1);
        if (strArr == null) {
            defpackage.aooh.i("tables");
        }
        defpackage.ggq ggqVar = gfnVarB.c;
        if (strArr == null) {
            defpackage.aooh.i("names");
        }
        defpackage.aolg aolgVar = new defpackage.aolg();
        for (java.lang.String str : strArr) {
            java.util.Map map = ggqVar.b;
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            java.util.Set set = (java.util.Set) map.get(lowerCase);
            if (set != null) {
                aolgVar.addAll(set);
            } else {
                aolgVar.add(str);
            }
        }
        java.lang.String[] strArr2 = (java.lang.String[]) aolgVar.b().toArray(new java.lang.String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = strArr2[i];
            java.util.Map map2 = ggqVar.d;
            java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase2, "toLowerCase(...)");
            java.lang.Integer num = (java.lang.Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("There is no table with name ".concat(java.lang.String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        defpackage.aoiu aoiuVar = new defpackage.aoiu(strArr2, iArr);
        java.lang.String[] strArr3 = (java.lang.String[]) aoiuVar.a;
        int[] iArr2 = (int[]) aoiuVar.b;
        if (strArr3 == null) {
            defpackage.aooh.i("resolvedTableNames");
        }
        if (iArr2 == null) {
            defpackage.aooh.i("tableIds");
        }
        defpackage.aowy aowyVar = new defpackage.aowy(new defpackage.ggk(ggqVar, iArr2, strArr3, (defpackage.aoln) null, 0));
        hgu hguVar = gfnVarB.k;
        return new defpackage.ggu(defpackage.aoov.aD(new defpackage.gdc(new defpackage.gdc((defpackage.aonn) new defpackage.gbm(gfnVarB, (defpackage.aoln) null, 3), (defpackage.aoxh) aowyVar, 7), new defpackage.gfm(gfnVarB, (defpackage.aoln) null, 0), 6), -1), gfyVar, gxoVar);
    }

    @Override // defpackage.gxm
    public final void l(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.bet(str, 18, (int[]) null));
    }

    @Override // defpackage.gxm
    public final void m(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.gxp(str, 2, (byte[]) null));
    }

    @Override // defpackage.gxm
    public final void n(defpackage.gxl gxlVar) {
        if (gxlVar == null) {
            defpackage.aooh.i("workSpec");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.gxp(this, gxlVar, 8));
    }

    @Override // defpackage.gxm
    public final void o(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.gxa(str, i, 3, (byte[]) null));
    }

    @Override // defpackage.gxm
    public final void p(java.lang.String str, long j) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.gxt(j, str, 0));
    }

    @Override // defpackage.gxm
    public final void q(java.lang.String str, defpackage.grp grpVar) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        if (grpVar == null) {
            defpackage.aooh.i("output");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.cju(grpVar, str, 3));
    }

    @Override // defpackage.gxm
    public final void r(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        defpackage.dez.m(this.c, false, true, new defpackage.gxa(i, str, 2));
    }

    @Override // defpackage.gxm
    public final void s(defpackage.gxl gxlVar) {
        defpackage.aooh.f(gxlVar, "workSpec");
        defpackage.dez.m(this.c, false, true, new defpackage.gxp(this, gxlVar, 1));
    }

    @Override // defpackage.gxm
    public final boolean t(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return ((java.lang.Boolean) defpackage.dez.m(this.c, true, false, new defpackage.gxp(str, 5, (int[]) null))).booleanValue();
    }

    @Override // defpackage.gxm
    public final java.util.List u() {
        return (java.util.List) defpackage.dez.m(this.c, true, false, new defpackage.aonj() { // from class: gxn
            public final /* synthetic */ java.lang.String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a(this.a);
                try {
                    ginVarA.h(1, 200L);
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "state");
                    int iS3 = defpackage.dzk.S(ginVarA, "worker_class_name");
                    int iS4 = defpackage.dzk.S(ginVarA, "input_merger_class_name");
                    int iS5 = defpackage.dzk.S(ginVarA, "input");
                    int iS6 = defpackage.dzk.S(ginVarA, "output");
                    int iS7 = defpackage.dzk.S(ginVarA, "initial_delay");
                    int iS8 = defpackage.dzk.S(ginVarA, "interval_duration");
                    int iS9 = defpackage.dzk.S(ginVarA, "flex_duration");
                    int iS10 = defpackage.dzk.S(ginVarA, "run_attempt_count");
                    int iS11 = defpackage.dzk.S(ginVarA, "backoff_policy");
                    int iS12 = defpackage.dzk.S(ginVarA, "backoff_delay_duration");
                    int iS13 = defpackage.dzk.S(ginVarA, "last_enqueue_time");
                    int iS14 = defpackage.dzk.S(ginVarA, "minimum_retention_duration");
                    int iS15 = defpackage.dzk.S(ginVarA, "schedule_requested_at");
                    int iS16 = defpackage.dzk.S(ginVarA, "run_in_foreground");
                    int iS17 = defpackage.dzk.S(ginVarA, "out_of_quota_policy");
                    int iS18 = defpackage.dzk.S(ginVarA, "period_count");
                    int iS19 = defpackage.dzk.S(ginVarA, "generation");
                    int iS20 = defpackage.dzk.S(ginVarA, "next_schedule_time_override");
                    int iS21 = defpackage.dzk.S(ginVarA, "next_schedule_time_override_generation");
                    int iS22 = defpackage.dzk.S(ginVarA, "stop_reason");
                    int iS23 = defpackage.dzk.S(ginVarA, "trace_tag");
                    int iS24 = defpackage.dzk.S(ginVarA, "backoff_on_system_interruptions");
                    int iS25 = defpackage.dzk.S(ginVarA, "required_network_type");
                    int iS26 = defpackage.dzk.S(ginVarA, "required_network_request");
                    int iS27 = defpackage.dzk.S(ginVarA, "requires_charging");
                    int iS28 = defpackage.dzk.S(ginVarA, "requires_device_idle");
                    int iS29 = defpackage.dzk.S(ginVarA, "requires_battery_not_low");
                    int iS30 = defpackage.dzk.S(ginVarA, "requires_storage_not_low");
                    int iS31 = defpackage.dzk.S(ginVarA, "trigger_content_update_delay");
                    int iS32 = defpackage.dzk.S(ginVarA, "trigger_max_content_delay");
                    int iS33 = defpackage.dzk.S(ginVarA, "content_uri_triggers");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        java.lang.String strE = ginVarA.e(iS);
                        int i = iS13;
                        int i2 = iS14;
                        defpackage.gsw gswVarP = defpackage.gus.p((int) ginVarA.c(iS2));
                        java.lang.String strE2 = ginVarA.e(iS3);
                        java.lang.String strE3 = ginVarA.e(iS4);
                        byte[] bArrN = ginVarA.n(iS5);
                        defpackage.grp grpVar = defpackage.grp.a;
                        defpackage.grp grpVarZ = defpackage.gus.z(bArrN);
                        defpackage.grp grpVarZ2 = defpackage.gus.z(ginVarA.n(iS6));
                        long jC = ginVarA.c(iS7);
                        long jC2 = ginVarA.c(iS8);
                        long jC3 = ginVarA.c(iS9);
                        int iC = (int) ginVarA.c(iS10);
                        int i3 = iS;
                        int i4 = iS2;
                        defpackage.grj grjVarM = defpackage.gus.m((int) ginVarA.c(iS11));
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
                        defpackage.gss gssVarO = defpackage.gus.o((int) ginVarA.c(i8));
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
                        defpackage.gsi gsiVarN = defpackage.gus.n((int) ginVarA.c(i16));
                        int i17 = iS26;
                        defpackage.gyf gyfVarQ = defpackage.gus.q(ginVarA.n(i17));
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
                        arrayList.add(new defpackage.gxl(strE, gswVarP, strE2, strE3, grpVarZ, grpVarZ2, jC, jC2, jC3, new defpackage.grn(gyfVarQ, gsiVarN, z2, z3, z4, ((int) ginVarA.c(i21)) != 0, ginVarA.c(i22), ginVarA.c(i23), defpackage.gus.r(ginVarA.n(i24))), iC, grjVarM, jC4, jC5, jC6, jC7, z, gssVarO, iC2, iC3, jC8, iC4, iC5, strE4, bool));
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
        });
    }

    @Override // defpackage.gxm
    public final void v(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.gxp(str, 6, (boolean[]) null))).intValue();
    }

    @Override // defpackage.gxm
    public final void w(java.lang.String str, long j) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.gxt(j, str, 1, null))).intValue();
    }

    @Override // defpackage.gxm
    public final void x() {
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.gxo(0))).intValue();
    }

    @Override // defpackage.gxm
    public final void y(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.gxp(str, 0))).intValue();
    }

    @Override // defpackage.gxm
    public final void z(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        ((java.lang.Number) defpackage.dez.m(this.c, false, true, new defpackage.gxp(str, 4, (short[]) null))).intValue();
    }
}
