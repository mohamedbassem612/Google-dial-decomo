package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsx {
    public int b;
    public boolean c;
    public final defpackage.dsy d;
    public defpackage.dsx e;
    public defpackage.dst h;
    public final int i;
    public java.util.HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public dsx(defpackage.dsy dsyVar, int i) {
        this.d = dsyVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        defpackage.dsx dsxVar;
        if (this.d.ah == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (dsxVar = this.e) == null || dsxVar.d.ah != 8) ? this.f : i;
    }

    public final void c(int i, java.util.ArrayList arrayList, dtq dtqVar) {
        java.util.HashSet hashSet = this.a;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                dum.b(((defpackage.dsx) it.next()).d, i, arrayList, dtqVar);
            }
        }
    }

    public final void d() {
        java.util.HashSet hashSet;
        defpackage.dsx dsxVar = this.e;
        if (dsxVar != null && (hashSet = dsxVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        defpackage.dsx dsxVar;
        java.util.HashSet<defpackage.dsx> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        for (defpackage.dsx dsxVar2 : hashSet) {
            int i = dsxVar2.i - 1;
            if (i == 1) {
                dsxVar = dsxVar2.d.L;
            } else if (i == 2) {
                dsxVar = dsxVar2.d.M;
            } else if (i != 3) {
                dsxVar = i != 4 ? null : dsxVar2.d.K;
            } else {
                dsxVar = dsxVar2.d.J;
            }
            if (dsxVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        java.util.HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        defpackage.dst dstVar = this.h;
        if (dstVar == null) {
            this.h = new defpackage.dst(1);
        } else {
            dstVar.c();
        }
    }

    public final void j(defpackage.dsx dsxVar, int i, int i2) {
        if (dsxVar == null) {
            d();
            return;
        }
        this.e = dsxVar;
        if (dsxVar.a == null) {
            dsxVar.a = new java.util.HashSet();
        }
        java.util.HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final java.lang.String toString() {
        return this.d.ai + ':' + defpackage.a.p(this.i);
    }
}
