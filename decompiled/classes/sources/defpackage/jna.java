package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jna {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl");
    public final android.content.Context b;
    public final defpackage.agsm c;
    public final defpackage.ajcu d;
    public final defpackage.aoin e;
    public final defpackage.kgl f;
    private final defpackage.rlv g;
    private final defpackage.apnt h;

    public jna(android.content.Context context, defpackage.agsm agsmVar, defpackage.ajcu ajcuVar, defpackage.kgl kglVar, defpackage.apnt apntVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.c = agsmVar;
        this.d = ajcuVar;
        this.f = kglVar;
        this.h = apntVar;
        this.g = rlvVar;
        this.e = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    public final boolean a(jmz jmzVar) {
        long jLongValue;
        if (jmzVar.c) {
            double dRandom = java.lang.Math.random() * 100.0d;
            defpackage.kgl kglVar = this.f;
            if (((defpackage.zzx) kglVar.a).m()) {
                ((defpackage.lpe) kglVar.d).a();
                jLongValue = 1;
            } else {
                jLongValue = ((java.lang.Long) kglVar.b.a()).longValue();
            }
            if (dRandom <= jLongValue) {
                return true;
            }
        }
        return false;
    }

    public final void b(jmz jmzVar, int i) {
        defpackage.akzx akzxVarM = defpackage.amoo.a.m();
        int iL = akky.l(jmzVar.d);
        if (iL == 0) {
            iL = 1;
        }
        defpackage.rlv rlvVar = this.g;
        akzxVarM.u();
        defpackage.amoo amooVar = (defpackage.amoo) akzxVarM.b;
        amooVar.c = iL - 1;
        amooVar.b |= 1;
        akzxVarM.u();
        defpackage.amoo amooVar2 = (defpackage.amoo) akzxVarM.b;
        amooVar2.d = i - 1;
        amooVar2.b |= 2;
        rlvVar.g((defpackage.amoo) akzxVarM.r());
    }

    public final defpackage.ajcq c(defpackage.ajcq ajcqVar, defpackage.aogc aogcVar, jmz jmzVar) {
        defpackage.ajcq ajcqVarH;
        defpackage.ajcq ajcqVar2;
        if (a(jmzVar)) {
            b(jmzVar, 2);
            ajcqVarH = defpackage.ahvr.H(ajcqVar, new iau(this, jmzVar, 5, (byte[]) null), defpackage.ajbm.INSTANCE);
        } else {
            ajcqVarH = ajcqVar;
        }
        try {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 91, "BroadcastReceiverStrategyImpl.java")).v("try doing work using a background service");
            ((defpackage.agsm) this.h.a).k(ajcqVarH);
            ajcqVar2 = ajcqVarH;
            try {
                defpackage.agsm.d("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 92, ajcqVar2, defpackage.zct.b, "BroadcastReceiverStrategy doing work using a background service failed", new java.lang.Object[0]);
                return defpackage.ajcm.a;
            } catch (java.lang.IllegalStateException unused) {
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 98, "BroadcastReceiverStrategyImpl.java");
                defpackage.kgl kglVar = this.f;
                aimwVar.x("can't start a background service, attempting to complete work inline within %d milliseconds", kglVar.h());
                defpackage.ajcs ajcsVarB = this.d.schedule(new abb(this, ajcqVar2, aogcVar, jmzVar, 4, (char[]) null), kglVar.h(), java.util.concurrent.TimeUnit.MILLISECONDS);
                ajcqVar.c(new jnv(this, ajcsVarB, 1, (byte[]) null), defpackage.ajbm.INSTANCE);
                return ajcsVarB;
            }
        } catch (java.lang.IllegalStateException unused2) {
            ajcqVar2 = ajcqVarH;
        }
    }
}
