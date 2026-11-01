package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmw implements java.lang.AutoCloseable {
    public final defpackage.xpz a;
    public final defpackage.xhe b;
    public final aoss c;
    public final j$.util.concurrent.ConcurrentHashMap d;
    public final j$.util.concurrent.ConcurrentHashMap e;
    public final j$.util.concurrent.ConcurrentHashMap f;
    private final j$.util.concurrent.ConcurrentHashMap g;
    private final j$.util.concurrent.ConcurrentHashMap h;
    private aoir i;
    private final j$.util.concurrent.ConcurrentLinkedQueue j;

    public xmw(defpackage.xpz xpzVar, defpackage.xhe xheVar, aoss aossVar) {
        aooh.f(xpzVar, "onboardingChanges");
        this.a = xpzVar;
        this.b = xheVar;
        this.c = aossVar;
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.f = new j$.util.concurrent.ConcurrentHashMap();
        aokd aokdVar = aokd.a;
        this.g = new j$.util.concurrent.ConcurrentHashMap(aokdVar);
        this.h = new j$.util.concurrent.ConcurrentHashMap(aokdVar);
        this.i = p();
        this.j = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    private final aoir p() {
        return aooc.ag(new defpackage.xmr(this, 0));
    }

    public final defpackage.xhn a(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
        defpackage.xhn xhnVar = (defpackage.xhn) this.e.get(xjzVar.f());
        if (xhnVar != null) {
            return xhnVar;
        }
        aozj aozjVar = (aozj) this.d.get(xjzVar.f());
        defpackage.xmq xmqVar = aozjVar != null ? (defpackage.xmq) aozjVar.c() : null;
        defpackage.xmp xmpVar = xmqVar instanceof defpackage.xmp ? (defpackage.xmp) xmqVar : null;
        defpackage.xhn xhnVar2 = xmpVar != null ? xmpVar.d : null;
        return xhnVar2 == null ? new defpackage.xhn() : xhnVar2;
    }

    public final defpackage.xmb b(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
        return (defpackage.xmb) this.g.get(xjzVar.f());
    }

    public final defpackage.xmq c(defpackage.xni xniVar) {
        aooh.f(xniVar, "token");
        defpackage.xmq xmqVarD = d(xniVar);
        if (xmqVarD != null) {
            return xmqVarD;
        }
        defpackage.xox.e("TaskStateManager", "[" + java.lang.System.identityHashCode(this) + "] No state present for " + xniVar);
        return defpackage.xhp.h(xniVar, new defpackage.xhm("Task cannot be found."), defpackage.xmn.CONTRACT_NOT_FOUND, 4);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.clear();
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((aowi) ((java.util.Map.Entry) it.next()).getValue()).e((java.lang.Throwable) null);
        }
        concurrentHashMap.clear();
        this.e.clear();
        this.g.clear();
        this.h.clear();
        this.i = p();
        this.j.clear();
    }

    public final defpackage.xmq d(defpackage.xni xniVar) {
        defpackage.xmq xmqVar;
        aooh.f(xniVar, "token");
        aozj aozjVar = (aozj) this.d.get(xniVar.f());
        if (aozjVar == null || (xmqVar = (defpackage.xmq) aozjVar.c()) == null) {
            return null;
        }
        return xmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.xmt xmtVar;
        if (aolnVar instanceof defpackage.xmt) {
            xmtVar = (defpackage.xmt) aolnVar;
            int i = xmtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmtVar.c = i - Integer.MIN_VALUE;
            } else {
                xmtVar = new defpackage.xmt(this, aolnVar);
            }
        } else {
            xmtVar = new defpackage.xmt(this, aolnVar);
        }
        java.lang.Object obj = xmtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xmtVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (this.a.e(416177493L)) {
                j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.j;
                java.util.Objects.toString(concurrentLinkedQueue);
                defpackage.xox.a("TaskStateManager", "Attempting to flush: ".concat(java.lang.String.valueOf(concurrentLinkedQueue)));
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = this.j;
            if (concurrentLinkedQueue2.isEmpty()) {
                break;
            }
            aosy aosyVar = (aosy) concurrentLinkedQueue2.poll();
            if (aosyVar != null) {
                if (aosyVar.t()) {
                    java.util.Objects.toString(aosyVar);
                    defpackage.xox.b("TaskStateManager", "Flushing disk write: ".concat(aosyVar.toString()));
                    xmtVar.c = 1;
                    if (aosyVar.a(xmtVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    java.util.Objects.toString(aosyVar);
                    new java.lang.Integer(defpackage.xox.a("TaskStateManager", "Not flushing inactive disk write: ".concat(aosyVar.toString())));
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.xmu xmuVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.xmu) {
            xmuVar = (defpackage.xmu) aolnVar;
            int i = xmuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmuVar.d = i - Integer.MIN_VALUE;
            } else {
                xmuVar = new defpackage.xmu(this, aolnVar);
            }
        } else {
            xmuVar = new defpackage.xmu(this, aolnVar);
        }
        java.lang.Object obj2 = xmuVar.b;
        aolu aoluVar = aolu.a;
        int i2 = xmuVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj2);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = xmuVar.a;
                aooc.af(obj2);
            }
            java.util.Objects.toString(obj);
            defpackage.xox.b("TaskStateManager", "Persisted task states: ".concat(java.lang.String.valueOf(obj)));
            return aojh.a;
        }
        aooc.af(obj2);
        if (!this.a.e(416177493L)) {
            return aojh.a;
        }
        xmuVar.d = 1;
        if (g(xmuVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.xox.b("TaskStateManager", "Persisting task states");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(concurrentHashMap.size()));
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), (defpackage.xmq) ((aozj) entry.getValue()).c());
        }
        java.util.Map mapAS = ajsz.aS(linkedHashMap);
        defpackage.xhe xheVar = this.b;
        defpackage.xpj xpjVar = defpackage.xpk.a;
        xmuVar.a = mapAS;
        xmuVar.d = 2;
        if (xheVar.f("task_states", mapAS, xpjVar, xmuVar) == aoluVar) {
            return aoluVar;
        }
        obj = mapAS;
        java.util.Objects.toString(obj);
        defpackage.xox.b("TaskStateManager", "Persisted task states: ".concat(java.lang.String.valueOf(obj)));
        return aojh.a;
    }

    public final java.lang.Object g(aoln aolnVar) {
        java.lang.Object objA;
        return (this.a.e(416177493L) && (objA = ((aosy) this.i.a()).a(aolnVar)) == aolu.a) ? objA : aojh.a;
    }

    public final aoub h(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
        return (aoub) this.h.get(xjzVar.f());
    }

    public final void i(defpackage.xjz xjzVar, aoub aoubVar) {
        aooh.f(xjzVar, "token");
        this.h.put(xjzVar.f(), aoubVar);
    }

    public final void j(defpackage.xjz xjzVar, defpackage.xmb xmbVar) {
        aooh.f(xjzVar, "token");
        aooh.f(xmbVar, "task");
        this.g.put(xjzVar.f(), xmbVar);
    }

    public final void k(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
        aowi aowiVar = (aowi) this.f.remove(new defpackage.xjy(xjzVar));
        this.e.remove(new defpackage.xjy(xjzVar));
        if (aowiVar == null) {
            defpackage.xox.e("TaskStateManager", a.bF((byte) 93, xjzVar, "Could not find the metadata channel to close. ["));
        } else {
            aowiVar.e((java.lang.Throwable) null);
            defpackage.xox.a("TaskStateManager", a.bF((byte) 93, xjzVar, "Closed the metadata channel. ["));
        }
    }

    public final void l(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
        defpackage.xjx xjxVarF = xjzVar.f();
        aowi aowiVarH = aooh.H(Integer.MAX_VALUE, 0, new defpackage.xms(xjzVar, 0), 2);
        aowiVarH.d(new defpackage.xms(xjzVar, 2));
        this.f.put(xjxVarF, aowiVarH);
    }

    public final void m(defpackage.xni xniVar, defpackage.xmq xmqVar) {
        java.lang.Object objPutIfAbsent;
        aooh.f(xniVar, "token");
        aooh.f(xmqVar, "state");
        defpackage.xox.a("TaskStateManager", "[" + java.lang.System.identityHashCode(this) + "] Writing state " + xmqVar + " for " + xniVar);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.d;
        defpackage.xjx xjxVarF = xniVar.f();
        java.lang.Object objA = concurrentHashMap.get(xjxVarF);
        if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(xjxVarF, (objA = aozk.a(xmqVar)))) != null) {
            objA = objPutIfAbsent;
        }
        ((aozj) objA).e(xmqVar);
        if (this.a.e(416177493L)) {
            this.j.add(aoov.am(this.c, 0, new defpackage.wcj(this, (aoln) null, 18), 3));
        }
    }

    public final void n(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
    }

    public final void o(defpackage.xjz xjzVar) {
        aooh.f(xjzVar, "token");
    }
}
