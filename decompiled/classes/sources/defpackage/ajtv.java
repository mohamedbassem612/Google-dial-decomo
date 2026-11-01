package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtv implements defpackage.ajtq, defpackage.ajuy {
    private static final defpackage.ajwe c = new defpackage.ajur(1);
    private final java.util.List f;
    private final defpackage.ajua h;
    private final defpackage.ajts i;
    public final java.util.Map a = new java.util.HashMap();
    private final java.util.Map d = new java.util.HashMap();
    private final java.util.Map e = new java.util.HashMap();
    private java.util.Set g = new java.util.HashSet();
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();

    public ajtv(java.util.concurrent.Executor executor, java.lang.Iterable iterable, java.util.Collection collection, defpackage.ajts ajtsVar) {
        defpackage.ajua ajuaVar = new defpackage.ajua(executor);
        this.h = ajuaVar;
        this.i = ajtsVar;
        java.util.ArrayList<defpackage.ajtp> arrayList = new java.util.ArrayList();
        int i = 0;
        arrayList.add(defpackage.ajtp.e(ajuaVar, defpackage.ajua.class, defpackage.ajvo.class, defpackage.ajvn.class));
        arrayList.add(defpackage.ajtp.e(this, defpackage.ajuy.class, new java.lang.Class[0]));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            defpackage.ajtp ajtpVar = (defpackage.ajtp) it.next();
            if (ajtpVar != null) {
                arrayList.add(ajtpVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    com.google.firebase.components.ComponentRegistrar componentRegistrar = (com.google.firebase.components.ComponentRegistrar) ((defpackage.ajwe) it3.next()).a();
                    if (componentRegistrar != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (defpackage.ajtp ajtpVar2 : componentRegistrar.getComponents()) {
                            java.lang.String str = ajtpVar2.a;
                            if (str != null) {
                                ajtpVar2 = new defpackage.ajtp(str, ajtpVar2.b, ajtpVar2.c, ajtpVar2.d, ajtpVar2.e, new defpackage.ajyp(str, ajtpVar2, 0), ajtpVar2.g);
                            }
                            arrayList4.add(ajtpVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (defpackage.ajub e) {
                    it3.remove();
                    android.util.Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            java.util.Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                for (java.lang.Object obj : ((defpackage.ajtp) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.g.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.g.add(obj.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                defpackage.ajsz.K(arrayList);
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                defpackage.ajsz.K(arrayList5);
            }
            for (defpackage.ajtp ajtpVar3 : arrayList) {
                this.a.put(ajtpVar3, new defpackage.ajuc(new defpackage.ajtt(this, ajtpVar3, i)));
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (defpackage.ajtp ajtpVar4 : arrayList) {
                if (ajtpVar4.f()) {
                    defpackage.ajwe ajweVar = (defpackage.ajwe) this.a.get(ajtpVar4);
                    for (defpackage.ajui ajuiVar : ajtpVar4.b) {
                        boolean zContainsKey = this.d.containsKey(ajuiVar);
                        java.util.Map map = this.d;
                        if (zContainsKey) {
                            arrayList6.add(new agrz((defpackage.ajwe) map.get(ajuiVar), ajweVar, 7));
                        } else {
                            map.put(ajuiVar, ajweVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.HashMap map2 = new java.util.HashMap();
            for (java.util.Map.Entry entry : this.a.entrySet()) {
                defpackage.ajtp ajtpVar5 = (defpackage.ajtp) entry.getKey();
                if (!ajtpVar5.f()) {
                    defpackage.ajwe ajweVar2 = (defpackage.ajwe) entry.getValue();
                    for (defpackage.ajui ajuiVar2 : ajtpVar5.b) {
                        if (!map2.containsKey(ajuiVar2)) {
                            map2.put(ajuiVar2, new java.util.HashSet());
                        }
                        ((java.util.Set) map2.get(ajuiVar2)).add(ajweVar2);
                    }
                }
            }
            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                boolean zContainsKey2 = this.e.containsKey(entry2.getKey());
                java.util.Map map3 = this.e;
                if (zContainsKey2) {
                    defpackage.ajud ajudVar = (defpackage.ajud) map3.get(entry2.getKey());
                    java.util.Iterator it5 = ((java.util.Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(new agrz(ajudVar, (defpackage.ajwe) it5.next(), 8));
                    }
                } else {
                    map3.put((defpackage.ajui) entry2.getKey(), defpackage.ajud.b((java.util.Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList7);
            for (defpackage.ajtp ajtpVar6 : this.a.keySet()) {
                for (defpackage.ajtx ajtxVar : ajtpVar6.c) {
                    if (ajtxVar.b() && !this.e.containsKey(ajtxVar.a)) {
                        this.e.put(ajtxVar.a, defpackage.ajud.b(java.util.Collections.EMPTY_SET));
                    } else if (this.d.containsKey(ajtxVar.a)) {
                        continue;
                    } else {
                        if (ajtxVar.b == 1) {
                            throw new ajue(java.lang.String.format("Unsatisfied dependency for component %s: %s", ajtpVar6, ajtxVar.a));
                        }
                        if (!ajtxVar.b()) {
                            this.d.put(ajtxVar.a, new ajug(ajug.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        while (i < size) {
            ((java.lang.Runnable) arrayList3.get(i)).run();
            i++;
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.b.get();
        if (bool != null) {
            java.util.Map map4 = this.a;
            bool.booleanValue();
            f(map4);
        }
    }

    @Override // defpackage.ajtq
    public final synchronized defpackage.ajwe a(defpackage.ajui ajuiVar) {
        defpackage.anty.aI(ajuiVar, "Null interface requested.");
        return (defpackage.ajwe) this.d.get(ajuiVar);
    }

    @Override // defpackage.ajtq
    public final /* synthetic */ defpackage.ajwe b(java.lang.Class cls) {
        return defpackage.ajsz.p(this, cls);
    }

    @Override // defpackage.ajtq
    public final synchronized defpackage.ajwe c(defpackage.ajui ajuiVar) {
        defpackage.ajwe ajweVar;
        ajweVar = (defpackage.ajud) this.e.get(ajuiVar);
        if (ajweVar == null) {
            ajweVar = c;
        }
        return ajweVar;
    }

    @Override // defpackage.ajtq
    public final /* synthetic */ java.lang.Object d(defpackage.ajui ajuiVar) {
        return defpackage.ajsz.q(this, ajuiVar);
    }

    @Override // defpackage.ajtq
    public final /* synthetic */ java.lang.Object e(java.lang.Class cls) {
        return defpackage.ajsz.r(this, cls);
    }

    public final void f(java.util.Map map) {
        java.util.Queue<ajvm> queue;
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.ajtp ajtpVar = (defpackage.ajtp) entry.getKey();
            defpackage.ajwe ajweVar = (defpackage.ajwe) entry.getValue();
            if (ajtpVar.d == 1) {
                ajweVar.a();
            }
        }
        defpackage.ajua ajuaVar = this.h;
        synchronized (ajuaVar) {
            queue = ajuaVar.a;
            if (queue != null) {
                ajuaVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ajvm ajvmVar : queue) {
                defpackage.ajsz.J(ajvmVar);
                synchronized (ajuaVar) {
                    java.util.Queue queue2 = ajuaVar.a;
                    if (queue2 != null) {
                        queue2.add(ajvmVar);
                    } else {
                        for (java.util.Map.Entry entry2 : ajuaVar.a()) {
                            ((java.util.concurrent.Executor) entry2.getValue()).execute(new ahts(entry2, 7));
                        }
                    }
                }
            }
        }
    }
}
