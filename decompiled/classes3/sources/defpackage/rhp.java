package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rhp {
    public static final agxj a = new agxj("international_call_on_wifi_disconnected_data_key");
    public static final aimz b = aimz.i("com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogController");
    public final java.util.concurrent.Executor c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final defpackage.znp g = new ler(this, 10);
    public final defpackage.pqm h;
    public final defpackage.qbe i;
    public final defpackage.osm j;
    public final aogc k;
    private final defpackage.rcr l;

    public rhp(defpackage.pqm pqmVar, defpackage.osm osmVar, defpackage.rcr rcrVar, defpackage.qbe qbeVar, ajct ajctVar, aogc aogcVar) {
        this.h = pqmVar;
        this.j = osmVar;
        this.l = rcrVar;
        this.i = qbeVar;
        this.c = new ajdc(ajctVar);
        this.k = aogcVar;
    }

    public final void a(boolean z) {
        ook ookVar = new ook(z, 2);
        defpackage.rcr rcrVar = this.l;
        agsm.i(717, ((kaw) rcrVar.c).p(((aogc) rcrVar.a).bl(ookVar)), "Failed to store should always warn.", new java.lang.Object[0]);
    }
}
