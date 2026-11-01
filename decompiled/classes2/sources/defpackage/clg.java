package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class clg implements java.util.Map, clr, aopa {
    public clt a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Collection d;

    public clg() {
        cic cicVar = cic.a;
        cko ckoVarB = ckw.b();
        defpackage.clf clfVar = new defpackage.clf(ckoVarB.v(), cicVar);
        if (!(ckoVarB instanceof ckf)) {
            ((clt) clfVar).h = new defpackage.clf(1L, cicVar);
        }
        this.a = clfVar;
        this.b = new defpackage.ckx(this);
        this.c = new defpackage.cky(this);
        this.d = new defpackage.cla(this);
    }

    public final int a() {
        return c().b;
    }

    public final int b() {
        return c().a.size();
    }

    public final defpackage.clf c() {
        clt cltVar = this.a;
        if (cltVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        }
        return (defpackage.clf) ckw.i(cltVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        cko ckoVarB;
        clt cltVar = this.a;
        if (cltVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        }
        cic cicVar = ((defpackage.clf) ckw.f(cltVar, this)).a;
        cic cicVar2 = cic.a;
        if (cicVar2 != cicVar) {
            clt cltVar2 = this.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                ckoVarB = ckw.b();
                defpackage.clf clfVar = (defpackage.clf) ckw.k(cltVar2, this, ckoVarB);
                synchronized (defpackage.clh.a) {
                    clfVar.a = cicVar2;
                    clfVar.b++;
                }
            }
            ckw.r(ckoVarB, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return c().a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return c().a.containsValue(obj);
    }

    public final clt d() {
        return this.a;
    }

    public final void e(clt cltVar) {
        if (cltVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        }
        this.a = (defpackage.clf) cltVar;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return this.b;
    }

    public final /* synthetic */ clt g(clt cltVar, clt cltVar2, clt cltVar3) {
        return null;
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return c().a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        cho choVar;
        int i;
        java.lang.Object objPut;
        cko ckoVarB;
        boolean z;
        do {
            java.lang.Object obj3 = defpackage.clh.a;
            synchronized (obj3) {
                clt cltVar = this.a;
                if (cltVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                }
                defpackage.clf clfVar = (defpackage.clf) ckw.f(cltVar, this);
                choVar = clfVar.a;
                i = clfVar.b;
            }
            if (choVar == null) {
                aooh.g();
            }
            chn chnVarA = choVar.a();
            objPut = chnVarA.put(obj, obj2);
            cho choVarA = chnVarA.a();
            if (aooh.n(choVarA, choVar)) {
                break;
            }
            clt cltVar2 = this.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                ckoVarB = ckw.b();
                defpackage.clf clfVar2 = (defpackage.clf) ckw.k(cltVar2, this, ckoVarB);
                synchronized (obj3) {
                    int i2 = clfVar2.b;
                    if (i2 == i) {
                        clfVar2.a = choVarA;
                        clfVar2.b = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            ckw.r(ckoVarB, this);
        } while (!z);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        cho choVar;
        int i;
        cko ckoVarB;
        boolean z;
        do {
            java.lang.Object obj = defpackage.clh.a;
            synchronized (obj) {
                clt cltVar = this.a;
                if (cltVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                }
                defpackage.clf clfVar = (defpackage.clf) ckw.f(cltVar, this);
                choVar = clfVar.a;
                i = clfVar.b;
            }
            if (choVar == null) {
                aooh.g();
            }
            chn chnVarA = choVar.a();
            chnVarA.putAll(map);
            cho choVarA = chnVarA.a();
            if (aooh.n(choVarA, choVar)) {
                return;
            }
            clt cltVar2 = this.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                try {
                    ckoVarB = ckw.b();
                    defpackage.clf clfVar2 = (defpackage.clf) ckw.k(cltVar2, this, ckoVarB);
                    synchronized (obj) {
                        try {
                            int i2 = clfVar2.b;
                            if (i2 == i) {
                                clfVar2.a = choVarA;
                                clfVar2.b = i2 + 1;
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
            ckw.r(ckoVarB, this);
        } while (!z);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        cho choVar;
        int i;
        java.lang.Object objRemove;
        cko ckoVarB;
        boolean z;
        do {
            java.lang.Object obj2 = defpackage.clh.a;
            synchronized (obj2) {
                clt cltVar = this.a;
                if (cltVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                }
                defpackage.clf clfVar = (defpackage.clf) ckw.f(cltVar, this);
                choVar = clfVar.a;
                i = clfVar.b;
            }
            if (choVar == null) {
                aooh.g();
            }
            chn chnVarA = choVar.a();
            objRemove = chnVarA.remove(obj);
            cho choVarA = chnVarA.a();
            if (aooh.n(choVarA, choVar)) {
                break;
            }
            clt cltVar2 = this.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                ckoVarB = ckw.b();
                defpackage.clf clfVar2 = (defpackage.clf) ckw.k(cltVar2, this, ckoVarB);
                synchronized (obj2) {
                    int i2 = clfVar2.b;
                    if (i2 == i) {
                        clfVar2.a = choVarA;
                        clfVar2.b = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            ckw.r(ckoVarB, this);
        } while (!z);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    public final java.lang.String toString() {
        clt cltVar = this.a;
        if (cltVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        }
        return "SnapshotStateMap(value=" + ((defpackage.clf) ckw.f(cltVar, this)).a + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.d;
    }
}
