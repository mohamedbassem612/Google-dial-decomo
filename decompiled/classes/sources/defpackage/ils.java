package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ils {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ils() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
        this.b = byteArrayOutputStream;
        this.a = new java.io.DataOutputStream(byteArrayOutputStream);
    }

    public static /* synthetic */ java.util.List e(java.lang.String str, java.lang.String str2, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
            ginVarA.j(1, str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (ginVarA.m()) {
                arrayList.add(ginVarA.e(0));
            }
            ginVarA.close();
            return arrayList;
        } catch (java.lang.Throwable th) {
            ginVarA.close();
            throw th;
        }
    }

    public static /* synthetic */ defpackage.aojh f(java.lang.String str, java.lang.String str2, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
            ginVarA.j(1, str2);
            ginVarA.m();
            return defpackage.aojh.a;
        } finally {
            ginVarA.close();
        }
    }

    public static /* synthetic */ int g(java.lang.String str, java.lang.String str2, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
            ginVarA.j(1, str2);
            ginVarA.m();
            return defpackage.dez.i(gjhVar);
        } finally {
            ginVarA.close();
        }
    }

    public static /* synthetic */ java.util.List h(java.lang.String str, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
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
                int i = iS14;
                java.util.ArrayList arrayList2 = arrayList;
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
                int i2 = iS2;
                int i3 = iS3;
                defpackage.grj grjVarM = defpackage.gus.m((int) ginVarA.c(iS11));
                long jC4 = ginVarA.c(iS12);
                long jC5 = ginVarA.c(iS13);
                long jC6 = ginVarA.c(i);
                int i4 = iS15;
                long jC7 = ginVarA.c(i4);
                int i5 = iS;
                int i6 = iS16;
                boolean z = ((int) ginVarA.c(i6)) != 0;
                int i7 = iS17;
                int i8 = iS4;
                defpackage.gss gssVarO = defpackage.gus.o((int) ginVarA.c(i7));
                int i9 = iS18;
                int i10 = iS5;
                int iC2 = (int) ginVarA.c(i9);
                int i11 = iS19;
                int iC3 = (int) ginVarA.c(i11);
                int i12 = iS20;
                long jC8 = ginVarA.c(i12);
                int i13 = iS21;
                int iC4 = (int) ginVarA.c(i13);
                int i14 = iS22;
                int iC5 = (int) ginVarA.c(i14);
                int i15 = iS23;
                java.lang.Boolean boolValueOf = null;
                java.lang.String strE4 = ginVarA.l(i15) ? null : ginVarA.e(i15);
                int i16 = iS24;
                java.lang.Integer numValueOf = ginVarA.l(i16) ? null : java.lang.Integer.valueOf((int) ginVarA.c(i16));
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i17 = iS25;
                java.lang.Boolean bool = boolValueOf;
                defpackage.gsi gsiVarN = defpackage.gus.n((int) ginVarA.c(i17));
                int i18 = iS26;
                defpackage.gyf gyfVarQ = defpackage.gus.q(ginVarA.n(i18));
                iS25 = i17;
                iS26 = i18;
                int i19 = iS27;
                boolean z2 = ((int) ginVarA.c(i19)) != 0;
                iS27 = i19;
                int i20 = iS28;
                boolean z3 = ((int) ginVarA.c(i20)) != 0;
                int i21 = iS29;
                boolean z4 = ((int) ginVarA.c(i21)) != 0;
                iS29 = i21;
                int i22 = iS30;
                int i23 = iS31;
                int i24 = iS32;
                int i25 = iS33;
                iS33 = i25;
                arrayList2.add(new defpackage.gxl(strE, gswVarP, strE2, strE3, grpVarZ, grpVarZ2, jC, jC2, jC3, new defpackage.grn(gyfVarQ, gsiVarN, z2, z3, z4, ((int) ginVarA.c(i22)) != 0, ginVarA.c(i23), ginVarA.c(i24), defpackage.gus.r(ginVarA.n(i25))), iC, grjVarM, jC4, jC5, jC6, jC7, z, gssVarO, iC2, iC3, jC8, iC4, iC5, strE4, bool));
                iS30 = i22;
                iS4 = i8;
                iS17 = i7;
                iS19 = i11;
                iS22 = i14;
                iS24 = i16;
                iS31 = i23;
                iS32 = i24;
                iS2 = i2;
                iS14 = i;
                iS3 = i3;
                arrayList = arrayList2;
                iS = i5;
                iS15 = i4;
                iS16 = i6;
                iS20 = i12;
                iS21 = i13;
                iS23 = i15;
                iS28 = i20;
                iS5 = i10;
                iS18 = i9;
            }
            return arrayList;
        } finally {
            ginVarA.close();
        }
    }

    public static /* synthetic */ boolean i(java.lang.String str, java.lang.String str2, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA = gjhVar.a(str);
        try {
            ginVarA.j(1, str2);
            return ginVarA.m() && ((int) ginVarA.c(0)) != 0;
        } finally {
            ginVarA.close();
        }
    }

    public static void j(java.io.DataOutputStream dataOutputStream, java.lang.String str) throws java.io.IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final java.lang.String a(j$.util.Optional optional) {
        return defpackage.gus.ad((android.content.Context) this.a, optional).getString(2132017992);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final java.lang.String b(j$.util.Optional optional) {
        android.content.res.Resources resourcesAd = defpackage.gus.ad((android.content.Context) this.a, optional);
        ?? r4 = this.b;
        return resourcesAd.getString(2132019994, resourcesAd.getQuantityString(2131886108, ((java.lang.Long) r4.a()).intValue(), java.lang.Integer.valueOf(((java.lang.Long) r4.a()).intValue())));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object c(defpackage.igs igsVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new blj(igsVar, this, (defpackage.aoln) null, 14), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[LOOP:1: B:18:0x0048->B:20:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[LOOP:0: B:26:0x007c->B:28:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.aoln r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof iiu
            if (r0 == 0) goto L13
            r0 = r10
            iiu r0 = (iiu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            iiu r0 = new iiu
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.aooc.af(r10)
            goto L6a
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.aooc.af(r10)
        L33:
            java.lang.Object r10 = r9.b
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L92
            apdm r2 = new apdm
            aolr r5 = r0.u()
            r2.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r10.next()
            aosy r5 = (defpackage.aosy) r5
            apdi r6 = r5.i()
            ghv r7 = new ghv
            r8 = 2
            r7.<init>(r5, r4, r8)
            r2.h(r6, r7)
            goto L48
        L62:
            r0.b = r3
            java.lang.Object r10 = defpackage.apdm.c(r2, r0)
            if (r10 == r1) goto L93
        L6a:
            aoiu r10 = (defpackage.aoiu) r10
            java.lang.Object r2 = r10.a
            aosy r2 = (defpackage.aosy) r2
            java.lang.Object r10 = r10.b
            igh r10 = (igh) r10
            java.lang.Object r5 = r9.b
            if (r10 == 0) goto L8e
            java.util.Iterator r9 = r5.iterator()
        L7c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r9.next()
            aosy r0 = (defpackage.aosy) r0
            r0.s(r4)
            goto L7c
        L8c:
            r1 = r10
            goto L93
        L8e:
            r5.remove(r2)
            goto L33
        L92:
            r1 = r4
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ils.d(aoln):java.lang.Object");
    }

    public final void k(exc excVar) {
        excVar.a();
        java.lang.Object obj = this.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new esz(this, excVar, 12, (byte[]) null));
        }
    }

    public ils(android.os.Handler handler, exy exyVar) {
        this.b = exyVar == null ? null : handler;
        this.a = exyVar;
    }

    public ils(defpackage.aolr aolrVar, java.util.Map map) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.a = aolrVar;
        this.b = map;
    }

    public ils(igd igdVar, ihn ihnVar) {
        defpackage.aooh.f(ihnVar, "dualChannelListener");
        this.a = igdVar;
        this.b = ihnVar;
    }

    public ils(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ils(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ils(java.lang.String str, androidx.work.WorkerParameters workerParameters, java.lang.Throwable th) {
        defpackage.aooh.f(str, "workerClassName");
        defpackage.aooh.f(workerParameters, "workerParameters");
        this.b = workerParameters;
        this.a = th;
    }

    public ils(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "workSpecId");
        defpackage.aooh.f(str2, "prerequisiteId");
        this.a = str;
        this.b = str2;
    }

    public ils(android.content.Context context, defpackage.aoin aoinVar) {
        this.a = context;
        this.b = aoinVar;
    }

    public ils(hax haxVar) {
        this.a = new java.util.ArrayList();
        this.b = haxVar;
    }

    public ils(java.util.List list, int[] iArr, char[] cArr) {
        this.a = defpackage.aify.n(list);
        this.b = iArr;
    }

    public ils(defpackage.aoss aossVar) {
        defpackage.aooh.f(aossVar, "scope");
        this.a = aossVar;
        this.b = new java.util.ArrayList();
    }

    public ils(java.util.List list, int[] iArr, byte[] bArr) {
        this.b = defpackage.aify.n(list);
        this.a = iArr;
    }

    public ils(java.util.List list, int[] iArr) {
        this.b = defpackage.aify.n(list);
        this.a = iArr;
    }
}
