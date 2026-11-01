package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gsr implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ gsr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj = this.d;
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                defpackage.aw awVar = (defpackage.aw) this.c;
                awVar.Q = awVar.M((android.view.LayoutInflater) obj3, (android.view.ViewGroup) obj2, (android.os.Bundle) obj);
                return;
            }
            java.lang.Object obj4 = this.c;
            java.lang.String str = ((defpackage.gxd) this.a).a;
            java.lang.String str2 = defpackage.gtv.a;
            androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) obj4;
            if (workDatabase.D().t(str)) {
                return;
            }
            ?? r2 = this.b;
            java.util.ListIterator listIterator = ((defpackage.aokv) r2).listIterator(0);
            while (listIterator.hasNext()) {
                ((defpackage.gtt) listIterator.next()).b(str);
            }
            defpackage.gtv.a((defpackage.grk) this.d, workDatabase, r2);
            return;
        }
        java.lang.Object obj5 = this.d;
        java.lang.Object obj6 = this.c;
        ?? r3 = this.b;
        java.lang.Object obj7 = this.a;
        boolean zM = da$.ExternalSyntheticApiModelOutline0.m();
        if (zM) {
            try {
                android.os.Trace.beginSection(defpackage.dzk.H((java.lang.String) obj7));
            } catch (java.lang.Throwable th) {
                if (zM) {
                    android.os.Trace.endSection();
                }
                throw th;
            }
        }
        try {
            r3.a();
            defpackage.gsn gsnVar = defpackage.gso.a;
            ((defpackage.enf) obj6).i(gsnVar);
            ((defpackage.dsd) obj5).b(gsnVar);
        } catch (java.lang.Throwable th2) {
            ((defpackage.enf) obj6).i(new gsl(th2));
            ((defpackage.dsd) obj5).d(th2);
        }
        if (zM) {
            android.os.Trace.endSection();
        }
    }

    public /* synthetic */ gsr(java.lang.String str, defpackage.aomy aomyVar, defpackage.eng engVar, defpackage.dsd dsdVar, int i) {
        this.$cid = i;
        this.a = str;
        this.b = aomyVar;
        this.c = engVar;
        this.d = dsdVar;
    }
}
