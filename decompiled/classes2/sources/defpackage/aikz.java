package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aikz extends aild {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public aikz(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final int a() {
        return aiql.al(d(this.a), d(this.b));
    }

    public final int b() {
        java.util.Set set = this.b;
        java.util.Set set2 = this.a;
        int iE = e(set2) - d(set);
        return iE < 0 ? java.lang.Math.max(e(set) - d(set2), 0) : iE;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ailj iterator() {
        java.util.Set set = this.a;
        java.util.Iterator it = set.iterator();
        java.util.Set set2 = this.b;
        return new defpackage.aiky(this, it, set2, set2.iterator(), set);
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) ^ this.b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    public final int size() {
        java.util.Set set = this.a;
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        java.util.Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                i++;
            }
        }
        return i;
    }
}
