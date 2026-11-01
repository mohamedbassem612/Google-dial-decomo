package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewq {
    public final android.content.Context c;
    public final defpackage.ahzi d;
    public final defpackage.ahzi e;
    public final defpackage.aezw f;
    public final defpackage.ahzi g;
    public final defpackage.aezi h;
    public final defpackage.gou i = new defpackage.gou((byte[]) null);
    private final defpackage.ahzi m;
    private final defpackage.ahzi n;
    private static final java.lang.Object j = new java.lang.Object();
    public static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    private static volatile defpackage.aewq k = null;
    private static volatile defpackage.aewq l = null;
    public static final defpackage.ahzi b = defpackage.ahvr.bI(new defpackage.tzo(9));

    public aewq(android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, defpackage.ahzi ahziVar3, defpackage.ahzi ahziVar4, defpackage.ahzi ahziVar5) {
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ahziVar.getClass();
        ahziVar2.getClass();
        ahziVar3.getClass();
        ahziVar4.getClass();
        ahziVar5.getClass();
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(ahziVar);
        defpackage.ahzi ahziVarBI2 = defpackage.ahvr.bI(ahziVar2);
        defpackage.ahzi ahziVarBI3 = defpackage.ahvr.bI(new defpackage.aeex(ahziVar3, 11));
        defpackage.ahzi ahziVarBI4 = defpackage.ahvr.bI(ahziVar4);
        defpackage.ahzi ahziVarBI5 = defpackage.ahvr.bI(ahziVar5);
        this.c = applicationContext;
        this.m = ahziVarBI;
        this.n = ahziVarBI2;
        this.d = ahziVarBI3;
        this.e = ahziVarBI4;
        this.f = new defpackage.aezw(applicationContext, ahziVarBI, ahziVarBI2);
        this.g = ahziVarBI5;
        this.h = new defpackage.aezi(applicationContext, ahziVarBI, ahziVarBI3, ahziVarBI2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.aewq a(android.content.Context context) {
        boolean z;
        defpackage.aewq aewqVar = l;
        defpackage.aewq aewqVar2 = k;
        if (aewqVar2 != null) {
            return aewqVar2;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        try {
            try {
                return (defpackage.aewq) ((defpackage.ahys) ((defpackage.aewp) defpackage.agab.aH(applicationContext, defpackage.aewp.class)).fk()).a;
            } catch (java.lang.IllegalStateException unused) {
                z = true;
                synchronized (j) {
                    if (k != null) {
                        return k;
                    }
                    defpackage.ahyn ahynVarFk = defpackage.ahwt.a;
                    boolean z2 = applicationContext instanceof defpackage.aewp;
                    if (z2) {
                        ahynVarFk = ((defpackage.aewp) applicationContext).fk();
                    }
                    defpackage.aewq aewqVar3 = (defpackage.aewq) ahynVarFk.c(new defpackage.aell(applicationContext, 14));
                    k = aewqVar3;
                    if (!z && !z2) {
                        defpackage.agab.au(java.util.logging.Level.CONFIG, aewqVar3.c(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new java.lang.Object[0]);
                    }
                    return aewqVar3;
                }
            }
        } catch (java.lang.IllegalStateException unused2) {
            z = false;
        }
    }

    public static void d(android.content.Context context) {
        android.content.Context applicationContext;
        if (a.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (java.lang.NullPointerException unused) {
                e();
                defpackage.agab.au(java.util.logging.Level.WARNING, (java.util.concurrent.Executor) b.eZ(), null, "context.getApplicationContext() yielded NullPointerException", new java.lang.Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                defpackage.anty.aq(a, applicationContext);
            }
        }
    }

    public static void e() {
        synchronized (defpackage.aews.a) {
        }
        if (a.get() == null && defpackage.aews.b == null) {
            defpackage.aews.b = new defpackage.aewr();
        }
    }

    public final defpackage.aexi b() {
        return (defpackage.aexi) this.n.eZ();
    }

    public final defpackage.ajcu c() {
        return (defpackage.ajcu) this.m.eZ();
    }
}
