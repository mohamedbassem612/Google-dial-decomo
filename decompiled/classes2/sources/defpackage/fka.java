package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fka {
    private final defpackage.fjz c;
    private final defpackage.fkf d;
    private final long e;
    private boolean f;
    private long i;
    private boolean k;
    private boolean m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;
    private int g = 0;
    private long h = -9223372036854775807L;
    private long j = -9223372036854775807L;
    private float l = 1.0f;
    public defpackage.etc b = defpackage.etc.a;
    public long a = 50000;

    public fka(android.content.Context context, defpackage.fjz fjzVar, long j) {
        this.c = fjzVar;
        this.e = j;
        this.d = new defpackage.fkf(context);
        p();
    }

    private final void o(int i) {
        this.g = java.lang.Math.min(this.g, i);
    }

    private final void p() {
        this.o = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
    }

    private final void q(long j, long j2) {
        this.p = this.o;
        this.o = j;
        this.r = this.q;
        this.q = j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r1v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v25 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v25 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v31 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v25 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final int a(long r41, long r43, long r45, long r47, boolean r49, boolean r50, long r51, long r53, boolean r55, defpackage.fjy r56) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fka.a(long, long, long, long, boolean, boolean, long, long, boolean, fjy):int");
    }

    public final void b() {
        if (this.g == 0) {
            this.g = 1;
        }
    }

    public final void c(boolean z) {
        this.k = z;
        long j = this.e;
        this.j = j > 0 ? android.os.SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    public final void d() {
        this.f = true;
        this.i = eum.w(android.os.SystemClock.elapsedRealtime());
        defpackage.fkf fkfVar = this.d;
        fkfVar.d = true;
        fkfVar.c();
        if (!fkfVar.b) {
            android.content.Context context = fkfVar.a;
            int i = defpackage.fkc.e;
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            defpackage.fkc fkeVar = null;
            if (displayManager != null) {
                try {
                    android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                    fkeVar = android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.fke(choreographer, displayManager) : new defpackage.fkd(choreographer, displayManager);
                } catch (java.lang.RuntimeException e) {
                    defpackage.etr.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            fkfVar.c = fkeVar;
            fkfVar.b = true;
        }
        defpackage.fkc fkcVar = fkfVar.c;
        if (fkcVar != null) {
            fkcVar.a();
        }
        fkfVar.d(false);
    }

    public final void e() {
        this.f = false;
        this.j = -9223372036854775807L;
        defpackage.fkf fkfVar = this.d;
        fkfVar.d = false;
        defpackage.fkc fkcVar = fkfVar.c;
        if (fkcVar != null) {
            fkcVar.b();
        }
        fkfVar.b();
        p();
    }

    public final void f(int i) {
        if (i == 0) {
            this.g = 1;
        } else if (i != 1) {
            o(2);
        } else {
            this.g = 0;
        }
        this.d.c();
    }

    public final void g() {
        this.d.c();
        this.h = -9223372036854775807L;
        o(1);
        this.j = -9223372036854775807L;
        this.n = false;
        p();
    }

    public final void h(int i) {
        defpackage.fkf fkfVar = this.d;
        if (fkfVar.h != i) {
            fkfVar.h = i;
            fkfVar.d(true);
        }
    }

    public final void i(android.view.Surface surface) {
        this.m = surface != null;
        this.n = false;
        defpackage.fkf fkfVar = this.d;
        if (fkfVar.e != surface) {
            fkfVar.b();
            fkfVar.e = surface;
            fkfVar.d(true);
        }
        o(1);
    }

    public final void j(float f) {
        ahvr.bM(f > 0.0f);
        if (f != this.l) {
            this.l = f;
            defpackage.fkf fkfVar = this.d;
            fkfVar.g = f;
            fkfVar.d(false);
        }
    }

    public final void k(float f) {
        defpackage.fkf fkfVar = this.d;
        if (fkfVar.f != f) {
            fkfVar.f = f;
            fkfVar.d(false);
        }
    }

    public final boolean l() {
        return this.j != -9223372036854775807L;
    }

    public final boolean m(boolean z) {
        if (z && (this.g == 3 || (this.n && !this.m))) {
            this.j = -9223372036854775807L;
            return true;
        }
        if (this.j != -9223372036854775807L) {
            if (android.os.SystemClock.elapsedRealtime() < this.j) {
                return true;
            }
            this.j = -9223372036854775807L;
        }
        return false;
    }

    public final boolean n() {
        int i = this.g;
        this.g = 3;
        this.i = eum.w(android.os.SystemClock.elapsedRealtime());
        return i != 3;
    }
}
