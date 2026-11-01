package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class few implements defpackage.ffw {
    public defpackage.fip b;
    private android.os.Looper f;
    private defpackage.erm g;
    private defpackage.fag h;
    private final java.util.ArrayList e = new java.util.ArrayList(1);
    public final java.util.HashSet a = new java.util.HashSet(1);
    public final alic c = new alic(new java.util.concurrent.CopyOnWriteArrayList(), (defpackage.ffu) null);
    public final alic d = new alic(new java.util.concurrent.CopyOnWriteArrayList(), (defpackage.ffu) null);

    protected final defpackage.fag a() {
        defpackage.fag fagVar = this.h;
        ahvr.ci(fagVar);
        return fagVar;
    }

    @Override // defpackage.ffw
    public final void b(android.os.Handler handler, defpackage.fct fctVar) {
        ((java.util.concurrent.CopyOnWriteArrayList) this.d.c).add(new ils(handler, fctVar, (byte[]) null));
    }

    @Override // defpackage.ffw
    public final void c(android.os.Handler handler, defpackage.fga fgaVar) {
        ((java.util.concurrent.CopyOnWriteArrayList) this.c.c).add(new defpackage.kvt(handler, fgaVar, (char[]) null));
    }

    @Override // defpackage.ffw
    public final void d(defpackage.ffv ffvVar) {
        java.util.HashSet hashSet = this.a;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ffvVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    @Override // defpackage.ffw
    public final void f(defpackage.ffv ffvVar) {
        ahvr.ci(this.f);
        java.util.HashSet hashSet = this.a;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ffvVar);
        if (zIsEmpty) {
            g();
        }
    }

    @Override // defpackage.ffw
    public final void h(defpackage.ffv ffvVar, defpackage.fag fagVar, defpackage.fip fipVar) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.f;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        ahvr.bM(z);
        this.h = fagVar;
        this.b = fipVar;
        defpackage.erm ermVar = this.g;
        this.e.add(ffvVar);
        if (this.f == null) {
            this.f = looperMyLooper;
            this.a.add(ffvVar);
            i(fipVar.e());
        } else if (ermVar != null) {
            f(ffvVar);
            ffvVar.a(this, ermVar);
        }
    }

    protected abstract void i(defpackage.ewm ewmVar);

    protected final void j(defpackage.erm ermVar) {
        this.g = ermVar;
        java.util.ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ffv) arrayList.get(i)).a(this, ermVar);
        }
    }

    @Override // defpackage.ffw
    public final void k(defpackage.ffv ffvVar) {
        java.util.ArrayList arrayList = this.e;
        arrayList.remove(ffvVar);
        if (!arrayList.isEmpty()) {
            d(ffvVar);
            return;
        }
        this.f = null;
        this.g = null;
        this.h = null;
        this.a.clear();
        l();
    }

    protected abstract void l();

    @Override // defpackage.ffw
    public final void m(defpackage.fct fctVar) {
        java.util.concurrent.CopyOnWriteArrayList<ils> copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.d.c;
        for (ils ilsVar : copyOnWriteArrayList) {
            if (ilsVar.a == fctVar) {
                copyOnWriteArrayList.remove(ilsVar);
            }
        }
    }

    @Override // defpackage.ffw
    public final void n(defpackage.fga fgaVar) {
        java.util.concurrent.CopyOnWriteArrayList<defpackage.kvt> copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.c.c;
        for (defpackage.kvt kvtVar : copyOnWriteArrayList) {
            if (kvtVar.a == fgaVar) {
                copyOnWriteArrayList.remove(kvtVar);
            }
        }
    }

    protected final alic r(defpackage.ffu ffuVar) {
        return this.c.p(ffuVar);
    }

    protected final alic s(defpackage.ffu ffuVar) {
        return this.d.q(ffuVar);
    }

    protected void e() {
    }

    protected void g() {
    }

    @Override // defpackage.ffw
    public /* synthetic */ void p() {
    }

    @Override // defpackage.ffw
    public /* synthetic */ void q() {
    }

    @Override // defpackage.ffw
    public /* synthetic */ void o(defpackage.eqt eqtVar) {
    }
}
