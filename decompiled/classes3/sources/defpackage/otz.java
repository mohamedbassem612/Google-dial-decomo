package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otz {
    public static final aimz a = aimz.i("com/android/dialer/incall/activity/ui/InCallActivityPeer");
    public final adae A;
    public final zjm B;
    public final aogc C;
    private final j$.util.Optional D;
    private final j$.util.Optional E;
    private final defpackage.rhx F;
    public final com.android.dialer.incall.activity.ui.InCallActivity b;
    public final zms c;
    public final aoin d;
    public final aoin e;
    public final qba f;
    public final defpackage.otq g;
    public final ruc h;
    public final rlv i;
    public final mgw j;
    public final oud k;
    public final na l = new defpackage.otx(this);
    public final zjv m;
    public final tec n;
    public final sou o;
    public boolean p;
    public boolean q;
    public final zpm r;
    public final gat s;
    public final zzx t;
    public final zjm u;
    public final gpd v;
    public final tkl w;
    public final defpackage.pgi x;
    public final tkl y;
    public final gpd z;

    public otz(com.android.dialer.incall.activity.ui.InCallActivity inCallActivity, zpm zpmVar, zjm zjmVar, zms zmsVar, adae adaeVar, tkl tklVar, aoin aoinVar, aoin aoinVar2, zzx zzxVar, qba qbaVar, tkl tklVar2, defpackage.pgi pgiVar, defpackage.otq otqVar, ruc rucVar, zjm zjmVar2, rlv rlvVar, gat gatVar, aogc aogcVar, j$.util.Optional optional, j$.util.Optional optional2, defpackage.rhx rhxVar, gpd gpdVar, tec tecVar, mgw mgwVar, gpd gpdVar2, zjv zjvVar, sou souVar, oud oudVar) {
        this.b = inCallActivity;
        this.r = zpmVar;
        this.B = zjmVar;
        this.c = zmsVar;
        this.A = adaeVar;
        this.y = tklVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.t = zzxVar;
        this.f = qbaVar;
        this.w = tklVar2;
        this.x = pgiVar;
        this.g = otqVar;
        this.h = rucVar;
        this.u = zjmVar2;
        this.i = rlvVar;
        this.s = gatVar;
        this.C = aogcVar;
        this.D = optional;
        this.E = optional2;
        this.j = mgwVar;
        this.F = rhxVar;
        this.v = gpdVar;
        this.n = tecVar;
        this.z = gpdVar2;
        this.m = zjvVar;
        this.o = souVar;
        this.k = oudVar;
    }

    public final void a(android.content.Intent intent) {
        if (intent.getBooleanExtra("InCallActivity.new_outgoing_call", false)) {
            intent.removeExtra("InCallActivity.new_outgoing_call");
            com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = this.b;
            if ((inCallActivity.getWindow().getAttributes().flags & 4194304) == 0) {
                inCallActivity.getWindow().addFlags(4194304);
            }
        } else if (intent.getBooleanExtra("InCallActivity.for_notification_button", false)) {
            a.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "internalResolveIntent", 422, "InCallActivityPeer.java").v("StatusBarNotification intent received");
            intent.removeExtra("InCallActivity.for_notification_button");
            j$.util.Optional optional = this.D;
            orq orqVar = new orq(intent, 10);
            optional.isPresent();
            ((defpackage.rai) optional.get()).a((android.content.Intent) orqVar.a);
        }
        if (intent.getBooleanExtra("InCallActivity.for_notification_content", false)) {
            a.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "internalResolveIntent", 431, "InCallActivityPeer.java").v("StatusBarNotification content intent received");
            intent.removeExtra("InCallActivity.for_notification_content");
            j$.util.Optional optional2 = this.E;
            orq orqVar2 = new orq(intent, 11);
            optional2.isPresent();
            ((her) optional2.get()).W((android.content.Intent) orqVar2.a);
        }
    }

    public final void b() {
        d(true);
        com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = this.b;
        inCallActivity.finish();
        inCallActivity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public final void c(android.content.Intent intent, boolean z) {
        this.q = z;
        this.b.setIntent(intent);
        if (z) {
            return;
        }
        a(intent);
    }

    public final void d(boolean z) {
        com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = this.b;
        int taskId = inCallActivity.getTaskId();
        for (android.app.ActivityManager.AppTask appTask : ((android.app.ActivityManager) inCallActivity.getSystemService(android.app.ActivityManager.class)).getAppTasks()) {
            try {
                if (appTask.getTaskInfo().id == taskId) {
                    appTask.setExcludeFromRecents(z);
                }
            } catch (java.lang.RuntimeException e) {
                a.bq(a.c(), "setExcludeFromRecents failed", "com/android/dialer/incall/activity/ui/InCallActivityPeer", "setExcludeFromRecents", (char) 635, "InCallActivityPeer.java", e, zct.b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.android.dialer.incall.activity.ui.InCallActivity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean e() {
        defpackage.rhx rhxVar = this.F;
        ?? r1 = this.b;
        return rhxVar.a(r1) || r1.isInMultiWindowMode();
    }
}
