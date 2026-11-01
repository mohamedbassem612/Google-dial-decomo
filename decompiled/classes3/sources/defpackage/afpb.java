package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpb {
    private static defpackage.afpb f;
    public final java.util.List a;
    public int b;
    public boolean c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    private afpb(android.content.Context context) {
        java.util.concurrent.Executor executorAD = hgu.aD();
        this.e = executorAD;
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
        this.d = new java.lang.Object();
        this.b = 0;
        executorAD.execute(new esz(this, context, 3, (byte[]) null));
    }

    public static synchronized defpackage.afpb i(android.content.Context context) {
        defpackage.afpb afpbVar;
        afpbVar = f;
        if (afpbVar == null) {
            afpbVar = new defpackage.afpb(context);
            f = afpbVar;
        }
        return afpbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final void j() {
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((defpackage.afpa) it.next()).a();
        }
        this.c = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(android.animation.Animator animator) {
        this.d.add(animator);
    }

    public final void b(ejx ejxVar) {
        this.a.add(ejxVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void c(defpackage.afpa afpaVar) {
        this.e.add(afpaVar);
    }

    public final void d() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            j();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void e() {
        if (this.c) {
            return;
        }
        this.c = true;
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((defpackage.afpa) it.next()).b();
        }
        java.util.List<ejx> list = this.a;
        this.b = list.size();
        ?? r2 = this.d;
        if (!r2.isEmpty()) {
            this.b++;
        }
        if (this.b == 0) {
            j();
            return;
        }
        afoy afoyVar = new afoy(this, 0);
        for (ejx ejxVar : list) {
            ejxVar.g(afoyVar);
            ejxVar.e();
        }
        if (r2.isEmpty()) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        afsq.h(animatorSet, new java.util.ArrayList((java.util.Collection) r2));
        animatorSet.addListener(new defpackage.afoz(this));
        animatorSet.start();
    }

    public final int f() {
        int i;
        synchronized (this.d) {
            i = this.b;
        }
        return i;
    }

    public final void g() {
        java.util.concurrent.CopyOnWriteArrayList<ett> copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.a;
        for (ett ettVar : copyOnWriteArrayList) {
            if (((java.lang.ref.WeakReference) ettVar.a).get() == null) {
                copyOnWriteArrayList.remove(ettVar);
            }
        }
    }

    public final void h(int i) {
        g();
        synchronized (this.d) {
            if (this.c && this.b == i) {
                return;
            }
            this.c = true;
            this.b = i;
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.a).iterator();
            while (it.hasNext()) {
                ((ett) it.next()).a();
            }
        }
    }

    public afpb() {
        this.d = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.b = 0;
        this.c = false;
    }
}
