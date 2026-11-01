package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfo {
    private static defpackage.agfo a;
    private static final long b;
    private static final xtq f = new xtq("SetupCompatServiceInvoker", (byte[]) null);
    private final android.content.Context c;
    private final java.util.concurrent.ExecutorService d = defpackage.agfj.a.b;
    private final long e = b;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        b = 10000L;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private agfo(android.content.Context context) {
        this.c = context;
    }

    public static synchronized defpackage.agfo a(android.content.Context context) {
        defpackage.agfo agfoVar;
        agfoVar = a;
        if (agfoVar == null) {
            agfoVar = new defpackage.agfo(context.getApplicationContext());
            a = agfoVar;
        }
        return agfoVar;
    }

    public final void b(int i, android.os.Bundle bundle) {
        try {
            defpackage.agff agffVarA = defpackage.agfq.a(this.c, this.e, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (agffVarA != null) {
                android.os.Bundle bundle2 = android.os.Bundle.EMPTY;
                android.os.Parcel parcelEP = agffVarA.eP();
                parcelEP.writeInt(i);
                yld.d(parcelEP, bundle);
                yld.d(parcelEP, bundle2);
                agffVarA.eS(2, parcelEP);
            } else {
                f.B("logMetric failed since service reference is null. Are the permissions valid?");
            }
        } catch (android.os.RemoteException | java.lang.IllegalStateException | java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
            f.A(java.lang.String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    public final void c(java.lang.String str, android.os.Bundle bundle) {
        try {
            defpackage.agff agffVarA = defpackage.agfq.a(this.c, this.e, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (agffVarA != null) {
                android.os.Parcel parcelEP = agffVarA.eP();
                yld.d(parcelEP, bundle);
                agffVarA.eS(3, parcelEP);
            } else {
                f.B("Report focusChange failed since service reference is null. Are the permission valid?");
            }
        } catch (android.os.RemoteException | java.lang.InterruptedException | java.lang.UnsupportedOperationException | java.util.concurrent.TimeoutException e) {
            f.A(java.lang.String.format("Exception occurred while %s trying report windowFocusChange to SetupWizard.", str), e);
        }
    }

    public final void d(int i, android.os.Bundle bundle) {
        try {
            this.d.execute(new mo(this, i, bundle, 14));
        } catch (java.util.concurrent.RejectedExecutionException e) {
            f.A(java.lang.String.format("Metric of type %d dropped since queue is full.", java.lang.Integer.valueOf(i)), e);
        }
    }

    public final void e(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        try {
            str2 = str;
            try {
                this.d.execute(new defpackage.acxq(this, str2, bundle, 9, (byte[]) null));
            } catch (java.util.concurrent.RejectedExecutionException e) {
                e = e;
                f.A(java.lang.String.format("Screen %s report focus changed failed.", str2), e);
            }
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            e = e2;
            str2 = str;
        }
    }
}
