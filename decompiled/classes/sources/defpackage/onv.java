package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class onv {
    public static final /* synthetic */ int c = 0;
    private static final defpackage.ahbq d;
    public final defpackage.ajct a;
    public final defpackage.zzx b;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE fides (call_creation_time_millis INTEGER PRIMARY KEY, fides_details BLOB)");
        d = afibVar.b();
    }

    public onv(defpackage.aogc aogcVar, defpackage.ajct ajctVar) {
        this.b = aogcVar.aB("fides", d);
        this.a = ajctVar;
    }

    public final defpackage.ajcq a(defpackage.adag adagVar) {
        return this.b.F(new jsh(adagVar, 9));
    }
}
