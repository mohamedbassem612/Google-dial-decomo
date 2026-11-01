package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gcp {
    public final defpackage.apkl a = new defpackage.apkl(new defpackage.een(5));

    public abstract java.lang.Object a(defpackage.gcq gcqVar);

    public abstract java.lang.Object b(defpackage.gcl gclVar, defpackage.aoln aolnVar);

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void c() {
        defpackage.apkl apklVar = this.a;
        if (apklVar.a) {
            return;
        }
        synchronized (apklVar.c) {
            if (apklVar.a) {
                return;
            }
            apklVar.a = true;
            ?? r2 = apklVar.d;
            java.util.List listBZ = defpackage.ajsz.bZ(r2);
            r2.clear();
            ?? r0 = apklVar.b;
            java.util.Iterator it = listBZ.iterator();
            while (it.hasNext()) {
                r0.a(it.next());
            }
            if (defpackage.dzn.j(3)) {
                toString();
                defpackage.dzn.k(3, "Invalidated PagingSource ".concat(toString()));
            }
        }
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }
}
