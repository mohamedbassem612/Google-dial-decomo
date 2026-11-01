package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olz implements znp {
    public final ajct a;
    public final android.util.LruCache b = new defpackage.oly(this);
    public final qbe c;
    public final aogc d;
    private final zzx e;

    public olz(zzx zzxVar, aogc aogcVar, ajct ajctVar, qbe qbeVar) {
        this.e = zzxVar;
        this.d = aogcVar;
        this.a = ajctVar;
        this.c = qbeVar;
    }

    public final ajcq ek() {
        this.c.a(qbc.is);
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(this.e.e()).map(new defpackage.old(2)).collect(aido.a);
        return ahvr.aj(aifyVar).p(new defpackage.ibi(this, aifyVar, 20), this.a);
    }
}
