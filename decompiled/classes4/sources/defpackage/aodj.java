package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aodj {
    public static final defpackage.aodj a = new defpackage.aodj(new aooc[0]);
    public final aooc[] b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public aodj(aooc[] aoocVarArr) {
        this.b = aoocVarArr;
    }

    public static /* synthetic */ void g(defpackage.aodj aodjVar) {
        int i = 0;
        while (true) {
            aooc[] aoocVarArr = aodjVar.b;
            if (i >= aoocVarArr.length) {
                return;
            }
            aooc aoocVar = aoocVarArr[i];
            i++;
        }
    }

    public static defpackage.aodj h(anmg[] anmgVarArr, defpackage.anlw anlwVar) {
        defpackage.aodj aodjVar = new defpackage.aodj(anmgVarArr);
        for (anmg anmgVar : anmgVarArr) {
            anmgVar.d(anlwVar);
        }
        return aodjVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            anmg[] anmgVarArr = this.b;
            if (i >= anmgVarArr.length) {
                return;
            }
            anmg anmgVar = anmgVarArr[i];
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            aooc[] aoocVarArr = this.b;
            if (i >= aoocVarArr.length) {
                return;
            }
            aoocVarArr[i].b(j);
            i++;
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            aooc[] aoocVarArr = this.b;
            if (i >= aoocVarArr.length) {
                return;
            }
            aoocVarArr[i].c(j);
            i++;
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            anmg[] anmgVarArr = this.b;
            if (i >= anmgVarArr.length) {
                return;
            }
            anmgVarArr[i].a();
            i++;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            anmg[] anmgVarArr = this.b;
            if (i >= anmgVarArr.length) {
                return;
            }
            anmg anmgVar = anmgVarArr[i];
            i++;
        }
    }

    public final void f() {
        if (this.c.compareAndSet(false, true)) {
            for (aooc aoocVar : this.b) {
            }
        }
    }
}
