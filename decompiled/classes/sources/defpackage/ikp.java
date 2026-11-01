package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ikp implements defpackage.ijv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelDownloader");
    public final defpackage.rsr b;
    private final defpackage.aolr c;

    public ikp(defpackage.aolr aolrVar, defpackage.rsr rsrVar) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.c = aolrVar;
        this.b = rsrVar;
    }

    @Override // defpackage.ijv
    public final java.lang.Object a(igr igrVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new iko(igrVar, this, (defpackage.aoln) null), aolnVar);
    }
}
