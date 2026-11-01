package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aicr extends defpackage.aicz implements java.io.Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient java.util.Map a;
    public transient int b;

    public aicr(java.util.Map map) {
        if (!map.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = map;
    }

    public abstract java.util.Collection a();

    public java.util.Collection b() {
        throw null;
    }

    @Override // defpackage.aije
    public java.util.Collection c(java.lang.Object obj) {
        java.util.Collection collectionA = (java.util.Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return e(obj, collectionA);
    }

    public abstract java.util.Collection d(java.util.Collection collection);

    public abstract java.util.Collection e(java.lang.Object obj, java.util.Collection collection);

    @Override // defpackage.aije
    public final int h() {
        return this.b;
    }

    @Override // defpackage.aije
    public java.util.Collection i() {
        return this instanceof defpackage.aikr ? new defpackage.aicx(this) : new defpackage.aijl(this);
    }

    public final java.util.Collection j(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        java.util.Collection collectionA = a();
        collectionA.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return d(collectionA);
    }

    @Override // defpackage.aije
    public final java.util.Collection k() {
        return new defpackage.aicy(this);
    }

    @Override // defpackage.aicz
    public final java.util.Iterator l() {
        return new defpackage.aica(this);
    }

    @Override // defpackage.aicz
    public final java.util.Iterator m() {
        return new defpackage.aibz(this);
    }

    final java.util.List n(java.lang.Object obj, java.util.List list, aicn aicnVar) {
        return list instanceof java.util.RandomAccess ? new aicj(this, obj, list, aicnVar) : new aicp(this, obj, list, aicnVar);
    }

    @Override // defpackage.aije
    public java.util.Map o() {
        return new aicd(this, this.a);
    }

    @Override // defpackage.aije
    public java.util.Set p() {
        return new defpackage.aicg(this, this.a);
    }

    @Override // defpackage.aije
    public final void q() {
        java.util.Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void r(java.util.Map map) {
        this.a = map;
        this.b = 0;
        for (java.util.Collection collection : map.values()) {
            defpackage.ahvr.bM(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.aije
    public final boolean s(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.aicz, defpackage.aije
    public final void t(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
            }
        } else {
            java.util.Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new java.lang.AssertionError("New Collection violated the Collection spec");
            }
            this.b++;
            this.a.put(obj, collectionA);
        }
    }
}
