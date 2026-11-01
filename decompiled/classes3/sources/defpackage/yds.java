package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yds implements android.os.Handler.Callback {
    private static final defpackage.ydr b = new defpackage.ydq(0);
    public final aca a = new aca();
    private volatile defpackage.xsx c;
    private final defpackage.ydr d;
    private final defpackage.uyg e;

    public yds(defpackage.ydr ydrVar) {
        ydrVar = ydrVar == null ? b : ydrVar;
        this.d = ydrVar;
        this.e = new defpackage.uyg(ydrVar);
        int i = defpackage.ybq.a;
    }

    public static android.app.Activity a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return a(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(java.util.Collection collection, java.util.Map map) {
        android.view.View view;
        if (collection != null) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                aw awVar = (aw) it.next();
                if (awVar != null && (view = awVar.Q) != null) {
                    map.put(view, awVar);
                    e(awVar.I().k(), map);
                }
            }
        }
    }

    public final defpackage.xsx b(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (defpackage.ygc.j() && !(context instanceof android.app.Application)) {
            if (context instanceof az) {
                return d((az) context);
            }
            if (context instanceof android.content.ContextWrapper) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.a(defpackage.xrr.b(context.getApplicationContext()), new defpackage.ydh(), new defpackage.ydo(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final defpackage.xsx c(aw awVar) {
        anty.aI(awVar.z(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (defpackage.ygc.i()) {
            return b(awVar.z().getApplicationContext());
        }
        if (awVar.G() != null) {
            awVar.G();
        }
        awVar.I();
        android.content.Context contextZ = awVar.z();
        return this.e.g(contextZ, defpackage.xrr.b(contextZ.getApplicationContext()), awVar.P(), awVar.aK());
    }

    public final defpackage.xsx d(az azVar) {
        if (defpackage.ygc.i()) {
            return b(azVar.getApplicationContext());
        }
        if (azVar.isDestroyed()) {
            throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        android.app.Activity activityA = a(azVar);
        boolean z = true;
        if (activityA != null && activityA.isFinishing()) {
            z = false;
        }
        defpackage.xrr xrrVarB = defpackage.xrr.b(azVar.getApplicationContext());
        defpackage.uyg uygVar = this.e;
        ems emsVarP = azVar.P();
        azVar.a();
        return uygVar.g(azVar, xrrVarB, emsVarP, z);
    }

    @Override // android.os.Handler.Callback
    @java.lang.Deprecated
    public final boolean handleMessage(android.os.Message message) {
        return false;
    }
}
