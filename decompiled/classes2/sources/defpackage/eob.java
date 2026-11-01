package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eob {
    private static final dzl a = new dzl();

    public static final aoss a(eoa eoaVar) {
        java.lang.AutoCloseable autoCloseable;
        defpackage.eoy eoyVar;
        aoup aoupVarJ;
        java.lang.AutoCloseable autoCloseable2;
        synchronized (a) {
            epa epaVar = eoaVar.h;
            synchronized (epaVar.d) {
                autoCloseable = (java.lang.AutoCloseable) epaVar.a.get("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            }
            eoyVar = (defpackage.eoy) autoCloseable;
            if (eoyVar == null) {
                try {
                    aosp aospVar = aoth.a;
                    aoupVarJ = apcg.a.j();
                } catch (aoit | java.lang.IllegalStateException unused) {
                    aoupVarJ = aols.a;
                }
                defpackage.eoy eoyVar2 = new defpackage.eoy(aoupVarJ.plus(new aovh((aoub) null)));
                epa epaVar2 = eoaVar.h;
                if (epaVar2.c) {
                    epa.a(eoyVar2);
                } else {
                    synchronized (epaVar2.d) {
                        autoCloseable2 = (java.lang.AutoCloseable) epaVar2.a.put("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", eoyVar2);
                    }
                    epa.a(autoCloseable2);
                }
                eoyVar = eoyVar2;
            }
        }
        return eoyVar;
    }
}
