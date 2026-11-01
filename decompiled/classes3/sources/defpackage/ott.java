package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ott {
    private static final aimz a = aimz.i("com/android/dialer/incall/activity/outgoingcalllauncher/OutgoingCallActivityStarter");
    private final android.content.Context b;
    private final rlv c;
    private final aoin d;
    private final ipc e;
    private final aogc f;

    public ott(android.content.Context context, ipc ipcVar, rlv rlvVar, aogc aogcVar, aoin aoinVar) {
        this.b = context;
        this.e = ipcVar;
        this.c = rlvVar;
        this.f = aogcVar;
        this.d = aoinVar;
    }

    public final void a(j$.util.Optional optional, j$.util.Optional optional2) {
        android.content.Context context;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/OutgoingCallActivityStarter", "startInCallActivityWithEntryScreen", 74, "OutgoingCallActivityStarter.java").v("enter");
        boolean zIsPresent = optional.isPresent();
        rlv rlvVar = this.c;
        if (zIsPresent) {
            rlvVar.o(rmx.jF);
        } else {
            rlvVar.o(rmx.jE);
            optional = ((java.lang.Boolean) this.d.a()).booleanValue() ? j$.util.Optional.of(defpackage.abvz.a) : j$.util.Optional.empty();
        }
        ipc ipcVar = this.e;
        defpackage.otc otcVarAo = pez.ao();
        otcVarAo.e(false);
        otcVarAo.d(true);
        otcVarAo.b(true);
        pez.ap(otcVarAo, optional);
        otcVarAo.f(optional2);
        android.content.Intent intentBk = ipcVar.bk(otcVarAo.a());
        java.lang.Object obj = ((java.util.concurrent.atomic.AtomicReference) this.f.a).get();
        aooh.e(obj, "get(...)");
        j$.util.Optional optional3 = (j$.util.Optional) obj;
        if (optional3.isPresent()) {
            aimzVar.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/OutgoingCallActivityStarter", "getContextForStartingInCallActivity", 108, "OutgoingCallActivityStarter.java").v("Using main activity context to start in-call activity");
            context = (android.content.Context) optional3.orElseThrow();
        } else {
            aimzVar.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/OutgoingCallActivityStarter", "getContextForStartingInCallActivity", 111, "OutgoingCallActivityStarter.java").v("Using app context to start in-call activity");
            context = this.b;
        }
        ahqx.l(context, intentBk);
    }
}
