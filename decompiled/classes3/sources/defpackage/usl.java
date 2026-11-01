package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class usl {
    public static final /* synthetic */ int b = 0;
    private static final ahbq c;
    public final zzx a;

    static {
        afib afibVar = new afib();
        afibVar.a("CREATE TABLE timekeeper_info (phone_number TEXT PRIMARY KEY, details BLOB NOT NULL)");
        afibVar.a("CREATE TABLE timekeeper_call_history (call_creation_time_millis INTEGER PRIMARY KEY, call_history BLOB NOT NULL)");
        c = afibVar.b();
    }

    public usl(aogc aogcVar) {
        this.a = aogcVar.aB("timekeeper", c);
    }
}
