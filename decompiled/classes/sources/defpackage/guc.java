package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class guc extends defpackage.gus {
    private static final java.lang.String g = defpackage.gsh.b("WorkContinuationImpl");
    public final defpackage.guq a;
    public final java.lang.String b;
    public final java.util.List c;
    public final java.util.List d;
    public boolean e;
    public final int f;
    private final java.util.List h = new java.util.ArrayList();
    private defpackage.gso i;

    public guc(defpackage.guq guqVar, java.lang.String str, int i, java.util.List list) {
        this.a = guqVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new java.util.ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((defpackage.gxl) ((defpackage.aogc) list.get(i2)).a).v != Long.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            java.lang.String strBg = ((defpackage.aogc) list.get(i2)).bg();
            this.d.add(strBg);
            this.h.add(strBg);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.gso a() {
        if (this.e) {
            defpackage.gsh.a();
            android.util.Log.w(g, "Already enqueued work ids (" + android.text.TextUtils.join(", ", this.d) + ')');
        } else {
            defpackage.guq guqVar = this.a;
            this.i = defpackage.gus.S(guqVar.d.r, "EnqueueRunnable_".concat(this.f != 1 ? "KEEP" : "REPLACE"), guqVar.k.e, new defpackage.gpg(this, 2));
        }
        return this.i;
    }
}
