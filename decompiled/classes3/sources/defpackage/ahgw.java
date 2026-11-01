package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahgw extends eoa implements emj {
    public final java.util.Map a = new aca(2);
    public boolean b = false;
    public emx c = null;
    private final java.util.Map d = new aca();
    private boolean e = false;

    private final void i(emx emxVar) {
        ahvr.bY(android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread());
        java.util.Set set = (java.util.Set) this.a.remove(emxVar);
        ahvr.bZ(set != null, "A LifecycleOwner was destroyed that was never observed, or was destroyed twice.");
        this.e = true;
        if (emxVar == this.c) {
            this.c = null;
        }
        java.util.Set setKeySet = this.d.keySet();
        ahvr.cj(setKeySet, "set1");
        ahvr.cj(set, "set2");
        aikz aikzVar = new aikz(setKeySet, set);
        ahvr.cc(aikzVar.isEmpty(), "This lifecycle didn't call getOrCreate() for the following IDs: %s Each value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", aikzVar);
    }

    public final void b(emx emxVar) {
        i(emxVar);
        emxVar.P().d(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahgu, java.lang.Object] */
    public final void d() {
        for (apjb apjbVar : this.d.values()) {
            apjbVar.b.a(apjbVar.a);
        }
    }

    public final void e(emx emxVar) {
        i(emxVar);
        emxVar.P().d(this);
    }

    public final java.lang.Object h(int i, emx emxVar, defpackage.ahgv ahgvVar, defpackage.ahgu ahguVar) {
        ahvr.bY(android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread());
        emq emqVarA = emxVar.P().a();
        ahvr.cc(emqVarA == emq.b, "Values may only be accessed during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call getOrCreate() for each and only each value that the first LifecycleOwner instance called getOrCreate() for, exactly once. The current lifecycle state is %s", emqVarA);
        if (this.e) {
            java.util.Set set = (java.util.Set) this.a.get(emxVar);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            ahvr.ca(set.add(numValueOf), "A value for idRes %s has already been gotten. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
            java.util.Map map = this.d;
            ahvr.ca(map.containsKey(numValueOf), "The first lifecycle didn't create a value for idRes %s. Is the LifecycleOwner accessing this value inside a conditional?", i);
            return ((apjb) map.get(numValueOf)).a;
        }
        ahvr.bZ(emxVar == this.c, "A second Lifecycle started before the first lifecycle either started or was destroyed. This breaks a boundary condition assumption in TikTok. Please report it as a bug and include reproduction steps and a stack trace.");
        java.lang.Object objA = ahgvVar.a();
        java.util.Map map2 = this.d;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
        ahvr.ca(map2.put(numValueOf2, new apjb(objA, ahguVar)) == null, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        ahvr.ca(((java.util.Set) this.a.get(emxVar)).add(numValueOf2), "A value was previously created for idRes %s. Each lifecycle must call getOrCreate() for each value that the first lifecycle instance called getOrCreate() for, exactly once.", i);
        return objA;
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
