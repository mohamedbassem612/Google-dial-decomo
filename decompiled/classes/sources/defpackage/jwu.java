package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jwu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callingnetworks/impl/CallingNetworksStorage");
    private static final defpackage.ahbq f;
    public final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap();
    public final defpackage.aazc c;
    public final defpackage.zzx d;
    public final defpackage.zzx e;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        defpackage.ahvr.bZ(afibVar.a.g().isEmpty(), "dropAllVersionsBefore() must be the first UpgradeStep. The newVersionNumber parameter must be the number of removed addSchemaVersion() steps plus one.");
        defpackage.ahvr.bZ(!afibVar.b.f(), "Only one call to dropAllVersionsBefore() may be made. It must be the first call to a SQLSchema.Builder.");
        afibVar.b = new defpackage.ahys(new defpackage.agab((int[]) null));
        afibVar.a("CREATE TABLE calling_network_properties (call_creation_time_millis INTEGER PRIMARY KEY, calling_network_features BLOB, last_modified_timestamp_millis INTEGER)");
        f = afibVar.b();
    }

    public jwu(defpackage.aogc aogcVar, defpackage.aazc aazcVar, defpackage.zzx zzxVar) {
        this.e = aogcVar.aB("callingnetworks", f);
        this.c = aazcVar;
        this.d = zzxVar;
    }
}
