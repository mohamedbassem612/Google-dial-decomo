package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class addo implements defpackage.addb {
    public final android.content.Context a;
    public final aoss b;
    public final java.util.Set c;
    public final defpackage.adem d;
    public final xtq e;

    public addo(defpackage.adem ademVar, android.content.Context context, xtq xtqVar, java.util.concurrent.Executor executor, aoss aossVar) {
        aooh.f(context, "context");
        aooh.f(xtqVar, "policyEvaluator");
        aooh.f(executor, "executor");
        aooh.f(aossVar, "scope");
        this.d = ademVar;
        this.a = context;
        this.e = xtqVar;
        this.b = aossVar;
        this.c = defpackage.addf.a.f();
    }

    public static final com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo h(java.lang.String str) {
        akxp akxpVar = (akxp) defpackage.addf.a.get(str);
        if (akxpVar == null) {
            return null;
        }
        return afsq.aA(defpackage.afpl.r(akxpVar));
    }

    @Override // defpackage.addb
    public final defpackage.addd a(java.lang.String str, qt qtVar, adde addeVar) {
        aooh.f(str, "queryExpression");
        aooh.f(qtVar, "searchSpec");
        aooh.f(addeVar, "readerContext");
        return new defpackage.addm(this, str, qtVar, addeVar);
    }

    @Override // defpackage.addb
    public final ajcq b(java.lang.String str, java.lang.String str2, px pxVar, adde addeVar) {
        aooh.f(str, "packageName");
        aooh.f(str2, "databaseName");
        aooh.f(pxVar, "request");
        aooh.f(addeVar, "readerContext");
        return aosv.F(this.b, 0, new defpackage.yud(this, str, str2, pxVar, addeVar, (aoln) null, 2), 3);
    }

    @Override // defpackage.addb
    public final ajcq c(java.lang.String str, java.lang.String str2) {
        return str2.startsWith("__G3_TS__") ? aiql.z(new py().a()) : this.d.c(str, str2);
    }

    @Override // defpackage.addb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.addb
    public final void d(java.lang.String str, qz qzVar, java.util.concurrent.Executor executor, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qzVar, "spec");
        aooh.f(executor, "executor");
        aooh.f(qyVar, "observer");
        this.d.d(str, qzVar, executor, qyVar);
    }

    @Override // defpackage.addb
    public final void e(java.lang.String str, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qyVar, "observer");
        this.d.e(str, qyVar);
    }

    @Override // defpackage.addb
    public final oq f() {
        return this.d.f();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af A[LOOP:0: B:27:0x00a9->B:29:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4 A[LOOP:1: B:31:0x00de->B:33:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.lang.String str, java.lang.String str2, px pxVar, adde addeVar, aoln aolnVar) {
        defpackage.addn addnVar;
        we weVar;
        if (aolnVar instanceof defpackage.addn) {
            addnVar = (defpackage.addn) aolnVar;
            int i = addnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                addnVar.d = i - Integer.MIN_VALUE;
            } else {
                addnVar = new defpackage.addn(this, aolnVar);
            }
        } else {
            addnVar = new defpackage.addn(this, aolnVar);
        }
        defpackage.addn addnVar2 = addnVar;
        java.lang.Object objC = addnVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = addnVar2.d;
        if (i2 == 0) {
            aooc.af(objC);
            if (str2.startsWith("__G3_TS__")) {
                return defpackage.ades.c(pxVar);
            }
            akxp akxpVar = (akxp) defpackage.addf.a.get(str);
            if (akxpVar != null) {
                android.content.Context context = this.a;
                xtq xtqVar = this.e;
                adeu adeuVar = adeu.a;
                addnVar2.e = str;
                addnVar2.a = str2;
                addnVar2.f = pxVar;
                addnVar2.d = 1;
                objC = adeuVar.c(context, xtqVar, addeVar, akxpVar, addnVar2);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.ades.c(pxVar);
        }
        if (i2 == 1) {
            px pxVar2 = addnVar2.f;
            str2 = (java.lang.String) addnVar2.a;
            java.lang.String str3 = addnVar2.e;
            aooc.af(objC);
            pxVar = pxVar2;
            str = str3;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (defpackage.addo) addnVar2.a;
            str = addnVar2.e;
            aooc.af(objC);
        }
        pd pdVar = (pd) objC;
        weVar = new we((byte[]) null);
        java.util.Map mapB = pdVar.b();
        aooh.e(mapB, "getSuccesses(...)");
        for (java.util.Map.Entry entry : mapB.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getKey();
            pw pwVar = (pw) entry.getValue();
            aooh.c(pwVar);
            weVar.d(str4, new defpackage.addq(this, str, pwVar));
        }
        java.util.Map mapA = pdVar.a();
        aooh.e(mapA, "getFailures(...)");
        for (java.util.Map.Entry entry2 : mapA.entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            pg pgVar = (pg) entry2.getValue();
            weVar.b(str5, pgVar.a, pgVar.b);
        }
        return weVar.a();
        if (((java.lang.Boolean) objC).booleanValue()) {
            ajcq ajcqVarB = this.d.b(str, str2, pxVar);
            addnVar2.e = str;
            addnVar2.a = this;
            addnVar2.f = null;
            addnVar2.d = 2;
            objC = aosv.D(ajcqVarB, addnVar2);
            if (objC == aoluVar) {
                return aoluVar;
            }
            pd pdVar2 = (pd) objC;
            weVar = new we((byte[]) null);
            java.util.Map mapB2 = pdVar2.b();
            aooh.e(mapB2, "getSuccesses(...)");
            while (r13.hasNext()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                pw pwVar2 = (pw) entry.getValue();
                aooh.c(pwVar2);
                weVar.d(str6, new defpackage.addq(this, str, pwVar2));
            }
            java.util.Map mapA2 = pdVar2.a();
            aooh.e(mapA2, "getFailures(...)");
            while (r10.hasNext()) {
                java.lang.String str7 = (java.lang.String) entry2.getKey();
                pg pgVar2 = (pg) entry2.getValue();
                weVar.b(str7, pgVar2.a, pgVar2.b);
            }
            return weVar.a();
        }
        return defpackage.ades.c(pxVar);
    }
}
