package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uvj implements defpackage.agyz {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ defpackage.uvk c;

    public uvj(defpackage.uvk uvkVar, long j, long j2) {
        this.a = j;
        this.b = j2;
        j$.util.Objects.requireNonNull(uvkVar);
        this.c = uvkVar;
    }

    @Override // defpackage.agyz
    public final agxk a() {
        return defpackage.uvk.a;
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        defpackage.uvk uvkVar = this.c;
        long j = this.a;
        lki lkiVar = new lki(uvkVar, j, 4);
        ajct ajctVar = uvkVar.b;
        ajcq ajcqVarG = ahvr.G(lkiVar, ajctVar);
        zzx zzxVar = uvkVar.d;
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(zzxVar.k().f()).map(new defpackage.uvi(uvkVar, j, 0));
        j$.util.stream.Collector collector = aido.a;
        ajcq ajcqVarH = ahvr.H(aiql.v((aify) map.collect(collector)), new defpackage.uqm(19), ajctVar);
        ajcq ajcqVarH2 = ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(zzxVar.k().f()).map(new thy(uvkVar, 6)).collect(collector)), new defpackage.uqm(18), ajctVar);
        long j2 = this.b;
        return ahvr.ak(new ajcq[]{ajcqVarG, ajcqVarH, ajcqVarH2, j2 != 0 ? uvkVar.e.T(j2) : ajcm.a}).o(new defpackage.tbb((java.lang.Object) ajcqVarH, ajcqVarG, ajcqVarH2, 9), ajctVar);
    }
}
