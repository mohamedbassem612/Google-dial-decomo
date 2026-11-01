package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gwl implements gvp, gtf {
    public static final java.lang.String a = gsh.b("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final guq b;
    public final java.lang.Object c = new java.lang.Object();
    gxd d;
    final java.util.Map e;
    public final java.util.Map f;
    public final java.util.Map g;
    public defpackage.gwk h;
    public final gou i;
    public final ipc j;
    private final android.content.Context l;

    public gwl(android.content.Context context) {
        this.l = context;
        guq guqVarH = guq.h(context);
        this.b = guqVarH;
        this.i = guqVarH.k;
        this.d = null;
        this.e = new java.util.LinkedHashMap();
        this.g = new java.util.HashMap();
        this.f = new java.util.HashMap();
        this.j = new ipc(guqVarH.l);
        guqVarH.g.c(this);
    }

    public final void a(gxd gxdVar, boolean z) {
        java.util.Map.Entry entry;
        synchronized (this.c) {
            aoub aoubVar = ((gxl) this.f.remove(gxdVar)) != null ? (aoub) this.g.remove(gxdVar) : null;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
        }
        java.util.Map map = this.e;
        defpackage.grv grvVar = (defpackage.grv) map.remove(gxdVar);
        if (gxdVar.equals(this.d)) {
            if (map.size() > 0) {
                java.util.Iterator it = map.entrySet().iterator();
                java.lang.Object next = it.next();
                while (true) {
                    entry = (java.util.Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (gxd) entry.getKey();
                if (this.h != null) {
                    defpackage.grv grvVar2 = (defpackage.grv) entry.getValue();
                    defpackage.gwk gwkVar = this.h;
                    int i = grvVar2.a;
                    gwkVar.c(i, grvVar2.b, grvVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        defpackage.gwk gwkVar2 = this.h;
        if (grvVar == null || gwkVar2 == null) {
            return;
        }
        gsh gshVarA = gsh.a();
        java.lang.String str = a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Removing Notification (id: ");
        int i2 = grvVar.a;
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(gxdVar);
        sb.append(", notificationType: ");
        sb.append(grvVar.b);
        gshVarA.c(str, sb.toString());
        gwkVar2.a(i2);
    }

    public final void b(android.content.Intent intent) {
        if (this.h == null) {
            throw new java.lang.IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        gxd gxdVar = new gxd(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        gsh.a().c(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ')');
        if (notification == null) {
            throw new java.lang.IllegalArgumentException("Notification passed in the intent was null.");
        }
        defpackage.grv grvVar = new defpackage.grv(intExtra, notification, intExtra2);
        java.util.Map map = this.e;
        map.put(gxdVar, grvVar);
        defpackage.grv grvVar2 = (defpackage.grv) map.get(this.d);
        if (grvVar2 == null) {
            this.d = gxdVar;
        } else {
            this.h.b(intExtra, notification);
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((defpackage.grv) ((java.util.Map.Entry) it.next()).getValue()).b;
            }
            grvVar = new defpackage.grv(grvVar2.a, grvVar2.c, i);
        }
        this.h.c(grvVar.a, grvVar.b, grvVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            java.util.Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((aoub) it.next()).s((java.util.concurrent.CancellationException) null);
            }
        }
        this.b.g.d(this);
    }

    public final void d(int i, int i2) {
        gsh.a();
        android.util.Log.i(a, a.bj(i2, "Foreground service timed out, FGS type: "));
        for (java.util.Map.Entry entry : this.e.entrySet()) {
            if (((defpackage.grv) entry.getValue()).b == i2) {
                this.b.k((gxd) entry.getKey(), -128);
            }
        }
        defpackage.gwk gwkVar = this.h;
        if (gwkVar != null) {
            gwkVar.d(i);
        }
    }

    public final void e(gxl gxlVar, defpackage.hgt hgtVar) {
        if (hgtVar instanceof defpackage.gvn) {
            gsh.a().c(a, "Constraints unmet for WorkSpec ".concat(java.lang.String.valueOf(gxlVar.b)));
            this.b.k(gus.u(gxlVar), ((defpackage.gvn) hgtVar).a);
        }
    }
}
