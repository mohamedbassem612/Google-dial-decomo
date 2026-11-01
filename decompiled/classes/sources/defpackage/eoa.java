package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class eoa {
    public final defpackage.epa h = new defpackage.epa();

    public final void g() {
        defpackage.epa epaVar = this.h;
        if (!epaVar.c) {
            epaVar.c = true;
            synchronized (epaVar.d) {
                java.util.Iterator it = epaVar.a.values().iterator();
                while (it.hasNext()) {
                    defpackage.epa.a((java.lang.AutoCloseable) it.next());
                }
                java.util.Set set = epaVar.b;
                java.util.Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    defpackage.epa.a((java.lang.AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        d();
    }

    protected void d() {
    }
}
