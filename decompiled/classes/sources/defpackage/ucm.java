package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ucm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ucm(com.android.dialer.sonic.impl.ui.grid.SonicGridView sonicGridView, defpackage.ajwr ajwrVar) {
        ahao uclVar = new ucl(this);
        this.b = uclVar;
        amcn amcnVar = new amcn();
        amcnVar.o(uclVar);
        amcnVar.n(new defpackage.ubc(2));
        amcnVar.a = ahaj.b();
        defpackage.kh khVarM = amcnVar.m();
        this.c = khVarM;
        this.a = ajwrVar;
        android.view.View.inflate(sonicGridView.getContext(), 2131624456, sonicGridView);
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) sonicGridView.findViewById(2131428772);
        recyclerView.aa(new android.support.v7.widget.GridLayoutManager());
        recyclerView.Y(khVarM);
        recyclerView.Z(null);
    }

    public static /* synthetic */ void f(defpackage.ajdd ajddVar, android.accounts.AccountManagerFuture accountManagerFuture) {
        try {
            defpackage.ahvr.bY(accountManagerFuture.isDone());
            ajddVar.o(accountManagerFuture.getResult());
        } catch (android.accounts.AuthenticatorException e) {
            e = e;
            ajddVar.p(e);
        } catch (android.accounts.OperationCanceledException e2) {
            e = e2;
            ajddVar.p(e);
        } catch (java.io.IOException e3) {
            e = e3;
            ajddVar.p(e);
        } catch (java.lang.Throwable th) {
            ajddVar.p(th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.aoyq a(yse yseVar) {
        defpackage.aooh.f(yseVar, "feature");
        ?? r2 = this.b;
        defpackage.aoyq aoyqVar = (defpackage.aoyq) ((j$.util.concurrent.ConcurrentHashMap) r2).get(yseVar);
        if (aoyqVar != null) {
            return aoyqVar;
        }
        defpackage.aoyq aoyqVarC = defpackage.aoyx.c(0, 0, 0, 7);
        r2.put(yseVar, aoyqVarC);
        return aoyqVarC;
    }

    public final boolean b(java.lang.Class cls, java.lang.Class cls2) {
        return ((java.lang.Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((java.lang.Class) this.a);
    }

    public final boolean c(java.lang.Class cls) {
        return ((java.lang.Class) this.b).isAssignableFrom(cls);
    }

    public final ahtg d() {
        defpackage.ahyn ahynVar = (defpackage.ahyn) this.b;
        return new ahtg((android.content.Context) this.c, (defpackage.ajwr) this.a, ahynVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq e(ahih ahihVar, defpackage.ahip ahipVar) {
        defpackage.aify aifyVar;
        int i;
        java.lang.Object obj;
        defpackage.ajcq ajcqVarY;
        ahat ahatVar = new ahat();
        ahatVar.a(false);
        ahatVar.b(Long.MAX_VALUE);
        ahatVar.e = 2;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        ahatVar.b(2000L);
        ahatVar.a(ahihVar.d);
        ahatVar.a = defpackage.aify.q(ahap.b, ahap.a);
        if (ahatVar.d != 3 || (aifyVar = ahatVar.a) == null || (i = ahatVar.e) == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (ahatVar.a == null) {
                sb.append(" acceptTypes");
            }
            if ((ahatVar.d & 1) == 0) {
                sb.append(" allowPii");
            }
            if ((ahatVar.d & 2) == 0) {
                sb.append(" timeLimitMs");
            }
            if (ahatVar.e == 0) {
                sb.append(" size");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ahau ahauVar = new ahau(aifyVar, ahatVar.b, ahatVar.c, i);
        java.util.Map map = (java.util.Map) this.b.a();
        defpackage.aigf aigfVar = ahihVar.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            obj = this.c;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            try {
                ajcqVarY = ((ahas) entry.getValue()).a(ahauVar);
            } catch (java.lang.Throwable th) {
                ajcqVarY = defpackage.aiql.y(th);
            }
            arrayList.add(((zoe) obj).z(ahauVar, str, ajcqVarY));
        }
        defpackage.ailj it2 = ((defpackage.aikg) ((defpackage.aikj) aigfVar).entrySet()).iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
            arrayList.add(((zoe) obj).z(ahauVar, (java.lang.String) entry2.getKey(), (defpackage.ajcq) entry2.getValue()));
        }
        defpackage.ajcq ajcqVarF = defpackage.ajan.f(defpackage.aiql.v(arrayList), new agqd(6), ((zoe) obj).A(ahauVar));
        boolean z = ahihVar.e;
        java.lang.Object objG = defpackage.ahwt.a;
        defpackage.ajcq ajcqVarZ = defpackage.aiql.z(objG);
        if (z) {
            objG = defpackage.ahyn.g(ahipVar.a());
        }
        return defpackage.aiql.ab(ajcqVarZ, ajcqVarF).b(defpackage.ahqx.i(new wwx(ajcqVarZ, ajcqVarF, objG, 14, (char[]) null)), this.a);
    }

    public ucm(android.content.Context context, zoe zoeVar, defpackage.agoo agooVar) {
        this.a = context;
        this.b = zoeVar;
        this.c = agooVar;
    }

    public ucm(java.lang.Class cls, java.lang.Class cls2, ydf ydfVar) {
        this.b = cls;
        this.a = cls2;
        this.c = ydfVar;
    }

    public ucm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public ucm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public ucm(java.lang.String str, defpackage.ajcq ajcqVar, defpackage.akzc akzcVar) {
        defpackage.aooh.f(str, "packageName");
        this.b = str;
        this.c = ajcqVar;
        this.a = akzcVar;
    }

    public ucm(vqu vquVar, ute uteVar, abtr abtrVar) {
        this.c = uteVar;
        this.a = vquVar;
        this.b = abtrVar;
    }

    public ucm() {
        this.b = new defpackage.aca();
        this.c = new java.util.ArrayList();
        this.a = new defpackage.aca();
    }

    public ucm(defpackage.aw awVar, defpackage.ajwr ajwrVar, defpackage.ahyn ahynVar) {
        this.c = awVar.z();
        this.a = ajwrVar;
        this.b = ahynVar;
    }

    public ucm(xuo xuoVar, xvb xvbVar) {
        this(xuoVar, java.util.Collections.EMPTY_LIST, xvbVar);
    }

    public ucm(ysy ysyVar, defpackage.aolr aolrVar) {
        defpackage.aooh.f(ysyVar, "aiCoreModelAvailability");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.c = ysyVar;
        this.a = aolrVar;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public ucm(alln allnVar, agja agjaVar) {
        this.b = allnVar;
        this.c = agjaVar;
        this.a = new java.util.LinkedHashMap();
    }

    public ucm(xuo xuoVar, java.util.List list, xvb xvbVar) {
        defpackage.anty.aI(xuoVar, "Argument must not be null");
        this.a = xuoVar;
        defpackage.anty.aI(list, "Argument must not be null");
        this.b = list;
        this.c = xvbVar;
    }

    public ucm(android.accounts.AccountManager accountManager, java.util.concurrent.Executor executor, defpackage.agth agthVar) {
        this.c = accountManager;
        this.b = agthVar;
        this.a = executor;
    }
}
