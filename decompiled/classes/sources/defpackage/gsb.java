package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gsb implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ gsb(defpackage.adai adaiVar, java.lang.String str, java.lang.String str2, int i) {
        this.$cid = i;
        this.b = adaiVar;
        this.a = str;
        this.c = str2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Code duplicated, block: B:50:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [agxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [agye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [gwj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws afeb {
        defpackage.gxd gxdVarA;
        java.util.ArrayList arrayList;
        gsd gsdVar = null;
        boolean z = true;
        boolean zBooleanValue = true;
        z = true;
        boolean zC = false;
        switch (this.$cid) {
            case 0:
                defpackage.anrf.g((java.util.concurrent.atomic.AtomicBoolean) this.a, (defpackage.dsd) this.b, this.c);
                return;
            case 1:
                try {
                    ?? r4 = this.c;
                    defpackage.aoov.ah(((defpackage.aosc) r4).b.minusKey(defpackage.aolo.k), new defpackage.ggk((defpackage.gfy) this.b, (defpackage.aosb) r4, (defpackage.aonn) this.a, (defpackage.aoln) null, 1));
                    return;
                } catch (java.lang.Throwable th) {
                    this.c.g(th);
                    return;
                }
            case 2:
                java.lang.Object obj = this.a;
                ?? r2 = this.c;
                java.lang.Object obj2 = this.b;
                try {
                    zBooleanValue = ((java.lang.Boolean) r2.get()).booleanValue();
                    break;
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                }
                synchronized (((defpackage.gtr) obj2).l) {
                    gxdVarA = ((defpackage.gve) obj).a();
                    java.lang.String str = gxdVarA.a;
                    if (((defpackage.gtr) obj2).b(str) == obj) {
                        ((defpackage.gtr) obj2).a(str);
                    }
                    defpackage.gsh.a().c(defpackage.gtr.a, obj2.getClass().getSimpleName() + ' ' + str + " executed; reschedule = " + zBooleanValue);
                    arrayList = new java.util.ArrayList(((defpackage.gtr) obj2).j);
                    break;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.gtf) arrayList.get(i)).a(gxdVarA, zBooleanValue);
                }
                return;
            case 3:
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = ((defpackage.ipc) obj3).a;
                defpackage.gxd gxdVar = (defpackage.gxd) obj4;
                java.lang.String str2 = gxdVar.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                ?? r9 = ((defpackage.rsr) this.c).b;
                defpackage.gtr gtrVar = (defpackage.gtr) r9;
                androidx.work.impl.WorkDatabase workDatabase = gtrVar.e;
                defpackage.gxl gxlVar = (defpackage.gxl) workDatabase.e(new defpackage.jio(gtrVar, arrayList2, str2, z ? 1 : 0));
                if (gxlVar == null) {
                    defpackage.gsh.a();
                    java.lang.String str3 = defpackage.gtr.a;
                    java.util.Objects.toString(obj4);
                    android.util.Log.w(str3, "Didn't find WorkSpec for id ".concat(java.lang.String.valueOf(obj4)));
                    gtrVar.g(gxdVar);
                    return;
                }
                synchronized (gtrVar.l) {
                    if (((defpackage.gtr) r9).f(str2)) {
                        java.util.Set set = (java.util.Set) ((defpackage.gtr) r9).h.get(str2);
                        if (((defpackage.gxd) ((defpackage.ipc) set.iterator().next()).a).b == ((defpackage.gxd) obj4).b) {
                            set.add(obj3);
                            defpackage.gsh.a().c(defpackage.gtr.a, defpackage.a.bg(obj4, "Work ", " is already enqueued for processing"));
                        } else {
                            ((defpackage.gtr) r9).g((defpackage.gxd) obj4);
                        }
                        return;
                    }
                    if (gxlVar.u != ((defpackage.gxd) obj4).b) {
                        ((defpackage.gtr) r9).g((defpackage.gxd) obj4);
                        return;
                    }
                    android.content.Context context = ((defpackage.gtr) r9).c;
                    defpackage.grk grkVar = ((defpackage.gtr) r9).d;
                    defpackage.gou gouVar = ((defpackage.gtr) r9).m;
                    defpackage.gve gveVar = new defpackage.gve(new defpackage.ahbv(context, grkVar, gouVar, (defpackage.gwj) r9, workDatabase, gxlVar, arrayList2));
                    defpackage.ajcq ajcqVarY = defpackage.gus.y(((defpackage.aolj) gveVar.k.b).plus(new defpackage.aoud(null)), 1, new defpackage.dgz(gveVar, (defpackage.aoln) null, 10, (byte[]) null));
                    ajcqVarY.c(new defpackage.gsb((java.lang.Object) r9, ajcqVarY, gveVar, 2, (byte[]) null), gouVar.c);
                    ((defpackage.gtr) r9).g.put(str2, gveVar);
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(obj3);
                    ((defpackage.gtr) r9).h.put(str2, hashSet);
                    defpackage.gsh.a().c(defpackage.gtr.a, r9.getClass().getSimpleName() + ": processing " + obj4);
                    return;
                }
            case 4:
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.a;
                if (!(obj5 instanceof defpackage.gva)) {
                    if (obj5 instanceof guz) {
                        ((defpackage.gve) obj7).f(new gsd());
                        ((defpackage.aoop) obj6).a = false;
                        return;
                    } else if (obj5 instanceof gvb) {
                        ((defpackage.aoop) obj6).a = ((defpackage.gve) obj7).c(((gvb) obj5).a);
                        return;
                    } else {
                        if (!(obj5 instanceof gvc)) {
                            throw new defpackage.aois();
                        }
                        if (((gvc) obj5).a) {
                            zC = ((defpackage.gve) obj7).c(-256);
                        } else {
                            ((defpackage.gve) obj7).f(new gsd());
                        }
                        ((defpackage.aoop) obj6).a = zC;
                        return;
                    }
                }
                gsd gsdVar2 = ((defpackage.gva) obj5).a;
                defpackage.gve gveVar2 = (defpackage.gve) obj7;
                defpackage.gxm gxmVar = gveVar2.f;
                java.lang.String str4 = gveVar2.c;
                androidx.work.impl.WorkDatabase workDatabase2 = gveVar2.e;
                defpackage.gsw gswVarB = gxmVar.b(str4);
                workDatabase2.C().a(str4);
                if (gswVarB == null) {
                    z = false;
                } else if (gswVarB == defpackage.gsw.b) {
                    if (gsdVar2 instanceof defpackage.gsf) {
                        java.lang.String str5 = defpackage.gvf.a;
                        defpackage.gsh.a();
                        android.util.Log.i(str5, "Worker result SUCCESS for ".concat(gveVar2.h));
                        if (gveVar2.a.d()) {
                            gveVar2.e();
                        } else {
                            gxmVar.A(defpackage.gsw.c, str4);
                            if (gsdVar2 == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                            } else {
                                gsdVar = gsdVar2;
                            }
                            defpackage.grp grpVar = ((defpackage.gsf) gsdVar).a;
                            defpackage.aooh.e(grpVar, "getOutputData(...)");
                            gxmVar.q(str4, grpVar);
                            defpackage.gwn gwnVar = gveVar2.g;
                            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                            for (java.lang.String str6 : gwnVar.a(str4)) {
                                if (gxmVar.b(str6) == defpackage.gsw.e && gwnVar.b(str6)) {
                                    java.lang.String strValueOf = java.lang.String.valueOf(str6);
                                    defpackage.gsh.a();
                                    android.util.Log.i(str5, "Setting status to enqueued for ".concat(strValueOf));
                                    gxmVar.A(defpackage.gsw.a, str6);
                                    gxmVar.p(str6, jCurrentTimeMillis);
                                    gveVar2.i.add(str6);
                                }
                            }
                        }
                    } else if (gsdVar2 instanceof gse) {
                        java.lang.String str7 = defpackage.gvf.a;
                        defpackage.gsh.a();
                        android.util.Log.i(str7, "Worker result RETRY for ".concat(gveVar2.h));
                        gveVar2.d(-256);
                    } else {
                        java.lang.String str8 = defpackage.gvf.a;
                        defpackage.gsh.a();
                        android.util.Log.i(str8, "Worker result FAILURE for ".concat(gveVar2.h));
                        if (gveVar2.a.d()) {
                            gveVar2.e();
                        } else {
                            if (gsdVar2 == null) {
                                gsdVar2 = new gsd();
                            }
                            gveVar2.g(gsdVar2);
                        }
                    }
                    z = false;
                } else if (gswVarB.a()) {
                    z = false;
                } else {
                    gveVar2.d(-512);
                }
                ((defpackage.aoop) obj6).a = z;
                return;
            case 5:
                java.util.Iterator it = ((androidx.work.impl.WorkDatabase) this.b).D().i((java.lang.String) this.c).iterator();
                while (it.hasNext()) {
                    defpackage.gus.f((defpackage.guq) this.a, (java.lang.String) it.next());
                }
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                defpackage.abqa abqaVar = new defpackage.abqa();
                java.lang.Object obj8 = this.b;
                android.os.StrictMode.ThreadPolicy.Builder builder = (android.os.StrictMode.ThreadPolicy.Builder) obj8;
                ft$.ExternalSyntheticApiModelOutline0.m(builder, ajbmVar, abqaVar);
                defpackage.ahyn ahynVar = (defpackage.ahyn) ((defpackage.amyw) ((defpackage.adae) this.a).a).b;
                if (ahynVar.f()) {
                    try {
                        afiw afiwVar = (afiw) ahynVar.b();
                        ((android.os.StrictMode.ThreadPolicy.Builder) obj8).build();
                        afiwVar.a();
                    } catch (java.lang.Exception e) {
                        android.util.Log.e("AndroidExecutorsModule", "Failed to install thread interceptor", e);
                        defpackage.agab.ae(builder.penaltyLog().penaltyDeath().build());
                    }
                    break;
                } else {
                    defpackage.agab.ae(builder.penaltyLog().penaltyDeath().build());
                }
                this.c.run();
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((aliq) this.a).c = this.b;
                j$.util.concurrent.atomic.DesugarAtomicInteger.updateAndGet(((defpackage.abrr) this.c).b, new defpackage.abrq());
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.adlb) this.a).d.P(new adjw(this.b, this.c, 2));
                return;
            case 9:
                ((defpackage.adml) this.a).a((defpackage.adid) this.b, this.c);
                return;
            case 10:
                ((defpackage.adqo) this.a).e.remove(this.b, this.c);
                return;
            case 11:
                ((defpackage.afip) ((ahix) ((defpackage.adai) this.b).a.eZ()).f.eZ()).b(1L, this.a, this.c);
                return;
            case 12:
                ((defpackage.agyj) ((defpackage.ajwr) this.c).a).a(this.b, new defpackage.agxm(), this.a);
                return;
            case 13:
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                java.lang.Object obj11 = this.c;
                ((defpackage.agym) obj11).a.execute(new defpackage.gsb(obj11, obj10, obj9, 14, (char[]) null));
                return;
            default:
                defpackage.afec.c();
                java.lang.Object obj12 = this.c;
                defpackage.agym agymVar = (defpackage.agym) obj12;
                defpackage.agyc agycVar = agymVar.e;
                java.lang.Object obj13 = this.a;
                defpackage.ahvr.bZ(!obj13.equals(agycVar), "The same LoadTask was processed twice.");
                java.lang.Object obj14 = this.b;
                defpackage.agxr agxrVar = (defpackage.agxr) obj14;
                if (!agxrVar.b().isDone()) {
                    throw new java.lang.IllegalStateException();
                }
                if (!agymVar.i.c(obj14) || agxrVar.b().isCancelled()) {
                    return;
                }
                try {
                    try {
                        if (((defpackage.agyc) obj13).b(((defpackage.agym) obj12).e)) {
                            ((defpackage.agxr) obj14).c();
                        } else if (!((defpackage.agxr) obj14).b().isCancelled()) {
                            int iA = ((defpackage.agym) obj12).f.c.a(((defpackage.agyc) obj13).f, ((defpackage.agxr) obj14).a(), !((defpackage.agyc) obj13).c()) - 1;
                            if (iA == 0) {
                                ((defpackage.agxr) obj14).c();
                                if (((defpackage.agyc) obj13).c()) {
                                    java.lang.Throwable agxqVar = new agxq();
                                    agxqVar.addSuppressed(defpackage.ahrc.c());
                                    ((defpackage.agym) obj12).h(agxqVar);
                                } else {
                                    ((defpackage.agym) obj12).d((defpackage.agyc) obj13);
                                }
                            } else if (iA != 1) {
                                ((defpackage.agym) obj12).b((defpackage.agyc) obj13, (defpackage.agxr) obj14);
                                if (((defpackage.agyc) obj13).c()) {
                                    java.lang.Throwable agxqVar2 = new agxq();
                                    agxqVar2.addSuppressed(defpackage.ahrc.c());
                                    ((defpackage.agym) obj12).h(agxqVar2);
                                } else {
                                    ((defpackage.agym) obj12).d((defpackage.agyc) obj13);
                                }
                            } else {
                                ((defpackage.agym) obj12).b((defpackage.agyc) obj13, (defpackage.agxr) obj14);
                                if (((defpackage.agym) obj12).g.d && ((defpackage.agym) obj12).i()) {
                                    defpackage.ahvr.bZ(((defpackage.agym) obj12).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                    defpackage.agym.g((defpackage.agxf) ((defpackage.agym) obj12).g.c);
                                    ((defpackage.agym) obj12).g = ((defpackage.agym) obj12).g.b(false);
                                }
                            }
                        }
                        if (((defpackage.agym) obj12).g.d && ((defpackage.agym) obj12).i()) {
                            defpackage.ahvr.bZ(((defpackage.agym) obj12).g.e.f(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                            defpackage.agym.g((defpackage.agxf) ((defpackage.agym) obj12).g.c);
                            ((defpackage.agym) obj12).g = ((defpackage.agym) obj12).g.b(false);
                            return;
                        }
                        return;
                    } catch (defpackage.agyh e2) {
                        ((defpackage.agym) obj12).h(e2.getCause());
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    agymVar.b.execute(new agdr(th2, 10));
                    return;
                }
                agymVar.b.execute(new agdr(th2, 10));
                return;
        }
    }

    public /* synthetic */ gsb(defpackage.ajwr ajwrVar, defpackage.agxi agxiVar, defpackage.agye agyeVar, int i) {
        this.$cid = i;
        this.c = ajwrVar;
        this.b = agxiVar;
        this.a = agyeVar;
    }

    public gsb(defpackage.aosb aosbVar, defpackage.gfy gfyVar, defpackage.aonn aonnVar, int i) {
        this.$cid = i;
        this.c = aosbVar;
        this.b = gfyVar;
        this.a = aonnVar;
    }

    public /* synthetic */ gsb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gsb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gsb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
