package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ika implements defpackage.ijw, defpackage.igc {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/audioqualitymonitor/impl/AudioPrismAudioQualityMonitorModelRunner");
    public final aoss b;
    public defpackage.ijx c;
    public long d;
    public long e;
    public final apdp f;
    public final aazc g;
    public final zzx h;
    private final aolr i;

    public ika(aazc aazcVar, zzx zzxVar, aolr aolrVar, aoss aossVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        this.g = aazcVar;
        this.h = zzxVar;
        this.i = aolrVar;
        this.b = aossVar;
        this.f = new apdp();
    }

    @Override // defpackage.igc
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.i, new defpackage.ijz(this, igbVar, null), aolnVar);
        aolu aoluVar = aolu.a;
        if (objAj != aoluVar) {
            objAj = aojh.a;
        }
        return objAj != aoluVar ? aojh.a : objAj;
    }

    @Override // defpackage.igc
    public final java.lang.Object b(defpackage.igb igbVar, aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.ijw
    public final java.lang.Object d(ifv ifvVar, ifz ifzVar, defpackage.igr igrVar, java.lang.String str, defpackage.igg iggVar, aoln aolnVar) {
        return aoov.aj(this.i, new defpackage.iku(this, igrVar, ifvVar, (aoln) null, 1), aolnVar);
    }

    @Override // defpackage.ijw
    public final java.lang.Object e(ifv ifvVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.i, new defpackage.hnj(this, (aoln) null, 4), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }
}
