package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwx implements defpackage.gwv {
    private final defpackage.gfy a;

    public gwx(defpackage.gfy gfyVar) {
        this.a = gfyVar;
    }

    @Override // defpackage.gwv
    public final java.util.List a(defpackage.giv givVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        final defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        final java.lang.String str = (java.lang.String) rsrVarI.a;
        return (java.util.List) defpackage.dez.m(this.a, true, false, new defpackage.aonj() { // from class: gww
            /* JADX WARN: Type inference failed for: r0v3, types: [aonj, java.lang.Object] */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj) {
                int iC;
                int i;
                int iC2;
                int i2;
                int iC3;
                int i3;
                boolean z;
                int i4;
                boolean z2;
                int i5;
                boolean z3;
                int i6;
                boolean z4;
                int i7;
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                defpackage.aooh.f(gjhVar, "_connection");
                defpackage.gin ginVarA = gjhVar.a(str);
                defpackage.gwx gwxVar = this;
                try {
                    rsrVarI.b.a(ginVarA);
                    int iQ = defpackage.dzk.Q(ginVarA, "id");
                    int iQ2 = defpackage.dzk.Q(ginVarA, "state");
                    int iQ3 = defpackage.dzk.Q(ginVarA, "output");
                    int iQ4 = defpackage.dzk.Q(ginVarA, "initial_delay");
                    int iQ5 = defpackage.dzk.Q(ginVarA, "interval_duration");
                    int iQ6 = defpackage.dzk.Q(ginVarA, "flex_duration");
                    int iQ7 = defpackage.dzk.Q(ginVarA, "run_attempt_count");
                    int iQ8 = defpackage.dzk.Q(ginVarA, "backoff_policy");
                    int iQ9 = defpackage.dzk.Q(ginVarA, "backoff_delay_duration");
                    int iQ10 = defpackage.dzk.Q(ginVarA, "last_enqueue_time");
                    int iQ11 = defpackage.dzk.Q(ginVarA, "period_count");
                    int iQ12 = defpackage.dzk.Q(ginVarA, "generation");
                    java.lang.String str2 = "getValue(...)";
                    int iQ13 = defpackage.dzk.Q(ginVarA, "next_schedule_time_override");
                    int iQ14 = defpackage.dzk.Q(ginVarA, "stop_reason");
                    int iQ15 = defpackage.dzk.Q(ginVarA, "worker_class_name");
                    int iQ16 = defpackage.dzk.Q(ginVarA, "required_network_type");
                    int iQ17 = defpackage.dzk.Q(ginVarA, "required_network_request");
                    int iQ18 = defpackage.dzk.Q(ginVarA, "requires_charging");
                    int iQ19 = defpackage.dzk.Q(ginVarA, "requires_device_idle");
                    int iQ20 = defpackage.dzk.Q(ginVarA, "requires_battery_not_low");
                    int iQ21 = defpackage.dzk.Q(ginVarA, "requires_storage_not_low");
                    int iQ22 = defpackage.dzk.Q(ginVarA, "trigger_content_update_delay");
                    int iQ23 = defpackage.dzk.Q(ginVarA, "trigger_max_content_delay");
                    int iQ24 = defpackage.dzk.Q(ginVarA, "content_uri_triggers");
                    defpackage.aca acaVar = new defpackage.aca();
                    int i8 = iQ12;
                    defpackage.aca acaVar2 = new defpackage.aca();
                    while (ginVarA.m()) {
                        int i9 = iQ11;
                        java.lang.String strE = ginVarA.e(iQ);
                        if (!acaVar.containsKey(strE)) {
                            acaVar.put(strE, new java.util.ArrayList());
                        }
                        java.lang.String strE2 = ginVarA.e(iQ);
                        if (!acaVar2.containsKey(strE2)) {
                            acaVar2.put(strE2, new java.util.ArrayList());
                        }
                        iQ11 = i9;
                        iQ10 = iQ10;
                    }
                    int i10 = iQ10;
                    int i11 = iQ11;
                    ginVarA.k();
                    gwxVar.c(gjhVar, acaVar);
                    gwxVar.b(gjhVar, acaVar2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        if (iQ == -1) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        java.lang.String strE3 = ginVarA.e(iQ);
                        if (iQ2 == -1) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        defpackage.gsw gswVarP = defpackage.gus.p((int) ginVarA.c(iQ2));
                        if (iQ3 == -1) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        byte[] bArrN = ginVarA.n(iQ3);
                        defpackage.grp grpVar = defpackage.grp.a;
                        defpackage.grp grpVarZ = defpackage.gus.z(bArrN);
                        long jC = iQ4 == -1 ? 0L : ginVarA.c(iQ4);
                        long jC2 = iQ5 == -1 ? 0L : ginVarA.c(iQ5);
                        long jC3 = iQ6 == -1 ? 0L : ginVarA.c(iQ6);
                        int iC4 = iQ7 == -1 ? 0 : (int) ginVarA.c(iQ7);
                        if (iQ8 == -1) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        int i12 = iQ2;
                        defpackage.grj grjVarM = defpackage.gus.m((int) ginVarA.c(iQ8));
                        long jC4 = iQ9 == -1 ? 0L : ginVarA.c(iQ9);
                        int i13 = i10;
                        long jC5 = i13 == -1 ? 0L : ginVarA.c(i13);
                        i10 = i13;
                        int i14 = i11;
                        if (i14 == -1) {
                            iC = 0;
                            i = -1;
                        } else {
                            iC = (int) ginVarA.c(i14);
                            i = -1;
                        }
                        int i15 = i8;
                        if (i15 == i) {
                            iC2 = 0;
                            i2 = i;
                        } else {
                            iC2 = (int) ginVarA.c(i15);
                            i2 = -1;
                        }
                        int i16 = iQ13;
                        long jC6 = i16 == i2 ? 0L : ginVarA.c(i16);
                        int i17 = iQ14;
                        if (i17 == i2) {
                            iC3 = 0;
                            i3 = i2;
                        } else {
                            iC3 = (int) ginVarA.c(i17);
                            i3 = -1;
                        }
                        int i18 = iQ15;
                        if (i18 == i3) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                        }
                        java.lang.String strE4 = ginVarA.e(i18);
                        int i19 = iQ16;
                        if (i19 == i3) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int i20 = iQ6;
                        defpackage.gsi gsiVarN = defpackage.gus.n((int) ginVarA.c(i19));
                        int i21 = iQ17;
                        if (i21 == -1) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        defpackage.gyf gyfVarQ = defpackage.gus.q(ginVarA.n(i21));
                        int i22 = iQ18;
                        if (i22 == -1) {
                            z = false;
                            i4 = -1;
                            iQ19 = iQ19;
                        } else {
                            z = ((int) ginVarA.c(i22)) != 0;
                            i4 = -1;
                        }
                        if (iQ19 == i4) {
                            z2 = false;
                            i5 = i4;
                            iQ20 = iQ20;
                        } else {
                            z2 = ((int) ginVarA.c(iQ19)) != 0;
                            i5 = -1;
                        }
                        if (iQ20 == i5) {
                            z3 = false;
                            i6 = i5;
                            iQ21 = iQ21;
                        } else {
                            z3 = ((int) ginVarA.c(iQ20)) != 0;
                            i6 = -1;
                        }
                        if (iQ21 == i6) {
                            z4 = false;
                            i7 = i6;
                            iQ22 = iQ22;
                        } else {
                            z4 = ((int) ginVarA.c(iQ21)) != 0;
                            i7 = -1;
                        }
                        long jC7 = iQ22 == i7 ? 0L : ginVarA.c(iQ22);
                        int i23 = iQ23;
                        long jC8 = i23 == i7 ? 0L : ginVarA.c(i23);
                        iQ23 = i23;
                        int i24 = iQ24;
                        if (i24 == i7) {
                            throw new java.lang.IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        defpackage.grn grnVar = new defpackage.grn(gyfVarQ, gsiVarN, z, z2, z3, z4, jC7, jC8, defpackage.gus.r(ginVarA.n(i24)));
                        java.lang.Object objAN = defpackage.ajsz.aN(acaVar, ginVarA.e(iQ));
                        defpackage.aca acaVar3 = acaVar;
                        java.lang.String str3 = str2;
                        defpackage.aooh.e(objAN, str3);
                        java.util.List list = (java.util.List) objAN;
                        java.lang.Object objAN2 = defpackage.ajsz.aN(acaVar2, ginVarA.e(iQ));
                        defpackage.aooh.e(objAN2, str3);
                        arrayList.add(new defpackage.gxk(strE3, gswVarP, grpVarZ, jC, jC2, jC3, grnVar, iC4, grjVarM, jC4, jC5, iC, iC2, jC6, iC3, list, strE4, (java.util.List) objAN2));
                        i11 = i14;
                        iQ13 = i16;
                        iQ3 = iQ3;
                        str2 = str3;
                        iQ24 = i24;
                        iQ21 = iQ21;
                        iQ8 = iQ8;
                        acaVar = acaVar3;
                        iQ19 = iQ19;
                        iQ22 = iQ22;
                        iQ6 = i20;
                        iQ9 = iQ9;
                        iQ16 = i19;
                        iQ20 = iQ20;
                        iQ7 = iQ7;
                        iQ18 = i22;
                        iQ17 = i21;
                        iQ5 = iQ5;
                        iQ14 = i17;
                        iQ15 = i18;
                        iQ4 = iQ4;
                        i8 = i15;
                        iQ2 = i12;
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            }
        });
    }

    public final void b(defpackage.gjh gjhVar, defpackage.aca acaVar) {
        java.util.Set setKeySet = acaVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (acaVar.d > 999) {
            hgu.U(acaVar, new gwo(this, gjhVar, 2));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        defpackage.dzk.P(sb, setKeySet.size());
        sb.append(')');
        defpackage.gin ginVarA = gjhVar.a(sb.toString());
        java.util.Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ginVarA.j(i, (java.lang.String) it.next());
            i++;
        }
        try {
            int iQ = defpackage.dzk.Q(ginVarA, "work_spec_id");
            if (iQ != -1) {
                while (ginVarA.m()) {
                    java.util.List list = (java.util.List) acaVar.get(ginVarA.e(iQ));
                    if (list != null) {
                        byte[] bArrN = ginVarA.n(0);
                        defpackage.grp grpVar = defpackage.grp.a;
                        list.add(defpackage.gus.z(bArrN));
                    }
                }
            }
        } finally {
            ginVarA.close();
        }
    }

    public final void c(defpackage.gjh gjhVar, defpackage.aca acaVar) {
        java.util.Set setKeySet = acaVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (acaVar.d > 999) {
            hgu.U(acaVar, new gwo(this, gjhVar, 3));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        defpackage.dzk.P(sb, setKeySet.size());
        sb.append(')');
        defpackage.gin ginVarA = gjhVar.a(sb.toString());
        java.util.Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ginVarA.j(i, (java.lang.String) it.next());
            i++;
        }
        try {
            int iQ = defpackage.dzk.Q(ginVarA, "work_spec_id");
            if (iQ != -1) {
                while (ginVarA.m()) {
                    java.util.List list = (java.util.List) acaVar.get(ginVarA.e(iQ));
                    if (list != null) {
                        list.add(ginVarA.e(0));
                    }
                }
            }
        } finally {
            ginVarA.close();
        }
    }
}
