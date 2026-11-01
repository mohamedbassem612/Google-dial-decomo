package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahun implements anqn {
    public static final anpc a = anty.w("RemoteViews-bin", android.widget.RemoteViews.CREATOR);
    public static final anms b;

    static {
        java.util.logging.Logger logger = anmv.c;
        b = new anms("RES-RemoteViews-bin", (java.lang.Object) null);
    }

    public static void b(android.widget.RemoteViews remoteViews) {
        ((java.util.concurrent.atomic.AtomicReference) b.a()).set(remoteViews);
    }

    public final antw a(anql anqlVar, anph anphVar, anqm anqmVar) {
        anmv anmvVarL = anmv.k().l(b, new java.util.concurrent.atomic.AtomicReference());
        defpackage.ahum ahumVar = new defpackage.ahum(this, anqlVar, anmvVarL);
        anmv anmvVarA = anmvVarL.a();
        try {
            return new defpackage.anqc(anqmVar.a(ahumVar, anphVar), anmvVarL);
        } finally {
            anmvVarL.f(anmvVarA);
        }
    }
}
