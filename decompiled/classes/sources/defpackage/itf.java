package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class itf {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/data/BeeslyDataRepository");
    public final defpackage.aoss b;
    public final defpackage.aolr c;
    public final defpackage.abwo d;
    public final defpackage.apdp e;
    public final defpackage.kdu f;
    private final defpackage.iue g;

    public itf(defpackage.iue iueVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.zzx zzxVar) {
        if (iueVar == null) {
            defpackage.aooh.i("beeslyDao");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.g = iueVar;
        this.b = aossVar;
        this.c = aolrVar;
        this.e = new defpackage.apdp();
        this.d = defpackage.aazc.n("beesly_data", "createdTimestampMs", iueVar, new defpackage.een(13), new defpackage.een(14), new defpackage.dkm(4), new defpackage.een(15), new defpackage.aeza());
        this.f = new defpackage.kdu(zzxVar, this, 1);
    }

    public final java.lang.Object a(afpl afplVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new iki(this, afplVar, (defpackage.aoln) null, 3), aolnVar);
    }
}
