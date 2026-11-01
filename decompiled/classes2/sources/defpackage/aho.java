package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aho {
    public final defpackage.agx a;
    public defpackage.agu b;
    private int e;
    private int f;
    private final ccp d = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.agq.a, cdu.c);
    private final cei g = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public int c = 1;
    private final cei h = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);

    public aho(defpackage.agx agxVar) {
        this.a = agxVar;
    }

    private final int h() {
        return this.g.c();
    }

    private final int i() {
        return this.h.c();
    }

    public final defpackage.ahn a() {
        return (defpackage.ahn) this.d.a();
    }

    public final java.util.List b() {
        return this.a.b();
    }

    public final void c() {
        defpackage.agu aguVar;
        java.lang.Object obj;
        java.util.List listB = b();
        int size = listB.size();
        int i = 0;
        while (true) {
            aguVar = null;
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i);
            if (((defpackage.agy) obj).q()) {
                break;
            } else {
                i++;
            }
        }
        defpackage.agy agyVar = (defpackage.agy) obj;
        if (agyVar != null) {
            aguVar = agyVar.m;
        } else if (this.b == null) {
            return;
        }
        if (aooh.n(aguVar, this.b)) {
            return;
        }
        this.h.h(this.f + 1);
    }

    public final void d() {
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.ahn ahnVarA;
        int i = 0;
        defpackage.agu aguVar = null;
        if (h() != this.e) {
            this.e = h();
            int i2 = this.c;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                ahnVarA = a();
            } else if (i3 == 1) {
                ahnVarA = a().g(this.b);
            } else {
                if (i3 != 2) {
                    throw new aois();
                }
                java.util.List listB = b();
                int size = listB.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        ahnVarA = a().a();
                        break;
                    } else {
                        if (aooh.n(((defpackage.agy) listB.get(i4)).m, this.b)) {
                            ahnVarA = defpackage.agq.a;
                            break;
                        }
                        i4++;
                    }
                }
            }
            f(ahnVarA);
            this.c = 1;
        }
        if (i() != this.f) {
            defpackage.agx agxVar = this.a;
            if (agxVar.b.i()) {
                java.util.List listB2 = b();
                int size2 = listB2.size();
                while (true) {
                    if (i >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listB2.get(i);
                    if (((defpackage.agy) obj2).q()) {
                        break;
                    } else {
                        i++;
                    }
                }
                defpackage.agy agyVar = (defpackage.agy) obj2;
                if (agyVar != null) {
                    aguVar = agyVar.m;
                }
            } else {
                adq adqVar = agxVar.g;
                java.lang.Object[] objArr = adqVar.a;
                int i5 = adqVar.b;
                while (true) {
                    if (i >= i5) {
                        obj = null;
                        break;
                    }
                    obj = objArr[i];
                    if (((defpackage.agy) obj).q()) {
                        break;
                    } else {
                        i++;
                    }
                }
                defpackage.agy agyVar2 = (defpackage.agy) obj;
                if (agyVar2 != null) {
                    aguVar = agyVar2.m;
                }
            }
            if (!aooh.n(aguVar, this.b)) {
                this.b = aguVar;
            }
            this.f = i();
        }
    }

    public final void e() {
        this.c = 1;
        this.e = h();
        f(defpackage.agq.a);
    }

    public final void f(defpackage.ahn ahnVar) {
        this.d.b(ahnVar);
    }

    public final void g(int i) {
        this.c = i;
        this.g.h(this.e + 1);
    }
}
