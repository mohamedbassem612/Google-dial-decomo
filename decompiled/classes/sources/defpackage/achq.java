package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achq implements defpackage.acgt {
    private final defpackage.acgt a;
    private final defpackage.ajct b;
    private final defpackage.aduj c;
    private java.util.Map d;

    public achq(defpackage.acgt acgtVar, defpackage.ajct ajctVar, defpackage.aduj adujVar) {
        this.a = acgtVar;
        this.b = ajctVar;
        this.c = adujVar;
    }

    private final defpackage.ajcq i() {
        java.util.Map map = this.d;
        if (map != null) {
            return defpackage.aiql.z(map);
        }
        defpackage.aduj adujVar = this.c;
        adujVar.e();
        return defpackage.ajck.w(this.a.b()).x(adujVar.b(new defpackage.vut(this, 8)), this.b);
    }

    private final synchronized void j(achu achuVar) {
        java.util.Map map = this.d;
        java.lang.String str = achuVar.d;
        if (!map.containsKey(str)) {
            this.d.put(str, new java.util.HashSet());
        }
        java.util.Set set = (java.util.Set) this.d.get(str);
        set.remove(achuVar);
        set.add(achuVar);
    }

    @Override // defpackage.acgt
    public final synchronized defpackage.ajcq a(long j) {
        java.util.Map map = this.d;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.util.Collection<achu> collection = (java.util.Collection) entry.getValue();
                java.util.HashSet hashSet = new java.util.HashSet();
                for (achu achuVar : collection) {
                    if (achuVar.c >= j) {
                        hashSet.add(achuVar);
                    }
                }
                entry.setValue(hashSet);
            }
        }
        return this.a.a(j);
    }

    @Override // defpackage.acgt
    public final synchronized defpackage.ajcq b() {
        return defpackage.ajck.w(i()).x(new zqi(this, 11), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.acgt
    public final synchronized defpackage.ajcq c(java.util.Collection collection) {
        defpackage.ajcq ajcqVarC;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            achu achuVar = (achu) it.next();
            if (achuVar.b > achuVar.c) {
                ajcqVarC = defpackage.aiql.y(new acgq());
            }
        }
        this.c.e();
        if (this.d != null) {
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                j((achu) it2.next());
            }
        }
        ajcqVarC = this.a.c(collection);
        return ajcqVarC;
    }

    public final synchronized defpackage.ajcq d(java.lang.String str, long j) throws java.lang.Throwable {
        try {
            try {
                defpackage.aduj adujVar = this.c;
                adujVar.e();
                return defpackage.ajck.w(i()).x(adujVar.b(new vlp(this, str, j, 2)), defpackage.ajbm.INSTANCE);
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final synchronized defpackage.ajcq e() {
        return defpackage.ajck.w(i()).x(new defpackage.kvf(19), defpackage.ajbm.INSTANCE);
    }

    public final synchronized java.util.Map f(java.util.Collection collection) {
        this.d = new java.util.HashMap();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            j((achu) it.next());
        }
        return this.d;
    }

    public final synchronized java.util.Set g(java.lang.String str) {
        return this.d.containsKey(str) ? (java.util.Set) this.d.get(str) : defpackage.aikn.a;
    }

    public final synchronized java.util.Set h() {
        java.util.HashSet hashSet;
        java.util.Collection collectionValues = this.d.values();
        defpackage.ahvr.ci(collectionValues);
        java.util.Iterator it = new aier(collectionValues).iterator();
        hashSet = new java.util.HashSet();
        defpackage.ahvr.bd(hashSet, it);
        return hashSet;
    }
}
