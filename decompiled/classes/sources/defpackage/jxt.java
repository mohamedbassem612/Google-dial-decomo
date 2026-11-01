package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jxt {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public jxt(defpackage.csx csxVar, defpackage.dpf dpfVar, defpackage.vx vxVar) {
        this.a = csxVar;
        this.c = dpfVar;
        this.b = vxVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r1 = this.c;
        ((defpackage.gkz) this.a).n();
        r1.run();
    }

    public /* synthetic */ jxt(java.lang.Runnable runnable, defpackage.gkz gkzVar, java.lang.Runnable runnable2) {
        this.b = runnable;
        this.a = gkzVar;
        this.c = runnable2;
    }

    public /* synthetic */ jxt(jxw jxwVar, jxp jxpVar, java.lang.String str) {
        this.a = jxwVar;
        this.b = jxpVar;
        this.c = str;
    }
}
