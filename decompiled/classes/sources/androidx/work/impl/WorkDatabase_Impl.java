package androidx.work.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {
    private final defpackage.aoir m = new defpackage.aoiy(new defpackage.gpg(this, 3));
    private final defpackage.aoir n = new defpackage.aoiy(new defpackage.gpg(this, 4));
    private final defpackage.aoir o = new defpackage.aoiy(new defpackage.gpg(this, 5));
    private final defpackage.aoir p = new defpackage.aoiy(new defpackage.gpg(this, 6));
    private final defpackage.aoir q = new defpackage.aoiy(new defpackage.gpg(this, 7));
    private final defpackage.aoir r = new defpackage.aoiy(new defpackage.gpg(this, 8));
    private final defpackage.aoir s = new defpackage.aoiy(new defpackage.gpg(this, 9));
    private final defpackage.aoir t = new defpackage.aoiy(new defpackage.gpg(this, 10));

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gwz A() {
        return (defpackage.gwz) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gxe B() {
        return (defpackage.gxe) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gxh C() {
        return (defpackage.gxh) this.r.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gxm D() {
        return (defpackage.gxm) this.m.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gxx E() {
        return (defpackage.gxx) this.o.a();
    }

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.gfy
    public final /* synthetic */ defpackage.ggb c() {
        return new defpackage.gup(this);
    }

    @Override // defpackage.gfy
    public final java.util.List f(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.gug());
        arrayList.add(new defpackage.guh());
        arrayList.add(new defpackage.gui());
        arrayList.add(new defpackage.guj());
        arrayList.add(new defpackage.guk());
        arrayList.add(new defpackage.gul());
        arrayList.add(new defpackage.gum());
        arrayList.add(new defpackage.gun());
        arrayList.add(new defpackage.guo());
        return arrayList;
    }

    @Override // defpackage.gfy
    protected final java.util.Map g() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        defpackage.aooa aooaVar = new defpackage.aooa(defpackage.gxm.class);
        defpackage.aokc aokcVar = defpackage.aokc.a;
        linkedHashMap.put(aooaVar, aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gwn.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gxx.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gwz.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gxe.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gxh.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gws.class), aokcVar);
        linkedHashMap.put(new defpackage.aooa(defpackage.gwv.class), aokcVar);
        return linkedHashMap;
    }

    @Override // defpackage.gfy
    public final java.util.Set i() {
        return new java.util.LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gwn x() {
        return (defpackage.gwn) this.n.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gws y() {
        return (defpackage.gws) this.s.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final defpackage.gwv z() {
        return (defpackage.gwv) this.t.a();
    }
}
