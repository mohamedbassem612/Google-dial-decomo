package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikl implements defpackage.ijw, defpackage.igc {
    public static final java.util.Map a = ajsz.aO(new aoiu[]{new aoiu(0, defpackage.ihb.SPEECH), new aoiu(137, defpackage.ihb.MUSIC), new aoiu(389, defpackage.ihb.TELEPHONY), new aoiu(390, defpackage.ihb.TELEPHONY), new aoiu(392, defpackage.ihb.TELEPHONY), new aoiu(393, defpackage.ihb.TELEPHONY), new aoiu(500, defpackage.ihb.SILENCE)});
    public static final aimz b = aimz.i("com/android/dialer/audioprism/internal/models/daredevil/impl/AudioPrismDaredevilModelRunner");
    public final java.util.Set c;
    public final aolr d;
    public final aoss e;
    public final defpackage.mfz f;
    public final java.util.Queue g;
    public boolean h;
    public defpackage.igz i;
    public final mef j;
    public final apdp k;
    public final zzx l;

    public ikl(mef mefVar, zzx zzxVar, java.util.Set set, aolr aolrVar, aoss aossVar, defpackage.mfz mfzVar) {
        aooh.f(mefVar, "daredevilModel");
        aooh.f(set, "internalListeners");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        this.j = mefVar;
        this.l = zzxVar;
        this.c = set;
        this.d = aolrVar;
        this.e = aossVar;
        this.f = mfzVar;
        this.k = new apdp();
        this.g = new java.util.ArrayDeque(62400);
    }

    @Override // defpackage.igc
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.iki(this, igbVar, (aoln) null, 2), aolnVar);
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
        return aoov.aj(this.d, new defpackage.ikk(this, igrVar, ifvVar, null), aolnVar);
    }

    @Override // defpackage.ijw
    public final java.lang.Object e(ifv ifvVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.d, new defpackage.hnj(this, (aoln) null, 5), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }
}
